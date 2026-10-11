package org.example.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TreeTest {
    @Test
    void countsBalancedNodesInTree() {
        Tree.Node leaf5 = new Tree.Node();
        Tree.Node leaf6 = new Tree.Node();
        Tree.Node leaf7 = new Tree.Node();
        Tree.Node leaf8 = new Tree.Node();
        Tree.Node leaf9 = new Tree.Node();

        Tree.Node node4 = new Tree.Node(leaf9);
        Tree.Node node1 = new Tree.Node(node4, leaf5);
        Tree.Node node2 = new Tree.Node(leaf6);
        Tree.Node node3 = new Tree.Node(leaf7, leaf8);
        Tree.Node root = new Tree.Node(node1, node2, node3);

        assertEquals(8, new Tree().getNumberOfBalancedNodes(root));
    }
}
