package problem02;

public class MyService extends BaseService {
	public void service(String state) {
		String result = "";
		if (state.equals("낮")) {
			result = super.day();
		} else if (state.equals("밤")) {
			result = super.night();
		} else {
			result = afternoon();
		}
		result += "서비스시작";
		System.out.println(result);
	}
	
	public String afternoon() {
		return "오후";
	}
}
