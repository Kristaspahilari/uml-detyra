import java.util.ArrayList;


public class test {
    public static void main(String[] args){
        Person person = new Person("john", "doe");
        Person person2 = new Person("ana", "hoxha");

        ArrayList<Pjesemarrje> pjesemarrjes = new ArrayList<>();
        Mbledhje mbledhjeKeshillit = new Mbledhje();
        pjesemarrjes.add(
                new Pjesemarrje(person, mbledhjeKeshillit)
        );
        pjesemarrjes.add(
                new Pjesemarrje(person2, mbledhjeKeshillit)
        );



        mbledhjeKeshillit.shtoPjesemarres(pjesemarrjes);

        System.out.println(mbledhjeKeshillit);
    }
}