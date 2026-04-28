package atd.au;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import atd.c.ChallengeResultCompleted;
import atd.c.getTransactionStatus;
import atd.n.getSDKAppID;
import atd.n.getSDKReferenceNumber;
import com.adyen.threeds2.R;
import r8.k;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getSDKAppID extends getSDKReferenceNumber<ChallengeResultCompleted, atd.ax.getSDKTransactionID> implements View.OnClickListener {
    private static int AuthenticationRequestParameters = 0;
    private static int getDeviceData = 1;
    private final Button getSDKReferenceNumber;
    private final Button getSDKTransactionID;

    public getSDKAppID(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.getSDKReferenceNumber = (Button) findViewById(R.id.button_app);
        this.getSDKTransactionID = (Button) findViewById(R.id.button_continue);
    }

    public static /* synthetic */ Object AuthenticationRequestParameters(int i11, int i12, int i13, Object[] objArr, int i14, int i15, int i16) {
        int i17 = ~i15;
        int i18 = ~(i17 | i16);
        int i19 = ~i13;
        int i21 = ~(i19 | i16);
        int i22 = i18 | i21;
        int i23 = ~i16;
        int i24 = ~(i23 | i15);
        int i25 = (~(i13 | i17)) | i24 | i21;
        int i26 = (~(i23 | i19)) | i24 | (~(i19 | i15));
        int i27 = (-1647181824) * i14;
        int i28 = (606601216 * i11) + (1313472512 * i12) + i27 + (768614067 * i26) + (i25 * 768614067) + ((-1537228134) * i22) + ((-878567756) * i15) + ((1110557339 * i16) - 760807424);
        int iC = a0.c(i11, 2055044340, ((-954185507) * i12) + i16 + i15 + i14);
        switch (a0.e(iC, 572063744, (i11 * 1594648204) + (i12 * 826674179) + (i14 * 1290136159) + (i26 * 621) + (i25 * 621) + (i22 * (-1242)) + (i15 * 1290136780) + (i16 * 1290134917) + 267690129, 607715328, ((-1232666624) * iC) + i28)) {
            case 1:
                return getSDKReferenceNumber(objArr);
            case 2:
                return AuthenticationRequestParameters(objArr);
            case 3:
                return getSDKAppID(objArr);
            case 4:
                return getSDKTransactionID(objArr);
            case 5:
                return getDeviceData(objArr);
            case 6:
                return ChallengeResult(objArr);
            default:
                getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
                ChallengeResultCompleted challengeResultCompleted = (ChallengeResultCompleted) objArr[1];
                int i29 = AuthenticationRequestParameters;
                getDeviceData = k.c(i29 & 46, i29 | 46, 1, 128);
                String strChallengeStatusReceiver = challengeResultCompleted.ChallengeStatusReceiver();
                if (strChallengeStatusReceiver != null) {
                    int i31 = getDeviceData;
                    int i32 = ((i31 ^ 11) | (i31 & 11)) << 1;
                    int i33 = -(((~i31) & 11) | (i31 & (-12)));
                    AuthenticationRequestParameters = ((i32 & i33) + (i33 | i32)) % 128;
                    getsdkappid.getSDKReferenceNumber.setTag(Uri.parse(strChallengeStatusReceiver));
                    getsdkappid.getSDKReferenceNumber.setText((String) ChallengeResultCompleted.AuthenticationRequestParameters(55108837, -55108836, getSDKAppID.getSDKReferenceNumber.getDeviceData(), getSDKAppID.getSDKReferenceNumber.getDeviceData(), new Object[]{challengeResultCompleted}, getSDKAppID.getSDKReferenceNumber.getDeviceData(), getSDKAppID.getSDKReferenceNumber.getDeviceData()));
                    getsdkappid.getSDKReferenceNumber.setOnClickListener(getsdkappid);
                    getsdkappid.getSDKReferenceNumber.setVisibility(0);
                    int i34 = getDeviceData;
                    int i35 = (i34 & (-8)) | ((~i34) & 7);
                    int i36 = (i34 & 7) << 1;
                    AuthenticationRequestParameters = ((i35 ^ i36) + ((i36 & i35) << 1)) % 128;
                } else {
                    getsdkappid.getSDKReferenceNumber.setVisibility(8);
                    int i37 = AuthenticationRequestParameters;
                    getDeviceData = (((i37 | 111) << 1) - (i37 ^ 111)) % 128;
                }
                getsdkappid.getSDKTransactionID.setText(challengeResultCompleted.completed());
                getsdkappid.getSDKTransactionID.setOnClickListener(getsdkappid);
                int i38 = getDeviceData;
                AuthenticationRequestParameters = ((-2) - ((((i38 | 94) << 1) - (i38 ^ 94)) ^ (-1))) % 128;
                return null;
        }
    }

    private static /* synthetic */ Object ChallengeResult(Object[] objArr) {
        getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
        ChallengeResultCompleted challengeResultCompleted = (ChallengeResultCompleted) objArr[1];
        int i11 = AuthenticationRequestParameters;
        int i12 = ((i11 | 65) << 1) - (i11 ^ 65);
        getDeviceData = i12 % 128;
        if (i12 % 2 == 0) {
            TextUtils.isEmpty(challengeResultCompleted.ChallengeStatusHandler());
            throw null;
        }
        String strChallengeStatusHandler = challengeResultCompleted.ChallengeStatusHandler();
        if (!TextUtils.isEmpty(strChallengeStatusHandler)) {
            int i13 = getDeviceData + 9;
            AuthenticationRequestParameters = i13 % 128;
            if (i13 % 2 != 0) {
                getsdkappid.getDeviceData(strChallengeStatusHandler);
                getsdkappid.getDeviceData();
                int i14 = 70 / 0;
            } else {
                getsdkappid.getDeviceData(strChallengeStatusHandler);
                getsdkappid.getDeviceData();
            }
            AuthenticationRequestParameters = (getDeviceData + 19) % 128;
        }
        AuthenticationRequestParameters = (getDeviceData + 79) % 128;
        return null;
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) {
        getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
        int i11 = AuthenticationRequestParameters;
        int i12 = (i11 & 43) + (i11 | 43);
        getDeviceData = i12 % 128;
        if (i12 % 2 == 0) {
            super.BuildConfig();
            throw null;
        }
        String strBuildConfig = super.BuildConfig();
        int i13 = getDeviceData;
        AuthenticationRequestParameters = ((i13 ^ 71) + ((i13 & 71) << 1)) % 128;
        return strBuildConfig;
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
        int i11 = getDeviceData;
        int i12 = i11 & 27;
        int i13 = (i11 ^ 27) | i12;
        int i14 = (i12 & i13) + (i13 | i12);
        AuthenticationRequestParameters = i14 % 128;
        int i15 = i14 % 2;
        int i16 = R.layout.a3ds2_view_challenge_out_of_band;
        if (i15 != 0) {
            int i17 = 36 / 0;
        }
        return Integer.valueOf(i16);
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
        getTransactionStatus gettransactionstatus = (getTransactionStatus) objArr[1];
        int i11 = getDeviceData;
        int i12 = i11 & 97;
        AuthenticationRequestParameters = a0.d(i12, ~((i11 ^ 97) | i12), 1, 128);
        int sDKReferenceNumber = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber2 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber3 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        AuthenticationRequestParameters(getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), sDKReferenceNumber3, sDKReferenceNumber, new Object[]{getsdkappid, (ChallengeResultCompleted) gettransactionstatus}, sDKReferenceNumber2, 485626548, -485626548);
        int i13 = AuthenticationRequestParameters;
        int i14 = ((i13 | 69) << 1) - (i13 ^ 69);
        getDeviceData = i14 % 128;
        if (i14 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
        getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
        getTransactionStatus gettransactionstatus = (getTransactionStatus) objArr[1];
        int i11 = AuthenticationRequestParameters;
        int i12 = i11 & 113;
        int i13 = (((i11 | 113) & (~i12)) - (~(i12 << 1))) - 1;
        getDeviceData = i13 % 128;
        int i14 = i13 % 2;
        super.getDeviceData(gettransactionstatus);
        if (i14 == 0) {
            throw null;
        }
        int i15 = AuthenticationRequestParameters;
        int i16 = (((i15 & (-42)) | ((~i15) & 41)) - (~((i15 & 41) << 1))) - 1;
        getDeviceData = i16 % 128;
        if (i16 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // atd.au.getSDKReferenceNumber
    public final String BuildConfig() {
        int sDKReferenceNumber = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber2 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber3 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        return (String) AuthenticationRequestParameters(getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), sDKReferenceNumber3, sDKReferenceNumber, new Object[]{this}, sDKReferenceNumber2, 2109937226, -2109937221);
    }

    @Override // atd.au.getSDKReferenceNumber, android.view.View.OnClickListener
    public final void onClick(View view) {
        int sDKReferenceNumber = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber2 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber3 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        AuthenticationRequestParameters(getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), sDKReferenceNumber3, sDKReferenceNumber, new Object[]{this, view}, sDKReferenceNumber2, -424605609, 424605611);
    }

    public getSDKAppID(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public getSDKAppID(Context context) {
        this(context, null);
    }

    @Override // atd.au.getSDKReferenceNumber
    public final /* synthetic */ void getDeviceData(getTransactionStatus gettransactionstatus) {
        int sDKReferenceNumber = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber2 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber3 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        AuthenticationRequestParameters(getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), sDKReferenceNumber3, sDKReferenceNumber, new Object[]{this, gettransactionstatus}, sDKReferenceNumber2, -577223693, 577223697);
    }

    private void getDeviceData(ChallengeResultCompleted challengeResultCompleted) {
        int sDKReferenceNumber = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber2 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber3 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        AuthenticationRequestParameters(getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), sDKReferenceNumber3, sDKReferenceNumber, new Object[]{this, challengeResultCompleted}, sDKReferenceNumber2, 485626548, -485626548);
    }

    public final void getSDKTransactionID(ChallengeResultCompleted challengeResultCompleted) {
        int sDKReferenceNumber = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber2 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber3 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        AuthenticationRequestParameters(getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), sDKReferenceNumber3, sDKReferenceNumber, new Object[]{this, challengeResultCompleted}, sDKReferenceNumber2, -244795152, 244795158);
    }

    @Override // atd.au.getSDKReferenceNumber
    public final /* synthetic */ void getSDKReferenceNumber(getTransactionStatus gettransactionstatus) {
        int sDKReferenceNumber = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber2 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber3 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        AuthenticationRequestParameters(getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), sDKReferenceNumber3, sDKReferenceNumber, new Object[]{this, gettransactionstatus}, sDKReferenceNumber2, 355824253, -355824252);
    }

    @Override // atd.au.getSDKReferenceNumber
    public final int getSDKReferenceNumber() {
        int sDKReferenceNumber = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber2 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber3 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        return ((Integer) AuthenticationRequestParameters(getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), sDKReferenceNumber3, sDKReferenceNumber, new Object[]{this}, sDKReferenceNumber2, 1512104246, -1512104243)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object AuthenticationRequestParameters(java.lang.Object[] r12) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.au.getSDKAppID.AuthenticationRequestParameters(java.lang.Object[]):java.lang.Object");
    }
}
