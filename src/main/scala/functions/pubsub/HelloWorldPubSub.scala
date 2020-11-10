package functions.pubsub

import java.nio.charset.StandardCharsets
import java.util.Base64
import java.util.logging.Logger

import com.google.cloud.functions.{BackgroundFunction, Context}
import functions.pubsub.models.PubSubMessage

class HelloWorldPubSub extends BackgroundFunction[PubSubMessage] {
  val logger: Logger = Logger.getLogger(getClass.getName)

  override def accept(message: PubSubMessage, context: Context): Unit = {
    val name = if (message != null && message.data != null) {
      new String(Base64.getDecoder.decode(
        message.data.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8)
    } else {
      "World"
    }

    logger.info(s"name = $name")
  }
}
