package com.sai.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
	
	
	@RequestMapping("/")
    public String productForm() {
        return "product";
    }

    @RequestMapping("/invoice")
    public String invoiceBillProcess(@RequestParam long itemid,
                                     @RequestParam String itemname,
                                     @RequestParam long quantity,
                                     @RequestParam double cost,
                                     Model model) {
        model.addAttribute("itemid", itemid);
        model.addAttribute("itemname", itemname);
        model.addAttribute("quantity", quantity);
        model.addAttribute("cost", cost);
         double totalAmount=0;
        totalAmount = cost * quantity;
        model.addAttribute("totalAmount", totalAmount);
       
		return "result";
        
    }
    
}
