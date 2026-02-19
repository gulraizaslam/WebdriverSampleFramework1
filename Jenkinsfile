pipeline {
    agent any

    tools {
        maven 'Maven 3.8.6' 
        jdk 'jdk11' 
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install -DskipTests'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
            archiveArtifacts artifacts: 'reports/**/*.html', allowEmptyArchive: true
        }
    }
}
