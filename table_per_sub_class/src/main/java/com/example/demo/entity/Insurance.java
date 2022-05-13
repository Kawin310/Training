package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name="kawin_ins")
@PrimaryKeyJoinColumn(name="id",referencedColumnName = "policy_number")
public class Insurance {
	@Id
	@Column(name="policy_number")
	private int policyNumber;
	@Column(name="policyholder_name",length=30,nullable = false)

	private String policyHolderName;


}
