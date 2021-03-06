package ru.malik.tes.testJSP.domain;

import javax.validation.constraints.Size;

public class Enterprise {
	@Size(min=2, max=30) 
	private String name;
	private String code;
	private FormOfIncorporation formOfIncorporation;
	private Long id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public FormOfIncorporation getFormOfIncorporation() {
		return formOfIncorporation;
	}

	public void setFormOfIncorporation(FormOfIncorporation formOfIncorporation) {
		this.formOfIncorporation = formOfIncorporation;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
