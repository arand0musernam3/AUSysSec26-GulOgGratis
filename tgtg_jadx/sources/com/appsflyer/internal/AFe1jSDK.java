package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFb1vSDK;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailability;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevCallback;
import com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.c0;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+,B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\nH\u0003¢\u0006\u0004\b\u0012\u0010\fJ\u001d\u0010\u000b\u001a\u00020\u0016*\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u000b\u0010\u0017J\u000f\u0010\u0012\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u0012\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001a\u0010\tJ\u000f\u0010\u000e\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u000e\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u001a\u001a\u00020 8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010!\u001a\u00020#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0015\u0010(\u001a\u00020\u00188BX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b(\u0010)R\u001b\u0010\u0012\u001a\u00020\u00078CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b*\u0010)\u001a\u0004\b&\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00078CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\t"}, d2 = {"Lcom/appsflyer/internal/AFe1jSDK;", "Lcom/appsflyer/internal/AFe1uSDK;", "Lcom/appsflyer/internal/AFh1rSDK;", "Lcom/appsflyer/internal/AFd1zSDK;", "p0", "<init>", "(Lcom/appsflyer/internal/AFd1zSDK;)V", "", "copy", "()Z", "", "getMonetizationNetwork", "(I)Z", "Landroid/content/Context;", "getMediationNetwork", "(Landroid/content/Context;)I", "Lcom/appsflyer/internal/AFe1jSDK$AFa1vSDK;", "p1", "getRevenue", "(Landroid/content/Context;Lcom/appsflyer/internal/AFe1jSDK$AFa1vSDK;)Z", "getCurrencyIso4217Code", "", "", "(Lcom/appsflyer/internal/AFh1rSDK;Ljava/lang/String;)V", "", "()J", "AFAdRevenueData", "Lcom/appsflyer/internal/AFe1rSDK;", "()Lcom/appsflyer/internal/AFe1rSDK;", "Lcom/appsflyer/internal/AFc1fSDK;", "component2", "Lcom/appsflyer/internal/AFc1fSDK;", "Lcom/appsflyer/internal/AFc1kSDK;", "component1", "Lcom/appsflyer/internal/AFc1kSDK;", "Lcom/appsflyer/internal/AFc1gSDK;", "component3", "Lcom/appsflyer/internal/AFc1gSDK;", "areAllFieldsValid", "Lcom/appsflyer/internal/AFh1rSDK;", "component4", "Lu70/j;", "toString", "AFa1uSDK", "AFa1vSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFetchAdvertisingIdTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FetchAdvertisingIdTask.kt\ncom/appsflyer/internal/components/queue/tasks/FetchAdvertisingIdTask\n+ 2 StringExtensions.kt\ncom/appsflyer/internal/util/StringExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,396:1\n39#2:397\n1#3:398\n*S KotlinDebug\n*F\n+ 1 FetchAdvertisingIdTask.kt\ncom/appsflyer/internal/components/queue/tasks/FetchAdvertisingIdTask\n*L\n202#1:397\n*E\n"})
public final class AFe1jSDK extends AFe1uSDK<AFh1rSDK> {

    /* JADX INFO: renamed from: areAllFieldsValid, reason: from kotlin metadata */
    @NotNull
    private final AFh1rSDK getCurrencyIso4217Code;

    /* JADX INFO: renamed from: component1, reason: from kotlin metadata */
    @NotNull
    private final AFc1kSDK AFAdRevenueData;

    /* JADX INFO: renamed from: component2, reason: from kotlin metadata */
    @NotNull
    private final AFc1fSDK getMonetizationNetwork;

    /* JADX INFO: renamed from: component3, reason: from kotlin metadata */
    @NotNull
    private final AFc1gSDK component1;

    @NotNull
    private final u70.j component4;

    /* JADX INFO: renamed from: toString, reason: from kotlin metadata */
    @NotNull
    private final u70.j getRevenue;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bH\u0016¨\u0006\t"}, d2 = {"com/appsflyer/internal/components/queue/tasks/FetchAdvertisingIdTask$fetchGaidUsingSamsungSdk$1", "Lcom/samsung/android/game/cloudgame/dev/sdk/CloudDevCallback;", "onError", "", "reason", "", "onSuccess", "kinds", "", "SDK_prodRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AFa1tSDK implements CloudDevCallback {
        final /* synthetic */ AFa1vSDK $fetchGaidData;
        final /* synthetic */ CountDownLatch $latch;

        public AFa1tSDK(AFa1vSDK aFa1vSDK, CountDownLatch countDownLatch) {
            this.$fetchGaidData = aFa1vSDK;
            this.$latch = countDownLatch;
        }

        public final void onError(@NotNull String reason) {
            reason.getClass();
            AFg1hSDK.w$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, e0.f.k("Could not fetch GAID using CloudDevSdk: ", reason), false, 4, null);
            StringBuilder gaidError = this.$fetchGaidData.getGaidError();
            gaidError.append(reason);
            gaidError.append(" |");
            this.$latch.countDown();
        }

        public final void onSuccess(@NotNull Map<String, String> kinds) {
            kinds.getClass();
            AFg1hSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "CloudDevCallback received onSuccess", false, 4, null);
            this.$fetchGaidData.setAdvertisingId(kinds.get("gaid"));
            this.$latch.countDown();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1jSDK(@NotNull AFd1zSDK aFd1zSDK) {
        super(AFe1lSDK.FETCH_ADVERTISING_ID, new AFe1lSDK[0], "FetchAdvertisingIdTask");
        aFd1zSDK.getClass();
        AFc1fSDK aFc1fSDKRegisterClient = aFd1zSDK.registerClient();
        aFc1fSDKRegisterClient.getClass();
        this.getMonetizationNetwork = aFc1fSDKRegisterClient;
        AFc1kSDK aFc1kSDKAFAdRevenueData = aFd1zSDK.AFAdRevenueData();
        aFc1kSDKAFAdRevenueData.getClass();
        this.AFAdRevenueData = aFc1kSDKAFAdRevenueData;
        AFc1gSDK aFc1gSDKE = aFd1zSDK.e();
        aFc1gSDKE.getClass();
        this.component1 = aFc1gSDKE;
        this.getCurrencyIso4217Code = new AFh1rSDK(null, null, null, null, null, null, null, null, 255, null);
        this.component4 = u70.l.b(new Function0<Long>() { // from class: com.appsflyer.internal.AFe1jSDK.3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Long invoke() {
                Long lD0;
                String monetizationNetwork = AFe1jSDK.this.AFAdRevenueData.getMonetizationNetwork("com.appsflyer.fetch_ids.timeout");
                return Long.valueOf((monetizationNetwork == null || (lD0 = StringsKt.d0(monetizationNetwork)) == null) ? 1000L : lD0.longValue());
            }
        });
        this.getRevenue = u70.l.b(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFe1jSDK.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Boolean invoke() {
                return Boolean.valueOf(Boolean.parseBoolean(AFe1jSDK.this.AFAdRevenueData.getMonetizationNetwork("com.appsflyer.enable_instant_plays")));
            }
        });
    }

    private final boolean areAllFieldsValid() {
        return ((Boolean) this.getRevenue.getValue()).booleanValue();
    }

    private static boolean component1() {
        try {
            Class.forName("com.samsung.android.game.cloudgame.dev.sdk.CloudDevSdk");
            return true;
        } catch (Throwable th2) {
            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, th2 instanceof ClassNotFoundException ? "CloudDevSdk not found" : e0.f.k("Unexpected exception while checking if running in cloud environment: ", th2.getMessage()), th2, true, false, false, false, 112, null);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045 A[LOOP:0: B:3:0x0005->B:15:0x0045, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048 A[EDGE_INSN: B:19:0x0048->B:16:0x0048 BREAK  A[LOOP:0: B:3:0x0005->B:15:0x0045], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean copy() {
        /*
            r17 = this;
            r0 = r17
            r1 = 2
            r2 = 0
            r3 = r2
        L5:
            if (r1 <= 0) goto L48
            boolean r3 = r0.areAllFieldsValid()
            r4 = 1
            if (r3 == 0) goto L22
            boolean r3 = r0.getMediationNetwork(r1)
            if (r3 == 0) goto L22
            com.appsflyer.AFLogger r5 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r6 = com.appsflyer.internal.AFg1cSDK.ADVERTISING_ID
            r9 = 4
            r10 = 0
            java.lang.String r7 = "GAID fetched using Samsung Cloud dev SDK"
            r8 = 0
            com.appsflyer.internal.AFg1hSDK.v$default(r5, r6, r7, r8, r9, r10)
        L20:
            r3 = r4
            goto L43
        L22:
            boolean r3 = r0.getMonetizationNetwork(r1)
            if (r3 == 0) goto L35
            com.appsflyer.AFLogger r5 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r6 = com.appsflyer.internal.AFg1cSDK.ADVERTISING_ID
            r9 = 4
            r10 = 0
            java.lang.String r7 = "GAID fetched using GMS"
            r8 = 0
            com.appsflyer.internal.AFg1hSDK.v$default(r5, r6, r7, r8, r9, r10)
            goto L20
        L35:
            com.appsflyer.AFLogger r11 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r12 = com.appsflyer.internal.AFg1cSDK.ADVERTISING_ID
            r15 = 4
            r16 = 0
            java.lang.String r13 = "Failed to fetch GAID"
            r14 = 0
            com.appsflyer.internal.AFg1hSDK.v$default(r11, r12, r13, r14, r15, r16)
            r3 = r2
        L43:
            if (r3 != 0) goto L48
            int r1 = r1 + (-1)
            goto L5
        L48:
            com.appsflyer.internal.AFc1gSDK r1 = r0.component1
            com.appsflyer.internal.AFh1rSDK r2 = r0.getCurrencyIso4217Code
            r1.component2 = r2
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1jSDK.copy():boolean");
    }

    private final boolean getCurrencyIso4217Code(Context p02, AFa1vSDK p12) throws IllegalStateException {
        Unit unit;
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(p02);
            if (advertisingIdInfo != null) {
                p12.setAdvertisingId(advertisingIdInfo.getId());
                p12.setLimitAdTrackingEnabled(Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled()));
                p12.setAdvertisingIdWithGps(true);
                String advertisingId = p12.getAdvertisingId();
                if (advertisingId == null || advertisingId.length() == 0) {
                    p12.getGaidError().append("emptyOrNull |");
                }
                unit = Unit.f26487a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return true;
            }
            p12.getGaidError().append("gpsAdInfo-null |");
            throw new IllegalStateException("GpsAdIndo is null");
        } catch (Throwable th2) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
            AFg1hSDK.e$default(aFLogger, aFg1cSDK, e0.f.k("Google Play Services is missing ", th2.getMessage()), th2, false, false, false, false, 88, null);
            StringBuilder gaidError = p12.getGaidError();
            gaidError.append(th2.getClass().getSimpleName());
            gaidError.append(" |");
            AFg1hSDK.i$default(aFLogger, aFg1cSDK, "WARNING: Google Play Services is missing.", false, 4, null);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean getMonetizationNetwork(int r14) {
        /*
            r13 = this;
            com.appsflyer.AFLogger r0 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r1 = com.appsflyer.internal.AFg1cSDK.ADVERTISING_ID
            r4 = 4
            r5 = 0
            java.lang.String r2 = "Trying to fetch GAID..."
            r3 = 0
            com.appsflyer.internal.AFg1hSDK.i$default(r0, r1, r2, r3, r4, r5)
            com.appsflyer.internal.AFe1jSDK$AFa1vSDK r6 = new com.appsflyer.internal.AFe1jSDK$AFa1vSDK
            r11 = 15
            r12 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            com.appsflyer.internal.AFc1fSDK r0 = r13.getMonetizationNetwork
            android.content.Context r0 = r0.getCurrencyIso4217Code
            r0.getClass()
            int r0 = getMediationNetwork(r0)
            com.appsflyer.internal.AFc1fSDK r1 = r13.getMonetizationNetwork
            android.content.Context r1 = r1.getCurrencyIso4217Code
            r1.getClass()
            boolean r1 = r13.getCurrencyIso4217Code(r1, r6)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L81
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r4 = "enableGpsFallback"
            boolean r1 = r1.getBoolean(r4, r3)
            if (r1 == 0) goto L4d
            com.appsflyer.internal.AFc1fSDK r1 = r13.getMonetizationNetwork
            android.content.Context r1 = r1.getCurrencyIso4217Code
            r1.getClass()
            boolean r1 = r13.getRevenue(r1, r6)
            if (r1 == 0) goto L4d
            r1 = r3
            goto L4e
        L4d:
            r1 = r2
        L4e:
            java.lang.StringBuilder r4 = r6.getGaidError()
            java.lang.String r4 = r4.toString()
            boolean r5 = kotlin.text.StringsKt.H(r4)
            if (r5 == 0) goto L5d
            goto L79
        L5d:
            java.lang.CharSequence r4 = kotlin.text.StringsKt.e0(r4)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r0)
            java.lang.String r0 = ": "
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
        L79:
            com.appsflyer.internal.AFh1rSDK r0 = r13.getCurrencyIso4217Code
            getMonetizationNetwork(r0, r4)
            if (r1 != 0) goto L81
            return r2
        L81:
            com.appsflyer.internal.AFh1rSDK r0 = r13.getCurrencyIso4217Code
            java.lang.String r1 = r6.getAdvertisingId()
            r0.AFAdRevenueData = r1
            java.lang.Boolean r1 = r6.isLimitAdTrackingEnabled()
            r0.component4 = r1
            java.lang.Boolean r1 = r6.isLimitAdTrackingEnabled()
            if (r1 == 0) goto L9f
            boolean r1 = r1.booleanValue()
            r1 = r1 ^ r3
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto La0
        L9f:
            r1 = 0
        La0:
            r0.getMediationNetwork = r1
            boolean r1 = r6.getAdvertisingIdWithGps()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.getMonetizationNetwork = r1
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.getRevenue = r1
            r1 = 2
            if (r14 == r1) goto Lb4
            r2 = r3
        Lb4:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r2)
            r0.component2 = r14
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFe1jSDK.getMonetizationNetwork(int):boolean");
    }

    private final boolean getRevenue(int p02) {
        String str;
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
        AFg1hSDK.i$default(aFLogger, aFg1cSDK, "Trying to fetch GAID using Samsung Cloud Dev...", false, 4, null);
        if (component1()) {
            CloudDevSdk cloudDevSdk = CloudDevSdk.INSTANCE;
            Context context = this.getMonetizationNetwork.getCurrencyIso4217Code;
            context.getClass();
            if (cloudDevSdk.isCloudEnvironment(context)) {
                AFa1vSDK aFa1vSDK = new AFa1vSDK(null, null, false, null, 15, null);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                try {
                    CloudDevSdk cloudDevSdk2 = CloudDevSdk.INSTANCE;
                    Context context2 = this.getMonetizationNetwork.getCurrencyIso4217Code;
                    context2.getClass();
                    cloudDevSdk2.request(context2, c0.c("gaid"), new AFa1tSDK(aFa1vSDK, countDownLatch));
                    countDownLatch.await(((Number) this.component4.getValue()).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    try {
                        if (th2 instanceof InterruptedException) {
                            str = "Fetch GAID using Samsung Cloud Dev interrupted or reached to timeout";
                        } else if (th2 instanceof ClassNotFoundException) {
                            str = "CloudDevSdk not found";
                        } else {
                            str = "Unexpected exception while fetching GAID using Samsung Cloud Dev " + th2.getMessage();
                        }
                        AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, str, th2, true, false, false, false, 112, null);
                        StringBuilder gaidError = aFa1vSDK.getGaidError();
                        gaidError.append(th2.getClass().getSimpleName());
                        gaidError.append(" |");
                        if (aFa1vSDK.getGaidError().length() > 0) {
                        }
                    } catch (Throwable th3) {
                        if (aFa1vSDK.getGaidError().length() > 0) {
                            getMonetizationNetwork(this.getCurrencyIso4217Code, aFa1vSDK.getGaidError().toString());
                        }
                        throw th3;
                    }
                }
                if (aFa1vSDK.getGaidError().length() > 0) {
                    getMonetizationNetwork(this.getCurrencyIso4217Code, aFa1vSDK.getGaidError().toString());
                }
                String advertisingId = aFa1vSDK.getAdvertisingId();
                if (advertisingId == null || advertisingId.length() == 0) {
                    return false;
                }
                AFh1rSDK aFh1rSDK = this.getCurrencyIso4217Code;
                aFh1rSDK.AFAdRevenueData = aFa1vSDK.getAdvertisingId();
                Boolean bool = Boolean.FALSE;
                aFh1rSDK.component4 = bool;
                Boolean bool2 = Boolean.TRUE;
                aFh1rSDK.getMediationNetwork = bool2;
                aFh1rSDK.getMonetizationNetwork = bool;
                aFh1rSDK.getRevenue = bool2;
                aFh1rSDK.component2 = Boolean.valueOf(p02 != 2);
                return true;
            }
        }
        AFg1hSDK.i$default(aFLogger, aFg1cSDK, "Not running in Samsung Cloud Environment. Try using GMS...", false, 4, null);
        return false;
    }

    @Override // com.appsflyer.internal.AFe1uSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1uSDK
    @NotNull
    public final AFe1rSDK getMediationNetwork() {
        if (this.component1.AFAdRevenueData()) {
            AFg1hSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "QUEUE: Advertising ID collection is disabled. Skipping fetching... ", false, 4, null);
            return AFe1rSDK.FAILURE;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Boolean boolValueOf = Boolean.valueOf(copy());
        Boolean bool = Boolean.FALSE;
        AFe1rSDK aFe1rSDK = d0.h(boolValueOf, bool, bool).contains(Boolean.TRUE) ? AFe1rSDK.SUCCESS : AFe1rSDK.FAILURE;
        AFc1gSDK aFc1gSDK = this.component1;
        AFd1dSDK aFd1dSDK = new AFd1dSDK(System.currentTimeMillis() - jCurrentTimeMillis);
        AFg1hSDK.v$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, l1.e("QUEUE: FetchAdvertisingIdTask: took ", aFd1dSDK.AFAdRevenueData, "ms"), false, 4, null);
        aFc1gSDK.getRevenue(aFd1dSDK);
        return aFe1rSDK;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0082\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÇ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÇ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0012\u001a\u00060\u0007j\u0002`\bHÇ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\bHÇ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002H×\u0001¢\u0006\u0004\b\u001c\u0010\rR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010$R\u001e\u0010\t\u001a\u00060\u0007j\u0002`\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0013R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010'\u001a\u0004\b\u0005\u0010\u000f\"\u0004\b(\u0010)"}, d2 = {"Lcom/appsflyer/internal/AFe1jSDK$AFa1vSDK;", "", "", "advertisingId", "", "isLimitAdTrackingEnabled", "advertisingIdWithGps", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "gaidError", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Boolean;", "component3", "()Z", "component4", "()Ljava/lang/StringBuilder;", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;ZLjava/lang/StringBuilder;)Lcom/appsflyer/internal/AFe1jSDK$AFa1vSDK;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAdvertisingId", "setAdvertisingId", "(Ljava/lang/String;)V", "Z", "getAdvertisingIdWithGps", "setAdvertisingIdWithGps", "(Z)V", "Ljava/lang/StringBuilder;", "getGaidError", "Ljava/lang/Boolean;", "setLimitAdTrackingEnabled", "(Ljava/lang/Boolean;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class AFa1vSDK {

        @Nullable
        private String advertisingId;
        private boolean advertisingIdWithGps;

        @NotNull
        private final StringBuilder gaidError;

        @Nullable
        private Boolean isLimitAdTrackingEnabled;

        public /* synthetic */ AFa1vSDK(String str, Boolean bool, boolean z11, StringBuilder sb2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? new StringBuilder() : sb2);
        }

        public static /* synthetic */ AFa1vSDK copy$default(AFa1vSDK aFa1vSDK, String str, Boolean bool, boolean z11, StringBuilder sb2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = aFa1vSDK.advertisingId;
            }
            if ((i11 & 2) != 0) {
                bool = aFa1vSDK.isLimitAdTrackingEnabled;
            }
            if ((i11 & 4) != 0) {
                z11 = aFa1vSDK.advertisingIdWithGps;
            }
            if ((i11 & 8) != 0) {
                sb2 = aFa1vSDK.gaidError;
            }
            return aFa1vSDK.copy(str, bool, z11, sb2);
        }

        @Nullable
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        @Nullable
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Boolean getIsLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        @NotNull
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final StringBuilder getGaidError() {
            return this.gaidError;
        }

        @NotNull
        public final AFa1vSDK copy(@Nullable String advertisingId, @Nullable Boolean isLimitAdTrackingEnabled, boolean advertisingIdWithGps, @NotNull StringBuilder gaidError) {
            gaidError.getClass();
            return new AFa1vSDK(advertisingId, isLimitAdTrackingEnabled, advertisingIdWithGps, gaidError);
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AFa1vSDK)) {
                return false;
            }
            AFa1vSDK aFa1vSDK = (AFa1vSDK) other;
            return Intrinsics.areEqual(this.advertisingId, aFa1vSDK.advertisingId) && Intrinsics.areEqual(this.isLimitAdTrackingEnabled, aFa1vSDK.isLimitAdTrackingEnabled) && this.advertisingIdWithGps == aFa1vSDK.advertisingIdWithGps && Intrinsics.areEqual(this.gaidError, aFa1vSDK.gaidError);
        }

        @Nullable
        public final String getAdvertisingId() {
            return this.advertisingId;
        }

        public final boolean getAdvertisingIdWithGps() {
            return this.advertisingIdWithGps;
        }

        @NotNull
        public final StringBuilder getGaidError() {
            return this.gaidError;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r1v9 */
        public final int hashCode() {
            String str = this.advertisingId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.isLimitAdTrackingEnabled;
            int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
            boolean z11 = this.advertisingIdWithGps;
            ?? r12 = z11;
            if (z11) {
                r12 = 1;
            }
            return this.gaidError.hashCode() + ((iHashCode2 + r12) * 31);
        }

        @Nullable
        public final Boolean isLimitAdTrackingEnabled() {
            return this.isLimitAdTrackingEnabled;
        }

        public final void setAdvertisingId(@Nullable String str) {
            this.advertisingId = str;
        }

        public final void setAdvertisingIdWithGps(boolean z11) {
            this.advertisingIdWithGps = z11;
        }

        public final void setLimitAdTrackingEnabled(@Nullable Boolean bool) {
            this.isLimitAdTrackingEnabled = bool;
        }

        @NotNull
        public final String toString() {
            return "FetchGaidData(advertisingId=" + this.advertisingId + ", isLimitAdTrackingEnabled=" + this.isLimitAdTrackingEnabled + ", advertisingIdWithGps=" + this.advertisingIdWithGps + ", gaidError=" + ((Object) this.gaidError) + ")";
        }

        public AFa1vSDK(@Nullable String str, @Nullable Boolean bool, boolean z11, @NotNull StringBuilder sb2) {
            sb2.getClass();
            this.advertisingId = str;
            this.isLimitAdTrackingEnabled = bool;
            this.advertisingIdWithGps = z11;
            this.gaidError = sb2;
        }

        public AFa1vSDK() {
            this(null, null, false, null, 15, null);
        }
    }

    private static int getMediationNetwork(Context p02) {
        try {
            return GoogleApiAvailability.f11044d.b(p02, com.google.android.gms.common.a.f11047a);
        } catch (Throwable th2) {
            AFg1hSDK.e$default(AFLogger.INSTANCE, AFg1cSDK.ADVERTISING_ID, "isGooglePlayServicesAvailable error", th2, false, false, false, false, 96, null);
            return -1;
        }
    }

    private final boolean getMediationNetwork(int p02) {
        return getRevenue(p02);
    }

    private static void getMonetizationNetwork(AFh1rSDK aFh1rSDK, String str) {
        if (str == null) {
            return;
        }
        String str2 = aFh1rSDK.getCurrencyIso4217Code;
        if (str2 != null) {
            str = r8.k.m(str2, " | ", str);
        }
        aFh1rSDK.getCurrencyIso4217Code = str;
    }

    private final boolean getRevenue(Context p02, AFa1vSDK p12) throws IllegalStateException {
        try {
            AFb1vSDK.AFa1vSDK mediationNetwork = AFb1vSDK.getMediationNetwork(p02);
            p12.setAdvertisingId(mediationNetwork.getCurrencyIso4217Code);
            p12.setLimitAdTrackingEnabled(Boolean.valueOf(mediationNetwork.AFAdRevenueData()));
            String advertisingId = p12.getAdvertisingId();
            if (advertisingId == null || advertisingId.length() == 0) {
                p12.getGaidError().append("emptyOrNull (bypass) |");
            }
            if (Unit.f26487a != null) {
                return true;
            }
            p12.getGaidError().append("gpsAdInfo-null (bypass) |");
            throw new IllegalStateException("GpsAdInfo is null (bypass)");
        } catch (Throwable th2) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            AFg1cSDK aFg1cSDK = AFg1cSDK.ADVERTISING_ID;
            AFg1hSDK.e$default(aFLogger, aFg1cSDK, e0.f.k("Failed to fetch GAID: ", th2.getMessage()), th2, true, false, false, false, 64, null);
            StringBuilder gaidError = p12.getGaidError();
            gaidError.append(th2.getClass().getSimpleName());
            gaidError.append(" |");
            String localizedMessage = th2.getLocalizedMessage();
            if (localizedMessage == null) {
                localizedMessage = th2.toString();
            }
            AFg1hSDK.i$default(aFLogger, aFg1cSDK, localizedMessage, false, 4, null);
            return false;
        }
    }

    @Override // com.appsflyer.internal.AFe1uSDK
    public final long getRevenue() {
        return ((Number) this.component4.getValue()).longValue();
    }
}
