node {
   def mvnHome
   stage('Preparacao') {
      git 'https://github.com/wnoizumi/tads-exemplo-ci'
      mvnHome = tool 'M3'
   }
   stage('Construcao') {
        bat(/"${mvnHome}\bin\mvn" -Dmaven.test.failure.ignore clean package/)
   }
   stage('Resultados') {
      archive 'target/*.jar'
   }
}