package com.pptware.repomaster.repoadmin;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.pptware.repomaster.repoadmin.domain.RepoAdminUser;

@Component
public class CertificationInterceptor extends HandlerInterceptorAdapter {

	private static final Logger logger = LoggerFactory.getLogger(CertificationInterceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {

		HttpSession session = request.getSession();
		RepoAdminUser loginVO = (RepoAdminUser) session.getAttribute("loginUser");

		try {
			if (ObjectUtils.isEmpty(loginVO)) {

				//logger.debug("preHandle session empty.");

				if (excludeUrl(request)) {

//					logger.debug("======= call /CertificationInterceptor url is no session check =======");

					return true;

				} else {

					response.sendRedirect("/login");
					return false;

				}
				
			} else {
				session.setMaxInactiveInterval(60 * 60);
				return true;
			}
		} catch (IOException ioe) {

		}
		return true;

	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) {
//		logger.info("================ Method Executed");
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
//		logger.info("================ Method Completed");
	}

	private boolean excludeUrl(HttpServletRequest request) {

		String uri = request.getRequestURI().toString().trim();

//		logger.debug("======= call /CertificationInterceptor request Url = " + uri + "=======");

		if (uri.indexOf("Login") > -1 || uri.indexOf("login") > -1 || uri.indexOf("logout") > -1 || uri.indexOf("resources") > -1) {
			return true;
		} else
			return false;
	}

	private boolean isAjaxRequest(HttpServletRequest req) {

		String ajaxHeader = "AJAX";

		logger.debug("======= call /CertificationInterceptor req.getHeader(ajaxHeader) : " + req.getHeader(ajaxHeader)
				+ "=======");

		return req.getHeader(ajaxHeader) != null && req.getHeader(ajaxHeader).equals(Boolean.TRUE.toString());

	}

}