package jp.oysterworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeleafController {

	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		return "about";
	}

	@RequestMapping("/services")
	public String service() {
		return "services";
	}

	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}

	@RequestMapping("/company")
	public String company() {
		return "company";
	}

	@RequestMapping("/member")
	public String member() {
		return "member";
	}

	@RequestMapping("/recruit")
	public String recruit() {
		return "recruit";
	}

	@RequestMapping("/inexperienced")
	public String inexperienced() {
		return "inexperienced";
	}

	@RequestMapping("/experienced")
	public String experienced() {
		return "experienced";
	}
	@RequestMapping("/recruit2")
	public String recruit2() {
		return "recruit2";
	}

	@RequestMapping("/recruit3")
	public String recruit3() {
		return "recruit3";
	}

	@RequestMapping("/test")
	public String test() {
		return "test";
	}

	@RequestMapping("/color")
	public String color() {
		return "color";
	}

}