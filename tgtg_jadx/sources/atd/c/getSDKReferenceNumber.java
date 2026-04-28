package atd.c;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import atd.bb.completed;
import atd.z.getSDKAppID;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/adyen/threeds2/internal/api/challenge/model/ErrorMessageRequest;", "Lcom/adyen/threeds2/internal/api/challenge/model/MessageRequest;", "errorType", "Lcom/adyen/threeds2/internal/api/challenge/model/type/ErrorType;", "transactionIdentifiers", "Lcom/adyen/threeds2/internal/result/models/TransactionIdentifiers;", "errorDetail", "Lcom/adyen/threeds2/internal/util/DestroyableString;", "messageVersion", "", "threeDSRequestorAppURL", "<init>", "(Lcom/adyen/threeds2/internal/api/challenge/model/type/ErrorType;Lcom/adyen/threeds2/internal/result/models/TransactionIdentifiers;Lcom/adyen/threeds2/internal/util/DestroyableString;Ljava/lang/String;Ljava/lang/String;)V", "requiresEncryption", "", "serialize", "Lorg/json/JSONObject;", "clear", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKReferenceNumber extends ChallengeResultCancelled {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getSDKReferenceNumber;
    private static long getSDKTransactionID;

    @Nullable
    private atd.h.getSDKReferenceNumber getDeviceData;

    @NotNull
    private final atd.bc.AuthenticationRequestParameters getSDKAppID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(byte r6, short r7, byte r8) {
        /*
            int r8 = r8 * 2
            int r8 = 120 - r8
            int r6 = r6 * 2
            int r0 = r6 + 1
            int r7 = r7 + 4
            byte[] r1 = atd.c.getSDKReferenceNumber.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r1
            r4 = r2
            r1 = r8
            r8 = r7
            goto L2e
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r5
        L2e:
            int r7 = -r7
            int r7 = r7 + r1
            r1 = r8
            r8 = r7
            r7 = r1
            r1 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.c.getSDKReferenceNumber.$$c(byte, short, byte):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKReferenceNumber = 0;
        AuthenticationRequestParameters = 1;
        getSDKTransactionID = 5512645266335832963L;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getSDKReferenceNumber(@Nullable atd.h.getSDKReferenceNumber getsdkreferencenumber, @NotNull atd.ao.getSDKReferenceNumber getsdkreferencenumber2, @NotNull atd.bc.AuthenticationRequestParameters authenticationRequestParameters, @NotNull String str, @Nullable String str2) {
        super(atd.h.getSDKAppID.ERROR, getsdkreferencenumber2, new atd.bc.AuthenticationRequestParameters(str), str2 != null ? new atd.bc.AuthenticationRequestParameters(str2) : null);
        getsdkreferencenumber2.getClass();
        authenticationRequestParameters.getClass();
        str.getClass();
        this.getDeviceData = getsdkreferencenumber;
        this.getSDKAppID = authenticationRequestParameters;
    }

    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        char[] charArray;
        if (str != null) {
            int i12 = $11 + 9;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            charArray = str.toCharArray();
            $11 = ($10 + 63) % 128;
        } else {
            charArray = str;
        }
        completed completedVar = new completed();
        char[] sDKTransactionID = completed.getSDKTransactionID(getSDKTransactionID ^ 2436480605514729170L, charArray, i11);
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
                Object[] objArr2 = {Long.valueOf(sDKTransactionID[i13] ^ sDKTransactionID[i13 % 4]), Long.valueOf(i14), Long.valueOf(getSDKTransactionID)};
                Object sDKTransactionID2 = atd.e.ChallengeResult.getSDKTransactionID(2011691457);
                if (sDKTransactionID2 == null) {
                    int edgeSlop = 2774 - (ViewConfiguration.getEdgeSlop() >> 16);
                    char c3 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 13059);
                    int touchSlop = 25 - (ViewConfiguration.getTouchSlop() >> 8);
                    byte b8 = (byte) 0;
                    byte b11 = (byte) (b8 - 1);
                    String str$$c = $$c(b8, b11, (byte) (b11 + 1));
                    Class cls = Long.TYPE;
                    sDKTransactionID2 = atd.e.ChallengeResult.getDeviceData(edgeSlop, c3, touchSlop, -1416626223, false, str$$c, new Class[]{cls, cls, cls});
                }
                sDKTransactionID[i13] = ((Character) ((Method) sDKTransactionID2).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {completedVar, completedVar};
                Object sDKTransactionID3 = atd.e.ChallengeResult.getSDKTransactionID(-721583866);
                if (sDKTransactionID3 == null) {
                    sDKTransactionID3 = atd.e.ChallengeResult.getDeviceData(408 - TextUtils.getCapsMode("", 0, 0), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 30, 144017174, false, "y", new Class[]{Object.class, Object.class});
                }
                ((Method) sDKTransactionID3).invoke(null, objArr3);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    public static void init$0() {
        $$a = new byte[]{47, -17, 30, 95};
        $$b = 119;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033 A[PHI: r0 r3
      0x0033: PHI (r0v6 org.json.JSONObject) = (r0v3 org.json.JSONObject), (r0v7 org.json.JSONObject) binds: [B:8:0x002c, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
      0x0033: PHI (r3v12 java.lang.String) = (r3v1 java.lang.String), (r3v14 java.lang.String) binds: [B:8:0x002c, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e A[PHI: r0 r3 r4
      0x002e: PHI (r0v4 org.json.JSONObject) = (r0v3 org.json.JSONObject), (r0v7 org.json.JSONObject) binds: [B:8:0x002c, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
      0x002e: PHI (r3v2 java.lang.String) = (r3v1 java.lang.String), (r3v14 java.lang.String) binds: [B:8:0x002c, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]
      0x002e: PHI (r4v1 atd.h.getSDKReferenceNumber) = (r4v0 atd.h.getSDKReferenceNumber), (r4v17 atd.h.getSDKReferenceNumber) binds: [B:8:0x002c, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // atd.c.ChallengeResultCancelled, atd.i.getDeviceData
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject AuthenticationRequestParameters() throws java.lang.Throwable {
        /*
            r10 = this;
            int r0 = atd.c.getSDKReferenceNumber.AuthenticationRequestParameters
            int r0 = r0 + 125
            int r1 = r0 % 128
            atd.c.getSDKReferenceNumber.getSDKReferenceNumber = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L20
            org.json.JSONObject r0 = super.AuthenticationRequestParameters()
            atd.am.getSDKReferenceNumber r3 = atd.am.getSDKReferenceNumber.ERROR_CODE
            java.lang.String r3 = r3.getSDKReferenceNumber()
            atd.h.getSDKReferenceNumber r4 = r10.getDeviceData
            r5 = 36
            int r5 = r5 / r2
            if (r4 == 0) goto L33
            goto L2e
        L20:
            org.json.JSONObject r0 = super.AuthenticationRequestParameters()
            atd.am.getSDKReferenceNumber r3 = atd.am.getSDKReferenceNumber.ERROR_CODE
            java.lang.String r3 = r3.getSDKReferenceNumber()
            atd.h.getSDKReferenceNumber r4 = r10.getDeviceData
            if (r4 == 0) goto L33
        L2e:
            java.lang.String r4 = r4.getSDKTransactionID()
            goto L3c
        L33:
            int r4 = atd.c.getSDKReferenceNumber.getSDKReferenceNumber
            int r4 = r4 + 125
            int r4 = r4 % 128
            atd.c.getSDKReferenceNumber.AuthenticationRequestParameters = r4
            r4 = r1
        L3c:
            r0.put(r3, r4)
            atd.am.getSDKReferenceNumber r3 = atd.am.getSDKReferenceNumber.ERROR_COMPONENT
            java.lang.String r3 = r3.getSDKReferenceNumber()
            int r4 = android.view.ViewConfiguration.getLongPressTimeout()
            int r4 = r4 >> 16
            r5 = 1
            int r4 = r4 + r5
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.String r7 = "䖯䗬觖ᰪ⒚"
            a(r7, r4, r6)
            r4 = r6[r2]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = r4.intern()
            r0.put(r3, r4)
            atd.am.getSDKReferenceNumber r3 = atd.am.getSDKReferenceNumber.ERROR_DESCRIPTION
            java.lang.String r3 = r3.getSDKReferenceNumber()
            atd.h.getSDKReferenceNumber r4 = r10.getDeviceData
            if (r4 == 0) goto L6d
            java.lang.String r1 = r4.getSDKAppID()
        L6d:
            r0.put(r3, r1)
            atd.am.getSDKReferenceNumber r1 = atd.am.getSDKReferenceNumber.ERROR_MESSAGE_TYPE
            java.lang.String r1 = r1.getSDKReferenceNumber()
            int r3 = android.view.ViewConfiguration.getTouchSlop()
            int r3 = r3 >> 8
            int r3 = 1 - r3
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.String r5 = "跢趡䠯怏唬힂嫈耂"
            a(r5, r3, r4)
            r2 = r4[r2]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = r2.intern()
            r0.put(r1, r2)
            atd.am.getSDKReferenceNumber r1 = atd.am.getSDKReferenceNumber.ERROR_DETAIL
            java.lang.String r1 = r1.getSDKReferenceNumber()
            atd.bc.AuthenticationRequestParameters r2 = r10.getSDKAppID
            java.lang.Object[] r7 = new java.lang.Object[]{r2}
            int r6 = atd.z.getSDKAppID.getSDKTransactionID.getSDKAppID()
            int r9 = atd.z.getSDKAppID.getSDKTransactionID.getSDKAppID()
            int r3 = atd.z.getSDKAppID.getSDKTransactionID.getSDKAppID()
            int r8 = atd.z.getSDKAppID.getSDKTransactionID.getSDKAppID()
            r5 = 600043858(0x23c3f152, float:2.1244145E-17)
            r4 = -600043858(0xffffffffdc3c0eae, float:-2.1173374E17)
            java.lang.Object r2 = atd.bc.AuthenticationRequestParameters.getDeviceData(r3, r4, r5, r6, r7, r8, r9)
            java.lang.String r2 = (java.lang.String) r2
            r0.put(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.c.getSDKReferenceNumber.AuthenticationRequestParameters():org.json.JSONObject");
    }

    @Override // atd.c.ChallengeResultCancelled
    public final void getSDKReferenceNumber() throws atd.bc.getSDKTransactionID {
        int i11 = AuthenticationRequestParameters + 13;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            super.getSDKReferenceNumber();
            this.getDeviceData = null;
            Object[] objArr = {this.getSDKAppID};
            atd.bc.AuthenticationRequestParameters.getDeviceData(getSDKAppID.getSDKTransactionID.getSDKAppID(), 762869508, -762869506, getSDKAppID.getSDKTransactionID.getSDKAppID(), objArr, getSDKAppID.getSDKTransactionID.getSDKAppID(), getSDKAppID.getSDKTransactionID.getSDKAppID());
            throw null;
        }
        super.getSDKReferenceNumber();
        this.getDeviceData = null;
        Object[] objArr2 = {this.getSDKAppID};
        atd.bc.AuthenticationRequestParameters.getDeviceData(getSDKAppID.getSDKTransactionID.getSDKAppID(), 762869508, -762869506, getSDKAppID.getSDKTransactionID.getSDKAppID(), objArr2, getSDKAppID.getSDKTransactionID.getSDKAppID(), getSDKAppID.getSDKTransactionID.getSDKAppID());
        getSDKReferenceNumber = (AuthenticationRequestParameters + 25) % 128;
    }

    @Override // atd.c.ChallengeResultCancelled
    public final boolean getSDKTransactionID() {
        int i11 = (getSDKReferenceNumber + 15) % 128;
        AuthenticationRequestParameters = i11;
        int i12 = i11 + 67;
        getSDKReferenceNumber = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 80 / 0;
        }
        return false;
    }
}
