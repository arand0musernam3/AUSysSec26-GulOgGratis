package zendesk.conversationkit.android.model;

import com.app.tgtg.model.local.AppConstants;
import com.braze.models.FeatureFlag;
import db0.c;
import e0.f;
import i90.a;
import i90.h;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import u70.j;
import u70.l;
import u70.m;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b'\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@?BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010Bc\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b&\u0010#J\u0010\u0010'\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010!J\u0010\u0010*\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b*\u0010!J`\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b-\u0010!J\u0010\u0010.\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b.\u0010%J\u001a\u00100\u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b5\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00108\u001a\u0004\b9\u0010%R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b:\u0010#R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b<\u0010(R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u00104\u001a\u0004\b=\u0010!R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b>\u0010!¨\u0006A"}, d2 = {"Lzendesk/conversationkit/android/model/RealtimeSettings;", "", "", FeatureFlag.ENABLED, "", "baseUrl", "", "retryInterval", "", "maxConnectionAttempts", "connectionDelay", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "appId", "userId", "<init>", "(ZLjava/lang/String;JIJLjava/util/concurrent/TimeUnit;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(IZLjava/lang/String;JIJLjava/util/concurrent/TimeUnit;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/model/RealtimeSettings;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "()J", "component4", "()I", "component5", "component6", "()Ljava/util/concurrent/TimeUnit;", "component7", "component8", "copy", "(ZLjava/lang/String;JIJLjava/util/concurrent/TimeUnit;Ljava/lang/String;Ljava/lang/String;)Lzendesk/conversationkit/android/model/RealtimeSettings;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getEnabled", "Ljava/lang/String;", "getBaseUrl", "J", "getRetryInterval", "I", "getMaxConnectionAttempts", "getConnectionDelay", "Ljava/util/concurrent/TimeUnit;", "getTimeUnit", "getAppId", "getUserId", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RealtimeSettings {

    @NotNull
    private final String appId;

    @NotNull
    private final String baseUrl;
    private final long connectionDelay;
    private final boolean enabled;
    private final int maxConnectionAttempts;
    private final long retryInterval;

    @NotNull
    private final TimeUnit timeUnit;

    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final j[] $childSerializers = {null, null, null, null, null, l.a(m.PUBLICATION, new c(8)), null, null};

    public /* synthetic */ RealtimeSettings(int i11, boolean z11, String str, long j9, int i12, long j11, TimeUnit timeUnit, String str2, String str3, m1 m1Var) {
        if (223 != (i11 & AppConstants.GO_TO_GPS_SETTINGS)) {
            c1.j(i11, AppConstants.GO_TO_GPS_SETTINGS, RealtimeSettings$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.enabled = z11;
        this.baseUrl = str;
        this.retryInterval = j9;
        this.maxConnectionAttempts = i12;
        this.connectionDelay = j11;
        if ((i11 & 32) == 0) {
            this.timeUnit = TimeUnit.SECONDS;
        } else {
            this.timeUnit = timeUnit;
        }
        this.appId = str2;
        this.userId = str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer _childSerializers$_anonymous_() {
        TimeUnit[] timeUnitArrValues = TimeUnit.values();
        timeUnitArrValues.getClass();
        return new a("java.util.concurrent.TimeUnit", (Enum[]) timeUnitArrValues);
    }

    public static /* synthetic */ RealtimeSettings copy$default(RealtimeSettings realtimeSettings, boolean z11, String str, long j9, int i11, long j11, TimeUnit timeUnit, String str2, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z11 = realtimeSettings.enabled;
        }
        if ((i12 & 2) != 0) {
            str = realtimeSettings.baseUrl;
        }
        if ((i12 & 4) != 0) {
            j9 = realtimeSettings.retryInterval;
        }
        if ((i12 & 8) != 0) {
            i11 = realtimeSettings.maxConnectionAttempts;
        }
        if ((i12 & 16) != 0) {
            j11 = realtimeSettings.connectionDelay;
        }
        if ((i12 & 32) != 0) {
            timeUnit = realtimeSettings.timeUnit;
        }
        if ((i12 & 64) != 0) {
            str2 = realtimeSettings.appId;
        }
        if ((i12 & 128) != 0) {
            str3 = realtimeSettings.userId;
        }
        String str4 = str3;
        TimeUnit timeUnit2 = timeUnit;
        int i13 = i11;
        long j12 = j9;
        return realtimeSettings.copy(z11, str, j12, i13, j11, timeUnit2, str2, str4);
    }

    public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(RealtimeSettings self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.p(serialDesc, 0, self.enabled);
        output.q(serialDesc, 1, self.baseUrl);
        output.B(serialDesc, 2, self.retryInterval);
        output.m(3, self.maxConnectionAttempts, serialDesc);
        output.B(serialDesc, 4, self.connectionDelay);
        if (output.C(serialDesc) || self.timeUnit != TimeUnit.SECONDS) {
            output.i(serialDesc, 5, (KSerializer) jVarArr[5].getValue(), self.timeUnit);
        }
        output.q(serialDesc, 6, self.appId);
        output.q(serialDesc, 7, self.userId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBaseUrl() {
        return this.baseUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getRetryInterval() {
        return this.retryInterval;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMaxConnectionAttempts() {
        return this.maxConnectionAttempts;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getConnectionDelay() {
        return this.connectionDelay;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TimeUnit getTimeUnit() {
        return this.timeUnit;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final RealtimeSettings copy(boolean enabled, @NotNull String baseUrl, long retryInterval, int maxConnectionAttempts, long connectionDelay, @NotNull TimeUnit timeUnit, @NotNull String appId, @NotNull String userId) {
        baseUrl.getClass();
        timeUnit.getClass();
        appId.getClass();
        userId.getClass();
        return new RealtimeSettings(enabled, baseUrl, retryInterval, maxConnectionAttempts, connectionDelay, timeUnit, appId, userId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RealtimeSettings)) {
            return false;
        }
        RealtimeSettings realtimeSettings = (RealtimeSettings) other;
        return this.enabled == realtimeSettings.enabled && Intrinsics.areEqual(this.baseUrl, realtimeSettings.baseUrl) && this.retryInterval == realtimeSettings.retryInterval && this.maxConnectionAttempts == realtimeSettings.maxConnectionAttempts && this.connectionDelay == realtimeSettings.connectionDelay && this.timeUnit == realtimeSettings.timeUnit && Intrinsics.areEqual(this.appId, realtimeSettings.appId) && Intrinsics.areEqual(this.userId, realtimeSettings.userId);
    }

    @NotNull
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    public final String getBaseUrl() {
        return this.baseUrl;
    }

    public final long getConnectionDelay() {
        return this.connectionDelay;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final int getMaxConnectionAttempts() {
        return this.maxConnectionAttempts;
    }

    public final long getRetryInterval() {
        return this.retryInterval;
    }

    @NotNull
    public final TimeUnit getTimeUnit() {
        return this.timeUnit;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.userId.hashCode() + l1.b((this.timeUnit.hashCode() + f.b(k.b(this.maxConnectionAttempts, f.b(l1.b(Boolean.hashCode(this.enabled) * 31, 31, this.baseUrl), 31, this.retryInterval), 31), 31, this.connectionDelay)) * 31, 31, this.appId);
    }

    @NotNull
    public String toString() {
        boolean z11 = this.enabled;
        String str = this.baseUrl;
        long j9 = this.retryInterval;
        int i11 = this.maxConnectionAttempts;
        long j11 = this.connectionDelay;
        TimeUnit timeUnit = this.timeUnit;
        String str2 = this.appId;
        String str3 = this.userId;
        StringBuilder sb2 = new StringBuilder("RealtimeSettings(enabled=");
        sb2.append(z11);
        sb2.append(", baseUrl=");
        sb2.append(str);
        sb2.append(", retryInterval=");
        sb2.append(j9);
        sb2.append(", maxConnectionAttempts=");
        sb2.append(i11);
        org.bouncycastle.jcajce.provider.asymmetric.a.v(sb2, ", connectionDelay=", j11, ", timeUnit=");
        sb2.append(timeUnit);
        sb2.append(", appId=");
        sb2.append(str2);
        sb2.append(", userId=");
        return k.p(sb2, str3, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/model/RealtimeSettings$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/model/RealtimeSettings;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return RealtimeSettings$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public RealtimeSettings(boolean z11, @NotNull String str, long j9, int i11, long j11, @NotNull TimeUnit timeUnit, @NotNull String str2, @NotNull String str3) {
        str.getClass();
        timeUnit.getClass();
        str2.getClass();
        str3.getClass();
        this.enabled = z11;
        this.baseUrl = str;
        this.retryInterval = j9;
        this.maxConnectionAttempts = i11;
        this.connectionDelay = j11;
        this.timeUnit = timeUnit;
        this.appId = str2;
        this.userId = str3;
    }

    public /* synthetic */ RealtimeSettings(boolean z11, String str, long j9, int i11, long j11, TimeUnit timeUnit, String str2, String str3, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, str, j9, i11, j11, (i12 & 32) != 0 ? TimeUnit.SECONDS : timeUnit, str2, str3);
    }
}
