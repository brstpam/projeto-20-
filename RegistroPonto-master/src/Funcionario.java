public class Funcionario {

    private Integer idFunc;
    private String nome;
    private String email;
    private String documento;

    public Funcionario(Integer idFunc, String nome, String email, String documento) {
        this.idFunc = idFunc;
        this.nome = nome;
        this.email = email;
        this.documento = documento;
    }

    public Integer getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(Integer idFunc) {
        this.idFunc = idFunc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}