package mx.santander.producer.service;

import mx.santander.producer.model.TycsServiceMessage;

public interface ITycsCacheService {

    String getTycCache(final TycsServiceMessage tycsServiceMessage);

    String setTycCache(final TycsServiceMessage tycsServiceMessage);
}
