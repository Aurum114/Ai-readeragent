package com.readify.server.interfaces.conversation.converter;

import com.readify.server.domain.conversation.entity.AssistantThinking;
import com.readify.server.interfaces.conversation.vo.AssistantThinkingVO;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-05T18:36:44+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.44.0.v20251023-0518, environment: Java 21.0.8 (Eclipse Adoptium)"
)
@Component
public class AssistantThinkingVOConverterImpl implements AssistantThinkingVOConverter {

    @Override
    public AssistantThinkingVO toDTO(AssistantThinking thinking) {
        if ( thinking == null ) {
            return null;
        }

        AssistantThinkingVO.AssistantThinkingVOBuilder assistantThinkingVO = AssistantThinkingVO.builder();

        assistantThinkingVO.content( thinking.getContent() );
        assistantThinkingVO.createdAt( thinking.getCreatedAt() );
        assistantThinkingVO.id( thinking.getId() );
        assistantThinkingVO.userMessageId( thinking.getUserMessageId() );

        return assistantThinkingVO.build();
    }
}
