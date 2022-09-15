package exercicio1;

public class Emprestimo {

    public double valorFinal(double valor, int quantidadeParcelas){
        //Calcule o valor final d eum emprestimo a partir do valor solicitado
        //Taxas e parcelas influenciam
        //Defina arbitrariamente as faixas que influenciam nos valores

        switch (quantidadeParcelas){

            case 2:
                valor = valor * 0.2;
                break;

            case 3:
                valor = valor * 0.3;
                break;

            case 4:
                valor = valor * 0.4;
                break;

            case 5:
                valor = valor * 0.5;
                break;

            default:
                break;
        }

        return valor;
    }
}
