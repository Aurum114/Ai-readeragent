package com.readify.server.infrastructure.persistence.converter;

import com.readify.server.domain.mind_map.model.MindMapNode;
import com.readify.server.infrastructure.persistence.entity.MindMapNodeEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-03T22:50:17+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class MindMapNodeConverterImpl implements MindMapNodeConverter {

    @Override
    public MindMapNodeEntity toEntity(MindMapNode node) {
        if ( node == null ) {
            return null;
        }

        MindMapNodeEntity mindMapNodeEntity = new MindMapNodeEntity();

        mindMapNodeEntity.setId( node.getId() );
        mindMapNodeEntity.setProjectId( node.getProjectId() );
        mindMapNodeEntity.setFileId( node.getFileId() );
        mindMapNodeEntity.setMindMapId( node.getMindMapId() );
        mindMapNodeEntity.setParentId( node.getParentId() );
        mindMapNodeEntity.setContent( node.getContent() );
        mindMapNodeEntity.setSequence( node.getSequence() );
        mindMapNodeEntity.setLevel( node.getLevel() );
        mindMapNodeEntity.setCreatedTime( node.getCreatedTime() );
        mindMapNodeEntity.setUpdatedTime( node.getUpdatedTime() );
        mindMapNodeEntity.setDeleted( node.getDeleted() );

        return mindMapNodeEntity;
    }

    @Override
    public MindMapNode toDomain(MindMapNodeEntity entity) {
        if ( entity == null ) {
            return null;
        }

        MindMapNode mindMapNode = new MindMapNode();

        mindMapNode.setId( entity.getId() );
        mindMapNode.setProjectId( entity.getProjectId() );
        mindMapNode.setFileId( entity.getFileId() );
        mindMapNode.setMindMapId( entity.getMindMapId() );
        mindMapNode.setParentId( entity.getParentId() );
        mindMapNode.setContent( entity.getContent() );
        mindMapNode.setSequence( entity.getSequence() );
        mindMapNode.setLevel( entity.getLevel() );
        mindMapNode.setCreatedTime( entity.getCreatedTime() );
        mindMapNode.setUpdatedTime( entity.getUpdatedTime() );
        mindMapNode.setDeleted( entity.getDeleted() );

        return mindMapNode;
    }

    @Override
    public List<MindMapNodeEntity> toEntityList(List<MindMapNode> nodes) {
        if ( nodes == null ) {
            return null;
        }

        List<MindMapNodeEntity> list = new ArrayList<MindMapNodeEntity>( nodes.size() );
        for ( MindMapNode mindMapNode : nodes ) {
            list.add( toEntity( mindMapNode ) );
        }

        return list;
    }

    @Override
    public List<MindMapNode> toDomainList(List<MindMapNodeEntity> entities) {
        if ( entities == null ) {
            return null;
        }

        List<MindMapNode> list = new ArrayList<MindMapNode>( entities.size() );
        for ( MindMapNodeEntity mindMapNodeEntity : entities ) {
            list.add( toDomain( mindMapNodeEntity ) );
        }

        return list;
    }
}
