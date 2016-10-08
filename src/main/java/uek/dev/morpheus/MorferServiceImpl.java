package uek.dev.morpheus;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uek.dev.mongo.MongoConfig;
import uek.dev.result.Result;

@Service("morferService")
@Transactional
public class MorferServiceImpl implements MorferService {

    private ApplicationContext ctx =
            new AnnotationConfigApplicationContext(MongoConfig.class);
    private MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");

    @Override
    public Result findById(Long id) {
        return mongoOperation.findById(id, Result.class);
    }

    @Override
    public void saveResult(Result result) {
        mongoOperation.save(result);
    }

    @Override
    public void deleteResultById(Long id) {
        mongoOperation.remove(findById(id));
    }

}
