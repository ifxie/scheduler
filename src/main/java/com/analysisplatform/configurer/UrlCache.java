package com.analysisplatform.configurer;

import java.util.concurrent.TimeUnit;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;

/**
 * @功能描述 内存缓存
 */
@Configuration
public class UrlCache {
    @Bean
    public Cache<String, Integer> getCache() {
        /**缓存有效期为5秒*/
        return CacheBuilder.newBuilder().expireAfterWrite(5L, TimeUnit.SECONDS).build();
    }
}
