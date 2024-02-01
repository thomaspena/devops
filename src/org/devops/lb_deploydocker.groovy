package org.devops

def despliegueContenedor(projectGitName){
    sh "docker pull cristianbetancourthperiferia/react-test"
    sh "docker run -d --network=${env.NET_NAME} -p ${env.IPHOST}:5174 --name ${projectGitName} cristianbetancourthperiferia/${projectGitName}"
}
