![logo_ironhack_blue 7](https://user-images.githubusercontent.com/23629340/40541063-a07a0a8a-601a-11e8-91b5-2f13e4e6b441.png)

# LAB Java | Intro to JPA

## Introduction

We have just learned how to create entity objects and use JPA repos to query data so let's practice a bit more.

<br>

## Requirements

1. Fork this repo.
2. Clone this repo.
3. Add your instructor and the class graders as collaborators to your repository. If you are unsure who your class graders are, ask your instructor or refer to the day 1 slide deck.
4. In the repository, create a Java project and add the code for the following prompts.

## Submission

Once you finish the assignment, submit a URL link to your repository or your pull request in the field below.

<br>

## Instructions

For this homework assignment, you will be using the data from the flight database from lab 3.02 and the [Spring JPA Documentation](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation).

You will be creating three main classes and an enum class: `FlightBooking`, `Customer` and `Flight`. The enum class will be called `CustomerStatus`.

<br>

### `CustomerStatus` enum

Create an enum class called `CustomerStatus` with the following values:

- `Gold`
- `Silver`
- `None`

<br>

### `Customer` class

Create a class called `Customer` with the following variables:

- `customerId` (integer): an auto-generated unique identifier, private member
- `customerName` (string): private member
- `customerStatus` (string): representing an enum, private member
- `totalCustomerMileage` (integer): private member
- Add an empty constructor to the `Customer` class for Hibernate to create new instances of the class.
- Add a parameterized constructor to the `Customer` class that takes `customerName`, `customerStatus` and `totalCustomerMileage` as parameters.
- Add public getter and setter methods for each variable in the `Customer` class.

<br>

### `Flight` class

Create a class called `Flight` with the following variables:

- `flightId` (integer): an auto-generated unique identifier, private member
- `flightNumber` (string): a unique identifier, private member
- `aircraft` (string): private member
- `totalAircraftSeats` (integer): private member
- `flightMileage` (integer): private member
- Add an empty constructor to the `Flight` class for Hibernate to create new instances of the class.
- Add a parameterized constructor to the `Flight` class that takes `flightNumber`, `aircraft`, `totalAircraftSeats` and `flightMileage` as parameters.
- Add public getter and setter methods for each variable in the `Flight` class.

<br>

### `FlightBooking` class

Create a class called `FlightBooking` with the following variables:

- `bookingId` (integer): an auto-generated unique identifier, private member
- `customerId` (integer): private member
- `flightId` (integer): private member
- Add an empty constructor to the `FlightBooking` class for Hibernate to create new instances of the class.
- Add a parameterized constructor to the `FlightBooking` class that takes `customerId` and `flightId` as parameters.
- Add public getter and setter methods for each variable in the `FlightBooking` class.
- Add foreign key constraints in the `FlightBooking` class to reference the `customerId` and `flightId` in the `customers` and `flights` tables respectively.

<br>

## Tasks

1. Create all the necessary repositories and entities for the `Customer` table.
2. Create all the necessary repositories and entities for the `Flight` table.
3. Create all the necessary repositories and entities for the `FlightBooking` table.
4. Write tests to verify your ability to create new customers.
5. Write tests to verify your ability to create new flights.
6. Write tests to verify your ability to find customers by name.
7. Write tests to verify your ability to find customers by status.
8. Write tests to verify your ability to find flights by flight number.
9. Write tests to verify your ability to find aircraft with names containing "Boeing".
10. Write tests to verify your ability to find flights with a distance greater than 500 miles.

<br>

## FAQs

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">I am stuck and don't know how to solve the problem or where to start. What should I do?</summary>

  <br> <!-- ✅ -->

  If you are stuck in your code and don't know how to solve the problem or where to start, you should take a step back and try to form a clear, straight forward question about the specific issue you are facing. The process you will go through while trying to define this question, will help you narrow down the problem and come up with potential solutions.

  For example, are you facing a problem because you don't understand the concept or are you receiving an error message that you don't know how to fix? It is usually helpful to try to state the problem as clearly as possible, including any error messages you are receiving. This can help you communicate the issue to others and potentially get help from classmates or online resources.

  Once you have a clear understanding of the problem, you should be able to start working toward the solution.

</details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">How do I create a Spring boot project?</summary>

  <br> <!-- ✅ -->

  Spring boot is a framework for creating stand-alone, production-grade applications that are easy to launch and run. The best way to create a Spring boot project is to use the Spring Initializer website. The website provides a convenient way to generate a basic project structure with all the necessary dependencies and configurations.

  - Step 1: Go to [start.spring.io](https://start.spring.io/)
  - Step 2: Choose the type of project you want to create, such as Maven or Gradle.
  - Step 3: Select the version of Spring Boot you want to use.
  - Step 4: Choose the dependencies you need for your project. Some common dependencies include web, jpa and data-jpa.
  - Step 5: Click the "Generate" button to download the project files.

  Alternatively, you can use an Integrated Development Environment (IDE) such as Eclipse or IntelliJ IDEA. These IDEs have plugins for creating Spring boot projects, making it easy to set up the environment and get started with coding.

 </details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">What is JPA and how can I use it in Java?</summary>

  <br> <!-- ✅ -->

  JPA stands for Java Persistence API, which is a Java specification for accessing, persisting and managing data between Java objects and a relational database. JPA provides a standard interface for accessing databases, reducing the need for custom data access code and enabling efficient management of database connections.

  To use JPA in Java, you will need to include the necessary dependencies in your project, such as the Hibernate JPA implementation and create entity classes to represent your data. These entity classes will be annotated with JPA-specific annotations, such as `@Entity` and `@Id`, to indicate the mapping between the Java class and the database table.

  Here is a code snippet to show you how to create a JPA entity class in Java:

  ```java
  @Entity
  public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String name;
    private int age;
    private String position;

    // Getters and Setters for the attributes
  }
  ```

  <br>

   

</details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">What is the purpose of using the "@Entity", "@Table" and "@Column" annotations in JPA (Java Persistence API)?</summary>

  <br> <!-- ✅ -->

  The `@Entity`, `@Table` and `@Column` annotations in JPA (Java Persistence API) are used to map Java objects to relational database tables.

  `@Entity` is used to mark a class as a persistent entity. This means that instances of the class can be stored in a database.

  `@Table` is used to define the name of the database table that the entity will be mapped to.

  `@Column` is used to define the columns in the table that correspond to the attributes of the entity.

  Here is an example of how to use these annotations:

  ```java
  @Entity
  @Table(name="employee")
  public class Employee {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    //getters and setters
  }
  ```

  In this example, the `Employee` class is marked as a persistent entity using the `@Entity` annotation. The name of the database table is defined using the `@Table` annotation as "employee". The `id`, `firstName` and `lastName` attributes are mapped to columns in the "employee" table using the `@Column` annotation.

  <br>

   

</details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">What is "JpaRepository" and how can I use it in Java?</summary>

  <br> <!-- ✅ -->

  `JpaRepository` is a Spring Data interface that extends the `PagingAndSortingRepository` interface. It provides all the basic **CRUD (Create, Read, Update, Delete)** operations and additional methods to work with **JPA (Java Persistence API)** to interact with the database.

  To use `JpaRepository` in your project, follow the below steps:

  Step 1: Import the necessary libraries

  ```java
  import org.springframework.data.jpa.repository.JpaRepository;
  ```

  Step 2: Create an interface that extends `JpaRepository`

  ```java
  public interface MyRepository extends JpaRepository<MyEntity, Long> {

  }
  ```

  **Note**: In the above code, `MyEntity` is the entity class that you want to interact with the database and Long is the type of the primary key of `MyEntity`.

  Step 3: Inject the interface in the class where you want to use it.

  ```java
  @Autowired
  private MyRepository myRepository;
  ```

  Step 4: You can now use the methods provided by `JpaRepository` to interact with the database, for example:

  ```java
  MyEntity myEntity = new MyEntity();
  myRepository.save(myEntity);
  ```

  With the above steps, you can now use `JpaRepository` to interact with the database in your Java project.

  <br>

   

</details>

<br>

<details>
  <summary style="font-size: 16px; cursor: pointer; outline: none; font-weight: bold;">I am unable to push changes to my repository. What should I do?</summary>

  <br> <!-- ✅ -->

  If you are unable to push changes to your repository, here are a few steps that you can follow:

  1. Check your internet connection: Ensure that your internet connection is stable and working.
  1. Verify your repository URL: Make sure that you are using the correct repository URL to push your changes.
  2. Check Git credentials: Ensure that your Git credentials are up-to-date and correct. You can check your credentials using the following command:

  ```bash
  git config --list
  ```

  4. Update your local repository: Before pushing changes, make sure that your local repository is up-to-date with the remote repository. You can update your local repository using the following command:

  ```bash
  git fetch origin
  ```

  5. Check for conflicts: If there are any conflicts between your local repository and the remote repository, resolve them before pushing changes.
  6. Push changes: Once you have resolved any conflicts and updated your local repository, you can try pushing changes again using the following command:

  ```bash
  git push origin <branch_name>
  ```

</details>
