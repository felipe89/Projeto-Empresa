package ProgramaEstoque;

public class ControleEstoque {

    public static String quantidadeProduto(Integer quantidade){

        if (quantidade >= 10 ){
            return "Estoque completo";
        }
        else if (quantidade == 0 ){
            return "Estoque vazio";
        }
        else {
            return "Nivel de estoque baixo";
        }
    }
}
