package com.cn.zm.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cn.zm.Order;

@Controller
public class OrderController {
	
	@GetMapping("order_list")
	public String orderList(Model model){
		Order order = new Order("001", "购票", new BigDecimal(124.5), "test", new Date(), true, null, 1);
		model.addAttribute("name", "cjl");
		model.addAttribute("order", order);
		
		List<Order> list = new ArrayList<>();
		for(int i=0;i<10;i++){
			Order ot = new Order("or_"+i, "name_"+i, new BigDecimal(100).add(new BigDecimal(i)), "", new Date(), true, "", 1);
			list.add(ot);
		}
		model.addAttribute("olist", list);
		
		return "order_list";
	}
}
