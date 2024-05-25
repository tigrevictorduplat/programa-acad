public class Funcionario extends Cliente {
    private String cargo;
    private double salario;

    // Construtor
    public Funcionario(String cpf, String email, String telefone, boolean matriculaAtiva, boolean temDebito, String cargo, double salario) {
        super(cpf, email, telefone, matriculaAtiva, temDebito);
        this.cargo = cargo;
        this.salario = salario;
    }

    // Métodos Get e Set
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "cargo='" + cargo + '\'' +
                ", salario=" + salario +
                "} " + super.toString();
    }
}
