package com.benoitrion.customerregistration.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IPTrackerInterceptor extends HandlerInterceptorAdapter {

    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler)
            throws Exception {
        return true;
    }

    public void postHandle(
            HttpServletRequest request, HttpServletResponse response,
            Object handler, ModelAndView modelAndView)
            throws Exception {
        String ipAddress = request.getRemoteAddr();

        modelAndView.getModel().put("clientIpAddress", ipAddress);

    }
}
