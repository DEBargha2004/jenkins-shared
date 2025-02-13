def call(){
    echo "deploying code"
    sh "docker compose up -d"
    echo "deploy complete"
}