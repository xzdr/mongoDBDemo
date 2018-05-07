package com.xzdr.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BaseDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    public Object findOne(String fieldName, Object value, Class clazz){
        return mongoTemplate.findOne(new Query(Criteria.where(fieldName).is(value)), clazz);
    }

    public List<?> findRegex(String fieldName, String value, Class clazz){
        return mongoTemplate.find(new Query(Criteria.where(fieldName).regex(value)), clazz);
    }

    public List<?> findAll(Class clazz){
        return mongoTemplate.findAll(clazz);
    }

    public void insert(Object obj){
        mongoTemplate.insert(obj);
    }

    public void remove(String id, Class clazz){
        mongoTemplate.remove(new Query(Criteria.where("_id").is(id)), clazz);
    }
}
