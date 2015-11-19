/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queing;

/**
 *
 * @author Daniel
 */
public class Queing_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Queing_GUI
     */
    public Queing_GUI() {
        initComponents();
        jPanelHome.setVisible(true);
        jPanelMap.setVisible(false);
        jPanelCamp.setVisible(false);
        jPanelQuiz.setVisible(false);
        jPanelInfo.setVisible(false);
        
        /* 
        Lige nu har jeg sat borders til alle panels, for at se hvor store de er, 
        og så det passer med at de er lige store.
        Hvis vi skal ændre i de enkelte panels, kan det nu enkelt gøres ved at 
        bruge designeren, ved at klikke på de enkelte panels i navigatoren.
        */        
 
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLayeredPane = new javax.swing.JLayeredPane();
        jPanelHome = new javax.swing.JPanel();
        jLabelHome = new javax.swing.JLabel();
        jLabelPic_Orange = new javax.swing.JLabel();
        jLabelCounter = new javax.swing.JLabel();
        jPanelCamp = new javax.swing.JPanel();
        jLabelCamp = new javax.swing.JLabel();
        jPanelMap = new javax.swing.JPanel();
        jLabePic_Map = new javax.swing.JLabel();
        jLabelMap = new javax.swing.JLabel();
        jPanelQuiz = new javax.swing.JPanel();
        jLabelQuiz = new javax.swing.JLabel();
        jPanelInfo = new javax.swing.JPanel();
        jLabelInfo = new javax.swing.JLabel();
        jButtonInfo_GeneralInfo = new javax.swing.JButton();
        jButtonInfo_Schedule = new javax.swing.JButton();
        jButtonInfo_Artist = new javax.swing.JButton();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanelInfo_Artist = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaArtist = new javax.swing.JTextArea();
        jPanelInfo_GeneralInfo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaInfo = new javax.swing.JTextArea();
        jPanelInfo_Schedule = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextAreaSchedule = new javax.swing.JTextArea();
        jPanelButtons = new javax.swing.JPanel();
        jButtonHome = new javax.swing.JButton();
        jButtonMap = new javax.swing.JButton();
        jButtonYourCamp = new javax.swing.JButton();
        jButtonInfo = new javax.swing.JButton();
        jButtonQuiz = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Roskilde Festival");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setSize(new java.awt.Dimension(458, 354));

        jPanelHome.setBackground(new java.awt.Color(255, 72, 12));
        jPanelHome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelHome.setForeground(new java.awt.Color(255, 255, 255));
        jPanelHome.setPreferredSize(new java.awt.Dimension(414, 290));

        jLabelHome.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        jLabelHome.setText("<html>Welcome To<br>\n\n Roskilde 2016</html>");
        jLabelHome.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabelHome.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabelPic_Orange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Orange Scene.jpg"))); // NOI18N

        jLabelCounter.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabelCounter.setText("<html>Roskilde Counter : <br> 222 Days, 21 Hours, 24 Minutes </html>");

        javax.swing.GroupLayout jPanelHomeLayout = new javax.swing.GroupLayout(jPanelHome);
        jPanelHome.setLayout(jPanelHomeLayout);
        jPanelHomeLayout.setHorizontalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHomeLayout.createSequentialGroup()
                        .addComponent(jLabelCounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelHomeLayout.createSequentialGroup()
                        .addComponent(jLabelHome)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHomeLayout.createSequentialGroup()
                        .addComponent(jLabelPic_Orange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanelHomeLayout.setVerticalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHomeLayout.createSequentialGroup()
                .addComponent(jLabelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPic_Orange, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabelCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 78, Short.MAX_VALUE))
        );

        jPanelCamp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelCamp.setPreferredSize(new java.awt.Dimension(414, 290));

        jLabelCamp.setText("Camp");

        javax.swing.GroupLayout jPanelCampLayout = new javax.swing.GroupLayout(jPanelCamp);
        jPanelCamp.setLayout(jPanelCampLayout);
        jPanelCampLayout.setHorizontalGroup(
            jPanelCampLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCampLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabelCamp, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(296, Short.MAX_VALUE))
        );
        jPanelCampLayout.setVerticalGroup(
            jPanelCampLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCampLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabelCamp)
                .addContainerGap(531, Short.MAX_VALUE))
        );

        jPanelMap.setBackground(new java.awt.Color(255, 72, 12));
        jPanelMap.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelMap.setPreferredSize(new java.awt.Dimension(414, 290));

        jLabePic_Map.setBackground(new java.awt.Color(255, 72, 12));
        jLabePic_Map.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pics/Roskilde.jpg"))); // NOI18N

        jLabelMap.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        jLabelMap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMap.setText("<html> Map over Roskilde Festival\n\n</html>");
        jLabelMap.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanelMapLayout = new javax.swing.GroupLayout(jPanelMap);
        jPanelMap.setLayout(jPanelMapLayout);
        jPanelMapLayout.setHorizontalGroup(
            jPanelMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabePic_Map, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelMapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMap, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanelMapLayout.setVerticalGroup(
            jPanelMapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMapLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelMap, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabePic_Map, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelQuiz.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelQuiz.setPreferredSize(new java.awt.Dimension(414, 290));

        jLabelQuiz.setText("Quiz");

        javax.swing.GroupLayout jPanelQuizLayout = new javax.swing.GroupLayout(jPanelQuiz);
        jPanelQuiz.setLayout(jPanelQuizLayout);
        jPanelQuizLayout.setHorizontalGroup(
            jPanelQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelQuizLayout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabelQuiz)
                .addContainerGap(295, Short.MAX_VALUE))
        );
        jPanelQuizLayout.setVerticalGroup(
            jPanelQuizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelQuizLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelQuiz)
                .addContainerGap(540, Short.MAX_VALUE))
        );

        jPanelInfo.setBackground(new java.awt.Color(255, 72, 12));
        jPanelInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanelInfo.setPreferredSize(new java.awt.Dimension(414, 290));

        jLabelInfo.setFont(new java.awt.Font("Verdana", 3, 36)); // NOI18N
        jLabelInfo.setText("Info");

        jButtonInfo_GeneralInfo.setText("General Info");
        jButtonInfo_GeneralInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInfo_GeneralInfoActionPerformed(evt);
            }
        });

        jButtonInfo_Schedule.setText("Schedule");
        jButtonInfo_Schedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInfo_ScheduleActionPerformed(evt);
            }
        });

        jButtonInfo_Artist.setText("Artist");
        jButtonInfo_Artist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInfo_ArtistActionPerformed(evt);
            }
        });

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextAreaArtist.setColumns(20);
        jTextAreaArtist.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jTextAreaArtist.setRows(5);
        jTextAreaArtist.setText("The Artists On Roskilde:\n\nSelena Gomez:\nSelena Marie Gomez (1992) is an American actress, \nsinger and fashion designer.[1] Born and raised in \nGrand Prairie, Texas, she was first featured on the \nchildren's series Barney & Friends in the early 2000s.[5] \nIn 2007, Gomez came to prominence after being cast in \nthe Disney Channel television series Wizards of Waverly \nPlace. She portrayed the starring character Alex Russo \nuntil its conclusion in 2012. She formed her band \nSelena Gomez & the Scene after signing a recording \ncontract with Hollywood Records in 2008; they released \nthe studio albums Kiss & Tell (2009), \nA Year Without Rain (2010), and When the \nSun Goes Down (2011) before beginning a hiatus \nin 2012.\n\nMicheal Jackson:\n(HOLOGRAM)\nMichael Joseph Jackson (29. august 1958 – 25. juni 2009)\nmed tilnavnet \"Kongen af Pop\" var en amerikansk musiker \nog en af de mest kommercielt succesrige entertainere.\nHans unikke bidrag til musik og dans og hans privatliv, \ngjorde ham til en fremtrædende figur inden for \npopulærkulturen i fire årtier.\n\nHan er to gange optaget i Rock and Roll Hall of Fame, \nhar flere rekorder i Guinness Rekordbog — deriblandt \n\"Mest succesrige entertainer nogensinde\" — \n13 Grammy Awards, 13 singler som har ligget nr. 1 på \nhitlisten i USA, og et anslået samlet salgstal på over \n750 millioner plader. Han var en betydelig filantropisk og\n humanitær sponsor af mange millioner dollars til 39 \nvelgørenhedsorganisationer og skaffede også bidrag via \nsin egen Heal the World Foundation.\n\n\n\n\nEminem:\nMarshall Bruce Mathers III (born October 17, 1972),\nbest known by his stage name, Eminem,\nis an American rapper, record producer, actor, and \nsongwriter. Eminem is from Detroit, Michigan. \nIn addition to his solo career, he is a member of D12 and\n(with Royce da 5'9\").");
        jScrollPane2.setViewportView(jTextAreaArtist);

        javax.swing.GroupLayout jPanelInfo_ArtistLayout = new javax.swing.GroupLayout(jPanelInfo_Artist);
        jPanelInfo_Artist.setLayout(jPanelInfo_ArtistLayout);
        jPanelInfo_ArtistLayout.setHorizontalGroup(
            jPanelInfo_ArtistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
        );
        jPanelInfo_ArtistLayout.setVerticalGroup(
            jPanelInfo_ArtistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
        );

        jPanelInfo_GeneralInfo.setPreferredSize(new java.awt.Dimension(486, 385));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextAreaInfo.setColumns(20);
        jTextAreaInfo.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jTextAreaInfo.setRows(5);
        jTextAreaInfo.setText("Roskilde Festival is the largest North Europeanculture and \nmusic festival and has existed since 1971. \nWe are a non-profit organisation \nconsisting of about 50 full-time employees and thousands \nof volunteers.\n\nVolunteers\nDuring the festival the number of volunteers increases to \nabout 32,000. The volunteers staff\nthe festival stalls, build stages, \nprovide camping security etc.\n\nNon-profit society behind the festival\nRoskilde Festival Charity Society is the organiserof \nRoskilde Festival.\nThe purpose of the society is to support initiatives \nbenefitting children and young people and to support \nhumanitarian and cultural work. The society's work is \nindependent of party politics and has no geographical \nborders");
        jScrollPane1.setViewportView(jTextAreaInfo);

        javax.swing.GroupLayout jPanelInfo_GeneralInfoLayout = new javax.swing.GroupLayout(jPanelInfo_GeneralInfo);
        jPanelInfo_GeneralInfo.setLayout(jPanelInfo_GeneralInfoLayout);
        jPanelInfo_GeneralInfoLayout.setHorizontalGroup(
            jPanelInfo_GeneralInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
        );
        jPanelInfo_GeneralInfoLayout.setVerticalGroup(
            jPanelInfo_GeneralInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
        );

        jPanelInfo_Schedule.setPreferredSize(new java.awt.Dimension(486, 385));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextAreaSchedule.setColumns(20);
        jTextAreaSchedule.setFont(new java.awt.Font("Verdana", 3, 14)); // NOI18N
        jTextAreaSchedule.setRows(5);
        jTextAreaSchedule.setText("**************THE SCHEDULE*****************\n\n\nORANGE:\n Thursday:\n10.00 Sys Bjerre\n13.00 Magtens Kooridor\n17.00 Eminiem\n\n\nFriday:\n15.00 Big Stock\n18.00 Rasmus Seebach\n21.00 Bruce \"The Boss\"\n\n\nSaturday:\n14.00 Selena Gomez\n16.00 Michael Jackson (Hologram)\n01.00 Suspect\n\nCOSMOPOL:\n\nThursday:\n12.00 Ray Charles\n16.00 Kim Larsen\n19.00 Shubidua\n\nFriday:\n12.00 Eddie Van Helen\n16.00 ABBA\n21.00 Spice Girls\n\nSaturday:\n12.00 Jay-Z\n15.00 Beyonce\n19.00 BackStreet Boys\n\nARENA:\n\nThursday:\n13.00 Kennth\n16.00 \n\nFriday:\n\nSaturday:\n");
        jScrollPane3.setViewportView(jTextAreaSchedule);

        javax.swing.GroupLayout jPanelInfo_ScheduleLayout = new javax.swing.GroupLayout(jPanelInfo_Schedule);
        jPanelInfo_Schedule.setLayout(jPanelInfo_ScheduleLayout);
        jPanelInfo_ScheduleLayout.setHorizontalGroup(
            jPanelInfo_ScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
        );
        jPanelInfo_ScheduleLayout.setVerticalGroup(
            jPanelInfo_ScheduleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelInfo_GeneralInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelInfo_Artist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelInfo_Schedule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelInfo_GeneralInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelInfo_Artist, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelInfo_Schedule, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE))
        );
        jLayeredPane1.setLayer(jPanelInfo_Artist, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanelInfo_GeneralInfo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanelInfo_Schedule, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanelInfoLayout = new javax.swing.GroupLayout(jPanelInfo);
        jPanelInfo.setLayout(jPanelInfoLayout);
        jPanelInfoLayout.setHorizontalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoLayout.createSequentialGroup()
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInfoLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jButtonInfo_GeneralInfo)
                        .addGap(29, 29, 29)
                        .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelInfoLayout.createSequentialGroup()
                                .addComponent(jButtonInfo_Artist)
                                .addGap(27, 27, 27)
                                .addComponent(jButtonInfo_Schedule))))
                    .addGroup(jPanelInfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanelInfoLayout.setVerticalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInfo_GeneralInfo)
                    .addComponent(jButtonInfo_Schedule)
                    .addComponent(jButtonInfo_Artist))
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jLayeredPaneLayout = new javax.swing.GroupLayout(jLayeredPane);
        jLayeredPane.setLayout(jLayeredPaneLayout);
        jLayeredPaneLayout.setHorizontalGroup(
            jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelMap, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE))
            .addGroup(jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelCamp, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE))
            .addGroup(jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelHome, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE))
            .addGroup(jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelQuiz, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE))
            .addGroup(jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 502, Short.MAX_VALUE))
        );
        jLayeredPaneLayout.setVerticalGroup(
            jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 567, Short.MAX_VALUE)
            .addGroup(jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelMap, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE))
            .addGroup(jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelCamp, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE))
            .addGroup(jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelHome, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE))
            .addGroup(jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelQuiz, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE))
            .addGroup(jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE))
        );
        jLayeredPane.setLayer(jPanelHome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane.setLayer(jPanelCamp, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane.setLayer(jPanelMap, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane.setLayer(jPanelQuiz, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane.setLayer(jPanelInfo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jPanelButtons.setLayout(new java.awt.GridLayout(1, 0));

        jButtonHome.setText("Home");
        jButtonHome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonHome.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHomeActionPerformed(evt);
            }
        });
        jPanelButtons.add(jButtonHome);

        jButtonMap.setText("Map");
        jButtonMap.setAlignmentY(0.0F);
        jButtonMap.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonMap.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButtonMap.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonMap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMapActionPerformed(evt);
            }
        });
        jPanelButtons.add(jButtonMap);

        jButtonYourCamp.setText("Your Camp");
        jButtonYourCamp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonYourCamp.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonYourCamp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonYourCampActionPerformed(evt);
            }
        });
        jPanelButtons.add(jButtonYourCamp);

        jButtonInfo.setText("Info");
        jButtonInfo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInfoActionPerformed(evt);
            }
        });
        jPanelButtons.add(jButtonInfo);

        jButtonQuiz.setText("Enter Quiz");
        jButtonQuiz.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonQuiz.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQuizActionPerformed(evt);
            }
        });
        jPanelButtons.add(jButtonQuiz);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelButtons, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
            .addComponent(jLayeredPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelButtons, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMapActionPerformed
        jPanelHome.setVisible(false);
        jPanelCamp.setVisible(false);
        jPanelQuiz.setVisible(false);
        jPanelInfo.setVisible(false);
        jPanelMap.setVisible(true);
    }//GEN-LAST:event_jButtonMapActionPerformed

    private void jButtonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHomeActionPerformed
        jPanelMap.setVisible(false);
        jPanelCamp.setVisible(false);
        jPanelQuiz.setVisible(false);
        jPanelInfo.setVisible(false);
        jPanelHome.setVisible(true);
    }//GEN-LAST:event_jButtonHomeActionPerformed

    private void jButtonYourCampActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonYourCampActionPerformed
        jPanelMap.setVisible(false);
        jPanelHome.setVisible(false);
        jPanelQuiz.setVisible(false);
        jPanelInfo.setVisible(false);
        jPanelCamp.setVisible(true);
    }//GEN-LAST:event_jButtonYourCampActionPerformed

    private void jButtonQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuizActionPerformed
        jPanelMap.setVisible(false);
        jPanelHome.setVisible(false);
        jPanelCamp.setVisible(false);
        jPanelInfo.setVisible(false);
        jPanelQuiz.setVisible(true);
    }//GEN-LAST:event_jButtonQuizActionPerformed

    private void jButtonInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInfoActionPerformed
        // TODO add your handling code here:
        jPanelMap.setVisible(false);
        jPanelHome.setVisible(false);
        jPanelCamp.setVisible(false);
        jPanelQuiz.setVisible(false);
        jPanelInfo.setVisible(true);
        jPanelInfo_GeneralInfo.setVisible(false);
        jPanelInfo_Artist.setVisible(false);
        jPanelInfo_Schedule.setVisible(false);
    }//GEN-LAST:event_jButtonInfoActionPerformed

    private void jButtonInfo_GeneralInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInfo_GeneralInfoActionPerformed
       
        jPanelInfo_GeneralInfo.setVisible(true);
        jPanelInfo_Schedule.setVisible(false);
        jPanelInfo_Artist.setVisible(false);
        
    }//GEN-LAST:event_jButtonInfo_GeneralInfoActionPerformed

    private void jButtonInfo_ArtistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInfo_ArtistActionPerformed
        jPanelInfo_GeneralInfo.setVisible(false);
        jPanelInfo_Schedule.setVisible(false);
        jPanelInfo_Artist.setVisible(true);
    }//GEN-LAST:event_jButtonInfo_ArtistActionPerformed

    private void jButtonInfo_ScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInfo_ScheduleActionPerformed
        jPanelInfo_GeneralInfo.setVisible(false);
        jPanelInfo_Artist.setVisible(false);
        jPanelInfo_Schedule.setVisible(true);
    }//GEN-LAST:event_jButtonInfo_ScheduleActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Queing_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Queing_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Queing_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Queing_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Queing_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonInfo;
    private javax.swing.JButton jButtonInfo_Artist;
    private javax.swing.JButton jButtonInfo_GeneralInfo;
    private javax.swing.JButton jButtonInfo_Schedule;
    private javax.swing.JButton jButtonMap;
    private javax.swing.JButton jButtonQuiz;
    private javax.swing.JButton jButtonYourCamp;
    private javax.swing.JLabel jLabePic_Map;
    private javax.swing.JLabel jLabelCamp;
    private javax.swing.JLabel jLabelCounter;
    private javax.swing.JLabel jLabelHome;
    private javax.swing.JLabel jLabelInfo;
    private javax.swing.JLabel jLabelMap;
    private javax.swing.JLabel jLabelPic_Orange;
    private javax.swing.JLabel jLabelQuiz;
    private javax.swing.JLayeredPane jLayeredPane;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanelButtons;
    private javax.swing.JPanel jPanelCamp;
    private javax.swing.JPanel jPanelHome;
    private javax.swing.JPanel jPanelInfo;
    private javax.swing.JPanel jPanelInfo_Artist;
    private javax.swing.JPanel jPanelInfo_GeneralInfo;
    private javax.swing.JPanel jPanelInfo_Schedule;
    private javax.swing.JPanel jPanelMap;
    private javax.swing.JPanel jPanelQuiz;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextAreaArtist;
    private javax.swing.JTextArea jTextAreaInfo;
    private javax.swing.JTextArea jTextAreaSchedule;
    // End of variables declaration//GEN-END:variables
}
