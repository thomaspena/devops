package org.devops

def despliegueContenedor(projectGitName){
    sh "docker stop festive_spence"
    sh "docker rm ${projectGitName}"
    sh "docker pull thomaspena/festive_spence"
    sh "docker run -d --name ${projectGitName} --network=${env.NET_NAME} -p 5174:5174 --user root thomaspena/${projectGitName}"
}
