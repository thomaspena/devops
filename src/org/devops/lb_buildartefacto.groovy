package org.devops

def clone(Map params){
    git branch: "${env.GIT_BRANCHS}", url: "${env.GIT_URLS}"
}

def install(){
    sh 'npm install' 
}
