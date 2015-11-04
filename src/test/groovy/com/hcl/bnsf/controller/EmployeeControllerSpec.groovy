package com.hcl.bnsf.controller

/**
import spock.lang.Specification

class HelloControllerSpec extends Specification{

   void "testing spock works"(){
	   expect:
	   true
   }

}
**/

import org.springframework.boot.SpringApplication
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.client.RestTemplate

import com.hcl.bnsf.domain.Employee
import com.hcl.bnsf.service.impl.EmployeeServiceImpl;

import spock.lang.Shared
import spock.lang.Specification
 
import java.util.concurrent.Callable
import java.util.concurrent.Executors
import java.util.concurrent.Future
import java.util.concurrent.TimeUnit
 
class EmployeeControllerSpec extends Specification {
 
	   EmployeeController ec = new EmployeeController();
	
	   def "add employee to roster should return Success"() {
		   given:
		   	Employee emp = new Employee("1", "123", "Neeraj", "12345", 123);
   
		   when:
		   	String addEmployeeToRoster = ec.addEmployeeToRoster(emp);
		 
		   then:
		   	addEmployeeToRoster == "Success"
	   }
}
