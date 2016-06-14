package com.test;  
  
import javax.jws.WebService;  
import javax.jws.WebParam;  
import javax.jws.WebMethod;  
  
@WebService  
public interface IcxfWB {  
    @WebMethod  
    String sayHello(@WebParam(name="name") String name);  
} 