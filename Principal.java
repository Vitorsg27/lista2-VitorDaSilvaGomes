package Exercicio2_LG2;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Principal {

    public static void main(String[] args) {

        LocalDateTime dt = LocalDateTime.now();
        BigDecimal valor = new BigDecimal("400");
        String descricao = "Super mercado";
        TipoTransacao tipo = TipoTransacao.DESPESA;
        
        LocalDateTime dt1 = LocalDateTime.now();
        BigDecimal valor1 = new BigDecimal("500");
        String descricao1 = "Aluguel";
        TipoTransacao tipo1 = TipoTransacao.DESPESA;

        LocalDateTime dt2 = LocalDateTime.now();
        BigDecimal valor2 = new BigDecimal("3000");
        String descricao2 = " Salario";
        TipoTransacao tipo2 = TipoTransacao.RECEITA;

        Orcamento supermercado = new Orcamento(dt, valor, descricao, tipo);
        Orcamento aluguel = new Orcamento(dt1, valor1, descricao1, tipo1);
        Orcamento sal = new Orcamento(dt2, valor2, descricao2, tipo2);

        System.out.println(sal.toString());
        System.out.println(aluguel.toString());
        System.out.println(supermercado.toString());
    }

}
