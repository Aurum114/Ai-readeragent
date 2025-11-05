package com.readify.server.interfaces.auth.converter;

import com.readify.server.domain.auth.model.AuthUser;
import com.readify.server.interfaces.auth.vo.LoginVO;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-05T18:36:44+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.44.0.v20251023-0518, environment: Java 21.0.8 (Eclipse Adoptium)"
)
public class AuthVOConverterImpl implements AuthVOConverter {

    @Override
    public void updateLoginVO(AuthUser user, LoginVO loginVO) {
        if ( user == null ) {
            return;
        }

        loginVO.setCreateTime( user.getCreateTime() );
        loginVO.setEnabled( user.getEnabled() );
        loginVO.setId( user.getId() );
        loginVO.setUpdateTime( user.getUpdateTime() );
        loginVO.setUsername( user.getUsername() );
    }
}
