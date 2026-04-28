package atd.g;

import com.adyen.threeds2.parameters.ConfigParameters;
import com.adyen.threeds2.util.AdyenConfigParameters;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getSDKAppID {
    private static int getSDKAppID = 1;
    private static int getSDKTransactionID;

    public static Collection<String> getSDKTransactionID(ConfigParameters configParameters) {
        int i11 = getSDKTransactionID;
        int i12 = (i11 ^ 23) + ((i11 & 23) << 1);
        getSDKAppID = i12 % 128;
        int i13 = i12 % 2;
        Collection<String> paramValues = AdyenConfigParameters.getParamValues(configParameters, AdyenConfigParameters.DEVICE_PARAMETER_BLOCK_LIST);
        if (i13 == 0) {
            int i14 = 81 / 0;
        }
        return paramValues;
    }
}
