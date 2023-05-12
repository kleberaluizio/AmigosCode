package com.kleberaluizio.user;

public class User {
    private Id id;

    public User(String lastName, String firstName, int age) {
        this.id = new Id(lastName,firstName, age);
    }

    public Id getId() {
        return id;
    }


    @Override
    public String toString() {
        return id.lastName + ", " + id.firstName + ", " + id.age;
    }

    public static final class Id {
        private String firstName;
        private String lastName;
        private int age;

        private Id(String lastName,
                   String firstName,
                   int age) {
            this.lastName = lastName;
            this.firstName = firstName;
            this.age = age;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }


        public int getAge() {
            return age;
        }

        @Override
        public int hashCode() {
            return this.lastName.hashCode() + this.firstName.hashCode() + 57 + String.format("%d",this.age).hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            Id id = (Id) obj;
            if(this.lastName.equals(id.lastName)) {
                return (this.firstName == id.firstName);
            }
            return false;
        }
    }

}


