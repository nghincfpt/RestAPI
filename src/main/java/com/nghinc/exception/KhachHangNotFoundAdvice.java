package com.nghinc.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class KhachHangNotFoundAdvice {

	@ResponseBody
	@ExceptionHandler(KhachHangNotfoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public Map<String, String>exceptionHandler(KhachHangNotfoundException exception){
		Map<String, String> errorMap= new HashMap<>();
		errorMap.put("errorMessage", exception.getMessage());
		
		return errorMap;
	}
}

// tạo lớp controllerAdvice : tùy chỉnh xữ lý lỗi
//                            đưa ra thông báo rõ ràng
//                             tái sữ sụng
//                            tách logic xử lý ngoại lệ ra khỏi controller 
// k muốn tạo ra @controllerAdvice thì   tạo ngày trong controller và sữ sụng 
//                                 @ExceptionHandler(KhachHangNotfoundException.class)
//                                  @ResponseStatus(HttpStatus.NOT_FOUND) để đưa ra thông báo lỗi