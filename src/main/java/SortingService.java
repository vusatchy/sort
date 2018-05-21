import java.util.*;

public class SortingService {

    private List<Long> x = new ArrayList<>();
    private List<Long> arrayListY = new ArrayList<>();
    private List<Long> linkedListY = new ArrayList<>();
    private Random random = new Random();
    private long min = 10;
    private long max = 10000000;
    private long step = 10;
    private long stepIncrementor = 10;

    public SortingService() {
    }

    public void process() {
        List arrayList = new ArrayList();
        List linkedList = new LinkedList();
        for (long j = min; j <= max; j = j * step) {
            for (int i = 0; i <= j; i++) {
                int randomN = random.nextInt(100);
                arrayList.add(randomN);
                linkedList.add(randomN);
            }
            /*if (j == step * stepIncrementor) {
                step *= stepIncrementor;
            }*/
            x.add(j);
            arrayListY.add(sortAndGetTime(arrayList));
            linkedListY.add(sortAndGetTime(linkedList));
            arrayList = new ArrayList();
            linkedList = new LinkedList();
        }

    }

    public long sortAndGetTime(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        list.sort(Comparator.naturalOrder());
        long current = System.currentTimeMillis();
        return current - startTime;
    }

    public List<Long> getX() {
        return x;
    }

    public void setX(List<Long> x) {
        this.x = x;
    }

    public List<Long> getArrayListY() {
        return arrayListY;
    }

    public void setArrayListY(List<Long> arrayListY) {
        this.arrayListY = arrayListY;
    }

    public List<Long> getLinkedListY() {
        return linkedListY;
    }

    public void setLinkedListY(List<Long> linkedListY) {
        this.linkedListY = linkedListY;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public long getMin() {
        return min;
    }

    public void setMin(long min) {
        this.min = min;
    }

    public long getMax() {
        return max;
    }

    public void setMax(long max) {
        this.max = max;
    }

    public long getStep() {
        return step;
    }

    public void setStep(long step) {
        this.step = step;
    }
}
