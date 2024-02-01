package org.devops

def despliegueContenedor(projectGitName){
    sh "docker stop ${projectGitName}"
    sh "docker rm ${projectGitName}"
    sh "docker pull cristianbetancourthperiferia/react-test"
    sh "docker run -d --name ${projectGitName} --network=${env.NET_NAME} -p 8081:5174 --user root cristianbetancourthperiferia/${projectGitName}"
}
