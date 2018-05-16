package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {

        List list = new ArrayList();
        List list1 = new ArrayList();
        List list2 = new ArrayList();
        for (int i = 0; i < 10 ; i++){
            list1.add(i);
            if (i%2==0){
                list2.add(i);
            }
        }
        System.err.println("list1:"+list1);
        System.err.println("list2:"+list2);
        list1.removeAll(list2);
        list2.addAll(list1);
        list.addAll(list2);
        System.err.println("list:"+list);
    }

    public void mockTest() {
    }
}
