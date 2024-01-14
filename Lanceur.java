/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pj_boite_de_nuit;

import java.util.Scanner;

public class Lanceur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int age;
        int judiciaire = 0;
            
        do {
            
            System.out.println("Bienvenue en boite !");
            
            System.out.println("Saisissez votrte age :");
            age = sc.nextInt();
            
            if (age < 18) {
                System.out.println("Desole, vous ne pouvez pas entrer car vous etes mineur");
            } else {
                System.out.println("Maintenant, indiquez si vous avez un casier judiciaire : 1 = oui, 2 = non");
                judiciaire = sc.nextInt();
                
                if (judiciaire == 1) {
                    System.out.println("Desole, vous etes majeur, certes mais vous ne pouvez pas entrer car vous etes un delinquant !!!");
                }
            }
            
            
        } while (!(age >= 18 && judiciaire == 2));
        
        System.out.println("Merci d'avoir montre patte blanche, amusez-vous bien !");
    }
    
}
