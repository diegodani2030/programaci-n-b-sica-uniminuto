
package retroalimentacionparcial;

public class Empleado {
    private String nombre;
    private String cargo;
    private double salarioBase;
    private int anosExperiencia;

    public Empleado() {
    } 
    

    public Empleado(String nombre, String cargo, double salarioBase, int anosExperiencia) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.anosExperiencia = anosExperiencia;
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
    public String verDetalle(){
        return "El empleado se llama"+this.nombre+"/ncon el cargo"+this.cargo+"/nsu salario base es:"+this.salarioBase+"/nSus años de experiencia son:"+this.anosExperiencia;
        
    }
    public String trabajar(int horas){
        return "el empleado trabaja"+horas+"al dia";
    }
    public String tomarDescanso(float horas){
        return "el empleado toma un descanso de:"+horas;
    }
    public String trabajaryDescansar() {
        String trabajo = trabajar(8);
        String descanso = tomarDescanso(1);
        return trabajo + " y " + descanso;
    }
}

