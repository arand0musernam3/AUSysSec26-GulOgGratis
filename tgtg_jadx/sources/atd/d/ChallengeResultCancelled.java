package atd.d;

import atd.n.ChallengeResultError;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import n90.b;
import n90.b0;
import n90.c;
import n90.e;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "Ln90/b0;", "decodeToJsonObject", "(Ljava/lang/String;)Ln90/b0;", "Lorg/json/JSONObject;", "toJSONObject", "(Ln90/b0;)Lorg/json/JSONObject;", "Ln90/e;", "Lorg/json/JSONArray;", "toJSONArray", "(Ln90/e;)Lorg/json/JSONArray;", "threeds2_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nJsonExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonExtensions.kt\ncom/adyen/threeds2/internal/api/JsonExtensionsKt\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,47:1\n147#2:48\n462#3:49\n412#3:50\n1246#4,4:51\n1797#4,3:55\n*S KotlinDebug\n*F\n+ 1 JsonExtensions.kt\ncom/adyen/threeds2/internal/api/JsonExtensionsKt\n*L\n14#1:48\n24#1:49\n24#1:50\n24#1:51,4\n38#1:55,3\n*E\n"})
public final class ChallengeResultCancelled {
    private static int AuthenticationRequestParameters = 1;
    private static int getSDKAppID;

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
        String str = (String) objArr[0];
        int i11 = AuthenticationRequestParameters;
        int i12 = (i11 & (-78)) | ((~i11) & 77);
        int i13 = -(-((i11 & 77) << 1));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        getSDKAppID = i14 % 128;
        if (i14 % 2 == 0) {
            str.getClass();
            b bVar = c.f30748d;
            bVar.getClass();
            return (b0) bVar.b(b0.Companion.serializer(), str);
        }
        str.getClass();
        b bVar2 = c.f30748d;
        bVar2.getClass();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007e A[PHI: r4 r7 r8
      0x007e: PHI (r4v15 java.util.Map$Entry) = (r4v14 java.util.Map$Entry), (r4v56 java.util.Map$Entry) binds: [B:11:0x007c, B:8:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x007e: PHI (r7v2 java.lang.Object) = (r7v1 java.lang.Object), (r7v5 java.lang.Object) binds: [B:11:0x007c, B:8:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x007e: PHI (r8v1 java.lang.Object) = (r8v0 java.lang.Object), (r8v45 java.lang.Object) binds: [B:11:0x007c, B:8:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0093 A[PHI: r4 r7
      0x0093: PHI (r4v54 java.util.Map$Entry) = (r4v14 java.util.Map$Entry), (r4v56 java.util.Map$Entry) binds: [B:11:0x007c, B:8:0x0069] A[DONT_GENERATE, DONT_INLINE]
      0x0093: PHI (r7v4 java.lang.Object) = (r7v1 java.lang.Object), (r7v5 java.lang.Object) binds: [B:11:0x007c, B:8:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Object getSDKReferenceNumber(java.lang.Object[] r19) {
        /*
            Method dump skipped, instruction units count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.d.ChallengeResultCancelled.getSDKReferenceNumber(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Object getSDKTransactionID(java.lang.Object[] r17) {
        /*
            Method dump skipped, instruction units count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.d.ChallengeResultCancelled.getSDKTransactionID(java.lang.Object[]):java.lang.Object");
    }

    private static final JSONArray AuthenticationRequestParameters(e eVar) throws JSONException {
        int sDKAppID = ChallengeResultError.getDeviceData.getSDKAppID();
        int sDKAppID2 = ChallengeResultError.getDeviceData.getSDKAppID();
        return (JSONArray) getSDKTransactionID(-202086970, sDKAppID, new Object[]{eVar}, 202086971, ChallengeResultError.getDeviceData.getSDKAppID(), ChallengeResultError.getDeviceData.getSDKAppID(), sDKAppID2);
    }

    @NotNull
    public static final JSONObject AuthenticationRequestParameters(@NotNull b0 b0Var) throws JSONException {
        int sDKAppID = ChallengeResultError.getDeviceData.getSDKAppID();
        int sDKAppID2 = ChallengeResultError.getDeviceData.getSDKAppID();
        return (JSONObject) getSDKTransactionID(13061488, sDKAppID, new Object[]{b0Var}, -13061488, ChallengeResultError.getDeviceData.getSDKAppID(), ChallengeResultError.getDeviceData.getSDKAppID(), sDKAppID2);
    }

    public static /* synthetic */ Object getSDKTransactionID(int i11, int i12, Object[] objArr, int i13, int i14, int i15, int i16) {
        int i17 = ~i13;
        int i18 = ~i12;
        int i19 = ~(i17 | i18);
        int i21 = ~(i17 | i11);
        int i22 = i19 | i21 | (~(i18 | i11));
        int i23 = i12 | i21;
        int i24 = ~i11;
        int i25 = (~(i12 | i24 | i13)) | (~(i17 | i24 | i18)) | (~(i18 | i13 | i11));
        int i26 = (1577058304 * i14) + (494927872 * i15) + (276824064 * i16) + (935884852 * i25) + (i23 * 935884852) + ((-1871769704) * i22) + ((-659060787) * i11) + ((1212708917 * i13) - 1912602624);
        int iC = a0.c(i14, -1277752516, ((-1329026341) * i15) + i13 + i11 + i16);
        int i27 = i16 * 595972219;
        int i28 = i15 * (-1341978823);
        int i29 = i14 * 731850196;
        int iE = a0.e(iC, 1869086720, i29 + i28 + i27 + (i25 * 252) + (i23 * 252) + (i22 * (-504)) + (i11 * 595971967) + (i13 * 595972471) + 129777640, -846725120, ((-1783103488) * iC) + i26);
        return iE != 1 ? iE != 2 ? getSDKReferenceNumber(objArr) : AuthenticationRequestParameters(objArr) : getSDKTransactionID(objArr);
    }

    @NotNull
    public static final b0 getSDKReferenceNumber(@NotNull String str) throws IllegalArgumentException {
        int sDKAppID = ChallengeResultError.getDeviceData.getSDKAppID();
        int sDKAppID2 = ChallengeResultError.getDeviceData.getSDKAppID();
        return (b0) getSDKTransactionID(-526590508, sDKAppID, new Object[]{str}, 526590510, ChallengeResultError.getDeviceData.getSDKAppID(), ChallengeResultError.getDeviceData.getSDKAppID(), sDKAppID2);
    }
}
