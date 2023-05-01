package creational.builder;

import lombok.Getter;
import lombok.ToString;

/**
 * Usage: 人物类 <br/>
 * Date: 2023/5/1 15:19 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
@ToString
public class Person {
    private final String name;

    private final String address;

    private Person(Builder builder) {
        name = builder.getName();
        address = builder.getAddress();
    }

    @Getter
    public static class Builder {
        private String name;

        private String address;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
