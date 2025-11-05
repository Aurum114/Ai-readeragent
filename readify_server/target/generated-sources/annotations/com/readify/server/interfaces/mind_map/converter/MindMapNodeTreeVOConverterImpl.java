package com.readify.server.interfaces.mind_map.converter;

import com.readify.server.domain.mind_map.model.MindMapNodeTree;
import com.readify.server.interfaces.mind_map.vo.MindMapNodeTreeVO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-05T18:36:44+0800",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.44.0.v20251023-0518, environment: Java 21.0.8 (Eclipse Adoptium)"
)
public class MindMapNodeTreeVOConverterImpl implements MindMapNodeTreeVOConverter {

    @Override
    public MindMapNodeTreeVO toVO(MindMapNodeTree tree) {
        if ( tree == null ) {
            return null;
        }

        MindMapNodeTreeVO mindMapNodeTreeVO = new MindMapNodeTreeVO();

        mindMapNodeTreeVO.setChildren( mindMapNodeTreeListToMindMapNodeTreeVOList( tree.getChildren() ) );
        mindMapNodeTreeVO.setContent( tree.getContent() );
        mindMapNodeTreeVO.setCreatedTime( tree.getCreatedTime() );
        mindMapNodeTreeVO.setFileId( tree.getFileId() );
        mindMapNodeTreeVO.setId( tree.getId() );
        mindMapNodeTreeVO.setLevel( tree.getLevel() );
        mindMapNodeTreeVO.setMindMapId( tree.getMindMapId() );
        mindMapNodeTreeVO.setParentId( tree.getParentId() );
        mindMapNodeTreeVO.setProjectId( tree.getProjectId() );
        mindMapNodeTreeVO.setSequence( tree.getSequence() );
        mindMapNodeTreeVO.setUpdatedTime( tree.getUpdatedTime() );

        return mindMapNodeTreeVO;
    }

    @Override
    public MindMapNodeTree toDomain(MindMapNodeTreeVO vo) {
        if ( vo == null ) {
            return null;
        }

        MindMapNodeTree mindMapNodeTree = new MindMapNodeTree();

        mindMapNodeTree.setChildren( mindMapNodeTreeVOListToMindMapNodeTreeList( vo.getChildren() ) );
        mindMapNodeTree.setContent( vo.getContent() );
        mindMapNodeTree.setCreatedTime( vo.getCreatedTime() );
        mindMapNodeTree.setFileId( vo.getFileId() );
        mindMapNodeTree.setId( vo.getId() );
        mindMapNodeTree.setLevel( vo.getLevel() );
        mindMapNodeTree.setMindMapId( vo.getMindMapId() );
        mindMapNodeTree.setParentId( vo.getParentId() );
        mindMapNodeTree.setProjectId( vo.getProjectId() );
        mindMapNodeTree.setSequence( vo.getSequence() );
        mindMapNodeTree.setUpdatedTime( vo.getUpdatedTime() );

        return mindMapNodeTree;
    }

    protected List<MindMapNodeTreeVO> mindMapNodeTreeListToMindMapNodeTreeVOList(List<MindMapNodeTree> list) {
        if ( list == null ) {
            return null;
        }

        List<MindMapNodeTreeVO> list1 = new ArrayList<MindMapNodeTreeVO>( list.size() );
        for ( MindMapNodeTree mindMapNodeTree : list ) {
            list1.add( toVO( mindMapNodeTree ) );
        }

        return list1;
    }

    protected List<MindMapNodeTree> mindMapNodeTreeVOListToMindMapNodeTreeList(List<MindMapNodeTreeVO> list) {
        if ( list == null ) {
            return null;
        }

        List<MindMapNodeTree> list1 = new ArrayList<MindMapNodeTree>( list.size() );
        for ( MindMapNodeTreeVO mindMapNodeTreeVO : list ) {
            list1.add( toDomain( mindMapNodeTreeVO ) );
        }

        return list1;
    }
}
