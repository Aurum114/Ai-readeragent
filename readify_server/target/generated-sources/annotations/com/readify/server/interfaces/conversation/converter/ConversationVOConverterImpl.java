package com.readify.server.interfaces.conversation.converter;

import com.readify.server.domain.conversation.entity.ConversationHistory;
import com.readify.server.interfaces.conversation.vo.ConversationVO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-05T18:36:44+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.44.0.v20251023-0518, environment: Java 21.0.8 (Eclipse Adoptium)"
)
@Component
public class ConversationVOConverterImpl implements ConversationVOConverter {

    @Override
    public ConversationVO toResponseDTO(ConversationHistory conversation) {
        if ( conversation == null ) {
            return null;
        }

        ConversationVO.ConversationVOBuilder conversationVO = ConversationVO.builder();

        conversationVO.content( conversation.getContent() );
        conversationVO.createdAt( conversation.getCreatedAt() );
        conversationVO.id( conversation.getId() );
        conversationVO.isIncludedInContext( conversation.getIsIncludedInContext() );
        conversationVO.messageType( conversation.getMessageType() );
        conversationVO.priority( conversation.getPriority() );
        conversationVO.projectId( conversation.getProjectId() );
        conversationVO.sequence( conversation.getSequence() );

        return conversationVO.build();
    }
}
