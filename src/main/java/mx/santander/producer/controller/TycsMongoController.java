package mx.santander.producer.controller;

import lombok.RequiredArgsConstructor;
import mx.santander.producer.model.Tycs;
import mx.santander.producer.service.ITycsMongoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class TycsMongoController {

    private final ITycsMongoService tycsMongoService;

    @PostMapping("/addTyc")
    public String saveBook(@RequestBody Tycs tycs) {
        return tycsMongoService.saveTycs(tycs);
    }

    @GetMapping("/findAllTycs/{id}")
    public Optional<Tycs> getTyc(@PathVariable int id) {
        return tycsMongoService.getTyc(id);
    }

}
