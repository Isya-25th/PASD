public class NodeAntrian {
    Pembeli data;
    NodeAntrian prev, next;

    public NodeAntrian(NodeAntrian prev, Pembeli data, NodeAntrian next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
