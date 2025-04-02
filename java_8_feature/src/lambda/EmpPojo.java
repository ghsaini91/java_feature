package lambda;

import java.util.Objects;

public class EmpPojo {

    int id;
    String name;

    public EmpPojo(int id,String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmpPojo empPojo = (EmpPojo) o;
        return id == empPojo.id && Objects.equals(name, empPojo.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "EmpPojo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
