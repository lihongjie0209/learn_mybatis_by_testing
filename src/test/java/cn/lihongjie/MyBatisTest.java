package cn.lihongjie;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;

/**
 * @author 982264618@qq.com
 */
public class MyBatisTest {


	private SqlSessionFactory sqlSessionFactory;

	/**
	 * 创建sql session 工厂
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

		// sql id
		// sql param
//		sqlSession.selectOne()


	}
}
