package org.alvin.opsdev.monitor.system.service.cache;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.alvin.opsdev.monitor.system.domain.Alert;
import org.alvin.opsdev.monitor.system.domain.Device;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * Created by tangzhichao on 2017/4/24.
 */
@Component
public class AlertCacheService {

    private Cache<Long, Alert> deviceCache = CacheBuilder.newBuilder().expireAfterWrite(2, TimeUnit.MINUTES).build();

    public void put(Device dev, Alert alert) {
        this.deviceCache.put(dev.getId(), alert);
    }

    public Alert get(Device dev) {
        return deviceCache.getIfPresent(dev.getId());
    }

    public void remove(Device dev) {
        deviceCache.invalidate(dev.getId());
    }

    public void clear() {
        deviceCache.invalidateAll();
    }

    public List<Alert> getAll(){
        return deviceCache.asMap().values().stream().collect(Collectors.toList());
    }

}