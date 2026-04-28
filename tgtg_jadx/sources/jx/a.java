package jx;

import android.adservices.common.AdData;
import android.adservices.common.AdSelectionSignals;
import android.adservices.common.AdTechIdentifier;
import android.adservices.customaudience.CustomAudience;
import android.adservices.customaudience.CustomAudienceManager;
import android.adservices.customaudience.JoinCustomAudienceRequest;
import android.adservices.customaudience.TrustedBiddingData;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import ax.a0;
import ix.b;
import java.util.concurrent.Executors;
import kotlin.collections.c0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f25431a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f25432b = "Fledge: ".concat(a.class.getSimpleName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f25433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f25434d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static CustomAudienceManager f25435e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static hx.a f25436f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static String f25437g;

    public static final void a() {
        String string;
        if (yx.a.f46339a.contains(a.class)) {
            return;
        }
        try {
            f25434d = true;
            Context contextA = a0.a();
            f25436f = new hx.a(contextA);
            f25437g = "https://www." + a0.f4866s + "/privacy_sandbox/pa/logic";
            hx.a aVar = null;
            try {
                CustomAudienceManager customAudienceManager = CustomAudienceManager.get(contextA);
                f25435e = customAudienceManager;
                if (customAudienceManager != null) {
                    f25433c = true;
                }
                string = null;
            } catch (Error e5) {
                string = e5.toString();
                Log.w(f25432b, "Failed to get CustomAudienceManager: " + e5);
            } catch (Exception e11) {
                string = e11.toString();
                Log.w(f25432b, "Failed to get CustomAudienceManager: " + e11);
            }
            if (f25433c) {
                return;
            }
            hx.a aVar2 = f25436f;
            if (aVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
            } else {
                aVar = aVar2;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gps_pa_failed_reason", string);
            aVar.a(bundle, "gps_pa_failed");
        } catch (Throwable th2) {
            yx.a.a(a.class, th2);
        }
    }

    public final void b(String str, String str2) {
        String str3 = f25432b;
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            String strC = c(str, str2);
            if (strC == null) {
                return;
            }
            hx.a aVar = null;
            try {
                b bVar = new b(1);
                AdData.Builder builder = new AdData.Builder();
                StringBuilder sb2 = new StringBuilder();
                String str4 = f25437g;
                if (str4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("baseUri");
                    str4 = null;
                }
                sb2.append(str4);
                sb2.append("/ad");
                Uri uri = Uri.parse(sb2.toString());
                uri.getClass();
                AdData adDataBuild = builder.setRenderUri(uri).setMetadata("{'isRealAd': false}").build();
                adDataBuild.getClass();
                TrustedBiddingData.Builder builder2 = new TrustedBiddingData.Builder();
                StringBuilder sb3 = new StringBuilder();
                String str5 = f25437g;
                if (str5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("baseUri");
                    str5 = null;
                }
                sb3.append(str5);
                sb3.append("?trusted_bidding");
                Uri uri2 = Uri.parse(sb3.toString());
                uri2.getClass();
                TrustedBiddingData trustedBiddingDataBuild = builder2.setTrustedBiddingUri(uri2).setTrustedBiddingKeys(c0.c("")).build();
                trustedBiddingDataBuild.getClass();
                CustomAudience.Builder buyer = new CustomAudience.Builder().setName(strC).setBuyer(AdTechIdentifier.fromString("facebook.com"));
                StringBuilder sb4 = new StringBuilder();
                String str6 = f25437g;
                if (str6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("baseUri");
                    str6 = null;
                }
                sb4.append(str6);
                sb4.append("?daily&app_id=");
                sb4.append(str);
                Uri uri3 = Uri.parse(sb4.toString());
                uri3.getClass();
                CustomAudience.Builder dailyUpdateUri = buyer.setDailyUpdateUri(uri3);
                StringBuilder sb5 = new StringBuilder();
                String str7 = f25437g;
                if (str7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("baseUri");
                    str7 = null;
                }
                sb5.append(str7);
                sb5.append("?bidding");
                Uri uri4 = Uri.parse(sb5.toString());
                uri4.getClass();
                CustomAudience customAudienceBuild = dailyUpdateUri.setBiddingLogicUri(uri4).setTrustedBiddingData(trustedBiddingDataBuild).setUserBiddingSignals(AdSelectionSignals.fromString("{}")).setAds(c0.c(adDataBuild)).build();
                customAudienceBuild.getClass();
                JoinCustomAudienceRequest joinCustomAudienceRequestBuild = new JoinCustomAudienceRequest.Builder().setCustomAudience(customAudienceBuild).build();
                joinCustomAudienceRequestBuild.getClass();
                CustomAudienceManager customAudienceManager = f25435e;
                if (customAudienceManager != null) {
                    customAudienceManager.joinCustomAudience(joinCustomAudienceRequestBuild, Executors.newSingleThreadExecutor(), bVar);
                }
            } catch (Error e5) {
                Log.w(str3, "Failed to join Custom Audience: " + e5);
                hx.a aVar2 = f25436f;
                if (aVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                } else {
                    aVar = aVar2;
                }
                Bundle bundle = new Bundle();
                bundle.putString("gps_pa_failed_reason", e5.toString());
                aVar.a(bundle, "gps_pa_failed");
            } catch (Exception e11) {
                Log.w(str3, "Failed to join Custom Audience: " + e11);
                hx.a aVar3 = f25436f;
                if (aVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("gpsDebugLogger");
                } else {
                    aVar = aVar3;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("gps_pa_failed_reason", e11.toString());
                aVar.a(bundle2, "gps_pa_failed");
            }
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    public final String c(String str, String str2) {
        if (!yx.a.f46339a.contains(this) && str2 != null) {
            try {
                if (!Intrinsics.areEqual(str2, "_removed_") && !StringsKt.z(str2, "gps", false)) {
                    return str + '@' + str2 + '@' + (System.currentTimeMillis() / ((long) 1000)) + "@1";
                }
            } catch (Throwable th2) {
                yx.a.a(this, th2);
                return null;
            }
        }
        return null;
    }
}
