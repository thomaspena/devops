package org.devops

def clone(){
    git branch: "${env.GIT_BRANCH}", url: "${env.GIT_URL}"
}

def install(){
    sh 'npm install' 
}
