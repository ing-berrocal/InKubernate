/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.in.kubernate.demo;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

/**
 *
 * @author DELL
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
public class ApplicationInitializer 
  implements WebApplicationInitializer {
 
    @Override
    public void onStartup(ServletContext servletContext) 
      throws ServletException {
 
        AnnotationConfigWebApplicationContext context 
          = new AnnotationConfigWebApplicationContext();
 
        servletContext.addListener(new ContextLoaderListener(context));
        servletContext.setInitParameter(
          "contextConfigLocation", "com.in.kubernate");
    }
}
