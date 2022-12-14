package com.yash.OopsTask8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

public class Test 
{
  public static final Logger logger = Logger.getLogger(Test.class.getName());
	
  public static void main(String[] args) throws ParseException
  {
   String dateOfManufacturing="31/08/2021";
   Date mfd = new SimpleDateFormat("dd/mm/yyyy").parse(dateOfManufacturing);
   
   Electornics e1= new Mobile(222,"mobile semiconductor", mfd);
   logger.info("\n ID of Mobile = "+e1.getId()+" "+"\n Type of mobile semiconductor = "+ e1.getSemiconductorType()+" "+"\n Date of Mobile Manu = "+e1.getDateOfManufacturing());
   
   Electornics e2 = new LCD(333,"LCD Semiconductor", mfd);
   logger.info("\n ID of LCD = "+e2.getId()+" "+"\n Type of LCD semiconductor = "+ e2.getSemiconductorType()+" "+"\n Date of LCD Manu = "+e2.getDateOfManufacturing());
   
   Electornics e3 = new Laptop(111,"Laptop Semiconductor", mfd);
   logger.info("\n ID of Laptop = "+e3.getId()+" "+"\n Type of Laptop semiconductor = "+ e3.getSemiconductorType()+" "+"\n Date of Laptop Manu = "+e3.getDateOfManufacturing());
   
  }
}
