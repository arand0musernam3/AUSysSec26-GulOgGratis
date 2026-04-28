package com.appsflyer.internal;

import android.util.Base64;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.y;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0012\u001a\u00020\u00068\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0010\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018"}, d2 = {"Lcom/appsflyer/internal/AFc1bSDK;", "", "", "p0", "p1", "p2", "", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lorg/json/JSONObject;", "getMonetizationNetwork", "()Lorg/json/JSONObject;", "getRevenue", "()Ljava/lang/String;", "toString", "AFAdRevenueData", "I", "getMediationNetwork", "Ljava/lang/String;", "AFa1tSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AFc1bSDK {

    /* JADX INFO: renamed from: AFa1tSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AFAdRevenueData, reason: from kotlin metadata */
    int getRevenue;

    /* JADX INFO: renamed from: getMediationNetwork, reason: from kotlin metadata */
    @NotNull
    final String getMonetizationNetwork;

    /* JADX INFO: renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    @NotNull
    public String AFAdRevenueData;

    /* JADX INFO: renamed from: getRevenue, reason: from kotlin metadata */
    @NotNull
    public String getMediationNetwork;

    public AFc1bSDK(@NotNull String str, @NotNull String str2, @NotNull String str3, int i11) {
        a0.C(str, str2, str3);
        this.getMediationNetwork = str;
        this.getMonetizationNetwork = str2;
        this.AFAdRevenueData = str3;
        this.getRevenue = i11;
    }

    public final boolean equals(@Nullable Object p02) {
        if (this == p02) {
            return true;
        }
        if (!(p02 instanceof AFc1bSDK)) {
            return false;
        }
        AFc1bSDK aFc1bSDK = (AFc1bSDK) p02;
        return Intrinsics.areEqual(this.getMediationNetwork, aFc1bSDK.getMediationNetwork) && Intrinsics.areEqual(this.getMonetizationNetwork, aFc1bSDK.getMonetizationNetwork) && Intrinsics.areEqual(this.AFAdRevenueData, aFc1bSDK.AFAdRevenueData) && this.getRevenue == aFc1bSDK.getRevenue;
    }

    @NotNull
    public final JSONObject getMonetizationNetwork() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AnnotatedPrivateKey.LABEL, this.getMediationNetwork);
        jSONObject.put("hash_name", this.getMonetizationNetwork);
        jSONObject.put("st", this.AFAdRevenueData);
        jSONObject.put("c", String.valueOf(this.getRevenue));
        return jSONObject;
    }

    @NotNull
    public final String getRevenue() {
        String str = this.getMediationNetwork;
        str.getClass();
        Charset charset = Charsets.UTF_8;
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        String strEncodeToString = Base64.encodeToString(bytes, 2);
        String str2 = this.getMonetizationNetwork;
        str2.getClass();
        byte[] bytes2 = str2.getBytes(charset);
        bytes2.getClass();
        String strEncodeToString2 = Base64.encodeToString(bytes2, 2);
        String str3 = this.AFAdRevenueData;
        str3.getClass();
        byte[] bytes3 = str3.getBytes(charset);
        bytes3.getClass();
        String strEncodeToString3 = Base64.encodeToString(bytes3, 2);
        int i11 = this.getRevenue;
        StringBuilder sbT = e0.f.t("label=", strEncodeToString, "\nhashName=", strEncodeToString2, "\nstackTrace=");
        sbT.append(strEncodeToString3);
        sbT.append("\nc=");
        sbT.append(i11);
        return sbT.toString();
    }

    public final int hashCode() {
        return Integer.hashCode(this.getRevenue) + ((this.AFAdRevenueData.hashCode() + ((this.getMonetizationNetwork.hashCode() + (this.getMediationNetwork.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.getMediationNetwork;
        String str2 = this.getMonetizationNetwork;
        String str3 = this.AFAdRevenueData;
        int i11 = this.getRevenue;
        StringBuilder sbT = e0.f.t("ExceptionInfo(label=", str, ", hashName=", str2, ", stackTrace=");
        sbT.append(str3);
        sbT.append(", counter=");
        sbT.append(i11);
        sbT.append(")");
        return sbT.toString();
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFc1bSDK$AFa1tSDK, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006\"\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\r\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000f"}, d2 = {"Lcom/appsflyer/internal/AFc1bSDK$AFa1tSDK;", "", "<init>", "()V", "", "p0", "", "", "p1", "", "getMediationNetwork", "(Ljava/lang/Integer;[Ljava/lang/String;)Z", "Lcom/appsflyer/internal/AFc1bSDK;", "AFAdRevenueData", "(Ljava/lang/String;)Lcom/appsflyer/internal/AFc1bSDK;", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nExceptionInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExceptionInfo.kt\ncom/appsflyer/internal/components/monitorsdk/exmanager/ExceptionInfo$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,94:1\n13579#2,2:95\n*S KotlinDebug\n*F\n+ 1 ExceptionInfo.kt\ncom/appsflyer/internal/components/monitorsdk/exmanager/ExceptionInfo$Companion\n*L\n65#1:95,2\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        @Nullable
        public static AFc1bSDK AFAdRevenueData(@NotNull String p02) {
            p02.getClass();
            List<String> listSplit$default = StringsKt__StringsKt.split$default(p02, new String[]{"\n"}, false, 0, 6, null);
            if (listSplit$default.size() == 4) {
                String strAFAdRevenueData = null;
                String strAFAdRevenueData2 = null;
                String strAFAdRevenueData3 = null;
                Integer numValueOf = null;
                for (String str : listSplit$default) {
                    if (y.p(str, "label=", false)) {
                        strAFAdRevenueData = AFAdRevenueData(str, "label=");
                    } else if (y.p(str, "hashName=", false)) {
                        strAFAdRevenueData2 = AFAdRevenueData(str, "hashName=");
                    } else if (!y.p(str, "stackTrace=", false)) {
                        if (!y.p(str, "c=", false)) {
                            break;
                        }
                        numValueOf = Integer.valueOf(Integer.parseInt(StringsKt.e0(str.substring(2)).toString()));
                    } else {
                        strAFAdRevenueData3 = AFAdRevenueData(str, "stackTrace=");
                    }
                }
                if (!getMediationNetwork(numValueOf, strAFAdRevenueData, strAFAdRevenueData2, strAFAdRevenueData3)) {
                    strAFAdRevenueData.getClass();
                    strAFAdRevenueData2.getClass();
                    strAFAdRevenueData3.getClass();
                    numValueOf.getClass();
                    return new AFc1bSDK(strAFAdRevenueData, strAFAdRevenueData2, strAFAdRevenueData3, numValueOf.intValue());
                }
            }
            return null;
        }

        private static boolean getMediationNetwork(Integer p02, String... p12) {
            boolean z11 = p02 == null;
            int length = p12.length;
            for (int i11 = 0; i11 < 3; i11++) {
                String str = p12[i11];
                z11 = z11 || str == null || str.length() == 0;
            }
            return z11;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static String AFAdRevenueData(String str, String str2) {
            String string = StringsKt.e0(str.substring(str2.length())).toString();
            string.getClass();
            Charset charset = Charsets.UTF_8;
            byte[] bytes = string.getBytes(charset);
            bytes.getClass();
            bytes.getClass();
            byte[] bArrDecode = Base64.decode(bytes, 2);
            bArrDecode.getClass();
            return new String(bArrDecode, charset);
        }
    }

    public /* synthetic */ AFc1bSDK(String str, String str2, String str3, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i12 & 8) != 0 ? 1 : i11);
    }
}
