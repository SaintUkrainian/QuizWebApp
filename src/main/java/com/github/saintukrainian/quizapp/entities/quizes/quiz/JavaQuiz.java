package com.github.saintukrainian.quizapp.entities.quizes.quiz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.github.saintukrainian.quizapp.entities.quizes.questions.JavaQuestion;
import com.github.saintukrainian.quizapp.entities.quizes.questions.Question;

public class JavaQuiz implements Quiz {
    private String name;
    private List<Question> questions;
    private Set<String> rightAnswers;

    public JavaQuiz() {
        name = "Java";
        rightAnswers = new HashSet<>();
        rightAnswers.add("platform-independent programming language");
        rightAnswers.add("object-oriented language");
        rightAnswers.add("Multi-threaded");
        rightAnswers.add("platform-independent");
        rightAnswers.add("high-performance");
        rightAnswers.add("it uses just in time compiler");
        rightAnswers.add("Intellij");
        rightAnswers.add("NetBeans");
        rightAnswers.add("it's a method with a class name, which is used to create objects");
        rightAnswers.add("it's a template which describes object's behavior and state");
        rightAnswers.add("it's an instance of class");
        rightAnswers.add("inheritance");
        rightAnswers.add("polymorphism");
        rightAnswers.add("encapsulation");
        rightAnswers.add("abstraction");
        rightAnswers.add("local variable is defined inside a method scope, instance - inside the class");
        rightAnswers.add("it's a relationship between classes where one extends another");
        rightAnswers.add("mechanism for securing fields inside  methods (getters/setters)");
        rightAnswers.add("mechanism for overriding methods inside inheritance hierarchy");
        rightAnswers.add(
                "it's meant to recreate methods with the same signature and with the same or different sets of params");
        rightAnswers.add(
                "it's is meant to create methods inside the class with the same signature but with different sets of params");
        rightAnswers.add("it's a set of instructions for class");
        rightAnswers.add("Abstract class is a class which describes entity");
        rightAnswers.add("Array - can't be resized dinamicly, ArrayList - can be");
        rightAnswers.add("String exists in a constant string pool, Builder and Buffer exist in stack");
        rightAnswers.add("Public - can be accessed anywhere, Private - only inside the class");
        rightAnswers
                .add("default - inside the package, protected - can be accessed outside the package by inheritance");

        questions = new ArrayList<>();
        questions.add(new JavaQuestion("#1) What is JAVA?", "coocking machine",
                "platform-independent programming language", "coffee mug", "low-level programming language"));
        questions.add(new JavaQuestion("#2) What are the features in JAVA?", "object-oriented language",
                "Multi-threaded", "platform-independent", "high-performance"));
        questions.add(new JavaQuestion("#3) How does Java enable high performance?", "it uses just in time compiler",
                "god helps", "you should wait 10 sec, until it starts compiling", "don't know"));
        questions.add(new JavaQuestion("#4) Name the Java IDE’s?", "Intellij", "NetBeans", "VS Code", "Atom"));
        questions.add(new JavaQuestion("#5) What do you mean by Constructor?", "it's a method for collecting garbage",
                "it's a method for getting hash code of element", "it's a method for getting sum of elements",
                "it's a method with a class name, which is used to create objects"));
        questions.add(new JavaQuestion("#6) What is meant by the Local variable and the Instance variable?",
                "local variable is defined inside a method scope, instance - inside the class",
                "they are defined inside the class", "they are defined inside the package", "they are not defined"));
        questions.add(
                new JavaQuestion("#7) What is a Class?", "it's a template which describes object's behavior and state",
                        "it's a class at school", "it's an instance of object", "it's an object itself"));
        questions.add(new JavaQuestion("#8) What is an Object?", "it's an instance of class",
                "it's an object inside your house", "it's your cat", "it's a class itself"));
        questions.add(new JavaQuestion("#9) What are the OOPs concepts?", "inheritance", "polymorphism",
                "encapsulation", "abstraction"));
        questions.add(new JavaQuestion("#10) What is Inheritance?",
                "it's a relationship between classes where one extends another", "It's dull thing",
                "it's a mechanism which helps us to create methods", "i don't know"));
        questions.add(new JavaQuestion("#11) What is Encapsulation?", "mechanism for overloading methods",
                "mechanism for securing fields inside  methods (getters/setters)",
                "mechanism which protects fields from the class", "i don't know"));
        questions.add(new JavaQuestion("#12) What is Polymorphism?",
                "mechanism for overriding methods inside inheritance hierarchy", "mechanism for creating methods",
                "mechanism for creating classes", "i don't know"));
        questions.add(new JavaQuestion("#13) What is meant by Method Overriding?", "it's meant to create classes",
                "it's meant to create methods",
                "it's meant to recreate methods with the same signature and with the same or different sets of params",
                "i don't know"));
        questions.add(new JavaQuestion("#14) What is meant by Overloading?",
                "it's is meant to create methods inside the class with the same signature but with different sets of params",
                "Means to overload the JVM", "has the same meaning as overriding", "i don't know"));
        questions.add(new JavaQuestion("#15) What is meant by Interface?", "it's a set of instructions for class",
                "it's a GUI", "It's an app's interface", "i don't know"));
        questions.add(new JavaQuestion("#16) What is meant by Abstract class?",
                "Abstract class is a class which describes entity", "It's a class which describes behavior of entity",
                "It's a class which is used for calculations", "i don't know"));
        questions.add(new JavaQuestion("#17) Difference between Array and Array List.",
                "Array - can't be resized dinamicly, ArrayList - can be",
                "Array is stored in stack, ArrayList - in heap", "They are equal", "i don't know"));
        questions.add(new JavaQuestion("#18) Difference between String, String Builder, and String Buffer.",
                "String exists in a constant string pool, Builder and Buffer exist in stack",
                "String is used for a string, Buffer and Builder for arrays", "Ther's no difference", "i don't know"));
        questions.add(new JavaQuestion("#19) Explain about Public and Private access specifiers.",
                "Public - can be accessed anywhere, Private - only inside the class",
                "Public - inside the package, Private - inside the class", "They are equal", "i don't know"));
        questions.add(new JavaQuestion("#20) Difference between Default and Protected access specifiers.",
                "default - inside the package, protected - can be accessed outside the package by inheritance",
                "Default - anywhere, Protected - inside the class", "They are equal", "i don't know"));

    }

    public String getName() {
        return name;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public Set<String> getRightAnswers() {
        return rightAnswers;
    }

}
