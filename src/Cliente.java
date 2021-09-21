public class Cliente {

    private String nome;
    private String sobrenome;
    private String identificador;

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }


    public Cliente() {
        this.setNome("");
        this.setSobrenome("");
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public Cliente(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null) {
            System.out.println("Nome do cliente inválido!");
        } else {
            this.nome=nome;
        }
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @Override
    public String toString() {
        return this.getNome() + " " + this.getSobrenome();
    }
}
