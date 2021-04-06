package fr.esiea.ex4A.api;

public class UserData {
    public String userEmail;
    public String userName;
    public String userTweeter;
    public String userCountry;
    public String userSex;
    public String userSexPref;

//    public enum Gender {
//        F, M, O
//    }
//
//    public enum PreferredGender {
//        F, M, O
//    }

    public UserData(String userEmail, String userName, String userTweeter, String userCountry, String userSex, String userSexPref) {
        this.userEmail = userEmail;
        this.userName = userName;
        this.userTweeter = userTweeter;
        this.userCountry = userCountry;
        this.userSex = userSex;
        this.userSexPref = userSexPref;
    }

    public UserData(){}
}
