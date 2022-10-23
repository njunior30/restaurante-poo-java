import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    public void setId(Long id) {
        this.id = id;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    private Long id;

    @Override
    public String toString() {
        return "Restaurante{" +
                "id=" + id +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", catalogo=" + catalogo +
                ", endereco=" + endereco +
                '}';
    }

    private String nomeFantasia;
    private String cnpj;
    private List<Produto> catalogo = new ArrayList<>();
    private Endereco endereco;
}
