package org.ahlem.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Groupe implements Serializable {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codeGroupe;
private String nomGroupe;
@ManyToMany(mappedBy="groupe")
private Collection<Employee> employees;
public Long getCodeGroupe() {
	return codeGroupe;
}
public void setCodeGroupe(Long codeGroupe) {
	this.codeGroupe = codeGroupe;
}
public String getNomGroupe() {
	return nomGroupe;
}
public void setNomGroupe(String nomGroupe) {
	this.nomGroupe = nomGroupe;
}
public Collection<Employee> getEmployees() {
	return employees;
}
public void setEmployees(Collection<Employee> employees) {
	this.employees = employees;
}
public Groupe() {
	super();
	// TODO Auto-generated constructor stub
}
public Groupe(Long codeGroupe, String nomGroupe, Collection<Employee> employees) {
	super();
	this.codeGroupe = codeGroupe;
	this.nomGroupe = nomGroupe;
	this.employees = employees;
}

}
