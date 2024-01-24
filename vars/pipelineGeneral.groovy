def call(Map param){

    pipeline{

        agent any

        tools{
            nodejs 'NodeJS18'
        }

        // triggers {
        //     pollSCM('* * * * *') // Programa la verificación del repositorio cada minuto
        // }

        // environment{
        //    PROJECT = "${env.GIT_URL}".replaceAll('.+/(.+)\\.git', '$1')toLowerCase()
        // }

        stages{
            stage('Clone App') {
                steps {
                    script {
                        def cloneapp = new org.devops.lb_buildartefacto()
                        cloneapp.clone()
                    }
                }
            }

            stage('Construccion App') {
                steps {
                    script {
                        def buildapp = new org.devops.lb_buildartefacto()
                        buildapp.install()
                    }
                }
            }
        }
    }
}
