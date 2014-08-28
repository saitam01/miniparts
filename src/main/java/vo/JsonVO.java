package vo;

import java.io.Serializable;

/**
 * Created by maguirre on 20-08-14.
 */
public class JsonVO implements Serializable {

    public JsonVO() {
    }

    private String body = "empty";

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
