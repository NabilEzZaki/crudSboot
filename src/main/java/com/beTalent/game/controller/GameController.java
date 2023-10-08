package com.beTalent.game.controller;

import com.beTalent.game.model.Game;
import com.beTalent.game.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class GameController {
    @Autowired
    private GameService gameService;

//    @GetMapping("/")
//    public ResponseEntity<Void> redirectWithResponseEntity() {
//        return ResponseEntity.status(302).location(URI.create("http://localhost:4200/view")).build();
//    }
    @PostMapping("/add")
    public Game createGame(@RequestBody Game game){
        Game game1 = gameService.createGame(game);
        return game1;
    }

    @GetMapping("/games")
    public List<Game> getAll(){;
        return gameService.getGames();
    }

    @PutMapping("/update/{id}")
    public Game updateGame(@RequestBody Game user, @PathVariable("id") long id){
        return gameService.updateGame(user, id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteGame(@PathVariable("id") long id){
        gameService.deleteGame(id);
        return "Articolo eliminato correttamente";
    }

    @GetMapping("/game/{id}")
    public Game getById(@PathVariable("id") long id){
        return gameService.getById(id);
    }
}
