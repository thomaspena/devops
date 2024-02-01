package org.devops

def despliegueContenedor(projectGitName){
    sh "docker network create ${env.NET_NAME}"
    sh "docker pull cristianbetancourthperiferia/react-test"
    sh "docker run -d --network=${env.NET_NAME} -p 5174:5174 --name ${projectGitName} cristianbetancourthperiferia/${projectGitName}"
}
