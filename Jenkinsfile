pipeline {
    agent any

    environment {
        EMAIL_RECIPIENT = 'waghavinash384@gmail.com'
        MAVEN_TOOL = 'Maven 3.8.8'
    }

    parameters {
        choice(name: 'TEST_SUIT', choices: ['smoke', 'regression'], description: 'Choose test suit')
    }

    tools {
        maven "${env.MAVEN_TOOL}"
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/Tiger-a11y/automation-pipeline', branch: 'main'
            }
        }

        stage('Set Env') {
            steps {
                script {
                    env.REPORT_LINK = "${env.BUILD_URL}allure"
                }
            }
        }

        stage('Run Tests') {
            steps {
                sh "mvn clean test -P${params.TEST_SUIT}"
            }
        }
    }
}
