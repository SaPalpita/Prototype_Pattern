public class Play {
    public static void main(String[] args) {
        Registry registry=new Registry();

        Cricket cricket=(Cricket) registry.getSport(SportName.CRICKET);
        System.out.println(cricket);

        cricket.setMaxAge(50);

        System.out.println(cricket);

        Cricket cricket1=(Cricket) registry.getSport(SportName.CRICKET);
        System.out.println(cricket1);
    }
}
