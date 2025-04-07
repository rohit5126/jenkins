pipeline{
    agent any
    tools {
        maven = maven
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
                sh 'mvn install'
                echo 'build successful'
            }
        }
            
     
     stage("deploy to test") {
            steps {
                // deploy the project
                
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