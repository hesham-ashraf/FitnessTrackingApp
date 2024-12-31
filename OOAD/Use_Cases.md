# Fitness Tracking App: Use Case Descriptions

### Use Case 1: com.fitness.app.entity.User Registration/Login
    Use Case ID: UC-01
    Use Case Name: com.fitness.app.entity.User Registration/Login
    Actor: com.fitness.app.entity.User, Stakeholders
    Description: Allows users to create an account and log in to the app to access specific features.
    Preconditions:
        - The user must have opened the app.
        - For login, the user must already have an account created.
    Main Flow
    1. The user selects "Register" or "Login" from the home screen.
    2. For registration:
        - The system allows the user to enter their name, email, and password.
        - The user submits the registration form.
        - The system checks the information and saves it in the database.
        - The system confirms successful registration.
    3. For login:
        - The user enters their email and password.
        - The user successfully enters the account.
    Postconditions:
        - A new user account is created for registration.
        - The user is logged into their account for either registration or login.
    Alternative Flow:
        - If the email already exists during registration, the system informs the user to reset their password or use a different email.

### Use Case 2: Workout Logging
    Use Case ID: UC-02
    Use Case Name: Workout Logging
    Actors: com.fitness.app.entity.User, Stakeholders
    Description: Users can record details of their workouts to track progress over time.
    Preconditions:
        - The user must be logged into their account.
        - The user must have an active internet connection.
    Main Flow:
    1. The user selects "Log Workout" from the menu.
    2. The system prompts the user to enter:
        - Workout type.
        - Duration.
        - Intensity level.
    3. The user submits the workout details.
    4. The system saves the workout and updates the user’s progress.
    Postconditions:
        - The user’s progress report is updated with the new entry.
    Alternative Flow:
        - If the user enters a negative duration, the system informs the user to correct it.

### Use Case 3: Goal Setting
    Use Case ID: UC-03
    Use Case Name: Goal Setting
    Actors: com.fitness.app.entity.User, Stakeholders
    Description: Users can set needed fitness goals with specific deadlines.
    Preconditions:
        - The user must be logged into their account.
    Main Flow:
    1. The user selects "Set Goal" from the menu.
    2. The system makes the user specify:
        - Goal type (e.g., weight loss, strength gain).
        - Target value (e.g., lose 5 kg).
        - Specified deadline (e.g., 3 months from today).
    3. The user confirms the goal details.
    4. The system saves the goal in the user profile database.
    Postconditions:
        - The system begins to track the progress toward their goal.
    Alternative Flow:
        - If the required fields are not completed, the system informs the user to complete their information before saving.

### Use Case 4: Progress Tracking
    Use Case ID: UC-04
    Use Case Name: Progress Tracking
    Actors: com.fitness.app.entity.User, Stakeholders
    Description: Users can view their detailed progress reports.
    Preconditions:
        - The user must be logged into their account.
    Main Flow:
    1. The user selects "View Progress" from the menu.
    2. The system retrieves logged workouts and goals from the database.
    3. The system generates a progress report:
        - Visual charts showing workout frequency over time.
        - A summary of progress toward goals.
    4. The user views the report and receives feedback.
    Postconditions:
        - The user receives feedback.
    Alternative Flow:
        - If no workouts exist, the system will display a message telling the user to start the activities.

### Use Case 5: Personalized Feedback
    Use Case ID: UC-05
    Use Case Name: Personalized Feedback
    Actors: com.fitness.app.entity.User, Stakeholders
    Description: The system provides automated insights based on logged workouts and goals.
    Preconditions:
        - The user must have logged at least one workout or set a goal.
        - The user must be logged into their account.
    Main Flow:
    1. The user selects "Get Feedback" from the dashboard.
    2. The system analyzes the user’s data, including:
        - Logged workouts.
        - Active goals.
    3. The system generates feedback, such as:
        - Weekly summaries.
        - Motivational tips.
    4. The user views the feedback.
    Postconditions:
        - The user has actionable insights to improve their fitness routine.
        - The system reinforces positive habits and suggests improvements.
    Alternative Flow:
        - If the user has not logged any workouts or set any goals:
            - The system notifies the user that no data is available to provide feedback.
            - The user is encouraged to start logging workouts or set a fitness goal.

### Use Case 6: Admin Management
    Use Case ID: UC-06
    Use Case Name: Admin Management
    Actors: Admin
    Description: Admins can manage user accounts and monitor system activity.
    Preconditions:
        - The admin must log in with valid admin credentials.
    Main Flow:
    1. The admin selects "Admin Dashboard" from the menu.
    2. The system displays options for managing users and monitoring activity.
    3. The admin can:
        - View and edit user profiles.
        - Reset user passwords.
        - Deactivate problematic accounts.
    4. The system updates the database based on admin actions.
    Postconditions:
        - com.fitness.app.entity.User accounts are updated as needed.
        - The system reflects admin actions in real-time.
    Alternative Flow:
        - If the admin attempts an unauthorized action, the system displays an error message.
## Diagram
![Use Case Diagram](../../../../fitness/FitnessTrackingApp-master/src/use_case_diagram.png)