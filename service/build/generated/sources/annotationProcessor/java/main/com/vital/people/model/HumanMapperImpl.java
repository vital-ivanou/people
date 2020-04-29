package com.vital.people.model;

import com.vital.people.model.Human.HumanBuilder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-04-27T21:57:23+0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.6 (JetBrains s.r.o)"
)
@Component
public class HumanMapperImpl implements HumanMapper {

    @Override
    public HumanEntity toEntity(Human human) {
        if ( human == null ) {
            return null;
        }

        HumanEntity humanEntity = new HumanEntity();

        return humanEntity;
    }

    @Override
    public Human toDto(HumanEntity human) {
        if ( human == null ) {
            return null;
        }

        HumanBuilder human1 = Human.builder();

        human1.id( human.getId() );
        human1.name( human.getName() );
        human1.age( human.getAge() );

        return human1.build();
    }
}
