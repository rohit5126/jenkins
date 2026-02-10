def call(String Giturl,Sting Branch){
  git url: "${Giturl}", branch: "${Branch}"
  echo "code clone successfully"
  sh "whoami"
}
  
