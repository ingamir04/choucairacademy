   # Autor: Amir
   @stories
   Feature: Academy Choucair
     As a user, I want to learn how to automate in screamplay at the Choucair Academy with the automation course
     @scenario1
     Scenario: Search for automation course
       Given than Amir wants to learn automation at the academy Choucair
         |strUser|strPassword|
         |1077462807|Choucair2021*|
       When he search for the course on the choucair academy platfrom
         |strCourse|
         |Foundation Express|
       Then he finds the course called
         |strCourse|
         |Foundation Express|