package CollectionsVeMapInterface.Odev_FiksturOlusturucu;

import java.util.*;


public class MatchMixer {
    List<String> teams = new ArrayList<>();
    HashMap<String,String> versusTeams = new HashMap<>();

    public MatchMixer(){
        int week = 1;
        teams.add("Fenerbahçe");
        teams.add("Beşiktaş");
        teams.add("Galatasaray");
        teams.add("Bursaspor");

        for (int i = 0; i<teams.size();i++)
            for(int j = 0;j<teams.size();j++){
                if (!teams.get(i).equals(teams.get(j))){
                    versusTeams.put(teams.get(i),teams.get(j));
                }
            }


        int dailyMatch = teams.size()/2;
        Random r = new Random();

    }
}
