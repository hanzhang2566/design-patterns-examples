package creational.builder;

import lombok.Builder;
import lombok.ToString;

/**
 * Usage: 人物类 <br/>
 * Date: 2023/5/1 15:19 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
@ToString
@Builder
public class Student {
    private String name;

    private String address;
}
