package com.tgtg.componentlibrary.component.chip.model;

import b3.i;
import com.braze.Constants;
import j4.s;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0003\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0004\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0005\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/tgtg/componentlibrary/component/chip/model/ChipState;", "", "", "isSelected", "isEnabled", "isElevated", "<init>", "(ZZZ)V", "component1", "()Z", "component2", "component3", "copy", "(ZZZ)Lcom/tgtg/componentlibrary/component/chip/model/ChipState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", Constants.BRAZE_PUSH_CONTENT_KEY, "Z", "b", "c", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ChipState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean isSelected;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean isEnabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean isElevated;

    public ChipState(boolean z11, boolean z12, boolean z13) {
        this.isSelected = z11;
        this.isEnabled = z12;
        this.isElevated = z13;
    }

    public static /* synthetic */ ChipState copy$default(ChipState chipState, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = chipState.isSelected;
        }
        if ((i11 & 2) != 0) {
            z12 = chipState.isEnabled;
        }
        if ((i11 & 4) != 0) {
            z13 = chipState.isElevated;
        }
        return chipState.copy(z11, z12, z13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsElevated() {
        return this.isElevated;
    }

    @NotNull
    public final ChipState copy(boolean isSelected, boolean isEnabled, boolean isElevated) {
        return new ChipState(isSelected, isEnabled, isElevated);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChipState)) {
            return false;
        }
        ChipState chipState = (ChipState) other;
        return this.isSelected == chipState.isSelected && this.isEnabled == chipState.isEnabled && this.isElevated == chipState.isElevated;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isElevated) + k.e(Boolean.hashCode(this.isSelected) * 31, 31, this.isEnabled);
    }

    public final boolean isElevated() {
        return this.isElevated;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    @NotNull
    public String toString() {
        return s.o(i.p("ChipState(isSelected=", this.isSelected, ", isEnabled=", this.isEnabled, ", isElevated="), this.isElevated, ")");
    }
}
