package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CloneGraph {

    private Map<Integer, Node> map = new HashMap<>();

    public Node cloneGraphBest(Node node) {
        if (node == null) {
            return null;
        }

        if (map.containsKey(node.val)) {
            return map.get(node.val);
        }

        Node copyNode = new Node(node.val, new ArrayList<>());
        map.put(node.val, copyNode);
        for (Node n : node.neighbors) {
            copyNode.neighbors.add(cloneGraphBest(n));
        }

        return copyNode;
    }

}
