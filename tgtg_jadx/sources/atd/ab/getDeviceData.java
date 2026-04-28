package atd.ab;

import android.view.View;
import android.view.ViewConfiguration;
import com.adyen.threeds2.CompletionEvent;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class getDeviceData implements CompletionEvent {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static long getDeviceData;
    private static int getSDKReferenceNumber;
    private static int getSDKTransactionID;
    private final String AuthenticationRequestParameters;
    private final String getSDKAppID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(short r6, byte r7, short r8) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 97
            byte[] r0 = atd.ab.getDeviceData.$$a
            int r7 = r7 * 2
            int r1 = r7 + 1
            int r8 = r8 * 3
            int r8 = 4 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r0
            r4 = r2
            r0 = r8
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r8]
            r5 = r0
            r0 = r8
            r8 = r3
            r3 = r5
        L2b:
            int r8 = -r8
            int r0 = r0 + 1
            int r6 = r6 + r8
            r8 = r0
            r0 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ab.getDeviceData.$$c(short, byte, short):java.lang.String");
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getSDKTransactionID = 0;
        getSDKReferenceNumber = 1;
        getDeviceData = -3449439431957578291L;
    }

    public getDeviceData(String str, String str2) {
        this.AuthenticationRequestParameters = str;
        this.getSDKAppID = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0102, code lost:
    
        r4[r7] = (char) r5[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0108, code lost:
    
        r0 = new java.lang.Object[]{r3, r3};
        r1 = atd.e.ChallengeResult.getSDKTransactionID(1456884118);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0112, code lost:
    
        if (r1 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0114, code lost:
    
        r8 = r22;
        r1 = (byte) 0;
        r3 = r1;
        r1 = atd.e.ChallengeResult.getDeviceData((android.util.TypedValue.complexToFraction(0, r8, r8) > r8 ? 1 : (android.util.TypedValue.complexToFraction(0, r8, r8) == r8 ? 0 : -1)) + 3095, (char) (14368 - (android.view.ViewConfiguration.getScrollFriction() > r8 ? 1 : (android.view.ViewConfiguration.getScrollFriction() == r8 ? 0 : -1))), android.view.KeyEvent.keyCodeFromString("") + 18, -1967239290, false, $$c(r1, r3, r3), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0141, code lost:
    
        ((java.lang.reflect.Method) r1).invoke(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0146, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(java.lang.String r23, int r24, java.lang.Object[] r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.ab.getDeviceData.a(java.lang.String, int, java.lang.Object[]):void");
    }

    public static void init$0() {
        $$a = new byte[]{4, -95, 14, -12};
        $$b = 230;
    }

    @Override // com.adyen.threeds2.CompletionEvent
    public final String getSDKTransactionID() {
        int i11 = getSDKTransactionID + 71;
        getSDKReferenceNumber = i11 % 128;
        int i12 = i11 % 2;
        String str = this.AuthenticationRequestParameters;
        if (i12 != 0) {
            return str;
        }
        throw null;
    }

    @Override // com.adyen.threeds2.CompletionEvent
    public final String getTransactionStatus() {
        int i11 = getSDKReferenceNumber + 67;
        int i12 = i11 % 128;
        getSDKTransactionID = i12;
        int i13 = i11 % 2;
        String str = this.getSDKAppID;
        if (i13 != 0) {
            throw null;
        }
        int i14 = i12 + 67;
        getSDKReferenceNumber = i14 % 128;
        if (i14 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String toString() throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr = new Object[1];
        a("搯\ude05ყ䪷贽쟈㦶簎뛎\ue8af⍸旀\udfa8ች品躱셱㮜緓", 47699 - View.combineMeasuredStates(0, 0), objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append(getSDKTransactionID());
        Object[] objArr2 = new Object[1];
        a("搯然亙⑱㇗ཕ\ue42e\uf197콩ꓓ뉌輦撢牪俦╘㈠ཱྀ\ue521\uf2a0", 5480 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr2);
        sb2.append(((String) objArr2[0]).intern());
        sb2.append(getTransactionStatus());
        String string = sb2.toString();
        getSDKTransactionID = (getSDKReferenceNumber + 101) % 128;
        return string;
    }
}
