package mx.santander.producer.dao;

import mx.santander.producer.model.Tycs;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ITycsMongoServiceDao extends MongoRepository<Tycs, Integer> {
}
