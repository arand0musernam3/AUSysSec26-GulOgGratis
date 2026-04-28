package atd.ao;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import atd.bb.completed;
import atd.bc.getSDKTransactionID;
import atd.e.ChallengeResult;
import atd.n.getSDKReferenceNumber;
import atd.z.getSDKAppID;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0013\u001a\u00020\u0000J\u0006\u0010\u0014\u001a\u00020\u0015R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/adyen/threeds2/internal/result/models/TransactionIdentifiers;", "", "sdkTransactionId", "", "serverTransactionId", "acsTransactionId", "acsReferenceNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "_sdkTransactionId", "Lcom/adyen/threeds2/internal/util/DestroyableString;", "getSdkTransactionId", "()Ljava/lang/String;", "_serverTransactionId", "getServerTransactionId", "_acsTransactionId", "getAcsTransactionId", "_acsReferenceNumber", "getAcsReferenceNumber", "copy", "destroy", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTransactionIdentifiers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionIdentifiers.kt\ncom/adyen/threeds2/internal/result/models/TransactionIdentifiers\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,42:1\n1#2:43\n*E\n"})
public final class getSDKReferenceNumber {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10;
    private static int $11;
    private static long AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int getMessageVersion;

    @Nullable
    private final atd.bc.AuthenticationRequestParameters getDeviceData;

    @Nullable
    private final atd.bc.AuthenticationRequestParameters getSDKAppID;

    @Nullable
    private final atd.bc.AuthenticationRequestParameters getSDKReferenceNumber;

    @Nullable
    private final atd.bc.AuthenticationRequestParameters getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(short r7, int r8, int r9) {
        /*
            int r8 = r8 * 4
            int r8 = r8 + 1
            int r7 = r7 * 3
            int r7 = 120 - r7
            byte[] r0 = atd.ao.getSDKReferenceNumber.$$c
            int r9 = r9 * 4
            int r9 = 3 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r0
            r4 = r2
            r0 = r9
            goto L2d
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r0
            r0 = r9
            r9 = r3
            r3 = r6
        L2d:
            int r9 = -r9
            int r7 = r7 + r9
            r9 = r0
            r0 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ao.getSDKReferenceNumber.$$e(short, int, int):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getMessageVersion = 0;
        BuildConfig = 1;
        AuthenticationRequestParameters = 3418618998705522115L;
    }

    public getSDKReferenceNumber(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.getSDKAppID = str != null ? new atd.bc.AuthenticationRequestParameters(str) : null;
        this.getDeviceData = str2 != null ? new atd.bc.AuthenticationRequestParameters(str2) : null;
        this.getSDKTransactionID = str3 != null ? new atd.bc.AuthenticationRequestParameters(str3) : null;
        this.getSDKReferenceNumber = str4 != null ? new atd.bc.AuthenticationRequestParameters(str4) : null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0053, code lost:
    
        r1 = 17 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0057, code lost:
    
        r8 = r2 ^ 69;
        r0 = (r2 & 69) << 1;
        atd.ao.getSDKReferenceNumber.getMessageVersion = ((r8 & r0) + (r8 | r0)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0066, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (r8 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
    
        if (r8 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        r4 = atd.z.getSDKAppID.getSDKTransactionID.getSDKAppID();
        r7 = atd.z.getSDKAppID.getSDKTransactionID.getSDKAppID();
        r8 = (java.lang.String) atd.bc.AuthenticationRequestParameters.getDeviceData(atd.z.getSDKAppID.getSDKTransactionID.getSDKAppID(), -600043858, 600043858, r4, new java.lang.Object[]{r8}, atd.z.getSDKAppID.getSDKTransactionID.getSDKAppID(), r7);
        r1 = atd.ao.getSDKReferenceNumber.getMessageVersion;
        r2 = ((r1 | 59) << 1) - (r1 ^ 59);
        atd.ao.getSDKReferenceNumber.BuildConfig = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0051, code lost:
    
        if ((r2 % 2) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object AuthenticationRequestParameters(java.lang.Object[] r8) {
        /*
            r0 = 0
            r8 = r8[r0]
            atd.ao.getSDKReferenceNumber r8 = (atd.ao.getSDKReferenceNumber) r8
            int r1 = atd.ao.getSDKReferenceNumber.getMessageVersion
            r2 = r1 & 65
            int r3 = ~r2
            r1 = r1 | 65
            r1 = r1 & r3
            int r2 = r2 << 1
            int r1 = r1 + r2
            int r2 = r1 % 128
            atd.ao.getSDKReferenceNumber.BuildConfig = r2
            int r1 = r1 % 2
            atd.bc.AuthenticationRequestParameters r8 = r8.getSDKTransactionID
            if (r1 != 0) goto L20
            r1 = 11
            int r1 = r1 / r0
            if (r8 == 0) goto L57
            goto L22
        L20:
            if (r8 == 0) goto L57
        L22:
            java.lang.Object[] r5 = new java.lang.Object[]{r8}
            int r4 = atd.z.getSDKAppID.getSDKTransactionID.getSDKAppID()
            int r7 = atd.z.getSDKAppID.getSDKTransactionID.getSDKAppID()
            int r1 = atd.z.getSDKAppID.getSDKTransactionID.getSDKAppID()
            int r6 = atd.z.getSDKAppID.getSDKTransactionID.getSDKAppID()
            r3 = 600043858(0x23c3f152, float:2.1244145E-17)
            r2 = -600043858(0xffffffffdc3c0eae, float:-2.1173374E17)
            java.lang.Object r8 = atd.bc.AuthenticationRequestParameters.getDeviceData(r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r8 = (java.lang.String) r8
            int r1 = atd.ao.getSDKReferenceNumber.getMessageVersion
            r2 = r1 | 59
            int r2 = r2 << 1
            r1 = r1 ^ 59
            int r2 = r2 - r1
            int r1 = r2 % 128
            atd.ao.getSDKReferenceNumber.BuildConfig = r1
            int r2 = r2 % 2
            if (r2 != 0) goto L56
            r1 = 17
            int r1 = r1 / r0
        L56:
            return r8
        L57:
            r8 = r2 ^ 69
            r0 = r2 & 69
            int r0 = r0 << 1
            r1 = r8 & r0
            r8 = r8 | r0
            int r1 = r1 + r8
            int r1 = r1 % 128
            atd.ao.getSDKReferenceNumber.getMessageVersion = r1
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ao.getSDKReferenceNumber.AuthenticationRequestParameters(java.lang.Object[]):java.lang.Object");
    }

    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        char c3;
        int i12 = $10 + 99;
        $11 = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        completed completedVar = new completed();
        char[] sDKTransactionID = completed.getSDKTransactionID(AuthenticationRequestParameters ^ 2436480605514729170L, charArray, i11);
        completedVar.getSDKTransactionID = 4;
        while (true) {
            int i13 = completedVar.getSDKTransactionID;
            if (i13 >= sDKTransactionID.length) {
                objArr[0] = new String(sDKTransactionID, 4, sDKTransactionID.length - 4);
                return;
            }
            $11 = ($10 + 57) % 128;
            int i14 = i13 - 4;
            completedVar.getSDKAppID = i14;
            try {
                Object[] objArr2 = {Long.valueOf(sDKTransactionID[i13] ^ sDKTransactionID[i13 % 4]), Long.valueOf(i14), Long.valueOf(AuthenticationRequestParameters)};
                Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(2011691457);
                if (sDKTransactionID2 == null) {
                    int iResolveSize = 2774 - View.resolveSize(0, 0);
                    char cRgb = (char) ((-16764156) - Color.rgb(0, 0, 0));
                    int mirror = 'I' - AndroidCharacter.getMirror('0');
                    byte b8 = (byte) 0;
                    byte b11 = b8;
                    c3 = 1;
                    String str$$e = $$e(b8, b11, b11);
                    Class cls = Long.TYPE;
                    sDKTransactionID2 = ChallengeResult.getDeviceData(iResolveSize, cRgb, mirror, -1416626223, false, str$$e, new Class[]{cls, cls, cls});
                } else {
                    c3 = 1;
                }
                sDKTransactionID[i13] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr2)).charValue();
                Object[] objArr3 = new Object[2];
                objArr3[c3] = completedVar;
                objArr3[0] = completedVar;
                Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(-721583866);
                if (sDKTransactionID3 == null) {
                    sDKTransactionID3 = ChallengeResult.getDeviceData(409 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), (-16777186) - Color.rgb(0, 0, 0), 144017174, false, "y", new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID3).invoke(null, objArr3);
                $11 = ($10 + 33) % 128;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(byte r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 104
            byte[] r0 = atd.ao.getSDKReferenceNumber.$$a
            int r6 = r6 * 2
            int r1 = r6 + 4
            int r5 = r5 * 2
            int r5 = r5 + 4
            byte[] r1 = new byte[r1]
            int r6 = r6 + 3
            r2 = 0
            if (r0 != 0) goto L19
            r7 = r5
            r4 = r6
            r3 = r2
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r5]
        L2b:
            int r4 = -r4
            int r5 = r5 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-2)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ao.getSDKReferenceNumber.b(byte, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005e, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0060, code lost:
    
        atd.ao.getSDKReferenceNumber.BuildConfig = (r1 + 1) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0066, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
    
        if (r11 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r11 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        atd.ao.getSDKReferenceNumber.BuildConfig = ((r1 & 63) + (r1 | 63)) % 128;
        r7 = atd.z.getSDKAppID.getSDKTransactionID.getSDKAppID();
        r10 = atd.z.getSDKAppID.getSDKTransactionID.getSDKAppID();
        r11 = (java.lang.String) atd.bc.AuthenticationRequestParameters.getDeviceData(atd.z.getSDKAppID.getSDKTransactionID.getSDKAppID(), -600043858, 600043858, r7, new java.lang.Object[]{r11}, atd.z.getSDKAppID.getSDKTransactionID.getSDKAppID(), r10);
        r0 = atd.ao.getSDKReferenceNumber.BuildConfig;
        r1 = r0 & 17;
        r1 = r1 + ((r0 ^ 17) | r1);
        atd.ao.getSDKReferenceNumber.getMessageVersion = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005c, code lost:
    
        if ((r1 % 2) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object getDeviceData(java.lang.Object[] r11) {
        /*
            r0 = 0
            r11 = r11[r0]
            atd.ao.getSDKReferenceNumber r11 = (atd.ao.getSDKReferenceNumber) r11
            int r1 = atd.ao.getSDKReferenceNumber.getMessageVersion
            r2 = r1 | 95
            int r2 = r2 << 1
            r3 = r1 & (-96)
            int r4 = ~r1
            r4 = r4 & 95
            r3 = r3 | r4
            int r2 = r2 - r3
            int r3 = r2 % 128
            atd.ao.getSDKReferenceNumber.BuildConfig = r3
            int r2 = r2 % 2
            r3 = 0
            atd.bc.AuthenticationRequestParameters r11 = r11.getSDKAppID
            if (r2 != 0) goto L23
            r2 = 64
            int r2 = r2 / r0
            if (r11 == 0) goto L60
            goto L25
        L23:
            if (r11 == 0) goto L60
        L25:
            r0 = r1 & 63
            r1 = r1 | 63
            int r0 = r0 + r1
            int r0 = r0 % 128
            atd.ao.getSDKReferenceNumber.BuildConfig = r0
            java.lang.Object[] r8 = new java.lang.Object[]{r11}
            int r7 = atd.z.getSDKAppID.getSDKTransactionID.getSDKAppID()
            int r10 = atd.z.getSDKAppID.getSDKTransactionID.getSDKAppID()
            int r4 = atd.z.getSDKAppID.getSDKTransactionID.getSDKAppID()
            int r9 = atd.z.getSDKAppID.getSDKTransactionID.getSDKAppID()
            r6 = 600043858(0x23c3f152, float:2.1244145E-17)
            r5 = -600043858(0xffffffffdc3c0eae, float:-2.1173374E17)
            java.lang.Object r11 = atd.bc.AuthenticationRequestParameters.getDeviceData(r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r11 = (java.lang.String) r11
            int r0 = atd.ao.getSDKReferenceNumber.BuildConfig
            r1 = r0 & 17
            r0 = r0 ^ 17
            r0 = r0 | r1
            int r1 = r1 + r0
            int r0 = r1 % 128
            atd.ao.getSDKReferenceNumber.getMessageVersion = r0
            int r1 = r1 % 2
            if (r1 != 0) goto L5f
            return r11
        L5f:
            throw r3
        L60:
            int r1 = r1 + 1
            int r1 = r1 % 128
            atd.ao.getSDKReferenceNumber.BuildConfig = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ao.getSDKReferenceNumber.getDeviceData(java.lang.Object[]):java.lang.Object");
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] getSDKAppID(int r29, int r30) {
        /*
            Method dump skipped, instruction units count: 2078
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ao.getSDKReferenceNumber.getSDKAppID(int, int):java.lang.Object[]");
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) throws getSDKTransactionID {
        getSDKReferenceNumber getsdkreferencenumber = (getSDKReferenceNumber) objArr[0];
        int i11 = getMessageVersion;
        BuildConfig = ((i11 ^ 63) + ((i11 & 63) << 1)) % 128;
        atd.bc.AuthenticationRequestParameters authenticationRequestParameters = getsdkreferencenumber.getSDKAppID;
        if (authenticationRequestParameters != null) {
            BuildConfig = (((i11 | 109) << 1) - (i11 ^ 109)) % 128;
            int sDKAppID = getSDKAppID.getSDKTransactionID.getSDKAppID();
            int sDKAppID2 = getSDKAppID.getSDKTransactionID.getSDKAppID();
            atd.bc.AuthenticationRequestParameters.getDeviceData(getSDKAppID.getSDKTransactionID.getSDKAppID(), 762869508, -762869506, sDKAppID, new Object[]{authenticationRequestParameters}, getSDKAppID.getSDKTransactionID.getSDKAppID(), sDKAppID2);
            int i12 = BuildConfig;
            int i13 = (i12 | 31) << 1;
            int i14 = -(i12 ^ 31);
            getMessageVersion = ((i13 & i14) + (i14 | i13)) % 128;
        } else {
            BuildConfig = (((i11 | 65) << 1) - (i11 ^ 65)) % 128;
        }
        atd.bc.AuthenticationRequestParameters authenticationRequestParameters2 = getsdkreferencenumber.getDeviceData;
        if (authenticationRequestParameters2 != null) {
            int i15 = BuildConfig;
            getMessageVersion = ((i15 & 101) + (i15 | 101)) % 128;
            int sDKAppID3 = getSDKAppID.getSDKTransactionID.getSDKAppID();
            int sDKAppID4 = getSDKAppID.getSDKTransactionID.getSDKAppID();
            atd.bc.AuthenticationRequestParameters.getDeviceData(getSDKAppID.getSDKTransactionID.getSDKAppID(), 762869508, -762869506, sDKAppID3, new Object[]{authenticationRequestParameters2}, getSDKAppID.getSDKTransactionID.getSDKAppID(), sDKAppID4);
            int i16 = BuildConfig;
            int i17 = i16 & 73;
            int i18 = (i16 | 73) & (~i17);
            int i19 = -(-(i17 << 1));
            getMessageVersion = (((i18 | i19) << 1) - (i18 ^ i19)) % 128;
        } else {
            int i21 = getMessageVersion;
            BuildConfig = ((((i21 ^ 25) | (i21 & 25)) << 1) - (((~i21) & 25) | (i21 & (-26)))) % 128;
        }
        atd.bc.AuthenticationRequestParameters authenticationRequestParameters3 = getsdkreferencenumber.getSDKTransactionID;
        if (authenticationRequestParameters3 != null) {
            int i22 = getMessageVersion;
            int i23 = i22 & 35;
            BuildConfig = a0.d(i23, ~((i22 ^ 35) | i23), 1, 128);
            int sDKAppID5 = getSDKAppID.getSDKTransactionID.getSDKAppID();
            int sDKAppID6 = getSDKAppID.getSDKTransactionID.getSDKAppID();
            atd.bc.AuthenticationRequestParameters.getDeviceData(getSDKAppID.getSDKTransactionID.getSDKAppID(), 762869508, -762869506, sDKAppID5, new Object[]{authenticationRequestParameters3}, getSDKAppID.getSDKTransactionID.getSDKAppID(), sDKAppID6);
            int i24 = getMessageVersion;
            int i25 = i24 ^ 99;
            int i26 = ((i24 & 99) | i25) << 1;
            int i27 = -i25;
            BuildConfig = ((i26 ^ i27) + ((i26 & i27) << 1)) % 128;
        } else {
            int i28 = BuildConfig;
            int i29 = ((i28 ^ 53) | (i28 & 53)) << 1;
            int i31 = -(((~i28) & 53) | (i28 & (-54)));
            getMessageVersion = ((i29 ^ i31) + ((i31 & i29) << 1)) % 128;
        }
        atd.bc.AuthenticationRequestParameters authenticationRequestParameters4 = getsdkreferencenumber.getSDKReferenceNumber;
        if (authenticationRequestParameters4 == null) {
            int i32 = getMessageVersion;
            int i33 = (i32 | 33) << 1;
            int i34 = -(((~i32) & 33) | (i32 & (-34)));
            int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
            BuildConfig = i35 % 128;
            if (i35 % 2 != 0) {
                return null;
            }
            throw null;
        }
        int i36 = BuildConfig;
        int i37 = (i36 & 67) + (i36 | 67);
        getMessageVersion = i37 % 128;
        if (i37 % 2 != 0) {
            int sDKAppID7 = getSDKAppID.getSDKTransactionID.getSDKAppID();
            int sDKAppID8 = getSDKAppID.getSDKTransactionID.getSDKAppID();
            atd.bc.AuthenticationRequestParameters.getDeviceData(getSDKAppID.getSDKTransactionID.getSDKAppID(), 762869508, -762869506, sDKAppID7, new Object[]{authenticationRequestParameters4}, getSDKAppID.getSDKTransactionID.getSDKAppID(), sDKAppID8);
            int i38 = 90 / 0;
        } else {
            int sDKAppID9 = getSDKAppID.getSDKTransactionID.getSDKAppID();
            int sDKAppID10 = getSDKAppID.getSDKTransactionID.getSDKAppID();
            atd.bc.AuthenticationRequestParameters.getDeviceData(getSDKAppID.getSDKTransactionID.getSDKAppID(), 762869508, -762869506, sDKAppID9, new Object[]{authenticationRequestParameters4}, getSDKAppID.getSDKTransactionID.getSDKAppID(), sDKAppID10);
        }
        return null;
    }

    public static void init$0() {
        $$a = new byte[]{9, -85, -40, 20, -3, 3, -3};
        $$b = 19;
    }

    public static void init$1() {
        $$c = new byte[]{112, -4, 67, 92};
        $$d = BERTags.PRIVATE;
    }

    public final void getMessageVersion() {
        int sDKReferenceNumber = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber2 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber3 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        getSDKAppID(sDKReferenceNumber, 1724941056, getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), sDKReferenceNumber3, -1724941056, sDKReferenceNumber2, new Object[]{this});
    }

    @NotNull
    public final getSDKReferenceNumber getSDKTransactionID() {
        int sDKReferenceNumber = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber2 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber3 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        return (getSDKReferenceNumber) getSDKAppID(sDKReferenceNumber, -1663327888, getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), sDKReferenceNumber3, 1663327893, sDKReferenceNumber2, new Object[]{this});
    }

    public /* synthetic */ getSDKReferenceNumber(byte b8) {
        this(null, null, null, null);
    }

    public getSDKReferenceNumber() {
        this((byte) 0);
    }

    @Nullable
    public final String AuthenticationRequestParameters() {
        int sDKReferenceNumber = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber2 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber3 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        return (String) getSDKAppID(sDKReferenceNumber, -559760497, getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), sDKReferenceNumber3, 559760500, sDKReferenceNumber2, new Object[]{this});
    }

    @Nullable
    public final String getDeviceData() {
        int sDKReferenceNumber = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber2 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber3 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        return (String) getSDKAppID(sDKReferenceNumber, -1801278926, getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), sDKReferenceNumber3, 1801278928, sDKReferenceNumber2, new Object[]{this});
    }

    @Nullable
    public final String getSDKReferenceNumber() {
        int sDKReferenceNumber = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber2 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber3 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        return (String) getSDKAppID(sDKReferenceNumber, 284769600, getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), sDKReferenceNumber3, -284769596, sDKReferenceNumber2, new Object[]{this});
    }

    private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
        getSDKReferenceNumber getsdkreferencenumber = (getSDKReferenceNumber) objArr[0];
        int i11 = getMessageVersion;
        int i12 = (((i11 | 47) << 1) - (i11 ^ 47)) % 128;
        BuildConfig = i12;
        atd.bc.AuthenticationRequestParameters authenticationRequestParameters = getsdkreferencenumber.getDeviceData;
        if (authenticationRequestParameters == null) {
            int i13 = i11 & 1;
            BuildConfig = a0.d(i13, ~(-(-((i11 ^ 1) | i13))), 1, 128);
            return null;
        }
        int i14 = i12 & 107;
        int i15 = i12 | 107;
        int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
        getMessageVersion = i16 % 128;
        int i17 = i16 % 2;
        Object[] objArr2 = {authenticationRequestParameters};
        int sDKAppID = getSDKAppID.getSDKTransactionID.getSDKAppID();
        int sDKAppID2 = getSDKAppID.getSDKTransactionID.getSDKAppID();
        int sDKAppID3 = getSDKAppID.getSDKTransactionID.getSDKAppID();
        int sDKAppID4 = getSDKAppID.getSDKTransactionID.getSDKAppID();
        if (i17 == 0) {
            return (String) atd.bc.AuthenticationRequestParameters.getDeviceData(sDKAppID3, -600043858, 600043858, sDKAppID, objArr2, sDKAppID4, sDKAppID2);
        }
        throw null;
    }

    public static /* synthetic */ Object getSDKAppID(int i11, int i12, int i13, int i14, int i15, int i16, Object[] objArr) {
        int i17 = ~i15;
        int i18 = ~i12;
        int i19 = ~((~i11) | i18);
        int i21 = i11 | i18;
        int i22 = (1092222976 * i13) + (952107008 * i14) + ((-271974400) * i16) + ((-282608405) * i21) + (282608405 * i19) + (i17 * 282608405) + (10634006 * i15) + (((-554582804) * i12) - 1671495680);
        int iC = a0.c(i13, -1809372279, ((-189913888) * i14) + i12 + i15 + i16);
        int i23 = i19 * (-881);
        int i24 = i21 * 881;
        int i25 = i16 * 986544659;
        int i26 = i14 * 1843362976;
        int i27 = i13 * (-1872984789);
        int iE = a0.e(iC, -2050686976, i27 + i26 + i25 + i24 + i23 + (i17 * (-881)) + (i15 * 986543778) + (i12 * 986545540) + 223666697, 1179713536, ((-70844416) * iC) + i22);
        if (iE == 1) {
            return getDeviceData(objArr);
        }
        if (iE == 2) {
            return getSDKAppID(objArr);
        }
        if (iE != 3) {
            if (iE == 4) {
                return AuthenticationRequestParameters(objArr);
            }
            if (iE != 5) {
                return getSDKReferenceNumber(objArr);
            }
            getSDKReferenceNumber getsdkreferencenumber = (getSDKReferenceNumber) objArr[0];
            getSDKReferenceNumber getsdkreferencenumber2 = new getSDKReferenceNumber(getsdkreferencenumber.getSDKAppID(), getsdkreferencenumber.getDeviceData(), getsdkreferencenumber.getSDKReferenceNumber(), getsdkreferencenumber.AuthenticationRequestParameters());
            int i28 = BuildConfig;
            int i29 = (i28 ^ 62) + ((i28 & 62) << 1);
            getMessageVersion = ((i29 ^ (-1)) + (i29 << 1)) % 128;
            return getsdkreferencenumber2;
        }
        getSDKReferenceNumber getsdkreferencenumber3 = (getSDKReferenceNumber) objArr[0];
        int i31 = BuildConfig;
        int i32 = ((-2) - ((((i31 | 76) << 1) - (i31 ^ 76)) ^ (-1))) % 128;
        getMessageVersion = i32;
        atd.bc.AuthenticationRequestParameters authenticationRequestParameters = getsdkreferencenumber3.getSDKReferenceNumber;
        if (authenticationRequestParameters == null) {
            BuildConfig = (i32 + 21) % 128;
            return null;
        }
        int i33 = i32 & 81;
        int i34 = -(-((i32 ^ 81) | i33));
        BuildConfig = ((i33 ^ i34) + ((i34 & i33) << 1)) % 128;
        String str = (String) atd.bc.AuthenticationRequestParameters.getDeviceData(getSDKAppID.getSDKTransactionID.getSDKAppID(), -600043858, 600043858, getSDKAppID.getSDKTransactionID.getSDKAppID(), new Object[]{authenticationRequestParameters}, getSDKAppID.getSDKTransactionID.getSDKAppID(), getSDKAppID.getSDKTransactionID.getSDKAppID());
        int i35 = BuildConfig;
        getMessageVersion = k.c(i35 ^ 88, (i35 & 88) << 1, 1, 128);
        return str;
    }

    @Nullable
    public final String getSDKAppID() {
        int sDKReferenceNumber = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber2 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        int sDKReferenceNumber3 = getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber();
        return (String) getSDKAppID(sDKReferenceNumber, 2021838210, getSDKReferenceNumber.getSDKTransactionID.getSDKReferenceNumber(), sDKReferenceNumber3, -2021838209, sDKReferenceNumber2, new Object[]{this});
    }
}
