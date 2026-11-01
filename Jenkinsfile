pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Code checkout completed'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('sonarserver') {
                    bat 'mvn sonar:sonar -Dsonar.projectKey=calculator-app'
                }
            }
        }
    }
}
