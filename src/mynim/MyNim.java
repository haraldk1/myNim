/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynim;

import java.util.*;

/**
 *
 * @author hkonnert
 */
public class MyNim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Initialisieren
        //int y[]  = new int [3];  
        int [] y={2,4,4};  System.out.print("Es geht los  -  Anzahl der Steine auf Haufen ist:    " ); verbleibendeSteine(y); System.out.println();
        
//      Random Zahl = new Random();  for(int i=0;i<y.length;i++) y[i]= Zahl.nextInt( 5)+1;  System.out.print("Es geht los; Anzahl der Steine auf Haufen ist " ); verbleibendeSteine(y);

       
        
    
        //Spieler 1 fängt an und berechnet wv Steine von welchem Haufen zu entfernen, damit die Nim summe Null ist; entfernt diese auch und gibt an wv Steine auf den Haufen geblieben sind 
        do
        {          
            
        //Spieler 2 entfernt eine beliebige Anzahl von Steinen von einem Haufen       
        ZugSpieler2(y);            
            
            
        for(int i=0;i<y.length;i++)
        {
            int temp  = y[i];
            
            if(nimSumme(y) > 0)   
                while ((y[i]>0) &&  (nimSumme(y)> 0) )         
                    y[i]--;              
            //else  { for(int j=0;j<y.length;j++) if(y[j]>0) {y[j]--;break;} break;}  
                        
            if((y[i]==0)&&(nimSumme(y)>0))                     
                y[i]=temp;  
                
            if(nimSumme(y) == 0)                               
                break; 
        }

        
        System.out.print("Haufen nach Zug von Spieler 1:   ");   verbleibendeSteine(y);  System.out.println();  if (AnzahlverbleibendeSteine(y)==0){  System.out.println("Sp1 hat gewonnen"); } //break; }        
        } while ( AnzahlverbleibendeSteine(y)>0);              
        
    }
    
    
        
         public static int AnzahlverbleibendeSteine(int[] z) { int Summe=0; for(int i: z)  Summe = Summe + i; return Summe;}    
    
         public static int nimSumme(int[] z)
         {   int Summe=0; for(int i: z)   Summe = Summe^i;  return Summe;  }
         
         static void verbleibendeSteine(int[] z)
         {  for(int i: z)  System.out.print(i+" "); System.out.println(); }
    
         public static void ZugSpieler2(int[]a){ Random Zahl = new Random(); int t; for(int i=0;i<a.length;i++) if(a[i]>0) { t=Zahl.nextInt(a[i])+1; a[i]=a[i]-t; break;}     
            System.out.print("Haufen nach Zug von Spieler 2:   "); verbleibendeSteine(a); System.out.println();  if (AnzahlverbleibendeSteine(a)==0){  System.out.println("Sp2 hat gewonnen"); /*break;*/ }   }
    
}






//einzuspielen:



//    5. zaubern   :)






// erledigt:
//    1. for  Schleife
//    2. Vektoren
//    3. in Funktionen umwandeln  - nimsumme, verblSt, AnzverbSt , zugSpieler2
//    4. Zufallszahl: Anzahl der Steine , 0 auschließen , Sp2 von erstem Haufen

//    6. vom zweiten Vektor losgeworden 
//    7. java code online ausführen  - https://www.compilejava.net/
//    8. Darcula theme
//    9. neue for Schleife






//        y[0]=4;  y[1]=2;  y[2]=0; y[3]=2; y[4]=4;   

//        int a, b, c, d, e;
//        int a1, b1, c1, d1, e1;
//        //Random Zahl = new Random();  a= Zahl.nextInt( 11);  a1 =a; b= Zahl.nextInt( 11);   b1=b;  c= Zahl.nextInt( 11);   c1=c;  d= Zahl.nextInt( 11);   d1=d; e= Zahl.nextInt( 11);   e1=e;
//        a=2; a1=a; b=2; b1=b; c=4; c1=c; d=4; d1=d; e=1; e1=e;                
//        //System.out.println("Anzahl der Steine auf Haufen sind " +a +" " +b +" " +c +" " +d +" " +e);
//


//
//funktionierend:
//
//
//        do
//            {
//        
//        System.out.println("ich bin oben");
//        
//
//        //Spieler 1 fängt an und berechnet wv Steine von welchem Haufen zu entfernen, damit die Nim summe Null ist
//        //Er entfernt diese und gibt die Anzahl von Steinen und den Haufen an
//        
//                                                      while ((a>0) &&  ((a^b^c^d^e) > 0) ) a=a-1;  
//        if((a^b^c^d^e) == 0)  a1=a;   
//        
//        if ((a==0 ) && ((a^b^c^d^e) > 0))  
//            {   a=a1;  
//                while ((b1>0) &&  ((a^b1^c^d^e) > 0) ) 
//                    b1=b1-1; 
//            }    
//
//        
//        
////                
////                                                      while ((a1>0) &&  ((a1^b^c^d^e) > 0) ) a1=a1-1;  
////        if((a1^b^c^d^e) == 0)  a=a1;   
////        
////        if ((a1==0 ) && ((a1^b^c^d^e) > 0))  
////            {   a1=a;  
////                while ((b1>0) &&  ((a^b1^c^d^e) > 0) ) 
////                    b1=b1-1; 
////            }  
////        
//        
//        
//        if((a^b1^c^d^e) == 0)  
//            b=b1; 
//        
//        
//        
//        
//        if ((b1==0 ) && ((a^b1^c^d^e) > 0))  { b1=b;  while ((c1>0) && ((a^b^c1^d^e) > 0)  ) c1=c1-1; }    
//        if((a^b^c1^d^e) == 0)  c=c1;         
//        
//        if ((c1==0 ) && ((a^b^c1^d^e) > 0))  { c1=c;  while ((d1>0) && ((a^b^c^d1^e) > 0)  ) d1=d1-1; }  
//        if((a^b^c^d1^e) == 0)  d=d1;        
//        
//        if ((d1==0 ) && ((a^b^c^d1^e) > 0))  { d1=d;  while ((e1>0) && ((a^b^c^d^e1) > 0)  ) e1=e1-1;   }
//        if((a^b^c^d^e1) == 0)  e=e1;    
//    
//        System.out.println("Spieler 1  "  +a +" " +b +" " +c +" " +d +" " +e);
//        System.out.println();
//    
//        if ((a+b+c+d+e)==0){  System.out.println("Sp1 hat gewonnen"); break; }
//        
//        
//        //Spieler 2 entfernt eine beliebige Anzahl von Steinen von einem Haufen 
//        if(a>0) {a=a-1; a1=a;} else if (b>0) { System.out.println("Spieler 2");b=b-1;b1=b;} else if (c>0) {System.out.println("Spieler 2");c=c-1; c1=c;} else if (d>0){System.out.println("Spieler 2"); d=d-1;d1=d;} else if (e>0){ e=e-1;e1=e;}
//        
//        System.out.println("Spieler 2   "  +a +" " +b +" " +c +" " +d +" " +e);
//        System.out.println();
//        
//        if ((a+b+c+d+e)==0){  System.out.println("Sp2 hat gewonnen"); break; }
//        
//        
//                
//            } while ((a+b+c+d+e)>0);