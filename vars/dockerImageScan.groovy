def call(String project, String imageTag, String hubUser){
    sh """
     trivy image ${hubUser}/${project} ${hubUser}/${project}:latest >scan.txt
     cat scan.txt
    """
}