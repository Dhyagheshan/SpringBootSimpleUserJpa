# SpringBootSimpleUserJpa
SpringBoot gets User values and Stores in H2 Database

In application.properties give your preferred db name. I have given as sbdemo

After running the project go to "http://localhost:<yourportnumber>/" and give inputs.

You can go to "http://localhost:<yourportnumber>/h2-console" to open h2 database console, where you can view your database table.
  
You can also trigger build  in jenkins and upload to nexus repository by using proper configurations.

Triggering build automatically when a push to git happens may not be done using jenkins in localhost.
