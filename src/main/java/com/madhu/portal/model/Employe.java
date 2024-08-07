package com.madhu.portal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employeportal")
public class Employe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employeid")
	private int employeId;

	@Column(name = "employename")
	private String employeName;

	@Column(name = "employedesgination")
	private String employeDesgination;

	@Column(name = "employeemail")
	private String employeEmail;

	@Column(name = "employephonenumber")
	private String employePhoneNumber;

}
