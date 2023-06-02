SpeakingClockServices is a parent module which contains only pom.xml.
Inside pom.xml I have 3 module or 3 microservices
Edge-service ,Service-finder and SpeakingCLock Service.

So here Edge-service is nothing but discovery client which is API gateway of SPeaking CLock Services
and Service Finder is nothing but discovery server we need to register our service in the discovery server so that we can able to find the centralized services so 
we can achieve this by using load balancing technique that is used to establish balance between server and client 


after this 

Speaking CLock Service => This Service contains real logic of time converstion to words
and many more also uses possible test cases and global exception with swagger ui implementaion
