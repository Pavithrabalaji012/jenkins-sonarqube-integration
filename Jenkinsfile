pipeline {
    agent any

    environment {
        SONAR_PROJECT_KEY = 'calculator-app'
    }

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
                    bat '''
                        mvn sonar:sonar ^
                        -Dsonar.projectKey=calculator-app ^
                        -Dsonar.projectName=Calculator Application ^
                        -Dsonar.sources=src/main/java ^
                        -Dsonar.java.binaries=target/classes
                    '''
                }
            }
        }
    }
}
