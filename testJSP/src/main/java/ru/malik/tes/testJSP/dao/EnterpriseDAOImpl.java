package ru.malik.tes.testJSP.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ru.malik.tes.testJSP.domain.Enterprise;

@Repository
public class EnterpriseDAOImpl implements EnterpriseDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void addEnterprise(Enterprise enterprise) {
		getCurrentSession().save(enterprise);
	}

	@Override
	public void removeEnterprise(Enterprise enterprise) {
		getCurrentSession().delete(enterprise);
	}

	@Override
	public void saveEnteprise(Enterprise enterprise) {
		getCurrentSession().update(enterprise);
	}

	@Override
	public List<Enterprise> getAllEnterprise() {
		return getCurrentSession().createCriteria(Enterprise.class).list();
	}

	@Override
	public Enterprise getEnterpriseById(long id) {
		return (Enterprise) getCurrentSession().get(Enterprise.class, id);
	}

}
