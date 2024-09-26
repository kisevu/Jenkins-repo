pipeline {
    agent any  //Where it will execute
    environment { //declare env custom variables
      NEW_VERSION = '1.0.0'
      SERVER_CREDENTIALS = credentials('server-credentials')
       }
    parameters {
      choice( name: 'VERSION', choices: ['1.0.0','1.2.0','1.3.0'],description: 'my first version of deployment')
      booleanParam(name: 'executeTests', defaultValue: true, description: 'deployed already')
      //parameters defined which can be used in any of our stages
    }
    tools {
      maven 'Maven'
    }
    stages {
        stage('Run Spring Boot Application') {
                steps {
//                     bat "mvn install"
//                     echo "Done with installations"
//                     bat "mvn spring-boot:run"
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
          stage("test") {
             when {
                expression {
                    params.executeTests == true
                   }
                }
             steps {
                  echo "testing my spring boot application..."
              }
          }
//           stage('deploy') {
//            steps {
//              echo 'deploying my application...'
//              withCredentials([
//               usernamePassword(credentials: 'server-credentials', usernameVariable: USER,
//               passwordVariable: PWD)
//               ]) {
//                echo "some script maybe ${USER} ${PWD}"
//                 }
//              }
//           }
    }
//     post {
//      always {
//      echo 'From post and will execute regardless'
//      }
//      success {
//       echo 'Build went successfully!!!'
//      }
//      failure {
//       echo 'Build did fail!!!'
//      }
//     }
}
