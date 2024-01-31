package org.devops

def cargarDockerHub(projectGitName){
    dockerHubCredentials = credentials(${env.TOKEN_ID})
    sh "docker login -u ${dockerHubCredentials.username} -p ${dockerHubCredentials.password}"
    sh "docker tag ${projectGitName} ${dockerHubCredentials.username}/${projectGitName}
    sh "docker push ${dockerHubCredentials.username}/${projectGitName}"
}
