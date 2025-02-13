def call(String tag){
    echo "building the project"
    sh "docker build -t ${tag} ."
    echo "build complete"
}