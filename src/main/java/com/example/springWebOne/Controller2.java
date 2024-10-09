package com.example.springWebOne;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;

@Controller
public class Controller2 {
        @GetMapping("/str2")        //реагировать на запрос localhost:8080/str2 или <IP-адрес>:<Port>/str2
        public String str2(Model model){
            //параметр класса Model это словарь всех аттрибутов, которые передаются внутрь шаблона
            System.out.println("получен запрос к str2");//отладка, видна в консоли сервера
            int x = new Random().nextInt(1, 100);
            int y = new Random().nextInt(30, 70);
            model.addAttribute("num1", x);  //помещаем значение x под именем num1 в шаблон
            model.addAttribute("num2", y);  //model.asMap().put("num2", y);
            return "template2";  //использовать шаблон template2.html из папки ресурсов
        }



    public Controller2() {
        System.out.println("СОЗДАЕТСЯ Controller2");
    }
}
