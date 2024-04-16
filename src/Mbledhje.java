import java.util.ArrayList;

public class Mbledhje {
    private ArrayList<Pjesemarrje> pjesemarres = new ArrayList<>();

    public Mbledhje(){
        this.pjesemarres = new ArrayList<>();
    }

    public void shtoPjesemarres(ArrayList<Pjesemarrje> p){
        if (pjesemarres.isEmpty() && (p.isEmpty() || p.size() < 2))
            throw new RuntimeException("Nuk mund te krijohet mbledhje me me pak se 2 persona");
        pjesemarres.addAll(p);
    }
    public void hiqPjesemarres(Pjesemarrje p){
        pjesemarres.remove(p);

    }
    public ArrayList<Pjesemarrje> getPjesemarrjes(){
        return pjesemarres;
    }
@Override
    public String toString() {
        return "Pjesemarres ne mbledhje: \n" + pjesemarres;

}
}
