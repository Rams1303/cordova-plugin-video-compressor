var exec = require('cordova/exec');

exports.compress = function (inputPath, outputFileName, success, error) {
    exec(success, error, 'VideoCompressor', 'compress', [inputPath, outputFileName]);
};

