package org.devops

def AnalisisOwasp(projectGitName){
        def imageName = 'owasp/zap2docker-stable'
        def targetURL = "http://${env.IPHOST}:5174"
        sh "docker run --rm -v fullscan_react-test_OWASP:/zap/wrk/:rw --user root --network=${env.NET_NAME} -t ${imageName} zap-full-scan.py -t ${targetURL} -r fullscan_react-test_OWASP.html -I"
}
