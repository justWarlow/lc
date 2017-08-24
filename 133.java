/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null) {
            return null;
        }
        if (map.containsKey(node)) {
            return map.get(node);
        }
        UndirectedGraphNode copy = new UndirectedGraphNode(node.label);
        map.put(node, copy);
        for (UndirectedGraphNode n : node.neighbors)
            copy.neighbors.add(cloneGraph(n));
        return copy;
    }
}