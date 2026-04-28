package zendesk.android.settings.internal.model;

import b3.i;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.l0;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0081\b\u0018\u0000 02\u00020\u0001:\u000210B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nBG\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJF\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001dR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b/\u0010\u001d¨\u00062"}, d2 = {"Lzendesk/android/settings/internal/model/WaitConfigDto;", "", "", "waitTimeEnabled", "queuePositionEnabled", "onlyDecreasingQueue", "", "waitTimeOverride", "queuePollingInterval", "<init>", "(ZZZLjava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(IZZZLjava/lang/Integer;Ljava/lang/Integer;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_zendesk_android", "(Lzendesk/android/settings/internal/model/WaitConfigDto;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Z", "component2", "component3", "component4", "()Ljava/lang/Integer;", "component5", "copy", "(ZZZLjava/lang/Integer;Ljava/lang/Integer;)Lzendesk/android/settings/internal/model/WaitConfigDto;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getWaitTimeEnabled", "getQueuePositionEnabled", "getOnlyDecreasingQueue", "Ljava/lang/Integer;", "getWaitTimeOverride", "getQueuePollingInterval", "Companion", "$serializer", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class WaitConfigDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean onlyDecreasingQueue;

    @Nullable
    private final Integer queuePollingInterval;
    private final boolean queuePositionEnabled;
    private final boolean waitTimeEnabled;

    @Nullable
    private final Integer waitTimeOverride;

    public /* synthetic */ WaitConfigDto(int i11, boolean z11, boolean z12, boolean z13, Integer num, Integer num2, m1 m1Var) {
        if (31 != (i11 & 31)) {
            c1.j(i11, 31, WaitConfigDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.waitTimeEnabled = z11;
        this.queuePositionEnabled = z12;
        this.onlyDecreasingQueue = z13;
        this.waitTimeOverride = num;
        this.queuePollingInterval = num2;
    }

    public static /* synthetic */ WaitConfigDto copy$default(WaitConfigDto waitConfigDto, boolean z11, boolean z12, boolean z13, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = waitConfigDto.waitTimeEnabled;
        }
        if ((i11 & 2) != 0) {
            z12 = waitConfigDto.queuePositionEnabled;
        }
        if ((i11 & 4) != 0) {
            z13 = waitConfigDto.onlyDecreasingQueue;
        }
        if ((i11 & 8) != 0) {
            num = waitConfigDto.waitTimeOverride;
        }
        if ((i11 & 16) != 0) {
            num2 = waitConfigDto.queuePollingInterval;
        }
        Integer num3 = num2;
        boolean z14 = z13;
        return waitConfigDto.copy(z11, z12, z14, num, num3);
    }

    public static final /* synthetic */ void write$Self$zendesk_zendesk_android(WaitConfigDto self, b output, SerialDescriptor serialDesc) {
        output.p(serialDesc, 0, self.waitTimeEnabled);
        output.p(serialDesc, 1, self.queuePositionEnabled);
        output.p(serialDesc, 2, self.onlyDecreasingQueue);
        l0 l0Var = l0.f29821a;
        output.r(serialDesc, 3, l0Var, self.waitTimeOverride);
        output.r(serialDesc, 4, l0Var, self.queuePollingInterval);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getWaitTimeEnabled() {
        return this.waitTimeEnabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getQueuePositionEnabled() {
        return this.queuePositionEnabled;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getOnlyDecreasingQueue() {
        return this.onlyDecreasingQueue;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getWaitTimeOverride() {
        return this.waitTimeOverride;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getQueuePollingInterval() {
        return this.queuePollingInterval;
    }

    @NotNull
    public final WaitConfigDto copy(boolean waitTimeEnabled, boolean queuePositionEnabled, boolean onlyDecreasingQueue, @Nullable Integer waitTimeOverride, @Nullable Integer queuePollingInterval) {
        return new WaitConfigDto(waitTimeEnabled, queuePositionEnabled, onlyDecreasingQueue, waitTimeOverride, queuePollingInterval);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WaitConfigDto)) {
            return false;
        }
        WaitConfigDto waitConfigDto = (WaitConfigDto) other;
        return this.waitTimeEnabled == waitConfigDto.waitTimeEnabled && this.queuePositionEnabled == waitConfigDto.queuePositionEnabled && this.onlyDecreasingQueue == waitConfigDto.onlyDecreasingQueue && Intrinsics.areEqual(this.waitTimeOverride, waitConfigDto.waitTimeOverride) && Intrinsics.areEqual(this.queuePollingInterval, waitConfigDto.queuePollingInterval);
    }

    public final boolean getOnlyDecreasingQueue() {
        return this.onlyDecreasingQueue;
    }

    @Nullable
    public final Integer getQueuePollingInterval() {
        return this.queuePollingInterval;
    }

    public final boolean getQueuePositionEnabled() {
        return this.queuePositionEnabled;
    }

    public final boolean getWaitTimeEnabled() {
        return this.waitTimeEnabled;
    }

    @Nullable
    public final Integer getWaitTimeOverride() {
        return this.waitTimeOverride;
    }

    public int hashCode() {
        int iE = k.e(k.e(Boolean.hashCode(this.waitTimeEnabled) * 31, 31, this.queuePositionEnabled), 31, this.onlyDecreasingQueue);
        Integer num = this.waitTimeOverride;
        int iHashCode = (iE + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.queuePollingInterval;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        boolean z11 = this.waitTimeEnabled;
        boolean z12 = this.queuePositionEnabled;
        boolean z13 = this.onlyDecreasingQueue;
        Integer num = this.waitTimeOverride;
        Integer num2 = this.queuePollingInterval;
        StringBuilder sbP = i.p("WaitConfigDto(waitTimeEnabled=", z11, ", queuePositionEnabled=", z12, ", onlyDecreasingQueue=");
        sbP.append(z13);
        sbP.append(", waitTimeOverride=");
        sbP.append(num);
        sbP.append(", queuePollingInterval=");
        return i.m(sbP, num2, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/android/settings/internal/model/WaitConfigDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/android/settings/internal/model/WaitConfigDto;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return WaitConfigDto$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public WaitConfigDto(boolean z11, boolean z12, boolean z13, @Nullable Integer num, @Nullable Integer num2) {
        this.waitTimeEnabled = z11;
        this.queuePositionEnabled = z12;
        this.onlyDecreasingQueue = z13;
        this.waitTimeOverride = num;
        this.queuePollingInterval = num2;
    }
}
