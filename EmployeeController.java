import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeemanagement.Entity.Employee;
import com.employeemanagement.Service.EmployeeService;


@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@PostMapping
	public Employee createEmployees(@RequestBody Employee emp){
		 return service.saveEmployee(emp);
	}
		
      @GetMapping
	  public List<Employee> getAllEmployee(){
		  return service.getAllEmployees();
	  }
     
	@GetMapping("/{id}")
      public Employee getEmployeeById(@PathVariable Long id){
    	  return service.findByID(id);
      }
	
	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		service.deleteEmployee(id);
		return "Employee deleted through id" ;
	}
	
}
	    


