package org.devops

/*def cargarDockerHub(projectGitName){
    def dockerHubCredentials = credentials("${env.TOKEN_ID}")
    sh "docker login -u ${dockerHubCredentials.username} -p ${dockerHubCredentials.password}"
    sh "docker tag ${projectGitName} ${dockerHubCredentials.username}/${projectGitName}"
    sh "docker push ${dockerHubCredentials.username}/${projectGitName}"
}*/

def cargarDockerHub(projectGitName){
    sh "docker login -u "${env.USR_DH}" -p "${env.PASS_DH}""
    sh "docker tag ${projectGitName} "${env.USR_DH}"/${projectGitName}"
    sh "docker push "${env.USR_DH}"/${projectGitName}"
}
