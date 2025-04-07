pipeline{
    agent any
    tools {
        maven 'maven'
    }
    
    stages{
        stage("test") {
            steps {
                // mvn test
                sh 'mvn test'
                echo 'test successful'
            }
            
        }
        stage("build") {
            steps {
                // build the project
                sh 'mvn package'
                echo 'build successful'
            }
        }
            
     
     stage("deploy to test") {
            steps {
                // deploy the project
                deploy adapters: [tomcat9(credentialsId: 'tomcat10details', path: '', url: 'http://192.168.1.33:8080')], contextPath: '/app', war: '**/*.war'
                echo 'project deployed'
            }   
        }
    }
    post{
        always{
            echo "========always========"
        }
        success{
            echo "========pipeline executed successfully ========"
        }
        failure{
            echo "========pipeline execution failed========"
        }
    }
}
