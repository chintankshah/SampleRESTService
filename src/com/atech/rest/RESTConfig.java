package com.atech.rest;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;

public class RESTConfig extends Application
{
  public Set<Class<?>> getClasses()
  {
    Set classes = new HashSet();
    classes.add(RESTService.class);
    return classes;
  }
}