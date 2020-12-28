package org.test;

import org.example.LetterCombinationApp;
import org.example.conts.AppConstant;
import org.example.factory.NumberLetterCombinationFactory;
import org.example.handler.AbstractNumberHandler;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Description
 *
 * @title: NumberLetterCombinationTest
 * @Author: zhouping.yan
 * @Date: 2020/12/24 17:03
 * @Version 1.0
 */
@SpringBootTest(classes = LetterCombinationApp.class)
@RunWith(SpringRunner.class)
public class NumberLetterCombinationTest {

    @Autowired
    private NumberLetterCombinationFactory combinationFactory;


    @Test
    public void testLetterCombinations() {
        // Get the default processor
        AbstractNumberHandler handler = combinationFactory.getHandler(AppConstant.DEFAULT);
        // To get the results
        List<String> list = handler.letterCombinations("12");
        System.out.println("RESULT = " + list);
    }
}
