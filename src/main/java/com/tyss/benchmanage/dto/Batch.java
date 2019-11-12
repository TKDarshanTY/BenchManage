package com.tyss.benchmanage.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="batch")
public class Batch {
	@Id
	@GeneratedValue
private int bid;
private String bName;
private String category;
private Date startDate;
private Date endDate;
private String status;
}
