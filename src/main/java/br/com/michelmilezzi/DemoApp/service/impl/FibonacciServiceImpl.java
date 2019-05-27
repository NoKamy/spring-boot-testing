package br.com.michelmilezzi.DemoApp.service.impl;

import org.springframework.stereotype.Service;

import br.com.michelmilezzi.DemoApp.service.FibonacciService;

@Service
public class FibonacciServiceImpl implements FibonacciService{

    @Override
    public Long calculateFibonacci(int targeto) {
        Long ret = 0L;
        for (int i = 0; i <= targeto; i++) {
          ret = calculateSectionOfFibonacci(i);
          System.out.println(ret);
        }
        return ret;
    }
    
    private Long calculateSectionOfFibonacci(int target) {
        if(target <= 1) {
            return Long.valueOf(target);
        }
        return calculateSectionOfFibonacci(target-1) + calculateSectionOfFibonacci(target-2);
    }
}
