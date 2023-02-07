# SpringBootWebProject
## part1.스프링 부트 도전하기
### [01.프로젝트를 위한 준비(ex01)](https://github.com/rlarmsdn2999/SpringBootWebProject/tree/master/ex01)
##### 1.1.개발 도구의 준비
##### 1.2.Spring initializr를 이용한 프로젝트 생성
##### 1.3.스프링 프로젝트 실행해보기
##### 1.4.스프링 부트를 단독으로 실행 가능한 파일로 만들기

### [02.Maria 데이터베이스와 Spring Data JAP(ex02)](https://github.com/rlarmsdn2999/SpringBootWebProject/tree/master/ex02)
##### 2.1.MariaDB의 설치와 데이터베이스 생성
##### 2.2.Spring Data JPA를 이용하는 프로젝트의 생성
##### 2.3.Spring Data JAP의 소개
##### 2.4.엔티티 클래스와 JpaRepository
##### 2.5.페이징/정렬 처리하기
##### 2.6.쿼리 메서드(Query Methods) 기능과 @Query

### [03.스프링 MVC와 Thymeleaf(ex03)](https://github.com/rlarmsdn2999/SpringBootWebProject/tree/master/ex03)
##### 3.1.Thymeleaf를 사용하는 프로젝트 생성
##### 3.2.Thymeleaf의 기본 사용법
##### 3.3.Thymeleaf의 기본 객체와 LocalDateTime
##### 3.4.Thymeleaf의 레이아웃

## [Part2.Spring MVC/JPA/Thymeleaf연습 (guestbook)](https://github.com/rlarmsdn2999/SpringBootWebProject/tree/master/guestbook)
### 04.프로젝트 구조 만들기
##### 4.1.프로젝트의 와이어프레임
##### 4.2.자동으로 처리되는 날짜/시간 설정
##### 4.3.엔티티 클래스와 Querydsl 설정
##### 4.4.서비스 계층과 DTO
##### 4.5.목록 처리
##### 4.6.컨트롤러와 화면에서의 목록 처리
##### 4.7.등록 페이지와 등록 처리
##### 4.8.방명록의 조회 처리
##### 4.9.방명록의 수정/삭제 처리
##### 4.10.검색 처리

## [Part3.N:1(다대일 관계) 처리하기 (board)](https://github.com/rlarmsdn2999/SpringBootWebProject/tree/master/board)
### 05.N:1(다대일) 연관관계
##### 5.1.연관관계와 관계형 데이터베이스 설계
##### 5.2.연관관계 테스트
##### 5.3.프로젝트 적용하기
##### 5.4.컨트롤러와 화면 처리
##### 5.5.JPQL로 검색

### 06.@RestController와 JSON처리
##### 6.1.JSON과 Ajax로 댓글 처리
##### 6.2.ReplyDTO와 ReplyService/ReplyController
##### 6.3.조회 화면에서 처리

## [Part4.M:N(다대다) 관계와 파일 업로드 처리 (mreview)](https://github.com/rlarmsdn2999/SpringBootWebProject/tree/master/mreview)
### 07.M:N(다대다) 관게의 설계와 구현
##### 7.1.M:N(다대다) 관계의 특징
##### 7.2.예제 프로젝트 생성
##### 7.3.M:N(다대다) Repository와 테스트

### 08.파일 업로드 처리
##### 8.1.파일 업로드를 위한 설정

### 09.영화/리뷰 프로젝트 적용하기
##### 9.1.영화(Movie) 등록 처리
##### 9.2.목록 처리와 평균 평점
##### 9.3.조회 페이지와 영화 리뷰
##### 9.4.Ajax로 영화 리뷰 처리

## [Part5.Spring Security를 이용한 로그인 처리](https://github.com/rlarmsdn2999/SpringBootWebProject/tree/master/club)
### 10.Spring Boot와 Spring Security연동
##### 10.1.스프링 시큐리티를 이용하는 프로젝트 생성
##### 10.2.스프링 시큐리티 커스터마이징
##### 10.3.프로젝트를 위한 JPA처리
##### 10.4.시큐리티를 위한 UserDetailsService
##### 10.5.Thymeleaf/Controller에서 사용자 정보 출력하기

### 11.스프링 시큐리티 소셜 로그인 처리
##### 11.1.구글 로그인 시나리오
##### 11.2.현재 프로젝트와의 연동
##### 11.3.자동 회원가입의 후처리
##### 11.4.Remember me와 @PreAuthorize

### 12.API 서비스 만들기
##### 12.1.API 서버를 위한 구성
##### 12.2.API 서버를 위한 필터
##### 12.3.API를 위한 인증처리