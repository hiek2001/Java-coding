package Test;

public class Friend implements Comparable<Friend>{
    private String name;
    private int score;
    
    public Friend() {}
    
    public Friend(String name, int score) {
    	this.name=name;
    	this.score=score;
    }
    
    // setter
    public void setName(String name) {
        this.name = name;
    }
    public void setScore(int score) {
        this.score = score;
    }
    // getter
    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }
    
    
    @Override
    public int compareTo(Friend o) {
    	if(this.score > o.score) return -1;
    	else if(this.score == o.score) return 0;
    	else return 1;
    }
}
