package org.ahlem.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ManyToAny;
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE) /* car elle a des classes filles*/
@DiscriminatorColumn(name="TYPE_CPTE",discriminatorType=DiscriminatorType.STRING,length=2)
public abstract class Compte implements Serializable {
@Id
private String codeCompte;
private Date dateCreation;
private double solde;
@ManyToOne
@JoinColumn(name="codeClient")
private Client client;
@ManyToOne
@JoinColumn(name="codeEmployee")
private Employee employee;
@OneToMany(mappedBy="compte",fetch=FetchType.LAZY)
private Collection<Operation> operation;
public Compte(String codeCompte, Date dateCreation, double solde) {
	super();
	this.codeCompte = codeCompte;
	this.dateCreation = dateCreation;
	this.solde = solde;
}
public Compte() {
	super();
	// TODO Auto-generated constructor stub
}
public String getCodeCompte() {
	return codeCompte;
}
public void setCodeCompte(String codeCompte) {
	this.codeCompte = codeCompte;
}
public Date getDateCreation() {
	return dateCreation;
}
public void setDateCreation(Date dateCreation) {
	this.dateCreation = dateCreation;
}
public double getSolde() {
	return solde;
}
public void setSolde(double solde) {
	this.solde = solde;
}
public Client getClient() {
	return client;
}
public void setClient(Client client) {
	this.client = client;
}
public Employee getEmployee() {
	return employee;
}
public void setEmployee(Employee employee) {
	this.employee = employee;
}
public Collection<Operation> getOperation() {
	return operation;
}
public void setOperation(Collection<Operation> operation) {
	this.operation = operation;
}


}
