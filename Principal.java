package Exercicio2_LG2;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Principal {

    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();
        BigDecimal valor = new BigDecimal("400");
        String descricao = "Super mercado";
        TipoTransacao tipo = TipoTransacao.DESPESA;

        LocalDateTime dt2 = LocalDateTime.now();
        BigDecimal valor2 = new BigDecimal("3000");
        String descricao2 = " Salário";
        TipoTransacao tipo2 = TipoTransacao.RECEITA;

        Orcamento supermercado = new Orcamento(dt, valor, descricao, tipo);
        Orcamento sal = new Orcamento(dt2, valor2, descricao2, tipo2);

        System.out.println(sal.toString());
        System.out.println();
        System.out.println(supermercado.toString());
    }

}