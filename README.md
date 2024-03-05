# Masterthesis_Copilot
The tasks of this project should be completed **with** GitHub Copilot.
The project is about a TODO Application for work tasks.


## Preparations
Before you start with the tasks

- Clone this repository `git clone https://github.com/JuliaBurri/Masterthesis.git`.
- Create a new branch `git checkout -b [your_name]`.
- Go to the frontend folder `cd .\frontend\`
- Install dependencies `npm install`

## Tasks / User Stories
These are your tasks that should be completed without using Copilot. The tasks can include frontend and/or backend code and are separated by that in the user story description. There are also TODO-comments inside the code that describe shortly what needs to be done.
**For each task, please set a timer to measure how long it took you to complete the task. Note that time down. Also note down which Copilot Suggestion you accepted (e.g. First, Sencond, etc.)**
### 1. User Story: As a user, I want to add a new task to my to-do list.
#### Backend
- Create a request method inside TaskController.java that adds a new task.
- The task should automatically be set to "not done".
- The due date of a newly created Task should always be set to the current date.
- Document your method in form of a Javadoc comment (an example for that can be found in the code).
- Inside the TaskControllerTest.java, write a test for your method.
#### Frontend
- Create a component to input all the required data for a task (Title, Description, Duration).
- The grid should be responsive. If the screen gets too small, the two green components should be displayed among each other.
- Call the API to actually add a new task.
- Update the to-do list.

### 2. User Story: As a user, I want to mark a task as done.
#### Backend

- Create a method inside the TaskController.java to update an existing task / mark a task as done.
- Document your method in form of a Javadoc comment.
- Inside the TaskControllerTest.java, write a test for your method.

#### Frontend
- Call the API as soon as a task is marked as done by the checkbox.
- Update the to-do list, so that done tasks are displayed at the end of the list.

### 3. User Story: As a user, I want my workday to be scheduled by priority.
#### Backend
- Write a request method that returns a list of tasks.
- Write a function to schedule the tasks inside an 8 hours work day by priority.
- If a task does not fit inside the time limit, it should be scheduled for the next day.
- If a task only partly fits in to the time limit, the task should be cloned and scheduled for the next day with a duration of the remaining time.
> **Hint:** The mathematical problem behind this is called "Knapsack Problem" or "Rucksack Problem".
- Test all your methods.
- Document all methods.

#### Frontend
- Call the API when the "Schedule Workday"-Button is clicked.
- Update the to-do list.

# Thank you for your time!

### Run instructions
Run backend: Firstly, make sure you are in the backend folder, then `./gradlew bootRun`

Run frontend: Firstly, make sure you are in the frontend folder, then `npm run dev`
