package atd.e;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.ag.getMessageVersion;
import atd.n.ChallengeResultTimeout;
import atd.x.ChallengeResult;
import atd.y.getSDKAppID;
import com.adyen.threeds2.ChallengeStatusReceiver;
import com.adyen.threeds2.CompletionEvent;
import com.adyen.threeds2.ProgressDialog;
import com.adyen.threeds2.ProtocolErrorEvent;
import com.adyen.threeds2.RuntimeErrorEvent;
import com.adyen.threeds2.Transaction;
import com.adyen.threeds2.exception.InvalidInputException;
import com.adyen.threeds2.exception.SDKRuntimeException;
import com.adyen.threeds2.internal.ui.activity.ChallengeActivity;
import com.app.tgtg.model.local.AppConstants;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.i18n.LocalizedMessage;
import org.json.JSONException;
import org.json.JSONObject;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class ChallengeResultCompleted implements getSDKReferenceNumber, Transaction {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final int $$f = 0;
    private static int $10;
    private static int $11;
    private static int ChallengeResult;
    private static long ChallengeResultCancelled;
    private static int ChallengeResultTimeout;
    private static int getAdditionalDetails;
    private static int getSDKEphemeralPublicKey;
    private com.adyen.threeds2.AuthenticationRequestParameters AuthenticationRequestParameters;
    private atd.at.getSDKAppID BuildConfig;
    private WeakReference<Activity> getDeviceData;
    private atd.d.getSDKTransactionID getMessageVersion;
    private atd.af.AuthenticationRequestParameters getSDKAppID;
    private ChallengeStatusReceiver getSDKReferenceNumber;
    private List<X509Certificate> getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$g(int r6, byte r7, int r8) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 97
            byte[] r0 = atd.e.ChallengeResultCompleted.$$c
            int r6 = r6 + 4
            int r8 = r8 * 2
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L16
            r7 = r6
            r3 = r0
            r4 = r2
            r0 = r8
            goto L2e
        L16:
            r3 = r2
        L17:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r0
            r0 = r5
        L2e:
            int r6 = r6 + r0
            r0 = r7
            r7 = r6
            r6 = r0
            r0 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.e.ChallengeResultCompleted.$$g(int, byte, int):java.lang.String");
    }

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        getAdditionalDetails = 0;
        ChallengeResultTimeout = 1;
        ChallengeResult = 0;
        getSDKEphemeralPublicKey = 1;
        AuthenticationRequestParameters();
        TextUtils.indexOf((CharSequence) "", '0', 0);
        int i11 = getAdditionalDetails + 67;
        ChallengeResultTimeout = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public ChallengeResultCompleted(List<X509Certificate> list, atd.af.AuthenticationRequestParameters authenticationRequestParameters, com.adyen.threeds2.AuthenticationRequestParameters authenticationRequestParameters2) {
        this.getSDKTransactionID = list;
        this.getSDKAppID = authenticationRequestParameters;
        this.AuthenticationRequestParameters = authenticationRequestParameters2;
    }

    private static Intent AuthenticationRequestParameters(Activity activity, atd.c.getSDKTransactionID getsdktransactionid) {
        return (Intent) getSDKAppID(ChallengeResultTimeout.getDeviceData.getDeviceData(), new Object[]{activity, getsdktransactionid}, ChallengeResultTimeout.getDeviceData.getDeviceData(), -1749306481, 1749306481, ChallengeResultTimeout.getDeviceData.getDeviceData(), ChallengeResultTimeout.getDeviceData.getDeviceData());
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0110, code lost:
    
        r4[r6] = (char) r5[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0116, code lost:
    
        r0 = new java.lang.Object[r1];
        r0[1] = r3;
        r0[0] = r3;
        r1 = atd.e.ChallengeResult.getSDKTransactionID(1456884118);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0120, code lost:
    
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0122, code lost:
    
        r1 = (byte) (-1);
        r5 = (byte) (r1 + 1);
        r1 = atd.e.ChallengeResult.getDeviceData((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 3095, (char) (android.text.TextUtils.lastIndexOf("", '0') + 14368), 17 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0'), -1967239290, false, $$g(r1, r5, r5), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x014c, code lost:
    
        ((java.lang.reflect.Method) r1).invoke(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0151, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(java.lang.String r26, int r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.e.ChallengeResultCompleted.a(java.lang.String, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 65
            int r6 = r6 + 11
            int r7 = 155 - r7
            byte[] r0 = atd.e.ChallengeResultCompleted.$$a
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r8
            r3 = r2
            r8 = r7
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            int r7 = r7 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2a:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + 1
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.e.ChallengeResultCompleted.b(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void c(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = 526 - r7
            int r0 = 60 - r8
            int r6 = r6 * 2
            int r6 = 103 - r6
            byte[] r1 = atd.e.ChallengeResultCompleted.$$d
            byte[] r0 = new byte[r0]
            int r8 = 59 - r8
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r1
            r4 = r2
            r1 = r7
            r7 = r8
            goto L30
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            int r7 = r7 + 1
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r5
        L30:
            int r6 = -r6
            int r7 = r7 + r6
            int r6 = r7 + (-2)
            r7 = r1
            r1 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.e.ChallengeResultCompleted.c(short, int, int, java.lang.Object[]):void");
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) throws Throwable {
        ChallengeResultCompleted challengeResultCompleted = (ChallengeResultCompleted) objArr[0];
        String str = (String) objArr[1];
        atd.af.getSDKReferenceNumber getsdkreferencenumber = (atd.af.getSDKReferenceNumber) objArr[2];
        int i11 = getSDKEphemeralPublicKey + 109;
        ChallengeResult = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        if (!(getsdkreferencenumber instanceof atd.af.AuthenticationRequestParameters)) {
            throw atd.aa.getSDKReferenceNumber.CRYPTO_FAILURE.getDeviceData();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Object[] objArr2 = new Object[1];
            a("Ꝇ끍襛", 5898 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr2);
            jSONObject.put(((String) objArr2[0]).intern(), str);
            getSDKEphemeralPublicKey = (ChallengeResult + 25) % 128;
            atd.ae.ChallengeResultCancelled challengeResultCancelled = new atd.ae.ChallengeResultCancelled(getMessageVersion.getSDKAppID, atd.ah.getSDKTransactionID.getDeviceData, jSONObject);
            byte[] sDKReferenceNumber = challengeResultCompleted.getSDKAppID.getSDKReferenceNumber(challengeResultCompleted.AuthenticationRequestParameters.getSDKReferenceNumber(), ((atd.af.AuthenticationRequestParameters) getsdkreferencenumber).getDeviceData());
            atd.af.getSDKAppID getsdkappid = new atd.af.getSDKAppID(null, sDKReferenceNumber);
            int deviceData = atd.ak.getDeviceData.getDeviceData();
            atd.bc.getDeviceData.getSDKTransactionID(atd.ak.getDeviceData.getDeviceData(), atd.ak.getDeviceData.getDeviceData(), atd.ak.getDeviceData.getDeviceData(), deviceData, -1676234569, new Object[]{jSONObject}, 1676234570);
            getsdkreferencenumber.AuthenticationRequestParameters();
            Arrays.fill(sDKReferenceNumber, (byte) 0);
            try {
                try {
                    try {
                        Object[] objArr3 = {challengeResultCancelled, challengeResultCancelled.getSDKTransactionID().AuthenticationRequestParameters(challengeResultCancelled, getsdkappid), getsdkappid};
                        Object sDKTransactionID = ChallengeResult.getSDKTransactionID(1473484158);
                        if (sDKTransactionID == null) {
                            sDKTransactionID = ChallengeResult.getDeviceData(Process.getGidForName("") + AppConstants.CONTACT_US_REQUEST_FILE, (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 32, -1950641298, false, null, new Class[]{atd.ae.ChallengeResultCancelled.class, atd.ah.AuthenticationRequestParameters.class, atd.af.getSDKReferenceNumber.class});
                        }
                        Object objNewInstance = ((Constructor) sDKTransactionID).newInstance(objArr3);
                        getsdkappid.AuthenticationRequestParameters();
                        getSDKEphemeralPublicKey = (ChallengeResult + 51) % 128;
                        return objNewInstance;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th2;
                    }
                } catch (JSONException unused) {
                    throw atd.aa.getSDKReferenceNumber.CRYPTO_FAILURE.AuthenticationRequestParameters();
                }
            } catch (Throwable th3) {
                getsdkappid.AuthenticationRequestParameters();
                throw th3;
            }
        } catch (JSONException unused2) {
            throw atd.aa.getSDKReferenceNumber.CRYPTO_FAILURE.AuthenticationRequestParameters();
        }
    }

    private Object getDeviceData$144d853a(String str, atd.af.getSDKReferenceNumber getsdkreferencenumber) {
        return getSDKAppID(ChallengeResultTimeout.getDeviceData.getDeviceData(), new Object[]{this, str, getsdkreferencenumber}, ChallengeResultTimeout.getDeviceData.getDeviceData(), -106295431, 106295432, ChallengeResultTimeout.getDeviceData.getDeviceData(), ChallengeResultTimeout.getDeviceData.getDeviceData());
    }

    private ChallengeStatusReceiver getMessageVersion() {
        int i11 = getSDKEphemeralPublicKey;
        int i12 = (i11 + 27) % 128;
        ChallengeResult = i12;
        ChallengeStatusReceiver challengeStatusReceiver = this.getSDKReferenceNumber;
        if (challengeStatusReceiver != null) {
            int i13 = i11 + 1;
            ChallengeResult = i13 % 128;
            if (i13 % 2 == 0) {
                return challengeStatusReceiver;
            }
            throw null;
        }
        int i14 = i12 + 65;
        getSDKEphemeralPublicKey = i14 % 128;
        if (i14 % 2 != 0) {
            throw atd.aa.getSDKReferenceNumber.CHALLENGE_PRESENTATION_FAILURE.getDeviceData();
        }
        int i15 = 3 / 0;
        throw atd.aa.getSDKReferenceNumber.CHALLENGE_PRESENTATION_FAILURE.getDeviceData();
    }

    public static /* synthetic */ Object getSDKAppID(int i11, Object[] objArr, int i12, int i13, int i14, int i15, int i16) throws Throwable {
        int i17 = ~i14;
        int i18 = i17 | i13;
        int i19 = ~i18;
        int i21 = ~i11;
        int i22 = i19 | (~(i21 | i13));
        int i23 = i18 | i21;
        int i24 = (~(i11 | i13)) | (~(i17 | (~i13)));
        int i25 = (-77725696) * i16;
        int i26 = ((-649461760) * i15) + (175112192 * i12) + i25 + ((-1995296350) * i24) + (1995296350 * i23) + (i22 * (-1995296350)) + (1917570655 * i14) + ((-2073022045) * i13) + 412680192;
        int iC = a0.c(i15, 1761575915, ((-1311665080) * i12) + i13 + i14 + i16);
        int i27 = i23 * (-510);
        int i28 = i24 * 510;
        int i29 = i16 * 1226043599;
        int i31 = i12 * (-858626504);
        int i32 = i15 * 1069087493;
        int iE = a0.e(iC, 1627848704, i32 + i31 + i29 + i28 + i27 + (i22 * 510) + (i14 * 1226043089) + ((i13 * 1226044109) - 1701849991), 739704832, (1783169024 * iC) + i26);
        if (iE == 1) {
            return getDeviceData(objArr);
        }
        if (iE == 2) {
            return AuthenticationRequestParameters(objArr);
        }
        if (iE != 3) {
            Activity activity = (Activity) objArr[0];
            atd.c.getSDKTransactionID getsdktransactionid = (atd.c.getSDKTransactionID) objArr[1];
            ChallengeResult = (getSDKEphemeralPublicKey + 97) % 128;
            Intent sDKReferenceNumber = ChallengeActivity.getSDKReferenceNumber(activity, getsdktransactionid);
            ChallengeResult = (getSDKEphemeralPublicKey + 99) % 128;
            return sDKReferenceNumber;
        }
        ChallengeResultCompleted challengeResultCompleted = (ChallengeResultCompleted) objArr[0];
        ProtocolErrorEvent protocolErrorEvent = (ProtocolErrorEvent) objArr[1];
        challengeResultCompleted.getSDKAppID();
        ChallengeStatusReceiver messageVersion = challengeResultCompleted.getMessageVersion();
        if (messageVersion != null) {
            messageVersion.protocolError(protocolErrorEvent);
            challengeResultCompleted.close();
            ChallengeResult = (getSDKEphemeralPublicKey + 83) % 128;
        }
        ChallengeResult = (getSDKEphemeralPublicKey + 81) % 128;
        return null;
    }

    private Activity getSDKReferenceNumber() throws Throwable {
        int i11 = (ChallengeResult + 113) % 128;
        getSDKEphemeralPublicKey = i11;
        WeakReference<Activity> weakReference = this.getDeviceData;
        try {
            if (weakReference == null) {
                ChallengeResult = (i11 + 79) % 128;
                Object sDKTransactionID = ChallengeResult.getSDKTransactionID(583664806);
                if (sDKTransactionID == null) {
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 1;
                    char cIndexOf = (char) (34643 - TextUtils.indexOf("", "", 0, 0));
                    int i12 = 28 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    Object[] objArr = new Object[1];
                    c(r1[97], (short) 474, (byte) (-$$d[88]), objArr);
                    sDKTransactionID = ChallengeResult.getDeviceData(iIndexOf, cIndexOf, i12, -22936906, false, (String) objArr[0], new Class[0]);
                }
                Object objInvoke = ((Method) sDKTransactionID).invoke(null, null);
                Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(-897560614);
                if (sDKTransactionID2 == null) {
                    int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 1;
                    char modifierMetaStateMask2 = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 34644);
                    int iMyPid = 27 - (Process.myPid() >> 22);
                    byte b8 = $$d[13];
                    Object[] objArr2 = new Object[1];
                    c(b8, (short) (b8 | 91), r1[11], objArr2);
                    sDKTransactionID2 = ChallengeResult.getDeviceData(modifierMetaStateMask, modifierMetaStateMask2, iMyPid, 384321994, false, (String) objArr2[0], new Class[0]);
                }
                return (Activity) ((Method) sDKTransactionID2).invoke(objInvoke, null);
            }
            Activity activity = weakReference.get();
            if (activity != null) {
                return activity;
            }
            Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(583664806);
            if (sDKTransactionID3 == null) {
                int minimumFlingVelocity = ViewConfiguration.getMinimumFlingVelocity() >> 16;
                char c3 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 34642);
                int modifierMetaStateMask3 = 26 - ((byte) KeyEvent.getModifierMetaStateMask());
                Object[] objArr3 = new Object[1];
                c(r1[97], (short) 474, (byte) (-$$d[88]), objArr3);
                sDKTransactionID3 = ChallengeResult.getDeviceData(minimumFlingVelocity, c3, modifierMetaStateMask3, -22936906, false, (String) objArr3[0], new Class[0]);
            }
            Object objInvoke2 = ((Method) sDKTransactionID3).invoke(null, null);
            Object sDKTransactionID4 = ChallengeResult.getSDKTransactionID(-897560614);
            if (sDKTransactionID4 == null) {
                int keyRepeatTimeout = ViewConfiguration.getKeyRepeatTimeout() >> 16;
                char cAlpha = (char) (34643 - Color.alpha(0));
                int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 28;
                byte b11 = $$d[13];
                Object[] objArr4 = new Object[1];
                c(b11, (short) (b11 | 91), r3[11], objArr4);
                sDKTransactionID4 = ChallengeResult.getDeviceData(keyRepeatTimeout, cAlpha, packedPositionChild, 384321994, false, (String) objArr4[0], new Class[0]);
            }
            Activity activity2 = (Activity) ((Method) sDKTransactionID4).invoke(objInvoke2, null);
            int i13 = getSDKEphemeralPublicKey + 1;
            ChallengeResult = i13 % 128;
            if (i13 % 2 == 0) {
                return activity2;
            }
            throw null;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    public static void init$0() {
        $$a = new byte[]{76, -80, -40, -9, 3, -14, 34, 16, -6, -6, -18, 0, 2, -12, 14, -8, 12, -1, 24, -38, 9, 12, -2, -12, 3, -14, 34, 16, -6, -8, -29, 18, -12, -4, 19, -1, -16, 12, -5, 2, 38, 6, 3, -14, 34, 16, -6, 11, -46, 1, 40, 6, -51, 2, 13, 4, -8, -5, 12, 7, 3, -18, 12, -5, 2, 29, -18, -11, -3, 17, -13, 0, 37, -16, -16, 18, -11, 9, -14, 16, -12, 0, 3, -14, 34, 16, -6, 7, -42, 9, 4, -7, 9, -12, 18, -10, 29, -36, 20, -9, 4, 7, 25, -25, -19, 3, -14, 40, -23, -13, 1, 19, -5, 3, 16, -14, -12, 0, 11, -5, 2, -36, 8, -10, 1, 8, -8, 8, 3, 20, -18, -13, -1, 10, -7, 50, -29, -12, 12, -1, -6, 1, 8, 2, 3, -14, 49, -32, -16, 14, 7, -1, 34, -28, -18, 20, -36, 8, -10, 1, 8, -8, 8, 3, 20, -18, -13, -1, 10, -7};
        $$b = AppConstants.GPS_SETTINGS;
    }

    public static void init$1() {
        byte[] bArr = new byte[576];
        System.arraycopy("5¢G¡ë\u000e4²J½ÿ)Ò\u0000û\u0002\u0005ï\tøÿHáÊÿ\n\u0001õø\t\u0004\u0000ë\tøÿ\u001aëòú\u000eðý\"íí\u000fò\u0006ï\rñýÊÿ\n\u0001õø\t\u0004\u0000ë\tøÿ\u001aëòú\u000eðý\"íí\u000fò\u0006ï\rñýë\u000e4²JãÙ\u0003ó\t\u0006ó\u0001í\u0013\u0011ëðü\u0007ö\u001fÜ\u0010þüðþM»\u0000ï\u001f\r÷÷ëýÿñ\u000bõ\tü\u0015×\u0006\tûñ\u0000ï.Ýí\u000b\u0004ü\u001fáë\u0011ë\u000e4µGãÙ\u0003ó\t\u0006ó\u0001í\u0013\u0011ëðü\u0007öNáÊÿ\n\u0001õø\t\u0004\u0000ë\tøÿ\u001aëòú\u000eðý\"íí\u000fò\u0006ï\rñý\u0000ï\u001f\r÷\bÏþ%\u0003ë\u000e4¾>éÙ\u0005óþ\u0005õ\u0005\u0000\u0010Ý\u0011ëý\u0000)åñ\bö\u0005ñLáÊÿ\n\u0001õø\t\u0004\u0000ë\tøÿ\u001aëòú\u000eðý\"íí\u000fò\u0006ï\rñýë\u000e4²JÅ\u0000ï-Ñþ\u0001û,Ýð\u000eï\u0007÷ú\tøÿH»\u0000ï\u001f\r÷\bÏþ%\u0003\u0000ï\u001f\r÷÷ëýÿñ\u000bõ\tü\u0015×\u0006\tûñë\u000e4³IÅ\u0000ï\u001eà\u000fñù\u0010üí\tøÿ\u0019Ý\u0011ëý\u0000M»\u0000ï\u001f\r÷\bÏþ%\u0003ë\u000e4³IéÙ\u0005óþ\u0005õ\u0005\u0000\u0011ëðü\u0007ö'ÕN»\u0000ï\u001f\r÷\bÏþ%\u0003ë\u000e4µGãÙ\u0003ó\t\u0006ó\u0001í\u0013\u0011ëðü\u0007ö,ãöûõ\u0001\u000b?»\u0000ï.Ýí\u000b\u0004ü\u001fáë\u0011\u0000ï\u001f\r÷õà\u000fñù\u0010üí\tøÿ#\u0003ë\u000e4Ç5Å\u0000ï.Ýí\u000b\u0004ü\u001fáë\u0011;»\u0000ï\u001f\r÷\bÏþ%\u0003ë\u000e4²JÅ\u0000ï\u001f\r÷õà\u000fñù\u0010üí\tøÿ#\u0003ë\u000e4ËíBÅ\u0000ï.Ýí\u000b\u0004ü\u001fáë\u0011ë\u000e4³Iºû\u0005ø\tú\u0006\u001eÑþ\u0001ûLáÊÿ\n\u0001õø\t\u0004\u0000ë\tøÿ\u001aëòú\u000eðý\"íí\u000fò\u0006ï\rñý".getBytes(LocalizedMessage.DEFAULT_ENCODING), 0, bArr, 0, 576);
        $$d = bArr;
        $$e = 129;
    }

    public static void init$2() {
        $$c = new byte[]{66, -81, 60, 85};
        $$f = 207;
    }

    @Override // com.adyen.threeds2.ChallengeStatusReceiver
    public final void cancelled() throws Throwable {
        ChallengeResult = (getSDKEphemeralPublicKey + 85) % 128;
        getSDKAppID();
        ChallengeStatusReceiver messageVersion = getMessageVersion();
        if (messageVersion != null) {
            messageVersion.cancelled();
            close();
        }
        int i11 = getSDKEphemeralPublicKey + 23;
        ChallengeResult = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.adyen.threeds2.Transaction
    public final void close() throws Throwable {
        int i11 = ChallengeResult + 7;
        getSDKEphemeralPublicKey = i11 % 128;
        int i12 = i11 % 2;
        List<X509Certificate> list = this.getSDKTransactionID;
        if (i12 == 0) {
            throw null;
        }
        if (list != null) {
            Iterator<X509Certificate> it = list.iterator();
            while (it.hasNext()) {
                atd.bc.ChallengeResultTimeout.getSDKTransactionID(it.next());
            }
            this.getSDKTransactionID.clear();
            this.getSDKTransactionID = null;
        }
        atd.af.AuthenticationRequestParameters authenticationRequestParameters = this.getSDKAppID;
        if (authenticationRequestParameters != null) {
            authenticationRequestParameters.AuthenticationRequestParameters();
            this.getSDKAppID = null;
            ChallengeResult = (getSDKEphemeralPublicKey + 69) % 128;
        }
        com.adyen.threeds2.AuthenticationRequestParameters authenticationRequestParameters2 = this.AuthenticationRequestParameters;
        if (authenticationRequestParameters2 instanceof atd.ak.AuthenticationRequestParameters) {
            atd.ak.AuthenticationRequestParameters.getSDKAppID(882022779, ChallengeResult.AuthenticationRequestParameters.AuthenticationRequestParameters(), new Object[]{(atd.ak.AuthenticationRequestParameters) authenticationRequestParameters2}, ChallengeResult.AuthenticationRequestParameters.AuthenticationRequestParameters(), ChallengeResult.AuthenticationRequestParameters.AuthenticationRequestParameters(), -882022777, ChallengeResult.AuthenticationRequestParameters.AuthenticationRequestParameters());
            ChallengeResult = (getSDKEphemeralPublicKey + 31) % 128;
        }
        this.AuthenticationRequestParameters = null;
        WeakReference<Activity> weakReference = this.getDeviceData;
        if (weakReference != null) {
            weakReference.clear();
            this.getDeviceData = null;
        }
        this.getSDKReferenceNumber = null;
        atd.d.getSDKTransactionID getsdktransactionid = this.getMessageVersion;
        if (getsdktransactionid != null) {
            try {
                Object sDKTransactionID = ChallengeResult.getSDKTransactionID(-697278693);
                if (sDKTransactionID == null) {
                    int i13 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    char c3 = (char) (34644 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                    int iMyTid = 27 - (Process.myTid() >> 22);
                    byte[] bArr = $$d;
                    byte b8 = bArr[13];
                    Object[] objArr = new Object[1];
                    c(b8, (short) (b8 | 394), (byte) (-bArr[276]), objArr);
                    sDKTransactionID = ChallengeResult.getDeviceData(i13, c3, iMyTid, 169367819, false, (String) objArr[0], new Class[0]);
                }
                ((Method) sDKTransactionID).invoke(getsdktransactionid, null);
                this.getMessageVersion = null;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        atd.at.getSDKAppID getsdkappid = this.BuildConfig;
        if (getsdkappid != null) {
            atd.at.getSDKAppID.getSDKTransactionID(getSDKAppID.getSDKTransactionID.AuthenticationRequestParameters(), 1839906561, getSDKAppID.getSDKTransactionID.AuthenticationRequestParameters(), -1839906560, getSDKAppID.getSDKTransactionID.AuthenticationRequestParameters(), getSDKAppID.getSDKTransactionID.AuthenticationRequestParameters(), new Object[]{getsdkappid});
            this.BuildConfig = null;
        }
    }

    @Override // com.adyen.threeds2.ChallengeStatusReceiver
    public final void completed(CompletionEvent completionEvent) throws Throwable {
        int i11 = getSDKEphemeralPublicKey + 41;
        ChallengeResult = i11 % 128;
        if (i11 % 2 != 0) {
            getSDKAppID();
            getMessageVersion();
            throw null;
        }
        getSDKAppID();
        ChallengeStatusReceiver messageVersion = getMessageVersion();
        if (messageVersion != null) {
            messageVersion.completed(completionEvent);
            close();
            getSDKEphemeralPublicKey = (ChallengeResult + 59) % 128;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0b25  */
    @Override // com.adyen.threeds2.Transaction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void doChallenge(android.app.Activity r44, com.adyen.threeds2.parameters.ChallengeParameters r45, com.adyen.threeds2.ChallengeStatusReceiver r46, int r47) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.e.ChallengeResultCompleted.doChallenge(android.app.Activity, com.adyen.threeds2.parameters.ChallengeParameters, com.adyen.threeds2.ChallengeStatusReceiver, int):void");
    }

    @Override // com.adyen.threeds2.Transaction
    public final com.adyen.threeds2.AuthenticationRequestParameters getAuthenticationRequestParameters() {
        return (com.adyen.threeds2.AuthenticationRequestParameters) getSDKAppID(ChallengeResultTimeout.getDeviceData.getDeviceData(), new Object[]{this}, ChallengeResultTimeout.getDeviceData.getDeviceData(), 674819315, -674819313, ChallengeResultTimeout.getDeviceData.getDeviceData(), ChallengeResultTimeout.getDeviceData.getDeviceData());
    }

    @Override // com.adyen.threeds2.Transaction
    public final ProgressDialog getProgressView(Activity activity) throws Throwable {
        ChallengeResult = (getSDKEphemeralPublicKey + 65) % 128;
        atd.bc.getSDKEphemeralPublicKey.getSDKAppID(activity, atd.aa.getDeviceData.CURRENT_ACTIVITY);
        if (this.BuildConfig == null) {
            this.BuildConfig = new atd.at.getSDKAppID(activity, new DialogInterface.OnDismissListener() { // from class: atd.e.a
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f4827a.getDeviceData(dialogInterface);
                }
            });
        }
        atd.at.getSDKAppID getsdkappid = this.BuildConfig;
        int i11 = ChallengeResult + 85;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 45 / 0;
        }
        return getsdkappid;
    }

    @Override // atd.e.getSDKReferenceNumber
    public final void getSDKTransactionID() throws Throwable {
        getSDKEphemeralPublicKey = (ChallengeResult + 51) % 128;
        getDeviceData();
        ChallengeResult = (getSDKEphemeralPublicKey + 11) % 128;
    }

    @Override // com.adyen.threeds2.ChallengeStatusReceiver
    public final void protocolError(ProtocolErrorEvent protocolErrorEvent) throws Throwable {
        getSDKAppID(ChallengeResultTimeout.getDeviceData.getDeviceData(), new Object[]{this, protocolErrorEvent}, ChallengeResultTimeout.getDeviceData.getDeviceData(), -1064894253, 1064894256, ChallengeResultTimeout.getDeviceData.getDeviceData(), ChallengeResultTimeout.getDeviceData.getDeviceData());
    }

    @Override // com.adyen.threeds2.ChallengeStatusReceiver
    public final void runtimeError(RuntimeErrorEvent runtimeErrorEvent) throws Throwable {
        int i11 = getSDKEphemeralPublicKey + 51;
        ChallengeResult = i11 % 128;
        if (i11 % 2 != 0) {
            getSDKAppID();
            getMessageVersion();
            throw null;
        }
        getSDKAppID();
        ChallengeStatusReceiver messageVersion = getMessageVersion();
        if (messageVersion != null) {
            messageVersion.runtimeError(runtimeErrorEvent);
            close();
            ChallengeResult = (getSDKEphemeralPublicKey + 27) % 128;
        }
    }

    @Override // com.adyen.threeds2.ChallengeStatusReceiver
    public final void timedout() throws Throwable {
        getSDKAppID();
        ChallengeStatusReceiver messageVersion = getMessageVersion();
        if (messageVersion != null) {
            getSDKEphemeralPublicKey = (ChallengeResult + 63) % 128;
            messageVersion.timedout();
            close();
            getSDKEphemeralPublicKey = (ChallengeResult + 59) % 128;
        }
        int i11 = getSDKEphemeralPublicKey + 81;
        ChallengeResult = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    @Override // atd.e.getSDKReferenceNumber
    public final void AuthenticationRequestParameters(atd.c.getSDKTransactionID getsdktransactionid) throws Throwable {
        ChallengeResult = (getSDKEphemeralPublicKey + 85) % 128;
        getDeviceData(getsdktransactionid);
        int i11 = getSDKEphemeralPublicKey + 71;
        ChallengeResult = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    private static Intent AuthenticationRequestParameters(Activity activity) {
        int i11 = ChallengeResult + 83;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 != 0) {
            return ChallengeActivity.AuthenticationRequestParameters(activity);
        }
        ChallengeActivity.AuthenticationRequestParameters(activity);
        throw null;
    }

    public static void AuthenticationRequestParameters() {
        ChallengeResultCancelled = 5348490317045219013L;
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
        ChallengeResultCompleted challengeResultCompleted = (ChallengeResultCompleted) objArr[0];
        int i11 = ChallengeResult + 55;
        getSDKEphemeralPublicKey = i11 % 128;
        int i12 = i11 % 2;
        com.adyen.threeds2.AuthenticationRequestParameters authenticationRequestParameters = challengeResultCompleted.AuthenticationRequestParameters;
        if (i12 != 0) {
            return authenticationRequestParameters;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0844  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x08b5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0975  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x09d3  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0a2b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0afe  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0c81  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0cd8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0dc1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0e19  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0e68  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0f22  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0f80  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0ff5  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x1117  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x117c  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x1259  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x12af  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x1300  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x13b9  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x1537  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x158d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x06b2  */
    @Override // com.adyen.threeds2.Transaction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void doChallenge(android.app.Activity r39, com.adyen.threeds2.parameters.ChallengeParameters r40, final com.adyen.threeds2.ChallengeStatusHandler r41, int r42) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.e.ChallengeResultCompleted.doChallenge(android.app.Activity, com.adyen.threeds2.parameters.ChallengeParameters, com.adyen.threeds2.ChallengeStatusHandler, int):void");
    }

    private void getSDKAppID() throws Throwable {
        getSDKEphemeralPublicKey = (ChallengeResult + 117) % 128;
        Activity sDKReferenceNumber = getSDKReferenceNumber();
        if (sDKReferenceNumber == null) {
            int i11 = getSDKEphemeralPublicKey + 89;
            ChallengeResult = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 78 / 0;
                return;
            }
            return;
        }
        sDKReferenceNumber.startActivity(getSDKReferenceNumber(sDKReferenceNumber));
    }

    private atd.f.AuthenticationRequestParameters getSDKAppID(String str) throws InvalidInputException {
        try {
            atd.al.getSDKReferenceNumber getsdkreferencenumberAuthenticationRequestParameters = atd.al.getSDKReferenceNumber.AuthenticationRequestParameters(str, atd.ai.AuthenticationRequestParameters.getSDKAppID);
            getsdkreferencenumberAuthenticationRequestParameters.getSDKTransactionID(this.getSDKTransactionID);
            JSONObject messageVersion = getsdkreferencenumberAuthenticationRequestParameters.getSDKAppID().getMessageVersion();
            atd.f.AuthenticationRequestParameters authenticationRequestParameters = new atd.f.AuthenticationRequestParameters(messageVersion);
            getsdkreferencenumberAuthenticationRequestParameters.getDeviceData();
            int deviceData = atd.ak.getDeviceData.getDeviceData();
            int deviceData2 = atd.ak.getDeviceData.getDeviceData();
            atd.bc.getDeviceData.getSDKTransactionID(atd.ak.getDeviceData.getDeviceData(), deviceData2, atd.ak.getDeviceData.getDeviceData(), deviceData, -1676234569, new Object[]{messageVersion}, 1676234570);
            int i11 = ChallengeResult + 93;
            getSDKEphemeralPublicKey = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 32 / 0;
            }
            return authenticationRequestParameters;
        } catch (atd.ac.getSDKAppID | SDKRuntimeException | JSONException unused) {
            throw atd.aa.getDeviceData.CHALLENGE_PARAMETERS.getSDKTransactionID();
        }
    }

    private void getDeviceData() throws Throwable {
        Activity sDKReferenceNumber = getSDKReferenceNumber();
        if (sDKReferenceNumber == null) {
            int i11 = getSDKEphemeralPublicKey + 101;
            ChallengeResult = i11 % 128;
            if (i11 % 2 != 0) {
                runtimeError(atd.aa.getSDKTransactionID.ACTIVITY_REFERENCE_MISSING.AuthenticationRequestParameters());
                int i12 = 61 / 0;
                return;
            } else {
                runtimeError(atd.aa.getSDKTransactionID.ACTIVITY_REFERENCE_MISSING.AuthenticationRequestParameters());
                return;
            }
        }
        if (ChallengeActivity.getSDKReferenceNumber()) {
            return;
        }
        int i13 = ChallengeResult + 29;
        getSDKEphemeralPublicKey = i13 % 128;
        if (i13 % 2 != 0) {
            sDKReferenceNumber.startActivity(AuthenticationRequestParameters(sDKReferenceNumber));
        } else {
            sDKReferenceNumber.startActivity(AuthenticationRequestParameters(sDKReferenceNumber));
            throw null;
        }
    }

    private void getDeviceData(atd.c.getSDKTransactionID getsdktransactionid) throws Throwable {
        getSDKEphemeralPublicKey = (ChallengeResult + 107) % 128;
        Activity sDKReferenceNumber = getSDKReferenceNumber();
        if (sDKReferenceNumber == null) {
            int i11 = ChallengeResult + 25;
            getSDKEphemeralPublicKey = i11 % 128;
            if (i11 % 2 != 0) {
                runtimeError(atd.aa.getSDKTransactionID.ACTIVITY_REFERENCE_MISSING.AuthenticationRequestParameters());
                return;
            } else {
                runtimeError(atd.aa.getSDKTransactionID.ACTIVITY_REFERENCE_MISSING.AuthenticationRequestParameters());
                throw null;
            }
        }
        atd.at.getSDKAppID getsdkappid = this.BuildConfig;
        if (getsdkappid != null) {
            int iAuthenticationRequestParameters = getSDKAppID.getSDKTransactionID.AuthenticationRequestParameters();
            int iAuthenticationRequestParameters2 = getSDKAppID.getSDKTransactionID.AuthenticationRequestParameters();
            int iAuthenticationRequestParameters3 = getSDKAppID.getSDKTransactionID.AuthenticationRequestParameters();
            atd.at.getSDKAppID.getSDKTransactionID(iAuthenticationRequestParameters, 1839906561, iAuthenticationRequestParameters2, -1839906560, getSDKAppID.getSDKTransactionID.AuthenticationRequestParameters(), iAuthenticationRequestParameters3, new Object[]{getsdkappid});
        }
        sDKReferenceNumber.startActivity((Intent) getSDKAppID(ChallengeResultTimeout.getDeviceData.getDeviceData(), new Object[]{sDKReferenceNumber, getsdktransactionid}, ChallengeResultTimeout.getDeviceData.getDeviceData(), -1749306481, 1749306481, ChallengeResultTimeout.getDeviceData.getDeviceData(), ChallengeResultTimeout.getDeviceData.getDeviceData()));
        int i12 = getSDKEphemeralPublicKey + 21;
        ChallengeResult = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getDeviceData(DialogInterface dialogInterface) {
        int i11 = getSDKEphemeralPublicKey + 99;
        int i12 = i11 % 128;
        ChallengeResult = i12;
        int i13 = i11 % 2;
        this.BuildConfig = null;
        if (i13 != 0) {
            throw null;
        }
        int i14 = i12 + 15;
        getSDKEphemeralPublicKey = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    private static Intent getSDKReferenceNumber(Activity activity) {
        ChallengeResult = (getSDKEphemeralPublicKey + 59) % 128;
        Intent sDKReferenceNumber = ChallengeActivity.getSDKReferenceNumber(activity);
        int i11 = getSDKEphemeralPublicKey + 85;
        ChallengeResult = i11 % 128;
        if (i11 % 2 == 0) {
            return sDKReferenceNumber;
        }
        throw null;
    }
}
