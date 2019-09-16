package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller //�� Ŭ������ ��Ʈ�ѷ����� �˸�. �信�� ��û�� �ϸ� ����� ã�� ����.
public class Controller1 {     
 @RequestMapping("/t1") //������ �����. /t1 ��θ� ��û�ϸ� �Ʒ� �Լ��� �����.
 public String func1() {
  System.out.printf( "�Լ�1 ��\n" );
  return null; //��Ʈ�ѷ����� ������ ������ �� �ٽ� ǥ������ view�� ������. null �ϸ� 404���� ��.
 }
 
 @RequestMapping("/t2")
 public String func2() {
  System.out.printf( "�Լ�2 ��\n" );
  return "TestView"; //dispatcher-servlet.xml���� ������ ���������̼� ���� ��ο��� TigerView.jsp ���� ã�Ƽ� ���������̼���.
 }
 
 @RequestMapping("/t3")
 public String func3(
		 Model model // view �� �����ٶ� ���� �ѱ�. �ڹ� �� ��ü ���� ��. ������ request ��ü ������.
		 ,@RequestParam(value="name") String name //@RequestParam�� �پ��� �ɼ� ���� ����. ex)����Ʈ ������, ���� ������ �ް��ϴ� ���
		 ,@RequestParam(value="age") String age) { 
	 System.out.printf( "�Լ�3 �� "+name+", "+age+"\n" ); 
	 
	 model.addAttribute("name", name);
	 model.addAttribute("age", age);
	 model.addAttribute("salery", 999);
	 return "TestView"; 
 }
}