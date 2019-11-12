package com.tyss.benchmanage.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
@Data
@Entity
@Table(name="user")
public class User {
	@Id
	@GenericGenerator(name = "string_based_custom_sequence", strategy = "com.tyss.benchmanage.controller.UserIdGenerator")
	@GeneratedValue(generator = "string_based_custom_sequence")
	@Column
private String id;
	@Column
private String name;
	@Column
private String email;
	@Column
private long pno;
	@Column
private String password;
	@Column
private char gender;
	@Column
private String roll;
@Column
private Date DOB;
@Column
private Date DOJ;
}
