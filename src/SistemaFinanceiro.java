import java.util.*;
import java.util.stream.Stream;

public class SistemaFinanceiro {

    public static void main(String[] args) {
        // Criar novos clientes
        Cliente titular = new Cliente("Fábio", "Silva");
        titular.setIdentificador("10");
        Cliente outroTitular = new Cliente("Fulano", "de Tal");
        outroTitular.setIdentificador("100");
        Cliente maisUmTitular = new Cliente("Beltrano", "de Tal");
        maisUmTitular.setIdentificador("1000");

//        // Criar uma lista com elementos da classe Cliente
        List<Cliente> outrosTitulares = new ArrayList<>();
        outrosTitulares.add(outroTitular);
        outrosTitulares.add(maisUmTitular);

        Stream<Cliente> stream = outrosTitulares.stream();
        stream.map(Teste2::preencherId);
        // Dentro do meu Consumer, procure um método println que retorn void
        // Para cada objeto Cliente do Stream
        // executar o println para este Cliente
        stream.forEach(System.out::println);

//        for (Cliente cliente : outrosTitulares) {
//            System.out.println(cliente);
//        }

        // Expressão Lambda para executar
        // o mesmo que o Enhanced For acima
        stream.forEach(cliente -> System.out.println(cliente));

//
//        HashMap<Integer, Cliente> clientes = new HashMap<>();
//        clientes.put(titular.getIdentificador(),titular);
//        clientes.put(titular.getIdentificador(),titular);
//        clientes.put(outroTitular.getIdentificador(),outroTitular);
//        clientes.put(maisUmTitular.getIdentificador(),maisUmTitular);
//
//        for(Integer chave : clientes.keySet()) {
//            System.out.println("Cliente de chave " + chave + ": " + clientes.get(chave));
//        }
//        // Criar uma conta conjunta
//        ContaConjunta conta = new ContaConjunta(titular);
//

//        conta.setOutrosTitulares(outrosTitulares);
//
//        // Enhanced For
//        // Para cada Cliente dentro de uma lista de Clientes, faça
//        for (Cliente cliente : conta.getOutrosTitulares()) {
//            System.out.println("Nome: " + cliente.getNome() + " " + cliente.getSobrenome());
//        }
//
//        // For tradicional com a mesma função do Enhanced For
//        for (int i = 0; i < outrosTitulares.size(); i++) {
//            Cliente cliente = outrosTitulares.get(i);
//            System.out.println("Nome: " + cliente.getNome() + " " + cliente.getSobrenome());
//        }

        // TreeSet armazenamento em formato de árvore binária (sempre balanceada)
        // com elementos não repetidos e ordenados
//        Set<Integer> numeros = new HashSet<>();
//
//        numeros.add(2);
//        numeros.add(10);
//        numeros.add(1);
//        numeros.add(25);
//        numeros.add(8);
//        numeros.add(2);
//        numeros.add(0);
//        numeros.add(12);
//        numeros.add(3);
//
//        for(Integer numero: numeros) {
//            System.out.println(numero);
//        }
    }
}
