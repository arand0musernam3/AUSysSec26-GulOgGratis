package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import com.appsflyer.internal.AFj1ySDK;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nMetaReferrer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MetaReferrer.kt\ncom/appsflyer/internal/referrer/MetaReferrer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,295:1\n1#2:296\n*E\n"})
public final class AFj1xSDK extends AFi1hSDK {

    @NotNull
    private final Runnable component1;

    @NotNull
    private final AFj1vSDK component3;

    @Nullable
    private String equals;

    @NotNull
    private final AFc1kSDK getMediationNetwork;

    @NotNull
    private final ExecutorService getMonetizationNetwork;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public /* synthetic */ class AFa1vSDK {
        public static final /* synthetic */ int[] getCurrencyIso4217Code;

        static {
            int[] iArr = new int[AFj1vSDK.values().length];
            try {
                iArr[AFj1vSDK.FACEBOOK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFj1vSDK.INSTAGRAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AFj1vSDK.FACEBOOK_LITE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            getCurrencyIso4217Code = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AFj1xSDK(@NotNull AFc1kSDK aFc1kSDK, @NotNull ExecutorService executorService, @NotNull AFj1vSDK aFj1vSDK, @NotNull Runnable runnable, @NotNull Runnable runnable2) {
        String str;
        aFc1kSDK.getClass();
        executorService.getClass();
        aFj1vSDK.getClass();
        runnable.getClass();
        runnable2.getClass();
        int i11 = AFj1ySDK.AFa1ySDK.getMediationNetwork[aFj1vSDK.ordinal()];
        if (i11 == 1) {
            str = "facebook";
        } else if (i11 == 2) {
            str = "instagram";
        } else {
            if (i11 != 3) {
                e40.a.f();
                throw null;
            }
            str = "facebook_lite";
        }
        super("app", str, aFc1kSDK, runnable);
        this.getMediationNetwork = aFc1kSDK;
        this.getMonetizationNetwork = executorService;
        this.component3 = aFj1vSDK;
        this.component1 = runnable2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e8 A[Catch: all -> 0x0069, TRY_LEAVE, TryCatch #3 {all -> 0x0069, blocks: (B:3:0x0035, B:8:0x004a, B:10:0x0050, B:27:0x00e8, B:13:0x0071, B:15:0x0082, B:16:0x0087, B:17:0x0088, B:19:0x008e, B:20:0x00a6, B:21:0x00b6, B:23:0x00bc, B:24:0x00d4), top: B:95:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0227  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AFAdRevenueData(com.appsflyer.internal.AFj1xSDK r31, android.content.Context r32) {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1xSDK.AFAdRevenueData(com.appsflyer.internal.AFj1xSDK, android.content.Context):void");
    }

    private static boolean component1(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.lite.provider.InstallReferrerProvider", 0) != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008d A[PHI: r0
      0x008d: PHI (r0v7 java.lang.String) = (r0v6 java.lang.String), (r0v13 java.lang.String), (r0v19 java.lang.String) binds: [B:14:0x003c, B:23:0x0063, B:32:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean getCurrencyIso4217Code(android.content.Context r12) {
        /*
            r11 = this;
            boolean r0 = r11.getMonetizationNetwork()
            r1 = 0
            if (r0 != 0) goto L14
            com.appsflyer.AFLogger r2 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r3 = com.appsflyer.internal.AFg1cSDK.META_REFERRER
            r6 = 4
            r7 = 0
            java.lang.String r4 = "Referrer collection disallowed by counter."
            r5 = 0
            com.appsflyer.internal.AFg1hSDK.d$default(r2, r3, r4, r5, r6, r7)
            return r1
        L14:
            com.appsflyer.internal.AFc1kSDK r0 = r11.getMediationNetwork
            java.lang.String r2 = "com.facebook.sdk.ApplicationId"
            java.lang.String r0 = r0.getMonetizationNetwork(r2)
            java.lang.String r2 = "fb"
            r3 = 0
            if (r0 == 0) goto L26
            java.lang.String r0 = kotlin.text.StringsKt.N(r0, r2)
            goto L27
        L26:
            r0 = r3
        L27:
            if (r0 == 0) goto L2f
            int r4 = r0.length()
            if (r4 != 0) goto L3c
        L2f:
            com.appsflyer.AFLogger r5 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r6 = com.appsflyer.internal.AFg1cSDK.META_REFERRER
            r9 = 4
            r10 = 0
            java.lang.String r7 = "Facebook app id Manifest metadata is not found."
            r8 = 0
            com.appsflyer.internal.AFg1hSDK.d$default(r5, r6, r7, r8, r9, r10)
            r0 = r3
        L3c:
            if (r0 != 0) goto L8d
            com.appsflyer.internal.AFc1kSDK r0 = r11.getMediationNetwork
            java.lang.String r4 = "facebook_application_id"
            java.lang.String r0 = r0.getRevenue(r4)
            if (r0 == 0) goto L4d
            java.lang.String r0 = kotlin.text.StringsKt.N(r0, r2)
            goto L4e
        L4d:
            r0 = r3
        L4e:
            if (r0 == 0) goto L56
            int r4 = r0.length()
            if (r4 != 0) goto L63
        L56:
            com.appsflyer.AFLogger r5 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r6 = com.appsflyer.internal.AFg1cSDK.META_REFERRER
            r9 = 4
            r10 = 0
            java.lang.String r7 = "Facebook app id string resource is not found."
            r8 = 0
            com.appsflyer.internal.AFg1hSDK.d$default(r5, r6, r7, r8, r9, r10)
            r0 = r3
        L63:
            if (r0 != 0) goto L8d
            com.appsflyer.internal.AFc1kSDK r0 = r11.getMediationNetwork
            java.lang.String r4 = "com.appsflyer.FacebookApplicationId"
            java.lang.String r0 = r0.getMonetizationNetwork(r4)
            if (r0 == 0) goto L74
            java.lang.String r0 = kotlin.text.StringsKt.N(r0, r2)
            goto L75
        L74:
            r0 = r3
        L75:
            if (r0 == 0) goto L7d
            int r2 = r0.length()
            if (r2 != 0) goto L8a
        L7d:
            com.appsflyer.AFLogger r4 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r5 = com.appsflyer.internal.AFg1cSDK.META_REFERRER
            r8 = 4
            r9 = 0
            java.lang.String r6 = "AF Facebook app id Manifest metadata is not found."
            r7 = 0
            com.appsflyer.internal.AFg1hSDK.d$default(r4, r5, r6, r7, r8, r9)
            r0 = r3
        L8a:
            if (r0 != 0) goto L8d
            goto L8e
        L8d:
            r3 = r0
        L8e:
            r11.equals = r3
            if (r3 != 0) goto L9f
            com.appsflyer.AFLogger r4 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r5 = com.appsflyer.internal.AFg1cSDK.META_REFERRER
            r8 = 4
            r9 = 0
            java.lang.String r6 = "Referrer collection disallowed by missing Facebook app id."
            r7 = 0
            com.appsflyer.internal.AFg1hSDK.d$default(r4, r5, r6, r7, r8, r9)
            return r1
        L9f:
            boolean r12 = r11.getMediationNetwork(r12)
            if (r12 != 0) goto Lb2
            com.appsflyer.AFLogger r2 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r3 = com.appsflyer.internal.AFg1cSDK.META_REFERRER
            r6 = 4
            r7 = 0
            java.lang.String r4 = "Referrer collection disallowed by missing content providers."
            r5 = 0
            com.appsflyer.internal.AFg1hSDK.d$default(r2, r3, r4, r5, r6, r7)
            return r1
        Lb2:
            r12 = 1
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1xSDK.getCurrencyIso4217Code(android.content.Context):boolean");
    }

    private final boolean getMediationNetwork(Context context) {
        int i11 = AFa1vSDK.getCurrencyIso4217Code[this.component3.ordinal()];
        if (i11 == 1) {
            return AFAdRevenueData(context);
        }
        if (i11 == 2) {
            return getRevenue(context);
        }
        if (i11 == 3) {
            return component1(context);
        }
        e40.a.f();
        return false;
    }

    private static boolean getRevenue(Context context) {
        return context.getPackageManager().resolveContentProvider("com.instagram.contentprovider.InstallReferrerProvider", 0) != null;
    }

    @Override // com.appsflyer.internal.AFj1zSDK
    @SuppressLint({"NewApi"})
    public final void getMonetizationNetwork(@NotNull Context context) {
        context.getClass();
        if (getCurrencyIso4217Code(context)) {
            this.getMonetizationNetwork.execute(new g(6, this, context));
        } else {
            this.component1.run();
        }
    }

    private static boolean AFAdRevenueData(Context context) {
        return context.getPackageManager().resolveContentProvider("com.facebook.katana.provider.InstallReferrerProvider", 0) != null;
    }
}
