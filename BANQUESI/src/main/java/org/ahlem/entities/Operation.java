package org.ahlem.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(length=1)
public class Operation implements Serializable {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long numeroOperation;
private Date dateOperations;
private double montant;
@ManyToOne
@JoinColumn(name="CODE_CPTE")
private Compte compte;
@ManyToOne
@JoinColumn(name="CODE_EMP")
private Employee employee;
public Operation() {
	super();
	// TODO Auto-generated constructor stub
}
public Operation(Date dateOperations, double montant) {
	super();
	this.dateOperations = dateOperations;
	this.montant = montant;
}
public Long getNumeroOperation() {
	return numeroOperation;
}
public void setNumeroOperation(Long numeroOperation) {
	this.numeroOperation = numeroOperation;
}
public Date getDateOperations() {
	return dateOperations;
}
public void setDateOperations(Date dateOperations) {
	this.dateOperations = dateOperations;
}
public double getMontant() {
	return montant;
}
public void setMontant(double montant) {
	this.montant = montant;
}
public Compte getCompte() {
	return compte;
}
public void setCompte(Compte compte) {
	this.compte = compte;
}
public Employee getEmployee() {
	return employee;
}
public void setEmployee(Employee employee) {
	this.employee = employee;
}

}
