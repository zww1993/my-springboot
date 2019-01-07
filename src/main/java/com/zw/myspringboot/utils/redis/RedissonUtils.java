package com.zw.myspringboot.utils.redis;

import org.redisson.api.RAtomicLong;
import org.redisson.api.RBlockingQueue;
import org.redisson.api.RBucket;
import org.redisson.api.RCountDownLatch;
import org.redisson.api.RDeque;
import org.redisson.api.RList;
import org.redisson.api.RLock;
import org.redisson.api.RMap;
import org.redisson.api.RQueue;
import org.redisson.api.RSet;
import org.redisson.api.RSortedSet;
import org.redisson.api.RTopic;
import org.redisson.api.RedissonClient;
import org.redisson.client.codec.Codec;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class RedissonUtils {

    @Resource
    private RedissonClient redissonClient;

    public RedissonUtils() {
    }

    public <T> RBucket<T> getRBucket(String objectName) {
        RBucket<T> bucket = this.redissonClient.getBucket(objectName);
        return bucket;
    }

    public <T> RBucket<T> getRBucket(String objectName, Codec codec) {
        RBucket<T> bucket = this.redissonClient.getBucket(objectName, codec);
        return bucket;
    }

    public <K, V> RMap<K, V> getRMap(String objectName) {
        RMap<K, V> map = this.redissonClient.getMap(objectName);
        return map;
    }

    public <V> RSortedSet<V> getRSortedSet(String objectName) {
        RSortedSet<V> sortedSet = this.redissonClient.getSortedSet(objectName);
        return sortedSet;
    }

    public <V> RSet<V> getRSet(String objectName) {
        RSet<V> rSet = this.redissonClient.getSet(objectName);
        return rSet;
    }

    public <V> RList<V> getRList(String objectName) {
        RList<V> rList = this.redissonClient.getList(objectName);
        return rList;
    }

    public <V> RQueue<V> getRQueue(String objectName) {
        RQueue<V> rQueue = this.redissonClient.getQueue(objectName);
        return rQueue;
    }

    public <V> RDeque<V> getRDeque(String objectName) {
        RDeque<V> rDeque = this.redissonClient.getDeque(objectName);
        return rDeque;
    }

    public <V> RBlockingQueue<V> getRBlockingQueue(String objectName) {
        RBlockingQueue rb = this.redissonClient.getBlockingQueue(objectName);
        return rb;
    }

    public RLock getRLock(String objectName) {
        RLock rLock = this.redissonClient.getLock(objectName);
        return rLock;
    }

    public RAtomicLong getRAtomicLong(String objectName) {
        RAtomicLong rAtomicLong = this.redissonClient.getAtomicLong(objectName);
        return rAtomicLong;
    }

    public RCountDownLatch getRCountDownLatch(String objectName) {
        RCountDownLatch rCountDownLatch = this.redissonClient.getCountDownLatch(objectName);
        return rCountDownLatch;
    }

    public <M> RTopic<M> getRTopic(String objectName) {
        RTopic<M> rTopic = this.redissonClient.getTopic(objectName);
        return rTopic;
    }
}
