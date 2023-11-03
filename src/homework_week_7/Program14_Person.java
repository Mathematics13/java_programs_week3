package homework_week_7;

//Program 14 Person

/**Person
 * Write a class with the name Person. The class needs three fields (instance variables) with the names
 * firstName, lastName of type String and age of type int.
 * Write the following methods (instance methods):
 * *Method named getFirstName without any parameters, it needs to return the value of the
 * firstName field.
 * *Method named getLastName without any parameters, it needs to return the value of the
 * lastName field.
 * *Method named getAge without any parameters, it needs to return the value of the age field.
 * *Method named setFirstName with one parameter of type String, it needs to set the value of the
 * firstName field.
 * *Method named setLastName with one parameter of type String, it needs to set the value of the
 * lastName field.
 * *Method named setAge with one parameter of type int, it needs to set the value of the age field. If
 * the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
 * *Method named isTeen without any parameters, it needs to return true if the value of the age field is
 * greater than 12 and less than 20, otherwise, return false.
 * *Method named getFullName without any parameters, it needs to return the full name of the
 * person. *In case both firstName and lastName fields are empty, Strings return an empty String. *In
 * case firstName is an empty String, return firstName.
 * *In case lastName is an empty String, return lastName.
 * To check if s String is empty, use the method isEmpty from the String class. For example,
 * <p>
 * firstName.isEmpty() returns true if the String is empty or in other words, when the String does not
 * contain any characters.
 * TEST EXAMPLE
 * <p>
 * TEST CODE: (Write below code in to main method then check out put)
 * Person person = new Person();
 * person.setFirstName(&quot;&quot;); // firstName is set to empty string
 * person.setLastName(&quot;&quot;); // lastName is set to empty string
 * person.setAge(10);
 * System.out.println(&quot;fullName= &quot; + person.getFullName());
 * System.out.println(&quot;teen= &quot; + person.isTeen());
 * person.setFirstName(&quot;John&quot;); // firstName is set to John
 * person.setAge(18);
 * System.out.println(&quot;fullName= &quot; + person.getFullName());
 * System.out.println(&quot;teen= &quot; + person.isTeen());
 * person.setLastName(&quot;Smith&quot;); // lastName is set to Smith
 * System.out.println(&quot;fullName= &quot; + person.getFullName());
 * <p>
 * OUTPUT
 * fullName=
 * teen= false
 * fullName= John
 * teen= true
 * fullName= John Smith
 * NOTE: All methods should be defined as public NOT public static.
 * NOTE: In total, you have to write 8 methods.
 *
 *
 *
 */
public class Program14_Person
{
    String firstName,lastName;                                            //Instance variables
    int age;

    public static void main(String[] args)
    {
        Program14_Person person= new Program14_Person();
        person.setfirstName(" ");
        person.setlastName("  ");
        person.setAge(10);
        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
        person.setfirstName("John");                                   //firstName is set to John
        person.setAge(18);
        System.out.println("fullName = " + person.getFullName());
        System.out.println("teen = " +person.isTeen());
        person.setlastName("Smith");                                  //lastname is set to Smith
        System.out.println("fullName = " +person.getFullName());
    }

    public String getfirstName()                                       //get firstName metghod
    {
        return firstName;
    }
    public String getlastName()                                       //get lastName metghod
    {
        return lastName;
    }
    public int getAge()
    {
        return age;                                                  //get age method
    }
    public void setfirstName(String firstName)                       //set firstName metghod
    {
        this.firstName=firstName;
    }
    public void setlastName(String lastName)                         //set lastName metghod
    {
       this.lastName=lastName;
    }
    public void setAge(int age)                                     //set age method
    {
        if(age>0 && age<=100)
        {
            this.age=age;
        }
        else
        {
            this.age=0;
        }
    }
    public boolean isTeen()                                      //Check is it Teen or not method
    {
        if(getAge() >12 && getAge()<20)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public String getFullName()                                      //Get full name method
    {
        if(firstName.isEmpty() && lastName.isEmpty())
        {
            return " ";
        }
        else if(firstName.isEmpty())
        {
            return getlastName();
        }
        else if(lastName.isEmpty())
        {
            return getfirstName();
        }
        else
        {
            return getfirstName() + " " + getlastName();
        }
    }
}
