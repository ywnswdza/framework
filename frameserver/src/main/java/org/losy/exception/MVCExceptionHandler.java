package org.losy.exception;

import org.losy.common.utils.LoggerSupport;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2014/12/3.
 */
public class MVCExceptionHandler implements HandlerExceptionResolver,LoggerSupport {

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        logger.error(httpServletRequest.getRequestURI() + " has error !",e);
        return null;
    }
}
