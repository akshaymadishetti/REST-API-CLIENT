# REST-API-CLIENT (Task-2)




*COMPANY: COOTECH IT SOLUTIONS

NAME: AKSHAY MADISHETTI


"INTERN ID: CT04DR167


"DOMAIN: JAVA PROGRAMMING

"DURATION: 4 WEEEKS


MENTOR: NEELA SANTOSH




DESCRIPTION (TASK-2)

This project combines two core Java utilities:

WeatherAPIClient — A simple REST API client that fetches real-time weather data from the OpenWeatherMap API.

FileOperations — A utility to create, read, and modify (append) text files using standard Java I/O.

It demonstrates Java fundamentals, API integration, and file handling — ideal for learning and placement-level projects.

🚀 Features
🌤️ WeatherAPIClient

Fetches live weather data using OpenWeatherMap API.

Displays temperature, humidity, wind speed, and weather description.

Uses HttpURLConnection and org.json library for parsing.

Demonstrates API URL construction, response handling, and JSON parsing.

🗂️ FileOperations

Create and write new text files.

Read contents of a file line by line.

Append new text to existing files (modify operation).

Menu-driven console interface for ease of use.

🧰 Technologies Used

Language: Java

Libraries:

org.json (for JSON parsing)

java.io.*, java.net.*, java.util.*

Build Tool: Maven

Framework: Spring Boot (included in pom.xml for future REST integrations)

⚙️ How to Run
1️⃣ Clone the Repository
git clone https://github.com/<your-username>/WeatherAndFileUtility.git
cd WeatherAndFileUtility

2️⃣ Compile the Java Files
javac -cp .;json-20231013.jar WeatherAPIClient.java FileOperations.java

3️⃣ Run the Programs
➤ Run the Weather API Client:
java -cp .;json-20231013.jar WeatherAPIClient

➤ Run the File Operations Utility:
java FileOperations

🔑 API Key Setup (for WeatherAPIClient)

Go to https://openweathermap.org/api

Create a free account and get your API key.

Replace this line in WeatherAPIClient.java:

String apiKey = "YOUR_API_KEY_HERE";




OUTPUT
<img width="750" height="462" alt="Image" src="https://github.com/user-attachments/assets/ce478cd6-7724-4126-8a62-e1d85c429eff" />
