class MagicDictionary {
    List<String> dictionary;
    
    /** Initialize your data structure here. */
    public MagicDictionary() {
        dictionary = new ArrayList<>();
    }
    
    /** Build a dictionary through a list of words */
    public void buildDict(String[] dict) {
        for (String str: dict) {
            dictionary.add(str);
        }
    }
    
    /** Returns if there is any word in the trie that equals to the given word after modifying exactly one character */
    public boolean search(String word) {
        for (String str: dictionary) {
        	if (str.length() != word.length()) {
                continue;
            }
        	int diff = 0;
        	for (int i = 0;i < word.length(); i++) {
        		if (word.charAt(i) != str.charAt(i)) {
                    diff++;
                }
        		if (diff > 1) {
                    break;
                }
        	}
        	if (diff == 1) {
                return true;
            }
        }
        return false;
    }
}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dict);
 * boolean param_2 = obj.search(word);
 */
