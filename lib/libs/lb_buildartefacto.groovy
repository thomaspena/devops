package lib.libs

def clone(Map params){
    def branch_name = "feature"
    def url = "https://github.com/CristianBetancourthAvila/react-test.git"
    git branch: "${branch_name}", url: "${url}"
}

def install(){
    sh 'npm install' 
}
