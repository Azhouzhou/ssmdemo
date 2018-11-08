/**
 *  .
 * All Rights Reserved
 */
package com.ssmdemo.dao;
import java.util.Map;
import java.util.Collection;
import java.util.List;

import com.ssmdemo.model.User;
import org.springframework.stereotype.Repository;



/**
 * @author zhouzhou
 * @date   2018年11月06日上午11:35:30
 */
@Repository
public interface UserMapper {
	
	 int insert(User model);
	
	 int update(User model);
	
	 int delete(Number id);
	
	 User selectById(Number id);
	
	 int selectCountByConditions(User model);
	
	 Collection<User> selectByConditions(User model);
	
	 int selectCountByMap(Map<String, Object> paramsMap);
	
	 Collection<User> selectByMap(Map<String, Object> paramsMap);
	 
}
