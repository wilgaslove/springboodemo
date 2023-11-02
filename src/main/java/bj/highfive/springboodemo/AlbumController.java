package bj.highfive.springboodemo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // ceci signifie que cette classe est un controlleur
@RequestMapping(path = "/api") // ceci signifie que l'url commence par /api (après l'url de l'application)
public class AlbumController {
    @Autowired // Ceci demande à Java d'injecter le "bean" userRepository
    AlbumRepository albumRepository;

    // @RequestMapping(path = "/hello", method = RequestMethod.POST) le 1
    @GestMapping(path = "/albums") // le deux. le 1 et le 2 font la même chose
    public Iterable<Album> getAlbums() {
        // localhost:1234/api/albums
        return this.albumRepository.findAll();
    }

    private List<Album> generateAlbums() {
        // Pour le simpliscité, on retourne un tableau vide
        Album album1 = new Album("Zouk", "Les rouages de l'amour", "Mr Love", "...", 3000, "true",
                "https://love.com/album1", Arrays.asList("Love", "good"), "like");

        Album album2 = new Album("Zouk", "Les rouages de l'amour", "Mr Love", "...", 3000, "true",
                "https://love.com/album1", Arrays.asList("Love", "good"), "like");

        Album album3 = new Album("Zouk", "Les rouages de l'amour", "Mr Love", "...", 3000, "true",
                "https://love.com/album1", Arrays.asList("Love", "good"), "like");

        Album album4 = new Album("Zouk", "Les rouages de l'amour", "Mr Love", "...", 3000, "true",
                "https://love.com/album1", Arrays.asList("Love", "good"), "like");

        System.out.println(album1);

        return Arrays.asList(album1, album2, album3, album4);
    }

}
