public class car {

    // Atributos//

    private String marca;
    private String modelo;
    private Integer ano;
    private String cor;

    public car(String Marca, String Modelo, int Ano, String Cor) {
        this.modelo = Modelo;
        this.marca = Marca;
        this.cor = Cor;
        this.ano = Ano;

    }

    public car() {

    }

// Se eu não passar nada como parametro preciso usar os getters e setters//

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
