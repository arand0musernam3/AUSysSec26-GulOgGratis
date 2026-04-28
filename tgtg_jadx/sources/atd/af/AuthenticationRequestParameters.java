package atd.af;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.ae.ChallengeResultCancelled;
import atd.ag.getMessageVersion;
import atd.e.ChallengeResult;
import java.lang.reflect.Constructor;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class AuthenticationRequestParameters extends getSDKTransactionID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int BuildConfig;
    private static int ChallengeResult;
    private static int ChallengeResultCancelled;
    private static int getMessageVersion;
    private static char[] getSDKReferenceNumber;
    private static long getSDKTransactionID;
    private ECPublicKey AuthenticationRequestParameters;
    private atd.aj.AuthenticationRequestParameters getDeviceData;
    private ECPrivateKey getSDKAppID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, short r7, short r8) {
        /*
            int r6 = 106 - r6
            byte[] r0 = atd.af.AuthenticationRequestParameters.$$a
            int r8 = r8 * 2
            int r1 = r8 + 1
            int r7 = r7 * 2
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L16
            r6 = r8
            r3 = r0
            r4 = r2
            r0 = r7
            goto L2b
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r0
            r0 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2b:
            int r7 = -r7
            int r6 = r6 + r7
            int r7 = r0 + 1
            r0 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.af.AuthenticationRequestParameters.$$c(short, short, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        BuildConfig = 0;
        ChallengeResult = 1;
        ChallengeResultCancelled = 0;
        getMessageVersion = 1;
        ChallengeResult();
        ViewConfiguration.getDoubleTapTimeout();
        TextUtils.getCapsMode("", 0, 0);
        Color.argb(0, 0, 0, 0);
        BuildConfig = (ChallengeResult + 27) % 128;
    }

    public AuthenticationRequestParameters(JSONObject jSONObject) throws Throwable {
        BigInteger sDKAppID;
        super(jSONObject);
        atd.bc.getSDKReferenceNumber sDKTransactionID = atd.bc.getSDKReferenceNumber.getSDKTransactionID();
        Object[] objArr = new Object[1];
        a(2 - TextUtils.getTrimmedLength(""), (char) (36198 - ((byte) KeyEvent.getModifierMetaStateMask())), AndroidCharacter.getMirror('0') - '/', objArr);
        BigInteger sDKAppID2 = atd.aj.getSDKAppID.getSDKAppID(sDKTransactionID.getSDKAppID(jSONObject.getString(((String) objArr[0]).intern())));
        Object[] objArr2 = new Object[1];
        a(3 - TextUtils.getOffsetBefore("", 0), (char) ((-16713571) - Color.rgb(0, 0, 0)), KeyEvent.getDeadChar(0, 0) + 1, objArr2);
        BigInteger sDKAppID3 = atd.aj.getSDKAppID.getSDKAppID(sDKTransactionID.getSDKAppID(jSONObject.getString(((String) objArr2[0]).intern())));
        Object[] objArr3 = new Object[1];
        a(4 - (Process.myPid() >> 22), (char) View.MeasureSpec.getMode(0), TextUtils.getTrimmedLength("") + 1, objArr3);
        if (jSONObject.has(((String) objArr3[0]).intern())) {
            Object[] objArr4 = new Object[1];
            a(Gravity.getAbsoluteGravity(0, 0) + 4, (char) View.MeasureSpec.makeMeasureSpec(0, 0), 1 - Color.alpha(0), objArr4);
            sDKAppID = atd.aj.getSDKAppID.getSDKAppID(sDKTransactionID.getSDKAppID(jSONObject.getString(((String) objArr4[0]).intern())));
        } else {
            sDKAppID = null;
        }
        Object[] objArr5 = new Object[1];
        a(5 - Drawable.resolveOpacity(0, 0), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 6291), Drawable.resolveOpacity(0, 0) + 3, objArr5);
        atd.aj.AuthenticationRequestParameters sDKReferenceNumber = atd.aj.AuthenticationRequestParameters.getSDKReferenceNumber(jSONObject.getString(((String) objArr5[0]).intern()));
        this.getDeviceData = sDKReferenceNumber;
        this.AuthenticationRequestParameters = atd.aj.getDeviceData.AuthenticationRequestParameters(sDKReferenceNumber, sDKAppID2, sDKAppID3);
        this.getSDKAppID = sDKAppID != null ? atd.aj.getDeviceData.getDeviceData(this.getDeviceData, sDKAppID) : null;
    }

    public static void ChallengeResult() {
        getSDKReferenceNumber = new char[]{62539, 49859, 30993, 3306, 62570, 60670, 55905, 33271, 43894, 40423, 50808, 37048, 42548, 64939, 61104, 55339, 33698};
        getSDKTransactionID = -5799002378982800768L;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r29, char r30, int r31, java.lang.Object[] r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.af.AuthenticationRequestParameters.a(int, char, int, java.lang.Object[]):void");
    }

    public static void init$0() {
        $$a = new byte[]{40, 31, 100, 78};
        $$b = 20;
    }

    @Override // atd.af.getSDKReferenceNumber
    public final void AuthenticationRequestParameters() {
        int i11 = getMessageVersion + 43;
        ChallengeResultCancelled = i11 % 128;
        try {
            if (i11 % 2 != 0) {
                super.AuthenticationRequestParameters();
                this.getDeviceData = null;
                this.AuthenticationRequestParameters = null;
                throw null;
            }
            super.AuthenticationRequestParameters();
            this.getDeviceData = null;
            this.AuthenticationRequestParameters = null;
            ECPrivateKey eCPrivateKey = this.getSDKAppID;
            if (eCPrivateKey != null) {
                ChallengeResultCancelled = (getMessageVersion + 47) % 128;
                eCPrivateKey.destroy();
                this.getSDKAppID = null;
            }
            int i12 = ChallengeResultCancelled + 121;
            getMessageVersion = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 59 / 0;
            }
        } catch (Throwable unused) {
        }
    }

    public final ECPublicKey getDeviceData() {
        int i11 = getMessageVersion;
        ECPublicKey eCPublicKey = this.AuthenticationRequestParameters;
        ChallengeResultCancelled = (i11 + 77) % 128;
        return eCPublicKey;
    }

    public final JSONObject getSDKAppID() throws Throwable {
        ECPoint w10 = this.AuthenticationRequestParameters.getW();
        atd.bc.getSDKReferenceNumber sDKTransactionID = atd.bc.getSDKReferenceNumber.getSDKTransactionID();
        String sDKAppID = sDKTransactionID.getSDKAppID(atd.aj.getSDKAppID.AuthenticationRequestParameters(w10.getAffineX()));
        String sDKAppID2 = sDKTransactionID.getSDKAppID(atd.aj.getSDKAppID.AuthenticationRequestParameters(w10.getAffineY()));
        JSONObject jSONObject = new JSONObject();
        try {
            Object[] objArr = new Object[1];
            a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 8, (char) (TextUtils.getCapsMode("", 0, 0) + 24339), 3 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a((-1) - ExpandableListView.getPackedPositionChild(0L), (char) Drawable.resolveOpacity(0, 0), 2 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
            jSONObject.put(strIntern, ((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            a(4 - TextUtils.lastIndexOf("", '0'), (char) (Color.red(0) + 6291), TextUtils.getCapsMode("", 0, 0) + 3, objArr3);
            jSONObject.put(((String) objArr3[0]).intern(), this.getDeviceData.getSDKAppID());
            Object[] objArr4 = new Object[1];
            a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 3, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 36198), (ViewConfiguration.getEdgeSlop() >> 16) + 1, objArr4);
            jSONObject.put(((String) objArr4[0]).intern(), sDKAppID);
            Object[] objArr5 = new Object[1];
            a(3 - Color.argb(0, 0, 0, 0), (char) (ExpandableListView.getPackedPositionChild(0L) + 63646), -TextUtils.indexOf((CharSequence) "", '0', 0), objArr5);
            jSONObject.put(((String) objArr5[0]).intern(), sDKAppID2);
            ChallengeResultCancelled = (getMessageVersion + 121) % 128;
            return jSONObject;
        } catch (JSONException unused) {
            throw atd.aa.getSDKReferenceNumber.CRYPTO_FAILURE.AuthenticationRequestParameters();
        }
    }

    public final byte[] getSDKReferenceNumber(String str, ECPublicKey eCPublicKey) {
        int i11 = getMessageVersion + 43;
        ChallengeResultCancelled = i11 % 128;
        int i12 = i11 % 2;
        ECPrivateKey eCPrivateKey = this.getSDKAppID;
        if (i12 != 0) {
            byte[] deviceData = atd.aj.getDeviceData.getDeviceData(eCPublicKey, eCPrivateKey);
            return atd.aj.getSDKTransactionID.getSDKReferenceNumber(deviceData, deviceData.length >> 4, null, null, str);
        }
        byte[] deviceData2 = atd.aj.getDeviceData.getDeviceData(eCPublicKey, eCPrivateKey);
        return atd.aj.getSDKTransactionID.getSDKReferenceNumber(deviceData2, deviceData2.length << 3, null, null, str);
    }

    @Override // atd.ae.getSDKReferenceNumber
    public final Object getSDKTransactionID$9f036af() throws Throwable {
        Object obj;
        AuthenticationRequestParameters authenticationRequestParameters = new AuthenticationRequestParameters(getMessageVersion(), atd.aj.AuthenticationRequestParameters.P256);
        JSONObject jSONObject = new JSONObject();
        String messageVersion = authenticationRequestParameters.getMessageVersion();
        if (messageVersion != null && !messageVersion.isEmpty()) {
            int i11 = ChallengeResultCancelled + 55;
            getMessageVersion = i11 % 128;
            if (i11 % 2 == 0) {
                Object[] objArr = new Object[1];
                a(49 >>> TextUtils.getTrimmedLength(""), (char) (10066 >>> (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), 2 << Color.argb(1, 0, 0, 0), objArr);
                obj = objArr[0];
            } else {
                Object[] objArr2 = new Object[1];
                a(11 - TextUtils.getTrimmedLength(""), (char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 25821), Color.argb(0, 0, 0, 0) + 3, objArr2);
                obj = objArr2[0];
            }
            jSONObject.put(((String) obj).intern(), messageVersion);
            getMessageVersion = (ChallengeResultCancelled + 81) % 128;
        }
        Object[] objArr3 = new Object[1];
        a(AndroidCharacter.getMirror('0') - '\"', (char) (6876 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 3 - Gravity.getAbsoluteGravity(0, 0), objArr3);
        jSONObject.put(((String) objArr3[0]).intern(), authenticationRequestParameters.getSDKAppID());
        atd.ag.getSDKTransactionID getsdktransactionid = getMessageVersion.getSDKTransactionID;
        atd.ah.getDeviceData getdevicedata = atd.ah.getSDKTransactionID.getDeviceData;
        ChallengeResultCancelled challengeResultCancelled = new ChallengeResultCancelled(getsdktransactionid, getdevicedata, jSONObject);
        byte[] sDKReferenceNumber = authenticationRequestParameters.getSDKReferenceNumber(getMessageVersion(), getDeviceData());
        getSDKAppID getsdkappid = new getSDKAppID(getMessageVersion(), sDKReferenceNumber);
        try {
            Object[] objArr4 = {challengeResultCancelled, getMessageVersion.getSDKAppID.getSDKTransactionID(getdevicedata, sDKReferenceNumber), getsdkappid};
            Object sDKTransactionID = ChallengeResult.getSDKTransactionID(1473484158);
            if (sDKTransactionID == null) {
                sDKTransactionID = ChallengeResult.getDeviceData(Color.red(0) + 147, (char) TextUtils.indexOf("", ""), 33 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -1950641298, false, null, new Class[]{ChallengeResultCancelled.class, atd.ah.AuthenticationRequestParameters.class, getSDKReferenceNumber.class});
            }
            Object objNewInstance = ((Constructor) sDKTransactionID).newInstance(objArr4);
            getsdkappid.AuthenticationRequestParameters();
            return objNewInstance;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public final ECPrivateKey getSDKReferenceNumber() {
        int i11 = (getMessageVersion + 63) % 128;
        ChallengeResultCancelled = i11;
        ECPrivateKey eCPrivateKey = this.getSDKAppID;
        getMessageVersion = (i11 + 125) % 128;
        return eCPrivateKey;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AuthenticationRequestParameters(String str, atd.aj.AuthenticationRequestParameters authenticationRequestParameters) throws Throwable {
        Object[] objArr = new Object[1];
        a(TextUtils.indexOf("", "", 0), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), View.MeasureSpec.getSize(0) + 2, objArr);
        super(str, ((String) objArr[0]).intern());
        this.getDeviceData = authenticationRequestParameters;
        KeyPair deviceData = atd.aj.getDeviceData.getDeviceData(authenticationRequestParameters);
        this.AuthenticationRequestParameters = (ECPublicKey) deviceData.getPublic();
        this.getSDKAppID = (ECPrivateKey) deviceData.getPrivate();
    }
}
