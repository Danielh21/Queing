/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queing;

import javax.swing.JLabel;
import org.joda.time.*;

/**
 *
 * @author Daniel
 */
class CounterClass {

    void Countertime(JLabel jLabelCounter) {

        DateTime currentTime = new DateTime();
        DateTime RoskildeStart = new DateTime(2016, 6, 25, 18, 0, 0, 0);
        int seconds = Seconds.secondsBetween(currentTime, RoskildeStart).getSeconds();

        int noOfDays = seconds / (24 * 60 * 60);
        int noOfHours = (seconds % (24 * 60 * 60)) / (60 * 60);
        int noOfMinutes = ((seconds % (24 * 60 * 60)) % (60 * 60)) / 60;
        int noSec = ((seconds % (24 * 60 * 60)) % (60 * 60)) % 60;

        
       jLabelCounter.setText("<html>Roskilde Counter:<br>" + noOfDays + " Days, "
                + noOfHours + " Hours, " + noOfMinutes + " Minuts, " + noSec + " Seconds</html>");

    }

}
