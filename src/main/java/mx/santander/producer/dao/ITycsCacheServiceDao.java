package mx.santander.producer.dao;


import mx.santander.producer.model.TycsServiceMessage;
import org.springframework.stereotype.Repository;

@Repository
public interface ITycsCacheServiceDao{

    String findCacheKey(final TycsServiceMessage tycsServiceMessage);

    String saveCacheKey(final TycsServiceMessage tycsServiceMessage);
}
