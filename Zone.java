import java.util.ArrayList;

class Zone{
    public int Id;
    public int ownerId;
    public int Defenders;
    public int platinumSource;
    public ArrayList<Integer> Connections = new ArrayList<Integer>();
    public Zone(int id, int Owner, int platinumSource) {
        this.Id = id;
        this.ownerId = Owner;
        this.platinumSource = platinumSource;
        this.Defenders = 0;
    }
    public void updateDefenders(int[] defenders) {
        if(this.ownerId > -1) {
            this.Defenders = defenders[this.ownerId];
        }
    }
    public void updateOwner(int owner) {
        this.ownerId = owner;
    }
    public void addConnection(int connection) {
        Connections.add(connection);
    }
}