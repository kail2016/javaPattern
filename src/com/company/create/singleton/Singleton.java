package com.company.create.singleton;

/**
 * Created by zhouhui on 2018/2/23.
 */
public class Singleton {
	private volatile static  Singleton singleton;
	private Singleton(){}
	public static Singleton getSingleton(){
		if(singleton == null){
			synchronized (Singleton.class){
				if(singleton == null){
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}

	public void say(){
		System.out.println("--------双检锁/双重校验锁（DCL，即 double-checked locking）--------");
	}
}
