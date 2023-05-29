package br.com.luara.kafkacomspring.controller;

import br.com.luara.kafkacomspring.model.Pedido;
import br.com.luara.kafkacomspring.service.ProdutorService;
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
    private final ProdutorService eventoService;

    @PostMapping(path = "/adicionaPedido")
    public ResponseEntity<String> adicionarPedido(@RequestBody Pedido pedido) {

        eventoService.adicionarEventoNaFila("SalvarPedido", String.valueOf(pedido));

        return ResponseEntity.ok("Evento adicionado na fila!");
    }

}
