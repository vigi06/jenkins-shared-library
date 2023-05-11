def call(String project, String imageTag, String hubUser){
   withCredentials([usernamePassword(
    credentialsId: 'docker1',
    passwordVariable: 'PASS',
    usernameVariable: 'USER')]) 
    {
        sh "docker login -u '$USER -p '$PASS'"   
}
    sh "docker image push ${hubUser}/${project}:${imageTag}"
    sh "docker image push ${hubUser}/${project}:latest"
}