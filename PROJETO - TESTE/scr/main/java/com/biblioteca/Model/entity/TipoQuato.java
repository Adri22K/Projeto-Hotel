public class TipoQuarto {
    private int id;
    private String caracteristica;
    private String descrição;
    private int capacidade;
    private float preçoNoite;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    public float getPreçoNoite() {
        return preçoNoite;
    }

    public void setPreçoNoite(float preçoNoite) {
        this.preçoNoite = preçoNoite;
    }
}
