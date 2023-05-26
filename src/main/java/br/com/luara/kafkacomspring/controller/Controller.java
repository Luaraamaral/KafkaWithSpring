package br.com.luara.kafkacomspring.controller;

import br.com.luara.kafkacomspring.dadoskafka.Pedido;
import br.com.luara.kafkacomspring.service.RegistraEventoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {

    @Autowired
    private final RegistraEventoService eventoService;

    @PostMapping(path = "/salvaPedido")
    public ResponseEntity<String> salvarPedido(@RequestBody Pedido pedido) {

        eventoService.adicionarEventoNaFila("SalvarPedido", String.valueOf(pedido));

        return ResponseEntity.ok("");
    }

}
