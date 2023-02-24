import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.mvc.model.User;
import com.spring.mvc.service.AdminService;
import com.spring.mvc.service.UserService;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/spring-servlet.xml")
public class Admin {
	@Autowired
	private AdminService adminService;
	@Autowired
	private UserService userService;
	@Test
	public void adminCheck() {
	User user=new User();
user.setEmail("inhumanofo2@gmail.com");
userService.checkMail(user);
String m=user.getEmail();
String n="rayhan@gmail.com";
assertNotEquals(m, n);
	
		
	}

}
