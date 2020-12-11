package mx.santander.producer.service;

import lombok.RequiredArgsConstructor;
import mx.santander.producer.dao.ITycsMongoServiceDao;
import mx.santander.producer.model.Tycs;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TycsMongoService implements ITycsMongoService{

    private final ITycsMongoServiceDao tycsMongoDao;

    public String saveTycs(@RequestBody Tycs tys) {
        tycsMongoDao.save(tys);
        return "Added tys with id_application : " + tys.getApplicationId();
    }

    public Optional<Tycs> getTyc(@PathVariable int id) {
        return tycsMongoDao.findById(id);
    }

}
