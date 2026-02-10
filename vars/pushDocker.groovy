def call(String imagename){
  withCredentials([usernamePassword(credentialsId: "dockerhub", passwordVariable: "dockerhubPass", usernameVariable: "dockerhubUser")]) {
      sh "docker login -u ${dockerhubUser} -p ${dockerhubPass}"
  }
  sh "docker push ${imagename}"
}
