import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.mvc.dao.ApplicationDAO;
import com.spring.mvc.model.User;
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/spring-servlet.xml")
public class Search {
	 @Autowired
	    private HibernateTemplate hibernateTemplate;
	    
	       @Autowired
	       private ApplicationDAO applicationDAO;
	       @Test
	       public void searchuser() {
	           User user=new User();
	           user.setName("ahmed");
	           user.setEmail("rayhan67@gmail.com");
	           user.setPassword("676767");
	           user.setId((long) 7);
	           user.setCity("Dhaka");
	           user.setContact("018976545");
	           applicationDAO.display();
	           String m=user.getName();
	           String n="abu";
	           assertEquals(m, n);
	       }
}
