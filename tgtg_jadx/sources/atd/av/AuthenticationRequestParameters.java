package atd.av;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import atd.y.getAdditionalDetails;
import com.adyen.threeds2.R;
import com.app.tgtg.model.local.AppConstants;
import r8.k;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class AuthenticationRequestParameters extends LinearLayout implements View.OnClickListener {
    private static int getDeviceData = 0;
    private static int getSDKAppID = 1;
    private final Button AuthenticationRequestParameters;
    private getSDKReferenceNumber getSDKReferenceNumber;
    private final TextView getSDKTransactionID;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public interface getSDKReferenceNumber {
        void getSDKAppID();
    }

    public AuthenticationRequestParameters(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        View.inflate(context, R.layout.a3ds2_widget_toolbar, this);
        CharSequence charSequenceLoadLabel = getContext().getApplicationInfo().loadLabel(getContext().getPackageManager());
        TextView textView = (TextView) findViewById(R.id.textView_title);
        this.getSDKTransactionID = textView;
        textView.setText(charSequenceLoadLabel);
        Button button = (Button) findViewById(R.id.button_cancel);
        this.AuthenticationRequestParameters = button;
        button.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i11 = getDeviceData;
        int iC = k.c(i11 ^ 102, (i11 & 102) << 1, 1, 128);
        getSDKAppID = iC;
        if (this.getSDKReferenceNumber != null) {
            getDeviceData = (iC + 67) % 128;
            if (view.equals(this.AuthenticationRequestParameters)) {
                int sDKAppID = getAdditionalDetails.AuthenticationRequestParameters.getSDKAppID();
                int i12 = ~sDKAppID;
                int i13 = ~sDKAppID;
                int i14 = (i13 | sDKAppID) & i12;
                int i15 = (i14 & (-1376187192)) | ((-1376187192) ^ i14);
                int i16 = (i15 | (~i15)) & (~i15);
                int i17 = (i16 & 302264598) | (302264598 ^ i16);
                int i18 = (-543755401) & sDKAppID;
                int i19 = ~(((-543755401) ^ sDKAppID) | i18);
                int i21 = (-967631016) - (~(-(~(-(-(((i17 & i19) | (i17 ^ i19)) * (-252)))))));
                int i22 = ((i21 ^ (-1)) + (i21 << 1)) - 412592420;
                int i23 = (-1376187192) & i12;
                int i24 = ((i12 | (-1376187192)) & (~i23)) | i23;
                int i25 = (1617677993 & i24) | ((~i24) & (-1617677994));
                int i26 = i24 & (-1617677994);
                int i27 = (i26 & i25) | (i25 ^ i26);
                int i28 = (i27 | (~i27)) & (~i27);
                int i29 = (sDKAppID & 543755400) | (i13 & (-543755401));
                int i31 = ~((i29 & i18) | (i29 ^ i18));
                int i32 = i28 & i31;
                int i33 = (i31 | i28) & (~i32);
                int i34 = -(-(((i33 & i32) | (i33 ^ i32)) * 252));
                int i35 = i22 ^ i34;
                int i36 = -(-((i34 & i22) << 1));
                int i37 = (i35 & i36) + (i36 | i35);
                int sDKAppID2 = getAdditionalDetails.AuthenticationRequestParameters.getSDKAppID();
                int i38 = ~sDKAppID2;
                int i39 = ((-948063644) & i38) | (sDKAppID2 & 948063643);
                int i41 = (-948063644) & sDKAppID2;
                int i42 = (i39 & i41) | (i39 ^ i41);
                int i43 = (i42 | (~i42)) & (~i42);
                int i44 = ((~i43) & 8407448) | ((-8407449) & i43);
                int i45 = i43 & 8407448;
                int i46 = ((i45 & i44) | (i44 ^ i45)) * (-280);
                int i47 = (-1233908078) | i46;
                int i48 = (i47 << 1) - ((~(i46 & (-1233908078))) & i47);
                int i49 = (-948063644) & sDKAppID2;
                int i51 = (~i49) & ((-948063644) | sDKAppID2);
                int i52 = ~((i49 & i51) | (i51 ^ i49));
                int i53 = (79985656 ^ sDKAppID2) | (79985656 & sDKAppID2);
                int i54 = (i53 | (~i53)) & (~i53);
                int i55 = (i48 - (~(-(-(((i52 & i54) | (i52 ^ i54)) * 140))))) - 1;
                int i56 = ((-939656196) & i38) | (939656195 & sDKAppID2);
                int i57 = (-939656196) & sDKAppID2;
                int i58 = ~((i57 & i56) | (i56 ^ i57));
                int i59 = ~sDKAppID2;
                int i61 = (sDKAppID2 | i38) & i59;
                int i62 = (i61 & (-948063644)) | ((~i61) & (-948063644)) | (i61 & 948063643);
                int i63 = ~((i62 & (-79985657)) | (i62 & 79985656) | ((~i62) & (-79985657)));
                int i64 = i58 & i63;
                int i65 = (i63 | i58) & (~i64);
                int i66 = (i65 & i64) | (i65 ^ i64);
                int i67 = 79985656 & i59;
                int i68 = i67 | ((~i67) & (79985656 | i59));
                int i69 = i68 & 948063643;
                int i71 = ~(((i68 | 948063643) & (~i69)) | i69);
                int i72 = i66 & i71;
                int i73 = (i66 | i71) & (~i72);
                int i74 = -(-(((i73 & i72) | (i73 ^ i72)) * 140));
                int i75 = (i55 & i74) + (i74 | i55);
                getSDKReferenceNumber getsdkreferencenumber = this.getSDKReferenceNumber;
                if (i37 > i75) {
                    getsdkreferencenumber.getSDKAppID();
                    int i76 = 69 / 0;
                } else {
                    getsdkreferencenumber.getSDKAppID();
                }
            }
        }
        int i77 = getDeviceData;
        int i78 = (i77 & (-96)) | ((~i77) & 95);
        int i79 = -(-((i77 & 95) << 1));
        getSDKAppID = (((i78 | i79) << 1) - (i79 ^ i78)) % 128;
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i11) {
        int i12 = getDeviceData;
        int i13 = i12 & 45;
        getSDKAppID = (i13 + ((i12 ^ 45) | i13)) % 128;
        getChildAt(0).setBackgroundColor(i11);
        int i14 = getSDKAppID;
        int i15 = (i14 ^ 95) + ((i14 & 95) << 1);
        getDeviceData = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
    }

    public final void setCancelButtonBackgroundColor(int i11) {
        int i12 = getDeviceData + 117;
        getSDKAppID = i12 % 128;
        int i13 = i12 % 2;
        Button button = this.AuthenticationRequestParameters;
        if (i13 != 0) {
            button.setBackgroundColor(i11);
        } else {
            button.setBackgroundColor(i11);
            int i14 = 61 / 0;
        }
    }

    public final void setCancelButtonText(String str) {
        int i11 = getDeviceData;
        int i12 = i11 & 17;
        getSDKAppID = (((i11 | 17) & (~i12)) + (i12 << 1)) % 128;
        this.AuthenticationRequestParameters.setText(str);
        int i13 = getDeviceData;
        getSDKAppID = a0.d(i13 ^ 77, ~((i13 & 77) << 1), 1, 128);
    }

    public final void setCancelButtonTextColor(int i11) {
        int i12 = getDeviceData;
        int i13 = i12 & 105;
        int i14 = i13 + ((i12 ^ 105) | i13);
        getSDKAppID = i14 % 128;
        int i15 = i14 % 2;
        Button button = this.AuthenticationRequestParameters;
        if (i15 == 0) {
            button.setTextColor(i11);
            throw null;
        }
        button.setTextColor(i11);
        int i16 = getDeviceData;
        getSDKAppID = a0.d(i16 ^ 59, ~(-(-((i16 & 59) << 1))), 1, 128);
    }

    public final void setCancelButtonTextTypeface(Typeface typeface) {
        int i11 = getDeviceData;
        int i12 = i11 | AppConstants.RESULT_CODE_ORDER_CANCELLED;
        int i13 = i12 << 1;
        int i14 = -((~(i11 & AppConstants.RESULT_CODE_ORDER_CANCELLED)) & i12);
        getSDKAppID = ((i13 ^ i14) + ((i14 & i13) << 1)) % 128;
        this.AuthenticationRequestParameters.setTypeface(typeface);
        getDeviceData = (getSDKAppID + 109) % 128;
    }

    public final void setTitle(String str) {
        int i11 = getSDKAppID;
        int i12 = (((i11 | 50) << 1) - (i11 ^ 50)) - 1;
        getDeviceData = i12 % 128;
        int i13 = i12 % 2;
        TextView textView = this.getSDKTransactionID;
        if (i13 != 0) {
            textView.setText(str);
            throw null;
        }
        textView.setText(str);
        int i14 = getSDKAppID;
        int i15 = i14 & 63;
        int i16 = -(-((i14 ^ 63) | i15));
        getDeviceData = (((i15 | i16) << 1) - (i16 ^ i15)) % 128;
    }

    public final void setTitleFontSize(Integer num) {
        int i11 = getDeviceData;
        int i12 = i11 & 55;
        int i13 = ((i11 ^ 55) | i12) << 1;
        int i14 = -((i11 | 55) & (~i12));
        getSDKAppID = ((i13 ^ i14) + ((i14 & i13) << 1)) % 128;
        this.getSDKTransactionID.setTextSize(num.intValue());
        int i15 = getDeviceData;
        int i16 = i15 ^ AppConstants.RESULT_CODE_ORDER_CANCELLED;
        int i17 = -(-((i15 & AppConstants.RESULT_CODE_ORDER_CANCELLED) << 1));
        getSDKAppID = (((i16 | i17) << 1) - (i17 ^ i16)) % 128;
    }

    public final void setTitleTextColor(int i11) {
        int i12 = getDeviceData;
        int i13 = i12 & 45;
        int i14 = (i12 | 45) & (~i13);
        int i15 = i13 << 1;
        int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
        getSDKAppID = i16 % 128;
        int i17 = i16 % 2;
        TextView textView = this.getSDKTransactionID;
        if (i17 == 0) {
            textView.setTextColor(i11);
            throw null;
        }
        textView.setTextColor(i11);
        int i18 = getSDKAppID;
        int i19 = ((i18 & 80) + (i18 | 80)) - 1;
        getDeviceData = i19 % 128;
        if (i19 % 2 != 0) {
            int i21 = 13 / 0;
        }
    }

    public final void setTitleTypeface(Typeface typeface) {
        int i11 = getDeviceData;
        int i12 = (i11 & 45) + (i11 | 45);
        getSDKAppID = i12 % 128;
        int i13 = i12 % 2;
        TextView textView = this.getSDKTransactionID;
        if (i13 != 0) {
            textView.setTypeface(typeface);
        } else {
            textView.setTypeface(typeface);
            throw null;
        }
    }

    public final void setToolbarListener(getSDKReferenceNumber getsdkreferencenumber) {
        int i11 = getDeviceData;
        int i12 = (i11 & (-114)) | ((~i11) & 113);
        int i13 = -(-((i11 & 113) << 1));
        int i14 = (((i12 | i13) << 1) - (i13 ^ i12)) % 128;
        getSDKAppID = i14;
        this.getSDKReferenceNumber = getsdkreferencenumber;
        int i15 = i14 + 19;
        getDeviceData = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
    }

    public AuthenticationRequestParameters(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AuthenticationRequestParameters(Context context) {
        this(context, null);
    }
}
