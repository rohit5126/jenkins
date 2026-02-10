def call(){
  sh "sudo apt-get install -y docker-compose-v2 "
  sh "sudo usermod -aG docker $USER"
}
