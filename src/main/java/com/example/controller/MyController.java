package com.example.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.example.dao.BillRepository;
import com.example.dao.OrderRepository;
import com.example.dao.ProductRepository;
import com.example.dao.UserRepository;
import com.example.entity.Bill;
import com.example.entity.Order;
import com.example.entity.Product;
import com.example.entity.User;

@Controller
public class MyController {

	User user = new User();
	@Autowired
	ProductRepository productRepository;

	@Autowired
	UserRepository userRepository;

	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	BillRepository billRepository;

	@RequestMapping(value = "home")
	public String home() {

		return "home";
	}

	@RequestMapping(value = "/welcome")
	public String welcome(@ModelAttribute User user, HttpServletRequest request , Model model) {

		userRepository.save(user);
		System.out.println(user);
		System.out.println(user.getPassword());
		request.getSession().setAttribute("userName", user.getUserName());
        model.addAttribute("customer",request.getSession().getAttribute(user.getUserName()) );
		return "welcome";
	}

	@RequestMapping(value = "/signup")
	public String signup(@ModelAttribute User user, Model model , HttpServletRequest request) {

		model.addAttribute("message", "Successfully Registered !!");
		System.out.println("inside signup");
		request.getSession().setAttribute("userName", user.getUserName());
		return "signup";
	}

	@RequestMapping(value = "/editProduct")
	public String editProduct(@RequestParam("username") String username, @RequestParam("password") String password,
			Model model) {

		System.out.println("username is " + username);
		System.out.println("password is " + password);

		if ((username.equals("Admin")) && (password.equals("admin"))) {

			model.addAttribute("msg", "Admin Login successfully !!");
			return "editProduct";
		} else {
			model.addAttribute("msg", "Entered wrong username or password !!");
			return "login";
		}

	}

	@RequestMapping(value = "/showProduct")
	public String showProduct(@ModelAttribute Product product, Model model) {

		// productRepository.save(product);
		System.out.println(product.getId());
		// model.addAttribute("id", product.getId());
		List<Product> repo = productRepository.findAll();
		System.out.println("list" + repo);
		model.addAttribute("repo", repo);
		// model.addAttribute("repoId" , productRepository.findById(product.getId()));

		return "showProduct";
	}

	@RequestMapping(value = "/displayProduct")
	public RedirectView displayProduct(@ModelAttribute Product product) {

		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("showProduct");
		productRepository.save(product);
		System.out.println("saved product " + product);

		return redirectView;
	}

	@RequestMapping(value = "/login")
	public String login() {

		return "login";
	}

	@RequestMapping("/addProduct")
	public String addProduct(HttpSession session) {

		System.out.println("inside add product");

		return "addProduct";
	}

	@RequestMapping("/delete/{productId}")
	public String delete(@PathVariable("productId") int id) {
		this.productRepository.deleteById(id);
		// RedirectView redirectView = new RedirectView();
		// redirectView.setUrl("/");
		return "redirect:/showProduct";
	}

	@RequestMapping("/gents")
	public String gents(@ModelAttribute Product product, Model model, HttpServletRequest request) {
		System.out.println("inside gents");
		System.out.println("User name" + request.getSession().getAttribute("userName"));
		List<Product> category = productRepository.findByCategory("Gents");
		model.addAttribute("user", request.getSession().getAttribute("userName"));
		model.addAttribute("category", category);
		return "gents";
	}

	@RequestMapping("/ladies")
	public String ladies(@ModelAttribute Product product, Model model, HttpServletRequest request) {
		System.out.println("inside ladies");
		List<Product> category = productRepository.findByCategory("Ladies");
		model.addAttribute("user", request.getSession().getAttribute("userName"));
		model.addAttribute("category", category);
		return "ladies";
	}

	@RequestMapping("/kids")
	public String kids(@ModelAttribute Product product, Model model, HttpServletRequest request) {
		System.out.println("inside kids");
		List<Product> category = productRepository.findByCategory("Kids");
		model.addAttribute("user", request.getSession().getAttribute("userName"));
		model.addAttribute("category", category);
		return "kids";
	}

	@RequestMapping("/buy/{productId}")
	public String buy(@PathVariable("productId") int id, @ModelAttribute Bill bill, Model model,
			HttpServletRequest request) {
		System.out.println("inside buy controller");
		Optional<Product> prod = productRepository.findById(id);
		System.out.println("inside buy controller" + prod);
		String name = (String) request.getSession().getAttribute("userName");
		System.out.println("inside buy controller for user name " + name);
		model.addAttribute("prodName", productRepository.findById(id));
		bill.setOrderName(prod.get().getProductName());
		bill.setOrderPrice(Long.toString(prod.get().getPrice()));
		bill.setProductId(Integer.toString(id));
		model.addAttribute("user", request.getSession().getAttribute("userName"));
		bill.setCustomerName(name);
		System.out.println("bill " + bill);
		billRepository.save(bill);
		return "redirect:/bill";
	}

	/*
	 * @RequestMapping("/buy/{productId}") public String
	 * buy(@PathVariable("productId") int id, HttpServletRequest
	 * request, @ModelAttribute Order order, Model model) {
	 * System.out.println("inside buy controller");
	 * 
	 * return "bill"; }
	 */

	@RequestMapping(value = "/bill")
	public String orderList(@ModelAttribute Bill bill, Model model , HttpServletRequest request) {

	

		List<Bill> order1 = billRepository.findAll();
		
		System.out.println("inside order controller " + order1);
		model.addAttribute("order", order1);
       
		return "bill";
	}

}
