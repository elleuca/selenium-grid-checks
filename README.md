# Introduction

This is a simple and quick tool for people working with Selenium and Selenium Grid to ensure
the testing grid is up and running before launching the actual tests.

It is designed to be a step inside a continuos integration job: if this step fail it is not
useful to run the full test, because the grid in not working or a driver is missing.

Ideally this additional step should be as fast as possible, but we can say the grid is working
only if we are able to launch browsers and navigate to a page. And sometimes this could be slow.

# Usage

$ mvn test

# Parameters
* TODO
