package com.beTalent.game.service;

import com.beTalent.game.model.Game;
import com.beTalent.game.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameRepository gameRepository;
    @Override
    public Game createGame(Game game) {
        return gameRepository.save(game);
    }

    @Override
    public List<Game> getGames() {
        return (List<Game>) gameRepository.findAll();
    }

    @Override
    public Game getById(long id) {
        return gameRepository.findById(id).get();
    }

    @Override
    public void deleteGame(long id) {
        gameRepository.deleteById(id);
    }

    @Override
    public Game updateGame(Game game, long id) {
        Game game1 = gameRepository.findById(id).get();
        game1.setTitle(game.getTitle());
        game1.setPrice(game.getPrice());
        game1.setCodebar(game.getCodebar());
        game1.setDescription(game.getDescription());
        return gameRepository.save(game1);
    }


}
