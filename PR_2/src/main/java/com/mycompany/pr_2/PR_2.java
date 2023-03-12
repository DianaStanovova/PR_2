/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pr_2;
import java.util.Scanner;
/**
 *
 * @author sogri
 */
public class PR_2 {

 public static void main(String[] args) {
    System.out.println("Вариант 2, РИБО-03-21, Становова Диана");
    Scanner myObj = new Scanner(System.in);
    System.out.println("Telephone or Mobile phone? ");
    String phoneType = myObj.nextLine();
    
    System.out.println("Ringtone? ");
    String ringtone = myObj.nextLine();
    
    System.out.println("Number? ");
    String number = myObj.nextLine();
    
    System.out.println("Model? ");
    String model = myObj.nextLine();
    
    if (phoneType.equals("Telephone")){
        Telephone phone = new Telephone(ringtone, number, model);
        System.out.println(phone.toString());
        }
    else if (phoneType.equals("Mobile phone")){
        System.out.println("What pixel width? ");
        int width = Integer.parseInt(myObj.nextLine());

        System.out.println("What pixel height? ");
        int height = Integer.parseInt(myObj.nextLine());

        System.out.println("What diagonal? ");
        int diagonal = Integer.parseInt(myObj.nextLine());
        
        MobilePhone phone = new MobilePhone(width, height, diagonal,ringtone, number, model);
        System.out.println(phone.toString());
        }
    }
}
