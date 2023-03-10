package com.edgar.rental.models;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import com.edgar.rental.models.user.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	private String book_title;

	@CreationTimestamp
	@Column(name = "rent_date")
	private LocalDateTime rentDate;

	@Column(name = "return_date")
	private LocalDateTime returnDate;

	@Column(name = "book_returned")
	private Boolean returned;
	
	
	@PositiveOrZero
	private BigDecimal penalty;

	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private User user;

}
