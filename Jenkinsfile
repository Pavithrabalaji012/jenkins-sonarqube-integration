pipeline {
    agent any

    environment {
        SONAR_TOKEN = credentials('sonarkey')
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main', credentialsId: 'github-token', url: 'https://github.com/Pavithrabalaji012/jenkins-sonarqube-integration.git'
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
                mvn org.sonarsource.scanner.maven:sonar-maven-plugin:5.1.0.4751:sonar ^
                -Dsonar.projectKey=calculator-app ^
                -Dsonar.projectName="Calculator Application" ^
                -Dsonar.sources=src/main/java ^
                -Dsonar.java.binaries=target/classes
            '''
        }
    }
}

    }
}
