package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;

public class AppTest {
	
   String message = "Hello World";	
   App messageUtil = new App(message);

   @Test
   public void testPrintMessage() {
      assertEquals(message,App.printMessage());
   }
}
