package com.example.demo.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "transaction_log_2022")
public class TransactionLog {

	@Id
	@Column(name = "transaction_id")
	int transactionId;
	
	@Column(name = "user_login")
	int userLoginId;
	
	@Column(name = "api_operation_name")
	String apiOperationName;
	
	@Column(name = "request")
	String request;
	
	@Column(name = "response")
	String response;
	
	@DateTimeFormat(iso = ISO.TIME)
	@Column(name = "created_time")
	LocalTime createdTime;
	
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name = "created_date")
	LocalDate createdDate;
	
}
