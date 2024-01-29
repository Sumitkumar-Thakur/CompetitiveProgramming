class Node{
    Node links[] = new Node[26];
    boolean flag;
    public boolean containsLetter(char ch){
        return links[ch - 'a'] != null;
    }
    public void put(char ch, Node temp){
         links[ch - 'a'] = temp;
    }
    public Node get(char ch){
        return links[ch - 'a'];
    }
    public void setEnd(){
        flag = true;
    }
    public boolean isEnd(){
        return flag;
    }
    
}
class Trie {
    Node root;
    public Trie() {
        root = new Node();
    }
    
    
    public void insert(String word) {
        Node temp = root;
        
        for(int i=0; i < word.length(); i++){
            if(!temp.containsLetter(word.charAt(i))){
                temp.put(word.charAt(i), new Node());
            }
            temp = temp.get(word.charAt(i));
        }
        temp.setEnd();
    }
    
    public boolean search(String word) {
        Node temp = root;
        for(int i=0; i < word.length(); i++){
            if(!temp.containsLetter(word.charAt(i))) return false;
            temp = temp.get(word.charAt(i));
        } 
        return temp.isEnd();
    }
    
    public boolean startsWith(String prefix) {
        Node temp = root;
        for(int i=0; i < prefix.length(); i++){
            if(!temp.containsLetter(prefix.charAt(i))){
                return false;
            }
            temp = temp.get(prefix.charAt(i));
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */