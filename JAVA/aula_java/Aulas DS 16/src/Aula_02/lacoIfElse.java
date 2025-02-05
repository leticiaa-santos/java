package Aula_02;

public class lacoIfElse {
    public static void main(String[] args) {

        double media = 8.0;
        int faltas = 20;
        boolean postura = true;
        String situacao;

        // AND (&&) - Falso
        // OR (||) -  Verdadeiro
        // NOT (!) - Falso

        if (media >= 5.0 && faltas < 25 && postura == true){
            situacao = "Aprovado";
        }
        else if (media >= 5.0 && faltas < 25 && postura){
            situacao = "Reprovado";
        }
        else if (media < 5.0 && faltas < 25 && postura) {
            situacao = "Sem Férias";
        }
        else if (media < 5.0 && faltas < 25 && postura == false) {
            situacao = "Chamar para conversar";
        }else{
            situacao = "Reprovado";
        }

        System.out.println(situacao);

    }
}
