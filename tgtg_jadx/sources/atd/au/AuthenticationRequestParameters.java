package atd.au;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import com.adyen.threeds2.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class AuthenticationRequestParameters extends getDeviceData<atd.c.getSDKTransactionID, atd.ax.getSDKAppID> {
    private static int AuthenticationRequestParameters = 1;
    private static int getSDKAppID;

    public AuthenticationRequestParameters(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Button button = (Button) findViewById(R.id.button_cancel);
        if (button != null) {
            button.setEnabled(false);
        }
    }

    @Override // atd.au.getDeviceData
    public final int AuthenticationRequestParameters() {
        int i11 = (getSDKAppID + 43) % 128;
        AuthenticationRequestParameters = i11;
        int i12 = R.layout.a3ds2_view_challenge_loading;
        int i13 = (i11 & (-50)) | ((~i11) & 49);
        int i14 = (i11 & 49) << 1;
        getSDKAppID = ((i13 ^ i14) + ((i14 & i13) << 1)) % 128;
        return i12;
    }

    public AuthenticationRequestParameters(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AuthenticationRequestParameters(Context context) {
        this(context, null);
    }
}
