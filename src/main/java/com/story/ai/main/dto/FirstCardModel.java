package com.story.ai.main.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FirstCardModel {
	@JsonProperty
	private String toDate;
	@JsonProperty
	private String btnText;
}
