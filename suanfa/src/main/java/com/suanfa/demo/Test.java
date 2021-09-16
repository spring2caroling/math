package com.suanfa.demo;

import java.rmi.Remote;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import sun.java2d.xr.MutableInteger;

/**
 * Description
 * Create by 汪迎春
 * Date 2021/6/19 2:11 下午
 */
public class Test implements Remote {
    public static void main(String[] args) {
        System.out.println("hhhhhhhhhhhhhh");


        Runtime.getRuntime().addShutdownHook(new Thread(
                () -> System.out.println("我清理了 系统关系需要关闭的资源")
        ));

        Thread.currentThread().setDaemon(true);
        
    }


}