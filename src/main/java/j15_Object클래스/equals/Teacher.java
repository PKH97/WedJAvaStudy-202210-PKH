package j15_Object클래스.equals;

import java.util.Objects;

public class Teacher {

    private String name;
    private String schoolName;

    public Teacher(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }

//    @Override
//    public boolean equals(Object obj) {
//
//        if(this == obj)return true;
//        if(obj == null)return false;
//        if(getClass() == obj.getClass())return false;
//
//        Teacher other = (Teacher) obj;
//        return Objects.equals(name, ((Teacher)obj).name)
//                && Objects.equals(schoolName, ((Teacher)obj).schoolName);
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(name, teacher.name)
                && Objects.equals(schoolName, teacher.schoolName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, schoolName);
    } // hashCode로 값을 지정했기 때문에 안에 넣은 값만을 비교할 수 있다.

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
