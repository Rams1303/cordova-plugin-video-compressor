package com.example.videocompressor;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

public class VideoCompressor extends CordovaPlugin {
    @Override
    public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
        if (action.equals("compress")) {
            String inputPath = args.getString(0);
            String outputName = args.getString(1);

            // Simulate success
            callbackContext.success("compressed_" + outputName);
            return true;
        }
        return false;
    }
}

