package com.example.lastquiz.Helpers

import com.example.lastquiz.Models.Answer
import com.example.lastquiz.Models.QuestionItem

class QuizzieDatabaseHelper {
    companion object {
        val questions = listOf<QuestionItem>(
            QuestionItem(
                "What is a correct syntax to output Hello World in Kotlin?",
                listOf(
                    Answer(1, "val name = null"),
                    Answer(2, "var name: String"),
                    Answer(3, "val name: println Hello world"),
                    Answer(4, "val name: console.writte"),
                ),
                4,
                0
            ),
            QuestionItem(
                "Kotlin interfaces ad abstract classes are very similar. What is one thing abstract class can do that interfaces cannot?",
                listOf(
                    Answer(1, "Only abstract classes are inheritable by subclasses"),
                    Answer(2, "Only abstract classes can inherit from multiple superclasses"),
                    Answer(3, "Only abstract classes can have abstract methods"),
                    Answer(4, "Only abstract classes can store state reference"),
                ),
                4,
                0
            ),
            QuestionItem(
                "Your code need to try casting an object. If the cast is not possible, you do not want an exception generated, instead you want null to be assigned. Which operator can safely cast a value?",
                listOf(
                    Answer(1, "as? (reference)"),
                    Answer(2, "??"),
                    Answer(3, "is"),
                    Answer(4, "as"),
                ),
                1,
                0
            ),
            QuestionItem(
                "The function typeChecker receiver a parameter obj of type Any. Based upon the type of obj, it prints different messages for Int, String, Double, and Float types; if not any of the mentioned types, it prints unknown type' What operator allows you to determine the type of an object?",
                listOf(
                    Answer(1, "instanceof"),
                    Answer(2, "is (reference)"),
                    Answer(3, "typeof"),
                    Answer(4, "as"),
                ),
                2,
                0
            ),
            QuestionItem(
                "Inside an extension function, what is the name of the variable that corresponds to the receiver object",
                listOf(
                    Answer(1, "The variable is named it"),
                    Answer(2, "The variable is named this reference"),
                    Answer(3, "The variable is named receiver"),
                    Answer(4, "The variable is named default"),
                ),
                2,
                0
            ),
            QuestionItem(
                "Which function changes the value of the element at the current iterator location?",
                listOf(
                    Answer(1, "change()"),
                    Answer(2, "modify()"),
                    Answer(3, "set() (reference)"),
                    Answer(4, "assign()"),
                ),
                3,
                0
            ),
            QuestionItem(
                "You are upgrading a Java class to Kotlin. What should you use to replace the Java class's static fields?",
                listOf(
                    Answer(1, "an anonymous object"),
                    Answer(2, "a static property"),
                    Answer(3, "a companion object (reference)"),
                    Answer(4, "a backing field"),
                ),
                3,
                0
            ),
            QuestionItem(
                "The Kotlin .. operator can be written as which function?",
                listOf(
                    Answer(1, "a.from(b)"),
                    Answer(2, "a.range(b)"),
                    Answer(3, "a.rangeTo(b) (reference)"),
                    Answer(4, "a.to(b)"),
                ),
                3,
                0
            ),
            QuestionItem(
                "You would like to know each time a class property is updated. Which code snippet shows a built-in delegated property that can accomplish this?",
                listOf(
                    Answer(1, "Delegates.watcher()"),
                    Answer(2, "Delegates.observable() (reference)"),
                    Answer(3, "Delegates.rx()"),
                    Answer(4, "Delegates.observer()"),
                ),
                2,
                0
            ),
            QuestionItem(
                "You are attempting to assign an integer variable to a long variable, but Kotlin compiler flags it as an error. Why?",
                listOf(
                    Answer(1, "You must wrap all implicit conversion in a try/catch block"),
                    Answer(2, "You can only assign Long to an Int, not the other way around"),
                    Answer(3, "There is no implicit conversion from Int to Long (reference)"),
                    Answer(4, "All integers in Kotlin are of type Long"),
                ),
                3,
                0
            ),
            QuestionItem(
                "Kotlin has two equality operators, == and ===. What is the difference?",
                listOf(
                    Answer(1, "== determines if two primitive types are identical. === determines if two objects are identical"),
                    Answer(2, "== determines if two references point to the same object. === determines if two objects have the same value"),
                    Answer(3, "== determines if two objects have the same value. === determines if two strings have the same value"),
                    Answer(4, "== determines if two objects have the same value. === determines if two references point to the same object (reference)"),
                ),
                4,
                0
            ),
            QuestionItem(
                "Your function is passed by a parameter obj of type Any. Which code snippet shows a way to retrieve the original type of obj, including package information?",
                listOf(
                    Answer(1, "obj.classinfo()"),
                    Answer(2, "obj.typelnfo()"),
                    Answer(3, "obj::class.simpleName"),
                    Answer(4, "obj:class(reference)"),
                ),
                4,
                0
            ),
            QuestionItem(
                "You have created a class that should be visible only to the other code in its module. Which modifier do you use?",
                listOf(
                    Answer(1, "internal (reference)"),
                    Answer(2, "private"),
                    Answer(3, "public"),
                    Answer(4, "protected"),
                ),
                1,
                0
            ),
            QuestionItem(
                "Which code snippet correctly shows a for loop using a range to display 1 2 3 4 5 6 ?",
                listOf(
                    Answer(1, "for(z in 1..7) printin(\"z\")"),
                    Answer(2, "for(z in 1..6) print(\"z\") (reference)"),
                    Answer(3, "for(z in 1 to 6) print(\"z\")"),
                    Answer(4, "for(z in 1.7) print(\"z\")"),
                ),
                2,
                0
            ),
            QuestionItem(
                "Which line of code shows how to display a nullable string's length and shows o instead of null?",
                listOf(
                    Answer(1, "printin(b!!.length ?: 0)"),
                    Answer(2, "printin(b?.length ?: 0)"),
                    Answer(3, "printin(b?.length ?? 0)"),
                    Answer(4, "printin(b == null? O: b.length)"),
                ),
                2,
                0
            ),
        )
    }
}