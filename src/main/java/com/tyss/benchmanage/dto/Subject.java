package com.tyss.benchmanage.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Data
@Table
public class Subject {
	@Id
	@GenericGenerator(name = "string_based_custom_sequence", strategy = "com.tyss.benchmanage.controller.SubjectIdGenerator")
	@GeneratedValue(generator = "string_based_custom_sequence")
	@Column
private byte sid;
	@Column
private String sname;
}
