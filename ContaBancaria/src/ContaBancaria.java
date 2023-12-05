import java.util.UUID;

public class ContaBancaria {
    private String numeroConta;
    private String nome;
    private String cpf;
    private double saldo;

    public ContaBancaria(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroConta = UUID.randomUUID().toString(); // Gerar um número de conta único
        this.saldo = 0; // Saldo inicial zero
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Número da Conta: " + numeroConta + "\nNome: " + nome + "\nCPF: " + cpf + "\nSaldo: " + saldo;
    }


}
