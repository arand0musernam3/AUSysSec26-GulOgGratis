package atd.bc;

import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0000¨\u0006\u0003"}, d2 = {"destroy", "", "Ljava/security/cert/X509Certificate;", "threeds2_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nX509CertificateExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 X509CertificateExtensions.kt\ncom/adyen/threeds2/internal/util/X509CertificateExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,25:1\n1#2:26\n*E\n"})
public final class ChallengeResultTimeout {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10;
    private static int $11;
    private static int getDeviceData;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(short r6, byte r7, byte r8) {
        /*
            int r7 = r7 + 5
            int r8 = r8 * 4
            int r0 = r8 + 1
            int r6 = r6 * 2
            int r6 = r6 + 98
            byte[] r1 = atd.bc.ChallengeResultTimeout.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r1
            r4 = r2
            r1 = r7
            goto L2b
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r7 = r7 + 1
            r3 = r1[r7]
            r5 = r1
            r1 = r7
            r7 = r3
            r3 = r5
        L2b:
            int r6 = r6 + r7
            r7 = r1
            r1 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.bc.ChallengeResultTimeout.$$e(short, byte, byte):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        getSDKAppID = 0;
        getSDKReferenceNumber = 1;
        getDeviceData = 711855340;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r8 = r8 * 6
            int r8 = r8 + 97
            int r7 = r7 * 15
            int r0 = 26 - r7
            byte[] r1 = atd.bc.ChallengeResultTimeout.$$a
            byte[] r0 = new byte[r0]
            int r7 = 25 - r7
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r1
            r4 = r2
            r1 = r6
            goto L33
        L17:
            r3 = r8
            r8 = r6
            r6 = r3
            r3 = r2
        L1b:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L28:
            int r3 = r3 + 1
            int r8 = r8 + 1
            r4 = r1[r8]
            r5 = r1
            r1 = r8
            r8 = r4
            r4 = r3
            r3 = r5
        L33:
            int r6 = r6 + r8
            int r6 = r6 + (-5)
            r8 = r1
            r1 = r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.bc.ChallengeResultTimeout.a(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(boolean r32, int r33, java.lang.String r34, int r35, int r36, java.lang.Object[] r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.bc.ChallengeResultTimeout.b(boolean, int, java.lang.String, int, int, java.lang.Object[]):void");
    }

    private static void getSDKTransactionID() throws Throwable {
        getSDKAppID = (getSDKReferenceNumber + 117) % 128;
        byte[] bArr = $$a;
        byte b8 = bArr[28];
        byte b11 = (byte) (b8 - 1);
        byte b12 = b8;
        Object[] objArr = new Object[1];
        a(b11, b12, b12, objArr);
        a0.B(null, (String) objArr[0], "AuthenticationRequestParameters");
        getSDKAppID = (getSDKReferenceNumber + 19) % 128;
        try {
            byte b13 = bArr[28];
            byte b14 = (byte) (b13 - 1);
            byte b15 = b13;
            Object[] objArr2 = new Object[1];
            a(b14, b15, b15, objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            byte b16 = bArr[4];
            byte b17 = (byte) ($$b & 1);
            Object[] objArr3 = new Object[1];
            a(b16, b17, b17, objArr3);
            Method method = cls.getMethod((String) objArr3[0], null);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, null);
            Object[] objArr4 = {atd.as.BuildConfig.class.getField("getDeviceData").get(null)};
            Object[] objArr5 = new Object[1];
            b(true, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 141, "\u0001\u0001\ufffe", 3 - (ViewConfiguration.getTapTimeout() >> 16), 2 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr5);
            Method method2 = Set.class.getMethod(((String) objArr5[0]).intern(), Object.class);
            method2.setAccessible(true);
            int i11 = getSDKReferenceNumber + 125;
            getSDKAppID = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    public static void init$0() {
        $$a = new byte[]{63, -107, 81, -105, 24, -11, -49, 56, 22, -63, 62, 3, 20, -28, -10, 12, 14, 35, -12, 18, 10, -13, 7, 22, -6, 11, 4, -32, 0, 3, 20, -28, -10, 12, -5, 52, 5, -34, 0};
        $$b = 191;
    }

    public static void init$1() {
        $$c = new byte[]{0, ByteCompanionObject.MIN_VALUE, -126, 96, -85};
        $$d = 221;
    }

    public static final void getSDKTransactionID(@Nullable X509Certificate x509Certificate) {
        if (x509Certificate == null) {
            return;
        }
        try {
            byte[] encoded = x509Certificate.getEncoded();
            if (encoded != null) {
                Arrays.fill(encoded, (byte) 0);
                getSDKAppID = (getSDKReferenceNumber + 95) % 128;
            }
        } catch (CertificateEncodingException unused) {
        }
        try {
            byte[] tBSCertificate = x509Certificate.getTBSCertificate();
            if (tBSCertificate != null) {
                Arrays.fill(tBSCertificate, (byte) 0);
            }
        } catch (CertificateEncodingException unused2) {
        }
        byte[] signature = x509Certificate.getSignature();
        if (signature != null) {
            Arrays.fill(signature, (byte) 0);
        }
        byte[] sigAlgParams = x509Certificate.getSigAlgParams();
        if (sigAlgParams != null) {
            int i11 = getSDKAppID + 125;
            getSDKReferenceNumber = i11 % 128;
            if (i11 % 2 == 0) {
                Arrays.fill(sigAlgParams, (byte) 1);
            } else {
                Arrays.fill(sigAlgParams, (byte) 0);
            }
        } else {
            getSDKReferenceNumber = (getSDKAppID + 95) % 128;
        }
        boolean[] keyUsage = x509Certificate.getKeyUsage();
        if (keyUsage != null) {
            Arrays.fill(keyUsage, false);
        }
        boolean[] issuerUniqueID = x509Certificate.getIssuerUniqueID();
        if (issuerUniqueID != null) {
            int i12 = getSDKAppID + 37;
            getSDKReferenceNumber = i12 % 128;
            int i13 = i12 % 2;
            Arrays.fill(issuerUniqueID, false);
        }
        boolean[] subjectUniqueID = x509Certificate.getSubjectUniqueID();
        if (subjectUniqueID != null) {
            Arrays.fill(subjectUniqueID, false);
        }
    }
}
