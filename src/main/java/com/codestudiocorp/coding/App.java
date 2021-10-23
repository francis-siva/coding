package com.codestudiocorp.coding;

import com.codestudiocorp.algorithm.AlgoTwinWords;

public class App 
{
    public static void main( String[] args )
    {        
        Mobile z5 = new Mobile("Sony", "Z5C", 4.6);
        
        System.out.println("ID FacialRecognition :" + z5.getFacialRecognition());
        z5.unlockByFacialRecognition();
        
        System.out.println("ID FingerPrint :" + z5.readFingerPrint());
        z5.unlockByFingerPrint();
        
        /* [++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++] */
        //TWIN word Management
        String p1 = "marion", p2 = "romain";
        System.out.println("Return " + AlgoTwinWords.isTwinWords(p1, p2));        
        
        System.out.println("Return " + AlgoTwinWords.isTwinWords("Lookout", "Outlook"));
    }

    
}
