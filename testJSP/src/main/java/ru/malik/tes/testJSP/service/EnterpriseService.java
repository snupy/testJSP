package ru.malik.tes.testJSP.service;

import java.util.List;

import ru.malik.tes.testJSP.domain.Enterprise;

public interface EnterpriseService {
	public void addEnterprise(Enterprise enterprise);

	public void removeEnterprise(Enterprise enterprise);

	public void saveEnteprise(Enterprise enterprise);

	public Enterprise getEnterpriseById(long id);
	
	public List<Enterprise> getAllEnterprise();
}
