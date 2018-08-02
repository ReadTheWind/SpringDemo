import com.sm.dao.UserDao;
import com.sm.entity.User;
import com.sm.service.UserServcie;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Test 测试类
 */
public class SmTest {


	@BeforeClass
	public static void before(){
	}

	/**
	 * 测试spring + mybatis查询
	 */
	@Test
	public void testGetAll() {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		UserServcie userServcie=ctx.getBean(UserServcie.class);
		List<User> users=userServcie.getAll();
		for (int i = 0; i <users.size() ; i++) {
			System.out.print(users.get(i).toString());
		}
	}

}
