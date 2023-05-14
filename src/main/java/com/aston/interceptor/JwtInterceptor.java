package com.aston.interceptor;

import com.aston.annotation.JwtIgnore;
import com.aston.core.ServiceException;
import io.jsonwebtoken.Claims;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.util.StringUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JwtInterceptor implements HandlerInterceptor {

    private final Logger logger = LoggerFactory.getLogger(JwtInterceptor.class);
    @Autowired
    private JwtParam jwtParam;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler){

        /**忽略带JwtIgnore注解的请求, 不做后续token认证校验*/
        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            JwtIgnore jwtIgnore = handlerMethod.getMethodAnnotation(JwtIgnore.class);
            if (jwtIgnore != null) {
                return true;
            }
        }

        if (HttpMethod.OPTIONS.equals(request.getMethod())) {
            response.setStatus(HttpServletResponse.SC_OK);
            return true;
        }

        final String authHeader = request.getHeader(JwtConstant.AUTH_HEADER_KEY);
        if (StringUtils.isEmpty(authHeader)) {
            logger.info("=====用户未登录=====");
            throw new ServiceException("用户未登录, 请先登录");
        }

        // 校验头格式校验
        if (!JwtUtils.validate(authHeader)) {
            logger.info("===== token格式异常 =====");
            throw new ServiceException("token格式异常");
        }

        // token解析
        final String authToken = JwtUtils.getRawToken(authHeader);
        Claims claims = JwtUtils.parseToken(authToken, jwtParam.getBase64Secret());
        if (claims == null) {
            logger.info("===== token解析异常 =====");
            throw new ServiceException("token解析异常");
        }

        // 传递所需信息
        request.setAttribute("CLAIMS", claims);

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
