pipeline {
    agent any  

    stages {
        stage('Check Java Version') {
            steps {
                bat "java -version"  
                bat "javac -version" 
            }
        }
        stage('Echo Message') {
            steps {
                echo "Kevin Ameda is the guy"
            }
        }
    }
}
