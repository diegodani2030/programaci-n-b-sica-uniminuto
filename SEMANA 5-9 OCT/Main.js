package main;
public class Main {
   public static void main(String[] args) {
        animal animal1 = new animal();
        animal1.setEspecie("mamifero");
        System.out.println(animal1.getEspecie());
        animal1.comer();
        animal1.dormir();
        Perro perro1 =new Perro();
        Perro perro2 = new Perro();
        Perro perro3 = new Perro();
        perro1.setEspecie("mamifero");
        perro1.setRaza("golden retriver");
        System.out.println(perro1.getRaza());
        System.out.println(perro1.getEspecie());
        perro1.comer();
        perro1.dormir();
        perro2.setEspecie("mamifero");
        perro2.setRaza("pincher");
        System.out.println(perro2.getRaza());
        System.out.println(perro2.getEspecie());
        perro2.comer();
        perro2.dormir(); 
        perro3.setEspecie("mamifero");
        perro3.setRaza("pastor aleman");
        System.out.println(perro3.getRaza());
        System.out.println(perro3.getEspecie());
        perro3.comer();
        perro3.dormir(); 
        Gato gato1 = new Gato("Mamifero", "Siames", "Blanco");
        Gato gato2 = new Gato("Mamifero", "Persa", "Gris");
        Gato gato3 = new Gato("Mamifero", "Bengali", "Cafe");
        gato1.comer();  
        gato1.maullar();        
        gato1.mostrarInformacion();
        gato2.comer();  
        gato2.maullar();        
        gato2.mostrarInformacion();
        gato3.comer();  
        gato3.maullar();        
        gato3.mostrarInformacion();
        pajaro ave1 = new pajaro("Canario", "Piolin", "Amarillo");
        pajaro ave2 = new pajaro("Loro", "Paco", "Verde");
        ave1.dormir();          
        ave1.volar();         
        ave1.cantar();
        ave1.mostrarInformacion();
        ave2.dormir();          
        ave2.volar();         
        ave2.cantar();
        ave2.mostrarInformacion();
    
   
   }
}
