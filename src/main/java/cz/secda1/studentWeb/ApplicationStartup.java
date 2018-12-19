package cz.secda1.studentWeb;

import cz.secda1.studentWeb.db.DummyDataGenerator;
import org.flywaydb.core.Flyway;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.*;
import javax.inject.Inject;
import javax.sql.DataSource;

@Startup
@Singleton
public class ApplicationStartup {
    @Resource(lookup = "java:/test/db")
    private DataSource dataSource;

    @Inject
    DummyDataGenerator dummyDataGenerator;

    @PostConstruct
    @TransactionAttribute(TransactionAttributeType.NEVER)
    private void onStartup(){
        migrateDatabase();
        insertDummyData();
    }

    private void migrateDatabase() {
        if (dataSource == null) {
            throw new EJBException("No datasource found. Database migrations can not be executed!");
        }

        Flyway flyway = new Flyway();
        flyway.setDataSource(dataSource);
        flyway.migrate();
    }

    private void insertDummyData() {
        dummyDataGenerator.generateDummyData();
    }

}
