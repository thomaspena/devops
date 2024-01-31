package org.devops

def buildImageDocker(projectGitName){
    sh "docker run -v /var/run/docker.sock:/var/run/docker.sock -v ${pwd()}:${pwd()} -w ${pwd()} ${projectGitName} docker build -t ${projectGitName} ."
}
