public class Operador extends Funcionario {

    private Double valorHora;

    public Operador(Integer idFunc, String nome, String email, String documento, Double valorHora) {
        super(idFunc, nome, email, documento);
        this.valorHora = valorHora;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }
}
