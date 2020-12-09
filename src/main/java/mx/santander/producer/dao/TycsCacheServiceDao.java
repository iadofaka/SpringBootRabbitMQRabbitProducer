package mx.santander.producer.dao;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import mx.santander.producer.model.TycsServiceMessage;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
@RequiredArgsConstructor
public class TycsCacheServiceDao implements ITycsCacheServiceDao {

    private static final String HASH_KEY = "0|AN|";

    private final RedisTemplate template;

    public String findCacheKey(final TycsServiceMessage tycsServiceMessage){
        TycsServiceMessage tycMessage = (TycsServiceMessage) template.opsForHash().get(HASH_KEY, tycsServiceMessage.getBuc());
        return tycMessage.getApplicationId();
    }

    public String saveCacheKey(final TycsServiceMessage tycsServiceMessage){
        template.opsForHash().put(HASH_KEY, tycsServiceMessage.getBuc(), tycsServiceMessage);
        return "successful";
    }
}
