package pojo;

import java.io.Serializable;

/**
 * @Description:
 * @author: 向某人
 * @date:2019/11/22 下午 09:03
 */
public class User implements Serializable {
    private String name;
    private String email;
    private  int age;//(新增);



    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
