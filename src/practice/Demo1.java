/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author canthony2
 */
public class Demo1 {
 
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Date now = new Date();
        String fmtDate = sdf.format(now);
        System.out.println(now.toString());
        
        Calendar now2 = Calendar.getInstance();
        System.out.println(now2.toString());
    }
    
}
