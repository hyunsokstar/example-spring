package kr.co.songjava.configuration.http;

import lombok.Data;

/**
 * 공통으로 사용할 응답 클래스.
 * 
 * @author 송자바
 * @param <T>
 */
@Data
public class BaseResponse<T> {

	private BaseResponseCode code;
	private String message;
	private T data;
	
	public BaseResponse(T data) {
		this.code = BaseResponseCode.SUCCESS;
		this.data = data;
	}
	
}

// 위의 응답 클래스(제네릭 타입) 을 보면 생성자로 code와 data를 설정하는데 
// 이게 공통 응답 형식이 된다.
