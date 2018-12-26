package by.evheniyParakhonka.springMVC;

import by.evheniyParakhonka.springMVC.DAO.HockeyResultDAOImpl;
import by.evheniyParakhonka.springMVC.DAO.IHockeyResultDAO;
import by.evheniyParakhonka.springMVC.model.HockeyResult;

import java.util.List;

public class Main {

    public static void main(String... args){
        IHockeyResultDAO hockeyResultDAO = new HockeyResultDAOImpl();
        List<HockeyResult> list = hockeyResultDAO.getAllResult();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getFirstTeam());
        }
    }
}
