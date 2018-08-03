package br.com.linqsys.curso.domain;

import br.com.linqsys.curso.domain.enums.EstadoPagamento;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@JsonTypeName("pagamentoBoleto")
public class PagamentoBoleto extends Pagamento {

    @JsonFormat(pattern="dd/MM/yyyy")
    private Date dataPagamento;

    @JsonFormat(pattern="dd/MM/yyyy")
    private Date dataVencimento;

    public PagamentoBoleto() {

    }

    public PagamentoBoleto(Date dataPagamento, Date dataVencimento) {
        this.dataPagamento = dataPagamento;
        this.dataVencimento = dataVencimento;
    }

    public PagamentoBoleto(Integer id, EstadoPagamento estadoPagamento, Pedido pedido, Date dataPagamento, Date dataVencimento) {
        super(id, estadoPagamento, pedido);
        this.dataPagamento = dataPagamento;
        this.dataVencimento = dataVencimento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
}
