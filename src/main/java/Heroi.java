public class Heroi {
    private String nome;
    private int idade;
    private String tipo;

    // Construtor
    public Heroi(String nome, int idade, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
    }

    // Método atacar
    public void atacar() {
        String ataque = "";

        // Estrutura de decisão para definir o ataque com base no tipo
        switch (tipo.toLowerCase()) {
            case "mago":
                ataque = "magia";
                break;
            case "guerreiro":
                ataque = "espada";
                break;
            case "monge":
                ataque = "artes marciais";
                break;
            case "ninja":
                ataque = "shuriken";
                break;
            default:
                ataque = "realizou um ataque desconhecido";
        }

        // Exibe a mensagem final
        System.out.println("O " + tipo + " atacou usando " + ataque);
    }

    // Métodos getters e setters (opcional, se precisar acessar ou modificar as propriedades)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
