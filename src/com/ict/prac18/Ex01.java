package com.ict.prac18;

public class Ex01 {
	/* 
	   Stream : 컬렉션(배열포함)의 저장 요소를 하나씩 참조
	   			람다식으로 처리할 수 있는 클래스
	   			컬렉션, 배열 데이터 소스를 표준화된 방법으로 다루기 위한 것
	   			
	   전체 순서 : 스트림생성 => 중간처리 => 최종처리
	   1. 스트림 생성 : 컬렉션, 배열을 Stream 으로 변환시킨다.
	   2. 중간처리 : 여러번 반복 사용 가능, 결과가 스트림으로 나온다. 
	   			  distinct() : 중복제거
	   			  filter(조건식) : 조건에 안 맞는 요소 제외
	   			  limit(수) : 수만큼만 나오라
	   			  skip(수) : 수만큼 제외하고 나와라 
	   			  peek() : 작업사이에 넣어서 중간 결과를 받을 때 (요소 전체를 반복) 
	 			  sorted() : 정렬
	 			  map() : 요소 반환
	 			  flatMap() : 요소 반환
	   3. 최종처리 : 한번만 실행할 수 있고, 스트림 요소가 소모, 스트림이 닫기 되어서 Stream 다시 호출 불가
	   			   결과가 스트림이 아디ㅏ. 
	   			   forEach() : 요소 전체를 반복
	   			   count() : 갯수
	   			   max() : 최대
	   			   min() : 최소
	   			   
	   			   ** 보통 filter 와 같이 사용
	   			   findAny() : 아무거나 하나 반환. 
	   			   findFirst() : 첫번째꺼 반환.
	   			   
	   			   allMatch(조건식) : 모두 만족할 때 true
	   			   anyMatch(조건식) : 하나라도 만족 하면 true
	   			   noneMatch(조건식) : 모두 만족하지 않으면 true
	   			   
	   			   toArray() = > 스트림의 모든 요소를 배열로 변환
	   			   reduce() : 스트림의 요소를 하나씩 줄여가면서 계산
 	 			   			  sum, count()
 	 			   collect : 스트림의 요소를 수집
	 
	 
	 
	 */
}
