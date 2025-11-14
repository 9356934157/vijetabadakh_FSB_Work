package assingent0;

public class Moive {
	String title;
    String director;
    String language;
    double duration; 
    double rating; 
    int releaseYear;
    
    Moive(){
    	this.title="sads";
        this.director="Unknown";
        this.language="English";
        this.duration=23;
        this.rating=5;
        this.releaseYear=3;
    }
    Moive(String t,String d,String lan,double dur,double rat,int year){
    	this.title=t;
        this.director=lan;
        this.language=d;
        this.duration=dur;
        this.rating=rat;
        this.releaseYear=year;
    }
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
    void display() {
    	System.out.println("titile is :"+this.title);
    	System.out.println("director is :"+this.director);
    	System.out.println("language is :"+this.language);
    	System.out.println("duration is :"+this.duration);
    	System.out.println("rating is :"+this.rating);
    	System.out.println("release year is :"+this.releaseYear);
    		
    }
    void movieType() {
        System.out.println("This is a Horror Movie");
    }
}
    class ActionMoive extends Moive{
    	 int noOfFightScenes;
    	 boolean hasSuperhero;
    	 double stuntBudget;
    	 

    	 ActionMoive(){
    		 super();
    		 this.noOfFightScenes=34;
    		 this.hasSuperhero=true;
    		 this.stuntBudget=57;
    	 }
    	 ActionMoive(String t,String d,String lan,double dur,double rat,int year,int f,boolean s,double b){
    		 super(t,d,lan,dur,rat,year);
    		 
    		 this.noOfFightScenes=f;
    		 this.hasSuperhero=s;
    		 this.stuntBudget=b;
    	 }
		public int getNoOfFightScenes() {
			return noOfFightScenes;
		}
		public void setNoOfFightScenes(int noOfFightScenes) {
			this.noOfFightScenes = noOfFightScenes;
		}
		public boolean isHasSuperhero() {
			return hasSuperhero;
		}
		public void setHasSuperhero(boolean hasSuperhero) {
			this.hasSuperhero = hasSuperhero;
		}
		public double getStuntBudget() {
			return stuntBudget;
		}
		public void setStuntBudget(double stuntBudget) {
			this.stuntBudget = stuntBudget;
		}
    	 
		 void display() {
			 super.display();
		    	System.out.println("no Of FightScenes is :"+this.noOfFightScenes);
		    	System.out.println("hasSuperhero is :"+this.hasSuperhero);
		    	System.out.println("stuntBudget is :"+this.stuntBudget);
		 }
		 void movieType() {
		        System.out.println("This is an Action Movie");
		    }
    }
    class ComedyMovie extends Moive{
    	int noOfJokes;
        String mainComedian;
        boolean hasRomance;
        
        ComedyMovie(){
        	super();
        	this.noOfJokes=34;
        	this.mainComedian="htydu";
        	this.hasRomance=false;
    
        }
        ComedyMovie(String t,String d,String lan,double dur,double rat,int year,int jok,String com,boolean rom){
        	super(t,d,lan,dur,rat,year);
        	this.noOfJokes=jok;
        	this.mainComedian=com;
        	this.hasRomance=rom;
    
        }
		public int getNoOfJokes() {
			return noOfJokes;
		}
		public void setNoOfJokes(int noOfJokes) {
			this.noOfJokes = noOfJokes;
		}
		public String getMainComedian() {
			return mainComedian;
		}
		public void setMainComedian(String mainComedian) {
			this.mainComedian = mainComedian;
		}
		public boolean isHasRomance() {
			return hasRomance;
		}
		public void setHasRomance(boolean hasRomance) {
			this.hasRomance = hasRomance;
		}
        void display() {
         super.display();
         System.out.println("No. of Jokes: " + noOfJokes);
         System.out.println("Main Comedian: " + mainComedian);
         System.out.println("Has Romance: " + hasRomance);
         }
        
        void movieType() {
            System.out.println("This is a Comedy Movie");
        }
    }
    class HorrorMovie extends Moive {
        int noOfScaryScenes;
        boolean hasGhosts;
        String horrorType;
        
        HorrorMovie(){
        	super();
        	this.noOfScaryScenes=435;
        	this.hasGhosts=true;
        	this.horrorType="wegaer";
        	
        }
        HorrorMovie(String t,String d,String lan,double dur,double rat,int year,int ss,boolean g,String hor){
        	super(t,d,lan,dur,rat,year);
        	this.noOfScaryScenes=ss;
        	this.hasGhosts=g;
        	this.horrorType=hor;
        	
        }
		public int getNoOfScaryScenes() {
			return noOfScaryScenes;
		}
		public void setNoOfScaryScenes(int noOfScaryScenes) {
			this.noOfScaryScenes = noOfScaryScenes;
		}
		public boolean isHasGhosts() {
			return hasGhosts;
		}
		public void setHasGhosts(boolean hasGhosts) {
			this.hasGhosts = hasGhosts;
		}
		public String getHorrorType() {
			return horrorType;
		}
		public void setHorrorType(String horrorType) {
			this.horrorType = horrorType;
		}
        void display() {
        	super.display();
        	System.out.println("Scary Scenes: " + noOfScaryScenes);
            System.out.println("Has Ghosts: " + hasGhosts);
            System.out.println("Horror Type: " + horrorType);
        }
        void movieType() {
            System.out.println("This is a Horror Movie");
        }
    }
  

class test9{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Moive m1= new Moive();
//		Moive m2= new Moive("efet","fsdf","eterg",23,34,464);
//		
//		m1.display();
//		m2.display();
//		
//		ActionMoive a1= new ActionMoive();
//		ActionMoive a2= new ActionMoive("dfds","sfsd","afef",243,534,34,345,true,345);
//		
//		a1.display();
//		a2.display();
//		
//		ComedyMovie c1=new ComedyMovie();
//		ComedyMovie c2= new ComedyMovie();
//		
//		c1.display();
//		c2.display();
//		
//		HorrorMovie h1= new HorrorMovie();
//		HorrorMovie h2 = new HorrorMovie();
//		
//		h1.display();
//		h2.display();

		Moive m1;
		m1=new ActionMoive();
		m1= new ActionMoive("dfds","sfsd","afef",243,534,34,345,true,345);
		m1.display();
		m1.movieType();
		
		m1=new ComedyMovie();
		m1.display();
		m1.movieType();
		
		m1=new HorrorMovie();
		m1.display();
		m1.movieType();
	}
	

}
