package bitc.full502.team1.dto;

import lombok.Data;

import java.util.List;

@Data
public class BoardDTO {

    private int boardIdx;
    private String title;
    private String contents;
    private String createId;
    private String createDate;
    private String updateId;
    private String updateDate;
    private int hitCnt;


    private List<FileDTO> fileList;
}
