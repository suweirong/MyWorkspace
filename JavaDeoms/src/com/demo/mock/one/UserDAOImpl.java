package com.demo.mock.one;

/**
 * 这个是要进行mock的类。
 * @author stevensu
 *
 */
public class UserDAOImpl implements UserDAO {
	public String getUserByName(String username) {
		return username;
	}
}
