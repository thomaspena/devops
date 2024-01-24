package org.devops

def analisys(){
    def scannerHome = tool 'sonar-scanner'
    withSonarQubeEnv('sonar-scanner') {
        sh "${scannerHome}/bin/sonar-scanner -X \
            -Dsonar.projectKey=react-test \
            -Dsonar.projectName=react-test \
            -Dsonar.sources=src \
            -Dsonar.tests=src/__test__ \
            -Dsonar.exclusions='**/*.test.js' \
            -Dsonar.testExecutionReportPaths=./test-report.xml \
            -Dsonar.javascript.lcov.reportPaths=./coverage/lcov.info"
    }  
}
