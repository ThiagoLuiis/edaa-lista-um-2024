public class cachorro extends animal {
    private String nome;
    private String raca;
    private int idade;

    public cachorro(int id, String tipo, String habitat, String nome, String raca, int idade) {
        super(id, tipo, habitat);
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }
    
    public String toString() {
        return  "ID:" + getId() +
                "\nTipo:" + getTipo() +
                "\nHabitat:" + getHabitat() +  
                "\nNome:" + nome +
                "\nRaca:" + raca +
                "\nIdade:" + idade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

}
