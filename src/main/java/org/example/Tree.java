package org.example;

public class Tree {
    public static void main(String[] args) {
        Tree tree = new Tree();

        // getNumberOfBalancedNodes
        // 리프 노드
        Node n5 = new Node();
        Node n6 = new Node();
        Node n7 = new Node();
        Node n8 = new Node();
        Node n9 = new Node();

        // 노드 4: 자식 9
        Node n4 = new Node(n9);

        // 노드 1: 자식 4, 5
        Node n1 = new Node(n4, n5);

        // 노드 2: 자식 6
        Node n2 = new Node(n6);

        // 노드 3: 자식 7, 8
        Node n3 = new Node(n7, n8);

        // 루트 노드 0: 자식 1, 2, 3
        Node root = new Node(n1, n2, n3);

        // 테스트
        // 예상 결과: 8
        int result = tree.getNumberOfBalancedNodes(root);
        System.out.println(result);
    }

    static class Node {
        Node[] children;

        Node(Node... children) {
            this.children = children;
        }
    }

    // getNumberOfBalancedNodes
    public int getNumberOfBalancedNodes(Node tree) {
        if (tree == null) {
            return 0;
        }

        int count = 0;

        // 현재 노드가 밸런스 노드인지 확인
        if (isBalanced(tree)) {
            count++;
        }

        // 모든 자식 노드를 재귀적으로 탐색
        if (tree.children != null) {
            for (Node child : tree.children) {
                count += getNumberOfBalancedNodes(child);
            }
        }

        return count;
    }

    private boolean isBalanced(Node node) {
        Node[] children = node.children;

        // 자식이 0개 또는 1개라면 밸런스 노드
        if (children == null || children.length <= 1) {
            return true;
        }

        // 첫 번째 자식의 직계 자식 수를 기준으로 설정
        int expectedCount = getChildCount(children[0]);

        // 나머지 자식의 직계 자식 수와 비교
        for (int i = 1; i < children.length; i++) {
            if (getChildCount(children[i]) != expectedCount) {
                return false;
            }
        }

        return true;
    }

    private int getChildCount(Node node) {
        if (node.children == null) {
            return 0;
        }

        return node.children.length;
    }

}
