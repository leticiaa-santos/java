package Aula_01;

public class tiposPrimitivosPrintPrintf {

  public static void main(String[] args) {
    
    String nome = "MatarAGI";
    int idade = 18;
    double altura = 1.82;
    double saldo = 1500.98765;
    double taxaDesconto = 0.15;
    int codigoProduto = 25;

    //Exemplo de uso do print
    System.out.print("Olá! ");
    System.out.print("Este é o uso de print. ");
    System.out.print("Ele não pula linha automaticamente");

    //Exemplo de uso do println
    System.out.println("Agora estamos usando o println");
    System.out.println("Ele pula autoaticamente para a próxima linha");

    //Exemplo de uso do printf com variáveis
    System.out.printf("Meu nome %s, tenho %d anos e minha altura %.2f metros.\n", nome, idade, altura);
    //%s para String(nome), %d para inteiro(idade), %.2f para decimal com 2 casas(altura)

    //Exemplo de saldo bancário com duas e três casas decimais
    System.out.printf("Saldo bancário com duas casas decimais: R$.2f\n", saldo); //com 2 casas
    System.out.printf("Saldo bancário com três casas decimais: R$.3f\n", saldo); //com 3 casas

    //Alinhamento com printf: None e idade em colunas
    System.out.printf("%-10s %10s\n", "Nome", "Idade");
    System.out.printf("%-10s %10s\n", nome, idade);
    //%-10% alinha a esquerda com 10 espaços e %10 alinha a direita com 10 espaços

    System.out.printf("taxa de desconto: %.0f%%\n", taxaDesconto * 100);

    System.out.printf("Código do produto: %05d\n", codigoProduto);

    //Tabela de preços com alinhamento usando printf
    String item1 = "Café";
    double preco1 = 5.50;
    String item2 = "Sanduiche";
    double preco2 = 12.30;
    String item3 = "Suco";
    double preco3 = 8.70;

    System.out.printf("%-10s %10s\n", "Item", "Preço");
    System.out.printf("%-10s R$%10.2f\n", item1, preco1);
    System.out.printf("%-10s R$%10.2f\n", item2, preco2);
    System.out.printf("%-10s R$%10.2f\n", item3, preco3);
    //%-10s alinha o nome do item à esquerda, e o %10.2f alinha o preço à direita com duas casas decimais
  }
}