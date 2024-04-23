public class Conta {
    private int numeroConta;
    private String nomeCliente;
    private String agencia;
    private double saldo;

    // Construtor da classe Conta
    public Conta(int numeroConta, String nomeCliente, String agencia, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeCliente = nomeCliente;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    // Getters e setters para os atributos da conta
    // ... (implemente os getters e setters para cada atributo)

    // Método para retornar o nome do cliente
    public String getNomeCliente() {
        return nomeCliente;
    }

    // Método para retornar o número da conta
    public int getNumeroConta() {
        return numeroConta;
    }

    // Método para retornar a agência
    public String getAgencia() {
        return agencia;
    }

    // Método para retornar o saldo
    public double getSaldo() {
        return saldo;
    }
}
