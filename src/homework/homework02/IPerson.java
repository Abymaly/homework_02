package homework.homework02;

public interface IPerson {
    void setFirstName(String firstName);
    void setSurName (String surName);
    void setPesel (int pesel);

    String getFirstName();
    String getSurName();
    int getPesel();
}
