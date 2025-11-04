package com.readify.server.interfaces.conversation.converter;

import com.readify.server.domain.conversation.entity.ConversationHistory;
import com.readify.server.interfaces.conversation.vo.ConversationVO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-03T22:50:16+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class ConversationVOConverterImpl implements ConversationVOConverter {

    @Override
    public ConversationVO toResponseDTO(ConversationHistory conversation) {
        if ( conversation == null ) {
            return null;
        }

        ConversationVO.ConversationVOBuilder conversationVO = ConversationVO.builder();

        conversationVO.id( conversation.getId() );
        conversationVO.projectId( conversation.getProjectId() );
        conversationVO.messageType( conversation.getMessageType() );
        conversationVO.content( conversation.getContent() );
        conversationVO.priority( conversation.getPriority() );
        conversationVO.isIncludedInContext( conversation.getIsIncludedInContext() );
        conversationVO.sequence( conversation.getSequence() );
        conversationVO.createdAt( conversation.getCreatedAt() );

        return conversationVO.build();
    }
}
