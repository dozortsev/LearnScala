var range = function (start, end) {
    if (end < start)
        return [];

    return Array.apply(start, new Array(end)).map(function (_, el) {
        return ++el;
    });
};

console.log(range(1, 10).filter(function (el) {
        return el % 2 === 0;
    })
);