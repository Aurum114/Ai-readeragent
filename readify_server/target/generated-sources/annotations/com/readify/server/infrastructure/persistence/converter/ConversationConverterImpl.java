package com.readify.server.infrastructure.persistence.converter;

import com.readify.server.domain.conversation.entity.AssistantThinking;
import com.readify.server.domain.conversation.entity.ConversationHistory;
import com.readify.server.infrastructure.persistence.entity.AssistantThinkingEntity;
import com.readify.server.infrastructure.persistence.entity.ConversationHistoryEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-05T18:36:44+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.44.0.v20251023-0518, environment: Java 21.0.8 (Eclipse Adoptium)"
)
@Component
public class ConversationConverterImpl implements ConversationConverter {

    @Override
    public ConversationHistory toDomain(ConversationHistoryEntity entity) {
        if ( entity == null ) {
            return null;
        }

        ConversationHistory.ConversationHistoryBuilder conversationHistory = ConversationHistory.builder();

        conversationHistory.content( entity.getContent() );
        conversationHistory.createdAt( entity.getCreatedAt() );
        conversationHistory.id( entity.getId() );
        conversationHistory.isIncludedInContext( entity.getIsIncludedInContext() );
        conversationHistory.messageType( entity.getMessageType() );
        conversationHistory.priority( entity.getPriority() );
        conversationHistory.projectId( entity.getProjectId() );
        conversationHistory.sequence( entity.getSequence() );
        conversationHistory.updatedAt( entity.getUpdatedAt() );

        return conversationHistory.build();
    }

    @Override
    public ConversationHistoryEntity toEntity(ConversationHistory domain) {
        if ( domain == null ) {
            return null;
        }

        ConversationHistoryEntity conversationHistoryEntity = new ConversationHistoryEntity();

        conversationHistoryEntity.setContent( domain.getContent() );
        conversationHistoryEntity.setCreatedAt( domain.getCreatedAt() );
        conversationHistoryEntity.setId( domain.getId() );
        conversationHistoryEntity.setIsIncludedInContext( domain.getIsIncludedInContext() );
        conversationHistoryEntity.setMessageType( domain.getMessageType() );
        conversationHistoryEntity.setPriority( domain.getPriority() );
        conversationHistoryEntity.setProjectId( domain.getProjectId() );
        conversationHistoryEntity.setSequence( domain.getSequence() );
        conversationHistoryEntity.setUpdatedAt( domain.getUpdatedAt() );

        return conversationHistoryEntity;
    }

    @Override
    public AssistantThinking toDomain(AssistantThinkingEntity entity) {
        if ( entity == null ) {
            return null;
        }

        AssistantThinking.AssistantThinkingBuilder assistantThinking = AssistantThinking.builder();

        assistantThinking.content( entity.getContent() );
        assistantThinking.createdAt( entity.getCreatedAt() );
        assistantThinking.id( entity.getId() );
        assistantThinking.projectId( entity.getProjectId() );
        assistantThinking.updatedAt( entity.getUpdatedAt() );
        assistantThinking.userMessageId( entity.getUserMessageId() );

        return assistantThinking.build();
    }

    @Override
    public AssistantThinkingEntity toEntity(AssistantThinking domain) {
        if ( domain == null ) {
            return null;
        }

        AssistantThinkingEntity assistantThinkingEntity = new AssistantThinkingEntity();

        assistantThinkingEntity.setContent( domain.getContent() );
        assistantThinkingEntity.setCreatedAt( domain.getCreatedAt() );
        assistantThinkingEntity.setId( domain.getId() );
        assistantThinkingEntity.setProjectId( domain.getProjectId() );
        assistantThinkingEntity.setUpdatedAt( domain.getUpdatedAt() );
        assistantThinkingEntity.setUserMessageId( domain.getUserMessageId() );

        return assistantThinkingEntity;
    }
}
