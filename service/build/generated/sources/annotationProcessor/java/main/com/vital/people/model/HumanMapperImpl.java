package com.vital.people.model;

import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-04-29T18:19:11+0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_241 (Oracle Corporation)"
)
@Component
public class HumanMapperImpl implements HumanMapper {

    @Override
    public HumanEntity toEntity(Human human) {
        if ( human == null ) {
            return null;
        }

        HumanEntity humanEntity = new HumanEntity();

        humanEntity.setId( human.getId() );
        humanEntity.setName( human.getName() );
        humanEntity.setAge( human.getAge() );

        return humanEntity;
    }

    @Override
    public Human toDto(HumanEntity human) {
        if ( human == null ) {
            return null;
        }

        Human human1 = new Human();

        human1.setId( human.getId() );
        human1.setName( human.getName() );
        human1.setAge( human.getAge() );

        return human1;
    }
}
