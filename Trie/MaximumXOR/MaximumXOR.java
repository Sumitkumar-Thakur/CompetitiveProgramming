class Node {
    Node links[] = new Node[2];
    boolean flag;

    public boolean containsElement(int bit) {
        return links[bit] != null;
    }

    public Node getElement(int bit) {
        return links[bit];
    }

    public void addElement(int bit, Node temp) {
        links[bit] = temp;
    }
}

class Trie {
    Node root;

    public Trie() {
        root = new Node();
    }

    public void insertElement(int num) {
        Node temp = root;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (!temp.containsElement(bit))
                temp.addElement(bit, new Node());
            temp = temp.getElement(bit);
        }
    }

    public int getMax(int num) {
        Node temp = root;
        int result = 0;
        for (int i = 31; i >= 0; i--) {
            int bit = (num >> i) & 1;
            if (temp.containsElement(1 - bit)) {
                result = result | (1 << i);
                temp = temp.getElement(1 - bit);
            } else {
                temp = temp.getElement(bit);
            }
        }
        return result;
    }
}

class Solution {
    public int findMaximumXOR(int[] nums) {
        Trie tree = new Trie();
        for (int i : nums) {
            tree.insertElement(i);
        }
        int MAX = 0;
        for (int i = 0; i < nums.length; i++) {
            MAX = Math.max(MAX, tree.getMax(nums[i]));
        }
        return MAX;
    }
}
