package mx.santander.producer.controller;

import lombok.RequiredArgsConstructor;
import mx.santander.producer.model.TycsServiceMessage;
import mx.santander.producer.service.TycsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RabbitMQWebController {

    private final TycsService tycsService;


    @PostMapping(value = "/save/tycs")
    public String producerQueue(@RequestBody TycsServiceMessage tycsServiceMessage) {
        tycsService.pushTycs(tycsServiceMessage);

        return "Success";
    }
}

