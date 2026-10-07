
package main;


public class Perro extends animal{
        private String raza;

        public Perro() {
        }
        public Perro(String especie,String raza){
            super(especie);
            this.raza = raza;
            
        }

        public String getRaza() {
            return raza;
        }
           

        public void setRaza(String raza) {
            this.raza = raza;
        }
        public void sonido (){
            System.out.println("El perro hace guau");
        }
    
}
