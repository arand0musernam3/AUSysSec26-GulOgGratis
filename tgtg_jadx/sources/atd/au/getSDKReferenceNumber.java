package atd.au;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import atd.ax.getSDKAppID;
import atd.bb.ChallengeResultCompleted;
import atd.c.getTransactionStatus;
import atd.d.BuildConfig;
import com.adyen.threeds2.R;
import com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult;
import com.app.tgtg.model.local.AppConstants;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class getSDKReferenceNumber<C extends getTransactionStatus, L extends atd.ax.getSDKAppID> extends getDeviceData<C, L> implements View.OnClickListener {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char ChallengeResultError;
    private static int ChallengeResultKt;
    private static char ChallengeResultTimeout;
    private static int ChallengeStatusReceiver;
    private static char getTransactionStatus;
    private static char onCompletion;
    private final Button AuthenticationRequestParameters;
    private final atd.av.getSDKTransactionID BuildConfig;
    private final ImageView ChallengeResult;
    private final atd.av.getSDKTransactionID ChallengeResultCancelled;
    private final BuildConfig ChallengeResultCompleted;
    private final SwitchCompat getAdditionalDetails;
    private final TextView getDeviceData;
    private final ImageView getMessageVersion;
    private final TextView getSDKAppID;
    private final View getSDKEphemeralPublicKey;
    private final TextView getSDKReferenceNumber;
    private final ImageView getSDKTransactionID;

    private static String $$c(int i11, byte b8, short s7) {
        int i12 = (s7 * 3) + 66;
        int i13 = 3 - (i11 * 4);
        int i14 = b8 * 2;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[1 - i14];
        int i15 = 0 - i14;
        int i16 = -1;
        if (bArr == null) {
            i12 = i13 + i12;
            i13 = i13;
            bArr = bArr;
            i16 = -1;
        }
        while (true) {
            int i17 = i16 + 1;
            bArr2[i17] = (byte) i12;
            int i18 = i13 + 1;
            if (i17 == i15) {
                return new String(bArr2, 0);
            }
            byte[] bArr3 = bArr;
            i12 = bArr[i18] + i12;
            i13 = i18;
            bArr = bArr3;
            i16 = i17;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ChallengeStatusReceiver = 0;
        ChallengeResultKt = 1;
        ChallengeResultError = (char) 42604;
        getTransactionStatus = (char) 45847;
        ChallengeResultTimeout = (char) 30097;
        onCompletion = (char) 56280;
    }

    public getSDKReferenceNumber(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        View.inflate(context, getSDKReferenceNumber(), (ViewGroup) findViewById(R.id.linearLayout_challengeContainer));
        this.getSDKReferenceNumber = (TextView) findViewById(R.id.textView_infoHeader);
        this.getSDKAppID = (TextView) findViewById(R.id.textView_infoText);
        this.getDeviceData = (TextView) findViewById(R.id.textView_infoLabel);
        this.getSDKTransactionID = (ImageView) findViewById(R.id.imageView_infoTextIndicator);
        this.AuthenticationRequestParameters = (Button) findViewById(R.id.button_resend);
        this.BuildConfig = (atd.av.getSDKTransactionID) findViewById(R.id.expandableInfoText_why);
        this.ChallengeResultCancelled = (atd.av.getSDKTransactionID) findViewById(R.id.expandableInfoText_explained);
        this.getSDKEphemeralPublicKey = findViewById(R.id.dividerView_logos);
        this.getMessageVersion = (ImageView) findViewById(R.id.imageView_issuer);
        this.ChallengeResult = (ImageView) findViewById(R.id.imageView_scheme);
        this.getAdditionalDetails = (SwitchCompat) findViewById(R.id.switch_whitelist);
        this.ChallengeResultCompleted = new BuildConfig();
    }

    @SuppressLint({"SyntheticAccessor"})
    private void AuthenticationRequestParameters(C c3) {
        boolean z11;
        ChallengeResultKt = (ChallengeStatusReceiver + 53) % 128;
        SwitchCompat switchCompat = this.getAdditionalDetails;
        int sDKReferenceNumber = DeviceParameterResult.Success.IntValue.getSDKReferenceNumber();
        int sDKReferenceNumber2 = DeviceParameterResult.Success.IntValue.getSDKReferenceNumber();
        if (TextUtils.isEmpty((String) getTransactionStatus.getSDKTransactionID(-516478175, sDKReferenceNumber, DeviceParameterResult.Success.IntValue.getSDKReferenceNumber(), sDKReferenceNumber2, DeviceParameterResult.Success.IntValue.getSDKReferenceNumber(), 516478175, new Object[]{c3}))) {
            ChallengeResultKt = (ChallengeStatusReceiver + 87) % 128;
            z11 = false;
        } else {
            ChallengeStatusReceiver = (ChallengeResultKt + 115) % 128;
            z11 = true;
        }
        getSDKTransactionID(switchCompat, z11);
        SwitchCompat switchCompat2 = this.getAdditionalDetails;
        int sDKReferenceNumber3 = DeviceParameterResult.Success.IntValue.getSDKReferenceNumber();
        int sDKReferenceNumber4 = DeviceParameterResult.Success.IntValue.getSDKReferenceNumber();
        switchCompat2.setText((String) getTransactionStatus.getSDKTransactionID(-516478175, sDKReferenceNumber3, DeviceParameterResult.Success.IntValue.getSDKReferenceNumber(), sDKReferenceNumber4, DeviceParameterResult.Success.IntValue.getSDKReferenceNumber(), 516478175, new Object[]{c3}));
        ChallengeResultKt = (ChallengeStatusReceiver + 71) % 128;
    }

    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        int i12;
        int i13;
        char c3;
        char[] charArray = str != null ? str.toCharArray() : str;
        ChallengeResultCompleted challengeResultCompleted = new ChallengeResultCompleted();
        char[] cArr = new char[charArray.length];
        challengeResultCompleted.getDeviceData = 0;
        int i14 = 2;
        char[] cArr2 = new char[2];
        while (true) {
            int i15 = challengeResultCompleted.getDeviceData;
            if (i15 >= charArray.length) {
                objArr[0] = new String(cArr, 0, i11);
                return;
            }
            $11 = ($10 + 101) % 128;
            cArr2[0] = charArray[i15];
            char c7 = 1;
            cArr2[1] = charArray[i15 + 1];
            int i16 = 58224;
            int i17 = 0;
            while (i17 < 16) {
                $10 = ($11 + AppConstants.RESULT_CODE_ORDER_CANCELLED) % 128;
                char c8 = cArr2[c7];
                char c11 = cArr2[0];
                char c12 = c7;
                int i18 = i17;
                int i19 = (c11 + i16) ^ ((c11 << 4) + ((char) (((long) ChallengeResultTimeout) ^ 5320350835299930193L)));
                int i21 = c11 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onCompletion);
                    objArr2[i14] = Integer.valueOf(i21);
                    objArr2[c12] = Integer.valueOf(i19);
                    objArr2[0] = Integer.valueOf(c8);
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(906025703);
                    Class cls = Integer.TYPE;
                    if (sDKTransactionID == null) {
                        i13 = 906025703;
                        byte b8 = (byte) 0;
                        c3 = 3;
                        byte b11 = b8;
                        i12 = i14;
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(View.resolveSizeAndState(0, 0, 0) + 2828, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), Color.red(0) + 27, -362226441, false, $$c(b8, b11, b11), new Class[]{cls, cls, cls, cls});
                    } else {
                        i12 = i14;
                        i13 = 906025703;
                        c3 = 3;
                    }
                    char cCharValue = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    cArr2[c12] = cCharValue;
                    char c13 = cArr2[0];
                    int i22 = (cCharValue + i16) ^ ((cCharValue << 4) + ((char) (((long) ChallengeResultError) ^ 5320350835299930193L)));
                    int i23 = cCharValue >>> 5;
                    Object[] objArr3 = new Object[4];
                    objArr3[c3] = Integer.valueOf(getTransactionStatus);
                    objArr3[i12] = Integer.valueOf(i23);
                    objArr3[c12] = Integer.valueOf(i22);
                    objArr3[0] = Integer.valueOf(c13);
                    Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i13);
                    if (sDKTransactionID2 == null) {
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(2828 - KeyEvent.keyCodeFromString(""), (char) (Color.rgb(0, 0, 0) + 16777216), (ViewConfiguration.getScrollBarSize() >> 8) + 27, -362226441, false, $$c(b12, b13, b13), new Class[]{cls, cls, cls, cls});
                    }
                    cArr2[0] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
                    i16 -= 40503;
                    i17 = i18 + 1;
                    $10 = ($11 + 29) % 128;
                    c7 = c12;
                    i14 = i12;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            int i24 = i14;
            char c14 = c7;
            int i25 = challengeResultCompleted.getDeviceData;
            cArr[i25] = cArr2[0];
            cArr[i25 + 1] = cArr2[c14];
            i14 = i24;
            Object[] objArr4 = new Object[i14];
            objArr4[c14] = challengeResultCompleted;
            objArr4[0] = challengeResultCompleted;
            Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-1859796622);
            if (sDKTransactionID3 == null) {
                byte b14 = (byte) 0;
                byte b15 = b14;
                sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(3156 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 25796), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 27, 1296942946, false, $$c(b14, b15, (byte) (b15 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) sDKTransactionID3).invoke(null, objArr4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void getSDKTransactionID(C r20) {
        /*
            r19 = this;
            r0 = r19
            atd.c.getMessageVersion r1 = r20.ChallengeResultTimeout()
            atd.c.getMessageVersion r2 = r20.getAdditionalDetails()
            r3 = 1
            if (r1 == 0) goto L1c
            if (r2 == 0) goto L1c
            android.view.View r4 = r0.getSDKEphemeralPublicKey
            getSDKTransactionID(r4, r3)
            android.widget.ImageView r4 = r0.getMessageVersion
            getSDKTransactionID(r4, r3)
            android.widget.ImageView r4 = r0.ChallengeResult
            goto L49
        L1c:
            android.view.View r4 = r0.getSDKEphemeralPublicKey
            r5 = 0
            getSDKTransactionID(r4, r5)
            android.widget.ImageView r4 = r0.getMessageVersion
            if (r1 == 0) goto L32
            int r6 = atd.au.getSDKReferenceNumber.ChallengeResultKt
            int r6 = r6 + 43
            int r7 = r6 % 128
            atd.au.getSDKReferenceNumber.ChallengeStatusReceiver = r7
            int r6 = r6 % 2
            if (r6 == 0) goto L34
        L32:
            r6 = r5
            goto L35
        L34:
            r6 = r3
        L35:
            getSDKTransactionID(r4, r6)
            android.widget.ImageView r4 = r0.ChallengeResult
            if (r2 == 0) goto L48
            int r6 = atd.au.getSDKReferenceNumber.ChallengeStatusReceiver
            int r6 = r6 + 21
            int r7 = r6 % 128
            atd.au.getSDKReferenceNumber.ChallengeResultKt = r7
            int r6 = r6 % 2
            if (r6 != 0) goto L49
        L48:
            r3 = r5
        L49:
            getSDKTransactionID(r4, r3)
            atd.d.BuildConfig r3 = r0.ChallengeResultCompleted
            android.widget.ImageView r4 = r0.getMessageVersion
            java.lang.Object[] r7 = new java.lang.Object[]{r3, r4, r1}
            int r10 = atd.n.getSDKTransactionID.getSDKAppID.getSDKAppID()
            int r9 = atd.n.getSDKTransactionID.getSDKAppID.getSDKAppID()
            int r5 = atd.n.getSDKTransactionID.getSDKAppID.getSDKAppID()
            int r11 = atd.n.getSDKTransactionID.getSDKAppID.getSDKAppID()
            r6 = 1714904638(0x66375e3e, float:2.1648288E23)
            r15 = -1714904637(0xffffffff99c8a1c3, float:-2.074485E-23)
            r8 = r15
            atd.d.BuildConfig.getSDKReferenceNumber(r5, r6, r7, r8, r9, r10, r11)
            atd.d.BuildConfig r1 = r0.ChallengeResultCompleted
            android.widget.ImageView r3 = r0.ChallengeResult
            java.lang.Object[] r14 = new java.lang.Object[]{r1, r3, r2}
            int r17 = atd.n.getSDKTransactionID.getSDKAppID.getSDKAppID()
            int r16 = atd.n.getSDKTransactionID.getSDKAppID.getSDKAppID()
            int r12 = atd.n.getSDKTransactionID.getSDKAppID.getSDKAppID()
            int r18 = atd.n.getSDKTransactionID.getSDKAppID.getSDKAppID()
            r13 = r6
            atd.d.BuildConfig.getSDKReferenceNumber(r12, r13, r14, r15, r16, r17, r18)
            int r1 = atd.au.getSDKReferenceNumber.ChallengeStatusReceiver
            int r1 = r1 + 77
            int r1 = r1 % 128
            atd.au.getSDKReferenceNumber.ChallengeResultKt = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.au.getSDKReferenceNumber.getSDKTransactionID(atd.c.getTransactionStatus):void");
    }

    public static void init$0() {
        $$a = new byte[]{40, 74, -99, -21};
        $$b = 124;
    }

    public String BuildConfig() {
        int i11 = ChallengeStatusReceiver + 27;
        ChallengeResultKt = i11 % 128;
        int i12 = i11 % 2;
        SwitchCompat switchCompat = this.getAdditionalDetails;
        if (i12 == 0) {
            switchCompat.getVisibility();
            throw null;
        }
        if (switchCompat.getVisibility() != 0) {
            return null;
        }
        if (this.getAdditionalDetails.isChecked()) {
            Object[] objArr = new Object[1];
            a("ꟹ췩", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), objArr);
            return ((String) objArr[0]).intern();
        }
        Object[] objArr2 = new Object[1];
        a("莆ᶹ", 1 - Color.green(0), objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        int i13 = ChallengeResultKt + 3;
        ChallengeStatusReceiver = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 97 / 0;
        }
        return strIntern;
    }

    public void getDeviceData(C c3) {
        ChallengeResultKt = (ChallengeStatusReceiver + 119) % 128;
        getDeviceData(this.getSDKReferenceNumber, c3.getSDKAppID());
        getDeviceData(this.getSDKAppID, c3.getSDKReferenceNumber());
        getDeviceData(this.getDeviceData, c3.ChallengeResult());
        getSDKTransactionID(this.getSDKTransactionID, c3.getTransactionStatus());
        if (c3.getSDKTransactionID() == atd.h.getSDKTransactionID.SINGLE_TEXT_INPUT) {
            ChallengeStatusReceiver = (ChallengeResultKt + 103) % 128;
            getDeviceData(this.AuthenticationRequestParameters, c3.getSDKEphemeralPublicKey());
        } else {
            this.AuthenticationRequestParameters.setVisibility(8);
        }
        atd.av.getSDKTransactionID getsdktransactionid = this.BuildConfig;
        int sDKReferenceNumber = DeviceParameterResult.Success.IntValue.getSDKReferenceNumber();
        int sDKReferenceNumber2 = DeviceParameterResult.Success.IntValue.getSDKReferenceNumber();
        getDeviceData(getsdktransactionid, (String) getTransactionStatus.getSDKTransactionID(1879579140, sDKReferenceNumber, DeviceParameterResult.Success.IntValue.getSDKReferenceNumber(), sDKReferenceNumber2, DeviceParameterResult.Success.IntValue.getSDKReferenceNumber(), -1879579139, new Object[]{c3}), c3.getMessageVersion());
        getDeviceData(this.ChallengeResultCancelled, c3.BuildConfig(), c3.ChallengeResultCompleted());
        getSDKTransactionID(c3);
        AuthenticationRequestParameters(c3);
        this.AuthenticationRequestParameters.setOnClickListener(this);
        getSDKReferenceNumber(c3);
        ChallengeResultKt = (ChallengeStatusReceiver + 107) % 128;
    }

    public abstract int getSDKReferenceNumber();

    public abstract void getSDKReferenceNumber(C c3);

    public void onClick(View view) {
        if (getSDKTransactionID() != null && view.equals(this.AuthenticationRequestParameters)) {
            int i11 = ChallengeResultKt + 69;
            ChallengeStatusReceiver = i11 % 128;
            int i12 = i11 % 2;
            Button button = this.AuthenticationRequestParameters;
            if (i12 != 0) {
                button.setEnabled(true);
            } else {
                button.setEnabled(false);
            }
            getSDKTransactionID().AuthenticationRequestParameters(BuildConfig());
        }
        int i13 = ChallengeResultKt + 89;
        ChallengeStatusReceiver = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 92 / 0;
        }
    }

    @Override // atd.au.getDeviceData
    public final int AuthenticationRequestParameters() {
        int i11 = ChallengeResultKt;
        int i12 = R.layout.a3ds2_view_challenge_native_container;
        ChallengeStatusReceiver = (i11 + 41) % 128;
        return i12;
    }

    private static void getSDKTransactionID(View view, boolean z11) {
        int i11;
        if (view != null) {
            if (z11) {
                ChallengeResultKt = (ChallengeStatusReceiver + 111) % 128;
                i11 = 0;
            } else {
                i11 = 8;
            }
            view.setVisibility(i11);
            ChallengeStatusReceiver = (ChallengeResultKt + 55) % 128;
        }
        ChallengeStatusReceiver = (ChallengeResultKt + 79) % 128;
    }

    public final void getDeviceData(CharSequence charSequence) {
        ChallengeStatusReceiver = (ChallengeResultKt + 93) % 128;
        getDeviceData(this.getSDKAppID, charSequence);
        int i11 = ChallengeResultKt + 69;
        ChallengeStatusReceiver = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    public final void getDeviceData(int i11) {
        ChallengeStatusReceiver = (ChallengeResultKt + 1) % 128;
        this.getDeviceData.setLabelFor(i11);
        ChallengeResultKt = (ChallengeStatusReceiver + 95) % 128;
    }

    public final void getDeviceData() {
        ChallengeResultKt = (ChallengeStatusReceiver + 25) % 128;
        getSDKTransactionID(this.getSDKTransactionID, false);
        int i11 = ChallengeResultKt + 83;
        ChallengeStatusReceiver = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 9 / 0;
        }
    }

    private static void getDeviceData(TextView textView, CharSequence charSequence) {
        int i11 = ChallengeStatusReceiver + 121;
        ChallengeResultKt = i11 % 128;
        if (i11 % 2 != 0) {
            if (TextUtils.isEmpty(charSequence)) {
                textView.setVisibility(8);
                ChallengeStatusReceiver = (ChallengeResultKt + 73) % 128;
                return;
            } else {
                textView.setVisibility(0);
                textView.setText(charSequence);
                return;
            }
        }
        TextUtils.isEmpty(charSequence);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (android.text.TextUtils.isEmpty(r4) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        r2.setTitle(r3);
        r2.setInfo(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        if (android.text.TextUtils.isEmpty(r4) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void getDeviceData(atd.av.getSDKTransactionID r2, java.lang.String r3, java.lang.String r4) {
        /*
            int r0 = atd.au.getSDKReferenceNumber.ChallengeStatusReceiver
            int r0 = r0 + 47
            int r1 = r0 % 128
            atd.au.getSDKReferenceNumber.ChallengeResultKt = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L3d
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L37
            int r0 = atd.au.getSDKReferenceNumber.ChallengeResultKt
            int r0 = r0 + 79
            int r1 = r0 % 128
            atd.au.getSDKReferenceNumber.ChallengeStatusReceiver = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L29
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 10
            int r1 = r1 / 0
            if (r0 == 0) goto L30
            goto L37
        L29:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L30
            goto L37
        L30:
            r2.setTitle(r3)
            r2.setInfo(r4)
            return
        L37:
            r3 = 8
            r2.setVisibility(r3)
            return
        L3d:
            android.text.TextUtils.isEmpty(r3)
            r2 = 0
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.au.getSDKReferenceNumber.getDeviceData(atd.av.getSDKTransactionID, java.lang.String, java.lang.String):void");
    }
}
