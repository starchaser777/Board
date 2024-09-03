package kr.ac.kopo.board.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString(exclude = "writer") // 외부에 있는 것을 참조함
public class Board extends BaseEntity {

    @Id // 기본키(Primary Key) 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 1씩 자동증가(auto-increment)
    private Long bno;

    private String title;

    private String content;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Member writer; // Foreign Key 설정(참조무결성 유지), 실제이름 writer_email
}
