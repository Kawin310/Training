package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@PrimaryKeyJoinColumn(name="id",referencedColumnName = "policy_number")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public class Insurance {
	
		@Id
		@Column(name="policy_number")
		private int policyNumber;
		@Column(name="policyholder_name",length=30,nullable = false)

	private String policyHolderName;
}
