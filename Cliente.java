public class Cliente {
    private String cpf;
    private String email;
    private String telefone;
    private boolean matriculaAtiva;
    private boolean temDebito;

    // Construtor
    public Cliente(String cpf, String email, String telefone, boolean matriculaAtiva, boolean temDebito) {
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.matriculaAtiva = matriculaAtiva;
        this.temDebito = temDebito;
    }

    // Métodos Get e Set
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean isMatriculaAtiva() {
        return matriculaAtiva;
    }

    public void setMatriculaAtiva(boolean matriculaAtiva) {
        this.matriculaAtiva = matriculaAtiva;
    }

    public boolean isTemDebito() {
        return temDebito;
    }

    public void setTemDebito(boolean temDebito) {
        this.temDebito = temDebito;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cpf='" + cpf + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", matriculaAtiva=" + matriculaAtiva +
                ", temDebito=" + temDebito +
                '}';
    }
}
