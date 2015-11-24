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
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

/**
 *
 * @author Daniel
 */
public class Quiz {

    private ArrayList<String[]> quiz = new ArrayList<String[]>();
    private String[] q1 = {"When was the first\nRoskilde held?", "1971", "1980", "1991", "2001", "1971"};
    private String[] q2 = {"Which of these artist\nare performning?", "Madonna", "Elvis", "Micheal Jackson", "Bent", "Micheal Jackson"};
    private String[] q3 = {"How many stages does\nRoskilde Festival have?", "4", "8", "10", "12", "8"};
    private String[] q4 = {"How many different exits\ndoes Roskilde Festival have?", "1", "3", "5", "2", "5"};
    private String[] q5 = {"Does Roskilde donate\ntheir profit?", "Yes", "No", "Maybe", "Call me Maybe", "Yes"};
    private String[] q6 = {"How many attendees does\nRoskilde Festival have?", "2", "3333", "80.000", "1.000.000", "80.000"};
    private boolean running = true;
    private int numOfQsAns = 0;
    private String answer;
    private int points;
    private Random gen = new Random();
    private String[] curQ;

    public Quiz() {
        addQnA();
    }

    final public void addQnA() {
        quiz.add(q1);
        quiz.add(q2);
        quiz.add(q3);
        quiz.add(q4);
        quiz.add(q5);
        quiz.add(q6);
    }

    boolean setAnswers(JTextArea TextArea, JButton Button1, JButton Button2,
            JButton Button3, JButton Button4) {
        if(quiz.isEmpty()) {
            return true;
        }
        int quizLength = quiz.size();
        int QuestionUsedInt = gen.nextInt(quizLength);
        String[] QuestionUsed = quiz.get(QuestionUsedInt);
        TextArea.setText(QuestionUsed[0]);
        Button1.setText(QuestionUsed[1]);
        Button2.setText(QuestionUsed[2]);
        Button3.setText(QuestionUsed[3]);
        Button4.setText(QuestionUsed[4]);
        answer = QuestionUsed[5];
        quiz.remove(QuestionUsedInt);
        return false;
    }
    
    void checkAnswer(String text, int counter) {
        if(text.equals(answer)){
            // You get points
            System.out.println("Correct");
            points += 100 + (counter*20); // Man får 20 points per sekond man har tilbage.
        }
        else{
            System.out.println("Wrong");
        }
    }
    
    public int getPoints() {
        return points;
    }
    
    String getPointsAsString() {
        return ""+ getPoints();
    }
    

//    public boolean isDone() {
//        return numOfQsAns > 3;
//
//    }
//
//    public void score(Queing_GUI q) {
//        if (isDone()) {
//            try {
//                q.getjLabelQScore().setText("Congratulations!\n You got " + (score) + " pt.");
//            } catch (NullPointerException e) {
//
//            }
//        }
//    }
//
//    public void updateQs(Queing_GUI a) {
//        if (numOfQsAns < 5) {
//            Collections.shuffle(quiz);
//            curQ = quiz.get(0);
//            a.getjLabelQuestion().setText("" + curQ[0]);
//            a.getjButtonA1().setText("" + curQ[1]);
//            a.getjButtonA2().setText("" + curQ[2]);
//            a.getjButtonA3().setText("" + curQ[3]);
//            a.getjButtonA4().setText("" + curQ[4]);
//            numOfQsAns++;
//        } else {
//            isDone();
//        }
//    }
//    
//    public boolean isCorrect(int x) {
//        boolean isCorrect = false;
//        if (curQ[x].equalsIgnoreCase(curQ[5])) {
//            isCorrect = true;
//            quiz.remove(curQ);
//        }
//        return isCorrect;
//    }
//    
//    public void sleep(int x) {
//        try {
//            TimeUnit.MILLISECONDS.sleep(x);
//        } catch (InterruptedException ex) {
//            
//        }
//    }
//    
//    public void updateScore(Queing_GUI q) {
//        q.getjLabelCurQScore().setText("Score: " + score);
//    }
//    
//    public void buttonEvent(int i, Queing_GUI q, JButton jB) {
//        if (isCorrect(i) && isDone()) {
//            jB.setBackground(Color.green);
//            q.getjPanelGame().update(q.getjPanelGame().getGraphics());
//            sleep(600);
//            jB.setBackground(new JButton().getBackground());
//            q.getjPanelGame().setVisible(false);
//            q.getjPanelScore().setVisible(true);
//            score += 10;
//            score(q);
//            q.setRunning(false);
//        } else if (isCorrect(i)) {
//            jB.setBackground(Color.green);
//            q.getjPanelGame().update(q.getjPanelGame().getGraphics());
//            
//            //q.getjPanelGame().setBackground(Color.green);
//           // q.getjPanelGame().update(q.getjPanelGame().getGraphics());
//            sleep(600);
//            jB.setBackground(new JButton().getBackground());
//           // q.getjPanelGame().setBackground(Color.white);
//            score += 10;
//            updateQs(q);
//            
//        } else if (!isCorrect(i) && isDone()) {
//            jB.setBackground(Color.red);
//            q.getjPanelGame().update(q.getjPanelGame().getGraphics());
//            sleep(600);
//            jB.setBackground(new JButton().getBackground());
//            q.getjPanelGame().setVisible(false);
//            q.getjPanelScore().setVisible(true);
//            score(q);
//        } else {
//            jB.setBackground(Color.red);
//            q.getjPanelGame().update(q.getjPanelGame().getGraphics());
//            sleep(600);
//            jB.setBackground(new JButton().getBackground());
//            updateQs(q);
//        }
//        updateScore(q);

    

    
    
    
}
