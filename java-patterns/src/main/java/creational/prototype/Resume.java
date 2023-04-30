package creational.prototype;

import lombok.Setter;
import lombok.ToString;

/**
 * Usage: ConcretePrototype <br/>
 * Date: 2023/4/27 13:05 <br/>
 *
 * @author <a href="mailto:hanzhang2566@foxmail.com">hanzhang</a>
 */
@ToString
public class Resume implements Cloneable {
    /**
     * 姓名
     */
    private final String name;

    /**
     * 性别
     */
    private String sex;

    /**
     * 年龄
     */
    private int age;

    /**
     * 住址
     */
    @Setter
    private String address;

    /**
     * 工作经历
     */
    private Experience experience;

    public Resume(String name) {
        this.name = name;
        experience = new Experience();
    }

    /**
     * 设置个人信息
     *
     * @param sex 性别
     * @param age 年龄
     */
    public void setPersonalInfo(String sex, int age) {
        this.sex = sex;
        this.age = age;
    }

    /**
     * 设置工作经历
     *
     * @param hireDate 入职时间
     * @param company  公司
     */
    public void setExperience(String hireDate, String company) {
        experience.setHireDate(hireDate);
        experience.setCompany(company);
    }

    /**
     * 深克隆 {@link Resume} 对象
     *
     * @return Resume {@link Resume}
     * @throws CloneNotSupportedException 实现 clone 方法但没有 implements {@link Cloneable}
     */
    @Override
    protected Resume clone() throws CloneNotSupportedException {
        Resume resume = (Resume) super.clone();
        // 调用引用对象的 clone 方法
        resume.experience = experience.clone();
        return resume;
    }
}
