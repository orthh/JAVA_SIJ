package 성적관리프로그램;

public class Student {
	// 필드
	private String stuName;
	private String stuNum;
	private int javaScore;
	private int dbScore;
	private int webScore;
	
	// 생성자 메서드
	// 객체를 생성할때 최초로 1번만 호출되는 메서드
	// 반환타입을 작성하지 않는다.
	// 클래스이름과 생성자이름이 똑같다.
	// 생성자는 하나 이상 선언되어야 한다
	// (없는 경우 컴파일시에 자동으로 default생성자 추가)
	
	// 메서드는 데이터 타입에 스택영역에 변수 선언됨.
	// 하지만 클래스의 필드는 힙영역에 지정됨.
	// 지역변수의 역할
	public Student(	String stuName,
					String stuNum,
					int javaScore,
					int dbScore,
					int webScore) {
		// this 는 객체 자기 자신 가리킴.
		this.stuName = stuName;
		this.stuNum = stuNum;
		this.javaScore = validScore(javaScore);
		this.dbScore = validScore(dbScore);
		this.webScore = validScore(webScore);
		
	}
	
	// 외부에서 쓸일 없음. 내부전용 -> private
	private int validScore(int score) {
		if( score >= 0 || score <=100) {
			return score;
		}else {
			return 0;
		}
	}
	
	// getter 메서드
	public String getStuName() {
		return stuName;
	}
	public String getStuNum() {
		return stuNum;
	}

	public int getJavaScore() {
		return javaScore;
	}

	public int getDbScore() {
		return dbScore;
	}

	public int getWebScore() {
		return webScore;
	}
	
	
	// setter 메서드
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}

	public void setJavaScore(int javaScore) {
		this.javaScore = javaScore;
	}

	public void setDbScore(int dbScore) {
		this.dbScore = dbScore;
	}

	public void setWebScore(int webScore) {
		this.webScore = webScore;
	}
	
	
	
	
	
	
}
