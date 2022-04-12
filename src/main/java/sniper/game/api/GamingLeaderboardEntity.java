package sniper.game.api;

import com.akkaserverless.javasdk.eventsourcedentity.EventSourcedEntity;
import com.akkaserverless.javasdk.eventsourcedentity.EventSourcedEntity.Effect;
import com.akkaserverless.javasdk.eventsourcedentity.EventSourcedEntityContext;
import com.google.protobuf.Empty;
import sniper.game.domain.SniperGameDomain;

// This class was initially generated based on the .proto definition by Akka Serverless tooling.
// This is the implementation for the Event Sourced Entity Service described in your sniper/game/api/sniper_game_api.proto file.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

public class GamingLeaderboardEntity extends AbstractGamingLeaderboardEntity {

  @SuppressWarnings("unused")
  private final String entityId;

  public GamingLeaderboardEntity(EventSourcedEntityContext context) {
    this.entityId = context.entityId();
  }

  @Override
  public SniperGameDomain.LeaderBoardState emptyState() {
    throw new UnsupportedOperationException("Not implemented yet, replace with your empty entity state");
  }

  @Override
  public Effect<Empty> createAppointment(SniperGameDomain.LeaderBoardState currentState, SniperGameApi.AddPlayer addPlayer) {
    return effects().error("The command handler for `CreateAppointment` is not implemented, yet");
  }

  @Override
  public Effect<Empty> updateScore(SniperGameDomain.LeaderBoardState currentState, SniperGameApi.UpdatePlayerScore updatePlayerScore) {
    return effects().error("The command handler for `UpdateScore` is not implemented, yet");
  }

  @Override
  public Effect<SniperGameApi.LeaderBoard> fetchScores(SniperGameDomain.LeaderBoardState currentState, SniperGameApi.GetScores getScores) {
    return effects().error("The command handler for `FetchScores` is not implemented, yet");
  }

  @Override
  public SniperGameDomain.LeaderBoardState playerAdded(SniperGameDomain.LeaderBoardState currentState, SniperGameDomain.PlayerAdded playerAdded) {
    throw new RuntimeException("The event handler for `PlayerAdded` is not implemented, yet");
  }
  @Override
  public SniperGameDomain.LeaderBoardState playerScored(SniperGameDomain.LeaderBoardState currentState, SniperGameDomain.PlayerScored playerScored) {
    throw new RuntimeException("The event handler for `PlayerScored` is not implemented, yet");
  }

}
