package com.annotation.practiceproblem.advanced.cacheresult;

class ExpensiveService {
    @CacheResult
    public int computeSquare(int number) {
        String key = "square_" + number;
        Object cachedResult = CacheManager.getCachedResult(key);
        if (cachedResult != null) {
            System.out.println("Returning cached result for " + number);
            return (int) cachedResult;
        }
        System.out.println("Computing square for " + number);
        int result = number * number;
        CacheManager.putCachedResult(key, result);
        return result;
    }
}
