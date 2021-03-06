package Generics.OurGenericClass;

import java.util.ArrayList;

public class Team<T extends Player> {
    private String name;

    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();
    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * This method will return wherther a player acn be added ito the ArrayList  or not
     * @param player
     * @return true if a palyer acan be added or otherwise false
     */
    public boolean addPlayer(T player){
        if (members.contains(player)){
//            System.out.println(((Player)player).getName()+" is already in the team");
                //No need to cast to Player as done above after T extends Player
            System.out.println(player.getName()+" is already in the team");
            return false;
        }else {
            members.add(player);
//            System.out.println(player.getName()+" picked for the team "+this.name);  //this.name is the actual team name
            //Above code is giving error on adding T generic type to Team class
            System.out.println(((Player)player).getName()+" picked for the team "+this.name);  //this.name is the actual team name
            return true;
        }
    }

    /**
     * This method will give return number of members in  a team
     * @return
     */
    public int numOfPlayers(){
        return this.members.size();
    }

    /**
     * This method will give the matchResults of your team and your opponent
     * @param opponent
     * @param ourScore
     * @param theirScore
     */
    public void matchResults(Team<T> opponent, int ourScore , int theirScore){
        String message;
        if (ourScore>theirScore){
            won++;
            message = " best ";
        }else if (ourScore==theirScore){
            tied++;
            message = " drew with ";
        }else {
            lost++;
            message = " lost to ";
        }
        played++;
        if (opponent!=null){
            System.out.println(this.getName()+ message + opponent.getName());
            opponent.matchResults(null,theirScore,ourScore);
        }
    }

    /**
     * This method is just a way of ranking you can implement
     * @return
     */
    public int ranking(){
        return (won*2)+tied;
    }
}
