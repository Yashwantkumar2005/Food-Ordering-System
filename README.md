# OrderMunch - Food Ordering System

A JavaFX-based desktop application for online food ordering with multiple restaurant options.

## Features

- User authentication (Login/Registration)
- Multiple restaurant menus:
  - ATB (A2B) - South Indian cuisine
  - KFC - Fried chicken and fast food
  - MR - Mughlai cuisine
  - CR - Chinese restaurant
- Cart management
- Order tracking
- Payment processing
- Help/Support section
- Attractive UI with custom styling

## Project Structure

```
OrderMunchloginui/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/ordermunch/ordermunchloginui/
│   │   │       ├── controllers/          # All FXML controllers
│   │   │       ├── model/                # Data models (if any)
│   │   │       ├── utils/                # Utility classes
│   │   │       └── OrderMunchApplication.java  # Main application class
│   │   └── resources/
│   │       ├── com/ordermunch/ordermunchloginui/
│   │       │   ├── fxml/                 # All FXML files for UI
│   │       │   ├── css/                  # Stylesheets
│   │       │   ├── images/               # Restaurant logos and food images
│   │       │   └── ButtonImages/         # Button icons
│   │       └── background images
├── Readme_Images/                        # Screenshots for README
├── ordermunch.sql                        # Database schema
├── pom.xml                               # Maven configuration
└── mvnw*                                 # Maven wrapper
```

## Technologies Used

- **JavaFX** - For the graphical user interface
- **FXML** - For declarative UI design
- **CSS** - For styling the application
- **Maven** - For dependency management and build
- **MySQL** - For data storage (based on the SQL file)
- **JDBC** - For database connectivity

## Setup and Installation

1. **Prerequisites**
   - Java JDK 8 or higher
   - Maven 3.0+
   - MySQL Server

2. **Database Setup**
   - Import the `ordermunch.sql` file into your MySQL database
   - Update database credentials in `DatabaseConnection.java` if needed

3. **Build and Run**
   ```bash
   # Clone the repository
   git clone <repository-url>
   cd OrderMunchloginui
   
   # Build the project
   mvn clean install
   
   # Run the application
   mvn javafx:run
   ```
   
   Or using the Maven wrapper:
   ```bash
   ./mvnw clean install
   ./mvnw javafx:run
   ```

## Application Flow

1. **Launch Application** - Starts with login/registration screen
2. **User Authentication** - Login or register new account
3. **Main Menu** - Choose from different restaurant options
4. **Menu Selection** - Browse items and add to cart
5. **Cart Management** - Review and modify cart items
6. **Checkout** - Enter delivery information
7. **Payment** - Process payment (simulated)
8. **Order Confirmation** - View order details and tracking

## Controllers

- `LoginController.java` - Handles user login
- `RegisterController.java` - Handles user registration
- `MainmenuController.java` - Main restaurant selection screen
- Various restaurant controllers (ATB, KFC, MR, CR) - Handle menu displays
- `CartMenuController.java` - Manages shopping cart
- `OrderMenuController.java` - Handles order placement
- `PaymentController.java` - Processes payments
- `TrackMenuController.java` - Tracks order status
- `HelpMenuController.java` - Provides help/support
- `ContactMenuController.java` - Contact information

## Database Schema

The `ordermunch.sql` file contains tables for:
- Users (login credentials, personal information)
- Menu items (for each restaurant)
- Orders
- Order items
- Payments

## Customization

- To change the application theme, modify CSS files in `resources/css/`
- To add new restaurants, create new FXML files and corresponding controllers
- To modify menu items, update the database or FXML files
- To change images, replace files in the `resources/images/` directories

## Future Enhancements

- Integration with real payment gateways
- Admin panel for managing restaurants and menu items
- Order history for users
- Ratings and reviews system
- Promo codes and discounts
- Mobile-responsive design
- Real-time order tracking


## Acknowledgments

- JavaFX documentation and community
- Maven ecosystem
- Various open-source icons and images used in the application