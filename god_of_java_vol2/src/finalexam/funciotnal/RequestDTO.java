package finalexam.funciotnal;

public class RequestDTO {

    private String requestMethod = "GET";
    private String uri = "/";

    @Override
    public String toString() {
        return "RequestDTO{" +
                "requestMethod='" + requestMethod + '\'' +
                ", uri='" + uri + '\'' +
                ", httpVersion='" + httpVersion + '\'' +
                '}';
    }

    public RequestDTO(String requestMethod, String uri, String httpVersion) {
        this.requestMethod = requestMethod;
        this.uri = uri;
        this.httpVersion = httpVersion;
    }

    private String httpVersion = "HTTP/1.1";

    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getHttpVersion() {
        return httpVersion;
    }

    public void setHttpVersion(String httpVersion) {
        this.httpVersion = httpVersion;
    }
}
