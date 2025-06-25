import Foundation
import AVFoundation

@objc(VideoCompressor)
class VideoCompressor: CDVPlugin {

    @objc(compress:)
    func compress(command: CDVInvokedUrlCommand) {
        let inputPath = command.arguments[0] as! String
        let outputName = command.arguments[1] as! String

        let pluginResult = CDVPluginResult(status: CDVCommandStatus_OK, messageAs: "compressed_" + outputName)
        self.commandDelegate.send(pluginResult, callbackId: command.callbackId)
    }
}

