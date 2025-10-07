package com.vatsal.SystemDesign.LowLevelDesign.DesignPattern.Singleton.QueryCacheSystem;

public class QueryCacheClient {

	public static void main(String[] args) {
		QueryCache cache1 = QueryCache.getInstance();
		QueryCache cache2 = QueryCache.getInstance();
		System.out.println("Are They the same instance ? " + (cache1 == cache2));// Should be true

		cache1.put("user_101", "User 101 Cached Data");
		cache1.put("user_102", "User 102 Cached Data");

		System.out.println("Contains user_101? " + cache2.contains("user_101"));
		System.out.println("Get user_102: " + cache2.get("user_102"));

		// Instead of using main inside CacheSingletonMemoryCheck
		CacheSingletonMemoryCheck check = new CacheSingletonMemoryCheck();
		check.printCacheContents();

	}
//	In industry, singletons are mostly about sharing data inside the same running application, not across separate programs
//	Singleton Design Pattern – Quick Notes
//
//	Definition:
//	Ensures a class has only one instance and provides a global point of access.
//
//	Key Features
//
//	Single instance: Only one object exists in JVM (per classloader).
//
//	Global access: Accessible from anywhere via getInstance().
//
//	Lazy / eager instantiation: Can create instance on demand (lazy) or at class load (eager).
//
//	Thread-safe: Use synchronized or double-checked locking to avoid race conditions.
//
//	Structure
//
//	Private constructor → prevents external instantiation.
//
//	Private static instance → holds single object.
//
//	Public static getInstance() → returns the singleton instance.
//	Usage in Industry
//
//	Caching: Query results, configuration, in-memory data (QueryCache).
//
//	Logging / Monitoring: Single global logger or tracker.
//
//	Service clients: e.g., DB connection pool manager.
//
//	Spring Boot:
//
//	@Component @Scope("singleton") → Spring-managed singleton bean.
//
//	Accessible globally across services/controllers.
//
//	@SessionScope → per-user/session singleton.
//
//	@RequestScope → per-request object.
}
