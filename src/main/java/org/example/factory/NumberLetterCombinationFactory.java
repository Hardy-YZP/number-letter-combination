package org.example.factory;

import org.example.handler.AbstractNumberHandler;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description
 *
 * @title: NumberLetterCombinationFactory
 * @Author: zhouping.yan
 * @Date: 2020/12/24 15:55
 * @Version 1.0
 */
@Component
public class NumberLetterCombinationFactory {
    private final Map<String, AbstractNumberHandler> numberHandlerMap = new HashMap<>();

    public NumberLetterCombinationFactory(List<AbstractNumberHandler> list) {
        list.forEach(handler -> numberHandlerMap.put(handler.type(), handler));
    }


    public AbstractNumberHandler getHandler(String type) {
        return numberHandlerMap.get(type);
    }
}
