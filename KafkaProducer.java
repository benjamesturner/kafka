import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.comon.serialization.StringSerializer;

public class KafkaProducer {
    public static void main(String[] args) {
        Properties properties = new Properties();
        //kafka Boot strap server
        properties.setproperty("boostrap.servers", "127.0.0.1:9092");
        properties.setproperty("key.serializer", "");
        properties.setproperty("value.serialze", "");
        //producer acks
        properties.setproperty("acks", "1");
        properties.setproperty("retires", "3");

        Producer <String, String> producer = new org.apache.kafka.clients.producer.KafkaProducer <String, String> (properties);

        ProducerRecord<String, String> producerRecord = new ProducerRecord<String, String>( topic: "second_topic", key: "3", value: "message_test");

        producer.send (producerRecord);
        producer.flush();
        producer.close();
        //topic name


    }
}
