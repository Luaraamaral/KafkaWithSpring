package br.com.luara.kafkacomspring.dadoskafka;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {

    private String codigo;
    private String nomeProduto;
    private BigDecimal valor;

}
