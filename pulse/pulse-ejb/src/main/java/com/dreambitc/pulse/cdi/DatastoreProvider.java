package com.dreambitc.pulse.cdi;

import javax.enterprise.inject.Produces;
import javax.inject.Singleton;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.mongodb.MongoClient;

public class DatastoreProvider {

    @Produces
    @Singleton
    public Datastore getDatastore() {
        Morphia m = new Morphia();
        MongoClient client = new MongoClient();
        return m.createDatastore(client, "exp1");
    }
}
