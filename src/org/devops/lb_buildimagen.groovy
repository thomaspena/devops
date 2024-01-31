package org.devops

def buildImageDocker(projectGitName){
    sh "docker run -v /var/run/docker.sock:/var/run/docker.sock -v ${env.WORKSPACE}:${env.WORKSPACE} -w ${env.WORKSPACE} ${projectGitName} docker build -t ${projectGitName} ."
}
