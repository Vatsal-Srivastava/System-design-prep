package com.vatsal.SystemDesign.LowLevelDesign.DesignPattern.Singleton.QueryCacheSystem.springboot;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Component;

@Component
public class QueryCacheSpring {
	 private Map<String, Object> cache = new ConcurrentHashMap<>();

	    public void put(String key, Object obj) {
	        cache.put(key, obj);
	    }

	    public Object get(String key) {
	        return cache.get(key);
	    }

	    public boolean contains(String key) {
	        return cache.containsKey(key);
	    }

	    public void clear() {
	        cache.clear();
	    }

	    public void printAll() {
	        cache.forEach((k, v) -> System.out.println(k + " -> " + v));
	    }
}
