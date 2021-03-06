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
@Table(name="batch")
public class Batch {
	@Id
	@GenericGenerator(name = "string_based_custom_sequence", strategy = "com.tyss.benchmanage.controller.BatchIdGenerator")
	@GeneratedValue(generator = "string_based_custom_sequence")
	@Column
private int bid;
	@Column
private String bName;
	@Column
private String category;
	@Column
private Date startDate;
	@Column
private Date endDate;
	@Column
private String status;
}
