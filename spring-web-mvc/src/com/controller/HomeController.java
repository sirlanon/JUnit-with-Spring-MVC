package com.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class HomeController {
	protected final Log logger = org.apache.commons.logging.LogFactory.getLog(getClass());
	@RequestMapping(value="/welcome")
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp)
										throws ServletException, IOException {
		
		String now = (new Date()).toString();
        logger.info("Returning hello view with " + now);

        return new ModelAndView("welcome", "now", now);
	}
}
