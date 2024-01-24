package org.devops

def clone(){
    def branch_name = "master"
    //def url = "https://github.com/CristianBetancourthAvila/react-test.git"
    
    git branch: "${branch_name}", url: "${env.GIT_URL}"
}

def install(){
    sh 'npm install' 
}
