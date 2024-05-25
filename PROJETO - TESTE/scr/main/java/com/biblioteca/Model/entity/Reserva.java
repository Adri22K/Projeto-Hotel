public class Reserva {
    private int id;
    private String status;
    private String Hospede;
    private String Funcinario;
    private String Quarto;
    private int dataCheckin ;
    private int dataCheckout ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getHospede() {
        return Hospede;
    }

    public void setHospede(String Hospede, String string) {
        this.Hospede = string;
    }

    public String getFuncinario() {
        return Funcinario;
    }

    public void setFuncinario(String Funcinario) {
        this.Funcinario = Funcinario;
    }

    public String getQuarto() {
        return Quarto;
    }

    public void setQuarto(String Quarto) {
        this.Quarto = Quarto;
    }

    public int getDataCheckin() {
        return dataCheckin;
    }

    public void setDataCheckin(int dataCheckin) {
        this.dataCheckin = dataCheckin;
    }

    public int getDataCheckout() {
        return dataCheckout;
    }

    public void setDataCheckout(int dataCheckout) {
        this.dataCheckout = dataCheckout;
    }
}
