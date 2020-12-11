package mx.santander.producer.service;

import mx.santander.producer.model.Tycs;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

public interface ITycsMongoService {

    String saveTycs(@RequestBody Tycs tys);

    Optional<Tycs> getTyc(@PathVariable int id);
}
