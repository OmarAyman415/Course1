package Project;

import java.util.Date;

public class Courses
{
    String name;
    String room;
    String courseCode;
    double price;
    boolean publish;
    java.util.Date startDate;
    java.util.Date endDate;
    int daysOfCourse;

    public Courses()
    {

    }

    public Courses(String name, String room, String courseCode, double price, boolean publish, Date startDate, Date endDate, int daysOfCourse)
    {
        this.name = name;
        this.room = room;
        this.courseCode = courseCode;
        this.price = price;
        this.publish = publish;
        this.startDate = startDate;
        this.endDate = endDate;
        this.daysOfCourse = daysOfCourse;
    }

    public void showInstructors()
    {

    }

    public void showStudents()
    {

    }

    public void coursesNearToEnd()
    {

    }

    public void coursesNearToStart()
    {

    }

    public void addCourses()
    {

    }

    public void deleteCourses()
    {

    }

    public void updateCourses()
    {

    }
}
