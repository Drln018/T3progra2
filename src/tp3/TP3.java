
package tp3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Darlin
 */
public class TP3 {

    /**
     * @param args the command line arguments
     */
        //Genero un array bidimensional del tamaña que indican como parámetro las filas y las columnas
    //de números aleatorios entre 1 y 10
    public static void main(String[] args){
        ArrayList<Vendedores> vendedor=new ArrayList<Vendedores>();
        Scanner lector = new Scanner(System.in);
        boolean programaActivo=true;
        do{
            System.out.println("Que operacion quieres hacer");
            System.out.println("1. Insertar vendedor");
            System.out.println("2. Modificar vendedor");
            System.out.println("3. Consultar vendedor");
            System.out.println("4. Terminar el programa");
    
            int opcion= lector.nextInt();
        
            switch (opcion) {
                case 1:
                    {
                        System.out.println("Nombre del vendedor");
                        String nombre= lector.next();
                        System.out.println("Ventas de enero");
                        int enero=lector.nextInt();
                        System.out.println("Ventas de febrero");
                        int febrero=lector.nextInt();
                        System.out.println("Ventas de marzo");
                        int marzo=lector.nextInt();
                        //pasar la informacion al vendedor
                        Vendedores a = new Vendedores();
                        a.setNombre(nombre);
                        a.setEnero(enero);
                        a.setFebrero(febrero);
                        a.setMarzo(marzo);
                        vendedor.add(a);
                        System.out.println("vendedor agregado");
                        break;
                    }
                case 2:
                    {
                        System.out.println("Vendedor a eliminar");
                        String nombre = lector.next();
                        Iterator<Vendedores> it =vendedor.iterator();
                        while(it.hasNext()){
                            Vendedores a = it.next();
                            if(a.getNombre().equals(nombre)){
                                it.remove();
                                System.out.println("vendedor " + a.getNombre() + " eliminado");
                            }
                        }       break;
                    }
                case 3:
                    for (Vendedores a: vendedor) {
                        System.out.println("Nombre "+ a.getNombre() + ", Enero: "+ a.getEnero() +", Febrero: " + a.getFebrero()+ ", Marzo: " + a.getMarzo());
                    }   break;
                case 4:
                    programaActivo=false;
                    break;
                default:
                    System.out.println("No has elegido correctamente");
                    break;
            }
            }
        while(programaActivo);
    }
}
