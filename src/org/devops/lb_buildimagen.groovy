package org.devops

def buildImageDocker(projectGitName){
    sh "docker build -t CristianBetancourthAvila/${projectGitName}:${env.BUILD_ID} ."  
}
