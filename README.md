# Fixture Generator

A Java library for creating fixture lists.

The following Java code...

```java
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
```

Will create the following output...

```sh
Round 1
Team 1 vs Team 4
Team 2 vs Team 3

Round 2
Team 4 vs Team 3
Team 1 vs Team 2

Round 3
Team 2 vs Team 4
Team 3 vs Team 1

Round 4
Team 4 vs Team 1
Team 3 vs Team 2

Round 5
Team 3 vs Team 4
Team 2 vs Team 1

Round 6
Team 4 vs Team 2
Team 1 vs Team 3
```

The first argument to FixtureGenerator.getFixtures can be a list of any type of objects and it will pair the objects into fixtures. The second argument is a boolean value and determines whether or not the reverse fixtures should be included in the results.
