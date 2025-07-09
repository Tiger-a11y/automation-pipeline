pipeline {
    agent any

    parameters {
        choice(name: 'TEST_SUIT', choices: ['smoke', 'regression'], description: 'Choose test suit')
    }

    tools {
        maven 'Maven 3.8.8'
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/Tiger-a11y/automation-pipeline', branch: 'main'
            }
        }

        stage('Run Tests') {
            steps {
                sh "mvn clean test -P${params.TEST_SUIT}"
            }
        }
    }

    post {
        always {
            // Publish Allure results
            allure includeProperties: false, jdk: '', results: [[path: 'target/allure-results']]
        }
    }
}
