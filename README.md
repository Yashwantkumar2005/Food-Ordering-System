# Package Manager

A desktop application for managing software packages and their versions, built with Python, Tkinter, and MySQL.

## Features

- **Package Management**: Add, remove, and list packages
- **Version Control**: Install multiple versions of packages, set current versions, and remove specific versions
- **Version History**: Track installation timestamps and maintain a history of all versions
- **Current Version Tracking**: Only one version can be marked as current per package
- **MySQL Persistence**: All data stored in a MySQL database for reliability
- **Modern Tkinter GUI**: Clean, intuitive interface for easy package management

## Project Structure

```
.
├── database.py           # Database connection and query handling
├── package_manager.py    # Core package management logic
├── gui_package_manager.py # Tkinter GUI interface
├── schema.sql            # Database schema definition
├── requirements.txt      # Python dependencies
├── test_package_manager.py # Unit tests for core components
└── README.md             # This file
```

## Installation

### Prerequisites

- Python 3.6+
- MySQL Server 8.0+
- mysql-connector-python package

### Setup

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd Package-manager
   ```

2. **Install dependencies**
   ```bash
   pip install -r requirements.txt
   ```

3. **Configure MySQL**
   - Ensure MySQL server is running
   - Update credentials in `gui_package_manager.py` if needed (defaults: localhost/root/1234)
   - The application will automatically create the `package_manager` database and tables

4. **Initialize the database**
   ```bash
   # The application will run the schema.sql automatically on first launch
   # Or you can manually initialize:
   mysql -u root -p < schema.sql
   ```

## Usage

### Running the Application

The application uses environment variables for database configuration. You can either:
1. Set the environment variables directly when running (recommended for security)
2. Or modify the default values in `gui_package_manager.py`

**Example using environment variables:**
```bash
DB_HOST=localhost DB_USER=your_username DB_PASSWORD=your_password DB_NAME=package_manager DB_PORT=3306 python gui_package_manager.py
```

**Important:** Replace `your_username` and `your_password` with your actual MySQL credentials. The database name (`package_manager`) will be created automatically if it doesn't exist.

> **Note:** Since this runs on your local machine, you're using your own MySQL instance. Your packages are stored in your local database, not in any shared or remote repository.

### Using the GUI

1. **Add a Package**
   - Click "Add Package" button
   - Enter package name and optional description

2. **Install Versions**
   - Select a package from the list
   - Click "Install Version"
   - Enter the version number to install

3. **Set Current Version**
   - Select a package
   - Select a version from the version list
   - Click "Set as Current"

4. **Remove Versions/Packages**
   - Select the item to remove
   - Click the appropriate remove button
   - Confirm the action in the dialog

5. **Refresh**
   - Click "Refresh" to reload the package list from the database

## Database Schema

The application uses two tables:

### packages
- `id`: Auto-increment primary key
- `name`: Unique package name
- `description`: Package description
- `created_at`: Timestamp of package creation

### package_installations
- `id`: Auto-increment primary key
- `package_id`: Foreign key to packages table
- `version_number`: Version string (e.g., "1.0.0")
- `installed_at`: Timestamp of installation
- `is_current`: Boolean flag indicating if this is the current version

## Testing

Run the unit tests to verify the core functionality:

```bash
python test_package_manager.py
```

Note: These tests verify the structure and basic functionality. For full integration tests, ensure MySQL is running and configured correctly.

## Configuration

Database connection parameters can be configured through environment variables. The application will use these values if set, otherwise it will use the defaults:
- `DB_HOST`: MySQL host (default: localhost)
- `DB_USER`: MySQL username (default: root)
- `DB_PASSWORD`: MySQL password (default: empty string - **you must set this**)
- `DB_NAME`: Database name (default: package_manager)
- `DB_PORT`: MySQL port (default: 3306)

**Important:** For security reasons, the GUI no longer hardcodes database credentials. You must set the `DB_PASSWORD` environment variable when running the application, or modify the defaults in `gui_package_manager.py`.

**Example:**
```bash
DB_HOST=localhost DB_USER=root DB_PASSWORD=your_password DB_NAME=package_manager DB_PORT=3306 python gui_package_manager.py
```

## Acknowledgments

- Built with Python Tkinter for the GUI
- Uses mysql-connector-python for database connectivity
- Inspired by package management systems like npm, pip, and apt