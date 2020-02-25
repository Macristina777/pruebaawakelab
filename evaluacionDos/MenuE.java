package evaluacionDos;

public class MenuE { // metodo ejecutor

public static void main(String[] args) {
  
       //Creamos un array de Electrodomesticos
       Electrodomestico listaElectrodomesticos[]=new Electrodomestico[10]; 
  
       //Asignamos cada una de las posiciones como queramos
       listaElectrodomesticos[0]=new Electrodomestico(200, 60, 'C', "Verde"); // LLAMADOS A LOS CONSTRUCTORES
       
       listaElectrodomesticos[1]=new Lavadora(150, 30);
       
       listaElectrodomesticos[2]=new Television(500, 80, 'E', "negro", 42, false);
       
       listaElectrodomesticos[3]=new Electrodomestico();
       listaElectrodomesticos[4]=new Electrodomestico(600, 20, 'D', "gris");
       
       listaElectrodomesticos[5]=new Lavadora(300, 40, 'Z', "blanco", 40);
       
       listaElectrodomesticos[6]=new Television(250, 70);
       
       listaElectrodomesticos[7]=new Lavadora(400, 100, 'A', "verde", 15);
       
       listaElectrodomesticos[8]=new Television(200, 60, 'C', "naranja", 30, true);
       
       listaElectrodomesticos[9]=new Electrodomestico(50, 10);
  
       //Creamos las variables que usaremos para almacenar la suma de los precios
       double sumaElectrodomesticos=0;
       double sumaTelevisiones=0;
       double sumaLavadoras=0;
  
       //Recorremos el array invocando el metodo precioFinal
       for(int i=0;i<listaElectrodomesticos.length;i++){
        
  
           if(listaElectrodomesticos[i] instanceof Electrodomestico){
               sumaElectrodomesticos+=listaElectrodomesticos[i].precioFinal();
           }
           if(listaElectrodomesticos[i] instanceof Lavadora){
               sumaLavadoras+=listaElectrodomesticos[i].precioFinal();
           }
           if(listaElectrodomesticos[i] instanceof Television){
               sumaTelevisiones+=listaElectrodomesticos[i].precioFinal();
           }
       }
  
       //Mostramos los resultados
       System.out.println("EL TOTAL DE LA SUMA DE LOS PRECIOS SON LOS SIGUIENTES");
       System.out.println("");
       System.out.println("La suma del precio de los electrodomesticos es de "+(int) Math.round(sumaElectrodomesticos)); // asi de mostrara en la consola como un entero
       System.out.println("");
       System.out.println("La suma del precio de las lavadoras es de "+(int) Math.round(sumaLavadoras));
       System.out.println("");
       System.out.println("La suma del precio de las televisiones es de "+(int) Math.round(sumaTelevisiones));
       System.out.println("");
       System.out.println("FIN ");
  
   }
  
}