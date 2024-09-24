pipeline {
    agent any  //Where it will execute
    environment { //declare env custom variables
      NEW_VERSION = '1.0.0'
       }
    stages {
        stage('Run Spring Boot Application') {
                steps {
                    bat "mvn spring-boot:run"
                    echo "running version ${NEW_VERSION} " //using the custom env
                }
        }
          stage('Maven Clean Install') {
                 when {
                   expression {
                    env.BRANCH_NAME == 'dev' || env.BRANCH_NAME == 'main'
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
