import java.util.*;
import java.util.stream.Stream;

public class SistemaFinanceiro {

    public static void main(String[] args) throws Exception {
        // Criar novos clientes
        Cliente titular = new Cliente("Fábio", "Silva");
        Conta conta = new ContaCorrente(titular);

        try {
            conta.sacar(-1);
            conta.sacar(1);
        } catch (IllegalArgumentException | SaldoInsuficienteException e) {
            System.out.println("Valor inválido: " + e.getMessage());
        }
    }
}
