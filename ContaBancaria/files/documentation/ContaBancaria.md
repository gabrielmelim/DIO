# ContaBancaria

A classe `ContaBancaria` representa uma conta bancária simples com funcionalidades como depósito, saque e exibição de informações.

## Tecnologia Utilizada

- Linguagem: Java
- Ferramenta de Build: N/A (pode ser utilizado Maven ou Gradle, conforme preferência)
- Ambiente de Desenvolvimento: JDK (Java Development Kit)
- Controle de Versão: Git


## Atributos

- **numeroConta**: Identificador único da conta gerado automaticamente.
- **nome**: Nome do titular da conta.
- **cpf**: CPF do titular da conta.
- **saldo**: Saldo atual da conta.

## Construtores

### `public ContaBancaria(String nome, String cpf)`

Cria uma nova conta bancária com o nome e CPF do titular. O número da conta é gerado automaticamente.

## Métodos

### `public void depositar(double valor)`

Realiza um depósito na conta, aumentando o saldo.

### `public boolean sacar(double valor)`

Tenta realizar um saque na conta. Retorna verdadeiro se o saque for bem-sucedido, falso caso contrário.

### Getters e Setters

- `public String getNumeroConta()`
- `public String getNome()`
- `public String getCpf()`
- `public double getSaldo()`
- `public void setNumeroConta(String numeroConta)`
- `public void setNome(String nome)`
- `public void setCpf(String cpf)`
- `public void setSaldo(double saldo)`

### `@Override public String toString()`

Retorna uma representação em formato de string da conta bancária, incluindo número da conta, nome, CPF e saldo.

# ContaTerminal

A classe `ContaTerminal` é responsável por interagir com o usuário para criar uma conta bancária, realizar depósitos, saques e exibir informações.

## Fluxo do Programa

1. Bem-vindo ao sistema de criação de conta!
2. Solicita ao usuário que digite nome e CPF.
3. Cria uma instância de `ContaBancaria` com os dados fornecidos.
4. Exibe mensagem de conta criada.
5. Solicita ao usuário que deposite um valor.
6. Realiza depósito na conta.
7. Exibe mensagem de depósito realizado.
8. Solicita ao usuário que faça um saque.
9. Tenta realizar o saque e exibe mensagem correspondente.

## Observações

- Utiliza a classe `Scanner` para obter entrada do usuário.
- Fecha o scanner para evitar vazamentos de recursos.

