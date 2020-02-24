package com.task.db.entity;

import java.util.Date;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.task.db.enums.Status;

import javax.persistence.GeneratedValue;

@Entity
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ticketNumber;

	@Column(unique = true, nullable = false)
	private String ticketLink;

	@Column(nullable = false)
	private String estimatedHours;

	private Date dateOfAssignment;

	private Date dateOfDelivery;

	private Date deadLine;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Status status;

	private String createBy;

	@Column(nullable = false,updatable=false)
	private LocalDate createAt;

	private String updateBy;

	private LocalDate updateAt;

	private boolean delay;

	@PrePersist
	public void prePersist() {
		createAt = updateAt = LocalDate.now();
	}

	@PreUpdate
	public void preUpdate() {
		updateAt = LocalDate.now();
	}

	public int getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public String getTicketLink() {
		return ticketLink;
	}

	public void setTicketLink(String ticketLink) {
		this.ticketLink = ticketLink;
	}

	public String getEstimatedHours() {
		return estimatedHours;
	}

	public void setEstimatedHours(String estimatedHours) {
		this.estimatedHours = estimatedHours;
	}

	public Date getDateOfAssignment() {
		return dateOfAssignment;
	}

	public void setDateOfAssignment(Date dateOfAssignment) {
		this.dateOfAssignment = dateOfAssignment;
	}

	public Date getDateOfDelivery() {
		return dateOfDelivery;
	}

	public void setDateOfDelivery(Date dateOfDelivery) {
		this.dateOfDelivery = dateOfDelivery;
	}

	public Date getDeadLine() {
		return deadLine;
	}

	public void setDeadLine(Date deadLine) {
		this.deadLine = deadLine;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public LocalDate getCreateAt() {
		return createAt;
	}

	public void setCreateAt(LocalDate createAt) {
		this.createAt = createAt;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public LocalDate getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(LocalDate updateAt) {
		this.updateAt = updateAt;
	}

	public Task() {
		super();
	}

	public Task(int ticketNumber, String ticketLink, String estimatedHours, Date dateOfAssignment, Date dateOfDelivery,
			Date deadLine, Status status, String createBy, LocalDate createAt, String updateBy, LocalDate updateAt, boolean delay) {
		super();
		this.ticketNumber = ticketNumber;
		this.ticketLink = ticketLink;
		this.estimatedHours = estimatedHours;
		this.dateOfAssignment = dateOfAssignment;
		this.dateOfDelivery = dateOfDelivery;
		this.deadLine = deadLine;
		this.status = status;
		this.createBy = createBy;
		this.createAt = createAt;
		this.updateBy = updateBy;
		this.updateAt = updateAt;
		this.delay = delay;
	}

	@Override
	public String toString() {
		return "Task [ticketNumber=" + ticketNumber + ", ticketLink=" + ticketLink + ", estimatedHours="
				+ estimatedHours + ", dateOfAssignment=" + dateOfAssignment + ", dateOfDelivery=" + dateOfDelivery
				+ ", deadLine=" + deadLine + ", status=" + status + ", createBy=" + createBy + ", createAt=" + createAt
				+ ", updateBy=" + updateBy + ", updateAt=" + updateAt + ", delay=" + delay + "]";
	}

	public boolean isDelay() {
		return delay;
	}

	public void setDelay(boolean delay) {
		this.delay = delay;
	}

}
