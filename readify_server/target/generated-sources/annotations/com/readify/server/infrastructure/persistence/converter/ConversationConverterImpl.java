package com.readify.server.infrastructure.persistence.converter;

import com.readify.server.domain.conversation.entity.AssistantThinking;
import com.readify.server.domain.conversation.entity.ConversationHistory;
import com.readify.server.infrastructure.persistence.entity.AssistantThinkingEntity;
import com.readify.server.infrastructure.persistence.entity.ConversationHistoryEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-05T13:30:57+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
@Component
public class ConversationConverterImpl implements ConversationConverter {

    @Override
    public ConversationHistory toDomain(ConversationHistoryEntity entity) {
        if ( entity == null ) {
            return null;
        }

        ConversationHistory.ConversationHistoryBuilder conversationHistory = ConversationHistory.builder();

        conversationHistory.id( entity.getId() );
        conversationHistory.projectId( entity.getProjectId() );
        conversationHistory.messageType( entity.getMessageType() );
        conversationHistory.content( entity.getContent() );
        conversationHistory.priority( entity.getPriority() );
        conversationHistory.isIncludedInContext( entity.getIsIncludedInContext() );
        conversationHistory.sequence( entity.getSequence() );
        conversationHistory.createdAt( entity.getCreatedAt() );
        conversationHistory.updatedAt( entity.getUpdatedAt() );

        return conversationHistory.build();
    }

    @Override
    public ConversationHistoryEntity toEntity(ConversationHistory domain) {
        if ( domain == null ) {
            return null;
        }

        ConversationHistoryEntity conversationHistoryEntity = new ConversationHistoryEntity();

        conversationHistoryEntity.setId( domain.getId() );
        conversationHistoryEntity.setProjectId( domain.getProjectId() );
        conversationHistoryEntity.setMessageType( domain.getMessageType() );
        conversationHistoryEntity.setContent( domain.getContent() );
        conversationHistoryEntity.setPriority( domain.getPriority() );
        conversationHistoryEntity.setIsIncludedInContext( domain.getIsIncludedInContext() );
        conversationHistoryEntity.setSequence( domain.getSequence() );
        conversationHistoryEntity.setCreatedAt( domain.getCreatedAt() );
        conversationHistoryEntity.setUpdatedAt( domain.getUpdatedAt() );

        return conversationHistoryEntity;
    }

    @Override
    public AssistantThinking toDomain(AssistantThinkingEntity entity) {
        if ( entity == null ) {
            return null;
        }

        AssistantThinking.AssistantThinkingBuilder assistantThinking = AssistantThinking.builder();

        assistantThinking.id( entity.getId() );
        assistantThinking.projectId( entity.getProjectId() );
        assistantThinking.userMessageId( entity.getUserMessageId() );
        assistantThinking.content( entity.getContent() );
        assistantThinking.createdAt( entity.getCreatedAt() );
        assistantThinking.updatedAt( entity.getUpdatedAt() );

        return assistantThinking.build();
    }

    @Override
    public AssistantThinkingEntity toEntity(AssistantThinking domain) {
        if ( domain == null ) {
            return null;
        }

        AssistantThinkingEntity assistantThinkingEntity = new AssistantThinkingEntity();

        assistantThinkingEntity.setId( domain.getId() );
        assistantThinkingEntity.setProjectId( domain.getProjectId() );
        assistantThinkingEntity.setUserMessageId( domain.getUserMessageId() );
        assistantThinkingEntity.setContent( domain.getContent() );
        assistantThinkingEntity.setCreatedAt( domain.getCreatedAt() );
        assistantThinkingEntity.setUpdatedAt( domain.getUpdatedAt() );

        return assistantThinkingEntity;
    }
}
