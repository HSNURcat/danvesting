package com.dandan.danvesting.stock;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dandan.danvesting.stock.bo.StockBO;
import com.dandan.danvesting.stock.model.CompanyInfo;
import com.dandan.danvesting.stock.model.StockBar;

@Controller
@RequestMapping("/post")
public class StockController {
	@Autowired
	private StockBO stockBO;
	
	@GetMapping("/stock/detail_view")
	public String getStockDetail(@RequestParam("ticker")String ticker, Model model) {
		
		CompanyInfo companyInfo = new CompanyInfo();
		
		companyInfo = stockBO.getCompanyInfoJSON(ticker);
		
		model.addAttribute("companyInfo", companyInfo);
		return "stock/stockDetail";
	}
}
