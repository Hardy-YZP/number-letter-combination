package org.example.handler;

import java.util.List;

/**
 * Description
 *
 * @title: AbstractNumberHandler
 * @Author: zhouping.yan
 * @Date: 2020/12/24 16:30
 * @Version 1.0
 */
public abstract class AbstractNumberHandler {


    /**
     * Handler Type
     *
     * @return type
     */
    public abstract String type();

    /**
     * letterCombinations
     * @param digits
     * @return
     */
    public abstract List<String> letterCombinations(String digits);
}
