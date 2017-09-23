/*
Nombre: Oritz Calderon Enrique

Matricula: 110009

Expresión Regular -AFD-: aa(abc*)*

Características Esenciales:
Cualquier elemento que no este incluidoen el alfabeto rompe la sentencia for 
y muestra el error correspondiente. 
se declara dentro de cada "qn" el alfabeto de la siguiente forma: "if(cadena[i]=='a')"
todo elemento del alfabeto que no tenga una salida envia a "q-1" indicando este
como estado valido.}
*en la consola se muestra el recodido echo en los estados "qn".
*/
import javax.swing.*;
import java.util.Scanner;

public class AFD
{
    public static void main(String[] args) 
    {
    	JOptionPane.showMessageDialog(null,"AFD Cadenas validas para:  aa(abc*)* ");
           
    	int cont=0;
        int q=0; 
       	  
        String entrada = JOptionPane.showInputDialog("Ingresa la cadena a validar:"); 
        String sCadena=entrada;
        char[] cadena = sCadena.toCharArray();
    	    	
         	
             
        System.out.printf("o-> q0"); 	
    	   error:for(int i=0; i<cadena.length; i++)
        {
        if(q==0) 
    		{
    		if(cadena[i]=='a')
    			{
    				System.out.printf("-["+cadena[i]+"]->q1 ");
    				q=1; 
    			}
    		else if(cadena[i]=='b')
    			{
    				System.out.printf("-["+cadena[i]+"]->q5 ");
    				q=5; 
    			}
    		else if(cadena[i]=='c')
    			{
    				System.out.printf("-["+cadena[i]+"]->q5 ");
    				q=5; 
    			}
    		else
    			{
    			JOptionPane.showMessageDialog(null,"error:  "+cadena[i]+ "  no perteneciente al alfabeto ");
    			System.out.printf("-["+cadena[i]+"]->q-1 ");
    			q=-1;
    			break error;	
    			}
    		continue;
    		}	
        if(q==1) 
    		{
    		if(cadena[i]=='a')
    			{
    				System.out.printf("-["+cadena[i]+"]->q2 ");
    				q=2; 
    			}
    		else if(cadena[i]=='b')
    			{
    				System.out.printf("-["+cadena[i]+"]->q5 ");
    				q=5; 
    			}
    		else if(cadena[i]=='c')
    			{
    				System.out.printf("-["+cadena[i]+"]->q5 ");
    				q=5; 
    			}
    		else
    			{
    			JOptionPane.showMessageDialog(null,"error:  "+cadena[i]+ "  no perteneciente al alfabeto ");
    			System.out.printf("-["+cadena[i]+"]->q-1 ");
    			q=-1;
    			break error;	
    			}
    		continue;        
             }
         if(q==2)
         	{
         	if(cadena[i]=='a')
    			{
    				System.out.printf("-["+cadena[i]+"]->q3 ");
    				q=3; 
    			}
    		else if(cadena[i]=='b')
    			{
    				System.out.printf("-["+cadena[i]+"]->q5 ");
    				q=5; 
    			}
    		else if(cadena[i]=='c')
    			{
    				System.out.printf("-["+cadena[i]+"]->q5 ");
    				q=5; 
    			}
    		else
    			{
    			JOptionPane.showMessageDialog(null,"error:  "+cadena[i]+ "  no perteneciente al alfabeto ");
    			System.out.printf("-["+cadena[i]+"]->q-1 ");
    			q=-1;
    			break error;	
    			}
    		continue; 
         	}
         if(q==3)
         	{
         	if(cadena[i]=='a')
    			{
    				System.out.printf("-["+cadena[i]+"]->q5 ");
    				q=5; 
    			}
    		else if(cadena[i]=='b')
    			{
    				System.out.printf("-["+cadena[i]+"]->q4 ");
    				q=4; 
    			}
    		else if(cadena[i]=='c')
    			{
    				System.out.printf("-["+cadena[i]+"]->q5 ");
    				q=5; 
    			}
    		else
    			{
    			JOptionPane.showMessageDialog(null,"error:  "+cadena[i]+ "  no perteneciente al alfabeto ");
    			System.out.printf("-["+cadena[i]+"]->q-1 ");
    			q=-1;
    			break error;	
    			}
    		continue;
         	
         	}
         if(q==4)
         	{
         	if(cadena[i]=='a')
    			{
    				System.out.printf("-["+cadena[i]+"]->q3 ");
    				q=3; 
    			}
    		else if(cadena[i]=='b')
    			{
    				System.out.printf("-["+cadena[i]+"]->q5 ");
    				q=5; 
    			}
    		else if(cadena[i]=='c')
    			{
    				System.out.printf("-["+cadena[i]+"]->q4 ");
    				q=4; 
    			}
    		else
    			{
    			JOptionPane.showMessageDialog(null,"error:  "+cadena[i]+ "  no perteneciente al alfabeto ");
    			System.out.printf("-["+cadena[i]+"]->q-1 ");
    			q=-1;
    			break error;	
    			}
    			
    		continue;
         	}
         if(q==5)
         	{
         	if(cadena[i]=='a')
    			{
    				System.out.printf("-["+cadena[i]+"]->q5 ");
    				q=5;
    			}
    		else if(cadena[i]=='b')
    			{
    				System.out.printf("-["+cadena[i]+"]->q5");
    				q=5; 
    			}
    		else if(cadena[i]=='c')
    			{
    				System.out.printf("-["+cadena[i]+"]->q5 ");
    				q=5; 
    			}
    		else
    			{
    			JOptionPane.showMessageDialog(null,"error:  "+cadena[i]+ "  no perteneciente al alfabeto ");
    			System.out.printf("-["+cadena[i]+"]->q-1 ");
    			q=-1;
    			break error;	
    			}
    		continue;
         	
         	}
        }
     
        
        
        if(q==2 || q==4)
    	{
    	JOptionPane.showMessageDialog(null,"La cadena es valida. ");
    	}
    	else
    	{
    	JOptionPane.showMessageDialog(null,"La cadena no es valida ");
    	}
    	
   
    }
}