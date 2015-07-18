/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cubo1;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter; 
import java.io.IOException; 

import javax.swing.JOptionPane;

/**
 *
 * @author João
 */
public class Cubo1 {
    /**
     * @param args the command line arguments
     */
    
    
    // Rotacionar em X
    public static double[] rotacionarX  (double[] vertice,double angulo){
       double[] auxiliar = new double[3];
       double[] coordenada = new double[3];
       
       coordenada[0]=vertice[0];
       coordenada[1]=vertice[1];
       coordenada[2]=vertice[2];
       
      
       auxiliar[0] = coordenada[0];
       auxiliar[1] = coordenada[1]*Math.cos(angulo)-coordenada[2]*Math.sin(angulo);
       auxiliar[2] = coordenada[1]*Math.sin(angulo)+coordenada[2]*Math.cos(angulo);
       
       return auxiliar;
    };
    
     // Rotacionar em Y
    public static double[] rotacionarY  (double[] vertice,double angulo){
       double[] auxiliar = new double[3];
       double[] coordenada = new double[3];
       
       coordenada[0]=vertice[0];
       coordenada[1]=vertice[1];
       coordenada[2]=vertice[2];
       
      
       auxiliar[0] = coordenada[2]*Math.sin(angulo)+ coordenada[0]*Math.cos(angulo);
       auxiliar[1] = coordenada[1];
       auxiliar[2] = coordenada[2]*Math.cos(angulo)-coordenada[0]*Math.sin(angulo);
       
       return auxiliar;
    };
    
    
      // Rotacionar em Z
   public static double[] rotacionarZ  (double[] vertice,double angulo){
       double[] auxiliar = new double[3];
       double[] coordenada = new double[3];
       
       coordenada[0]=vertice[0];
       coordenada[1]=vertice[1];
       coordenada[2]=vertice[2];
       
      
       auxiliar[0] = coordenada[0]*Math.cos(angulo)-coordenada[1]*Math.sin(angulo);
       auxiliar[1] = coordenada[0]*Math.sin(angulo)+ coordenada[1]*Math.cos(angulo);
       auxiliar[2] = coordenada[2];
       
       return auxiliar;
    };
    
    public static void main(String[] args) {
        
    double[] vertice1 = {0.5,0.5,0.5};
    double[] vertice2 = {0.5,0.5,-0.5};
    double[] vertice3 = {-0.5,0.5,-0.5};
    double[] vertice4 = {-0.5,0.5,0.5};
    double[] vertice5 = {0.5,-0.5,0.5};
    double[] vertice6 = {0.5,-0.5,-0.5};
    double[] vertice7 = {-0.5,-0.5,-0.5};
    double[] vertice8 = {-0.5,-0.5,0.5};
    
    double[] auxiliar1 = new double [3];
    double[] auxiliar2 = new double [3];
    double[] auxiliar3 = new double [3];
    double[] auxiliar4 = new double [3];
    double[] auxiliar5 = new double [3];
    double[] auxiliar6 = new double [3];
    double[] auxiliar7 = new double [3];
    double[] auxiliar8 = new double [3];
   
    
    
    double radiano=0;
    int cont=0;
    
    
    
     File arquivo =new File ("Cubo1.txt");
       try
       {
           if(!arquivo.exists())
           {
               arquivo.createNewFile();
               FileWriter fw= new FileWriter(arquivo);
               
               
         
      
       while(cont<=200){
            
            radiano=(Math.PI/100); 
            
            vertice1=rotacionarY(vertice1,radiano);
            vertice2=rotacionarY(vertice2,radiano);
            vertice3=rotacionarY(vertice3,radiano);
            vertice4=rotacionarY(vertice4,radiano);
            vertice5=rotacionarY(vertice5,radiano);
            vertice6=rotacionarY(vertice6,radiano);
            vertice7=rotacionarY(vertice7,radiano);
            vertice8=rotacionarY(vertice8,radiano);
            
          
           
            vertice1=rotacionarX(vertice1,radiano);
            vertice2=rotacionarX(vertice2,radiano);
            vertice3=rotacionarX(vertice3,radiano);
            vertice4=rotacionarX(vertice4,radiano);
            vertice5=rotacionarX(vertice5,radiano);
            vertice6=rotacionarX(vertice6,radiano);
            vertice7=rotacionarX(vertice7,radiano);
            vertice8=rotacionarX(vertice8,radiano);
            
         
            
            
            vertice1=rotacionarZ(vertice1,radiano);
            vertice2=rotacionarZ(vertice2,radiano);
            vertice3=rotacionarZ(vertice3,radiano);
            vertice4=rotacionarZ(vertice4,radiano);
            vertice5=rotacionarZ(vertice5,radiano);
            vertice6=rotacionarZ(vertice6,radiano);
            vertice7=rotacionarZ(vertice7,radiano);
            vertice8=rotacionarZ(vertice8,radiano);
            
       
            
            fw.write("line"+"\r\n");
            fw.write(vertice1[0]+" "+vertice1[1]+" "+vertice2[0]+" "+vertice2[1]+"\r\n");
            fw.write("line"+"\r\n");
            fw.write(vertice2[0]+" "+vertice2[1]+" "+vertice3[0]+" "+vertice3[1]+"\r\n");
            fw.write("line"+"\r\n");
            fw.write(vertice3[0]+" "+vertice3[1]+" "+vertice4[0]+" "+vertice4[1]+"\r\n");
            fw.write("line"+"\r\n");
            fw.write(vertice4[0]+" "+vertice4[1]+" "+vertice1[0]+" "+vertice1[1]+"\r\n");
            fw.write("line"+"\r\n");
            fw.write(vertice5[0]+" "+vertice5[1]+" "+vertice6[0]+" "+vertice6[1]+"\r\n");
            fw.write("line"+"\r\n");
            fw.write(vertice6[0]+" "+vertice6[1]+" "+vertice7[0]+" "+vertice7[1]+"\r\n");
            fw.write("line"+"\r\n");
            fw.write(vertice7[0]+" "+vertice7[1]+" "+vertice8[0]+" "+vertice8[1]+"\r\n");
            fw.write("line"+"\r\n");
            fw.write(vertice8[0]+" "+vertice8[1]+" "+vertice5[0]+" "+vertice5[1]+"\r\n");
            fw.write("line"+"\r\n");
            fw.write(vertice1[0]+" "+vertice1[1]+" "+vertice5[0]+" "+vertice5[1]+"\r\n");
            fw.write("line"+"\r\n");
            fw.write(vertice6[0]+" "+vertice6[1]+" "+vertice2[0]+" "+vertice2[1]+"\r\n");
            fw.write("line"+"\r\n");
            fw.write(vertice7[0]+" "+vertice7[1]+" "+vertice3[0]+" "+vertice3[1]+"\r\n");
            fw.write("line"+"\r\n");
            fw.write(vertice8[0]+" "+vertice8[1]+" "+vertice4[0]+" "+vertice4[1]+"\r\n");
            fw.write("delay"+"\r\n"+0.1+"\r\n");
            fw.write("clrscr"+"\r\n");
            
            cont++; 
       }
            
            fw.write("end");
            fw.flush();
            fw.close();
       }
      
       }
             catch(IOException e)
       {
        JOptionPane.showMessageDialog(null, "Erro: ao gravar arquivo");   
       }
    }
}
