package org.ahlem.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
@Entity
public class Employee implements Serializable {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codeEmployee;
private String nomEmployee;
@ManyToOne
@JoinColumn(name="code_emp_sup")
private Employee employeeSup;
@ManyToMany
@JoinTable(name="EMP_GR")
private Collection<Groupe> groupe;
public Long getCodeEmployee() {
	return codeEmployee;
}
public void setCodeEmployee(Long codeEmployee) {
	this.codeEmployee = codeEmployee;
}
public String getNomEmployee() {
	return nomEmployee;
}
public void setNomEmployee(String nomEmployee) {
	this.nomEmployee = nomEmployee;
}
public Employee getEmployeeSup() {
	return employeeSup;
}
public void setEmployeeSup(Employee employeeSup) {
	this.employeeSup = employeeSup;
}
public Collection<Groupe> getGroupe() {
	return groupe;
}
public void setGroupe(Collection<Groupe> groupe) {
	this.groupe = groupe;
}
public Employee(Long codeEmployee, String nomEmployee, Employee employeeSup, Collection<Groupe> groupe) {
	super();
	this.codeEmployee = codeEmployee;
	this.nomEmployee = nomEmployee;
	this.employeeSup = employeeSup;
	this.groupe = groupe;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
}
