pipeline {
	agent any
	tools {
        maven "MAVEN3"
    }
    stages{
        stage('BUILD'){
            steps {
                'mvn clean install'
            }
        }
    //     stage("LOGIN")
    //     {
    //         steps{
    //             'echo $DOCKERHUB_PSW | docker login -u $DOCKERHUB_USR --password-stdin'
    //         }
    //     }
    //     stage("BUILD_IMAGE")
    //     {
    //         steps{
    //             'echo docker build -t $DOCKERHUB_USR/simplewebapp:1.0 .'
    //         }
    //     }
    //     stage("PUSH")
    //     {
    //         steps{
    //             'echo docker push $DOCKERHUB_USR/simplewebapp:1.0'
    //         }
    //     }

     }
            
}
