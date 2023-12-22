package com.story.ai.main.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Card2Model {
	@JsonProperty
	private int toDate1;
	@JsonProperty
	private int toDate2;
	@JsonProperty
	private int toDate3;
	@JsonProperty
	private int toDate4;
	@JsonProperty
	private int toDate5;
	@JsonProperty
	private int toDate6;
	@JsonProperty
	private int toDate7;
	@JsonProperty
	private int targetDate;
}
