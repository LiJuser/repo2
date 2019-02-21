package cn.itcast.servlet;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;
    @RequestMapping("/findAll")
    public ModelAndView findAll(/*Model model*/){
        List<Account> accounts = accountService.findAll();
        System.out.println(accounts);
//        model.addAttribute("accounts", accounts);
        ModelAndView mv = new ModelAndView();
        mv.addObject("accounts", accounts);
        mv.setViewName("list");
//        return "list";
        return mv;
    }
    @RequestMapping("/save")
    public void saveAccount(HttpServletRequest request,HttpServletResponse response, Account account) throws IOException {
        accountService.saveAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/findAll");
//        return "redirect:findAllAccount";
    }
}
