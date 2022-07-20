public abstract class Sport implements Cloneable{
    private String sportType;
    private int teamMembers;
    private int numberOfTeams;

    public String getSportType() {
        return sportType;
    }

    public int getTeamMembers() {
        return teamMembers;
    }

    public int getNumberOfTeams() {
        return numberOfTeams;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
    }

    public void setTeamMembers(int teamMembers) {
        this.teamMembers = teamMembers;
    }

    public void setNumberOfTeams(int numberOfTeams) {
        this.numberOfTeams = numberOfTeams;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

