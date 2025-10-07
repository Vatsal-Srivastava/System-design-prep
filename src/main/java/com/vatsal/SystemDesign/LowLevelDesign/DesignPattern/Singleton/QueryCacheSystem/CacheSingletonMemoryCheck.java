package com.vatsal.SystemDesign.LowLevelDesign.DesignPattern.Singleton.QueryCacheSystem;


public class CacheSingletonMemoryCheck {
	//if we would have used main here it would have changes JVM to new memory and we could not have seen the cache

	public void printCacheContents() {
        QueryCache cache3 = QueryCache.getInstance();
        cache3.printAll(); // prints all key-value pairs
    }

}
