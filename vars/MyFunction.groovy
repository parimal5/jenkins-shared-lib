def greetUser(String name = 'User') {
    echo "Hello, ${name}! Welcome to Jenkins Shared Libraries. This is greet Function from MyFunction.groovy"
}
def goodbye(String name = 'User') {
    echo "Hello, ${name}! See you soon."
}

