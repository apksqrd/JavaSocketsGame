package src.main.shooter.game;

import java.util.TreeMap;

import src.main.shooter.game.action.ActionSet;

public class ClientGame {
    private ActionSet actionSet;

    private int playerId;

    private TreeMap<Integer, Entity> entities;

    public ClientGame(int clientId) {
        playerId = clientId;
        actionSet = new ActionSet();
    }

    public ActionSet getActionSet() {
        return actionSet;
    }

    @Deprecated
    public Entity getPlayerEntity() {
        return entities.get(playerId);
    }

    public void addEntity(Entity entity) {
        entities.put(entity.getId(), entity);
    }

    public TreeMap<Integer, Entity> getEntities() {
        return entities;
    }

    public void processEntityList(TreeMap<Integer, Entity> incomingEntityList) {
        entities = incomingEntityList;
    }

    public void tick() {
        // TODO: game logic
    }
}