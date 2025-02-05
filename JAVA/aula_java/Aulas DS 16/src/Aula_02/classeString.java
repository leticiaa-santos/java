package Aula_02;

public class classeString {

    public static final String RESET = "\033[0m";
    public static final String VERMELHO = "\033[31m";
    public static final String VERDE = "\033[32m";
    public static final String AMARELO = "\033[33m";    // Amarelo
    public static final String AZUL = "\033[34m";       // Azul
    public static final String ROXO = "\033[35m";       // Roxo
    public static final String CIANO = "\033[36m";      // Ciano
    public static final String BRANCO = "\033[37m";     // Branco


    public static final String FUNDO_VERMELHO = "\033[41m";
    public static final String FUNDO_VERDE = "\033[42m";
    public static final String FUNDO_AMARELO = "\033[43m";    // Fundo Amarelo
    public static final String FUNDO_AZUL = "\033[44m";       // Fundo Azul
    public static final String FUNDO_ROXO = "\033[45m";       // Fundo Roxo
    public static final String FUNDO_CIANO = "\033[46m";      // Fundo Ciano
    public static final String FUNDO_BRANCO = "\033[47m";     // Fundo Branco






    public static void main(String[] args) {
        //Exemplificando com operadores lógicos: && (AND), || (OR), ! (NOT)

        boolean condicao1 = true;
        boolean condicao2 = false;

        //Operadores lógicos
        System.out.println("Resultado do operador AND (&&): " + (condicao1 && condicao2));
        System.out.println("Resultado do operador OR (||): " + (condicao1 || condicao2));
        System.out.println("Resultado do operador NOT (!): " + (!condicao1));


        //Usando operadores de incremento e decremento
        int numero = 10;
        numero++;
        System.out.println("Incremento pós-fixado: " + numero);

        numero--;
        System.out.println("Decremento pós-fixado: " + numero);

        System.out.println("Incremento pré-fixado: " + ++numero);
        System.out.println("Decremento pré-fixado: " + --numero);

        //Usando o operador ternário
        String resultado = (numero > 5) ? "Maior que 5": "Menor ou igual a 5";

        System.out.println("Resultado do operador ternário: " + resultado);

        //Trabalhando com Strings
        String texto = "Java e uma linguagem poderosa!";

        //Usando o método charAt para acessar um caractere específico
        char caractere = texto.charAt(5);
        System.out.println("Caractere na posição 5: " + caractere);

        //Usando o método startsWith para verificar se a String começa com prefixo
        boolean comecaComJava = texto.startsWith("Java");
        System.out.println("A String começa com 'Java'? " + comecaComJava);

        //Usando o método endsWith para verificar se a String termina com sifixo
        boolean terminaComPoderosa = texto.endsWith("poderosa!");
        System.out.println("A String termina com 'poderosa!'? " + terminaComPoderosa);

        //Converteno para letras maiúsculas toUpperCase
        String textoMaiusculo = texto.toUpperCase();
        System.out.println("Texto em maiúsculas: " + textoMaiusculo);

        //Convertendo para minúculo toLowerCase
        String textoMinusculo = texto.toLowerCase();
        System.out.println("Texto em minusculo: " + textoMinusculo);

        //Usando equals para comparar Strings
        String textoComparar = "Java e uma linguagem poderosa!";
        boolean saoIguais = texto.equals(textoComparar);
        System.out.println("As duas Strings são iguais? " + saoIguais);

        //Usando a concatenação de String
        String concatenacao = texto + " " + textoComparar;
        System.out.println("Texto concatenado: " + concatenacao);

        // Usando as cores ANSI para formatar o texto
        System.out.println(VERMELHO + "Texto em Vermelho!" + RESET);
        System.out.println(VERDE + "Texto em Verde!" + RESET);
        System.out.println(AMARELO + "Texto em Amarelo!" + RESET);
        System.out.println(AZUL + "Texto em Azul!" + RESET);
        System.out.println(ROXO + "Texto em Roxo!" + RESET);
        System.out.println(CIANO + "Texto em Ciano!" + RESET);
        System.out.println(BRANCO + "Texto em Branco!" + RESET);

        // Usando cores de fundo
        System.out.println(FUNDO_VERMELHO + "Texto com Fundo Vermelho!" + RESET);
        System.out.println(FUNDO_VERDE + "Texto com Fundo Verde!" + RESET);
        System.out.println(FUNDO_AMARELO + "Texto com Fundo Amarelo!" + RESET);
        System.out.println(FUNDO_AZUL + "Texto com Fundo Azul!" + RESET);
        System.out.println(FUNDO_ROXO + "Texto com Fundo Roxo!" + RESET);
        System.out.println(FUNDO_CIANO + "Texto com Fundo Ciano!" + RESET);
        System.out.println(FUNDO_BRANCO + "Texto com Fundo Branco!" + RESET);



    }
}
