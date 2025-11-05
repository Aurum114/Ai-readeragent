package com.readify.server.interfaces.user.converter;

import com.readify.server.domain.user.model.User;
import com.readify.server.interfaces.user.vo.UserVO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-05T18:36:44+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.44.0.v20251023-0518, environment: Java 21.0.8 (Eclipse Adoptium)"
)
public class UserVOConverterImpl implements UserVOConverter {

    @Override
    public UserVO toVO(User user) {
        if ( user == null ) {
            return null;
        }

        UserVO userVO = new UserVO();

        userVO.setCreateTime( user.getCreateTime() );
        userVO.setEnabled( user.getEnabled() );
        userVO.setId( user.getId() );
        userVO.setUpdateTime( user.getUpdateTime() );
        userVO.setUsername( user.getUsername() );

        return userVO;
    }

    @Override
    public User toDomain(UserVO userVO) {
        if ( userVO == null ) {
            return null;
        }

        User user = new User();

        user.setCreateTime( userVO.getCreateTime() );
        user.setEnabled( userVO.getEnabled() );
        user.setId( userVO.getId() );
        user.setUpdateTime( userVO.getUpdateTime() );
        user.setUsername( userVO.getUsername() );

        return user;
    }

    @Override
    public List<UserVO> toVOList(List<User> users) {
        if ( users == null ) {
            return null;
        }

        List<UserVO> list = new ArrayList<UserVO>( users.size() );
        for ( User user : users ) {
            list.add( toVO( user ) );
        }

        return list;
    }

    @Override
    public void updateUserVO(User user, UserVO userVO) {
        if ( user == null ) {
            return;
        }

        userVO.setCreateTime( user.getCreateTime() );
        userVO.setEnabled( user.getEnabled() );
        userVO.setId( user.getId() );
        userVO.setUpdateTime( user.getUpdateTime() );
        userVO.setUsername( user.getUsername() );
    }
}
