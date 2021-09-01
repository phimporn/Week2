/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverwofacade;

/**
 *
 * @author Phimporn
 */
public class MyFacade {
     private static MyFacade myFacadeObj = null;
        public static MyFacade getMyFacadeObject() {
            if (myFacadeObj == null) {
                myFacadeObj = new MyFacade();
            } 
            return myFacadeObj;
        }
        public void Mystart() {
            Mystart mystart = new Mystart();
            mystart.mystart();
        }
        public void Mystop() {
            Mystop mystop = new Mystop();
            mystop.mystop();
        }

   

  }
