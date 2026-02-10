def call(String credID){
  withCredentials([usernamePassword(credentialsId:"${credID}",passwordVariable:"dockerhubPass",usernameVariable:"dockerhubUser")]) {
      sh "docker login -u ${env.dockerhubUser} -p ${env.dockerhubPass}"
  
  }
  sh "docker push rohit5126/django_app:latest"
}
