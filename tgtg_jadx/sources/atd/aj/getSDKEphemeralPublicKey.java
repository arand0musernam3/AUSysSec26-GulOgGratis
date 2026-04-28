package atd.aj;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.bb.ChallengeResultCompleted;
import com.app.tgtg.model.local.AppConstants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Security;
import java.security.cert.CertPathValidator;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.PKIXParameters;
import java.security.cert.PKIXRevocationChecker;
import java.security.cert.X509Certificate;
import java.util.EnumSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getSDKEphemeralPublicKey {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static final CertificateFactory AuthenticationRequestParameters;
    private static int ChallengeResult;
    private static int ChallengeResultCancelled;
    private static char getDeviceData;
    private static int getMessageVersion;
    private static char getSDKAppID;
    private static int getSDKEphemeralPublicKey;
    private static char getSDKReferenceNumber;
    private static char getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r7, byte r8, short r9) {
        /*
            int r8 = r8 + 4
            int r9 = r9 * 3
            int r9 = r9 + 66
            int r7 = r7 * 2
            int r7 = r7 + 1
            byte[] r0 = atd.aj.getSDKEphemeralPublicKey.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r9 = r8
            r3 = r0
            r4 = r2
            r0 = r7
            goto L2d
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r7) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L26:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r0
            r0 = r6
        L2d:
            int r8 = r8 + r0
            r0 = r9
            r9 = r8
            r8 = r0
            r0 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aj.getSDKEphemeralPublicKey.$$c(byte, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getMessageVersion = 0;
        getSDKEphemeralPublicKey = 1;
        ChallengeResult = 0;
        ChallengeResultCancelled = 1;
        AuthenticationRequestParameters();
        View.getDefaultSize(0, 0);
        try {
            Object[] objArr = new Object[1];
            a("\ue4f0줦ိ茕䨉俣", 5 - View.MeasureSpec.getMode(0), objArr);
            AuthenticationRequestParameters = CertificateFactory.getInstance(((String) objArr[0]).intern());
            int i11 = getMessageVersion + 109;
            getSDKEphemeralPublicKey = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
        } catch (CertificateException unused) {
            throw atd.aa.getSDKReferenceNumber.CRYPTO_FAILURE.AuthenticationRequestParameters();
        }
    }

    public static void AuthenticationRequestParameters() {
        getDeviceData = (char) 24844;
        getSDKReferenceNumber = (char) 15105;
        getSDKTransactionID = (char) 55564;
        getSDKAppID = (char) 49604;
    }

    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        int i13;
        int i14;
        int i15;
        char c3;
        if (str != null) {
            $11 = ($10 + 19) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        ChallengeResultCompleted challengeResultCompleted = new ChallengeResultCompleted();
        char[] cArr2 = new char[cArr.length];
        int i16 = 0;
        challengeResultCompleted.getDeviceData = 0;
        int i17 = 2;
        char[] cArr3 = new char[2];
        while (true) {
            int i18 = challengeResultCompleted.getDeviceData;
            if (i18 >= cArr.length) {
                objArr[0] = new String(cArr2, 0, i11);
                return;
            }
            int i19 = $11 + 47;
            $10 = i19 % 128;
            char c7 = 1;
            if (i19 % i17 != 0) {
                cArr3[1] = cArr[i18];
                cArr3[i16] = cArr[i18 >> 1];
                i12 = 1;
            } else {
                cArr3[i16] = cArr[i18];
                cArr3[1] = cArr[i18 + 1];
                i12 = i16;
            }
            int i21 = 58224;
            while (i12 < 16) {
                $11 = ($10 + 89) % 128;
                char c8 = cArr3[c7];
                char c11 = cArr3[i16];
                char c12 = c7;
                int i22 = (c11 + i21) ^ ((c11 << 4) + ((char) (((long) getSDKTransactionID) ^ 5320350835299930193L)));
                int i23 = c11 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(getSDKAppID);
                    objArr2[i17] = Integer.valueOf(i23);
                    objArr2[c12] = Integer.valueOf(i22);
                    objArr2[i16] = Integer.valueOf(c8);
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(906025703);
                    Class cls = Integer.TYPE;
                    if (sDKTransactionID == null) {
                        i15 = 906025703;
                        c3 = 3;
                        byte b8 = (byte) i16;
                        i14 = i17;
                        byte b11 = (byte) (b8 - 1);
                        i13 = i16;
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData((ViewConfiguration.getKeyRepeatDelay() >> 16) + 2828, (char) View.MeasureSpec.getMode(i16), (ViewConfiguration.getTouchSlop() >> 8) + 27, -362226441, false, $$c(b8, b11, (byte) (b11 + 1)), new Class[]{cls, cls, cls, cls});
                    } else {
                        i13 = i16;
                        i14 = i17;
                        i15 = 906025703;
                        c3 = 3;
                    }
                    char cCharValue = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    cArr3[c12] = cCharValue;
                    char c13 = cArr3[i13];
                    int i24 = (cCharValue + i21) ^ ((cCharValue << 4) + ((char) (((long) getDeviceData) ^ 5320350835299930193L)));
                    int i25 = cCharValue >>> 5;
                    Object[] objArr3 = new Object[4];
                    objArr3[c3] = Integer.valueOf(getSDKReferenceNumber);
                    objArr3[i14] = Integer.valueOf(i25);
                    objArr3[c12] = Integer.valueOf(i24);
                    objArr3[i13] = Integer.valueOf(c13);
                    Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(i15);
                    if (sDKTransactionID2 == null) {
                        int i26 = i13;
                        int offsetBefore = 2828 - TextUtils.getOffsetBefore("", i26);
                        char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                        int defaultSize = 27 - View.getDefaultSize(i26, i26);
                        byte b12 = (byte) i26;
                        byte b13 = (byte) (b12 - 1);
                        sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(offsetBefore, maxKeyCode, defaultSize, -362226441, false, $$c(b12, b13, (byte) (b13 + 1)), new Class[]{cls, cls, cls, cls});
                    }
                    cArr3[0] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
                    i21 -= 40503;
                    i12++;
                    c7 = c12;
                    i17 = i14;
                    i16 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            int i27 = i17;
            char c14 = c7;
            int i28 = challengeResultCompleted.getDeviceData;
            cArr2[i28] = cArr3[0];
            cArr2[i28 + 1] = cArr3[c14];
            Object[] objArr4 = new Object[i27];
            objArr4[c14] = challengeResultCompleted;
            objArr4[0] = challengeResultCompleted;
            Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-1859796622);
            if (sDKTransactionID3 == null) {
                byte b14 = (byte) 0;
                byte b15 = (byte) (b14 - 1);
                sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(Color.rgb(0, 0, 0) + 16780372, (char) (25797 - View.getDefaultSize(0, 0)), ExpandableListView.getPackedPositionChild(0L) + 28, 1296942946, false, $$c(b14, b15, (byte) (-b15)), new Class[]{Object.class, Object.class});
            }
            ((Method) sDKTransactionID3).invoke(null, objArr4);
            i17 = i27;
            i16 = 0;
        }
    }

    public static void getDeviceData(X509Certificate x509Certificate, List<X509Certificate> list) {
        try {
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, null);
            Object[] objArr = new Object[1];
            a("\udd6dᗔ់䷰", TextUtils.getOffsetBefore("", 0) + 4, objArr);
            keyStore.setCertificateEntry(((String) objArr[0]).intern(), x509Certificate);
            PKIXParameters pKIXParameters = new PKIXParameters(keyStore);
            Object[] objArr2 = new Object[1];
            a("ㄣ挍᷻쀶", View.resolveSize(0, 0) + 4, objArr2);
            CertPathValidator certPathValidator = CertPathValidator.getInstance(((String) objArr2[0]).intern());
            PKIXRevocationChecker pKIXRevocationChecker = (PKIXRevocationChecker) certPathValidator.getRevocationChecker();
            if (pKIXRevocationChecker.getOcspResponder() == null) {
                int i11 = ChallengeResultCancelled + 49;
                ChallengeResult = i11 % 128;
                if (i11 % 2 != 0) {
                    Object[] objArr3 = new Object[1];
                    a("\ue01a읏\ued21\uf88b횏횃虏ꅣ䪘➄嶻澮ݯ掋拚㦹喿ᵷ", 47 << TextUtils.lastIndexOf("", 'r'), objArr3);
                    if (Security.getProperty(((String) objArr3[0]).intern()) != null) {
                        pKIXRevocationChecker.setOptions(EnumSet.of(PKIXRevocationChecker.Option.SOFT_FAIL));
                        pKIXParameters.addCertPathChecker(pKIXRevocationChecker);
                    }
                    pKIXParameters.setRevocationEnabled(false);
                } else {
                    Object[] objArr4 = new Object[1];
                    a("\ue01a읏\ued21\uf88b횏횃虏ꅣ䪘➄嶻澮ݯ掋拚㦹喿ᵷ", 16 - TextUtils.lastIndexOf("", '0'), objArr4);
                    if (Security.getProperty(((String) objArr4[0]).intern()) != null) {
                        pKIXRevocationChecker.setOptions(EnumSet.of(PKIXRevocationChecker.Option.SOFT_FAIL));
                        pKIXParameters.addCertPathChecker(pKIXRevocationChecker);
                    }
                    pKIXParameters.setRevocationEnabled(false);
                }
            } else {
                pKIXRevocationChecker.setOptions(EnumSet.of(PKIXRevocationChecker.Option.SOFT_FAIL));
                pKIXParameters.addCertPathChecker(pKIXRevocationChecker);
            }
            if (certPathValidator.validate(AuthenticationRequestParameters.generateCertPath(list), pKIXParameters) == null) {
                int i12 = ChallengeResultCancelled + AppConstants.RESULT_CODE_ORDER_CANCELLED;
                ChallengeResult = i12 % 128;
                if (i12 % 2 == 0) {
                    throw atd.aa.getSDKReferenceNumber.CRYPTO_FAILURE.getDeviceData();
                }
                int i13 = 60 / 0;
                throw atd.aa.getSDKReferenceNumber.CRYPTO_FAILURE.getDeviceData();
            }
        } catch (IOException | GeneralSecurityException unused) {
            throw atd.aa.getSDKReferenceNumber.CRYPTO_FAILURE.AuthenticationRequestParameters();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r1 = new java.lang.Object[1];
        a("蜨ᫍ\ud8ea딁Ű쒣띭眵봏䫾窆姏턐꼹儸ꅹ់䷰\uef04濨㾊瑜銾푚㶙늺ᾲ⸍ݯ掋䇨㶳蓮頮\uf00a\ue369띭欋Ὅ꿶", 39 - android.text.TextUtils.getOffsetAfter("", 0), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
    
        throw new java.security.cert.CertificateException(((java.lang.String) r1[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if ((r4 instanceof java.security.cert.X509Certificate) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if ((r4 instanceof java.security.cert.X509Certificate) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        r4 = (java.security.cert.X509Certificate) r4;
        atd.aj.getSDKEphemeralPublicKey.ChallengeResultCancelled = (atd.aj.getSDKEphemeralPublicKey.ChallengeResult + 45) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.security.cert.X509Certificate getSDKTransactionID(java.io.InputStream r4) throws java.lang.Throwable {
        /*
            int r0 = atd.aj.getSDKEphemeralPublicKey.ChallengeResultCancelled
            r1 = 1
            int r0 = r0 + r1
            int r2 = r0 % 128
            atd.aj.getSDKEphemeralPublicKey.ChallengeResult = r2
            int r0 = r0 % 2
            r2 = 0
            if (r0 == 0) goto L1b
            java.security.cert.CertificateFactory r0 = atd.aj.getSDKEphemeralPublicKey.AuthenticationRequestParameters
            java.security.cert.Certificate r4 = r0.generateCertificate(r4)
            boolean r0 = r4 instanceof java.security.cert.X509Certificate
            r3 = 80
            int r3 = r3 / r2
            if (r0 == 0) goto L30
            goto L25
        L1b:
            java.security.cert.CertificateFactory r0 = atd.aj.getSDKEphemeralPublicKey.AuthenticationRequestParameters
            java.security.cert.Certificate r4 = r0.generateCertificate(r4)
            boolean r0 = r4 instanceof java.security.cert.X509Certificate
            if (r0 == 0) goto L30
        L25:
            java.security.cert.X509Certificate r4 = (java.security.cert.X509Certificate) r4
            int r0 = atd.aj.getSDKEphemeralPublicKey.ChallengeResult
            int r0 = r0 + 45
            int r0 = r0 % 128
            atd.aj.getSDKEphemeralPublicKey.ChallengeResultCancelled = r0
            return r4
        L30:
            java.security.cert.CertificateException r4 = new java.security.cert.CertificateException
            java.lang.String r0 = ""
            int r0 = android.text.TextUtils.getOffsetAfter(r0, r2)
            int r0 = 39 - r0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r3 = "蜨ᫍ\ud8ea딁Ű쒣띭眵봏䫾窆姏턐꼹儸ꅹ់䷰\uef04濨㾊瑜銾푚㶙늺ᾲ⸍ݯ掋䇨㶳蓮頮\uf00a\ue369띭欋Ὅ꿶"
            a(r3, r0, r1)
            r0 = r1[r2]
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r0.intern()
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aj.getSDKEphemeralPublicKey.getSDKTransactionID(java.io.InputStream):java.security.cert.X509Certificate");
    }

    public static void init$0() {
        $$a = new byte[]{76, -58, -49, 5};
        $$b = 94;
    }

    public static X509Certificate getSDKTransactionID(String str) throws Throwable {
        Object[] objArr = new Object[1];
        a("쏎䨃쏎䨃쏋႞\ud944≺蹲ང墕滓ಅ싇㡪욝䌱ࢃ擧╫걆踅쏎䨃쏎䨃䧁簀蘲䬰\udc87楚쏎䨃쏎䨃蹾휒䚕룹娕磆쵫ະ栆瘄岾綹\ud9ea疛︒劽쏎䨃쏎䨃", 56 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr);
        X509Certificate sDKTransactionID = getSDKTransactionID(new ByteArrayInputStream(String.format(((String) objArr[0]).intern(), str).getBytes(atd.e.getSDKAppID.getSDKAppID)));
        int i11 = ChallengeResultCancelled + 115;
        ChallengeResult = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 72 / 0;
        }
        return sDKTransactionID;
    }
}
