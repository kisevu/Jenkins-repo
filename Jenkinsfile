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
                    steps {
                        bat "mvn clean install"
                    }
                }
    }
}
