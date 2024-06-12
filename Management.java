import java.util.ArrayList;
import java.util.Random;

class Management {
    public static String spawnStratigy = "eco start";
    public static String attackStratigy = "expand"; // also have deplete aka take all their resources, defend borders
    public static ArrayList<Zone> zones = new ArrayList<Zone>();
    public static ArrayList<Integer> owners = new ArrayList<Integer>();
    public static ArrayList<ArrayList<Zone>> zoneValues = new ArrayList<ArrayList<Zone>>();
    public static int 
    public static int platinum;
    private static final int cost = 20;
    private static int canSpawn;
    public Management() {
        this.zones = zones;
        this.zoneValues = zoneValues;
        this.platinum = platinum;
        this.owners = owners;
    }
    public static void addZone(Zone zone) {
        Management.zones.add(zone);
        Management.owners.add(zone.ownerId);
    } 
    public static void assignZoneValues() {
        for(int i = 0; i < 7; i++) {
            zoneValues.add(new ArrayList<Zone>());
        }
        for(int i = 0; i < Management.zones.size(); i++) {
            Zone current = zones.get(i);
            zoneValues.set(zoneValues.get(current.platinumSource).add(current));
        }
    }
    
    public static String spawn() {
        ArrayList<Zone> ownedZones = new ArrayList<Zone>();
        for (Integer zone : owners) {
            if (zone == ) {
                
            }
        }
        String output = "";
        canSpawn = platinum / cost;
        ArrayList<Zone> targets = new ArrayList<Zone>();
        Random rand = new Random();
        switch (spawnStratigy) {
            case "eco start":
                for(int i = 0; i < 10; i++) {
                    if (zoneValues.get(6).size() >= 10) {
                        targets.add(zoneValues.get(6).get(rand.nextInt(zoneValues.get(6).size())));
                    } else {
                        int temp = 10;
                        if(i = zoneValues.get(6).size()){
                            targets.add(zoneValues.get(6).get(i));
                        } else {
                            targets.add(zoneValues.get(5).get(rand.nextInt(zoneValues.get(6)).size()));
                        }
                    }
                }
                break;
            case "eco":
                
            case "agro":
            case "defense":
            default:
                break;
            for(int i = 0; i < targets.size(); i++) {
                output = output + " " + (canSpawn / targets.size()) + " " + targets.get(i);
            }
            return output;
        }
    }
    
}