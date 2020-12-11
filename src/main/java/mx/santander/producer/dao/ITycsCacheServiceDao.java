package mx.santander.producer.dao;


import mx.santander.producer.model.TycsServiceMessage;

public interface ITycsCacheServiceDao{

    String findCacheKey(final TycsServiceMessage tycsServiceMessage);

    String saveCacheKey(final TycsServiceMessage tycsServiceMessage);
}
