package atd.ai;

import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import atd.bb.completed;
import atd.e.ChallengeResult;
import com.app.tgtg.model.local.AppConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Arrays;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1OutputStream;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERSequence;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
final class getSDKReferenceNumber extends getSDKAppID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static long getDeviceData;
    private static int getSDKAppID;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, int r7, byte r8) {
        /*
            byte[] r0 = atd.ai.getSDKReferenceNumber.$$a
            int r6 = r6 * 2
            int r1 = 1 - r6
            int r7 = r7 * 4
            int r7 = 4 - r7
            int r8 = r8 * 3
            int r8 = r8 + 120
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L19
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2f
        L19:
            r3 = r8
            r8 = r7
            r7 = r3
            r3 = r2
        L1d:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L28:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L2f:
            int r4 = -r4
            int r7 = r7 + 1
            int r8 = r8 + r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ai.getSDKReferenceNumber.$$c(int, int, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKAppID = 0;
        getSDKTransactionID = 1;
        AuthenticationRequestParameters = 0;
        getSDKReferenceNumber = 1;
        getSDKTransactionID();
        TextUtils.indexOf("", "", 0);
        int i11 = getSDKTransactionID + 85;
        getSDKAppID = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        int i12;
        char c3;
        int i13 = $11 + 65;
        int i14 = i13 % 128;
        $10 = i14;
        if (i13 % 2 != 0) {
            throw null;
        }
        if (str != null) {
            $11 = (i14 + 61) % 128;
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        completed completedVar = new completed();
        char[] sDKTransactionID = completed.getSDKTransactionID(getDeviceData ^ 2436480605514729170L, charArray, i11);
        int i15 = 4;
        completedVar.getSDKTransactionID = 4;
        while (true) {
            int i16 = completedVar.getSDKTransactionID;
            if (i16 >= sDKTransactionID.length) {
                objArr[0] = new String(sDKTransactionID, i15, sDKTransactionID.length - 4);
                return;
            }
            int i17 = i16 - 4;
            completedVar.getSDKAppID = i17;
            try {
                Object[] objArr2 = {Long.valueOf(sDKTransactionID[i16] ^ sDKTransactionID[i16 % 4]), Long.valueOf(i17), Long.valueOf(getDeviceData)};
                Object sDKTransactionID2 = ChallengeResult.getSDKTransactionID(2011691457);
                if (sDKTransactionID2 == null) {
                    int iIndexOf = 2773 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 13060);
                    int scrollBarSize = 25 - (ViewConfiguration.getScrollBarSize() >> 8);
                    byte b8 = (byte) 0;
                    c3 = 1;
                    byte b11 = b8;
                    i12 = i15;
                    String str$$c = $$c(b8, b11, b11);
                    Class cls = Long.TYPE;
                    sDKTransactionID2 = ChallengeResult.getDeviceData(iIndexOf, keyRepeatDelay, scrollBarSize, -1416626223, false, str$$c, new Class[]{cls, cls, cls});
                } else {
                    i12 = i15;
                    c3 = 1;
                }
                sDKTransactionID[i16] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr2)).charValue();
                Object[] objArr3 = new Object[2];
                objArr3[c3] = completedVar;
                objArr3[0] = completedVar;
                Object sDKTransactionID3 = ChallengeResult.getSDKTransactionID(-721583866);
                if (sDKTransactionID3 == null) {
                    sDKTransactionID3 = ChallengeResult.getDeviceData(409 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), KeyEvent.getDeadChar(0, 0) + 30, 144017174, false, "y", new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID3).invoke(null, objArr3);
                i15 = i12;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    private static Signature getSDKReferenceNumber() throws Throwable {
        AuthenticationRequestParameters = (getSDKReferenceNumber + 77) % 128;
        Object[] objArr = new Object[1];
        a("돓뎀\u0e6e鬓惯⑂䫄鯯\ue732\ue451ᾦじᨏホ뒸䵆䷫鶌䡈", -TextUtils.lastIndexOf("", '0', 0), objArr);
        Signature signature = Signature.getInstance(((String) objArr[0]).intern());
        int i11 = AuthenticationRequestParameters + 5;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            return signature;
        }
        throw null;
    }

    private static byte[] getSDKTransactionID(byte[] bArr) throws Throwable {
        int i11;
        int i12 = AuthenticationRequestParameters;
        getSDKReferenceNumber = (i12 + 73) % 128;
        if (bArr.length == 64) {
            int length = bArr.length / 2;
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, length);
            byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, length, bArr.length);
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            aSN1EncodableVector.add(new ASN1Integer(new BigInteger(1, bArrCopyOfRange)));
            aSN1EncodableVector.add(new ASN1Integer(new BigInteger(1, bArrCopyOfRange2)));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Object[] objArr = new Object[1];
            a("ㄏㅋ͞阮런瞣鷈", 1 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr);
            try {
                ASN1OutputStream.create(byteArrayOutputStream, ((String) objArr[0]).intern()).writeObject((ASN1Primitive) new DERSequence(aSN1EncodableVector));
                bArr = byteArrayOutputStream.toByteArray();
                int i13 = AuthenticationRequestParameters + 7;
                getSDKReferenceNumber = i13 % 128;
                i11 = i13 % 2 == 0 ? 42 : 68;
                return bArr;
            } catch (IOException e5) {
                Object[] objArr2 = new Object[1];
                a("沃泊縲\ueb48欿钄䅯", 1 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr2);
                throw new SignatureException(((String) objArr2[0]).intern(), e5);
            }
        }
        int i14 = i12 + 33;
        getSDKReferenceNumber = i14 % 128;
        if (i14 % 2 != 0) {
            return bArr;
        }
        int i15 = i11 / 0;
        return bArr;
    }

    public static void init$0() {
        $$a = new byte[]{72, 63, -104, 21};
        $$b = AppConstants.RESULT_CODE_ORDER_NOT_COLLECTED;
    }

    @Override // atd.ad.AuthenticationRequestParameters
    public final String AuthenticationRequestParameters() throws Throwable {
        Object obj;
        int i11 = AuthenticationRequestParameters + 113;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 == 0) {
            Object[] objArr = new Object[1];
            a("ᱻ᰾듈↮䋳엤梫穎䢙", View.combineMeasuredStates(1, 1) + 1, objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            a("ᱻ᰾듈↮䋳엤梫穎䢙", 1 - View.combineMeasuredStates(0, 0), objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    @Override // atd.ai.getSDKAppID
    public final boolean getDeviceData(byte[] bArr, byte[] bArr2, PublicKey publicKey) throws Throwable {
        int i11 = getSDKReferenceNumber + 103;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            Signature sDKReferenceNumber = getSDKReferenceNumber();
            sDKReferenceNumber.initVerify(publicKey);
            sDKReferenceNumber.update(bArr2);
            return sDKReferenceNumber.verify(getSDKTransactionID(bArr));
        }
        Signature sDKReferenceNumber2 = getSDKReferenceNumber();
        sDKReferenceNumber2.initVerify(publicKey);
        sDKReferenceNumber2.update(bArr2);
        sDKReferenceNumber2.verify(getSDKTransactionID(bArr));
        throw null;
    }

    public static void getSDKTransactionID() {
        getDeviceData = 8930492140600497127L;
    }
}
