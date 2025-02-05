 Number Classification API

Description
A simple Spring Boot API that classifies numbers based on their mathematical properties and provides a fun fact.

Tech Stack
Java ☕
Spring Boot 🌱
RestTemplate for external API calls
Deployed on Render.app 

## Live API Endpoint
 **Base URL:**  
[https:https://hng12-stage1-8wt0.onrender.com/api/classify-number?number=371

📌 Request:
```bash
curl https://hng12-number-classifier-production.up.railway.app/api/classify-number?number=371

 Response:
  ```json
{
    "number": 10,
    "is_prime": false,
    "is_perfect": false,
    "properties": [
        "even"
    ],
    "digit_sum": 1,
    "fun_fact": "10 is the aliquot sum of only one number the discrete semiprime 14."
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
https://github.com/Scepter00/HNG12-Number-Classifier.git
Navigate to the project:
sh
cd HNG12-Number-Classifier
Run the application:
sh
./mvnw spring-boot:run
Access it at:
bash
http://localhost:8090/api/classify-number?number=371
