package com.example.quickstart.controller;

import com.example.quickstart.dao.Card2DAO;
import com.example.quickstart.dao.CardDAO;
import com.example.quickstart.entity.Card;

import com.example.quickstart.entity.Card2;
import com.example.quickstart.entity.Matrix;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class CardController {
    @Resource
    private CardDAO cardDAO;
    @Resource
    private Card2DAO card2DAO;
    @Resource
    private Matrix matrix;
    @GetMapping("matrix")
    public String getAll(ModelMap map){
        matrix.setInfo("6.png");
        matrix.setMatrix("Matrix");
        matrix.setLogin("10.png");
        matrix.setInfo1("7.png");
        matrix.setInfo2("8.png");
        map.addAttribute(matrix);
        List<Card> cardList= cardDAO.getCards();
        map.addAttribute("cardList",cardList);
        List<Card2> card2List=card2DAO.getCard2s();
        map.addAttribute("card2List",card2List);
        return "matrix";
    }
}