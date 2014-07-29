package ru.malik.tes.testJSP.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ru.malik.tes.testJSP.dao.EnterpriseDAO;
import ru.malik.tes.testJSP.domain.Enterprise;

@Transactional
@Service
public class EnterpriseServiceImpl implements EnterpriseService {

	@Autowired
	private EnterpriseDAO enterpriseDAO;

	@Transactional
	@Override
	public void addEnterprise(Enterprise enterprise) {
		enterpriseDAO.addEnterprise(enterprise);
	}

	@Transactional
	@Override
	public void removeEnterprise(Enterprise enterprise) {
		enterpriseDAO.removeEnterprise(enterprise);
	}

	@Transactional
	@Override
	public void saveEnteprise(Enterprise enterprise) {
		enterpriseDAO.saveEnteprise(enterprise);
	}

	@Transactional
	@Override
	public Enterprise getEnterpriseById(long id) {
		return enterpriseDAO.getEnterpriseById(id);
	}

	@Transactional(propagation=Propagation.REQUIRED, readOnly = false)
	@Override
	public List<Enterprise> getAllEnterprise() {
		return enterpriseDAO.getAllEnterprise();
	}

}
