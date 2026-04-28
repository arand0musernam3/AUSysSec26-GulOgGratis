package atd.au;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import atd.c.getTransactionStatus;
import atd.c.onCompletion;
import atd.p.getSDKEphemeralPublicKey;
import com.adyen.threeds2.R;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class ChallengeResult extends getSDKReferenceNumber<onCompletion, atd.ax.getSDKReferenceNumber> implements View.OnClickListener {
    private static int AuthenticationRequestParameters = 1;
    private static int getDeviceData;
    private final Button getSDKReferenceNumber;
    private final EditText getSDKTransactionID;

    public ChallengeResult(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.getSDKTransactionID = (EditText) findViewById(R.id.editText_text);
        this.getSDKReferenceNumber = (Button) findViewById(R.id.button_continue);
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
        ChallengeResult challengeResult = (ChallengeResult) objArr[0];
        getTransactionStatus gettransactionstatus = (getTransactionStatus) objArr[1];
        int i11 = AuthenticationRequestParameters;
        int i12 = i11 ^ 101;
        int i13 = -(-((i11 & 101) << 1));
        int i14 = (i12 & i13) + (i13 | i12);
        getDeviceData = i14 % 128;
        int i15 = i14 % 2;
        Object[] objArr2 = {challengeResult, (onCompletion) gettransactionstatus};
        int iAuthenticationRequestParameters = getSDKEphemeralPublicKey.getSDKReferenceNumber.AuthenticationRequestParameters();
        if (i15 == 0) {
            getSDKTransactionID(-199179140, getSDKEphemeralPublicKey.getSDKReferenceNumber.AuthenticationRequestParameters(), getSDKEphemeralPublicKey.getSDKReferenceNumber.AuthenticationRequestParameters(), iAuthenticationRequestParameters, 199179140, getSDKEphemeralPublicKey.getSDKReferenceNumber.AuthenticationRequestParameters(), objArr2);
            return null;
        }
        getSDKTransactionID(-199179140, getSDKEphemeralPublicKey.getSDKReferenceNumber.AuthenticationRequestParameters(), getSDKEphemeralPublicKey.getSDKReferenceNumber.AuthenticationRequestParameters(), iAuthenticationRequestParameters, 199179140, getSDKEphemeralPublicKey.getSDKReferenceNumber.AuthenticationRequestParameters(), objArr2);
        int i16 = 18 / 0;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0073, code lost:
    
        if (android.text.TextUtils.isEmpty(r6) != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0075, code lost:
    
        ((atd.ax.getSDKReferenceNumber) r1.getSDKTransactionID()).getSDKReferenceNumber(r1.BuildConfig());
        r6 = atd.au.ChallengeResult.AuthenticationRequestParameters;
        r1 = ((r6 & 58) + (r6 | 58)) - 1;
        atd.au.ChallengeResult.getDeviceData = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0091, code lost:
    
        if ((r1 % 2) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0093, code lost:
    
        r6 = 57 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0096, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0097, code lost:
    
        ((atd.ax.getSDKReferenceNumber) r1.getSDKTransactionID()).AuthenticationRequestParameters(r6, r1.BuildConfig());
        atd.au.ChallengeResult.getDeviceData = (atd.au.ChallengeResult.AuthenticationRequestParameters + 19) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005f, code lost:
    
        if (android.text.TextUtils.isEmpty(r6) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object getDeviceData(java.lang.Object[] r6) {
        /*
            r0 = 0
            r1 = r6[r0]
            atd.au.ChallengeResult r1 = (atd.au.ChallengeResult) r1
            r2 = 1
            r6 = r6[r2]
            android.view.View r6 = (android.view.View) r6
            int r3 = atd.au.ChallengeResult.getDeviceData
            r4 = r3 ^ 89
            r5 = r3 & 89
            r4 = r4 | r5
            int r4 = r4 << r2
            int r5 = ~r5
            r3 = r3 | 89
            r3 = r3 & r5
            int r3 = -r3
            r5 = r4 ^ r3
            r3 = r3 & r4
            int r2 = r3 << 1
            int r5 = r5 + r2
            int r5 = r5 % 128
            atd.au.ChallengeResult.AuthenticationRequestParameters = r5
            super.onClick(r6)
            atd.ax.getSDKAppID r2 = r1.getSDKTransactionID()
            r3 = 0
            if (r2 == 0) goto Lac
            int r2 = atd.au.ChallengeResult.AuthenticationRequestParameters
            r4 = r2 & 70
            r2 = r2 | 70
            int r4 = r4 + r2
            int r4 = r4 + (-1)
            int r4 = r4 % 128
            atd.au.ChallengeResult.getDeviceData = r4
            android.widget.Button r2 = r1.getSDKReferenceNumber
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto Lac
            int r6 = atd.au.ChallengeResult.getDeviceData
            int r6 = r6 + 97
            int r2 = r6 % 128
            atd.au.ChallengeResult.AuthenticationRequestParameters = r2
            int r6 = r6 % 2
            android.widget.Button r2 = r1.getSDKReferenceNumber
            if (r6 != 0) goto L62
            r2.setEnabled(r0)
            android.widget.EditText r6 = r1.getSDKTransactionID
            android.text.Editable r6 = r6.getText()
            java.lang.String r6 = r6.toString()
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 == 0) goto L97
            goto L75
        L62:
            r2.setEnabled(r0)
            android.widget.EditText r6 = r1.getSDKTransactionID
            android.text.Editable r6 = r6.getText()
            java.lang.String r6 = r6.toString()
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 == 0) goto L97
        L75:
            atd.ax.getSDKAppID r6 = r1.getSDKTransactionID()
            atd.ax.getSDKReferenceNumber r6 = (atd.ax.getSDKReferenceNumber) r6
            java.lang.String r1 = r1.BuildConfig()
            r6.getSDKReferenceNumber(r1)
            int r6 = atd.au.ChallengeResult.AuthenticationRequestParameters
            r1 = r6 & 58
            r6 = r6 | 58
            int r1 = r1 + r6
            int r1 = r1 + (-1)
            int r6 = r1 % 128
            atd.au.ChallengeResult.getDeviceData = r6
            int r1 = r1 % 2
            if (r1 == 0) goto L96
            r6 = 57
            int r6 = r6 / r0
        L96:
            return r3
        L97:
            atd.ax.getSDKAppID r0 = r1.getSDKTransactionID()
            atd.ax.getSDKReferenceNumber r0 = (atd.ax.getSDKReferenceNumber) r0
            java.lang.String r1 = r1.BuildConfig()
            r0.AuthenticationRequestParameters(r6, r1)
            int r6 = atd.au.ChallengeResult.AuthenticationRequestParameters
            int r6 = r6 + 19
            int r6 = r6 % 128
            atd.au.ChallengeResult.getDeviceData = r6
        Lac:
            int r6 = atd.au.ChallengeResult.getDeviceData
            r0 = r6 & 47
            r6 = r6 | 47
            int r0 = r0 + r6
            int r0 = r0 % 128
            atd.au.ChallengeResult.AuthenticationRequestParameters = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.au.ChallengeResult.getDeviceData(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
        ChallengeResult challengeResult = (ChallengeResult) objArr[0];
        onCompletion oncompletion = (onCompletion) objArr[1];
        int i11 = AuthenticationRequestParameters;
        int i12 = i11 & 97;
        int i13 = -(-((i11 ^ 97) | i12));
        int i14 = (i12 & i13) + (i13 | i12);
        getDeviceData = i14 % 128;
        if (i14 % 2 == 0) {
            challengeResult.getDeviceData(challengeResult.getSDKTransactionID.getId());
            challengeResult.getSDKReferenceNumber.setText(oncompletion.ChallengeResultKt());
            challengeResult.getSDKReferenceNumber.setOnClickListener(challengeResult);
            return null;
        }
        challengeResult.getDeviceData(challengeResult.getSDKTransactionID.getId());
        challengeResult.getSDKReferenceNumber.setText(oncompletion.ChallengeResultKt());
        challengeResult.getSDKReferenceNumber.setOnClickListener(challengeResult);
        throw null;
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        ChallengeResult challengeResult = (ChallengeResult) objArr[0];
        getTransactionStatus gettransactionstatus = (getTransactionStatus) objArr[1];
        int i11 = AuthenticationRequestParameters;
        int i12 = i11 & 67;
        getDeviceData = a0.d((i11 | 67) & (~i12), ~(i12 << 1), 1, 128);
        super.getDeviceData(gettransactionstatus);
        int i13 = AuthenticationRequestParameters;
        int i14 = i13 & 93;
        int i15 = (i14 - (~((i13 ^ 93) | i14))) - 1;
        getDeviceData = i15 % 128;
        if (i15 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Object getSDKTransactionID(int i11, int i12, int i13, int i14, int i15, int i16, Object[] objArr) {
        int i17 = ~i11;
        int i18 = ~i14;
        int i19 = ~(i17 | i18);
        int i21 = ~(i17 | i15);
        int i22 = i19 | i21 | (~(i18 | i15));
        int i23 = i14 | i21;
        int i24 = ~i15;
        int i25 = (~(i14 | i24 | i11)) | (~(i17 | i24 | i18)) | (~(i18 | i11 | i15));
        int i26 = (1577058304 * i16) + (494927872 * i13) + (276824064 * i12) + (935884852 * i25) + (i23 * 935884852) + ((-1871769704) * i22) + ((-659060787) * i15) + ((1212708917 * i11) - 1912602624);
        int iC = a0.c(i16, -1277752516, ((-1329026341) * i13) + i11 + i15 + i12);
        int i27 = i16 * 731850196;
        int iE = a0.e(iC, 1869086720, i27 + (i13 * (-1341978823)) + (i12 * 595972219) + (i25 * 252) + (i23 * 252) + (i22 * (-504)) + (i15 * 595971967) + (i11 * 595972471) + 129777640, -846725120, ((-1783103488) * iC) + i26);
        return iE != 1 ? iE != 2 ? iE != 3 ? iE != 4 ? getSDKAppID(objArr) : AuthenticationRequestParameters(objArr) : getSDKReferenceNumber(objArr) : getSDKTransactionID(objArr) : getDeviceData(objArr);
    }

    @Override // atd.au.getSDKReferenceNumber, android.view.View.OnClickListener
    public final void onClick(View view) {
        int iAuthenticationRequestParameters = getSDKEphemeralPublicKey.getSDKReferenceNumber.AuthenticationRequestParameters();
        getSDKTransactionID(625058536, getSDKEphemeralPublicKey.getSDKReferenceNumber.AuthenticationRequestParameters(), getSDKEphemeralPublicKey.getSDKReferenceNumber.AuthenticationRequestParameters(), iAuthenticationRequestParameters, -625058535, getSDKEphemeralPublicKey.getSDKReferenceNumber.AuthenticationRequestParameters(), new Object[]{this, view});
    }

    public ChallengeResult(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChallengeResult(Context context) {
        this(context, null);
    }

    @Override // atd.au.getSDKReferenceNumber
    public final /* synthetic */ void getSDKReferenceNumber(getTransactionStatus gettransactionstatus) {
        int iAuthenticationRequestParameters = getSDKEphemeralPublicKey.getSDKReferenceNumber.AuthenticationRequestParameters();
        getSDKTransactionID(-949407983, getSDKEphemeralPublicKey.getSDKReferenceNumber.AuthenticationRequestParameters(), getSDKEphemeralPublicKey.getSDKReferenceNumber.AuthenticationRequestParameters(), iAuthenticationRequestParameters, 949407987, getSDKEphemeralPublicKey.getSDKReferenceNumber.AuthenticationRequestParameters(), new Object[]{this, gettransactionstatus});
    }

    @Override // atd.au.getSDKReferenceNumber
    public final int getSDKReferenceNumber() {
        int iAuthenticationRequestParameters = getSDKEphemeralPublicKey.getSDKReferenceNumber.AuthenticationRequestParameters();
        return ((Integer) getSDKTransactionID(-1748840963, getSDKEphemeralPublicKey.getSDKReferenceNumber.AuthenticationRequestParameters(), getSDKEphemeralPublicKey.getSDKReferenceNumber.AuthenticationRequestParameters(), iAuthenticationRequestParameters, 1748840965, getSDKEphemeralPublicKey.getSDKReferenceNumber.AuthenticationRequestParameters(), new Object[]{this})).intValue();
    }

    private void getSDKAppID(onCompletion oncompletion) {
        int iAuthenticationRequestParameters = getSDKEphemeralPublicKey.getSDKReferenceNumber.AuthenticationRequestParameters();
        getSDKTransactionID(-199179140, getSDKEphemeralPublicKey.getSDKReferenceNumber.AuthenticationRequestParameters(), getSDKEphemeralPublicKey.getSDKReferenceNumber.AuthenticationRequestParameters(), iAuthenticationRequestParameters, 199179140, getSDKEphemeralPublicKey.getSDKReferenceNumber.AuthenticationRequestParameters(), new Object[]{this, oncompletion});
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
        int i11 = getDeviceData;
        int i12 = i11 ^ 47;
        int i13 = (((i11 & 47) | i12) << 1) - i12;
        AuthenticationRequestParameters = i13 % 128;
        if (i13 % 2 != 0) {
            return Integer.valueOf(R.layout.a3ds2_view_challenge_text);
        }
        throw null;
    }

    @Override // atd.au.getSDKReferenceNumber
    public final /* synthetic */ void getDeviceData(getTransactionStatus gettransactionstatus) {
        int iAuthenticationRequestParameters = getSDKEphemeralPublicKey.getSDKReferenceNumber.AuthenticationRequestParameters();
        getSDKTransactionID(-108279692, getSDKEphemeralPublicKey.getSDKReferenceNumber.AuthenticationRequestParameters(), getSDKEphemeralPublicKey.getSDKReferenceNumber.AuthenticationRequestParameters(), iAuthenticationRequestParameters, 108279695, getSDKEphemeralPublicKey.getSDKReferenceNumber.AuthenticationRequestParameters(), new Object[]{this, gettransactionstatus});
    }
}
