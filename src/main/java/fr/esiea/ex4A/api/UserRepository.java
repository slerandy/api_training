package fr.esiea.ex4A.api;

import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Repository
public class UserRepository {
    private List<UserData> users;

    UserRepository(){
        this.users = new LinkedList<UserData>();
    }

    public void save(UserData user) {
        users.add(user);

    }

    public List<Match> getMatches(String userName, String userCountry) {
        List<Match> matches = new LinkedList<>();
        for (UserData u : users)
            matches.add(new Match(u.userName, u.userCountry));
        return matches;
    }


    public class Match<N, C> {
        public final N name;
        public final C country;

        public Match(N name, C country) {
            assert name != null;
            assert country != null;

            this.name = name;
            this.country = country;
        }
    }
}



