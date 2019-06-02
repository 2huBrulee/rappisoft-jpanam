package coniguration;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;


public class DatabaseConfiguration {
    private MongoDatabase database;
    private MongoClient mongoClient;

    public DatabaseConfiguration() {
        ConnectionString connString = new ConnectionString(
                "mongodb://smash:smash1to@ds231387.mlab.com:31387/rappisoft"
        );


        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connString)
                .retryWrites(true)
                .build();

        mongoClient = MongoClients.create(settings);
        database = mongoClient.getDatabase("rappisoft");
    }

    public MongoDatabase getDatabase() {
        return database;
    }

    public void setDatabase(MongoDatabase database) {
        this.database = database;
    }
}
