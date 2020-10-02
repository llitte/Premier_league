package mongkhonsin.atsadawut.premierleague.model;

public class TeamList {
    public final int imageResId;
    public final String name, address;
    public TeamList(int imageResId, String name, String address) {
        this.imageResId = imageResId;
        this.name = name;
        this.address = address;
    }
}
