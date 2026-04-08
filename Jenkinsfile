pipeline {
    agent any

    stages {

        stage('Clone') {
            steps {
                echo 'Cloning repository...'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Compiling Java files...'
                sh 'javac Calculator.java CalculatorTest.java'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                sh 'java CalculatorTest'
            }
        }

        stage('Run App') {
            steps {
                echo 'Running main application...'
                sh 'java Calculator'
            }
        }

        stage('Cleanup') {
            steps {
                echo 'Cleaning up class files...'
                sh 'rm -f *.class'
            }
        }
    }
}
