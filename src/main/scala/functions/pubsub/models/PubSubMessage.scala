package functions.pubsub.models

/**
 *
 * @param data        mandatory field of pub sub message it's going to the data which is being published from pub/sub
 * @param attributes  pub/sub message attributes
 * @param messageId   pub/sub messageId
 * @param publishTime time when the message is being published
 */
case class PubSubMessage(data: String,
                         attributes: Map[String, String],
                         messageId: String,
                         publishTime: String)