package com.task.Service;

public interface Iservice<T> {

	T saveTask(T entity);
	void upadateTask(T entity);


	void deletetask(int id);

}
