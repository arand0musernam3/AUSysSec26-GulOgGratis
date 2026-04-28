package com.app.tgtg.model.remote.brief;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.g;
import m90.l0;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ(\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010\u0016J\u001a\u0010(\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b+\u0010,\u001a\u0004\b\u0003\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010-\u0012\u0004\b/\u0010,\u001a\u0004\b.\u0010\u001f¨\u00062"}, d2 = {"Lcom/app/tgtg/model/remote/brief/BriefRatingInfo;", "Landroid/os/Parcelable;", "", "isRateable", "", "overallRating", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Integer;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/Integer;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/brief/BriefRatingInfo;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/app/tgtg/model/remote/brief/BriefRatingInfo;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "isRateable$annotations", "()V", "Ljava/lang/Integer;", "getOverallRating", "getOverallRating$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class BriefRatingInfo implements Parcelable {
    public static final int $stable = 0;

    @Nullable
    private final Boolean isRateable;

    @Nullable
    private final Integer overallRating;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<BriefRatingInfo> CREATOR = new Creator();

    public /* synthetic */ BriefRatingInfo(int i11, Boolean bool, Integer num, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.isRateable = null;
        } else {
            this.isRateable = bool;
        }
        if ((i11 & 2) == 0) {
            this.overallRating = null;
        } else {
            this.overallRating = num;
        }
    }

    public static /* synthetic */ BriefRatingInfo copy$default(BriefRatingInfo briefRatingInfo, Boolean bool, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bool = briefRatingInfo.isRateable;
        }
        if ((i11 & 2) != 0) {
            num = briefRatingInfo.overallRating;
        }
        return briefRatingInfo.copy(bool, num);
    }

    public static final /* synthetic */ void write$Self$app(BriefRatingInfo self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.isRateable != null) {
            output.r(serialDesc, 0, g.f29797a, self.isRateable);
        }
        if (!output.C(serialDesc) && self.overallRating == null) {
            return;
        }
        output.r(serialDesc, 1, l0.f29821a, self.overallRating);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getIsRateable() {
        return this.isRateable;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getOverallRating() {
        return this.overallRating;
    }

    @NotNull
    public final BriefRatingInfo copy(@Nullable Boolean isRateable, @Nullable Integer overallRating) {
        return new BriefRatingInfo(isRateable, overallRating);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BriefRatingInfo)) {
            return false;
        }
        BriefRatingInfo briefRatingInfo = (BriefRatingInfo) other;
        return Intrinsics.areEqual(this.isRateable, briefRatingInfo.isRateable) && Intrinsics.areEqual(this.overallRating, briefRatingInfo.overallRating);
    }

    @Nullable
    public final Integer getOverallRating() {
        return this.overallRating;
    }

    public int hashCode() {
        Boolean bool = this.isRateable;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.overallRating;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    @Nullable
    public final Boolean isRateable() {
        return this.isRateable;
    }

    @NotNull
    public String toString() {
        return "BriefRatingInfo(isRateable=" + this.isRateable + ", overallRating=" + this.overallRating + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        Boolean bool = this.isRateable;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            i.v(dest, 1, bool);
        }
        Integer num = this.overallRating;
        if (num == null) {
            dest.writeInt(0);
        } else {
            i.w(dest, 1, num);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/brief/BriefRatingInfo$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/brief/BriefRatingInfo;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BriefRatingInfo$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BriefRatingInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BriefRatingInfo createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BriefRatingInfo(boolValueOf, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BriefRatingInfo[] newArray(int i11) {
            return new BriefRatingInfo[i11];
        }
    }

    @i90.g("overall_rating")
    public static /* synthetic */ void getOverallRating$annotations() {
    }

    @i90.g("is_rateable")
    public static /* synthetic */ void isRateable$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BriefRatingInfo() {
        this((Boolean) null, (Integer) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public BriefRatingInfo(@Nullable Boolean bool, @Nullable Integer num) {
        this.isRateable = bool;
        this.overallRating = num;
    }

    public /* synthetic */ BriefRatingInfo(Boolean bool, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bool, (i11 & 2) != 0 ? null : num);
    }
}
