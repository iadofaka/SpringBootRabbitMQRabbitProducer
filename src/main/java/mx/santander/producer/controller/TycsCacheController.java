package mx.santander.producer.controller;

import lombok.RequiredArgsConstructor;
import mx.santander.producer.model.TycsServiceMessage;
import mx.santander.producer.service.ITycsCacheService;
import mx.santander.producer.service.TycsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TycsCacheController {

    private final ITycsCacheService tycsCacheService;

    @GetMapping(value = "/cache/tycs")
    public String getTycsCache(@RequestBody TycsServiceMessage tycsServiceMessage) {
        return tycsCacheService.getTycCache(tycsServiceMessage);
    }

    @PostMapping(value = "save/cache/tycs")
    public String setTycsCache(@RequestBody TycsServiceMessage tycsServiceMessage) {
        return tycsCacheService.setTycCache(tycsServiceMessage);
    }
}

