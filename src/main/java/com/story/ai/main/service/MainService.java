package com.story.ai.main.service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

import org.springframework.stereotype.Service;

import com.story.ai.main.dto.Card2Model;
import com.story.ai.main.dto.FirstCardModel;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Service
public class MainService {

	public FirstCardModel getCard1(HttpServletRequest request, HttpServletResponse response) {
		DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
		String date = LocalDate.now().getMonthValue() + "월 " + LocalDate.now().getDayOfMonth() + "일 " + dayOfWeek.getDisplayName(TextStyle.FULL, Locale.KOREAN);
		return FirstCardModel.builder().btnText("운동 추가하기").toDate(date).build();
	}

	public Card2Model getCard2(HttpServletRequest request, HttpServletResponse response) {
		// db 연결해서 데이터 가져와야 함.
		// key 가 고객을 식별할 수 있는 전화번호나, 임의로 만든 고객ID 등으로 할 필요가 있음.
		
		return Card2Model.builder().toDate1(3).toDate2(3).toDate3(3).toDate4(3).toDate5(3).toDate6(3).toDate7(3).targetDate(3).build();
	}

}
