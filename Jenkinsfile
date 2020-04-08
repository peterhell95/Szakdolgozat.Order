pipeline {
    agent any
    tools { 
        maven 'Maven' 
        jdk 'Java' 
    }
    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                ''' 
            }
        }

         stage ('Build') {
            steps {
                sh 'mvn clean install' 
            }
        }
        
         stage ('Docker') {
            steps {
                sh 'docker build -t peterhell95/order:jenkins .' 
            }
        }
    }
}