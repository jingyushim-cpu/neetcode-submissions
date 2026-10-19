public class Node{
    Node next;
    Node prev;
    int key;
    int value;

    public Node(int key, int value){
        next = null;
        prev = null;
        this.key = key;
        this.value = value;
    }
}

class LRUCache {

    HashMap<Integer, Node> map;
    int capacity;;
    Node right;
    Node left;

    public LRUCache(int capacity) {
        map = new HashMap<>();
        this.capacity = capacity;
        this.right = new Node(0, 0);
        this.left = new Node(0, 0);
        this.right.prev = left;
        this.left.next = right;
    }
    
    public void insert(Node node){
        Node prev = this.right.prev;
        prev.next = node;
        node.prev = prev;
        node.next = this.right;
        this.right.prev = node;
    }

    public void remove(Node node){
        Node prev = node.prev;
        Node nxt = node.next;
        prev.next = nxt;
        nxt.prev = prev;
    }

    public int get(int key) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            remove(node);
            insert(node);
            return node.value;
        }

        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            remove(map.get(key));
        }

        Node node = new Node(key, value);
        map.put(key, node);
        insert(node);

        if(map.size() > capacity){
            Node lru = this.left.next;
            remove(lru);
            map.remove(lru.key);
        }
    }
}
