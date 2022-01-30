package oodles.io.learnRestTemplate.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import oodles.io.learnRestTemplate.modle.Data;
@Repository
public interface NewChatRoomRepository extends MongoRepository<Data, String> {

}
