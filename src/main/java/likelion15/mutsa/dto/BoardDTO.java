package likelion15.mutsa.dto;

public class BoardDTO {
    private Long id;
    private String title;
    private String content;

    public BoardDTO(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
