package com.vatsal.SystemDesign.LowLevelDesign.DesignPattern.Singleton.QueryCacheSystem.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("singletondemo")
@Component
public class QueryCacheClientSpring implements CommandLineRunner {
	
	@Autowired
	private QueryCacheSpring cache;

	@Override
	public void run(String... args) throws Exception {
		cache.put("user_101", "User 101 Data");
        cache.put("user_102", "User 102 Data");

        System.out.println("All cached entries:");
        cache.printAll();

        System.out.println("Get user_101: " + cache.get("user_101"));
        System.out.println("Contains user_102? " + cache.contains("user_102"));
	}

}
