/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion.pkg7;

/**
 *
 * @author prestamo
 */
public class Sesion7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.setTitulo("Quijote de la mancha");
        libro1.setAutor("Cervantes");
        libro1.setGenero("Novela");
        libro1.setNumPaginas(600);
        System.out.println(libro1.getTitulo());
        System.out.println(libro1.getAutor());
        System.out.println(libro1.getGenero());
        System.out.println(libro1.getNumPaginas());
        libro1.setTitulo("Don quijote de la mancha");
        System.out.println(libro1.getTitulo());
        System.out.println("\nDETALLES DEL LIBRO");
        System.out.println(libro1.verDetalle());
        System.out.println("\nLIBRO PRESTADO A:");
        System.out.println(libro1.prestar("Iker fuentes"));
        System.out.println("\nPRESTAS Y DEVOLVEr");
        System.out.println(libro1.prestarYDevolver("Iker fuentes"));
        System.out.println("\nDEVOLVER");
        System.out.println(libro1.devolver());
        System.out.println("\nTIEMPO DE LECTURA");
        System.out.println(libro1.calcularTiempoLectura(6,5));
        
    }
    
}
