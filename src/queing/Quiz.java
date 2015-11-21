/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queing;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

/**
 *
 * @author Daniel
 */
public class Quiz {
    Queing_GUI gui = this.gui;
    private ArrayList<String[]> quiz = new ArrayList<String[]>();
    private String[] q1 = {"What is 2 + 3", "4", "1", "2", "5", "5"};
    private String[] q2 = {"How many hours are there a day?", "20", "21", "15", "24", "24"};
    private String[] q3 = {"Does this work?", "Sure", "Naah", "Srsly?", "Fuck NO!", "Sure"};
    private String[] q4 = {"What comes after a?", "b", "c", "d", "e", "b"};
    private String[] q5 = {"What is 2 + 5?", "3", "52", "7", "65", "7"};
    private String[] q6 = {"10 + 3 = ?", "2", "3333", "4444", "13", "13"};
    private boolean running = true;
    private int numOfQsAns = 0;
    private int score = 0;

    private String[] curQ;

    public void addQnA() {
        quiz.add(q1);
        quiz.add(q2);
        quiz.add(q3);
        quiz.add(q4);
        quiz.add(q5);
        quiz.add(q6);
    }

    public boolean isDone() {
        return numOfQsAns > 3;

    }

    public void score(Queing_GUI q) {
        if (isDone()) {
            try {
                q.getjLabelQScore().setText("Congratulations!\n You got " + (score) + " pt.");
            } catch (NullPointerException e) {

            }
        }
    }

    public void updateQs(Queing_GUI a) {
        if (numOfQsAns < 5) {
            Collections.shuffle(quiz);
            curQ = quiz.get(0);
            a.getjLabelQuestion().setText("" + curQ[0]);
            a.getjButtonA1().setText("" + curQ[1]);
            a.getjButtonA2().setText("" + curQ[2]);
            a.getjButtonA3().setText("" + curQ[3]);
            a.getjButtonA4().setText("" + curQ[4]);
            numOfQsAns++;
        } else {
            isDone();
        }
    }
    
    public boolean isCorrect(int x) {
        boolean isCorrect = false;
        if (curQ[x].equalsIgnoreCase(curQ[5])) {
            isCorrect = true;
            quiz.remove(curQ);
        }
        return isCorrect;
    }
    
    public void sleep(int x) {
        try {
            TimeUnit.MILLISECONDS.sleep(x);
        } catch (InterruptedException ex) {
            
        }
    }
    
    public void updateScore(Queing_GUI q) {
        q.getjLabelCurQScore().setText("Score: " + score);
    }
    
    public void buttonEvent(int i, Queing_GUI q, JButton jB) {
        if (isCorrect(i) && isDone()) {
            jB.setBackground(Color.green);
            q.getjPanelGame().update(q.getjPanelGame().getGraphics());
            sleep(600);
            jB.setBackground(new JButton().getBackground());
            q.getjPanelGame().setVisible(false);
            q.getjPanelScore().setVisible(true);
            score += 10;
            score(q);
            q.setRunning(false);
        } else if (isCorrect(i)) {
            jB.setBackground(Color.green);
            q.getjPanelGame().update(q.getjPanelGame().getGraphics());
            
            //q.getjPanelGame().setBackground(Color.green);
           // q.getjPanelGame().update(q.getjPanelGame().getGraphics());
            sleep(600);
            jB.setBackground(new JButton().getBackground());
           // q.getjPanelGame().setBackground(Color.white);
            score += 10;
            updateQs(q);
            
        } else if (!isCorrect(i) && isDone()) {
            jB.setBackground(Color.red);
            q.getjPanelGame().update(q.getjPanelGame().getGraphics());
            sleep(600);
            jB.setBackground(new JButton().getBackground());
            q.getjPanelGame().setVisible(false);
            q.getjPanelScore().setVisible(true);
            score(q);
        } else {
            jB.setBackground(Color.red);
            q.getjPanelGame().update(q.getjPanelGame().getGraphics());
            sleep(600);
            jB.setBackground(new JButton().getBackground());
            updateQs(q);
        }
        updateScore(q);
    }
    
    

}
