package uk.co.codeecho.fixture.generator;

public class Fixture<T extends Object> {

    T homeTeam;
    T awayTeam;

    public Fixture(T homeTeam, T awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public T getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(T homeTeam) {
        this.homeTeam = homeTeam;
    }

    public T getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(T awayTeam) {
        this.awayTeam = awayTeam;
    }

}
