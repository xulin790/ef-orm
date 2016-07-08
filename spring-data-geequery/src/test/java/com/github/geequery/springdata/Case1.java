package com.github.geequery.springdata;

import java.sql.SQLException;
import java.util.Arrays;

import org.easyframe.enterprise.spring.CommonDao;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.github.geequery.springdata.test.entity.Foo;
import com.github.geequery.springdata.test.repo.FooDao;

/**
 * 与Spring集成的示例。
 * 本示例使用的xml作为Spring配置。参见 src/main/resources/spring/spring-test-case1.xml
 * 
 * @author jiyi
 *
 */
@ContextConfiguration(locations = { "classpath:spring-test-case1.xml" })
public class Case1 extends AbstractJUnit4SpringContextTests{
	
	@javax.annotation.Resource
	private CommonDao commonDao;
	
	@javax.annotation.Resource
	private FooDao foodao;
	
	@Test
	public void test2() throws SQLException{
	}
	
	@Test
	public void test1() throws SQLException{
		commonDao.getNoTransactionSession().dropTable(Foo.class);
		commonDao.getNoTransactionSession().createTable(Foo.class);
		{
			Foo foo=new Foo();
			foo.setName("Hello!");
			commonDao.extremeInsert(Arrays.asList(foo));	
		}
		{
			Foo foo=new Foo();
			foo.setAge(3);
			foo.setName("飞");
			//update MY_FOO set age=3 where name='Hello!'
			commonDao.updateByProperty(foo, "name");
		}
		{
			Foo foo=commonDao.loadByPrimaryKey(Foo.class, 1);
			System.out.println(foo.getName());
		}
		{
			//根据ID删除
			commonDao.removeByField(Foo.class, "id", 1);
		}
	}
}