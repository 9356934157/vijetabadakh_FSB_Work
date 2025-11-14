package assingent0;

public class SocialMediaAcc {
String userName;
boolean isVerified;
String countryOfOrigin;
int noOfOrigin;
int noOfPosts;
int noOfLikes;
int noOfComments;
String impression;

SocialMediaAcc(){
	this.userName="vijeta";
	this.isVerified=true;
	this.countryOfOrigin="dsfd";
	this.noOfOrigin=324;
	this.noOfPosts=34;
	this.noOfComments=34;
	this.impression="gf";
}
SocialMediaAcc(String name,boolean ver,String coun,int org,int like,int com,String impre){
	this.userName=name;
	this.isVerified=ver;
	this.countryOfOrigin=coun;
	this.noOfOrigin=org;
	this.noOfPosts=like;
	this.noOfComments=com;
	this.impression=impre;
	
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public boolean isVerified() {
	return isVerified;
}
public void setVerified(boolean isVerified) {
	this.isVerified = isVerified;
}
public String getCountryOfOrigin() {
	return countryOfOrigin;
}
public void setCountryOfOrigin(String countryOfOrigin) {
	this.countryOfOrigin = countryOfOrigin;
}
public int getNoOfOrigin() {
	return noOfOrigin;
}
public void setNoOfOrigin(int noOfOrigin) {
	this.noOfOrigin = noOfOrigin;
}
public int getNoOfPosts() {
	return noOfPosts;
}
public void setNoOfPosts(int noOfPosts) {
	this.noOfPosts = noOfPosts;
}
public int getNoOfLikes() {
	return noOfLikes;
}
public void setNoOfLikes(int noOfLikes) {
	this.noOfLikes = noOfLikes;
}
public int getNoOfComments() {
	return noOfComments;
}
public void setNoOfComments(int noOfComments) {
	this.noOfComments = noOfComments;
}
public String getImpression() {
	return impression;
}
public void setImpression(String impression) {
	this.impression = impression;
}

void display() {

	System.out.println("user name is :"+this.userName);
	System.out.println(" verified  is :"+this.isVerified);
	System.out.println(" countryOfOrigin is :"+this.countryOfOrigin);
	System.out.println("no of orign :"+this.noOfOrigin);
	System.out.println("no of post is :"+this.noOfPosts);
	System.out.println("no of like :"+this.noOfLikes);
	System.out.println("no of comments is :"+this.noOfComments);
	System.out.println("impression  is :"+this.impression);
}
int calculateEngagementRate()
{
  
    return (noOfLikes + noOfComments) / noOfPosts;
}
}
	class InstagramAcc extends SocialMediaAcc{
		int noOfFollowers;
		int noOfFollowing;
		int noOfHighlights;
		int noOfStroiesArchived;
		int noOfReelShared;
		
		InstagramAcc(){
			super();
			this.noOfFollowers=325;
			this.noOfFollowing=3243;
			this.noOfHighlights=243;
			this.noOfStroiesArchived=234;
			this.noOfReelShared=214;
		}
		
		InstagramAcc(String name,boolean ver,String coun,int org,int like,int com,String impre,int foll,int folling,int hig,int stro,int reel){
			super(name,ver,coun,org,like,com,impre);
			this.noOfFollowers=325;
			this.noOfFollowing=3243;
			this.noOfHighlights=243;
			this.noOfStroiesArchived=234;
			this.noOfReelShared=214;
		}

		public int getNoOfFollowers() {
			return noOfFollowers;
		}

		public void setNoOfFollowers(int noOfFollowers) {
			this.noOfFollowers = noOfFollowers;
		}

		public int getNoOfFollowing() {
			return noOfFollowing;
		}

		public void setNoOfFollowing(int noOfFollowing) {
			this.noOfFollowing = noOfFollowing;
		}

		public int getNoOfHighlights() {
			return noOfHighlights;
		}

		public void setNoOfHighlights(int noOfHighlights) {
			this.noOfHighlights = noOfHighlights;
		}

		public int getNoOfStroiesArchived() {
			return noOfStroiesArchived;
		}

		public void setNoOfStroiesArchived(int noOfStroiesArchived) {
			this.noOfStroiesArchived = noOfStroiesArchived;
		}

		public int getNoOfReelShared() {
			return noOfReelShared;
		}

		public void setNoOfReelShared(int noOfReelShared) {
			this.noOfReelShared = noOfReelShared;
		}
		void display() {
			super.display();
			System.out.println("no of follower :"+this.noOfFollowers);
			System.out.println("no of followers :"+this.noOfFollowing);
			System.out.println("no of Highlights :"+this.noOfHighlights);
			System.out.println("no of StroiesArchived :"+this.noOfStroiesArchived);
			System.out.println("OfReelShared  is :"+this.noOfReelShared);
		}
		int calculateEngagementRate()
		{
		    return (noOfLikes + noOfComments + noOfStroiesArchived) / noOfFollowers;
		}
		
	}


class LinkedAcc  extends SocialMediaAcc{
	int noOfConnenction;
	int noOfPostShared;
	int noOfJobApplied;
	
	LinkedAcc(){
		super();
       this.noOfConnenction=32;
       this.noOfPostShared=32;
       this.noOfJobApplied=43;
	}
	LinkedAcc(String name,boolean ver,String coun,int org,int like,int com,String impre,int conn,int post,int job){
		super(name,ver,coun,org,like,com,impre);
	       this.noOfConnenction=32;
	       this.noOfPostShared=32;
	       this.noOfJobApplied=43;
		}
	public int getNoOfConnenction() {
		return noOfConnenction;
	}
	public void setNoOfConnenction(int noOfConnenction) {
		this.noOfConnenction = noOfConnenction;
	}
	public int getNoOfPostShared() {
		return noOfPostShared;
	}
	public void setNoOfPostShared(int noOfPostShared) {
		this.noOfPostShared = noOfPostShared;
	}
	public int getNoOfJobApplied() {
		return noOfJobApplied;
	}
	public void setNoOfJobApplied(int noOfJobApplied) {
		this.noOfJobApplied = noOfJobApplied;
	}
	
	void display() {
		super.display();
		System.out.println("no of connection :"+this.noOfConnenction);
		System.out.println("no of post shered :"+this.noOfPostShared);
		System.out.println("no of job applied :"+this.noOfJobApplied);
	}
	int calculateEngagementRate()
	{
	    return (noOfLikes + noOfComments + noOfPostShared) / noOfPosts;
	}
}
	
class YouTubeAcc extends SocialMediaAcc{
	int noOfSubscribers;
	double watchTime;
	boolean isMonterized;
	
	YouTubeAcc(){
		super();
		this.noOfSubscribers=34;
		this.watchTime=234;
		this.isMonterized=true;
	}
	YouTubeAcc(String name,boolean ver,String coun,int org,int like,int com,String impre,int sub,int watch,int mon){
		super(name,ver,coun,org,like,com,impre);
		this.noOfSubscribers=34;
		this.watchTime=234;
		this.isMonterized=true;
	}
	public int getNoOfSubscribers() {
		return noOfSubscribers;
	}
	public void setNoOfSubscribers(int noOfSubscribers) {
		this.noOfSubscribers = noOfSubscribers;
	}
	public double getWatchTime() {
		return watchTime;
	}
	public void setWatchTime(double watchTime) {
		this.watchTime = watchTime;
	}
	public boolean isMonterized() {
		return isMonterized;
	}
	public void setMonterized(boolean isMonterized) {
		this.isMonterized = isMonterized;
	}
	
	void display() {
		super.display();
		System.out.println("no Of Subscribers :"+this.noOfSubscribers);
		System.out.println("watchTime :"+this.watchTime);
		System.out.println("isMonterized :"+this.isMonterized);
	}
	int calculateEngagementRate()
	{
	    return (noOfLikes + noOfComments +noOfSubscribers) / noOfPosts;
	}
}

class test8{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SocialMediaAcc s1= new SocialMediaAcc();
//		SocialMediaAcc s2=new SocialMediaAcc("asd",true,"xcf",23,23,23,"dvsdf");
//		
//		s1.display();
//		s2.display();
//		
//		LinkedAcc l1= new LinkedAcc();
//		LinkedAcc l2= new LinkedAcc();
//		
//		l1.display();
//		l2.display();
//		
//		
//		InstagramAcc i1=new InstagramAcc();
//		InstagramAcc i2= new InstagramAcc();
//		
//		i1.display();
//		i2.display();
//		
//		YouTubeAcc y1= new YouTubeAcc();
//		YouTubeAcc y2= new YouTubeAcc();
//		
//		y1.display();
//		y2.display();
		SocialMediaAcc s1;
		s1= new LinkedAcc();
		s1.display();
		s1.calculateEngagementRate();
		
		s1= new InstagramAcc();
		s1.display();
		s1.calculateEngagementRate();
		
		s1=new YouTubeAcc();
		s1.display();
		s1.calculateEngagementRate();
	}

}
