pipeline {

    agent any

    stages {

        stage('Build') {
            steps {
                echo 'Building application...'
                bat 'mvn clean package -DskipTests'
            }
        }
        stage('Test') {
            steps {
                echo 'Running tests...'
                bat 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying application...'
                echo 'Application deployed successfully!'
            }
        }
    }

    post {

        success {
            echo 'CI/CD Pipeline completed successfully!'
        }

        failure {
            echo 'CI/CD Pipeline failed!'
        }
    }
}