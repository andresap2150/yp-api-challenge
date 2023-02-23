# Home Challenge YellowPeper

This is the development of the tasks that were proposed to show my skill as a test autimation engineer, it uses Java 12, Maven for dependencies management, RestAssured for the rest manipulation, and Allure for reporting.

Some endpoints are missing to test, due to the short deadlines of the assesment

Other improvements were lefts as TODOs in the code

## Getting Started

First you have to follow the instructions to run the SUT that is a pet store, created by swagger Clone [this](https://github.com/swagger-api/swagger-petstore) repo, follow the instructions on the readme

## Usage

You need maven already installed in your environment run the following command:

`mvn test`

When the test are finished it shows the status and also generate a new folder in 

`target/surefire-reports`

See the [instructions](https://docs.qameta.io/allure/#_test_execution) on how to generate the server of the report