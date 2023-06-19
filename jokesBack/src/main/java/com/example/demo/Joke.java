package com.example.demo;

public class Joke {
	
		  private String category;
		  private String punchline;

		  public Joke( String category,String punchline) {
		    this.category=category;
		    this.punchline = punchline;
		  }

		  public String getPunchline() {
		    return punchline;
		  }
		  public String getCategory() {
			return category;
		}

		@Override
		public String toString() {
			return "category:" + category + "\n"+"punchline:" + punchline ;
		}
		  
		
}
