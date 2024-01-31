package org.devops

/*def cargarDockerHub(projectGitName){
    def dockerHubCredentials = credentials("${env.TOKEN_ID}")
    sh "docker login -u ${dockerHubCredentials.username} -p ${dockerHubCredentials.password}"
    sh "docker tag ${projectGitName} ${dockerHubCredentials.username}/${projectGitName}"
    sh "docker push ${dockerHubCredentials.username}/${projectGitName}"
}*/

def cargarDockerHub(projectGitName){
    //def dockerHubTokenCredentialId = "${env.TOKEN_ID}"
    withCredentials([usernamePassword(credentialsId: "${env.TOKEN_ID}", passwordVariable: 'DOCKERHUB_PASSWORD', usernameVariable: 'DOCKERHUB_USERNAME')]) {
        sh "docker login -u ${env.DOCKERHUB_USERNAME} -p ${env.DOCKERHUB_PASSWORD}"
        sh "docker tag ${projectGitName} ${env.DOCKERHUB_USERNAME}/${projectGitName}"
        sh "docker push ${env.DOCKERHUB_USERNAME}/${projectGitName}"
    }
}
