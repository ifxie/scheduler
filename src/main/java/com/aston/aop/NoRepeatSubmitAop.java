package com.aston.aop;

import javax.servlet.http.HttpServletRequest;

import com.aston.annotation.NoRepeatSubmit;
import com.aston.core.ServiceException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import com.google.common.cache.Cache;
/**
 * @功能描述 aop解析注解
 * @author www.gaozz.club
 * @date 2018-08-26
 */
@Aspect
@Component
public class NoRepeatSubmitAop {

    @Autowired
    private Cache<String, Integer> cache;

    @Around("execution(* add*(..)) && @annotation(nrs)")
    public Object around(ProceedingJoinPoint pjp, NoRepeatSubmit nrs) {
            ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            String sessionId = RequestContextHolder.getRequestAttributes().getSessionId();
            HttpServletRequest request = attributes.getRequest();

            String key = sessionId + "-" + request.getServletPath();
            /**如果缓存中有这个url视为重复提交*/
            if (cache.getIfPresent(key) == null) {
                try{
                    Object o = pjp.proceed();
                    cache.put(key, 0);
                    return o;
                }catch (Throwable e)
                {
                    System.out.println("really reason"+e.getMessage());
                    throw new ServiceException("系统内部错误或数据不合法");
                }
            } else {
                throw new ServiceException("重复提交");
            }

    }

}
