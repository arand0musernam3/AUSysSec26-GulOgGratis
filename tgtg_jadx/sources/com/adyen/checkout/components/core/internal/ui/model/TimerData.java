package com.adyen.checkout.components.core.internal.ui.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/adyen/checkout/components/core/internal/ui/model/TimerData;", "", "millisUntilFinished", "", "progress", "", "(JI)V", "getMillisUntilFinished", "()J", "getProgress", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class TimerData {
    private final long millisUntilFinished;
    private final int progress;

    public TimerData(long j9, int i11) {
        this.millisUntilFinished = j9;
        this.progress = i11;
    }

    public static /* synthetic */ TimerData copy$default(TimerData timerData, long j9, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j9 = timerData.millisUntilFinished;
        }
        if ((i12 & 2) != 0) {
            i11 = timerData.progress;
        }
        return timerData.copy(j9, i11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getMillisUntilFinished() {
        return this.millisUntilFinished;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getProgress() {
        return this.progress;
    }

    @NotNull
    public final TimerData copy(long millisUntilFinished, int progress) {
        return new TimerData(millisUntilFinished, progress);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerData)) {
            return false;
        }
        TimerData timerData = (TimerData) other;
        return this.millisUntilFinished == timerData.millisUntilFinished && this.progress == timerData.progress;
    }

    public final long getMillisUntilFinished() {
        return this.millisUntilFinished;
    }

    public final int getProgress() {
        return this.progress;
    }

    public int hashCode() {
        return Integer.hashCode(this.progress) + (Long.hashCode(this.millisUntilFinished) * 31);
    }

    @NotNull
    public String toString() {
        return "TimerData(millisUntilFinished=" + this.millisUntilFinished + ", progress=" + this.progress + ")";
    }
}
