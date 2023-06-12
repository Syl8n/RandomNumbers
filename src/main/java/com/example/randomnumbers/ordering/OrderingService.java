package com.example.randomnumbers.ordering;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderingService {
    public Map<Integer, String> ordering(){
        List<String> names = List.of("서진우", "변지혜", "이유민");
        List<Integer> pool = generateRandomNumberPool(1, names.size());
        Map<Integer, String> order = new HashMap<>();

        for(String name : names){
            order.put(getRandomIntFromPool(pool), name);
        }

        return order;
    }

    private List<Integer> generateRandomNumberPool(int min, int max){
        List<Integer> pool = new LinkedList<>();
        for(int i = min; i <= max; i++){
            pool.add(i);
        }
        return pool;
    }

    private int getRandomIntFromPool(List<Integer> pool){
        return pool.remove((int)(Math.random() * pool.size()));
    }
}
