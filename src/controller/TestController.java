package controller;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.internal.MongoIterableImpl;
import coniguration.DatabaseConfiguration;
import org.bson.Document;

public class TestController {
    MongoDatabase database = new DatabaseConfiguration().getDatabase();
    MongoCollection<Document> collection = database.getCollection("usuarios");

    public String result = "AUN";

    public TestController() {
        getAll();
    }

    public void getAll(){
        System.out.println("ALLUSERS");
        for (Document document : collection.find()) System.out.println(document);
        result = "LISTO";
    }


}
