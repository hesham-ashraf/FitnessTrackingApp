# OCL Constraints for Fitness Tracking App

## 1. Valid Input Values

### User
- **Constraint 1:** Age must be greater than 0.
  ```
  context User
  inv: self.age > 0
  ```

- **Constraint 2:** Email must follow a valid email format.
  ```
  context User
  inv: self.email.matches('[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}')
  ```

### Workout
- **Constraint 1:** Duration must be greater than 0.
  ```
  context Workout
  inv: self.duration > 0
  ```

- **Constraint 2:** Intensity must be one of `Low`, `Medium`, or `High`.
  ```
  context Workout
  inv: self.intensity = "Low" or self.intensity = "Medium" or self.intensity = "High"
  ```

### Goal
- **Constraint 1:** Target value must be greater than 0.
  ```
  context Goal
  inv: self.targetValue > 0
  ```

- **Constraint 2:** Deadline must be a future date.
  ```
  context Goal
  inv: self.deadline > currentDate()
  ```

---

## 2. Uniqueness Constraints

### User
- **Constraint 1:** Email addresses must be unique across all users.
  ```
  context User
  inv: User.allInstances()->isUnique(u | u.email)
  ```

---

## 3. Data Integrity Constraints

### Workout
- **Constraint 1:** A workout must belong to a valid user.
  ```
  context Workout
  inv: not self.user.oclIsUndefined()
  ```

### Goal
- **Constraint 1:** A goal must be linked to a valid user.
  ```
  context Goal
  inv: not self.user.oclIsUndefined()
  ```

---

## 4. Business Rules

### Progress
- **Constraint 1:** Progress data points must not be negative.
  ```
  context Progress
  inv: self.dataPoints->forAll(dp | dp >= 0)
  ```

### Notification
- **Constraint 1:** Notification messages must not be empty.
  ```
  context Notification
  inv: not self.message.isEmpty()
  ```

### Admin
- **Constraint 1:** Admin must not deactivate their own account.
  ```
  context Admin
  inv: self.managedUsers->excludes(self)
  ```

---

## 5. Data Limits

### Workout
- **Constraint 1:** A user cannot log more than 3 workouts per day.
  ```
  context Workout
  inv: Workout.allInstances()->select(w | w.user = self.user and w.date = currentDate())->size() <= 3
  
