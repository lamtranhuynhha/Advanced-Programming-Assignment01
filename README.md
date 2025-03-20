**Advanced Programming Assignment 01 - "Let the battle commence"**

📖**Description**
This project is a combat simulation game based on object-oriented principles. The game consists of multiple character types that engage in battles, each following specific rules for calculating their Combat Score. The implementation is based on a provided class diagram, with predefined and user-implemented classes.
Project Structure

The project is divided into three parts:

Part A: Includes initial classes, mostly abstract classes or interfaces. These classes are provided in bytecode form, specifically:
- The interface Combatable.class
- 3 abstract classes, which are Human.classes, Fighter.class, Monster.class
- Main.class contains the main method
- Battle.class contains the Battle class which simulates a battle, calculates the fighting results

Part B: Contains fixed classes that must be implemented. These classes define different types of warriors and monsters with unique combat mechanics.

Part C: Includes customizable classes that can be modified based on the implementation needs.

⚙️ Installation

Clone this repository

Navigate to the project folder

Compile the Java files

🚀 Usage

Run the main class to start the combat simulation:

🏆 Character Types & Combat Rules

1. Knight & Warrior

On a regular ground, their Combat Score is calculated as follows:

If WP == 1, then CombatScore = baseHP

Otherwise, CombatScore = baseHP / 10

Special cases:

If the ground number is prime, Warriors' Combat Score is double their baseHP.

If the ground number is a perfect square, Knights' Combat Score is double their baseHP.

2. Paladin

Combat Score is always triple the baseHP on any ground.

If baseHP is a Fibonacci number Fn with n > 2, Combat Score is 1000 + n.

Example: If baseHP = 34 (F9), then Combat Score = 1009.

3. Death Eater

A monster with no HP but only MP, represented as a complex number C = (real, imaginary).

Combat Score is the magnitude of the complex number.

🛠 Implementation Details

The TeamMaker class determines game settings dynamically based on test cases. This class is not required to be implemented.

The project follows OOP principles such as inheritance, polymorphism, and encapsulation.

Uses mathematical functions for prime numbers, perfect squares, and Fibonacci sequences.

**Test Unit**

Navigate source/Test and run the Test class to test the project. For details about the Expected and the actual Ouput, see "text_results.txt" and "TestExpected.txt"

There are also 3 official test case provided in class/TestRunner
