import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/spring-servlet.xml")
public class Testad {
	@Autowired
	private Admin admin;
	@Test
	public void admin() {
		Admin admin=new Admin();
		admin.adminCheck();
	}

}
