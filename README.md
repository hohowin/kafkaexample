# Getting Started

Youtube: [Kafka Tutorial - Spring Boot Microservices](https://youtu.be/SqVfCyfCJqw)

1\. Start Kafka and Zookeeper

```bash
docker-compose up -d
```

2\. Run `com.mykafka.KafkaApplication`

3\. Try to post following to `http://localhost:8080/api/v1/messages`

```json
{
  "message": "Hello my kafka world!!"
}
```

4\. Tear down

```bash
docker-compose down
```