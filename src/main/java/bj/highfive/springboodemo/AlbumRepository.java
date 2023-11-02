package bj.highfive.springboodemo;

import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends CrudRepository<Album,Long> {
    /*
    Java va automatiquement créer un Java "Bean"
     * C'est comme ci nous avons créer une classe java avec toutes les méthodes (save, find, findById, findAll...) CRUD déjà implémentées.
     */
}
