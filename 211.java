public class WordDictionary {
    // Trie Node
    class Node{ 
        // String word = ""; // will be set as  actual word when this node is "end of the word". "" otherwise.
        boolean isEnd = false;
        Node[] subs = new Node[26]; // a-z
    }
    
    private Node root = new Node(); //special value
    
    static int index(char c){
        return c-'a';
    }
    
    // Adds a word into the data structure.
    public void addWord(String word) {
        Node cur = root;
        for(char c : word.toCharArray()){
            if(cur.subs[index(c)] == null)
                cur.subs[index(c)] = new Node();                
            cur = cur.subs[index(c)]; // forward
        }       
        cur.isEnd = true;
    }

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
        return search(root, word, 0);
    }
    
    private boolean search (Node cur, String word, int idx){
        if(cur == null) return false;
        else if(idx == word.length()){
            return cur.isEnd; // some words ended here.
        }       
        final char c = word.charAt(idx);   
        if(c == '.'){
            /*check existance*/
            for(Node n : cur.subs)
                if(search (n, word, idx + 1))
                    return true;           
            return false;
        }
        else{
            Node n = cur.subs[index(c)];
            return search(n, word, idx +1);
        }
    }
}