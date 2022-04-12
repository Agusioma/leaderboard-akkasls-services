package sniper.game.api;

import com.akkaserverless.javasdk.eventsourcedentity.EventSourcedEntity;
import com.akkaserverless.javasdk.eventsourcedentity.EventSourcedEntityContext;
import com.akkaserverless.javasdk.testkit.EventSourcedResult;
import com.google.protobuf.Empty;
import org.junit.Test;
import sniper.game.domain.SniperGameDomain;

import static org.junit.Assert.*;

// This class was initially generated based on the .proto definition by Akka Serverless tooling.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

public class GamingLeaderboardEntityTest {

  @Test
  public void exampleTest() {
    GamingLeaderboardEntityTestKit testKit = GamingLeaderboardEntityTestKit.of(GamingLeaderboardEntity::new);
    // use the testkit to execute a command
    // of events emitted, or a final updated state:
    // EventSourcedResult<SomeResponse> result = testKit.someOperation(SomeRequest);
    // verify the emitted events
    // ExpectedEvent actualEvent = result.getNextEventOfType(ExpectedEvent.class);
    // assertEquals(expectedEvent, actualEvent)
    // verify the final state after applying the events
    // assertEquals(expectedState, testKit.getState());
    // verify the response
    // SomeResponse actualResponse = result.getReply();
    // assertEquals(expectedResponse, actualResponse);
  }

  @Test
  public void createAppointmentTest() {
    GamingLeaderboardEntityTestKit testKit = GamingLeaderboardEntityTestKit.of(GamingLeaderboardEntity::new);
    // EventSourcedResult<Empty> result = testKit.createAppointment(AddPlayer.newBuilder()...build());
  }


  @Test
  public void updateScoreTest() {
    GamingLeaderboardEntityTestKit testKit = GamingLeaderboardEntityTestKit.of(GamingLeaderboardEntity::new);
    // EventSourcedResult<Empty> result = testKit.updateScore(UpdatePlayerScore.newBuilder()...build());
  }


  @Test
  public void fetchScoresTest() {
    GamingLeaderboardEntityTestKit testKit = GamingLeaderboardEntityTestKit.of(GamingLeaderboardEntity::new);
    // EventSourcedResult<LeaderBoard> result = testKit.fetchScores(GetScores.newBuilder()...build());
  }

}
