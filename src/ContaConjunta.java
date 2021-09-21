import java.util.List;
import java.util.ArrayList;

public class ContaConjunta extends Conta {

    private List<Cliente> outrosTitulares = new ArrayList<>();

    public ContaConjunta(Cliente titular) {
        super(titular);
    }

    public List<Cliente> getOutrosTitulares() {
        return outrosTitulares;
    }

    public void setOutrosTitulares(List<Cliente> outrosTitulares) {
        this.outrosTitulares = outrosTitulares;
    }
}
