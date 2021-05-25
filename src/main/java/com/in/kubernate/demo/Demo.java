/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.in.kubernate.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.springframework.stereotype.Service;

/**
 *
 * @author DELL
 */
@Service
@Path("/demo")
public class Demo {
    
    @GET
    public String hello(){
        return "Hello";
    }
    
    @Path("/host")
    @GET
    public String host() throws UnknownHostException{
        return InetAddress.getLocalHost().getHostName();
    }
}
