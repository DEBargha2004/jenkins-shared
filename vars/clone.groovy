def call(String url,String branch){
    echo "Cloning from github..."
    git url: "${url}", branch: "${brancn}"
    echo "Clone complete..."
}