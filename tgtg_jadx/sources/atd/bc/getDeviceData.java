package atd.bc;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0003H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0005H\u0002¨\u0006\u0006"}, d2 = {"destroy", "", "Lorg/json/JSONObject;", "Lorg/json/JSONArray;", "destroyValue", "", "threeds2_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nJSONExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JSONExtensions.kt\ncom/adyen/threeds2/internal/util/JSONExtensionsKt\n+ 2 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n32#2,2:37\n1863#3,2:39\n*S KotlinDebug\n*F\n+ 1 JSONExtensions.kt\ncom/adyen/threeds2/internal/util/JSONExtensionsKt\n*L\n10#1:37,2\n12#1:39,2\n*E\n"})
public final class getDeviceData {
    public static int AuthenticationRequestParameters = 0;
    private static int getDeviceData = 0;
    private static int getSDKAppID = 1;
    public static int getSDKReferenceNumber;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        r2 = r1.length();
        atd.bc.getDeviceData.getSDKAppID = (atd.bc.getDeviceData.getDeviceData + 9) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        if (r0 >= r2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        r3 = atd.bc.getDeviceData.getSDKAppID;
        atd.bc.getDeviceData.getDeviceData = w.a0.d((r3 & (-92)) | ((~r3) & 91), ~((r3 & 91) << 1), 1, 128);
        r3 = r1.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005f, code lost:
    
        if (r3 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        r8 = atd.bc.getDeviceData.getSDKAppID;
        r9 = r8 & 1;
        r8 = -(-((r8 ^ 1) | r9));
        atd.bc.getDeviceData.getDeviceData = ((r9 & r8) + (r8 | r9)) % 128;
        r14 = atd.ak.getDeviceData.getDeviceData();
        r12 = atd.ak.getDeviceData.getDeviceData();
        getSDKTransactionID(atd.ak.getDeviceData.getDeviceData(), r12, atd.ak.getDeviceData.getDeviceData(), r14, -504907962, new java.lang.Object[]{r3}, 504907962);
        r3 = atd.bc.getDeviceData.getSDKAppID;
        r8 = ((r3 & (-20)) | ((~r3) & 19)) + ((r3 & 19) << 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0097, code lost:
    
        atd.bc.getDeviceData.getDeviceData = r8 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009b, code lost:
    
        r3 = atd.bc.getDeviceData.getSDKAppID;
        r8 = ((r3 | 19) << 1) - (((~r3) & 19) | (r3 & (-20)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a7, code lost:
    
        r1.put(r0, (java.lang.Object) null);
        r0 = ((r0 & 1) << 1) + ((r0 & (-2)) | ((~r0) & 1));
        r3 = atd.bc.getDeviceData.getDeviceData;
        atd.bc.getDeviceData.getSDKAppID = w.a0.d(r3 & 109, ~(-(-(r3 | 109))), 1, 128);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c3, code lost:
    
        r0 = atd.bc.getDeviceData.getSDKAppID;
        r1 = r0 & 117;
        r0 = -(-(r0 | 117));
        atd.bc.getDeviceData.getDeviceData = ((r1 & r0) + (r0 | r1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d2, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001e, code lost:
    
        if (r1 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
    
        if (r1 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        r1 = r3 & 61;
        r0 = (((r3 ^ 61) | r1) << 1) - ((~r1) & (r3 | 61));
        atd.bc.getDeviceData.getDeviceData = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        if ((r0 % 2) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object AuthenticationRequestParameters(java.lang.Object[] r18) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.bc.getDeviceData.AuthenticationRequestParameters(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        r0 = new java.util.LinkedHashSet();
        r1 = r14.keys();
        r1.getClass();
        atd.bc.getDeviceData.getSDKAppID = (atd.bc.getDeviceData.getDeviceData + 111) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        if (r1.hasNext() == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
    
        r4 = atd.bc.getDeviceData.getSDKAppID;
        atd.bc.getDeviceData.getDeviceData = ((-2) - ((((r4 | 16) << 1) - (r4 ^ 16)) ^ (-1))) % 128;
        r4 = r1.next();
        r4.getClass();
        r0.add(r4);
        atd.ak.getDeviceData.getDeviceData();
        atd.ak.getDeviceData.getDeviceData();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        r1 = r0.iterator();
        r4 = atd.bc.getDeviceData.getDeviceData;
        r6 = r4 & 101;
        r4 = (r4 | 101) & (~r6);
        r6 = r6 << 1;
        atd.bc.getDeviceData.getSDKAppID = ((r4 ^ r6) + ((r4 & r6) << 1)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0095, code lost:
    
        if (r1.hasNext() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0097, code lost:
    
        r4 = atd.bc.getDeviceData.getSDKAppID;
        r6 = r4 ^ 67;
        r4 = -(-((r4 & 67) << 1));
        r7 = (r6 & r4) + (r4 | r6);
        atd.bc.getDeviceData.getDeviceData = r7 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00aa, code lost:
    
        if ((r7 % 2) != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ac, code lost:
    
        r4 = (java.lang.String) r1.next();
        r6 = r14.get(r4);
        r6.getClass();
        r10 = atd.ak.getDeviceData.getDeviceData();
        r8 = atd.ak.getDeviceData.getDeviceData();
        getSDKTransactionID(atd.ak.getDeviceData.getDeviceData(), r8, atd.ak.getDeviceData.getDeviceData(), r10, -504907962, new java.lang.Object[]{r6}, 504907962);
        r14.remove(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00da, code lost:
    
        r0 = (java.lang.String) r1.next();
        r1 = r14.get(r0);
        r1.getClass();
        r6 = atd.ak.getDeviceData.getDeviceData();
        r4 = atd.ak.getDeviceData.getDeviceData();
        getSDKTransactionID(atd.ak.getDeviceData.getDeviceData(), r4, atd.ak.getDeviceData.getDeviceData(), r6, -504907962, new java.lang.Object[]{r1}, 504907962);
        r14.remove(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0107, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0108, code lost:
    
        r0.clear();
        r14 = atd.bc.getDeviceData.getDeviceData;
        r0 = r14 & 113;
        atd.bc.getDeviceData.getSDKAppID = w.a0.d((r14 | 113) & (~r0), ~(-(-(r0 << 1))), 1, 128);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x011d, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if (r14 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (r14 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        r14 = r1 & 17;
        r0 = (~r14) & (r1 | 17);
        r14 = -(-(r14 << 1));
        r1 = ((r0 | r14) << 1) - (r14 ^ r0);
        atd.bc.getDeviceData.getDeviceData = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
    
        if ((r1 % 2) != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object getSDKAppID(java.lang.Object[] r14) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.bc.getDeviceData.getSDKAppID(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
        Object obj = objArr[0];
        int i11 = (getSDKAppID + 83) % 128;
        getDeviceData = i11;
        if (!(obj instanceof JSONObject)) {
            if (obj instanceof JSONArray) {
                getSDKAppID = ((-2) - ((i11 + 116) ^ (-1))) % 128;
                int deviceData = atd.ak.getDeviceData.getDeviceData();
                int deviceData2 = atd.ak.getDeviceData.getDeviceData();
                getSDKTransactionID(atd.ak.getDeviceData.getDeviceData(), deviceData2, atd.ak.getDeviceData.getDeviceData(), deviceData, -1662235184, new Object[]{(JSONArray) obj}, 1662235186);
                int i12 = getDeviceData;
                int i13 = i12 | 81;
                int i14 = i13 << 1;
                int i15 = -((~(i12 & 81)) & i13);
                getSDKAppID = ((i14 & i15) + (i15 | i14)) % 128;
            }
            int i16 = getDeviceData;
            int i17 = i16 & 89;
            int i18 = i17 + ((i16 ^ 89) | i17);
            getSDKAppID = i18 % 128;
            if (i18 % 2 != 0) {
                return null;
            }
            throw null;
        }
        int i19 = (i11 ^ 53) + ((i11 & 53) << 1);
        getSDKAppID = i19 % 128;
        if (i19 % 2 == 0) {
            int deviceData3 = atd.ak.getDeviceData.getDeviceData();
            int deviceData4 = atd.ak.getDeviceData.getDeviceData();
            getSDKTransactionID(atd.ak.getDeviceData.getDeviceData(), deviceData4, atd.ak.getDeviceData.getDeviceData(), deviceData3, -1676234569, new Object[]{(JSONObject) obj}, 1676234570);
            int i21 = 7 / 0;
        } else {
            int deviceData5 = atd.ak.getDeviceData.getDeviceData();
            int deviceData6 = atd.ak.getDeviceData.getDeviceData();
            getSDKTransactionID(atd.ak.getDeviceData.getDeviceData(), deviceData6, atd.ak.getDeviceData.getDeviceData(), deviceData5, -1676234569, new Object[]{(JSONObject) obj}, 1676234570);
        }
        int i22 = getSDKAppID;
        int i23 = i22 & 49;
        int i24 = (i22 | 49) & (~i23);
        int i25 = -(-(i23 << 1));
        getDeviceData = ((i24 & i25) + (i24 | i25)) % 128;
        return null;
    }

    public static /* synthetic */ Object getSDKTransactionID(int i11, int i12, int i13, int i14, int i15, Object[] objArr, int i16) {
        int i17 = ~i16;
        int i18 = ~i14;
        int i19 = ~(i17 | i18);
        int i21 = i17 | i15;
        int i22 = (~i21) | i19;
        int i23 = ~i15;
        int i24 = (~(i14 | i21)) | (~(i23 | i16)) | (~(i18 | i23));
        int i25 = (1912995840 * i13) + ((-1727660032) * i11) + (1065222144 * i12) + ((-1616703077) * i19) + (i24 * (-1616703077)) + ((-1061561142) * i22) + ((-1613042074) * i15) + ((-551480932) * i16) + 431816704;
        int iC = a0.c(i13, 461141949, ((-1017789379) * i11) + i16 + i15 + i12);
        int i26 = i12 * (-1063000885);
        int i27 = i11 * (-90181537);
        int i28 = i13 * (-1548859681);
        int iE = a0.e(iC, 816250880, i28 + i27 + i26 + (i19 * 489) + (i24 * 489) + (i22 * (-978)) + (i15 * (-1063001374)) + ((i16 * (-1063000396)) - 360994079), 1493368832, ((-1005256704) * iC) + i25);
        return iE != 1 ? iE != 2 ? getSDKTransactionID(objArr) : AuthenticationRequestParameters(objArr) : getSDKAppID(objArr);
    }

    public static final void getSDKTransactionID(@Nullable JSONObject jSONObject) {
        int deviceData = atd.ak.getDeviceData.getDeviceData();
        int deviceData2 = atd.ak.getDeviceData.getDeviceData();
        getSDKTransactionID(atd.ak.getDeviceData.getDeviceData(), deviceData2, atd.ak.getDeviceData.getDeviceData(), deviceData, -1676234569, new Object[]{jSONObject}, 1676234570);
    }

    private static final void AuthenticationRequestParameters(Object obj) {
        int deviceData = atd.ak.getDeviceData.getDeviceData();
        int deviceData2 = atd.ak.getDeviceData.getDeviceData();
        getSDKTransactionID(atd.ak.getDeviceData.getDeviceData(), deviceData2, atd.ak.getDeviceData.getDeviceData(), deviceData, -504907962, new Object[]{obj}, 504907962);
    }

    private static void AuthenticationRequestParameters(@Nullable JSONArray jSONArray) {
        int deviceData = atd.ak.getDeviceData.getDeviceData();
        int deviceData2 = atd.ak.getDeviceData.getDeviceData();
        getSDKTransactionID(atd.ak.getDeviceData.getDeviceData(), deviceData2, atd.ak.getDeviceData.getDeviceData(), deviceData, -1662235184, new Object[]{jSONArray}, 1662235186);
    }

    public static int getSDKAppID() {
        int i11 = getSDKReferenceNumber;
        int i12 = i11 % 6031423;
        getSDKReferenceNumber = i11 + 1;
        if (i12 != 0) {
            return AuthenticationRequestParameters;
        }
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        AuthenticationRequestParameters = iFreeMemory;
        return iFreeMemory;
    }
}
