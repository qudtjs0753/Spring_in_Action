# Spring_in_Action
## Spring_in_Action을 보면서 spring 실습.

### 1장
* 뷰 템플릿 정의
* 컨트롤러 클래스 작성
* 간단한 테스트 클래스 작성
* pom.xml의 구조 간단하게 알아보았음.

### 2장
* @RequestMapping등의 어노테이션 기반으로 요청 처리 메서드 선언.
* 뷰 컨트롤러를 사용해서 HTTP GET 요청 처리가 가능
* 유효성 검사는 빈 API와 Hibernate Validator등의 컴포넌트로 지원이 됨
* 개발시에는 템플릿 캐시를 잠시 비활성화해서 페이지 수정이 가능.

### 3장
* JdbcTemplate를 이용한 JDBC 작업 간편화
* PreparedStatementCreator와 KeyHolder를 통해 데이터베이스가 생성하는 ID값 알아내기
* SimpleJdbcInsert를 이용한 데이터 추가
* 스프링 데이터 JPA를 통해 JPA 퍼시스턴스 간편화.
* JPA repository 커스터마이징.