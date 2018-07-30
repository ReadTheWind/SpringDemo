

import com.sm.dao.UserDao;
import com.sm.entity.User;
import com.sm.service.UserServcie;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SmTest {

	static  UserServcie userServcie;

	@BeforeClass
	public static void before(){
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//		userServcie=ctx.getBean(UserServcie.class);
	}

	@Test
	public void testGetAllBooks() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//		userServcie=ctx.getBean(UserServcie.class);
		UserDao userDao=ctx.getBean(UserDao.class);
		List<User> users=userDao.getAll();
		for (int i = 0; i <users.size() ; i++) {
			System.out.print(users.get(i).toString());
		}
	}

}
