package bj.highfive.springboodemo;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // ceci signifie que cette classe est un controlleur
@RequestMapping(path = "/api") // ceci signifie que l'url commence par /api (après l'url de l'application)
public class AlbumController {
    @Autowired // Ceci demande à Java d'injecter le "bean" userRepository
    AlbumRepository albumRepository;

    //Create
    @PostMapping("/album")
    public Album createAlbum(Album album){
        return this.albumRepository.save(album);
    }

    @PostMapping("/albums")
    public Iterable<Album> createAlbum(List<Album> albums){
        return this. albumRepository.saveAll(albums);
    }

    //Read
    // @RequestMapping(path = "/hello", method = RequestMethod.POST) le 1
    @GetMapping(path = "/albums") // le deux. le 1 et le 2 font la même chose
    public Iterable<Album> getAlbums() {
        // localhost:1234/api/albums
        return this.albumRepository.findAll();
    }


    @GetMapping("/albums/{id}")
    public Album getAlbumById(Long id){
        return this.albumRepository.findById(id).orElse(null);
    }


    //Update 
    @PutMapping("/albums")
    public Album updAlbum(Album album) {
        Album existingAlbum = this.albumRepository.findById(album.getId()).orElse(null);
        existingAlbum.setRef(album.getRef());
        existingAlbum.setName(album.getName());
        existingAlbum.setTitle(album.getTitle());
        existingAlbum.setDescription(album.getDescription());
        existingAlbum.setDuration(album.getDuration());
        existingAlbum.setStatus(album.getStatus());
        existingAlbum.setUrl(album.getUrl());
        existingAlbum.setTags(album.getTags());
        existingAlbum.setLike(album.getLike());

        return this.albumRepository.save(existingAlbum);
    }

    // Delete
    @DeleteMapping("/albums/{album.id}")
    public String deleteAlbum(Long id) {
        this.albumRepository.deleteById(id);
        return "Album supprimé: " + id;
    }

 
}
