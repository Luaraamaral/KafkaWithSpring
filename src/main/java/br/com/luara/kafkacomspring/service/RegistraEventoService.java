package br.com.luara.kafkacomspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class RegistraEventoService {

    @Autowired
    private KafkaTemplate<Object, Object> template;

    public void adicionarEventoNaFila(String topico, String dados) {
        template.send(topico, dados);
    }

}
