pipeline {
	agent any
	tools {
        maven "MAVEN3"
    }
    stages{
        stage('BUILD')
        {
            steps{
                bat 'mvn clean install'
            }
            
        }
        stage('DOCKERLOGIN')
        {
            steps{
              
                bat 'docker login -u abhigyanr8 -p dckr_pat_H5WhHQxM7TRxIowpQJ0K8pyuEDI'
             }
            
        }
        stage('DOCKERBUILD')
        {
            steps{
                bat 'docker build -t abhigyanr8/simplewebapp:2.0 .'
            }
        }
        stage('DOCKERPUSH')
        {
            steps{
                bat 'docker push abhigyanr8/simplewebapp:2.0'
            }
        }
        stage('DOCKERRUN')
        {
            steps{
                bat 'docker run -p9090:9090 -d abhigyanr8/simplewebapp:2.0'
            }
        }
        
    }
            
}