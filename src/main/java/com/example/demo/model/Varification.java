package com.example.demo.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Varification {

	private boolean status = false;
	private LocalDateTime startedAt;
	private LocalDateTime endAt;
	private String planType;
}
