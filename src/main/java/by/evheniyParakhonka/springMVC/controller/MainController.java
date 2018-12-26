package by.evheniyParakhonka.springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import by.evheniyParakhonka.springMVC.DAO.HockeyResultDAOImpl;
import by.evheniyParakhonka.springMVC.DAO.IHockeyResultDAO;
import by.evheniyParakhonka.springMVC.model.HockeyResult;

import java.util.List;


@Controller
public class MainController {

    /*First method on start application*/
    /*Попадаем сюда на старте приложения (см. параметры аннтоции и настройки пути после деплоя) */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView main() {
        ModelAndView modelAndView = new ModelAndView();
        IHockeyResultDAO hockeyResultDAO = new HockeyResultDAOImpl();
        List<HockeyResult> list = hockeyResultDAO.getAllResult();
        System.out.println(list.get(0).getFirstTeam());

        modelAndView.addObject("userJSP", list);
        modelAndView.setViewName("index");
        return modelAndView;
    }

}
