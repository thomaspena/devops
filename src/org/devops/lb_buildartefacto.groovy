package org.devops

def clone(Map params){
    git branch: "${env.GIT_BRANCH_1}", url: "${env.GIT_URL_1}"
}

def install(){
    sh 'npm install' 
}
