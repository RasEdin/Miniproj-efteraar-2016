
import java.lang.reflect.Array;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bruger
 */
public class Sal1 {

    private String[][] pladsNo = new String[14][20];

    public Sal1() {
        for (int i = 0; i < pladsNo.length; i++) {
            for (int j = 0; j < pladsNo[i].length; j++) {
                pladsNo[i][j] = ".";

            }

        }
    }

    public void reserver(int række, int plads) {  
          
          if (pladsNo[række][plads] != "x") {

            pladsNo[række][plads] = "x";
        }else{
            System.out.println("er reserveret");
        }
      
    }

    
    public void aflys(int række, int plads){
         
        if(pladsNo[række][plads]!="."){
            pladsNo[række][plads] =".";
        }
        System.out.println("pladsen er tom");
         
    }

    @Override
    public String toString() {
        String seatoverview = "pladsfordelingen";
        for (int i = 0; i < pladsNo.length; i++) {
            seatoverview += "\n";
            for (int j = 0; j < pladsNo[i].length; j++) {
                seatoverview += pladsNo[i][j]+" "; 
            }
            seatoverview+=" "+(i+1)+"-række";
        }
        
        return seatoverview;
    }
   
}
