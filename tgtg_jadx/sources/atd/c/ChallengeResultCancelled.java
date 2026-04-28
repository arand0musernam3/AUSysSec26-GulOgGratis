package atd.c;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import atd.n.getSDKReferenceNumber;
import atd.z.getSDKAppID;
import com.app.tgtg.model.local.AppConstants;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b \u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u001a\u001a\u00020\u001bH&J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0017R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006 "}, d2 = {"Lcom/adyen/threeds2/internal/api/challenge/model/MessageRequest;", "Lcom/adyen/threeds2/internal/api/json/JsonSerializable;", "messageType", "Lcom/adyen/threeds2/internal/api/challenge/model/type/MessageType;", "transactionIdentifiers", "Lcom/adyen/threeds2/internal/result/models/TransactionIdentifiers;", "messageVersion", "Lcom/adyen/threeds2/internal/util/DestroyableString;", "threeDSRequestorAppURL", "<init>", "(Lcom/adyen/threeds2/internal/api/challenge/model/type/MessageType;Lcom/adyen/threeds2/internal/result/models/TransactionIdentifiers;Lcom/adyen/threeds2/internal/util/DestroyableString;Lcom/adyen/threeds2/internal/util/DestroyableString;)V", "getMessageType", "()Lcom/adyen/threeds2/internal/api/challenge/model/type/MessageType;", "setMessageType", "(Lcom/adyen/threeds2/internal/api/challenge/model/type/MessageType;)V", "getTransactionIdentifiers", "()Lcom/adyen/threeds2/internal/result/models/TransactionIdentifiers;", "getMessageVersion", "()Lcom/adyen/threeds2/internal/util/DestroyableString;", "getThreeDSRequestorAppURL", "sdkCounterStoA", "", "getSdkCounterStoA", "()I", "setSdkCounterStoA", "(I)V", "requiresEncryption", "", "serialize", "Lorg/json/JSONObject;", "clear", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ChallengeResultCancelled implements atd.i.getDeviceData {
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;
    private static int ChallengeResult;
    private static int getMessageVersion;
    private static int[] getSDKEphemeralPublicKey;

    @Nullable
    private final atd.bc.AuthenticationRequestParameters AuthenticationRequestParameters;

    @Nullable
    private atd.h.getSDKAppID getDeviceData;
    private int getSDKAppID;

    @NotNull
    private final atd.bc.AuthenticationRequestParameters getSDKReferenceNumber;

    @NotNull
    private final atd.ao.getSDKReferenceNumber getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$f(short r7, short r8, byte r9) {
        /*
            int r9 = r9 + 112
            byte[] r0 = atd.c.ChallengeResultCancelled.$$d
            int r7 = r7 * 4
            int r7 = 1 - r7
            int r8 = r8 * 2
            int r8 = r8 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r9 = r8
            r3 = r0
            r4 = r2
            r0 = r7
            goto L2b
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L24:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r0
            r0 = r6
        L2b:
            int r8 = -r8
            int r8 = r8 + r0
            int r9 = r9 + 1
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.c.ChallengeResultCancelled.$$f(short, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getMessageVersion = 0;
        ChallengeResult = 1;
        getSDKEphemeralPublicKey = new int[]{1428262614, -918067173, -161292594, -588669186, -1963730902, -795845218, -1333095275, -1596608351, -831339296, -951796196, -984841863, -1291973625, -306297129, -1786734918, 2018769163, -527524798, -1227368839, -948817615};
    }

    public ChallengeResultCancelled(@Nullable atd.h.getSDKAppID getsdkappid, @NotNull atd.ao.getSDKReferenceNumber getsdkreferencenumber, @NotNull atd.bc.AuthenticationRequestParameters authenticationRequestParameters, @Nullable atd.bc.AuthenticationRequestParameters authenticationRequestParameters2) {
        getsdkreferencenumber.getClass();
        authenticationRequestParameters.getClass();
        this.getDeviceData = getsdkappid;
        this.getSDKTransactionID = getsdkreferencenumber;
        this.getSDKReferenceNumber = authenticationRequestParameters;
        this.AuthenticationRequestParameters = authenticationRequestParameters2;
    }

    private static void c(int[] iArr, int i11, Object[] objArr) throws Throwable {
        int i12;
        int length;
        int[] iArr2;
        int i13;
        char[] cArr;
        int i14;
        int i15;
        atd.bb.getMessageVersion getmessageversion = new atd.bb.getMessageVersion();
        char[] cArr2 = new char[4];
        int i16 = 2;
        char[] cArr3 = new char[iArr.length * 2];
        int[] iArr3 = getSDKEphemeralPublicKey;
        int i17 = -1667528016;
        Class cls = Integer.TYPE;
        int i18 = 0;
        if (iArr3 != null) {
            $10 = ($11 + 119) % 128;
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i19 = 0;
            while (i19 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i19])};
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(i17);
                    if (sDKTransactionID == null) {
                        i15 = i17;
                        i14 = i16;
                        byte b8 = (byte) i18;
                        byte b11 = b8;
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(View.getDefaultSize(i18, i18) + 2223, (char) (53071 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 21 - Color.argb(i18, i18, i18, i18), 1089703072, false, $$f(b8, b11, (byte) (b11 + 2)), new Class[]{cls});
                    } else {
                        i14 = i16;
                        i15 = i17;
                    }
                    iArr4[i19] = ((Integer) ((Method) sDKTransactionID).invoke(null, objArr2)).intValue();
                    i19++;
                    $11 = ($10 + 87) % 128;
                    i16 = i14;
                    i17 = i15;
                    i18 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int i21 = i16;
        int i22 = i17;
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = getSDKEphemeralPublicKey;
        if (iArr6 != null) {
            int i23 = $11;
            int i24 = i23 + 39;
            $10 = i24 % 128;
            if (i24 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i13 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i13 = 0;
            }
            $10 = (i23 + 119) % 128;
            while (i13 < length) {
                $11 = ($10 + AppConstants.RESULT_CODE_ORDER_CANCELLED) % 128;
                Object[] objArr3 = {Integer.valueOf(iArr6[i13])};
                Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i22);
                if (sDKTransactionID2 == null) {
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    cArr = cArr2;
                    sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 2223, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 53069), 21 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 1089703072, false, $$f(b12, b13, (byte) (b13 + 2)), new Class[]{cls});
                } else {
                    cArr = cArr2;
                }
                iArr2[i13] = ((Integer) ((Method) sDKTransactionID2).invoke(null, objArr3)).intValue();
                i13++;
                cArr2 = cArr;
            }
            iArr6 = iArr2;
        }
        char[] cArr4 = cArr2;
        char c3 = 0;
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        getmessageversion.getSDKAppID = 0;
        while (true) {
            int i25 = getmessageversion.getSDKAppID;
            if (i25 >= iArr.length) {
                objArr[0] = new String(cArr3, 0, i11);
                return;
            }
            int i26 = iArr[i25];
            char c7 = (char) (i26 >> 16);
            cArr4[c3] = c7;
            char c8 = (char) i26;
            cArr4[1] = c8;
            char c11 = (char) (iArr[i25 + 1] >> 16);
            cArr4[i21] = c11;
            char c12 = (char) iArr[i25 + 1];
            cArr4[3] = c12;
            getmessageversion.getDeviceData = (c7 << 16) + c8;
            getmessageversion.AuthenticationRequestParameters = (c11 << 16) + c12;
            atd.bb.getMessageVersion.getSDKTransactionID(iArr5);
            int i27 = 0;
            while (true) {
                i12 = getmessageversion.getDeviceData;
                if (i27 >= 16) {
                    break;
                }
                int i28 = i12 ^ iArr5[i27];
                getmessageversion.getDeviceData = i28;
                int sDKReferenceNumber = atd.bb.getMessageVersion.getSDKReferenceNumber(i28);
                Object[] objArr4 = new Object[4];
                objArr4[3] = getmessageversion;
                objArr4[i21] = getmessageversion;
                objArr4[1] = Integer.valueOf(sDKReferenceNumber);
                objArr4[0] = getmessageversion;
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(1513246698);
                if (sDKTransactionID3 == null) {
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(2386 - Color.blue(0), (char) KeyEvent.normalizeMetaState(0), 19 - View.getDefaultSize(0, 0), -2040903174, false, $$f(b14, b15, b15), new Class[]{Object.class, cls, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                getmessageversion.getDeviceData = getmessageversion.AuthenticationRequestParameters;
                getmessageversion.AuthenticationRequestParameters = iIntValue;
                i27++;
            }
            int i29 = getmessageversion.AuthenticationRequestParameters;
            getmessageversion.getDeviceData = i29;
            getmessageversion.AuthenticationRequestParameters = i12;
            int i31 = i12 ^ iArr5[16];
            getmessageversion.AuthenticationRequestParameters = i31;
            int i32 = i29 ^ iArr5[17];
            getmessageversion.getDeviceData = i32;
            cArr4[0] = (char) (i32 >>> 16);
            cArr4[1] = (char) i32;
            cArr4[i21] = (char) (i31 >>> 16);
            cArr4[3] = (char) i31;
            atd.bb.getMessageVersion.getSDKTransactionID(iArr5);
            int i33 = getmessageversion.getSDKAppID;
            cArr3[i33 * 2] = cArr4[0];
            cArr3[(i33 * 2) + 1] = cArr4[1];
            cArr3[(i33 * 2) + 2] = cArr4[i21];
            cArr3[(i33 * 2) + 3] = cArr4[3];
            int i34 = i21;
            Object[] objArr5 = new Object[i34];
            objArr5[1] = getmessageversion;
            objArr5[0] = getmessageversion;
            Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(35442447);
            if (sDKTransactionID4 == null) {
                byte b16 = (byte) 0;
                byte b17 = b16;
                sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(1861 - (KeyEvent.getMaxKeyCode() >> 16), (char) (ViewConfiguration.getPressedStateDuration() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + 40, -562771681, false, $$f(b16, b17, (byte) (b17 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) sDKTransactionID4).invoke(null, objArr5);
            i21 = i34;
            c3 = 0;
        }
    }

    public static void init$0() {
        $$d = new byte[]{7, 12, 52, -54};
        $$e = 105;
    }

    @Override // atd.i.getDeviceData
    @NotNull
    public JSONObject AuthenticationRequestParameters() throws Throwable {
        String strAuthenticationRequestParameters;
        JSONObject jSONObject = new JSONObject();
        String sDKReferenceNumber = atd.am.getSDKReferenceNumber.MESSAGE_TYPE.getSDKReferenceNumber();
        atd.h.getSDKAppID getsdkappid = this.getDeviceData;
        String str = null;
        if (getsdkappid != null) {
            getMessageVersion = (ChallengeResult + 5) % 128;
            strAuthenticationRequestParameters = getsdkappid.AuthenticationRequestParameters();
        } else {
            strAuthenticationRequestParameters = null;
        }
        jSONObject.put(sDKReferenceNumber, strAuthenticationRequestParameters);
        jSONObject.put(atd.am.getSDKReferenceNumber.MESSAGE_VERSION.getSDKReferenceNumber(), (String) atd.bc.AuthenticationRequestParameters.getDeviceData(getSDKAppID.getSDKTransactionID.getSDKAppID(), -600043858, 600043858, getSDKAppID.getSDKTransactionID.getSDKAppID(), new Object[]{this.getSDKReferenceNumber}, getSDKAppID.getSDKTransactionID.getSDKAppID(), getSDKAppID.getSDKTransactionID.getSDKAppID()));
        String sDKReferenceNumber2 = atd.am.getSDKReferenceNumber.THREEDS_SERVER_TRANSACTION_ID.getSDKReferenceNumber();
        Object[] objArr = {this.getSDKTransactionID};
        jSONObject.put(sDKReferenceNumber2, (String) atd.ao.getSDKReferenceNumber.getSDKAppID(getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), -1801278926, getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), 1801278928, getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), objArr));
        String sDKReferenceNumber3 = atd.am.getSDKReferenceNumber.ACS_TRANSACTION_ID.getSDKReferenceNumber();
        Object[] objArr2 = {this.getSDKTransactionID};
        jSONObject.put(sDKReferenceNumber3, (String) atd.ao.getSDKReferenceNumber.getSDKAppID(getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), 284769600, getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), -284769596, getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), objArr2));
        String sDKReferenceNumber4 = atd.am.getSDKReferenceNumber.SDK_TRANSACTION_ID.getSDKReferenceNumber();
        Object[] objArr3 = {this.getSDKTransactionID};
        jSONObject.put(sDKReferenceNumber4, (String) atd.ao.getSDKReferenceNumber.getSDKAppID(getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), 2021838210, getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), -2021838209, getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), objArr3));
        String sDKReferenceNumber5 = atd.am.getSDKReferenceNumber.SDK_COUNTER_A_TO_S.getSDKReferenceNumber();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.ROOT;
        Object[] objArr4 = new Object[1];
        c(new int[]{54745605, -1705145450}, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3, objArr4);
        jSONObject.put(sDKReferenceNumber5, String.format(locale, ((String) objArr4[0]).intern(), Arrays.copyOf(new Object[]{Integer.valueOf(this.getSDKAppID)}, 1)));
        String sDKReferenceNumber6 = atd.am.getSDKReferenceNumber.THREEDS_REQUESTOR_APP_URL.getSDKReferenceNumber();
        atd.bc.AuthenticationRequestParameters authenticationRequestParameters = this.AuthenticationRequestParameters;
        if (authenticationRequestParameters != null) {
            ChallengeResult = (getMessageVersion + 81) % 128;
            str = (String) atd.bc.AuthenticationRequestParameters.getDeviceData(getSDKAppID.getSDKTransactionID.getSDKAppID(), -600043858, 600043858, getSDKAppID.getSDKTransactionID.getSDKAppID(), new Object[]{authenticationRequestParameters}, getSDKAppID.getSDKTransactionID.getSDKAppID(), getSDKAppID.getSDKTransactionID.getSDKAppID());
        }
        jSONObject.putOpt(sDKReferenceNumber6, str);
        return jSONObject;
    }

    public final int BuildConfig() {
        int i11 = getMessageVersion + 75;
        int i12 = i11 % 128;
        ChallengeResult = i12;
        int i13 = i11 % 2;
        int i14 = this.getSDKAppID;
        if (i13 == 0) {
            int i15 = 35 / 0;
        }
        int i16 = i12 + 111;
        getMessageVersion = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 89 / 0;
        }
        return i14;
    }

    @NotNull
    public final atd.ao.getSDKReferenceNumber ChallengeResultCancelled() {
        int i11 = ChallengeResult;
        int i12 = i11 + 77;
        getMessageVersion = i12 % 128;
        int i13 = i12 % 2;
        atd.ao.getSDKReferenceNumber getsdkreferencenumber = this.getSDKTransactionID;
        if (i13 != 0) {
            int i14 = 2 / 0;
        }
        getMessageVersion = (i11 + 25) % 128;
        return getsdkreferencenumber;
    }

    @NotNull
    public final atd.bc.AuthenticationRequestParameters getMessageVersion() {
        int i11 = ChallengeResult;
        atd.bc.AuthenticationRequestParameters authenticationRequestParameters = this.getSDKReferenceNumber;
        int i12 = i11 + 9;
        getMessageVersion = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 41 / 0;
        }
        return authenticationRequestParameters;
    }

    @Nullable
    public final atd.h.getSDKAppID getSDKAppID() {
        int i11 = ChallengeResult + 117;
        int i12 = i11 % 128;
        getMessageVersion = i12;
        int i13 = i11 % 2;
        atd.h.getSDKAppID getsdkappid = this.getDeviceData;
        if (i13 != 0) {
            int i14 = 99 / 0;
        }
        ChallengeResult = (i12 + 109) % 128;
        return getsdkappid;
    }

    @Nullable
    public final atd.bc.AuthenticationRequestParameters getSDKEphemeralPublicKey() {
        int i11 = (ChallengeResult + 37) % 128;
        getMessageVersion = i11;
        atd.bc.AuthenticationRequestParameters authenticationRequestParameters = this.AuthenticationRequestParameters;
        int i12 = i11 + 33;
        ChallengeResult = i12 % 128;
        if (i12 % 2 != 0) {
            return authenticationRequestParameters;
        }
        throw null;
    }

    public void getSDKReferenceNumber() throws atd.bc.getSDKTransactionID {
        getMessageVersion = (ChallengeResult + 1) % 128;
        this.getDeviceData = null;
        Object[] objArr = {this.getSDKTransactionID};
        int sDKReferenceNumber = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber2 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        atd.ao.getSDKReferenceNumber.getSDKAppID(sDKReferenceNumber, 1724941056, getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), -1724941056, sDKReferenceNumber2, objArr);
        Object[] objArr2 = {this.getSDKReferenceNumber};
        atd.bc.AuthenticationRequestParameters.getDeviceData(getSDKAppID.getSDKTransactionID.getSDKAppID(), 762869508, -762869506, getSDKAppID.getSDKTransactionID.getSDKAppID(), objArr2, getSDKAppID.getSDKTransactionID.getSDKAppID(), getSDKAppID.getSDKTransactionID.getSDKAppID());
        this.getSDKAppID = 0;
        atd.bc.AuthenticationRequestParameters authenticationRequestParameters = this.AuthenticationRequestParameters;
        if (authenticationRequestParameters != null) {
            ChallengeResult = (getMessageVersion + 43) % 128;
            int sDKAppID = getSDKAppID.getSDKTransactionID.getSDKAppID();
            int sDKAppID2 = getSDKAppID.getSDKTransactionID.getSDKAppID();
            atd.bc.AuthenticationRequestParameters.getDeviceData(getSDKAppID.getSDKTransactionID.getSDKAppID(), 762869508, -762869506, sDKAppID, new Object[]{authenticationRequestParameters}, getSDKAppID.getSDKTransactionID.getSDKAppID(), sDKAppID2);
            int i11 = getMessageVersion + 45;
            ChallengeResult = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
        }
    }

    public final void getSDKTransactionID(int i11) {
        int i12 = getMessageVersion + 105;
        ChallengeResult = i12 % 128;
        int i13 = i12 % 2;
        this.getSDKAppID = i11;
        if (i13 == 0) {
            int i14 = 86 / 0;
        }
    }

    public abstract boolean getSDKTransactionID();
}
