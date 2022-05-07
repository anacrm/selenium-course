# selenium-course

## Description
 A project to practice and showcase how to write automated tests in Java using Selenium Webdriver and cucumber combined.

 This project was developed during the "Full Automation Testing Bootcamp" course on Udemy and it contains many test scenarios for the https://www.webdriveruniversity.com/ website.  

## Usage

 Requirements:
* Java (version 16 or newer)
* Maven (version 3.3 or newer)

Clone the repository and navigate to the created folder

```
git clone https://github.com/anacrm/selenium-course.git
cd selenium-course
```
Run the tests
```
mvn test
```
## Test Report
After running the tests the reports will be available in both HTML and JSON formats. And the reports files can be found in the `target` folder:
 
* cucumber.html
* cucumber.json

The html report can be opened on the browser and here is an example of how it looks: 

![HTML report](docs/html-report.png)

## CI/CD integrations

It is also easy to integrate your own CI/CD tools with this project. I used Jenkins and here how it looks:

![Jenkins report](docs/jenkins-report.png)

## Contact

You can contact me here on GitHub, via [LinkedIn](https://www.linkedin.com/in/ana-reis-qa/) or email at reismedeiros.ana@gmail.com