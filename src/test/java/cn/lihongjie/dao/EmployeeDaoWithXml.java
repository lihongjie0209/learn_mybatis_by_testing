package cn.lihongjie.dao;

import cn.lihongjie.entity.EmployeeEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author 982264618@qq.com
 */
public interface EmployeeDaoWithXml {


	public EmployeeEntity get(long id);
	public void insert(EmployeeEntity entity);
	public void delete(long id);
	public int count();
	public EmployeeEntity update(EmployeeEntity entity);





}
