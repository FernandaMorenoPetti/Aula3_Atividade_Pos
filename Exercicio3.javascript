function solution(param1, param2) {
    return param1 + param2;
}

function solution(year) {
    // Calculate the century and round up to the nearest integer
    const century = Math.ceil(year / 100);
    return century;
}

function solution(inputString) {
    // Remove non-alphanumeric characters and convert to lowercase
    const cleanString = inputString.replace(/[^a-zA-Z0-9]/g, '').toLowerCase();
    
    // Check if the clean string is the same when reversed
    const reversedString = cleanString.split('').reverse().join('');
    
    return cleanString === reversedString;
}
