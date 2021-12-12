package com.management.exam.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommonBase implements Serializable {

	// TODO what is serilizable

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	@Temporal(TemporalType.TIMESTAMP)
	Date createdTimestamp = new Date(System.currentTimeMillis());

	@Column(columnDefinition = "boolean default false")
	Boolean isDeleted;
}
