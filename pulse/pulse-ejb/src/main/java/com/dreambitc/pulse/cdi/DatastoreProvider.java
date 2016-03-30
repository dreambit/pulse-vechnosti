package com.dreambitc.pulse.cdi;

import javax.enterprise.inject.Produces;
import javax.inject.Singleton;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mongodb.MongoClient;

public class DatastoreProvider {

    private static Logger LOG = LoggerFactory.getLogger(DatastoreProvider.class);

    @Produces
    @Singleton
    public Datastore getDatastore(MongoClient mongoClient) {
        LOG.info("getDatastore was called------------------------------------------------------");
        Morphia m = new Morphia();
        return m.createDatastore(mongoClient, "pulse");
    }

    @Produces
    @Singleton
    public MongoClient getMongoClient() {
        LOG.info("getMongoClient was called--------------------------------------------------------------------------");
        return new MongoClient();
    }
}
