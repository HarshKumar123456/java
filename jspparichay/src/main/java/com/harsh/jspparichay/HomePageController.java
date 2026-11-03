package com.harsh.jspparichay;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomePageController {

	// Is ModelAttribute ki jaroorat isliye padi kyonki bhai apne ko agar default kuchh objects set karne huye to kaise karenge bhai samjhe
	@ModelAttribute ("yahNormalModelAttributeKaExampleHaiBhai")
	public String getNormalModelAttributeKaExample() {
		return "Namaste Duniya";
	}

	
	@ModelAttribute ("yahAlienModelAttributeKaExampleHaiBhai")
	public Alien getAlienModelAttributeKaExample() {
		Alien alien = new Alien();
		alien.setAid(1);
		alien.setAname("Yah Default Name Hai Alien ka samjhe....");
		return alien;
	}








	// Is Method ke andar kavi ne samjhaya hai ki bhai simply file ko map karke return kaise kar sakte hain 
	@RequestMapping("/")
	public String home() {
		System.out.println("Home method called....");
		return "index";
	}


	// Is method mein kavi ne samjhaya hai bhai jab apne paas sirf numbers yaa string yaa simple primitive datatypes jaisi cheejein ho to Normally variables ka use karke nahin chalega apne ko ModelAndView use karna padega samjhe
	@RequestMapping("/print-alien")
	public ModelAndView printAlien(@RequestParam ("name") String nameOfAlien, @RequestParam ("id") int idOfAlien, ModelAndView mv) {
		System.out.println("PrintAlien method called....");
		
		Alien yahAlienHai = new Alien();
		yahAlienHai.setAname(nameOfAlien);
		yahAlienHai.setAid(idOfAlien);


		mv.addObject("yahAlienHaiModelKeAndar", yahAlienHai);
		mv.setViewName("result");

		return mv;
	}


	// Is method mein kavi ne samjhaya hai bhai jab bhi apne ko kuchh aisi cheejon ki jaroorat ho jo pahle se hi apne pass available hai apne java code ke andar to unhe ham log kaise map kar sakte hain apne methods ke andar with the help of the ModelAttribute samjhe
	@RequestMapping("/print-alien-part-2")
	public String printAlienPart2(@ModelAttribute ("yahAlienModelAttributeKaExampleHaiBhai") Alien yahAlienHaiBhai) {
		System.out.println("PrintAlienPart2 method called....");
		System.out.println(yahAlienHaiBhai);
		
		return "result";
	}

	// Is method ke andar kavi ne samjhaya hai ki req se parameters kaise nikale hate hain aur session mein kaise attibute set kiye jate hain aur result.jsp file mein kaise get kiye jate hain
	@RequestMapping("/jodiye")
	public String jodiye(HttpServletRequest req, HttpSession session) {

		System.out.println("Jodiye method called....");

		int num1 = 10;
		int num2 = 10;

		try {
			num1 = Integer.parseInt(req.getParameter("pahla"));
			num2 = Integer.parseInt(req.getParameter("doosra"));

		} catch (Exception e) {
			System.out.println(
					"""
							Something went wrong in jodiye() while getting the numbers from the req.getParameter("<some paramter name>")
							""");
			System.out.println(e);
			System.out.println("Assinging the Default values to the num1 and num2 i.e. 10, 10 respectively....");
			System.out.println("Showing the default result....");
			num1 = 10;
			num2 = 10;
		}

		int sumKarneKaParinaam = num1 + num2;

		System.out.println(sumKarneKaParinaam);

		session.setAttribute("yahSessionKeAndarResultStoreKiyaGaya", sumKarneKaParinaam);

		return "result";
	}



	@RequestMapping("/multiply-kijiye")
	public String multiplyKijiye(@RequestParam ("pahla") int num1, @RequestParam ("doosra") int num2, HttpSession session) {

		// Is wale tarike mein scene ye hoga ki agar parameters missing huye to error aayega ki bhai ye page to hai hi nahin aur chalega nahin ye code but upar wale tarike se fallback cheejein dikhayi ja saktin hain if any of the parameters are missing samjhe.

		System.out.println("MultiplyKijiye method called....");

		int sumKarneKaParinaam = num1 * num2;

		System.out.println(sumKarneKaParinaam);

		session.setAttribute("yahSessionKeAndarResultStoreKiyaGaya", sumKarneKaParinaam);

		return "result";
	}





	// Is method mein kavi ne samjhaya hai ki kaise model mein attribute add karte hain aur phir result.jsp wali file mein simply ${<attribute name aayega idhar>} ki tarah se access kar sakte hain 
	@RequestMapping("/divide-kijiye")
	public String divideKijiye(@RequestParam ("pahla") int num1, @RequestParam ("doosra") int num2, Model model) {

		// Is wale tarike mein scene ye hoga ki agar parameters missing huye to error aayega ki bhai ye page to hai hi nahin aur chalega nahin ye code but upar wale tarike se fallback cheejein dikhayi ja saktin hain if any of the parameters are missing samjhe.

		System.out.println("DivideKijiye method called....");

		int sumKarneKaParinaam = num1 / num2;

		System.out.println(sumKarneKaParinaam);

		model.addAttribute("yahSessionKeAndarResultStoreKiyaGaya", sumKarneKaParinaam);

		return "result";
	}





	// Is method mein kavi ne samjhaya hai ki kaise ham log instead of writing the String ModelAndView ka use kar sakte hain aur ModelAndView Object return kar sakte hain after properly setting the model and its attribute jaise ki upar divideKijiye() wale method mein tha aur view ke liye jaise result.jsp page ke liye hamne String return ki hai uski jagah hamne view mein String set kardi hai   
	@RequestMapping("/subtract-kijiye")
	public ModelAndView subtractKijiye(@RequestParam ("pahla") int num1, @RequestParam ("doosra") int num2, ModelAndView mv) {

		// Is wale tarike mein scene ye hoga ki agar parameters missing huye to error aayega ki bhai ye page to hai hi nahin aur chalega nahin ye code but upar wale tarike se fallback cheejein dikhayi ja saktin hain if any of the parameters are missing samjhe.

		System.out.println("DivideKijiye method called....");

		int sumKarneKaParinaam = num1 - num2;

		System.out.println(sumKarneKaParinaam);

		mv.addObject("yahSessionKeAndarResultStoreKiyaGaya", sumKarneKaParinaam);
		mv.setViewName("result");

		return mv;
	}



}
