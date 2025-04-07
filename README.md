# 📄 Testing with JUnit level 1

## 📄 Description - Exercise Statement
Create a Java class that manages a collection of books in a library. The class must allow you to add books, retrieve the list of books, obtain a specific book by that position, add a book to a specific position and delete a book by title.

**Implement the following functionalities:**

The class must allow the collection to be free.

You must be able to recover the complete list of books.

You must be able to obtain the title of a book donated a position.

You must be able to hold a book in a specific position.

You must be able to delete one book per title.



**Verify correct operation of JUnit:**

Verify that the book list is not null after creating a new object.

Confirm that the list has an expected size after inserting various books.

Make sure the list contains a specific book in the correct position.

Check that there are no duplicate book titles on the list.

They prove that it is possible to recover the title of a book donated to a specific position.

Make sure that adding a book correctly modifies the list.

Confirm that removing a free item decreased the size of the list.

Verify that the list is in alphabetical order after adding or deleting a book.

## 💻 Technologies Used

- IntelliJ IDEA Community Edition 2024.3.4.1

## 📋 Requirements

- IntelliJ IDEA
- Last version of JUnit 5

## 🛠️ Installation

**Clone:**
1. File > New > Project from Version Control
2. Paste GitHub URL
3. Select destination folder

**Configure:**
1. Open File > Project Structure
2. Assign correct JDK (Java 8/11/17...)

**Dependencies:**
- For Maven: Click "Load IntelliJ IDEA Project"
- For Maven: Click "Load Maven Project"
- For Gradle: Click "Load Gradle Project"

**Run:**
1. Locate class with `public static void main`
2. Right-click > Run 'Class.main()'  