package evaluacionDos;

public class Lavadora extends Electrodomestico{
 
   //Constantes
 
 
   private final static int CARGAPORDEFECTO=5; //CARGA POR DEFECTO
 
   //Atributos
 
 
   private int carga; // CARGA DE LA LAVADORA
 
   //Métodos publicos
 
 
   public int getCarga() { // DEVUELVE LA CARGA DE LA LAVADORA
       return carga;
   }
 
   
   public double precioFinal(){ // PRECIO FINAL DE LA LAVADORA
       //Invocamos el método precioFinal del método padre
       double plus=super.precioFinal();
 
       //añadimos el código necesario
       if (carga>30){
           plus+=50;
       }
 
       return plus;
   }
 
   //Constructor
 
   public Lavadora(){ // CONSTRUCTOR POR DEFECTO
       this(PRECIOBASEPORDEFECTO, PESOPORDEFECTO, CONSUMOENERGETICOPORDEFECTO, COLORPORDEFECTO, CARGAPORDEFECTO);
   }
 

   public Lavadora(double precioBase, double peso){ // CONSTRUCTOR CON DOS PARAMETROS
       this(precioBase, peso, CONSUMOENERGETICOPORDEFECTO, COLORPORDEFECTO, CARGAPORDEFECTO);
   }
 
  
    //Constructor con 5 parametros
 
   public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga){
       super(precioBase,peso, consumoEnergetico,color);
       this.carga=carga;
   }
}