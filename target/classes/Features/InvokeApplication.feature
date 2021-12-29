Feature: Invoke application

Scenario Outline: Invoke application scenario

Given Launch application "<URL>"
Examples:
|URL|
|https://github.com/geerlingguy/ansible-role-jenkins/issues/51|