package evaluacionDos;


public class Television extends Electrodomestico{
 
   //Constantes
 
  
   private final static int RESOLUCIONPORDEFECTO=20;
 
   //Atributos
 
  
   private int resolucion; // RESOLUCION DEL LA TV
 
   
   private boolean sintonizadorTDT; 
   //M�todos publicos
 
  
   public double precioFinal(){ // PRECIO FINAL DE LA TELEVISION
       //Invocamos el m�todo precioFinal del m�todo padre
       double plus=super.precioFinal();
 
       //A�adimos el codigo necesario
       if (resolucion>40){
           plus+=precioBase*0.3;
       }
       if (sintonizadorTDT){
           plus+=50;
       }
 
       return plus;
   }
 
   //Constructor
 
 
   public Television(){
       this(PRECIOBASEPORDEFECTO, PESOPORDEFECTO, CONSUMOENERGETICOPORDEFECTO, COLORPORDEFECTO, RESOLUCIONPORDEFECTO, false); //CONSTRUCTOR POR DEFECTO
   }
 
  
   public Television(double precioBase, double peso){
       this(precioBase, peso, CONSUMOENERGETICOPORDEFECTO, COLORPORDEFECTO, RESOLUCIONPORDEFECTO, false); // CONSTRUCTOR CON DOS PARAMETROS
   }
 

    // Contructor con 6 parametros

    
   public Television(double precioBase, double peso, char consumoEnergetico, String color, int resolucion, boolean sintonizadorTDT){
       super(precioBase, peso, consumoEnergetico, color);
       this.resolucion=resolucion;
       this.sintonizadorTDT=sintonizadorTDT;
   }
}
