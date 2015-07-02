package scratch;

import java.util.*;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toSet;

/**
 * Usage example of Stream#flatMap
 */
public class Issue1 {
    public static void main(String[] args) {
        final List<List<Integer>> lists = asList(asList(1, 100, 11), asList(-9, 7, 12));

        final int sum = lists.stream()
                .flatMap(Collection::stream)
                .reduce((el1, el2) -> el1 + el2)
                .get();

        assert Objects.equals(sum, 122);


        Club inter = new Club("Inter", new HashSet<>(asList("Palacio", "Icardi", "Ibra")));
        Club milan = new Club("Milan", new HashSet<>(asList("Kaka", "Diego Lopez", "Ibra")));

        final Set<String> players = Stream.of(inter, milan)
                .flatMap(c -> c.getPlayers().stream())
                .collect(toSet());

        assert Objects.equals(players.size(), 5);
    }
}

class Club {
    private String name;
    private Set<String> players = new HashSet<>();

    public Club(String name, Set<String> players) {
        this.name = name;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getPlayers() {
        return players;
    }

    public void setPlayers(Set<String> players) {
        this.players = players;
    }
}