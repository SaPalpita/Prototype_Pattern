import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<SportName, Sport> sports=new HashMap<>();

    public Registry(){
        this.initialize();

    }

    private void initialize() {
        Cricket cricket=new Cricket();
        cricket.setMaxAge(40);
        cricket.setNumberOfTeams(2);
        cricket.setSportType("Mini");
        cricket.setTeamMembers(11);

        VolleyBall volleyBall=new VolleyBall();
        volleyBall.setSportType("Normal");
        volleyBall.setGender("Female");
        volleyBall.setTeamMembers(15);
        volleyBall.setNumberOfTeams(2);

        sports.put(SportName.CRICKET,cricket);
        sports.put(SportName.VOLLEYBALL,volleyBall);

    }

    public Sport getSport(SportName sportName){
        Sport sport=null;
        try {
           sport=(Sport) sports.get(sportName).clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return sport;
    }


}
