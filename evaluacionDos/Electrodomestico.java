package evaluacionDos;

public class Electrodomestico {

//Constantes
	   
	    protected final static String COLORPORDEFECTO="blanco"; // color por defecto // PROTEGIDa y es final
	   
	
	    protected final static char CONSUMOENERGETICOPORDEFECTO='F'; // consumo energetico por defecto
	   
	 
	    protected final static double PRECIOBASEPORDEFECTO=100; // precio base por defecto
	   
	  
	    protected final static double PESOPORDEFECTO=5; // peso por defecto
	   
	    //Atributos
	   
	  
	    protected double precioBase; // precio base
	   
	   
	    protected String color; // color de electrodomestico
	  
	    protected char consumoEnergetico; // indica el consumo energetico
	   
	    
	    protected double peso;
	   
	
	    private void comprobarColor(String color){ // metodos privados
	   
	        String colores[]={"blanco", "negro", "rojo", "azul", "gris"}; // colores disponibles
	        boolean encontrado=false;
	  
	        for(int i=0;i<colores.length && !encontrado;i++){
	              
	            if(colores[i].equals(color)){
	                encontrado=true;
	            }
	              
	        }
	          
	        if(encontrado){
	            this.color=color;
	        }else{
	            this.color=COLORPORDEFECTO;
	        }
	          
	          
	    }
	      
	  
	    public void comprobarConsumoEnergetico(char consumoEnergetico){ // comprueba el consumo energetico,
	          
	        if(consumoEnergetico>=65 && consumoEnergetico<=70){ // uso de tabla de caracteres del codigo ASCII
	            this.consumoEnergetico=consumoEnergetico;
	        }else{
	            this.consumoEnergetico=CONSUMOENERGETICOPORDEFECTO;
	        }
	          
	    }
	   
	    //Métodos publicos
	   
	    public double getPrecioBase() { // devuelve el precio base 
	        return precioBase;
	    }
	  
	    public String getColor() { // devuelve el color del electrodomestico 
	        return color;
	    }
	   
	  
	    public char getConsumoEnergetico() { // devuelve el consumo energetico del electrodomestico
	        return consumoEnergetico;
	    }
	   
	    public double getPeso() {
	        return peso;
	    }
	   
	    public double precioFinal(){ // precio final delelectrodomestico
	        double plus=0;
	        switch(consumoEnergetico){
	            case 'A':
	                plus+=100;
	                break;
	            case 'B':
	                plus+=80;
	                break;
	            case 'C':
	                plus+=60;
	                break;
	            case 'D':
	                plus+=50;
	                break;
	            case 'E':
	                plus+=30;
	                break;
	            case 'F':
	                plus+=10;
	                break;
	        }
	   
	        if(peso>=0 && peso<19){
	            plus+=10;
	        }else if(peso>=20 && peso<49){
	            plus+=50;
	        }else if(peso>=50 && peso<=79){
	            plus+=80;
	        }else if(peso>=80){
	            plus+=100;
	        }
	   
	        return precioBase+plus;
	    }
	   
	  
	    public Electrodomestico(){
	        this(PRECIOBASEPORDEFECTO, PESOPORDEFECTO, CONSUMOENERGETICOPORDEFECTO, COLORPORDEFECTO);//CONTRUCTOR POR DEFECTO
	    }
	   
	  
	    public Electrodomestico(double precioBase, double peso){ // constructor con dos parametros
	        this(precioBase, peso, CONSUMOENERGETICOPORDEFECTO, COLORPORDEFECTO);
	    }
	   
	    
	    public Electrodomestico(double precioBase, double peso, char consumoEnergetico, String color){ // constructor con cuatro parametros
	        this.precioBase=precioBase;
	        this.peso=peso;
	        comprobarConsumoEnergetico(consumoEnergetico);
	        comprobarColor(color);
	    }
	   
	}
