package cn.lihongjie;

import cn.lihongjie.dao.EmployeeDao;
import cn.lihongjie.dao.EmployeeDaoWithXml;
import cn.lihongjie.entity.EmployeeEntity;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.hamcrest.core.Is;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

import static org.apache.log4j.Logger.getLogger;

/**
 * @author 982264618@qq.com
 */
public class MyBatisTest {


	private static final Logger logger = getLogger(MyBatisTest.class);
	private SqlSessionFactory sqlSessionFactory;

	/**
	 * 创建sql session 工厂
	 *
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {

		InputStream inputStream = getClass().getClassLoader().getResourceAsStream
				("mybatis.xml");
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);


	}

	@After
	public void tearDown() throws Exception {

	}

	@Test
	public void testOpenSession() throws Exception {


		SqlSession sqlSession = sqlSessionFactory.openSession();

		sqlSession.close();

	}


	@Test
	public void testAnnotationMapper() throws Exception {


		SqlSession sqlSession = sqlSessionFactory.openSession();

		EmployeeDao mapper = sqlSession.getMapper(EmployeeDao.class);
		EmployeeEntity employeeEntity = mapper.get(1L);

		sqlSession.close();

		Assert.assertNull(employeeEntity);

	}


	@Test
	public void testCURD() throws Exception {

		EmployeeEntity entity = new EmployeeEntity();
		entity.setLastName("测试");
		entity.setEmail("11@qq.com");
		entity.setGender("1");


		SqlSession sqlSession = sqlSessionFactory.openSession();

		EmployeeDaoWithXml mapper = sqlSession.getMapper(EmployeeDaoWithXml.class);


		mapper.insert(entity);

		Assert.assertThat(mapper.count(), Is.is(1));

		sqlSession.commit();
		sqlSession.close();


	}
}
