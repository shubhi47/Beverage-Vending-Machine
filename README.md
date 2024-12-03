# Beverage-Vending-Machine
A Java project for a vending machine offering beverages like coffee, juice, and wine.
# Beverage Vending Machine Project

## Overview
This project simulates a **Beverage Vending Machine** implemented in Java. Users can select their desired beverage (Coffee, Juice, or Wine), specify the number of cups, and complete a cash transaction. The program handles inputs, calculates the total cost, and provides change or prompts for additional payment if necessary.

---

## Features
- **Beverage Selection**: Choose from Coffee, Juice, or Wine.
- **Dynamic Pricing**: Each beverage has a specific cost per cup:
  - Coffee: Rs. 100 per cup
  - Juice: Rs. 120 per cup
  - Wine: Rs. 500 per cup
- **Total Amount Calculation**: Automatically calculates the total price based on the number of cups.
- **Cash Handling**: Accepts user input for payment and provides change or prompts for a valid amount.
- **Interactive Menu**: Allows users to place multiple orders in a single session.

---

## Project Structure
```
beverages_project
├── Beverages.java       # Interface for beverages
├── Coffee.java          # Implementation for Coffee beverage
├── Juice.java           # Implementation for Juice beverage
├── Wine.java            # Implementation for Wine beverage
├── VendingMachine.java  # Handles beverage selection logic
├── User.java            # Main class for user interaction
```

---

## How to Run
1. **Clone the Repository**:
   ```bash
   git clone <repository_link>
   cd beverages_project
   ```

2. **Compile the Code**:
   ```bash
   javac beverages_project/*.java
   ```

3. **Run the Program**:
   ```bash
   java beverages_project.User
   ```

4. **Follow the On-Screen Prompts**:
   - Select a beverage by entering the corresponding number.
   - Specify the number of cups.
   - Enter the payment amount.
   - Repeat the process or exit the program.

---

## Classes and Functionalities
### `Beverages` Interface
Defines two methods:
- `drink()`: Placeholder for actions related to drinking the beverage.
- `getTotalAmount()`: Calculates the total cost based on the number of cups.

### `Coffee`, `Juice`, `Wine`
- Implement the `Beverages` interface.
- Provide beverage-specific pricing and messages.

### `VendingMachine`
- Displays the beverage menu.
- Accepts user input for beverage selection.
- Instantiates the selected beverage class.

### `User`
- Main driver class.
- Facilitates user interaction and enables repeat orders.

---

## Sample Output
```
Select your beverage and enjoy it!
Press 1 for coffee...
Press 2 for juice...
Press 3 for wine...

You select coffee as your beverage
Amount of coffee is Rs.100 per cup
Enter number of cups: 2
Total amount to pay: Rs200
Enter your cash: 250
Collect your cups of coffee from counter and change of Rs50
Add sugar as per your taste and drink the coffee
Press Y/y to continue your order...
Thank you... Wait for next time!
```

---

## Improvements
- Add more beverages with dynamic menu options.
- Implement a graphical user interface (GUI).
- Add a database to track sales.
- Enhance input validation and error handling.

---

## License
This project is open-source and available for educational purposes.
