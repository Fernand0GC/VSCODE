package Queues.Structure;

public class test {
    public static void main(String[] args) {
        queues colas = new queues();
        colas.insert(8);
        colas.insert(10);
        colas.insert(78);
        colas.insert(100);
        colas.showQueue();
        colas.erase();
        colas.showQueue();
    }
}
