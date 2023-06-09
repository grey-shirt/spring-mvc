def imageName = 'grey-shirt/spring-mvc'

node('workers'){
    stage('Checkout'){
        checkout scm
    }
    stage('Unit Tests'){
        sh './gradlew testClasses'
    }
    stage('Build'){
        sh './gradlew build'
    }
    stage('Create docker image') {
        sh 'docker build -t simple-spring-mvc .'
    }
}