package zendesk.conversationkit.android.internal.rest.model;

import com.braze.models.FeatureFlag;
import e0.f;
import i90.h;
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
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001d\b\u0081\b\u0018\u0000 02\u00020\u0001:\u000210B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bBE\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b \u0010\u001eJB\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u001cJ\u0010\u0010$\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b$\u0010\u001eJ\u001a\u0010&\u001a\u00020\u00022\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b.\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b/\u0010\u001e¨\u00062"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/RealtimeSettingsDto;", "", "", FeatureFlag.ENABLED, "", "baseUrl", "", "retryInterval", "maxConnectionAttempts", "connectionDelay", "<init>", "(ZLjava/lang/String;III)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(IZLjava/lang/String;IIILm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_conversationkit_conversationkit_android", "(Lzendesk/conversationkit/android/internal/rest/model/RealtimeSettingsDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "()I", "component4", "component5", "copy", "(ZLjava/lang/String;III)Lzendesk/conversationkit/android/internal/rest/model/RealtimeSettingsDto;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getEnabled", "Ljava/lang/String;", "getBaseUrl", "I", "getRetryInterval", "getMaxConnectionAttempts", "getConnectionDelay", "Companion", "$serializer", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RealtimeSettingsDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String baseUrl;
    private final int connectionDelay;
    private final boolean enabled;
    private final int maxConnectionAttempts;
    private final int retryInterval;

    public /* synthetic */ RealtimeSettingsDto(int i11, boolean z11, String str, int i12, int i13, int i14, m1 m1Var) {
        if (31 != (i11 & 31)) {
            c1.j(i11, 31, RealtimeSettingsDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.enabled = z11;
        this.baseUrl = str;
        this.retryInterval = i12;
        this.maxConnectionAttempts = i13;
        this.connectionDelay = i14;
    }

    public static /* synthetic */ RealtimeSettingsDto copy$default(RealtimeSettingsDto realtimeSettingsDto, boolean z11, String str, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            z11 = realtimeSettingsDto.enabled;
        }
        if ((i14 & 2) != 0) {
            str = realtimeSettingsDto.baseUrl;
        }
        if ((i14 & 4) != 0) {
            i11 = realtimeSettingsDto.retryInterval;
        }
        if ((i14 & 8) != 0) {
            i12 = realtimeSettingsDto.maxConnectionAttempts;
        }
        if ((i14 & 16) != 0) {
            i13 = realtimeSettingsDto.connectionDelay;
        }
        int i15 = i13;
        int i16 = i11;
        return realtimeSettingsDto.copy(z11, str, i16, i12, i15);
    }

    public static final /* synthetic */ void write$Self$zendesk_conversationkit_conversationkit_android(RealtimeSettingsDto self, b output, SerialDescriptor serialDesc) {
        output.p(serialDesc, 0, self.enabled);
        output.q(serialDesc, 1, self.baseUrl);
        output.m(2, self.retryInterval, serialDesc);
        output.m(3, self.maxConnectionAttempts, serialDesc);
        output.m(4, self.connectionDelay, serialDesc);
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
    public final int getRetryInterval() {
        return this.retryInterval;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMaxConnectionAttempts() {
        return this.maxConnectionAttempts;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getConnectionDelay() {
        return this.connectionDelay;
    }

    @NotNull
    public final RealtimeSettingsDto copy(boolean enabled, @NotNull String baseUrl, int retryInterval, int maxConnectionAttempts, int connectionDelay) {
        baseUrl.getClass();
        return new RealtimeSettingsDto(enabled, baseUrl, retryInterval, maxConnectionAttempts, connectionDelay);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RealtimeSettingsDto)) {
            return false;
        }
        RealtimeSettingsDto realtimeSettingsDto = (RealtimeSettingsDto) other;
        return this.enabled == realtimeSettingsDto.enabled && Intrinsics.areEqual(this.baseUrl, realtimeSettingsDto.baseUrl) && this.retryInterval == realtimeSettingsDto.retryInterval && this.maxConnectionAttempts == realtimeSettingsDto.maxConnectionAttempts && this.connectionDelay == realtimeSettingsDto.connectionDelay;
    }

    @NotNull
    public final String getBaseUrl() {
        return this.baseUrl;
    }

    public final int getConnectionDelay() {
        return this.connectionDelay;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final int getMaxConnectionAttempts() {
        return this.maxConnectionAttempts;
    }

    public final int getRetryInterval() {
        return this.retryInterval;
    }

    public int hashCode() {
        return Integer.hashCode(this.connectionDelay) + k.b(this.maxConnectionAttempts, k.b(this.retryInterval, l1.b(Boolean.hashCode(this.enabled) * 31, 31, this.baseUrl), 31), 31);
    }

    @NotNull
    public String toString() {
        boolean z11 = this.enabled;
        String str = this.baseUrl;
        int i11 = this.retryInterval;
        int i12 = this.maxConnectionAttempts;
        int i13 = this.connectionDelay;
        StringBuilder sb2 = new StringBuilder("RealtimeSettingsDto(enabled=");
        sb2.append(z11);
        sb2.append(", baseUrl=");
        sb2.append(str);
        sb2.append(", retryInterval=");
        f.C(sb2, i11, ", maxConnectionAttempts=", i12, ", connectionDelay=");
        return k.i(i13, ")", sb2);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/conversationkit/android/internal/rest/model/RealtimeSettingsDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/conversationkit/android/internal/rest/model/RealtimeSettingsDto;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return RealtimeSettingsDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public RealtimeSettingsDto(boolean z11, @NotNull String str, int i11, int i12, int i13) {
        str.getClass();
        this.enabled = z11;
        this.baseUrl = str;
        this.retryInterval = i11;
        this.maxConnectionAttempts = i12;
        this.connectionDelay = i13;
    }
}
