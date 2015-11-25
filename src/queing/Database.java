/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queing;

import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Henrik
 * With this class we can store and retrieve info from our MYSQL database.
 * We also store the current users ID and ID of the camp if the user have joined one.
 */
public class Database {
    
    private ImageIcon format = null;
    private static String url = "jdbc:mysql://91.100.100.141:3306/account"; // URL to our database
    private static Connection conn = new DBConnection().connect(url);
    private static int myID = 0;
    private static int myPoints = 0;
    private static int campID = 0;
    private static int campPoints = 0;
    private static int memberCount = 0;
    private static boolean Editing = false;
  
    
    // LOGIN
    /**
     * This method attempts to login user with the parameters
     * @param txt_username  From form text field.
     * @param txt_password  From form text field.
     */
    public void Login(String txt_username, String txt_password) 
    {
        
        String sql = "select * from user where username =? and password =?";
        try (PreparedStatement ps = conn.prepareStatement(sql))
        {
            ps.setString( 1, txt_username );
            ps.setString( 2, txt_password );
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                myID = rs.getInt("id");
                campID = rs.getInt("campID");
                JOptionPane.showMessageDialog(null, "Logged in");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Username or password invalid.");
            }
        }
        
        catch(Exception e)
        {
            
        }
       
        
        
    }
    
    //REGISTER
    /**
     * Register new user.
     * @param txt_username From form text field.
     * @param txt_password From form text field.
     */
   public void RegisterUser(String txt_username, String txt_password )
   {
       
        PreparedStatement ps = null;
        try  
        {
            Statement st = conn.createStatement();
            st.executeQuery("select * from user");
            
            ResultSet rs = st.getResultSet();
            while(rs.next())
            {
                myID = rs.getInt("id") + 1;
                st.close();
            }
            
            
            if( myID == 0 ) myID = 1; // myID must not be 0. Messes with campid detection in main program.
            ps = conn.prepareStatement("insert into user (ID, username, password, campID, points, admin) values(?,?,?,?,?,?)");
            ps.setInt(1, myID);
            ps.setString( 2, txt_username ); 
            ps.setString( 3, txt_password );
            ps.setInt(4,0); // campID
            ps.setInt(5,0); // points
            ps.setInt(6,0); // admin
           
            int i = ps.executeUpdate();
            if( i > 0 )
            {
                JOptionPane.showMessageDialog(null, "User created.");
               
            }
                else
                {
                   JOptionPane.showMessageDialog(null, "User creation failure."); 
                }    
            ps.close();
            
            
        } //End of try
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e); 
            }
        
      
    }       
   
   /**
    * Registers a new camp
    * @param txt_campName
    * @param s This is the path to the image file.
    */
   public void RegisterCamp(String txt_campName, String s)
   {
    
        int memberCount = 0;
       
        try  
        {
            InputStream is = new FileInputStream(new File(s)); // The image we're getting.
              
            Statement st = conn.createStatement();
            
            // Now we want to update the users campID.
            st = conn.createStatement();
              ResultSet ars = st.executeQuery("SELECT * FROM user WHERE id ="+myID);
            if (ars.next()) 
            {
                
              campID = ars.getInt("campID");
              if( ars.getInt("Admin") == 1 ) Editing = true;
              else Editing = false;
            }
            st.close();

            if( !Editing )
            {
                PreparedStatement ps = null;
                st.executeQuery("select * from camp");

                ResultSet rs = st.getResultSet();
                while(rs.next()) 
                {
                    campID = rs.getInt("id") + 1;
                    memberCount = rs.getInt("memberCount") + 1;
                }
                st.close();
                
                if( campID == 0 ) campID = 1; // campID must not be 0. Messes with campid detection in main program.
                ps = conn.prepareStatement("insert into camp(ID, name, image, memberCount) values(?,?,?,?)");
                 
                ps.setInt(1, campID);
                ps.setString( 2, txt_campName ); 
                ps.setBlob(3,is);
                ps.setInt(4, memberCount );
                int i = ps.executeUpdate();
                 if( i > 0 )
                 {
                     JOptionPane.showMessageDialog(null, "Camp created.");
                 }
                     else
                     {
                        JOptionPane.showMessageDialog(null, "Camp creation failure."); 
                     }   
                ps.close();
                
              // Now we want to update the users campID.
               st = conn.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE,
                                          ResultSet.CONCUR_UPDATABLE );
                 ResultSet uprs = st.executeQuery("SELECT * FROM user WHERE id ="+myID);
               if (uprs.next()) 
               {
                  uprs.updateInt("campID", campID);
                  uprs.updateInt("Admin", 1);
                  uprs.updateRow();
                  st.close();
               }
               
            }
            
            else if ( Editing )
            {
                 // Now we want to update the camp.
               
                String oldCampName = "'"+getMyCampName()+"'";
                 PreparedStatement est = null; 
                 est = conn.prepareStatement( "SELECT id, name FROM camp WHERE name ="+oldCampName, 
                                             ResultSet.TYPE_SCROLL_SENSITIVE, 
                                             ResultSet.CONCUR_UPDATABLE);
                 ResultSet ucrs = est.executeQuery();
                 
                if(ucrs.next())
                {   

                        ucrs.updateString("name", txt_campName);
                        ucrs.updateRow();
                        est.close();    
                    
                } 
                
                 est = conn.prepareStatement( "UPDATE camp SET image= ? WHERE name="+oldCampName);
 
                        est.setBlob(1,is);
                        est.executeUpdate();
                        est.close();    
            }
                
        }
            catch(FileNotFoundException | SQLException | HeadlessException e)
            {
                if(!Editing)
                JOptionPane.showMessageDialog( null, "Camp creation failure " + e ); 
                else JOptionPane.showMessageDialog( null, "Camp edit failure " + e ); 
            }
   }
   
   
   /**
    * Gets the curent users camp name. If the user is in a camp.
    * @return 
    */
   public String getMyCampName()
   {
       String campName = "Not initialized.";
       
       try (Statement st = conn.createStatement())
        {
           ResultSet rs = st.executeQuery( "SELECT name FROM camp WHERE id ="+getMyCampID() );
           while (rs.next())
           {
               campName = rs.getString("name");
           }
        }
        
        catch( Exception e )
        { 
           JOptionPane.showMessageDialog( null, e ); 
        }
       
       return campName;
   }
   
   public Image getCampImage()
   {

       Image im = null;
       
        try
        {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery( "SELECT image FROM camp WHERE id="+getMyCampID() );
            if (rs.next()) 
            {
                byte[] img = rs.getBytes("image");
                ImageIcon image = new ImageIcon(img);
                im = image.getImage();
                st.close();
                return im;
            }
        }
        catch( Exception e )
        {
            JOptionPane.showMessageDialog( null, e ); 
        }
       
       return im;
   }
   
    public String getCampMemberNames()
    {
     
        String names = "";
        
        try (Statement st = conn.createStatement()) 
        {
            ResultSet rs = st.executeQuery( "SELECT username FROM user WHERE campID="+getMyCampID() );
            while (rs.next())
            {
                names += rs.getString("username") + ",";
            }
        }

        catch( Exception e )
        {
            JOptionPane.showMessageDialog( null, e ); 
        }
        
        return names;
    }
    
    public String getAllCampNames()
    {
     
        String names = "";

        try (Statement st = conn.createStatement()) 
        {
            ResultSet rs = st.executeQuery( "SELECT name FROM camp" );
            while (rs.next())
            {
                names += rs.getString("name") + ",";
            }
        }
        
        catch( Exception e )
        {
            JOptionPane.showMessageDialog( null, e ); 
        }
        
        return names;
    }
     
     /**
      * Gets the quiz points belonging to the user with the username from the argument.
      * @param name
      * @return 
      */
      public int getCampMemberPoints(String name)
    {
     
        name = "'"+name+"'";
        int points = 0;
        try (Statement st = conn.createStatement()) 
        {
            ResultSet rs = st.executeQuery( "SELECT id, username, points FROM user WHERE username="+name );
            if (rs.next())
            {
                points = rs.getInt("points");
            }
        }
        
        
        catch( Exception e )
        {
            JOptionPane.showMessageDialog( null, e ); 
        }
        
        return points;
    }
     
       public int getCampMemberCount()
    {
        int memberCount = 0;
        try
        {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery( "SELECT id FROM user WHERE campID="+getMyCampID() );
            while (rs.next()) 
            {
                memberCount += 1;
            }
            
        }
        catch( Exception e )
        {
            JOptionPane.showMessageDialog( null, e ); 
        }
        
        return memberCount;
    }
   
   
   /**
    * This method returns the current users ID.
    * returns 0 if no ID has been assisgned.
    * @return 
    */
    public int getMyID()
    {
        return myID;
    }
   
    /**
     * This methods returns the current users camp ID.
     * returns 0 if no ID has been assigned.
     * @param name
     * @return 
     */
    
    public void joinCamp(String name)
    {
        
        try  
        {
            name = "'"+name+"'"; 
            // First we get the camps id.
            Statement sts = conn.createStatement();
            sts.executeQuery( "SELECT * FROM camp WHERE name ="+name);
            
            ResultSet rs = sts.getResultSet();
            if(rs.next()) 
            {
 
                campID = rs.getInt("id");  
                sts.close();
 
            }
            
           
            
             // Now we want to update the users campID.
           
           Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
              ResultSet updrs = st.executeQuery( "SELECT id, campID FROM user WHERE id="+getMyID() );
            if (updrs.next()) 
            {
                updrs.updateInt("campID", campID);
                updrs.updateRow();
                st.close();
            }
                
        }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog( null, "Error updating user campID " + e ); 
            }
        
    }
    public int getMyCampID()
    {
        return campID;
    }
    
      public void setMyCampPoints()
   {
       
        try  
        {
            campPoints = 0;
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
           
             // Now we want to calculate the current camps points.
              ResultSet rs = st.executeQuery("SELECT * FROM user");
           
              
            while (rs.next()) 
            {
                if (rs.getInt("campID") == getMyCampID() )
                {
                    campPoints += rs.getInt("points");
                }
               
            }
            st.close();
                campPoints = campPoints / getCampMemberCount();
            
                
             st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
             ResultSet uprs = st.executeQuery("SELECT * FROM camp");
             // Now we want to update the current camps points.
            if ( uprs.next() ) 
            {
                if( uprs.getInt("id") == getMyCampID() )
                {
                    uprs.updateInt("campPoints", campPoints);
                    uprs.updateRow();
                }
            }
            st.close(); 
        }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog( null, "setMyCampPoints() : "+ e ); 
            }
   }
    
    public int getMyCampPoints()
    {
         try  
        {
            setMyCampPoints();
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
           
             // Now we want to calculate the current users, camp points.
              ResultSet rs = st.executeQuery( "SELECT * FROM camp" );
            if (rs.next()) 
            { 
               if (rs.getInt("id") == getMyCampID() )
                {
                    campPoints = rs.getInt("CampPoints");
                    st.close();
                }
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog( null, "getMyCampPoints(): " + e ); 
        }
         
        return campPoints;
    }
    
    
    public void setMyPoints(int points)
    {
          try  
        {
            
            Statement st = conn.createStatement( ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE );

            ResultSet uprs = st.executeQuery("SELECT id, points FROM user WHERE id="+getMyID() );
             // Now we want to update the current users points.
            if ( uprs.next() ) 
            {
          
                    uprs.updateInt("points", points);
                    uprs.updateRow();
                    st.close();
            }
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog( null, "SetMyPoints(): " + e ); 
        }
          
        setMyCampPoints();
    }
    
    /**
     * This method accesses the MYSQL database.
     * returns true if it connects, false if it does not.
     * @return
     * 
     */
    
   public boolean AccessDB()
   {
       
       if(conn != null)
       {
           return true;
       }
       else return false;
   }
    
}
