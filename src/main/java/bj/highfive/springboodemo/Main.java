package bj.highfive.springboodemo;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class Main {

	
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
	

	//@RequestMapping(path = "/hello", method = RequestMethod.POST) le 1
	@GestMapping("/albums") // le deux. le 1 et le 2 font la même chose
	public List<Album> getAlbums(){
		return generateAlbums();
	}

	private List<Album> generateAlbums(){
		//Pour le simpliscité, on retourne un tableau vide
		Album album1 = new Album("1", "Zouk", "Les rouages de l'amour", "Mr Love", "...", 3000, "true", "https://love.com/album1", Arrays.asList( "Love", "good"), "like");

		Album album2 = new Album("1", "Zouk", "Les rouages de l'amour", "Mr Love", "...", 3000, "true", "https://love.com/album1", Arrays.asList( "Love", "good"), "like");

		Album album3 = new Album("1", "Zouk", "Les rouages de l'amour", "Mr Love", "...", 3000, "true", "https://love.com/album1", Arrays.asList( "Love", "good"), "like");

		Album album4 = new Album("1", "Zouk", "Les rouages de l'amour", "Mr Love", "...", 3000, "true", "https://love.com/album1", Arrays.asList( "Love", "good"), "like");

		System.out.println(album1);

		return Arrays.asList(album1,album2,album3,album4);
	}


	

}
