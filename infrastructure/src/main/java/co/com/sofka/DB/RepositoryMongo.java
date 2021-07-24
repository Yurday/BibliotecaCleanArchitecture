package co.com.sofka.DB;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import org.bson.Document;

public class RepositoryMongo implements Repository{
    MongoClient mongoClient;
    public RepositoryMongo(){
        mongoClient = MongoClients.create();
    }

    @Override
    public void save(String collection, Object object) {
        mongoClient.getDatabase("dbMongo").getCollection(collection).insertOne((Document) object);
    }
}
