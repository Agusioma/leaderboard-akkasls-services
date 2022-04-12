package sniper.game.api;

import com.akkaserverless.javasdk.testkit.junit.AkkaServerlessTestKitResource;
import com.google.protobuf.Empty;
import org.junit.ClassRule;
import org.junit.Test;
import sniper.game.Main;
import sniper.game.domain.SniperGameDomain;

import static java.util.concurrent.TimeUnit.*;

// This class was initially generated based on the .proto definition by Akka Serverless tooling.
//
// As long as this file exists it will not be overwritten: you can maintain it yourself,
// or delete it so it is regenerated as needed.

// Example of an integration test calling our service via the Akka Serverless proxy
// Run all test classes ending with "IntegrationTest" using `mvn verify -Pit`
public class GamingLeaderboardEntityIntegrationTest {

  /**
   * The test kit starts both the service container and the Akka Serverless proxy.
   */
  @ClassRule
  public static final AkkaServerlessTestKitResource testKit =
    new AkkaServerlessTestKitResource(Main.createAkkaServerless());

  /**
   * Use the generated gRPC client to call the service through the Akka Serverless proxy.
   */
  private final LeaderboardDemo client;

  public GamingLeaderboardEntityIntegrationTest() {
    client = testKit.getGrpcClient(LeaderboardDemo.class);
  }

  @Test
  public void createAppointmentOnNonExistingEntity() throws Exception {
    // TODO: set fields in command, and provide assertions to match replies
    // client.createAppointment(SniperGameApi.AddPlayer.newBuilder().build())
    //         .toCompletableFuture().get(5, SECONDS);
  }

  @Test
  public void updateScoreOnNonExistingEntity() throws Exception {
    // TODO: set fields in command, and provide assertions to match replies
    // client.updateScore(SniperGameApi.UpdatePlayerScore.newBuilder().build())
    //         .toCompletableFuture().get(5, SECONDS);
  }

  @Test
  public void fetchScoresOnNonExistingEntity() throws Exception {
    // TODO: set fields in command, and provide assertions to match replies
    // client.fetchScores(SniperGameApi.GetScores.newBuilder().build())
    //         .toCompletableFuture().get(5, SECONDS);
  }
}
