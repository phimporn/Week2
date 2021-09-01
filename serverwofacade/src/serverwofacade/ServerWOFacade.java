/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverwofacade;
import java.util.Scanner;

public class ServerWOFacade {
    public static void main(String[] args) {
         MyFacade myFacadeObj = MyFacade.getMyFacadeObject();
         Scanner sc = new Scanner(System.in);
         System.out.println("Please enter a command start / stop  ");
         String input = sc.nextLine();
            if ("start".equals(input)) {
                myFacadeObj.Mystart();
              }else{
                myFacadeObj.Mystop();
              }
    }
}

