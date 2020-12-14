package com.kodilla.kodilla.patterns2.facade;

import com.kodilla.kodilla.patterns2.facade.api.OrderDto;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OrderFacadeWatcher {

    private final static Logger LOGGER = LoggerFactory.getLogger(OrderFacadeWatcher.class);

    @Before(value = "execution(* com.kodilla.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))"
            + "&& args(orderDto, userId) && target(object)", argNames = "orderDto,userId,object")
    public void logStartInfo(OrderDto orderDto, Long userId, Object object) {
        LOGGER.info("Start of processing orderDto: " + orderDto + " userID: " + userId);
    }

    @AfterReturning(value = "execution(* com.kodilla.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))"
            + "&& args(orderDto, userId) && target(object)", argNames = "orderDto,userId,object")
    public void logSuccess(OrderDto orderDto, Long userId, Object object) {
        LOGGER.info("Processing of order: " + orderDto + " userID: " + userId + " finished successful");
    }

    @AfterThrowing(value = "execution(* com.kodilla.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))"
            + "&& args(orderDto, userId) && target(object)", argNames = "orderDto,userId,object")
    public void logException(OrderDto orderDto, Long userId, Object object) {
        LOGGER.info("Exception by processing of order: " + orderDto + " userID: " + userId);
    }
}
