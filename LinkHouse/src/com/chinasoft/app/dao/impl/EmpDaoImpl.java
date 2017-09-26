package com.chinasoft.app.dao.impl;

import java.sql.SQLException;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import com.chinasoft.app.dao.EmpDao;
import com.chinasoft.app.domain.Emp;


public class EmpDaoImpl extends HibernateDaoSupport implements EmpDao{

	@Override
	public List<Emp> listPage(final String q, final int currentPage, final int pageSize) {
		List list = this.getHibernateTemplate().executeFind(new HibernateCallback(){
			@Override
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createQuery(q);
				query.setMaxResults(pageSize);
				query.setFirstResult((currentPage-1)*pageSize);
				return query.list();
			}
		});
		return list;
	}
}




