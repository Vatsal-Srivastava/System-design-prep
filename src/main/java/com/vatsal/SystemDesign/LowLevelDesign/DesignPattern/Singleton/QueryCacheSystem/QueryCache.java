package com.vatsal.SystemDesign.LowLevelDesign.DesignPattern.Singleton.QueryCacheSystem;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class QueryCache {
	private static volatile QueryCache instance; // volatile is key for double-checked locking
	private Map<String, Object> cache = new ConcurrentHashMap<>();

	private QueryCache() {
	}

	public static QueryCache getInstance() {
		if (instance == null) { // first check avoids synchronization overhead
			synchronized (QueryCache.class) { // lock only if instance is null
				if (instance == null) { 
//					Needed in multi-threaded scenarios. Imagine two threads check instance == null at the same time:
//
//						Thread A enters synchronized block first and creates the instance.
//
//						Thread B now enters synchronized block after Thread A finishes. Without the second check, Thread B would create a second instance, breaking the singleton guarantee.
					instance = new QueryCache();
				}
			}
		}
		return instance;
	}

	public Object get(String key) {
		return cache.get(key);
	}

	public void put(String key, Object obj) {
		cache.put(key, obj);
	}

	public boolean contains(String key) {
		return cache.containsKey(key);
	}

	public void clear() {
		cache.clear();
	}
	
	public void printAll() {
	    cache.forEach((key, value) -> {
	        System.out.println("Key: " + key + ", Value: " + value);
	    });
	}
}
