package com.app.tgtg.model.remote.user.response.charity;

import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u000b\u001a\u00020\fJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/charity/LocalDivergenceDay;", "", "date", "Ljava/time/LocalDate;", "isAvailable", "", "<init>", "(Ljava/time/LocalDate;Z)V", "getDate", "()Ljava/time/LocalDate;", "()Z", "toDiverseDay", "Lcom/app/tgtg/model/remote/user/response/charity/DiverseDay;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class LocalDivergenceDay {
    public static final int $stable = 8;

    @NotNull
    private final LocalDate date;
    private final boolean isAvailable;

    public LocalDivergenceDay(@NotNull LocalDate localDate, boolean z11) {
        localDate.getClass();
        this.date = localDate;
        this.isAvailable = z11;
    }

    public static /* synthetic */ LocalDivergenceDay copy$default(LocalDivergenceDay localDivergenceDay, LocalDate localDate, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            localDate = localDivergenceDay.date;
        }
        if ((i11 & 2) != 0) {
            z11 = localDivergenceDay.isAvailable;
        }
        return localDivergenceDay.copy(localDate, z11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LocalDate getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsAvailable() {
        return this.isAvailable;
    }

    @NotNull
    public final LocalDivergenceDay copy(@NotNull LocalDate date, boolean isAvailable) {
        date.getClass();
        return new LocalDivergenceDay(date, isAvailable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalDivergenceDay)) {
            return false;
        }
        LocalDivergenceDay localDivergenceDay = (LocalDivergenceDay) other;
        return Intrinsics.areEqual(this.date, localDivergenceDay.date) && this.isAvailable == localDivergenceDay.isAvailable;
    }

    @NotNull
    public final LocalDate getDate() {
        return this.date;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isAvailable) + (this.date.hashCode() * 31);
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    @NotNull
    public final DiverseDay toDiverseDay() {
        String string = this.date.toString();
        string.getClass();
        return new DiverseDay(string, this.isAvailable);
    }

    @NotNull
    public String toString() {
        return "LocalDivergenceDay(date=" + this.date + ", isAvailable=" + this.isAvailable + ")";
    }
}
