package org.devops

def clone(){
    def branch_name = "master"
    def url = "https://github.com/CristianBetancourthAvila/react-test.git"
    git branch: "${branch_name}", url: "${url}"
}

def install(){
    sh 'npm install' 
}
