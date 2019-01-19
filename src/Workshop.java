import java.util.*;

public class Workshop {
    private static Map<Integer, Furniture> furnitureMap;
    {
        furnitureMap = new HashMap<>();
        furnitureMap.put(1, new Table(5, new Waste(10, 0), new Waste(2, 1)));
        furnitureMap.put(2, new Chair(3, new Waste(5, 0), new Waste(0, 2)));
        furnitureMap.put(3, new Door(4, new Waste(0, 10), new Waste(1, 0)));
    }
    private int boards;
    private Waste waste;

    Workshop(int boards) {
        this.boards = boards;
        this.waste = new Waste();
    }

    public String getReminded() {
        return this.boards + " " + this.waste.getSawdust() + " " + this.waste.getTrimming();
    }

    private boolean build(Furniture furniture) {
        if (this.waste.getTrimming() >= furniture.getAlternative().getTrimming()
                && waste.getSawdust() >= furniture.getAlternative().getSawdust()) {
            this.removeWaste(furniture.getAlternative());
            return true;
        } else if (this.boards >= furniture.getMain()) {
            this.boards = this.boards - furniture.getMain();
            this.addWaste(furniture.getWaste());
            return true;
        }
        return false;
    }

    private void addWaste(Waste waste) {
        this.waste.setSawdust(this.waste.getSawdust() + waste.getSawdust());
        this.waste.setTrimming(this.waste.getTrimming() + waste.getTrimming());
    }

    private void removeWaste(Waste waste) {
        this.waste.setSawdust(this.waste.getSawdust() - waste.getSawdust());
        this.waste.setTrimming(this.waste.getTrimming() - waste.getTrimming());

    }

    public Map<Integer, Furniture> getFurnitureMap() {
        return furnitureMap;
    }

    public static void main(String[] args) {
        List<Integer> tasks = read();
        Workshop workshop = new Workshop(tasks.get(0));
        for (int i = 1; i < tasks.size(); i++) {
            Furniture furniture = furnitureMap.get(tasks.get(i));
            if (!workshop.build(furniture))
                break;
        }
        System.out.print(workshop.getReminded());
    }

    private static List<Integer> read() {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\s");
        List<Integer> items = new ArrayList<>();
        while (scanner.hasNext()) {
            int nextInt = scanner.nextInt();
            if (nextInt == -1) {
                break;
            }
            items.add(nextInt);
        }
        scanner.close();
        return items;
    }
}

interface Produce {

}

class Furniture {
    private int main;
    private Waste alternative;
    private Waste waste;

    Furniture(int main, Waste alternative, Waste waste) {
        this.main = main;
        this.alternative = alternative;
        this.waste = waste;
    }

    public Waste getAlternative() {
        return alternative;
    }

    public void setAlternative(Waste alternative) {
        this.alternative = alternative;
    }

    public int getMain() {
        return main;
    }

    public void setMain(int main) {
        this.main = main;
    }

    public Waste getWaste() {
        return waste;
    }

    public void setWaste(Waste waste) {
        this.waste = waste;
    }

    @Override
    public String toString() {
        return " main:" + main + ",alternative:" + alternative + ",waste=" + waste;
    }
}

class Table extends Furniture {
    public Table(int main, Waste alternative, Waste waste) {
        super(main, alternative, waste);
    }
}

class Chair extends Furniture {
    public Chair(int main, Waste alternative, Waste waste) {
        super(main, alternative, waste);
    }
}

class Door extends Furniture {
    public Door(int main, Waste alternative, Waste waste) {
        super(main, alternative, waste);
    }
}

class Waste {
    private int sawdust;
    private int trimming;

    public Waste() {
    }

    public Waste(int sawdust, int trimming) {
        this.sawdust = sawdust;
        this.trimming = trimming;
    }

    public int getSawdust() {
        return sawdust;
    }

    public void setSawdust(int sawdust) {
        this.sawdust = sawdust;
    }

    public int getTrimming() {
        return trimming;
    }

    public void setTrimming(int trimming) {
        this.trimming = trimming;
    }

    public String toString() {
        return "sawdist:" + sawdust + ",timming:" + this.trimming;
    }
}