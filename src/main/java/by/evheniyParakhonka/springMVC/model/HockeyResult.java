package by.evheniyParakhonka.springMVC.model;

import javax.persistence.*;

@Entity
@Table(name = "hockeyresult")
public class HockeyResult {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column(name="firstTeam")
    private String firstTeam;

    @Column(name="scoreFirstTeam")
    private int scoreFirstTeam;

    @Column(name="secondTeam")
    private String secondTeam;

    @Column(name="scoreSecondTeam")
    private int scoreSecondTeam;

    public int getId() {
        return id;
    }

    public void setId(int pId) {
        id = pId;
    }

    public String getFirstTeam() {
        return firstTeam;
    }

    public void setFirstTeam(String pFirstTeam) {
        firstTeam = pFirstTeam;
    }

    public int getScoreFirstTeam() {
        return scoreFirstTeam;
    }

    public void setScoreFirstTeam(int pScoreFirstTeam) {
        scoreFirstTeam = pScoreFirstTeam;
    }

    public String getSecondTeam() {
        return secondTeam;
    }

    public void setSecondTeam(String pSecondTeam) {
        secondTeam = pSecondTeam;
    }

    public int getScoreSecondTeam() {
        return scoreSecondTeam;
    }

    public void setScoreSecondTeam(int pScoreSecondTeam) {
        scoreSecondTeam = pScoreSecondTeam;
    }
}
