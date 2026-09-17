
package Empleados;

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
    
    
    public String verDetalle() {
        String detalle = "\nEmpleado.nombre = " + this.nombre;
        detalle = detalle + "\nEmpleado.cargo = " + this.cargo;
        detalle = detalle + "\nEmpleado.salarioBase = " + this.salarioBase;
        detalle = detalle + "\nEmpleado.anosExperiencia = " + this.anosExperiencia;
        return detalle;
    }
    
    public String trabajar(int horas){
        String mensaje = "El empleado \"" + this.nombre;
        mensaje = mensaje + "sus horas son: " + horas;
        return mensaje;
    }
    public String tomarDescanso(){
        return  "el empleado" + this.nombre + "toma un descanso de un descanso";
    }
    public String trabajasYDescansar(int horas){
        String descanso = "el empleado" + this.nombre + "toma un descanso de:" +horas;
        return descanso;
    }
    public double calcularBono(float porcentaje){
        double bonos = (porcentaje + this.salarioBase) / 100;
        double bono =  bonos;
        return bono;
    }
    public double calcularBono(int porcentaje){
        double bonos = (porcentaje + this.salarioBase) / 100;
        double bono =  bonos;
        return bono;
    }
    public double calcularSalarioTotal(double bono, float diasTrabajados){
     double salario = (this.salarioBase/30)*diasTrabajados;
     return salario;   
    }
}
