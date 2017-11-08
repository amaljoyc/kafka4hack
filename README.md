# kafka4hack
Basic Kafka setup for a Hackathon

How to run local kafka server?
* Download kafka tar from [here](http://apache.mirror.digionline.de/kafka/1.0.0/kafka_2.11-1.0.0.tgz)
* Start ZooKeeper --> bin/zookeeper-server-start.sh config/zookeeper.properties
* Start Kafka Server --> bin/kafka-server-start.sh config/server.properties (will start on port 9092)
* Create a new topic eg. test --> bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test

How to use the demo app?
* run the project from an IDE or from console --> mvn spring-boot:run
* use the api endpoint to send message --> GET localhost:8080/send?payload=sampleMessage
