package com.readify.server.infrastructure.persistence.converter;

import com.readify.server.domain.user.model.User;
import com.readify.server.infrastructure.persistence.entity.UserEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-05T18:36:43+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.44.0.v20251023-0518, environment: Java 21.0.8 (Eclipse Adoptium)"
)
public class UserConverterImpl implements UserConverter {

    @Override
    public UserEntity toEntity(User user) {
        if ( user == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setCreateTime( user.getCreateTime() );
        userEntity.setEnabled( user.getEnabled() );
        userEntity.setId( user.getId() );
        userEntity.setUpdateTime( user.getUpdateTime() );
        userEntity.setUsername( user.getUsername() );

        return userEntity;
    }

    @Override
    public User toDomain(UserEntity entity) {
        if ( entity == null ) {
            return null;
        }

        User user = new User();

        user.setCreateTime( entity.getCreateTime() );
        user.setEnabled( entity.getEnabled() );
        user.setId( entity.getId() );
        user.setUpdateTime( entity.getUpdateTime() );
        user.setUsername( entity.getUsername() );

        return user;
    }
}
