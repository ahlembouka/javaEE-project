package org.ahlem.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CC")/* class derivée avec la valeur de la colonne indiquant le type de compte*/
public class CompteCourant extends Compte {
private  double decouvert;

public CompteCourant() {
	super();
}

public double getDecouvert() {
	return decouvert;
}

public void setDecouvert(double decouvert) {
	this.decouvert = decouvert;
}

public CompteCourant(String codeCompte, Date dateCreation, double solde, double decouvert) {
	super(codeCompte, dateCreation, solde);
	this.decouvert = decouvert;
}

}
