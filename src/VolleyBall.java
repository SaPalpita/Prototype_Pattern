public class VolleyBall extends Sport{

    public String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "VolleyBall{" +
                "gender='" + gender + '\'' +
                '}';
    }
}
