function greet(name) {
    if (!name) {
        name = 'World';
    }
    console.log(`Hello, ${name}!`);
}
greet('John');