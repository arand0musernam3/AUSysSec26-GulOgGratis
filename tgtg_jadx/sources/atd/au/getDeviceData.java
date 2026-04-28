package atd.au;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import atd.av.AuthenticationRequestParameters;
import atd.ax.getSDKAppID;
import atd.c.getSDKTransactionID;
import com.adyen.threeds2.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class getDeviceData<C extends atd.c.getSDKTransactionID, L extends atd.ax.getSDKAppID> extends LinearLayout implements AuthenticationRequestParameters.getSDKReferenceNumber {
    private static int getSDKAppID = 0;
    private static int getSDKEphemeralPublicKey = 1;
    private static char[] getSDKReferenceNumber = {19806, 30897, 30888, 30898, 19802, 30894, 30853, 30881, 30952, 19803, 30887, 30864, 30890, 30895, 19796, 30900, 30950, 19800, 30883, 19801, 30882, 19805, 30889, 19807, 30901};
    private static char getSDKTransactionID = 19801;
    private atd.ap.getDeviceData AuthenticationRequestParameters;
    private L getDeviceData;

    public getDeviceData(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        View.inflate(context, R.layout.a3ds2_view_challenge_container, this);
        View.inflate(context, AuthenticationRequestParameters(), (ViewGroup) findViewById(R.id.scrollView_content));
        ((atd.av.AuthenticationRequestParameters) findViewById(R.id.toolbarView)).setToolbarListener(this);
    }

    public abstract int AuthenticationRequestParameters();

    @Override // atd.av.AuthenticationRequestParameters.getSDKReferenceNumber
    public final void getSDKAppID() {
        int i11 = getSDKAppID;
        getSDKEphemeralPublicKey = (i11 + 27) % 128;
        L l = this.getDeviceData;
        if (l != null) {
            int i12 = i11 + 45;
            getSDKEphemeralPublicKey = i12 % 128;
            if (i12 % 2 != 0) {
                l.getSDKAppID();
            } else {
                l.getSDKAppID();
                throw null;
            }
        }
    }

    public final L getSDKTransactionID() {
        int i11 = (getSDKAppID + 117) % 128;
        getSDKEphemeralPublicKey = i11;
        if (this.getDeviceData == null) {
            int i12 = i11 + 67;
            getSDKAppID = i12 % 128;
            if (i12 % 2 != 0) {
                ViewConfiguration.getTouchSlop();
                Color.green(1);
                TextUtils.lastIndexOf("", '.', 1, 1);
                TextUtils.lastIndexOf("", (char) 24);
            } else {
                ViewConfiguration.getTouchSlop();
                Color.green(0);
                TextUtils.lastIndexOf("", '0', 0, 0);
                TextUtils.lastIndexOf("", '0');
            }
        }
        return this.getDeviceData;
    }

    @Override // android.view.View
    public boolean onFilterTouchEventForSecurity(MotionEvent motionEvent) {
        getSDKAppID = (getSDKEphemeralPublicKey + 47) % 128;
        if ((motionEvent.getFlags() & 1) == 0) {
            return super.onFilterTouchEventForSecurity(motionEvent);
        }
        atd.ap.getDeviceData getdevicedata = this.AuthenticationRequestParameters;
        if (getdevicedata == null) {
            return false;
        }
        getSDKAppID = (getSDKEphemeralPublicKey + 91) % 128;
        getdevicedata.AuthenticationRequestParameters();
        return false;
    }

    public void setChallengeListener(L l) {
        int i11 = getSDKAppID;
        int i12 = i11 + 17;
        getSDKEphemeralPublicKey = i12 % 128;
        if (i12 % 2 == 0) {
            this.getDeviceData = l;
            throw null;
        }
        this.getDeviceData = l;
        getSDKEphemeralPublicKey = (i11 + 1) % 128;
    }

    public void setOverlayDetectionListener(atd.ap.getDeviceData getdevicedata) {
        int i11 = getSDKAppID;
        this.AuthenticationRequestParameters = getdevicedata;
        int i12 = i11 + 65;
        getSDKEphemeralPublicKey = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }
}
