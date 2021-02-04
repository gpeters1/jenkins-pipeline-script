pipeline {
    agent any
    stages {
        stage("Hello") {
            steps {
                echo "Hello from pipeline another-pipeline"
            }
        }
        stage("Goodbye") {
            steps {
                echo "Goodbye from pipeline another-pipeline"
            }
        }
    }
}
