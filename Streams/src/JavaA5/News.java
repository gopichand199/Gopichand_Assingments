package JavaA5;

public class News {
	private int newsid;
	private String postedByUser,commentByUser,comment;
			
	public News(int newsid,String postedByUser,String commentByUser,String comment) {
		super();
		this.newsid=newsid;
		this.postedByUser=postedByUser;
		this.commentByUser=commentByUser;
		this.comment=comment;
	}
	public int getnewsid() {
    	return newsid;
    }
    public void setnewsid(int newsid) {
    	this.newsid=newsid;
    }
    public String getpostedByUser() {
    	return postedByUser;
    }
    public void setpostedByUser(String postedByUser) {
    	this.postedByUser=postedByUser;
    }
    public String getcommentByUser() {
    	return commentByUser;
    }
    public void setcommentByUser(String commentByUser) {
    	this.commentByUser=commentByUser;
    }
    public String getcomment() {
    	return comment;
    }
    public void setcomment(String comment) {
    	this.comment=comment;
    }
    public String toString() {
    	return "News [newsid=" + newsid + ", postedByUser=" + postedByUser + ", commentByUser=" + commentByUser + ", comment=" + comment + "]";
    }
      
}


