package tn.esprit.configuration;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import tn.esprit.services.StockServiceImpl;

@Component
@Aspect
@Slf4j
public class LoggingAspect {

}
