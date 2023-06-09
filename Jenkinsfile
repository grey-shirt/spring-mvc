def imageName = 'grey-shirt/spring-mvc'

node('workers'){
    stage('Checkout'){
        checkout scm
    }
    stage('Build'){
        sh './gradlew build'
    }
    stage('Create docker image')
        sh 'docker build -t simple-spring-mvc .'
}