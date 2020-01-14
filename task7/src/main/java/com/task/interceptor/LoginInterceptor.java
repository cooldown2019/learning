package com.task.interceptor;


import com.task.utils.JwtUtil;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class LoginInterceptor extends HandlerInterceptorAdapter {
    private JwtUtil jwtUtil = new JwtUtil();

    // 在业务处理器处理请求之前被调用
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String token = null;
        for (Cookie cookie : request.getCookies()) {
            if (cookie.getName().equals("token")) {
                token = cookie.getValue();
            }
        }
        Map<String, Object> map = jwtUtil.parseToken(token);
        String username = (String) map.get("username");
        String message = (String) map.get("ERR_MSG");
        if (message != null) {
            request.setAttribute("msg", message);
            request.getRequestDispatcher("/toLogin").forward(request, response);
        }
        if (username == null) {
            // 跳转到登录页面
            request.setAttribute("msg", message);
            request.getRequestDispatcher("/toLogin").forward(request, response);
            return false;
        } else {
            return true;
        }
    }

    // 在业务处理器处理请求完成之后，生成视图之前执行
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    // 在DispatcherServlet完全处理完请求之后被调用，可用于清理资源
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }
}
