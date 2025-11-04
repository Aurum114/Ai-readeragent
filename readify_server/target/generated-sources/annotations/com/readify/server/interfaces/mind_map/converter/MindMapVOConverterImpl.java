package com.readify.server.interfaces.mind_map.converter;

import com.readify.server.domain.mind_map.model.MindMap;
import com.readify.server.interfaces.mind_map.vo.MindMapVO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-03T22:50:17+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.2 (Oracle Corporation)"
)
public class MindMapVOConverterImpl implements MindMapVOConverter {

    @Override
    public MindMapVO toVO(MindMap mindMap) {
        if ( mindMap == null ) {
            return null;
        }

        MindMapVO mindMapVO = new MindMapVO();

        mindMapVO.setId( mindMap.getId() );
        mindMapVO.setProjectId( mindMap.getProjectId() );
        mindMapVO.setFileId( mindMap.getFileId() );
        mindMapVO.setTitle( mindMap.getTitle() );
        mindMapVO.setType( mindMap.getType() );
        mindMapVO.setDescription( mindMap.getDescription() );

        return mindMapVO;
    }

    @Override
    public MindMap toDomain(MindMapVO mindMapVO) {
        if ( mindMapVO == null ) {
            return null;
        }

        MindMap mindMap = new MindMap();

        mindMap.setId( mindMapVO.getId() );
        mindMap.setProjectId( mindMapVO.getProjectId() );
        mindMap.setFileId( mindMapVO.getFileId() );
        mindMap.setTitle( mindMapVO.getTitle() );
        mindMap.setType( mindMapVO.getType() );
        mindMap.setDescription( mindMapVO.getDescription() );

        return mindMap;
    }

    @Override
    public List<MindMapVO> toVOList(List<MindMap> mindMaps) {
        if ( mindMaps == null ) {
            return null;
        }

        List<MindMapVO> list = new ArrayList<MindMapVO>( mindMaps.size() );
        for ( MindMap mindMap : mindMaps ) {
            list.add( toVO( mindMap ) );
        }

        return list;
    }

    @Override
    public void updateMindMapVO(MindMap mindMap, MindMapVO mindMapVO) {
        if ( mindMap == null ) {
            return;
        }

        mindMapVO.setId( mindMap.getId() );
        mindMapVO.setProjectId( mindMap.getProjectId() );
        mindMapVO.setFileId( mindMap.getFileId() );
        mindMapVO.setTitle( mindMap.getTitle() );
        mindMapVO.setType( mindMap.getType() );
        mindMapVO.setDescription( mindMap.getDescription() );
    }
}
