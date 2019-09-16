package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller //이 클래스가 컨트롤러임을 알림. 뷰에서 요청을 하면 여기로 찾아 들어옴.
public class Controller1 {     
 @RequestMapping("/t1") //일종의 라우터. /t1 경로를 요청하면 아래 함수가 실행됨.
 public String func1() {
  System.out.printf( "함수1 콜\n" );
  return null; //컨트롤러에서 로직을 수행한 후 다시 표시해줄 view를 지시함. null 하면 404에러 남.
 }
 
 @RequestMapping("/t2")
 public String func2() {
  System.out.printf( "함수2 콜\n" );
  return "TestView"; //dispatcher-servlet.xml에서 설정한 프레젠테이션 로직 경로에서 TigerView.jsp 파일 찾아서 프레젠테이션함.
 }
 
 @RequestMapping("/t3")
 public String func3(
		 Model model // view 를 보여줄때 같이 넘김. 자바 빈 객체 같은 거. 서블릿의 request 객체 같은거.
		 ,@RequestParam(value="name") String name //@RequestParam에 다양한 옵션 설정 가능. ex)디폴트 값설정, 인자 무조건 받게하는 등등
		 ,@RequestParam(value="age") String age) { 
	 System.out.printf( "함수3 콜 "+name+", "+age+"\n" ); 
	 
	 model.addAttribute("name", name);
	 model.addAttribute("age", age);
	 model.addAttribute("salery", 999);
	 return "TestView"; 
 }
}