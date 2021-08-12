/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmosDinamicos.Floyd.ImplementacionAB;

/**
 *
 * @author Adriana
 */
 import javax.swing.UIManager;
 import javax.swing.UnsupportedLookAndFeelException;
 public class app
 {
 public static void main(String args[])
   {
       try
        {
          UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException e)
          {
             e.printStackTrace();
          } catch (InstantiationException e)
          {
            e.printStackTrace();
          } catch (IllegalAccessException e)
          {
            e.printStackTrace();
          } catch (UnsupportedLookAndFeelException e)
          {
            e.printStackTrace();
          }
         Vista vista;
         Implementación imp;
         
         vista=new Vista();
         imp=new Implementación();
   }
 }