public abstract class Conta {
    private String numero;
    private double saldo;
    private Cliente titular;

    public Conta(Cliente titular) {
        this.numero="1";
        this.saldo=0;
        this.titular=titular;
    }

    public Conta(Cliente titular, String conta) {
        this.saldo=0;
        this.numero="1";
        this.titular=titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void sacar(double valor) throws Exception,NumberFormatException {
        System.out.println("Tentativa de saque na conta " + this.numero + " no valor de: " + valor);
        if(valor <= 0) {
            throw new NumberFormatException("Valor para saque inválido");
        }
        if (saldo < valor) {
            throw new SaldoInsuficienteException("");
        }
        this.saldo -= valor;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void transferir(double valor, Conta destino) throws Exception {
        this.sacar(valor);
        destino.depositar(valor);
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    @Override
    public boolean equals(Object objeto) {
        // Verifica se o objeto é do mesmo tipo da classe Conta
        if(this == objeto) { // mesmo que super.equals(objeto)
            return true;
        } if((objeto instanceof Conta) && (objeto != null)) { // Verifica se o objeto é uma Conta e se está inicializado
            Conta conta = (Conta) objeto;
            return this.numero.equals((conta.numero));
        } else {
            return false;
        }
    }

}
