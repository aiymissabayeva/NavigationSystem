# Navigation System - Strategy Pattern

## Project Description

This project demonstrates the Strategy Design Pattern in Java using a simple navigation system.

The application supports three different route planning strategies: car, walking, and cycling. The user can switch between strategies at runtime without modifying the Navigator class.

## Project Structure

```text
NavigationSystem/
├── src/
│   ├── RouteStrategy.java
│   ├── CarStrategy.java
│   ├── WalkStrategy.java
│   ├── CycleStrategy.java
│   ├── Navigator.java
│   └── Main.java
├── docs/
│   └── strategy-uml.png
└── README.md
```

## Pattern Components

- **RouteStrategy:** Common interface for all route planning strategies.
- **CarStrategy:** Provides a car route.
- **WalkStrategy:** Provides a walking route.
- **CycleStrategy:** Provides a cycling route.
- **Navigator (Context):** Stores the selected strategy and delegates route building to it.
- **Main (Client):** Creates strategies and demonstrates runtime strategy switching.

## How to Run

1. Open the project in IntelliJ IDEA.
2. Make sure Java JDK 17 is configured.
3. Open `Main.java`.
4. Run the `main()` method.

## Example Output

```text
Car route: Astana Arena -> Highway -> Keruen
Walking route: Astana Arena -> Footpath -> Keruen
Cycling route: Astana Arena -> Cycle lane -> Keruen
```

## Adding a New Strategy

1. Create a new class implementing `RouteStrategy`.
2. Override the `buildRoute(String from, String to)` method.
3. Implement the new route behavior.
4. Select the new strategy using `navigator.setStrategy()`.

The existing Navigator class does not need to be modified.

## Benefits

- Eliminates conditional logic for selecting route algorithms inside Navigator.
- Supports runtime strategy switching.
- Follows the Open/Closed Principle.
- Separates algorithms into independent classes.
- Makes the code easier to extend and maintain.
