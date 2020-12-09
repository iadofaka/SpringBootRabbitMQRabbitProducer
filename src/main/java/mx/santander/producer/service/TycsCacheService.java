package mx.santander.producer.service;

import lombok.RequiredArgsConstructor;
import mx.santander.producer.dao.ITycsCacheServiceDao;
import mx.santander.producer.model.TycsServiceMessage;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TycsCacheService implements ITycsCacheService{

    private final ITycsCacheServiceDao tycsCacheServiceDao;

    public String getTycCache(final TycsServiceMessage tycsServiceMessage) {
        return tycsCacheServiceDao.findCacheKey(tycsServiceMessage);
    }

    public String setTycCache(final TycsServiceMessage tycsServiceMessage) {
        return tycsCacheServiceDao.saveCacheKey(tycsServiceMessage);
    }
}
