def call(String Giturl,String Branch){
  git url: "${Giturl}", branch: "${Branch}"
  echo "code clone successfully"
  sh "whoami"
}
  
