var scope = 'global scope';

function checkScope() {
    var scope = 'local scope';
    function f() { return scope; }
    return f();
}

console.log(checkScope());