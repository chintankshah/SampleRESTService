package com.atech.rest;

import java.util.logging.Logger;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/test")
public class RESTService
{
  public static Logger logger = Logger.getLogger(RESTService.class.getName());
  String xlsType = "application/vnd.ms-excel";

  @GET
  public String get() {
    logger.info("Get called..!!");
    return "Hello World";
  }
}