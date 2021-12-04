package com.yjproject.callogg.Dashboard;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Calendar;

@Controller
public class DashboardController {

    @RequestMapping("/Dashboard/dashboard")
    public String dashboard() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();

        String now = sdf.format(cal.getTime());
        System.out.println("[ " + now + " ] dashboard 진입 !!");
        return "Dashboard/index";
    }

    @RequestMapping("/hj")
    public String test() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();

        String now = sdf.format(cal.getTime());
        System.out.println("[ " + now + " ] test 진입 !!");
        return "ThymeleafTest";
    }
}
