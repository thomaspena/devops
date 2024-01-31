package org.devops

def despliegueContenedor(projectGitName){
    sh "docker pull cristianbetancourthperiferia/react-test"
    //sh "docker run --name ${PROJECT} -p 80${env.BUILD_ID}:3000 -d laurabecerra/${PROJECT}:${env.BUILD_ID}"
    sh "docker run -p 5174:5174 --name ${projectGitName} -d cristianbetancourthperiferia/${projectGitName}"
}
