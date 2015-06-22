
package uk.co.codeecho.fixture.generator;

import uk.co.codeecho.fixture.generator.Fixture;
import uk.co.codeecho.fixture.generator.FixtureGenerator;
import java.util.LinkedList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class FixtureGeneratorTest {

    public FixtureGeneratorTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testGetFixtures() {
        FixtureGenerator<String> fixtureGenerator = new FixtureGenerator();
        List<String> teams = new LinkedList<String>();
        teams.add("Team 1");
        teams.add("Team 2");
        teams.add("Team 3");
        teams.add("Team 4");
        List<List<Fixture<String>>> rounds = fixtureGenerator.getFixtures(teams, true);
        for(int i=0; i<rounds.size(); i++){
            System.out.println("Round " + (i+1));
            List<Fixture<String>> round = rounds.get(i);
            for(Fixture<String> fixture: round){
                System.out.println(fixture.getHomeTeam() + " vs " + fixture.getAwayTeam());
            }
            System.out.println("");
        }
    }

}