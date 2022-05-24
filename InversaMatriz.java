package proyecto.src.clase1;
import javax.swing.*; //Herramienta que ayuda a que salga la interfaz grafica

public class InversaMatriz {
    private int matriz[][];

    private int transpuesta[][]; //variables

    private int i;

    private int j;

    private int valores;


    public InversaMatriz()
    {
        
           //nos permite ingresar datos numericos     //ingreso de datos
        i = Integer.parseInt(JOptionPane.showInputDialog("Ingresar numero de fila para la matriz"));
        

        j = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero de columna para la matriz"));
        
        this.matriz = new int[i][j]; //instancia que ayuda a la realizacion de una determinada clase

        transpuesta = new int[j][i];
        
       
      
}

    public void integrarMatriz() //Operación 
    {
        for (int i=0; i < this.matriz.length; i++)
        {
            for (int j=0; j < this.matriz[i].length; j++)
            {
                this.valores = Integer.parseInt(JOptionPane.showInputDialog("valores  para la matriz 1"));

                this.matriz[i][j] = this.valores;
            }
        }
    }

    public void presentarMatriz()
    {
        System.out.println("matriz principal ");                             
        for(int i=0; i < this.matriz.length; i++)          
        {
            for(int j=0; j < this.matriz[i].length; j++)
            {
                System.out.printf("%d ", this.matriz[i][j]);
            }
            
            System.out.println(); 
        }
    }

   
    

    public void presentarTranspuesta()  
    {
        System.out.println("resultado de transpuesta");
        for (int i=0; i < this.matriz.length; i++)
          {
            for (int j=0; j < this.matriz[i].length; j++)
              {
                transpuesta[i][j]= matriz[j][i];
                System.out.printf("%d ", transpuesta[i][j]);
              }
              System.out.println();
        }   
    }

    public static void main(String args[])    //cadena de argumentos
    {
        InversaMatriz matriz20 = new InversaMatriz();

        matriz20.integrarMatriz();
        matriz20.presentarMatriz();
        matriz20.presentarTranspuesta();

}
}

