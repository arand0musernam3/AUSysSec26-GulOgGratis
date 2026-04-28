package atd.c;

import android.os.Process;
import atd.n.getSDKReferenceNumber;
import java.util.List;
import java.util.Locale;
import n90.b0;
import n90.e;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BuildConfig {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ChallengeResultCancelled;
    private static long getDeviceData;
    private static int getMessageVersion;
    private String AuthenticationRequestParameters;
    private List<getSDKEphemeralPublicKey> getSDKAppID;
    private final atd.ao.getSDKReferenceNumber getSDKReferenceNumber;
    private atd.h.getSDKAppID getSDKTransactionID;

    /* JADX INFO: renamed from: atd.c.BuildConfig$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static /* synthetic */ class AnonymousClass3 {
        private static int AuthenticationRequestParameters = 0;
        private static int getSDKAppID = 1;
        static final /* synthetic */ int[] getSDKTransactionID;

        static {
            int[] iArr = new int[atd.h.getSDKAppID.values().length];
            getSDKTransactionID = iArr;
            try {
                iArr[atd.h.getSDKAppID.CHALLENGE_RESPONSE.ordinal()] = 1;
                int i11 = getSDKAppID;
                AuthenticationRequestParameters = a0.d(i11 ^ 3, ~((i11 & 3) << 1), 1, 128);
            } catch (NoSuchFieldError unused) {
            }
            try {
                getSDKTransactionID[atd.h.getSDKAppID.ERROR.ordinal()] = 2;
                int i12 = AuthenticationRequestParameters;
                int i13 = i12 ^ 89;
                int i14 = (((i12 & 89) | i13) << 1) - i13;
                getSDKAppID = i14 % 128;
                if (i14 % 2 == 0) {
                    throw null;
                }
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, byte r8) {
        /*
            int r7 = r7 * 2
            int r7 = 99 - r7
            int r8 = r8 * 2
            int r8 = r8 + 4
            byte[] r0 = atd.c.BuildConfig.$$a
            int r6 = r6 * 3
            int r6 = 1 - r6
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r8]
        L26:
            int r8 = r8 + 1
            int r7 = r7 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.c.BuildConfig.$$c(int, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getMessageVersion = 0;
        ChallengeResultCancelled = 1;
        getDeviceData = 4070617853338327695L;
    }

    public BuildConfig(b0 b0Var) throws Throwable {
        this.getSDKTransactionID = atd.h.getSDKAppID.getDeviceData(atd.d.getSDKEphemeralPublicKey.getSDKTransactionID(b0Var, atd.am.getSDKReferenceNumber.MESSAGE_TYPE).getSDKAppID());
        this.AuthenticationRequestParameters = atd.d.getSDKEphemeralPublicKey.getSDKTransactionID(b0Var, atd.am.getSDKReferenceNumber.MESSAGE_VERSION).getSDKAppID();
        this.getSDKReferenceNumber = new atd.ao.getSDKReferenceNumber(atd.d.getSDKEphemeralPublicKey.ChallengeResultCancelled(b0Var, atd.am.getSDKReferenceNumber.SDK_TRANSACTION_ID).getSDKAppID(), atd.d.getSDKEphemeralPublicKey.ChallengeResultCancelled(b0Var, atd.am.getSDKReferenceNumber.THREEDS_SERVER_TRANSACTION_ID).getSDKAppID(), getDeviceData(b0Var, atd.am.getSDKReferenceNumber.ACS_TRANSACTION_ID), null);
        e sDKAppID = atd.d.getSDKEphemeralPublicKey.getSDKEphemeralPublicKey(b0Var, atd.am.getSDKReferenceNumber.MESSAGE_EXTENSION).getSDKAppID();
        List<getSDKEphemeralPublicKey> deviceData = sDKAppID != null ? getSDKEphemeralPublicKey.getDeviceData(sDKAppID) : null;
        this.getSDKAppID = deviceData;
        if (deviceData == null || deviceData.size() <= 10) {
            return;
        }
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[1];
        a("̳\uf34b\ue38e펎숆뉉ꊛ鋋腟煙憁凲䀦の₾უܸ\uf77a\ue7a2ힾ왳똽ꛁ镋蔁", 61507 - (Process.myTid() >> 22), objArr);
        throw new atd.ac.getSDKAppID(String.format(locale, ((String) objArr[0]).intern(), Integer.valueOf(this.getSDKAppID.size())), atd.h.getSDKReferenceNumber.DATA_ELEMENT_INVALID_FORMAT, atd.am.getSDKEphemeralPublicKey.TOO_MANY_MESSAGE_EXTENSIONS);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        if (r4 == 2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        r0 = new atd.c.AuthenticationRequestParameters(r6);
        r6 = atd.c.BuildConfig.getMessageVersion + 39;
        atd.c.BuildConfig.ChallengeResultCancelled = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
    
        if ((r6 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x005a, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        r1 = new java.lang.StringBuilder();
        r3 = new java.lang.Object[1];
        a("̮왈覓䳅ᘏ\ud94b鲅枀⤝\uec4b랞竜㰄݄쪚跍块ᩂ\udd8cꃄ樖ⴈ\uf0d1", 50497 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), r3);
        r1.append(((java.lang.String) r3[0]).intern());
        r1.append(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008e, code lost:
    
        throw new atd.ac.getSDKAppID(r1.toString(), atd.h.getSDKReferenceNumber.MESSAGE_RECEIVED_INVALID, atd.am.getSDKEphemeralPublicKey.INVALID_MESSAGE_TYPE);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        if (r4 == 2) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static atd.c.BuildConfig AuthenticationRequestParameters(n90.b0 r6) throws java.lang.Throwable {
        /*
            int r0 = atd.c.BuildConfig.ChallengeResultCancelled
            int r0 = r0 + 85
            int r1 = r0 % 128
            atd.c.BuildConfig.getMessageVersion = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L2e
            atd.am.getSDKReferenceNumber r0 = atd.am.getSDKReferenceNumber.MESSAGE_TYPE
            atd.am.getSDKTransactionID r0 = atd.d.getSDKEphemeralPublicKey.getSDKTransactionID(r6, r0)
            java.lang.Object r0 = r0.getSDKAppID()
            java.lang.String r0 = (java.lang.String) r0
            int[] r4 = atd.c.BuildConfig.AnonymousClass3.getSDKTransactionID
            atd.h.getSDKAppID r5 = atd.h.getSDKAppID.getDeviceData(r0)
            int r5 = r5.ordinal()
            r4 = r4[r5]
            r5 = 82
            int r5 = r5 / r2
            if (r4 == r3) goto L8f
            if (r4 != r1) goto L5d
            goto L4a
        L2e:
            atd.am.getSDKReferenceNumber r0 = atd.am.getSDKReferenceNumber.MESSAGE_TYPE
            atd.am.getSDKTransactionID r0 = atd.d.getSDKEphemeralPublicKey.getSDKTransactionID(r6, r0)
            java.lang.Object r0 = r0.getSDKAppID()
            java.lang.String r0 = (java.lang.String) r0
            int[] r4 = atd.c.BuildConfig.AnonymousClass3.getSDKTransactionID
            atd.h.getSDKAppID r5 = atd.h.getSDKAppID.getDeviceData(r0)
            int r5 = r5.ordinal()
            r4 = r4[r5]
            if (r4 == r3) goto L8f
            if (r4 != r1) goto L5d
        L4a:
            atd.c.AuthenticationRequestParameters r0 = new atd.c.AuthenticationRequestParameters
            r0.<init>(r6)
            int r6 = atd.c.BuildConfig.getMessageVersion
            int r6 = r6 + 39
            int r2 = r6 % 128
            atd.c.BuildConfig.ChallengeResultCancelled = r2
            int r6 = r6 % r1
            if (r6 == 0) goto L5b
            return r0
        L5b:
            r6 = 0
            throw r6
        L5d:
            atd.ac.getSDKAppID r6 = new atd.ac.getSDKAppID
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r4 = android.view.ViewConfiguration.getMaximumDrawingCacheSize()
            int r4 = r4 >> 24
            r5 = 50497(0xc541, float:7.0761E-41)
            int r5 = r5 - r4
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "̮왈覓䳅ᘏ\ud94b鲅枀⤝\uec4b랞竜㰄݄쪚跍块ᩂ\udd8cꃄ樖ⴈ\uf0d1"
            a(r4, r5, r3)
            r2 = r3[r2]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.intern()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            atd.h.getSDKReferenceNumber r1 = atd.h.getSDKReferenceNumber.MESSAGE_RECEIVED_INVALID
            atd.am.getSDKEphemeralPublicKey r2 = atd.am.getSDKEphemeralPublicKey.INVALID_MESSAGE_TYPE
            r6.<init>(r0, r1, r2)
            throw r6
        L8f:
            atd.c.getDeviceData r0 = new atd.c.getDeviceData
            r0.<init>(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.c.BuildConfig.AuthenticationRequestParameters(n90.b0):atd.c.BuildConfig");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(java.lang.String r21, int r22, java.lang.Object[] r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.c.BuildConfig.a(java.lang.String, int, java.lang.Object[]):void");
    }

    public static void init$0() {
        $$a = new byte[]{57, -81, -39, 15};
        $$b = 90;
    }

    public abstract boolean AuthenticationRequestParameters();

    public void BuildConfig() {
        this.getSDKTransactionID = null;
        this.AuthenticationRequestParameters = null;
        Object[] objArr = {this.getSDKReferenceNumber};
        int sDKReferenceNumber = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber2 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        atd.ao.getSDKReferenceNumber.getSDKAppID(sDKReferenceNumber, 1724941056, getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), -1724941056, sDKReferenceNumber2, objArr);
        List<getSDKEphemeralPublicKey> list = this.getSDKAppID;
        if (list != null) {
            for (getSDKEphemeralPublicKey getsdkephemeralpublickey : list) {
                ChallengeResultCancelled = (getMessageVersion + 113) % 128;
                if (getsdkephemeralpublickey != null) {
                    int i11 = ChallengeResultCancelled + 63;
                    getMessageVersion = i11 % 128;
                    if (i11 % 2 != 0) {
                        getsdkephemeralpublickey.ChallengeResult();
                        throw null;
                    }
                    getsdkephemeralpublickey.ChallengeResult();
                }
                getMessageVersion = (ChallengeResultCancelled + 31) % 128;
            }
            this.getSDKAppID.clear();
            this.getSDKAppID = null;
        }
    }

    public final atd.ao.getSDKReferenceNumber ChallengeResult() {
        int i11 = getMessageVersion + 97;
        ChallengeResultCancelled = i11 % 128;
        int i12 = i11 % 2;
        atd.ao.getSDKReferenceNumber getsdkreferencenumber = this.getSDKReferenceNumber;
        if (i12 != 0) {
            return getsdkreferencenumber;
        }
        throw null;
    }

    public final String ChallengeResultCancelled() {
        int i11 = getMessageVersion;
        String str = this.AuthenticationRequestParameters;
        ChallengeResultCancelled = (i11 + 57) % 128;
        return str;
    }

    public abstract String getDeviceData(b0 b0Var, atd.am.getSDKReferenceNumber getsdkreferencenumber) throws atd.ac.getSDKAppID;

    public final atd.h.getSDKAppID getMessageVersion() {
        int i11 = (ChallengeResultCancelled + 113) % 128;
        getMessageVersion = i11;
        atd.h.getSDKAppID getsdkappid = this.getSDKTransactionID;
        ChallengeResultCancelled = (i11 + 83) % 128;
        return getsdkappid;
    }
}
