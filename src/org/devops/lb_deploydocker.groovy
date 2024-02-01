package org.devops

def despliegueContenedor(projectGitName){
    sh "docker pull cristianbetancourthperiferia/react-test"
    sh "docker run -p 5174:5174 --name ${projectGitName} --network=${env.NET_NAME} -d cristianbetancourthperiferia/${projectGitName}"
}
