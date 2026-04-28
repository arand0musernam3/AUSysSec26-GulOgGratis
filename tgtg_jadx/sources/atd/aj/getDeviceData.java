package atd.aj;

import android.graphics.Color;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import atd.bb.ChallengeResultKt;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import org.bouncycastle.i18n.LocalizedMessage;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getDeviceData {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static char[] AuthenticationRequestParameters;
    private static int BuildConfig;
    private static int ChallengeResult;
    private static int ChallengeResultCancelled;
    private static final int ChallengeResultTimeout = 0;
    private static final byte[] getAdditionalDetails = null;
    private static char getDeviceData;
    private static int getMessageVersion;
    private static char getSDKAppID;
    private static char getSDKEphemeralPublicKey;
    private static char getSDKReferenceNumber;
    private static char getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r5, byte r6, short r7) {
        /*
            int r6 = 122 - r6
            byte[] r0 = atd.aj.getDeviceData.$$a
            int r7 = r7 * 3
            int r1 = 1 - r7
            int r5 = r5 * 4
            int r5 = 4 - r5
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L17
            r6 = r5
            r4 = r7
            r3 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L23:
            int r3 = r3 + 1
            r4 = r0[r5]
        L27:
            int r5 = r5 + 1
            int r4 = -r4
            int r6 = r6 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aj.getDeviceData.$$c(short, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKReferenceNumber();
        ChallengeResult = 0;
        ChallengeResultCancelled = 1;
        getMessageVersion = 0;
        BuildConfig = 1;
        AuthenticationRequestParameters();
        getDeviceData();
        KeyEvent.getModifierMetaStateMask();
        View.MeasureSpec.getSize(0);
        int i11 = ChallengeResultCancelled + 19;
        ChallengeResult = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 51 / 0;
        }
    }

    public static ECPublicKey AuthenticationRequestParameters(AuthenticationRequestParameters authenticationRequestParameters, BigInteger bigInteger, BigInteger bigInteger2) throws Throwable {
        try {
            Object[] objArr = new Object[1];
            a("棢\uf0f5", 2 - (ViewConfiguration.getEdgeSlop() >> 16), objArr);
            ECPublicKey eCPublicKey = (ECPublicKey) KeyFactory.getInstance(((String) objArr[0]).intern()).generatePublic(new ECPublicKeySpec(new ECPoint(bigInteger, bigInteger2), authenticationRequestParameters.getSDKTransactionID()));
            BuildConfig = (getMessageVersion + 1) % 128;
            return eCPublicKey;
        } catch (GeneralSecurityException unused) {
            throw atd.aa.getSDKReferenceNumber.CRYPTO_FAILURE.AuthenticationRequestParameters();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(java.lang.String r36, int r37, java.lang.Object[] r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aj.getDeviceData.a(java.lang.String, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = 1045 - r8
            int r0 = r7 + 1
            int r6 = r6 + 44
            byte[] r1 = atd.aj.getDeviceData.getAdditionalDetails
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r6 = r7
            r3 = r1
            r4 = r2
            r1 = r8
            goto L2b
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L20:
            int r8 = r8 + 1
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r1
            r1 = r8
            r8 = r4
            r4 = r3
            r3 = r5
        L2b:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + (-1)
            r8 = r1
            r1 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aj.getDeviceData.b(byte, short, int, java.lang.Object[]):void");
    }

    private static void c(String str, int i11, byte b8, Object[] objArr) throws Throwable {
        int i12;
        char c3;
        char c7;
        char c8;
        char c11;
        int i13;
        double d3;
        char[] charArray = str != null ? str.toCharArray() : str;
        ChallengeResultKt challengeResultKt = new ChallengeResultKt();
        char[] cArr = AuthenticationRequestParameters;
        Class cls = Integer.TYPE;
        double d11 = 0.0d;
        int i14 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i15 = 0;
            while (i15 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i15])};
                    Object sDKTransactionID = atd.e.ChallengeResult.getSDKTransactionID(-317146529);
                    if (sDKTransactionID == null) {
                        d3 = d11;
                        byte b11 = (byte) 0;
                        sDKTransactionID = atd.e.ChallengeResult.getDeviceData(View.MeasureSpec.getSize(0) + 2158, (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > d11 ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == d11 ? 0 : -1)), View.MeasureSpec.getMode(0) + 36, 829471823, false, $$c(b11, (byte) (b11 | 57), b11), new Class[]{cls});
                    } else {
                        d3 = d11;
                    }
                    cArr2[i15] = ((Character) ((Method) sDKTransactionID).invoke(null, objArr2)).charValue();
                    i15++;
                    d11 = d3;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        double d12 = d11;
        Object[] objArr3 = {Integer.valueOf(getSDKEphemeralPublicKey)};
        Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(-317146529);
        if (sDKTransactionID2 == null) {
            byte b12 = (byte) 0;
            sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(2158 - View.MeasureSpec.getMode(0), (char) Color.alpha(0), 36 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 829471823, false, $$c(b12, (byte) (b12 | 57), b12), new Class[]{cls});
        }
        char cCharValue = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr3)).charValue();
        char[] cArr3 = new char[i11];
        if (i11 % 2 != 0) {
            i12 = i11 - 1;
            cArr3[i12] = (char) (charArray[i12] - b8);
        } else {
            i12 = i11;
        }
        if (i12 > 1) {
            challengeResultKt.getSDKReferenceNumber = 0;
            while (true) {
                int i16 = challengeResultKt.getSDKReferenceNumber;
                if (i16 >= i12) {
                    break;
                }
                char c12 = charArray[i16];
                challengeResultKt.getDeviceData = c12;
                char c13 = charArray[i16 + 1];
                challengeResultKt.getSDKAppID = c13;
                if (c12 == c13) {
                    cArr3[i16] = (char) (c12 - b8);
                    cArr3[i16 + 1] = (char) (c13 - b8);
                    i13 = i14;
                } else {
                    Object[] objArr4 = new Object[13];
                    objArr4[12] = challengeResultKt;
                    objArr4[11] = Integer.valueOf(cCharValue);
                    objArr4[10] = challengeResultKt;
                    objArr4[9] = challengeResultKt;
                    objArr4[8] = Integer.valueOf(cCharValue);
                    objArr4[7] = challengeResultKt;
                    objArr4[6] = challengeResultKt;
                    objArr4[5] = Integer.valueOf(cCharValue);
                    objArr4[4] = challengeResultKt;
                    objArr4[3] = challengeResultKt;
                    objArr4[2] = Integer.valueOf(cCharValue);
                    objArr4[1] = challengeResultKt;
                    objArr4[i14] = challengeResultKt;
                    Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(835518319);
                    if (sDKTransactionID3 == null) {
                        c3 = '\n';
                        int maxKeyCode = 1258 - (KeyEvent.getMaxKeyCode() >> 16);
                        c7 = 2;
                        char c14 = (char) (34414 - (CdmaCellLocation.convertQuartSecToDecDegrees(i14) > d12 ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i14) == d12 ? 0 : -1)));
                        int iResolveSize = View.resolveSize(i14, i14) + 41;
                        c8 = '\t';
                        byte b13 = (byte) i14;
                        c11 = 7;
                        String str$$c = $$c(b13, (byte) (b13 | 55), b13);
                        Class cls2 = Integer.TYPE;
                        sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(maxKeyCode, c14, iResolveSize, -307955329, false, str$$c, new Class[]{Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class, Object.class, cls2, Object.class});
                    } else {
                        c3 = '\n';
                        c7 = 2;
                        c8 = '\t';
                        c11 = 7;
                    }
                    int iIntValue = ((Integer) ((Method) sDKTransactionID3).invoke(null, objArr4)).intValue();
                    int i17 = challengeResultKt.ChallengeResultCancelled;
                    if (iIntValue == i17) {
                        Object[] objArr5 = new Object[11];
                        objArr5[c3] = challengeResultKt;
                        objArr5[c8] = Integer.valueOf(cCharValue);
                        objArr5[8] = challengeResultKt;
                        objArr5[c11] = Integer.valueOf(cCharValue);
                        objArr5[6] = Integer.valueOf(cCharValue);
                        objArr5[5] = challengeResultKt;
                        objArr5[4] = challengeResultKt;
                        objArr5[3] = Integer.valueOf(cCharValue);
                        objArr5[c7] = Integer.valueOf(cCharValue);
                        objArr5[1] = challengeResultKt;
                        objArr5[i14] = challengeResultKt;
                        Object sDKTransactionID4 = atd.e.ChallengeResult.getSDKTransactionID(-758961112);
                        if (sDKTransactionID4 == null) {
                            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 2223;
                            char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 53070);
                            int i18 = 22 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                            byte b14 = (byte) i14;
                            byte b15 = b14;
                            i13 = i14;
                            String str$$c2 = $$c(b14, b15, b15);
                            Class cls3 = Integer.TYPE;
                            sDKTransactionID4 = atd.e.ChallengeResult.getDeviceData(longPressTimeout, keyRepeatTimeout, i18, 246098488, false, str$$c2, new Class[]{Object.class, Object.class, cls3, cls3, Object.class, Object.class, cls3, cls3, Object.class, cls3, Object.class});
                        } else {
                            i13 = i14;
                        }
                        int iIntValue2 = ((Integer) ((Method) sDKTransactionID4).invoke(null, objArr5)).intValue();
                        int i19 = (challengeResultKt.getSDKTransactionID * cCharValue) + challengeResultKt.ChallengeResultCancelled;
                        int i21 = challengeResultKt.getSDKReferenceNumber;
                        cArr3[i21] = cArr[iIntValue2];
                        cArr3[i21 + 1] = cArr[i19];
                    } else {
                        i13 = i14;
                        int i22 = challengeResultKt.AuthenticationRequestParameters;
                        int i23 = challengeResultKt.getSDKTransactionID;
                        int i24 = challengeResultKt.getMessageVersion;
                        if (i22 == i23) {
                            int iC = k.c(i24, cCharValue, 1, cCharValue);
                            challengeResultKt.getMessageVersion = iC;
                            int iC2 = k.c(i17, cCharValue, 1, cCharValue);
                            challengeResultKt.ChallengeResultCancelled = iC2;
                            int i25 = (i23 * cCharValue) + iC2;
                            int i26 = challengeResultKt.getSDKReferenceNumber;
                            cArr3[i26] = cArr[(i22 * cCharValue) + iC];
                            cArr3[i26 + 1] = cArr[i25];
                        } else {
                            int i27 = (i22 * cCharValue) + i17;
                            int i28 = challengeResultKt.getSDKReferenceNumber;
                            cArr3[i28] = cArr[i27];
                            cArr3[i28 + 1] = cArr[(i23 * cCharValue) + i24];
                        }
                    }
                }
                challengeResultKt.getSDKReferenceNumber += 2;
                i14 = i13;
            }
        }
        int i29 = i14;
        for (int i31 = i29; i31 < i11; i31++) {
            cArr3[i31] = (char) (cArr3[i31] ^ 13722);
        }
        objArr[i29] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x06d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x073d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.security.KeyPair getDeviceData(atd.aj.AuthenticationRequestParameters r23) {
        /*
            Method dump skipped, instruction units count: 1992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aj.getDeviceData.getDeviceData(atd.aj.AuthenticationRequestParameters):java.security.KeyPair");
    }

    public static void getSDKReferenceNumber() {
        byte[] bArr = new byte[1059];
        System.arraycopy("\u0005S<¢û\u0004þú\u0005ù\u0005þù\u0006ô\nþø\u0007ó\u000bþ÷\bþö\tþõ\nò\fú\u0000\u0003þô\u000búÿ\u0004þó\fúþ\u0005þû\u0000\u0003úþ\u0005þûÿ\u0004þûþ\u0005þûý\u0006úü\u0007úû\bþûü\u0007úû\bþûü\u0007þûû\búù\nô\nô\nþûú\túø\u000bú÷\fù\u0001\u0003ô\nþûù\nù\u0000\u0004þûø\u000bþû÷\fùÿ\u0005þú\u0001\u0003ùÿ\u0005þú\u0000\u0004þúÿ\u0005ùþ\u0006úû\bùý\u0007þúþ\u0006ùü\bþúý\u0007þúü\búû\bþúû\tþúú\nþûü\u0007ù\u0005ù\u0005ùû\tþúù\u000bùú\nþúø\fþù\u0002\u0003ùù\u000búø\u000bùø\fø\u0002\u0003ø\u0001\u0004þù\u0001\u0004øÿ\u0006þù\u0000\u0005þùÿ\u0006þùþ\u0007þùþ\u0007þù\u0002\u0003ùù\u000búø\u000bùø\fø\u0002\u0003ø\u0001\u0004þù\u0001\u0004ù\u0005ø\u0001\u0004þùý\bþùü\tþùû\nþùû\bê\u00142Á\nò\u00068ÚÞ\u0001\bú\u0006\u0002\u0003\u0002ô\bê\u00142Á\nò\u00068äÚù\u000eý\u0001ò\u0014ôö\u000f\u0015èúù\u001dôôö\u000fò\tñ\u0002\u0005\u00045¹\u000eì\u0003EÙîì\u0003\u001eà\nüø\u0001ð$èÿò\rð2Úñ\u000eò\bê\u00142Á\nò\u00068êÚ\u0006î\u001eíóû\u000fö\nýúù\u000eò\u0003\bê\u00142º\r\u0001í\u0002\bôúJâåë(î÷ö*áö\bò\u0010ì\u0004ü\u0001ð*Úúþ\u0012ò\ný\bê\u00142Á\nò\u00068Ùëõ\u0002÷\u0015þõ\u0006\u0001ð0áë\u0001\rò\tñ\u0002\u0005\u00045·\f\u0003íH×ì\u0003íó\u0001\nøú\b\u0017ç\u0003íý\u0002\f\u0000\u0010Þ\u0012ì\u000eñò\tñ\u0002\u0005\u00045Æô\u0010ð\u0007þ\u0005ïDêÓ\u0002üüî\n\u0004\bê\u00142Á\nò\u00068»\fþù\u0006\u0001îEêÓ\u0000úþ\u0001ü\u0011î\u0004ü\bí-Úúþ\u0012ò\ný\u000eá\bê\u00142Á\nò\u00068Þì÷\u0004\u0001î8\bê\u00142º\r\u0001í\u0002\bôúJâåë(î÷ö*áö\bò\u0010ì\u0004ü\u001eâ\u0006ú\u0004ô\n\u0007ô\u0002î\u0014\bê\u00142º\r\u0001í\u0002\bôúJº\u0002\n\u00014ìÔ\u0004÷ü\bô\u000bú\u001cîî\u0010ó\u0007ð\u000eò\u001eâ\n\u0001\bê\u00142º\r\u0001í\u0002\bôúJÚí\u0001í\u0002\f\u0012ðò\tô\u0001\u0001ö\bò\u0010ì\u000e\u0019åë(î÷ö\bê\u00142º\r\u0001í\u0002\bôúJæáö\bò\u0010ô\u0018í\u0001í\u0002\bôú3Ì\u0014ýôû\nù\u0000û\u0004þú\u0005øü\tþù\u0006øû\nøú\u000bó\u000bþø\u0007þ÷\bþö\tøù\fþõ\n÷\u0003\u0003÷\u0002\u0004þô\u000bùý\u0007þó\fþû\u0000\u0003úû\bþûÿ\u0004þûþ\u0005þûý\u0006ù\u0005÷\u0001\u0005þûü\u0007ùú\nþûû\bþûú\t÷\u0000\u0006÷ÿ\u0007ø\u0002\u0003ø\u0001\u0004þûù\nøÿ\u0006þûø\u000bþû÷\fþú\u0001\u0003þú\u0001\u0003þûú\t÷ý\túø\u000b÷ü\nø\u0001\u0004þûù\nøÿ\u0006þú\u0000\u0004þúÿ\u0005þúþ\u0006þú\u0005÷û\u000bþù\u0006÷ú\fö\u0004\u0003þø\u0007þ÷\bþö\tö\u0003\u0004ùü\bþõ\n÷\u0003\u0003ú\u0000\u0003ö\u0002\u0005þô\u000búû\b÷\u0003\u0003þó\fþû\u0000\u0003þúý\u0007ö\u0000\u0007þúü\b÷\u0000\u0006þúüò\tñ\u0002\u0005\u00045¾ûDÚÙ\u0005þ\u000e÷)Öü\u000b÷ø\nðü\r\u0000\u0011ì\u0003ô÷\nû\u0007\bê\u0014èIÊðø\bû\u0004@âåë7Ùô\fÿ÷\u0007öùú\u0004ô\bê\u00142º\r\u0001í\u0002\bôúJâåëô\u001eç\u0006í\r\u0001ö\bò\u0010ì\u000e\u0011í\u0001ð\fð".getBytes(LocalizedMessage.DEFAULT_ENCODING), 0, bArr, 0, 1059);
        getAdditionalDetails = bArr;
        ChallengeResultTimeout = 244;
    }

    public static void init$0() {
        $$a = new byte[]{76, -58, -49, 5};
        $$b = 71;
    }

    public static void AuthenticationRequestParameters() {
        AuthenticationRequestParameters = new char[]{30898, 30890, 30869, 30885, 30899, 30889, 30884, 30881, 30911, 30892, 30888, 30886, 30893, 30880, 30952, 30891, 30901, 30883, 30896, 30900, 30868, 30895, 30894, 30887, 30882};
        getSDKEphemeralPublicKey = (char) 19801;
    }

    public static void getDeviceData() {
        getSDKAppID = (char) 61993;
        getSDKReferenceNumber = (char) 37772;
        getDeviceData = (char) 51837;
        getSDKTransactionID = (char) 42158;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x049a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] getDeviceData(java.security.interfaces.ECPublicKey r25, java.security.interfaces.ECPrivateKey r26) {
        /*
            Method dump skipped, instruction units count: 1296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aj.getDeviceData.getDeviceData(java.security.interfaces.ECPublicKey, java.security.interfaces.ECPrivateKey):byte[]");
    }

    public static ECPrivateKey getDeviceData(AuthenticationRequestParameters authenticationRequestParameters, BigInteger bigInteger) throws Throwable {
        try {
            Object[] objArr = new Object[1];
            a("棢\uf0f5", 2 - (ViewConfiguration.getTapTimeout() >> 16), objArr);
            ECPrivateKey eCPrivateKey = (ECPrivateKey) KeyFactory.getInstance(((String) objArr[0]).intern()).generatePrivate(new ECPrivateKeySpec(bigInteger, authenticationRequestParameters.getSDKTransactionID()));
            BuildConfig = (getMessageVersion + 1) % 128;
            return eCPrivateKey;
        } catch (GeneralSecurityException unused) {
            throw atd.aa.getSDKReferenceNumber.CRYPTO_FAILURE.AuthenticationRequestParameters();
        }
    }
}
