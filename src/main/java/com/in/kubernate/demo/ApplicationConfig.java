/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.in.kubernate.demo;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 *
 * @author Daniel
 */
@Component
@javax.ws.rs.ApplicationPath("/resources")
public class ApplicationConfig extends ResourceConfig 
{
    public ApplicationConfig() 
    {
        register(Demo.class);
    }
}