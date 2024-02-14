package org.devops

def analisisOWASP(){
    sh "docker run --rm -v fullscan_react-test_OWASP:/zap/wrk/:rw --user root --network=${env.NET_NAME} -t owasp/zap2docker-stable zap-full-scan.py -t ${env.IPHOST} -r fullscan_react-test_OWASP.html -I"
}
