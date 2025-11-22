
def buildMaven(PROJECT_NAME) {
    sh "mvn clean compile"
}

def testMaven() {
    sh "mvn test"
}

def packageMaven() {
    sh "mvn package -DskipTests"
}

def showJavaVersion() {
    sh "java -version"
}

def showMavenVersion() {
    sh "mvn --version"
}
