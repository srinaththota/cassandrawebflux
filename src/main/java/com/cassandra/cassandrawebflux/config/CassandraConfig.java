package com.cassandra.cassandrawebflux.config;
/*
import com.datastax.oss.driver.api.core.CqlSession;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.SessionFactory;
import org.springframework.data.cassandra.config.CqlSessionFactoryBean;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.config.SessionFactoryFactoryBean;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.data.cassandra.core.convert.CassandraConverter;
import org.springframework.data.cassandra.core.convert.MappingCassandraConverter;
import org.springframework.data.cassandra.core.mapping.CassandraMappingContext;
import org.springframework.data.cassandra.core.mapping.SimpleUserTypeResolver;
import org.springframework.data.cassandra.repository.config.EnableReactiveCassandraRepositories;

@Configuration
@EnableReactiveCassandraRepositories("com.cassandra.cassandrawebflux.repository")
class CassandraConfig{

    @Value("${cassandra.contactpoints}")
    private String contactpoints;

    @Value("${cassandra.port}")
    private int port;

    @Value("${cassandra.keyspace}")
    private String keyspace;

    @Value("${cassandra.dataCenter}")
    private String dataCenter;

    @Bean
    public CqlSessionFactoryBean session(){
        CqlSessionFactoryBean session = new CqlSessionFactoryBean();
        session.setContactPoints(contactpoints);
        session.setKeyspaceName(keyspace);
        session.setLocalDatacenter(dataCenter);
        return session;
    }
    @Bean
    public SessionFactoryFactoryBean sessionFactory(CqlSession session, CassandraConverter converter){
        SessionFactoryFactoryBean sessionFactory = new SessionFactoryFactoryBean();
        sessionFactory.setSession(session);
        sessionFactory.setConverter(converter);
        sessionFactory.setSchemaAction(SchemaAction.NONE);
        return sessionFactory;
    }
    @Bean
    public CassandraMappingContext mappingContext(CqlSession cqlSession){
        CassandraMappingContext mappingContext=new CassandraMappingContext();
        return mappingContext;
    }
    @Bean
    public CassandraConverter converter(CassandraMappingContext mappingContext,CqlSession cqlSession){
        MappingCassandraConverter mc=new MappingCassandraConverter(mappingContext);
        mc.setUserTypeResolver(new SimpleUserTypeResolver(cqlSession));
        return mc;
    }
    @Bean
    public CassandraOperations cassandraTemplate(SessionFactory sessionFactory,CassandraConverter converter){
        return new CassandraTemplate(sessionFactory,converter);
    }


}
*/
