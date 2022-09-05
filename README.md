# launch-modes

- standard
launches normally

- single top
if activity is on top, doesn't launch a new instance, otherwise launches a new instance of the activity.

- single task
if activity is in the task, doesn't launch a new instance and uses the already present instance while popping all the activities on top of this activity.

- single instance
these activities will only be created in their separate tasks. if such activity is on top and back button is pressed, then this activity will be popped and the previous stack will come in focus. but if from this activity another activity was started, then all the tasks of that activities stack will be popped first.
