public class Pjesemarrje {
    private Person person;
    private Mbledhje mbledhje;

    public Pjesemarrje(Person person, Mbledhje mbledhje) {
        this.person = person;
        this.mbledhje = mbledhje;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Mbledhje getMbledhje() {
        return mbledhje;
    }

    public void setMbledhje(Mbledhje mbledhje) {
        this.mbledhje = mbledhje;
    }

    @Override
    public String toString() {
        return "Pjesemarres: " + person;
    }
}

