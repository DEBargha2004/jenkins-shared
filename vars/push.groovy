def call(String credentialsId, String tag){
    echo "Pushing to Docker hub"
    withCredentials([
        usernamePassword(
            credentialsId:"${credentialsId}",
            usernameVariable: 'USERNAME',
            passwordVariable: 'PASSWORD'
        )
    ]){
    sh "docker login -u ${env.USERNAME} -p ${env.PASSWORD}"
    sh "docker image tag ${tag} ${env.USERNAME}/${tag}"
    sh "docker push ${env.USERNAME}/${tag}"
    }
}