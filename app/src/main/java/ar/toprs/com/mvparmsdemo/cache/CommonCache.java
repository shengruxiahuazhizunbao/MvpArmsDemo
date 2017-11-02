package ar.toprs.com.mvparmsdemo.cache;

import java.util.List;
import java.util.concurrent.TimeUnit;

import ar.toprs.com.mvparmsdemo.Bean.User;
import io.reactivex.Observable;
import io.rx_cache2.DynamicKey;
import io.rx_cache2.EvictProvider;
import io.rx_cache2.LifeCache;
import io.rx_cache2.Reply;

/**
 * Created by TY on 2017/11/2.
 */

public interface CommonCache {
    @LifeCache(duration = 2, timeUnit = TimeUnit.MINUTES)
    Observable<Reply<List<User>>> getUsers(Observable<List<User>> oUsers, DynamicKey idLastUserQueried, EvictProvider evictProvider);
}
