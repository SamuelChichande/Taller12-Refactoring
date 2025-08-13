public class EmpleadoPorHoras extends Empleado {
    private String genero;
    private double tarifaHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, Departamento departamento, String genero) {
        super(nombre, 0, horasTrabajadas, departamento);
        super.setSalarioBase(calcularSalario());
        this.genero = genero;
        this.tarifaHora= tarifaHora;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    @Override
    public void imprimirDetalles() {
        super.imprimirDetalles();
        System.out.println("Tarifa por hora: " + tarifaHora);
    }

    @Override
    public double calcularSalario() {
        double salario = super.getHorasTrabajadas() * getTarifaHora();
        return salario;
    }

    
    // Más metodos
}