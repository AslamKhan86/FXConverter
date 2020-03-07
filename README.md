# Lydia Assessment

UserController - a REST service with GET /userId - to fetch the user details from HashMap 

Sample : 
URL - http://localhost:8080/assessment/user/profile/1 
Output - {"userId":1,"pricingTier":"A","emailAddress":"abc@gmail.com"}

FXRatesController - Based on the userId will fetch the pricingTier from User service and calculate the spread on the exchange from "https://api.exchangeratesapi.io/latest?base=USD"

Sample : 
URL - http://localhost:8080/assessment/rates/latest/1
Output - {"rates":{"HKD":{"bid":7.8287362538,"market":7.8287362538,"ask":7.8287362538},"SGD":{"bid":1.359653867,"market":1.359653867,"ask":1.359653867},"MYR":{"bid":4.1594555616,"market":4.1594555616,"ask":4.1594555616}},"base":"USD"}





## Setup

Run mvn clean install

Copy ROOT.war from target folder into your tomcat instance - folder [Tomcat/webapps]

Restart your tomcat
