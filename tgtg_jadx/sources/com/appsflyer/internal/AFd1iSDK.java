package com.appsflyer.internal;

import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.x0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rBE\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/appsflyer/internal/AFd1iSDK;", "Lcom/appsflyer/internal/AFd1cSDK;", "", "p0", "", "p1", "", "p2", "p3", "", "p4", "<init>", "(Ljava/lang/String;Ljava/util/Map;[BLjava/lang/String;Z)V", "AFa1zSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFd1iSDK extends AFd1cSDK {

    /* JADX INFO: renamed from: AFa1zSDK, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ AFd1iSDK(String str, Map map, byte[] bArr, String str2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i11 & 4) != 0 ? null : bArr, (i11 & 8) != 0 ? "GET" : str2, (i11 & 16) != 0 ? false : z11);
    }

    @NotNull
    public static final AFd1iSDK getMonetizationNetwork(@NotNull String str, @Nullable String str2, @NotNull String str3, @NotNull String str4) {
        str.getClass();
        str3.getClass();
        str4.getClass();
        String currencyIso4217Code = Companion.getCurrencyIso4217Code(str, str2, str3);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        AFd1iSDK aFd1iSDK = new AFd1iSDK(currencyIso4217Code, x0.e(new Pair("Connection", "close"), new Pair("af_request_epoch_ms", strValueOf), new Pair("af_sig", Companion.getMediationNetwork(str, str3, str2, str4, strValueOf))), null, null, false, 28, null);
        aFd1iSDK.areAllFieldsValid = 10000;
        return aFd1iSDK;
    }

    /* JADX INFO: renamed from: com.appsflyer.internal.AFd1iSDK$AFa1zSDK, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\n\u001a\u0006*\u00020\u00040\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/appsflyer/internal/AFd1iSDK$AFa1zSDK;", "", "<init>", "()V", "", "p0", "p1", "p2", "p3", "p4", "getMediationNetwork", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getCurrencyIso4217Code", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static String getCurrencyIso4217Code(String p02, String p12, String p22) {
            return String.format(AFd1mSDK.getRevenue, AppsFlyerLib.getInstance().getHostPrefix(), AFa1tSDK.getMediationNetwork().getHostName()) + p02 + p22 + "?device_id=" + p12;
        }

        public static String getMediationNetwork(@NotNull String p02, @NotNull String p12, @Nullable String p22, @NotNull String p32, @NotNull String p42) {
            p02.getClass();
            p12.getClass();
            p32.getClass();
            p42.getClass();
            return AFj1jSDK.getCurrencyIso4217Code(TextUtils.join("\u2063", new String[]{p42, p22, p02 + p12}), p32);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private AFd1iSDK(String str, Map<String, String> map, byte[] bArr, String str2, boolean z11) {
        super(str, bArr, str2, map, z11);
    }
}
