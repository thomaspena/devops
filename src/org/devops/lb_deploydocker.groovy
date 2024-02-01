package org.devops

def despliegueContenedor(projectGitName){
    sh "docker pull cristianbetancourthperiferia/react-test"
    sh "docker run -d -p 5174:5174 --network=${env.NET_NAME} --name ${projectGitName}  -d cristianbetancourthperiferia/${projectGitName}"
}
