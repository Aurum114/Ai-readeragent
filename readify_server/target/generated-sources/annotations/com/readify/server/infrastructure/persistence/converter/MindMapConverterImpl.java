package com.readify.server.infrastructure.persistence.converter;

import com.readify.server.domain.mind_map.model.MindMap;
import com.readify.server.infrastructure.persistence.entity.MindMapEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-05T18:36:43+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.44.0.v20251023-0518, environment: Java 21.0.8 (Eclipse Adoptium)"
)
public class MindMapConverterImpl implements MindMapConverter {

    @Override
    public MindMapEntity toEntity(MindMap mindMap) {
        if ( mindMap == null ) {
            return null;
        }

        MindMapEntity mindMapEntity = new MindMapEntity();

        mindMapEntity.setCreatedAt( mindMap.getCreatedAt() );
        mindMapEntity.setDescription( mindMap.getDescription() );
        mindMapEntity.setFileId( mindMap.getFileId() );
        mindMapEntity.setId( mindMap.getId() );
        mindMapEntity.setIsDeleted( mindMap.getIsDeleted() );
        mindMapEntity.setProjectId( mindMap.getProjectId() );
        mindMapEntity.setTitle( mindMap.getTitle() );
        mindMapEntity.setType( mindMap.getType() );
        mindMapEntity.setUpdatedAt( mindMap.getUpdatedAt() );
        mindMapEntity.setUserId( mindMap.getUserId() );

        return mindMapEntity;
    }

    @Override
    public MindMap toDomain(MindMapEntity entity) {
        if ( entity == null ) {
            return null;
        }

        MindMap mindMap = new MindMap();

        mindMap.setCreatedAt( entity.getCreatedAt() );
        mindMap.setDescription( entity.getDescription() );
        mindMap.setFileId( entity.getFileId() );
        mindMap.setId( entity.getId() );
        mindMap.setIsDeleted( entity.getIsDeleted() );
        mindMap.setProjectId( entity.getProjectId() );
        mindMap.setTitle( entity.getTitle() );
        mindMap.setType( entity.getType() );
        mindMap.setUpdatedAt( entity.getUpdatedAt() );
        mindMap.setUserId( entity.getUserId() );

        return mindMap;
    }
}
