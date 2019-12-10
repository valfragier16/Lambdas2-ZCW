import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;


public class PersonTest {
    private Person person;

    @Test
    public void getName() {
        String expected = "Valerie Fragier";
        person = new Person(expected,null,null,null);
        String actual = person.getName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setName() {
        String expected = "Jhene Aiko";
        person = new Person();
        person.setName(expected);
        String actual = person.getName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getBirthday() {
        LocalDate expected = LocalDate.of(1994,1,6);
        person = new Person(null, expected,null,null);
        LocalDate actual = person.getBirthday();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setBirthday() {
        LocalDate expected = LocalDate.of(2011,1,2);
        person = new Person();
        person.setBirthday(expected);
        LocalDate actual = person.getBirthday();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getGender() {
        Person.Sex expected = Person.Sex.MALE;
        person = new Person(null,null,expected,null);
        Person.Sex actual = person.getGender();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setGender() {
        Person.Sex expected = Person.Sex.FEMALE;
        person = new Person();
        person.setGender(expected);
        Person.Sex actual = person.getGender();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getEmailAddress() {
        String expected = "email@ddr.ess";
        person = new Person(null,null,null,expected);
        String actual = person.getEmailAddress();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setEmailAddress() {
        String expected = "email@ddr.ess";
        person = new Person();
        person.setEmailAddress(expected);
        String actual = person.getEmailAddress();
        Assert.assertEquals(expected,actual);
    }

}