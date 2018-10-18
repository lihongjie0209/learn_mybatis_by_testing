package cn.lihongjie.dao;

import cn.lihongjie.entity.EmployeeEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author 982264618@qq.com
 */
public interface EmployeeDao {


	@Select("SELECT * FROM employee WHERE id = #{id}")
	public EmployeeEntity get(@Param("id") long id);

}
