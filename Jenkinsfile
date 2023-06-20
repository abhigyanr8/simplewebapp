pipeline {
    
	agent any
	
	tools {
        maven "MAVEN3"
    }	
	
    stages{
        
        stage('BUILD'){
            steps {
                sh 'mvn clean install -DskipTests'
            }
        }
        stage("LOGIN")
        {
            steps{
                sh 'echo $DOCKERHUB_PSW | docker login -u $DOCKERHUB_USR --password-stdin'
            }
        }
        stage("BUILD_IMAGE")
        {
            steps{
                sh 'echo docker build -t $DOCKERHUB_USR/simplewebapp:1.0 .'
            }
        }
        stage("PUSH")
        {
            steps{
                sh 'echo docker push $DOCKERHUB_USR/simplewebapp:1.0'
            }
        }

    }
            
}
