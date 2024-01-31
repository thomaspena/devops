package org.devops

def dockerHubCredentials = credentials(${env.TOKEN_ID})

def cargarDockerHub(projectGitName){
    sh "docker login -u ${dockerHubCredentials.username} -p ${dockerHubCredentials.password}"
    sh "docker tag ${projectGitName} ${dockerHubCredentials.username}/${projectGitName}"
    sh "docker push ${dockerHubCredentials.username}/${projectGitName}"
}
