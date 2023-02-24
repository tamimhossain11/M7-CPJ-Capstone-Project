
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.mvc.dao.ApplicationDAO;
import com.spring.mvc.model.User;
import com.spring.mvc.service.UserService;
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/spring-servlet.xml")
public class Login {
	  @Autowired
	    private UserService userService;
	    
	       @Autowired
	       private ApplicationDAO applicationDAO;
	       
	       @Test
	       public void loginTest() {
	           User user=new User();
	           user.setEmail("abu053125@gmail.com");
	           user.setPassword("676765");
	           userService.loginUser(user);
	           String m=user.getPassword();
	           String n="676765";
	           assertEquals(m,n);
	           
	       }
}
