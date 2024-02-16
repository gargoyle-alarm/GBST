public class BinaryCountNode extends BinaryNode {
    
    String val;
    int cnt = 0;
    
    
    public BinaryCountNode(String nVal) {
        super(nVal);
        cnt = 1;
    }
    
    public void increment() {
    	cnt++;
    }
    
    public boolean remove() { // this being a boolean return could either be the play of the century
    	// or also the most dumbass move ill ever make
    	cnt--;
    	if(cnt == 0) {
    		return true;
    	}
    	return false;
    	
    }
    
}