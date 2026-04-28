package com.app.tgtg.model.remote.badge;

import android.os.Parcel;
import android.os.Parcelable;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J$\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0015J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010(\u0012\u0004\b,\u0010-\u001a\u0004\b)\u0010\u0015\"\u0004\b*\u0010+R(\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010(\u0012\u0004\b0\u0010-\u001a\u0004\b.\u0010\u0015\"\u0004\b/\u0010+¨\u00063"}, d2 = {"Lcom/app/tgtg/model/remote/badge/BadgeProgress;", "Landroid/os/Parcelable;", "", "currentProgress", "maxProgress", "<init>", "(II)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(IIILm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/badge/BadgeProgress;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "copy", "(II)Lcom/app/tgtg/model/remote/badge/BadgeProgress;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getCurrentProgress", "setCurrentProgress", "(I)V", "getCurrentProgress$annotations", "()V", "getMaxProgress", "setMaxProgress", "getMaxProgress$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class BadgeProgress implements Parcelable {
    private int currentProgress;
    private int maxProgress;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BadgeProgress> CREATOR = new Creator();

    public /* synthetic */ BadgeProgress(int i11, int i12, int i13, m1 m1Var) {
        if (3 != (i11 & 3)) {
            c1.j(i11, 3, BadgeProgress$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.currentProgress = i12;
        this.maxProgress = i13;
    }

    public static /* synthetic */ BadgeProgress copy$default(BadgeProgress badgeProgress, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = badgeProgress.currentProgress;
        }
        if ((i13 & 2) != 0) {
            i12 = badgeProgress.maxProgress;
        }
        return badgeProgress.copy(i11, i12);
    }

    public static final /* synthetic */ void write$Self$app(BadgeProgress self, b output, SerialDescriptor serialDesc) {
        output.m(0, self.currentProgress, serialDesc);
        output.m(1, self.maxProgress, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCurrentProgress() {
        return this.currentProgress;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMaxProgress() {
        return this.maxProgress;
    }

    @NotNull
    public final BadgeProgress copy(int currentProgress, int maxProgress) {
        return new BadgeProgress(currentProgress, maxProgress);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BadgeProgress)) {
            return false;
        }
        BadgeProgress badgeProgress = (BadgeProgress) other;
        return this.currentProgress == badgeProgress.currentProgress && this.maxProgress == badgeProgress.maxProgress;
    }

    public final int getCurrentProgress() {
        return this.currentProgress;
    }

    public final int getMaxProgress() {
        return this.maxProgress;
    }

    public int hashCode() {
        return Integer.hashCode(this.maxProgress) + (Integer.hashCode(this.currentProgress) * 31);
    }

    public final void setCurrentProgress(int i11) {
        this.currentProgress = i11;
    }

    public final void setMaxProgress(int i11) {
        this.maxProgress = i11;
    }

    @NotNull
    public String toString() {
        return k.g(this.currentProgress, this.maxProgress, "BadgeProgress(currentProgress=", ", maxProgress=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.currentProgress);
        dest.writeInt(this.maxProgress);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/badge/BadgeProgress$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/badge/BadgeProgress;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BadgeProgress$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BadgeProgress> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BadgeProgress createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BadgeProgress(parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BadgeProgress[] newArray(int i11) {
            return new BadgeProgress[i11];
        }
    }

    @g("current_progress")
    public static /* synthetic */ void getCurrentProgress$annotations() {
    }

    @g("max_progress")
    public static /* synthetic */ void getMaxProgress$annotations() {
    }

    public BadgeProgress(int i11, int i12) {
        this.currentProgress = i11;
        this.maxProgress = i12;
    }
}
