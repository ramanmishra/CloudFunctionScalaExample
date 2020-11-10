#Scala on Cloud Function

##How to use

###Http-trigger 
1. clone the project
2. use command ``mvn function:run -Drun.functionTarget=function.http.HelloWorld``
3. Go on ``http://localhost:8080/`` you should see **Hello world!**

###Pub/Sub Trigger
1. deploy function using ``gcloud functions deploy scalaPubSub --entry-point functions.pubsub.HelloWorldPubSub --runtime java11 --trigger-topic <topic_name>``
2. Publish the following message into ``test_topic`` 
3. look at the logs you should be able to see the following message  in logs.

```json
{
"config": "config-string",
"name" : "name"
}
``` 
