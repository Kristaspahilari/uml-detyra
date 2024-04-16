public class Person {
    private String emer;
    private String mbiemer;

    public Person(String emer, String mbiemer) {
        this.emer = emer;
        this.mbiemer = mbiemer;
    }

    public String getEmer() {
        return emer;
    }

    public void setEmer(String emer) {
        this.emer = emer;
    }

    public String getMbiemer() {
        return mbiemer;
    }

    public void setMbiemer(String mbiemer) {
        this.mbiemer = mbiemer;
    }
    @Override
    public String toString() {
        return "Emer: " + emer + " mbiemer: " + mbiemer + "\n";


}
}