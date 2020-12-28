package org.example.handler;

import org.example.conts.AppConstant;
import org.example.enums.AlphabetEnum;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Description
 *
 * @title: DefaultNumberHandler
 * @Author: zhouping.yan
 * @Date: 2020/12/24 16:40
 * @Version 1.0
 */
@Component
public class DefaultNumberHandler extends AbstractNumberHandler {

    @Override
    public String type() {
        return AppConstant.DEFAULT;
    }

    @Override
    public List<String> letterCombinations(String digits) {
        // result set
        List<String> result = new LinkedList<>();
        if (digits.length() == 0) {
            return result;
        }
        // queue
        Queue<StringBuilder> queue = new LinkedList<>();
        // Start by adding a new empty string to the queue
        queue.add(new StringBuilder());
        // Loop through all input numbers
        for (int i = 0; i < digits.length(); ++i) {
            // Record the number of elements before each exit
            int limitSize = queue.size();
            // If the number is 0 or 1, because there is no corresponding letter, skip it
            if (digits.charAt(i) == '0' || digits.charAt(i) == '1') {
                continue;
            }
            int tar = digits.charAt(i) - '0';
            // Used to take elements in the queue out of the queue
            int j = 0;
            // Loop J takes the limitsize elements out of the queue
            while (!queue.isEmpty() && j < limitSize) {
                // Take the first stringBuilder out of the queue at a time
                StringBuilder stringBuilder1 = queue.poll();
                // Iterate over the letters corresponding to each number and add them in turn to the queue
                for (char x : AlphabetEnum.getEn(tar).toCharArray()) {
                    // Get the stringBuilder for each pair of columns and append the following letter to the end
                    StringBuilder tmp = new StringBuilder(stringBuilder1);
                    tmp.append(x);
                    // Add the stringBuilder to the queue
                    queue.add(tmp);
                }
                ++j;
            }
        }
        while (!queue.isEmpty()) {
            // Add the strings from the queue to the result set in turn
            result.add(queue.poll().toString());
        }
        return result;
    }


}
