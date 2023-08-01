package com.example.randomnumbers.study.sql;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/study/sql")
@Slf4j
public class SqlController {

    @GetMapping("/basic")
    public String basic(){
        return "redirect:https://knotty-roll-dcd.notion.site/SQL-3891c5f7d59f4ecf9fe6ebdc43fea2bb?pvs=4";
    }
}
