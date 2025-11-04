package com.readify.server.interfaces.conversation.converter;

import com.readify.server.domain.conversation.entity.AssistantThinking;
import com.readify.server.interfaces.conversation.vo.AssistantThinkingVO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-03T22:50:17+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class AssistantThinkingVOConverterImpl implements AssistantThinkingVOConverter {

    @Override
    public AssistantThinkingVO toDTO(AssistantThinking thinking) {
        if ( thinking == null ) {
            return null;
        }

        AssistantThinkingVO.AssistantThinkingVOBuilder assistantThinkingVO = AssistantThinkingVO.builder();

        assistantThinkingVO.id( thinking.getId() );
        assistantThinkingVO.userMessageId( thinking.getUserMessageId() );
        assistantThinkingVO.content( thinking.getContent() );
        assistantThinkingVO.createdAt( thinking.getCreatedAt() );

        return assistantThinkingVO.build();
    }
}
