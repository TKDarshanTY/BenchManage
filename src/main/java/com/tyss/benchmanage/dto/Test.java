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
@Table(name="test")
public class Test {
	@Id
	@GenericGenerator(name = "string_based_custom_sequence", strategy = "com.tyss.benchmanage.controller.TestIdGenerator")
	@GeneratedValue(generator = "string_based_custom_sequence")
	@Column
private byte id;
	@Column
private String name;
	@Column
private Date conductedDate;
}
