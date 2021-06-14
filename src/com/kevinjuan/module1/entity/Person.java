/**
 * @author Kevin Juan 1972002
 */
package com.kevinjuan.module1.entity;

public class Person {
    private String firstName,lastName;
    private UserStatistic userStatistic;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UserStatistic getUserStatistic() {
        return userStatistic;
    }

    public void setUserStatistic(UserStatistic userStatistic) {
        this.userStatistic = userStatistic;
    }
    public String toString(){
        return getFirstName() + " " + getLastName();
    }
}
