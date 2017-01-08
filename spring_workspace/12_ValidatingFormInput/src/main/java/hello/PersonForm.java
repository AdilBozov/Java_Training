package hello;

/**
 * Created by Adil Bozov on 30.08.2016 г..
 */

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PersonForm {

    @NotNull
    @Size(min = 2, max = 30)
    private String name;

    @NotNull
    @Min(18)
    private Integer age;

    public String getName(){
        return this.name;
    }

    public void steName(String name){
        this.name = name;
    }

    public Integer getAge(){
        return this.age;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public String toString(){
        return "Person(name: " + this.name + ", Age: " + this.age + ")";
    }
}
