package CollectionsVeMapInterface.Odev_FiksturOlusturucu;

import java.util.*;


public class MatchMixer {
 List<String> teams = new ArrayList<>();
Scanner in = new Scanner(System.in);
Random r = new Random();
    public void fixture(){
        System.out.println("Enter team names - to exit press 0");//Exception yok
        int choice = -1;
        while(choice != 0){
            System.out.println("Team Name : ");
            String t = in.next();
            teams.add(t);
            System.out.println("Want add more - to continue press any number except 0 ");
            choice = in.nextInt();
        }
        if(teams.size() % 2 == 1){
            teams.add("Bay");
        }
        //List<String> tempTeams = new ArrayList<>();
        LinkedHashSet<String> doneMatches = new LinkedHashSet();
        int weeks = (teams.size()-1)*2;
        int matchCount = teams.size()/2;

        for(int i = 0; i<weeks;i++){
            List<String> tempTeams = new ArrayList<>(teams);
            while (doneMatches.size() != (i+1)*3){
                String r1 = teams.get(r.nextInt(tempTeams.size()));
                String r2 = teams.get(r.nextInt(tempTeams.size()));

                if (!r1.equals(r2) && !doneMatches.contains(r1 + " vs "+r2)){
                    doneMatches.add(r1+" vs "+r2);
                    tempTeams.remove(r1);
                    tempTeams.remove(r2);
                }
            }
        }

        int itemCount=0;
        for (String item:doneMatches){
            System.out.println(item);
            itemCount++;
            if(itemCount%3==0)
                System.out.println("##############################################################################");
        }
 }
}
