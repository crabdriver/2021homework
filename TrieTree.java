class Trie{
	Trie[] next = new Trie[26];
	boolean isEnd = false;

	public Trie(){
	}

	public void insert(String world){
	Trie curr = this;
	for(char c:word.toCharArray()){
	   if(curr.next[c-'a']== null){
	      curr.next[c-'a']= new Trie();
	   }
	   curr = curr.next[c-'a'];
	}
	curr.isEnd = true;
	}

	public boolean search(String world){
	Trie curr = this;
	for(char c:word.toCharArray()){
	   if(curr.next[c-'a']==null) return false;
	   curr = curr.next[c-'a'];
	}
	return curr.isEnd;
	}

	public boolean startWith(String prefix){
	Trie curr = this;
	for(char c:prefix.toCharArray()){
	 if(curr.next[c-'a']== null) return false;
	 curr = curr.next[c-'a'];
	}
	return true;
	}
}