def call(Map param){

    pipeline{

        agent any

        tools{
            nodejs 'NodeJS'
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
                        def cloneapp = new lib.libs.lb_buildartefacto()
                        cloneapp.clone("https://github.com/CristianBetancourthAvila/react-test.git")
                    }
                }
            }

            stage('Construccion App') {
                steps {
                    script {
                        def buildapp = new lib.libs.lb_buildartefacto()
                        buildapp.install()
                    }
                }
            }
        }
    }
}
