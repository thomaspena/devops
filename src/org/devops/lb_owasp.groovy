package org.devops

def analisisOWASP(){
        def imageName = 'owasp/zap2docker-stable'
        sh "docker run --rm -v fullscan_react-test_OWASP:/zap/wrk/:rw --user root --network=${env.NET_NAME} -t ${imageName} zap-baseline.py -t http://${env.IPHOST}:8081/ -r fullscan_react-test_OWASP.html -I"
}
