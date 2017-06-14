package sad;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/helloworld")
public class Helloworld {
	
	
	@RequestMapping("/getString/{id}")
	public void helloWorld(@PathVariable("id") String id,HttpServletRequest request, HttpServletResponse response) throws IOException{
		System.out.println("aaa");response.setCharacterEncoding("utf-8");
		response.getWriter().write("输入的是：".concat(id));
	}
}
