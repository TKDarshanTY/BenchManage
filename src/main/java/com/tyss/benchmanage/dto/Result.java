package com.tyss.benchmanage.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
@Data
@Entity
@Table(name="result")
public class Result {
	@Id
	@Column
	@GenericGenerator(name = "string_based_custom_sequence", strategy = "com.tyss.benchmanage.controller.ResultIdGenerator")
	@GeneratedValue(generator = "string_based_custom_sequence")
private byte rid;
private byte tid;
private byte bid;
private byte uid;
@Column
private double score;
@Column
private double maxMarks;
@Column
private String remarks;
}
