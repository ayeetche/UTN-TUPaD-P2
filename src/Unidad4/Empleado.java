package Unidad4;

public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados;
  
    public Empleado(String nombre, String puesto, double salario, int id){
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        this.id = id;
        totalEmpleados++;
    }
    
    public Empleado(String nombre, String puesto) { 
        this(nombre, puesto, 150.0, totalEmpleados);
    }
    
    public void actualizarSalario(int porcentajeAumento) {
        salario = salario + (porcentajeAumento * salario / 100);
    }
    
    public void actualizarSalario(double aumento) {
        salario = salario + aumento;
    }
    
    static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + "nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
    
}

