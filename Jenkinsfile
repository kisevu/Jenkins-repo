pipeline {
    agent any  

    stages {
//         stage('Check Java Version') {
//             steps {
//                 bat "java -version"
//                 bat "javac -version"
//             }
//         }
//         stage('Echo Message') {
//             steps {
//                 echo "Kevin Ameda is the guy"
//             }
//         }
//         stage('Run Spring Boot Application') {
//             steps {
//                 bat "mvn spring-boot:run"
//             }
//         }
          stage('Maven Clean Install') {
                 when {
                   expression {
                    BRANCH_NAME == 'dev' || BRANCH_NAME == 'main'
                   }
                 }
                    steps {
                        bat "mvn clean install"
                    }
                }
    }
    post {
     always {
     echo 'From post and will execute regardless'
     }
     success {
      echo 'Build went successfully!!!'
     }
     failure {
      echo 'Build did fail!!!'
     }
    }
}
