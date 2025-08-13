public class EmpleadoFijo extends Empleado {
    private double bonoAnual;
    private String genero;

    public EmpleadoFijo(String nombre, double salarioBase, int horasTrabajadas, Departamento departamento, double bonoAnual, String genero) {
        super(nombre, salarioBase, horasTrabajadas, 0, departamento);
        this.bonoAnual = bonoAnual;
        this.genero = genero;
    }

    public void imprimirDetalles() {
        datosEmpleado();
        System.out.println("Horas trabajadas: " + super.getHorasTrabajadas());
        System.out.println("Departamento: " + super.getDepartamento());
        System.out.println("bonoAnual: " + bonoAnual);
    }

    // Más metodos
}
