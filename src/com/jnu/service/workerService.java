package com.jnu.service;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.List;

import com.jnu.dao.workShowDao;
import com.jnu.pojo.worker;

public class workerService {
	public List<worker> workerShow() {
		workShowDao dao = new workShowDao();
		return dao.workerShow();
	}
}
