package atd.i;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import atd.d.getSDKReferenceNumber;
import atd.e.getSDKAppID;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.ByteCompanionObject;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class AuthenticationRequestParameters {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$c = null;
    private static final int $$d = 0;
    private static int $10;
    private static int $11;
    private static int AuthenticationRequestParameters;
    private static int getDeviceData;
    private static char getSDKAppID;
    private static int getSDKReferenceNumber;
    private static long getSDKTransactionID;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$e(int r6, int r7, short r8) {
        /*
            byte[] r0 = atd.i.AuthenticationRequestParameters.$$c
            int r7 = r7 + 4
            int r8 = r8 * 2
            int r8 = 1 - r8
            int r6 = r6 + 68
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r6 = r7
            r3 = r8
            r5 = r2
            goto L28
        L13:
            r3 = r7
            r7 = r6
            r6 = r3
            r3 = r2
        L17:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            r3 = r0[r6]
        L28:
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.i.AuthenticationRequestParameters.$$e(int, int, short):java.lang.String");
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        AuthenticationRequestParameters = 0;
        getSDKReferenceNumber = 1;
        getSDKTransactionID = 1905653906042338631L;
        getDeviceData = -889844589;
        getSDKAppID = (char) 15687;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v13 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v16 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v22 */
    /* JADX WARN: Type inference failed for: r19v23 */
    /* JADX WARN: Type inference failed for: r19v24 */
    /* JADX WARN: Type inference failed for: r19v25 */
    /* JADX WARN: Type inference failed for: r19v26 */
    /* JADX WARN: Type inference failed for: r19v27 */
    /* JADX WARN: Type inference failed for: r19v28 */
    /* JADX WARN: Type inference failed for: r19v29 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v30 */
    /* JADX WARN: Type inference failed for: r19v31 */
    /* JADX WARN: Type inference failed for: r19v32 */
    /* JADX WARN: Type inference failed for: r19v33 */
    /* JADX WARN: Type inference failed for: r19v34 */
    /* JADX WARN: Type inference failed for: r19v35 */
    /* JADX WARN: Type inference failed for: r19v36 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] AuthenticationRequestParameters(android.content.Context r28, int r29, int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 1540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.i.AuthenticationRequestParameters.AuthenticationRequestParameters(android.content.Context, int, int, int):java.lang.Object[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(java.lang.String r29, java.lang.String r30, java.lang.String r31, int r32, char r33, java.lang.Object[] r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.i.AuthenticationRequestParameters.a(java.lang.String, java.lang.String, java.lang.String, int, char, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(byte r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 + 4
            byte[] r0 = atd.i.AuthenticationRequestParameters.$$a
            int r6 = 104 - r6
            int r1 = r7 + 2
            byte[] r1 = new byte[r1]
            int r7 = r7 + 1
            r2 = -1
            if (r0 != 0) goto L12
            r6 = r5
            r3 = r7
            goto L27
        L12:
            r4 = r6
            r6 = r5
            r5 = r4
        L15:
            int r2 = r2 + 1
            byte r3 = (byte) r5
            r1[r2] = r3
            if (r2 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            r8[r6] = r5
            return
        L25:
            r3 = r0[r6]
        L27:
            int r3 = -r3
            int r5 = r5 + r3
            int r6 = r6 + 1
            int r5 = r5 + (-2)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.i.AuthenticationRequestParameters.b(byte, byte, short, java.lang.Object[]):void");
    }

    public static Map<String, List<String>> getDeviceData() throws Throwable {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        getSDKReferenceNumber.getDeviceData getdevicedata = getSDKReferenceNumber.getDeviceData.APPLICATION_JOSE;
        List listAsList = Arrays.asList(getdevicedata.getSDKAppID(getSDKAppID.getSDKAppID).getSDKAppID());
        Object[] objArr = new Object[1];
        a("\u0000\u0000\u0000\u0000", "폎吿繝쩞", "㨕ꭳ䬐쇉惽籲慪딂屋룚솖峎", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), objArr);
        linkedHashMap.put(((String) objArr[0]).intern(), listAsList);
        List listAsList2 = Arrays.asList(getdevicedata.getSDKReferenceNumber(), getSDKReferenceNumber.getDeviceData.APPLICATION_JSON.getSDKReferenceNumber());
        Object[] objArr2 = new Object[1];
        a("\u0000\u0000\u0000\u0000", "䇌«⁈\ue891", "ꮠ\ue2bdᯫ齆瀡ⶊ", ViewConfiguration.getMaximumFlingVelocity() >> 16, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 37152), objArr2);
        linkedHashMap.put(((String) objArr2[0]).intern(), listAsList2);
        int i11 = AuthenticationRequestParameters + 85;
        getSDKReferenceNumber = i11 % 128;
        if (i11 % 2 != 0) {
            return linkedHashMap;
        }
        throw null;
    }

    public static Map<String, List<String>> getSDKAppID() throws Throwable {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        getSDKReferenceNumber.getDeviceData getdevicedata = getSDKReferenceNumber.getDeviceData.APPLICATION_JSON;
        List listAsList = Arrays.asList(getdevicedata.getSDKAppID(getSDKAppID.getSDKAppID).getSDKAppID());
        Object[] objArr = new Object[1];
        a("\u0000\u0000\u0000\u0000", "폎吿繝쩞", "㨕ꭳ䬐쇉惽籲慪딂屋룚솖峎", (-1) - TextUtils.lastIndexOf("", '0', 0, 0), (char) KeyEvent.normalizeMetaState(0), objArr);
        linkedHashMap.put(((String) objArr[0]).intern(), listAsList);
        List listAsList2 = Arrays.asList(getdevicedata.getSDKReferenceNumber());
        Object[] objArr2 = new Object[1];
        a("\u0000\u0000\u0000\u0000", "䇌«⁈\ue891", "ꮠ\ue2bdᯫ齆瀡ⶊ", ViewConfiguration.getMaximumDrawingCacheSize() >> 24, (char) (View.MeasureSpec.getSize(0) + 37152), objArr2);
        linkedHashMap.put(((String) objArr2[0]).intern(), listAsList2);
        int i11 = getSDKReferenceNumber + 119;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 37 / 0;
        }
        return linkedHashMap;
    }

    public static void init$0() {
        $$a = new byte[]{82, 88, 59, -83, 0, -17, 31, 13, -9, 8, -49, -2, 37, 3, 0, -17, 31, 13, -9, -11, -32, 15, -15, -7, 16, -4, -19, 9, -8, -1, 35, 3, -3, 3, -3, 50};
        $$b = 212;
    }

    public static void init$1() {
        $$c = new byte[]{ByteCompanionObject.MAX_VALUE, 102, 3, -17};
        $$d = 88;
    }

    public static JSONObject getSDKAppID(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        getSDKReferenceNumber = (AuthenticationRequestParameters + 53) % 128;
        while (itKeys.hasNext()) {
            int i11 = AuthenticationRequestParameters + 99;
            getSDKReferenceNumber = i11 % 128;
            if (i11 % 2 != 0) {
                String next = itKeys.next();
                jSONObject3.put(next, jSONObject.get(next));
            } else {
                String next2 = itKeys.next();
                jSONObject3.put(next2, jSONObject.get(next2));
                throw null;
            }
        }
        Iterator<String> itKeys2 = jSONObject2.keys();
        getSDKReferenceNumber = (AuthenticationRequestParameters + 61) % 128;
        while (itKeys2.hasNext()) {
            getSDKReferenceNumber = (AuthenticationRequestParameters + 77) % 128;
            String next3 = itKeys2.next();
            jSONObject3.put(next3, jSONObject2.get(next3));
        }
        int i12 = getSDKReferenceNumber + 25;
        AuthenticationRequestParameters = i12 % 128;
        if (i12 % 2 == 0) {
            return jSONObject3;
        }
        throw null;
    }
}
