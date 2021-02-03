package Exercicio2_LG2;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Orcamento {
    private LocalDateTime data;
    private BigDecimal valor;
    private String descricao;
    private TipoTransacao tipo;

    public Orcamento(LocalDateTime dt, BigDecimal valor, String desc, TipoTransacao tipo) {
        this.data = dt;
        this.setValor(valor);
        this.descricao = desc;
        this.tipo = tipo;
    }

    private void setValor(BigDecimal valor2) {
		this.valor = valor2;
		
	}

	@Override
    public String toString() {
        return "data=  " + data + ", valor= R$ " + valor + ", descricao= " + descricao + ", tipo= " + tipo;
    }


}