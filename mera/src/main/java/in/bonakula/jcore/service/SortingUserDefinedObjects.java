package in.bonakula.jcore.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Movie{
	private String name;
	private int rank;
	
	public Movie(String name,int rank){
		this.name=name;
		this.rank=rank;		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public String toString(){
		return name+" : "+rank;
	}
	
}

class MovieComparator implements Comparator<Movie>{
	@Override
	public int compare(Movie movie1, Movie movie2) {
		
		
		/* If you want to sort by rank, uncomment the below code		 
		int rank1=movie1.getRank();
		int rank2=movie2.getRank();
		
		if(rank1>rank2){
			return +1;
		}
		else
		if(rank1<rank2){
			return -1;
		}
		else{		
		 return 0;
		}*/
		
		String name1=movie1.getName();
		String name2=movie2.getName();
		
		if(name1.compareTo(name2)>0){
			return +1;
		}
		
		if(name1.compareTo(name2)<0){
			return -1;
		}
		else{
			return 0;
		}
	}
}

public class SortingUserDefinedObjects {

	
	public static void main(String[] args) {
		List<Movie> movies=new ArrayList<Movie>();
		movies.add(new Movie("Magadheera", 1));
		movies.add(new Movie("Dhookudu  ", 3));
		movies.add(new Movie("Pokiri    ", 2));
		movies.add(new Movie("Tagore    ", 4));
		movies.add(new Movie("Athadu    ", 5));
				
		MovieComparator movieComparator=new MovieComparator();
		
		Collections.sort(movies,movieComparator);
		
		for(Movie aMovie: movies){
			System.out.println(aMovie);
		}

	}

}
