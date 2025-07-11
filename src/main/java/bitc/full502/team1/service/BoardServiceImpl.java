package bitc.full502.team1.service;

import bitc.full502.team1.dto.FileDTO;
import bitc.full502.team1.dto.BoardDTO;
import bitc.full502.team1.mapper.BoardMapper;
import bitc.full502.team1.util.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardMapper boardMapper;
    @Autowired
    private FileUtils fileUtils;

    @Override
    public List<BoardDTO> selectBoardList() throws Exception {
        return boardMapper.selectBoardList();
    }

    //  게시글 상세 보기
//  1. mapper 를 이용하여 매개변수로 받아온 게시글 번호에 맞는 게시글 상세 정보를 가져옴
//  2. 가져온 게시글 상세 정보를 반환
    @Override
    public BoardDTO selectBoardDetail(int boardIdx) throws Exception {
        BoardDTO board = boardMapper.selectBoardDetail(boardIdx);
        List<FileDTO> fileList = boardMapper.selectBoardFileList(boardIdx);
        board.setFileList(fileList);

        return board;
    }

    //  게시글 등록하기
//  1. 매개변수로 데이터 받아오기
//  2. mapper 를 이용하여 매개변수로 받아온 데이터를 데이터베이스에 등록

    //    두번째 매개변수로 업로드된 파일 정보를 가지고 있는 MultipartHttpServletRequest 를 받아옴
    public void boardWrite(BoardDTO board, MultipartHttpServletRequest multipart) throws Exception {

        //    게시물 정보를 데이터베이스에 등록
        boardMapper.boardWrite(board);

//        업로드된 파일 목록 가져오기
        List<FileDTO> fileList = fileUtils.parseFileInfo(board.getBoardIdx(), board.getCreateId(), multipart);

//        CollectionUtils : 스프링프레임워크에서 제공하는 유틸리티 클래스
//        파일 리스트가 비었는지 확인
        if (CollectionUtils.isEmpty(fileList) == false) {
//      업로드된 파일 목록을 데이터베이스 저장
            boardMapper.insertBoardFileList(fileList);

        }

//        if (ObjectUtils.isEmpty(multipart) == false){
//            Iterator<String> iterator = multipart.getFileNames();
//            String name;

//            while (iterator.hasNext()) {
//                name = iterator.next();
//
//                List<MultipartFile> fileInfoList = multipart.getFiles(name);
//
//                for (MultipartFile fileInfo : fileInfoList) {
//                    System.out.println("\n ***** 파일 정보 *****\b");
//                    System.out.println("file name : " + fileInfo.getOriginalFilename());
//                    System.out.println("file size : " + fileInfo.getSize());
//                    System.out.println("file content type : " + fileInfo.getContentType());
//                    System.out.println("\n--------------\n");
//                }
//            }
//        }


//        다운로드할 파일 정보 가져오기
//        1. 매개변수로 파일번호와 게시물번호를 가져옴
//        2. mapper 를 이용하여 지정한 게시물 번호와 파일 번호를 사용하는 파일 정보를 데이터베이스에 가져옴

//        @Override
//        public FileDTO selectBoardFileInfo (int fileIdx, int boardIdx){
//            boardMapper.selectBoardFileInfo(fileIdx, boardIdx);
//        }
    }

    @Override
    public FileDTO selectBoardFileInfo(int fileIdx, int boardIdx) throws Exception {
        return boardMapper.selectBoardFileInfo(fileIdx, boardIdx);
    }
}