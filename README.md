


# infraera
    
1- Clone project using NetBeans Git Plug-in:
   
    Copy&Paste: https://github.com/ethereumtr/infraera.git
    Use your GitHub credentials to pull the project files.

 2- On Docker, right-click and go to Settings.
    Check "Expose daemon to tcp://localhost:2375 without TLS”
 
 
 3- Use CMD to generate Docker image of infraera project:
     
     cd C:\Users\deneme\Documents\NetBeansProjects\infraera
     mvnw package -Pprod dockerfile:build
     
     Using this command to create image, now you have an image of your application named: "infraera:latest"
     You will see "infraera:latest" and "openjdk" images on Docket Kitematic when you resart the Kitematic.
 
 4-  To pull other Docker dependencies (MySQL, elasticsearch etc.) and run the "infraera:latest" image using those dependencies:
  
     docker-compose -f src/main/docker/app.yml up
     
     After executing this command, you will see those images too:
     zookeeper, mysql, jhipster-registry, kafka, elasticsearch
 5- Once you have started your application using Docker, you have to specify localhost port like :"8080" and "8081" by clicking the application image on Kitematic. (from Settings-> Hostname/Ports)


  SOME ERRORS NOTES:
  An error might be encountered about liquibase which can be solved using this comment in the same folder on CMD: 
  
    mvn liquibase:clearCheckSums
  
  Of course you need to define Maven_Path/bin in your PATH environmental variables if you haven't already done.
