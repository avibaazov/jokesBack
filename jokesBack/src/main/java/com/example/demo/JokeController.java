package com.example.demo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JokeController {
  
//	private static final List<Joke> jokes = Arrays.asList(
//    new Joke("Why did the chicken cross the road? To get to the other side."),
//    new Joke("Why do programmers prefer dark mode? Because light attracts bugs."),
//    new Joke("What do you call a fake noodle? An impasta.")
//  );
	private static final int CHICKEN_INDEX=0;
	private static final int PROG_INDEX=1;
	private static final int FOOD_INDEX=2;
	private static final Joke[][] jokes = {
			  {
			    new Joke("Chicken Jokes", "Why did the chicken cross the road?To get to the other side."),
			    new Joke("Chicken Jokes", "Why did the chicken join a band?Because he had drumsticks."),
			    new Joke("Chicken Jokes", "Why did the chicken wear a tuxedo?Because he was egg-cited for the wedding.")
			  },
			  {
			    new Joke("Programming Jokes", "Why do programmers prefer dark mode?Because light attracts bugs."),
			    new Joke("Programming Jokes", "Why was the JavaScript developer sad?Because he didn't know how to 'null' his feelings."),
			    new Joke("Programming Jokes", "Why don't programmers like nature? It has too many bugs.")
			  },
			  {
			    new Joke("Food Jokes", "What do you call a fake noodle?An impasta."),
			    new Joke("Food Jokes", "Why did the tomato turn red?Because it saw the salad dressing."),
			    new Joke("Food Jokes", "Why don't eggs tell jokes?Because they'd crack each other up.")
			  }
			};

  @GetMapping("/jokes/random")
  public String getRandomJoke() {
	  Random random = new Random();
	  int categoryIndex = random.nextInt(jokes.length);
	  int jokeIndex = random.nextInt(jokes[categoryIndex].length);
	  return jokes[categoryIndex][jokeIndex].toString();
	}
  @GetMapping("/jokes/food/random")
  public String getRandomFoodJoke() {
	  Random random = new Random();
	 // int categoryIndex = random.nextInt(jokes.length);
	  int jokeIndex = random.nextInt(jokes[FOOD_INDEX].length);
	  return jokes[FOOD_INDEX][jokeIndex].toString();
	}
  @GetMapping("/jokes/programming/random")
  public String getRandomProgrammingJoke() {
	  Random random = new Random();
	 // int categoryIndex = random.nextInt(jokes.length);
	  int jokeIndex = random.nextInt(jokes[PROG_INDEX].length);
	  return jokes[PROG_INDEX][jokeIndex].toString();
	  
	}
  @GetMapping("/jokes/chicken/random")
  public String getRandomChickenJoke() {
	  Random random = new Random();
	 // int categoryIndex = random.nextInt(jokes.length);
	  int jokeIndex = random.nextInt(jokes[CHICKEN_INDEX].length);
	  return jokes[CHICKEN_INDEX][jokeIndex].toString();
	}
  
}