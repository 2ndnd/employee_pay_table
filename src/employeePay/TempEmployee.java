package employeePay;
/*
​1) 임시직 사원을 나타내는 자식 클래스

2) 추가 hdept, temphour필드와 TempEmployee()생성자

3) 변수의 값을 연결한 문자열을 반환하는 toString()메소드

4) 월 근무시간 수에 3만원을 곱하여 급여액을 계산하는 earnings()메소드로 구성된다.
 */
public class TempEmployee extends Employee {
String hdept;
long temphour;
	public TempEmployee(String name, String sno, 
			String hdept, long temphour) {
		super(name, sno);
		this.hdept=hdept;
		this.temphour=temphour;
	}
	public long earning() {
		return temphour*3;
	}
	public String toString() {
		String result = "";
		result+=super.toString()+" ,부서 : "+hdept
				+", 근무시간수 : "+temphour+",";
		return result;
	}
}