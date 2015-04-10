package com.demo.mock.two;

import java.util.Hashtable;

/**
 注释1：addAccount方法用了一个实例变量来作返回值。因为你有许多account对象需要返回，我们用一个hashtable来装载他们。
 	这样可以使mock具有一般性而且支持不同的测试案例：某些测试只建立一个account对象，某些测试可能建立多个account对象。
注释2：addAccount告诉findAccountForUser方法返回什么参数。
注释3：updateAccount更新了一个account但是没有任何的返回值。因此你什么都可以不做。但他被transfer调用的时候，只要被正确更新，他将什么都不用作。
 */
public class MockAccountManager implements AccountManager {
	private Hashtable accounts = new Hashtable();

	public void addAccount(String userId, Account account) {
		this.accounts.put(userId, account);
		// 见注释1
	}

	public Account findAccountForUser(String userId) {
		return (Account) this.accounts.get(userId);
		// 见注释2
	}

	public void updateAccount(Account account) {
		// do nothing
		// 见注释3
	}

}