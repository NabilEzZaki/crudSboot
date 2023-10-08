package com.beTalent.game.service;

import com.beTalent.game.model.Game;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GameService {
    public Game createGame(Game user);
    public List<Game> getGames();
    public Game getById(long id);
    public void deleteGame(long id);
    public Game updateGame(Game user, long id);
}
