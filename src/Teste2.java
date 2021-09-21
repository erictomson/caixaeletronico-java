public class Teste2 {

    public static Cliente preencherId(Cliente cliente) {
        if(cliente.getIdentificador() == null) {
            cliente.setIdentificador("SEM IDENTIFICADOR");
        }
        return cliente;
    }
}
