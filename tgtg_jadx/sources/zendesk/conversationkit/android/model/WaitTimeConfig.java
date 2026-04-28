package zendesk.conversationkit.android.model;

import b3.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003JB\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lzendesk/conversationkit/android/model/WaitTimeConfig;", "", "waitTimeEnabled", "", "queuePositionEnabled", "onlyDecreasingQueue", "waitTimeOverride", "", "queuePollingInterval", "<init>", "(ZZZLjava/lang/Integer;I)V", "getWaitTimeEnabled", "()Z", "getQueuePositionEnabled", "getOnlyDecreasingQueue", "getWaitTimeOverride", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getQueuePollingInterval", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "(ZZZLjava/lang/Integer;I)Lzendesk/conversationkit/android/model/WaitTimeConfig;", "equals", "other", "hashCode", "toString", "", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class WaitTimeConfig {
    private final boolean onlyDecreasingQueue;
    private final int queuePollingInterval;
    private final boolean queuePositionEnabled;
    private final boolean waitTimeEnabled;

    @Nullable
    private final Integer waitTimeOverride;

    public WaitTimeConfig(boolean z11, boolean z12, boolean z13, @Nullable Integer num, int i11) {
        this.waitTimeEnabled = z11;
        this.queuePositionEnabled = z12;
        this.onlyDecreasingQueue = z13;
        this.waitTimeOverride = num;
        this.queuePollingInterval = i11;
    }

    public static /* synthetic */ WaitTimeConfig copy$default(WaitTimeConfig waitTimeConfig, boolean z11, boolean z12, boolean z13, Integer num, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z11 = waitTimeConfig.waitTimeEnabled;
        }
        if ((i12 & 2) != 0) {
            z12 = waitTimeConfig.queuePositionEnabled;
        }
        if ((i12 & 4) != 0) {
            z13 = waitTimeConfig.onlyDecreasingQueue;
        }
        if ((i12 & 8) != 0) {
            num = waitTimeConfig.waitTimeOverride;
        }
        if ((i12 & 16) != 0) {
            i11 = waitTimeConfig.queuePollingInterval;
        }
        int i13 = i11;
        boolean z14 = z13;
        return waitTimeConfig.copy(z11, z12, z14, num, i13);
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

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getQueuePollingInterval() {
        return this.queuePollingInterval;
    }

    @NotNull
    public final WaitTimeConfig copy(boolean waitTimeEnabled, boolean queuePositionEnabled, boolean onlyDecreasingQueue, @Nullable Integer waitTimeOverride, int queuePollingInterval) {
        return new WaitTimeConfig(waitTimeEnabled, queuePositionEnabled, onlyDecreasingQueue, waitTimeOverride, queuePollingInterval);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WaitTimeConfig)) {
            return false;
        }
        WaitTimeConfig waitTimeConfig = (WaitTimeConfig) other;
        return this.waitTimeEnabled == waitTimeConfig.waitTimeEnabled && this.queuePositionEnabled == waitTimeConfig.queuePositionEnabled && this.onlyDecreasingQueue == waitTimeConfig.onlyDecreasingQueue && Intrinsics.areEqual(this.waitTimeOverride, waitTimeConfig.waitTimeOverride) && this.queuePollingInterval == waitTimeConfig.queuePollingInterval;
    }

    public final boolean getOnlyDecreasingQueue() {
        return this.onlyDecreasingQueue;
    }

    public final int getQueuePollingInterval() {
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
        return Integer.hashCode(this.queuePollingInterval) + ((iE + (num == null ? 0 : num.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        boolean z11 = this.waitTimeEnabled;
        boolean z12 = this.queuePositionEnabled;
        boolean z13 = this.onlyDecreasingQueue;
        Integer num = this.waitTimeOverride;
        int i11 = this.queuePollingInterval;
        StringBuilder sbP = i.p("WaitTimeConfig(waitTimeEnabled=", z11, ", queuePositionEnabled=", z12, ", onlyDecreasingQueue=");
        sbP.append(z13);
        sbP.append(", waitTimeOverride=");
        sbP.append(num);
        sbP.append(", queuePollingInterval=");
        return k.i(i11, ")", sbP);
    }
}
