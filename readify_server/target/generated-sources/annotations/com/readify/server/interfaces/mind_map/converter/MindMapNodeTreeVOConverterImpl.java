package com.readify.server.interfaces.mind_map.converter;

import com.readify.server.domain.mind_map.model.MindMapNodeTree;
import com.readify.server.interfaces.mind_map.vo.MindMapNodeTreeVO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-03T22:50:16+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class MindMapNodeTreeVOConverterImpl implements MindMapNodeTreeVOConverter {

    @Override
    public MindMapNodeTreeVO toVO(MindMapNodeTree tree) {
        if ( tree == null ) {
            return null;
        }

        MindMapNodeTreeVO mindMapNodeTreeVO = new MindMapNodeTreeVO();

        mindMapNodeTreeVO.setId( tree.getId() );
        mindMapNodeTreeVO.setProjectId( tree.getProjectId() );
        mindMapNodeTreeVO.setFileId( tree.getFileId() );
        mindMapNodeTreeVO.setMindMapId( tree.getMindMapId() );
        mindMapNodeTreeVO.setParentId( tree.getParentId() );
        mindMapNodeTreeVO.setContent( tree.getContent() );
        mindMapNodeTreeVO.setSequence( tree.getSequence() );
        mindMapNodeTreeVO.setLevel( tree.getLevel() );
        mindMapNodeTreeVO.setCreatedTime( tree.getCreatedTime() );
        mindMapNodeTreeVO.setUpdatedTime( tree.getUpdatedTime() );
        mindMapNodeTreeVO.setChildren( mindMapNodeTreeListToMindMapNodeTreeVOList( tree.getChildren() ) );

        return mindMapNodeTreeVO;
    }

    @Override
    public MindMapNodeTree toDomain(MindMapNodeTreeVO vo) {
        if ( vo == null ) {
            return null;
        }

        MindMapNodeTree mindMapNodeTree = new MindMapNodeTree();

        mindMapNodeTree.setId( vo.getId() );
        mindMapNodeTree.setProjectId( vo.getProjectId() );
        mindMapNodeTree.setFileId( vo.getFileId() );
        mindMapNodeTree.setMindMapId( vo.getMindMapId() );
        mindMapNodeTree.setParentId( vo.getParentId() );
        mindMapNodeTree.setContent( vo.getContent() );
        mindMapNodeTree.setSequence( vo.getSequence() );
        mindMapNodeTree.setLevel( vo.getLevel() );
        mindMapNodeTree.setCreatedTime( vo.getCreatedTime() );
        mindMapNodeTree.setUpdatedTime( vo.getUpdatedTime() );
        mindMapNodeTree.setChildren( mindMapNodeTreeVOListToMindMapNodeTreeList( vo.getChildren() ) );

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
