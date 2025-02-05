 Number Classification API

Description
A simple Spring Boot API that classifies numbers based on their mathematical properties and provides a fun fact.

Tech Stack
Java 
Spring Boot 
RestTemplate for external API calls
Deployed on Render.app 

## Live API Endpoint
 **Base URL:**  
[https:https://hng12-stage1-8wt0.onrender.com/api/classify-number?number=371

 Request:
```bash
curl https://hng12-stage1-8wt0.onrender.com/api/classify-number?number=371

 Response:
  ```json
{
  "number": 371,
  "is_prime": false,
  "is_perfect": false,
  "properties": [
    "armstrong",
    "odd"
  ],
  "digit_sum": 11,
  "fun_fact": "371 is a narcissistic number."
}

🚀 Features
✅ Checks if a number is Prime
✅ Checks if a number is Perfect
✅ Identifies Armstrong numbers
✅ Classifies numbers as Odd/Even
✅ Calculates Sum of Digits
✅ Fetches a Fun Fact from the Numbers API

🛠️ Running Locally
Clone the repository:
sh
 https://github.com/Adio03/hng12_stage1.git
Navigate to the project:
sh
cd hng12_stage1
Run the application:
sh
./mvnw spring-boot:run
Access it at:
bash
http://localhost:8090/api/classify-number?number=371
