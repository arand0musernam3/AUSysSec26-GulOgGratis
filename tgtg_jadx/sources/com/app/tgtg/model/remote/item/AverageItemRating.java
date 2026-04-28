package com.app.tgtg.model.remote.item;

import android.os.Parcel;
import android.os.Parcelable;
import i90.g;
import i90.h;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import m90.v;
import mv.j0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u0000 H2\u00020\u0001:\u0002IHBG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fB[\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u0017J\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0017J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0017J\u0010\u0010$\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b(\u0010'J\u0012\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b)\u0010'J\u0012\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b*\u0010'J^\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b-\u0010\u001aJ'\u00105\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\u00002\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0001¢\u0006\u0004\b3\u00104R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00106\u0012\u0004\b8\u00109\u001a\u0004\b7\u0010\u0017R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00106\u0012\u0004\b;\u00109\u001a\u0004\b:\u0010\u0017R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010<\u0012\u0004\b>\u00109\u001a\u0004\b=\u0010%R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010?\u0012\u0004\bA\u00109\u001a\u0004\b@\u0010'R\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010?\u0012\u0004\bC\u00109\u001a\u0004\bB\u0010'R\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010?\u0012\u0004\bE\u00109\u001a\u0004\bD\u0010'R\"\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010?\u0012\u0004\bG\u00109\u001a\u0004\bF\u0010'¨\u0006J"}, d2 = {"Lcom/app/tgtg/model/remote/item/AverageItemRating;", "Landroid/os/Parcelable;", "", "monthCount", "ratingCount", "", "averageOverallRating", "averageCollectionExperienceRating", "averageFoodQualityRating", "averageContentsVarietyRating", "averageFoodQuantityRating", "<init>", "(IIDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(IIIDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lm90/m1;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "getDisplayValue", "()Ljava/lang/String;", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "component3", "()D", "component4", "()Ljava/lang/Double;", "component5", "component6", "component7", "copy", "(IIDLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/app/tgtg/model/remote/item/AverageItemRating;", "toString", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/AverageItemRating;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "I", "getMonthCount", "getMonthCount$annotations", "()V", "getRatingCount", "getRatingCount$annotations", "D", "getAverageOverallRating", "getAverageOverallRating$annotations", "Ljava/lang/Double;", "getAverageCollectionExperienceRating", "getAverageCollectionExperienceRating$annotations", "getAverageFoodQualityRating", "getAverageFoodQualityRating$annotations", "getAverageContentsVarietyRating", "getAverageContentsVarietyRating$annotations", "getAverageFoodQuantityRating", "getAverageFoodQuantityRating$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class AverageItemRating implements Parcelable {
    public static final int $stable = 0;

    @Nullable
    private final Double averageCollectionExperienceRating;

    @Nullable
    private final Double averageContentsVarietyRating;

    @Nullable
    private final Double averageFoodQualityRating;

    @Nullable
    private final Double averageFoodQuantityRating;
    private final double averageOverallRating;
    private final int monthCount;
    private final int ratingCount;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<AverageItemRating> CREATOR = new Creator();

    public /* synthetic */ AverageItemRating(int i11, int i12, int i13, double d3, Double d11, Double d12, Double d13, Double d14, m1 m1Var) {
        if (127 != (i11 & 127)) {
            c1.j(i11, 127, AverageItemRating$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.monthCount = i12;
        this.ratingCount = i13;
        this.averageOverallRating = d3;
        this.averageCollectionExperienceRating = d11;
        this.averageFoodQualityRating = d12;
        this.averageContentsVarietyRating = d13;
        this.averageFoodQuantityRating = d14;
    }

    public static /* synthetic */ AverageItemRating copy$default(AverageItemRating averageItemRating, int i11, int i12, double d3, Double d11, Double d12, Double d13, Double d14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = averageItemRating.monthCount;
        }
        if ((i13 & 2) != 0) {
            i12 = averageItemRating.ratingCount;
        }
        if ((i13 & 4) != 0) {
            d3 = averageItemRating.averageOverallRating;
        }
        if ((i13 & 8) != 0) {
            d11 = averageItemRating.averageCollectionExperienceRating;
        }
        if ((i13 & 16) != 0) {
            d12 = averageItemRating.averageFoodQualityRating;
        }
        if ((i13 & 32) != 0) {
            d13 = averageItemRating.averageContentsVarietyRating;
        }
        if ((i13 & 64) != 0) {
            d14 = averageItemRating.averageFoodQuantityRating;
        }
        double d15 = d3;
        return averageItemRating.copy(i11, i12, d15, d11, d12, d13, d14);
    }

    public static final /* synthetic */ void write$Self$app(AverageItemRating self, b output, SerialDescriptor serialDesc) {
        output.m(0, self.monthCount, serialDesc);
        output.m(1, self.ratingCount, serialDesc);
        output.z(serialDesc, 2, self.averageOverallRating);
        v vVar = v.f29868a;
        output.r(serialDesc, 3, vVar, self.averageCollectionExperienceRating);
        output.r(serialDesc, 4, vVar, self.averageFoodQualityRating);
        output.r(serialDesc, 5, vVar, self.averageContentsVarietyRating);
        output.r(serialDesc, 6, vVar, self.averageFoodQuantityRating);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMonthCount() {
        return this.monthCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRatingCount() {
        return this.ratingCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getAverageOverallRating() {
        return this.averageOverallRating;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getAverageCollectionExperienceRating() {
        return this.averageCollectionExperienceRating;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Double getAverageFoodQualityRating() {
        return this.averageFoodQualityRating;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Double getAverageContentsVarietyRating() {
        return this.averageContentsVarietyRating;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Double getAverageFoodQuantityRating() {
        return this.averageFoodQuantityRating;
    }

    @NotNull
    public final AverageItemRating copy(int monthCount, int ratingCount, double averageOverallRating, @Nullable Double averageCollectionExperienceRating, @Nullable Double averageFoodQualityRating, @Nullable Double averageContentsVarietyRating, @Nullable Double averageFoodQuantityRating) {
        return new AverageItemRating(monthCount, ratingCount, averageOverallRating, averageCollectionExperienceRating, averageFoodQualityRating, averageContentsVarietyRating, averageFoodQuantityRating);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AverageItemRating)) {
            return false;
        }
        AverageItemRating averageItemRating = (AverageItemRating) other;
        return this.averageOverallRating == averageItemRating.averageOverallRating && this.monthCount == averageItemRating.monthCount && this.ratingCount == averageItemRating.ratingCount;
    }

    @Nullable
    public final Double getAverageCollectionExperienceRating() {
        return this.averageCollectionExperienceRating;
    }

    @Nullable
    public final Double getAverageContentsVarietyRating() {
        return this.averageContentsVarietyRating;
    }

    @Nullable
    public final Double getAverageFoodQualityRating() {
        return this.averageFoodQualityRating;
    }

    @Nullable
    public final Double getAverageFoodQuantityRating() {
        return this.averageFoodQuantityRating;
    }

    public final double getAverageOverallRating() {
        return this.averageOverallRating;
    }

    @NotNull
    public final String getDisplayValue() {
        return j0.b(Double.valueOf(this.averageOverallRating), 1, 4);
    }

    public final int getMonthCount() {
        return this.monthCount;
    }

    public final int getRatingCount() {
        return this.ratingCount;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.averageOverallRating), Integer.valueOf(this.monthCount), Integer.valueOf(this.ratingCount));
    }

    @NotNull
    public String toString() {
        int i11 = this.monthCount;
        int i12 = this.ratingCount;
        double d3 = this.averageOverallRating;
        Double d11 = this.averageCollectionExperienceRating;
        Double d12 = this.averageFoodQualityRating;
        Double d13 = this.averageContentsVarietyRating;
        Double d14 = this.averageFoodQuantityRating;
        StringBuilder sbR = k.r(i11, i12, "AverageItemRating(monthCount=", ", ratingCount=", ", averageOverallRating=");
        sbR.append(d3);
        sbR.append(", averageCollectionExperienceRating=");
        sbR.append(d11);
        sbR.append(", averageFoodQualityRating=");
        sbR.append(d12);
        sbR.append(", averageContentsVarietyRating=");
        sbR.append(d13);
        sbR.append(", averageFoodQuantityRating=");
        sbR.append(d14);
        sbR.append(")");
        return sbR.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.monthCount);
        dest.writeInt(this.ratingCount);
        dest.writeDouble(this.averageOverallRating);
        Double d3 = this.averageCollectionExperienceRating;
        if (d3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d3.doubleValue());
        }
        Double d11 = this.averageFoodQualityRating;
        if (d11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d11.doubleValue());
        }
        Double d12 = this.averageContentsVarietyRating;
        if (d12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d12.doubleValue());
        }
        Double d13 = this.averageFoodQuantityRating;
        if (d13 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d13.doubleValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/AverageItemRating$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/AverageItemRating;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return AverageItemRating$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AverageItemRating> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AverageItemRating createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new AverageItemRating(parcel.readInt(), parcel.readInt(), parcel.readDouble(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AverageItemRating[] newArray(int i11) {
            return new AverageItemRating[i11];
        }
    }

    @g("average_collection_experience_rating")
    public static /* synthetic */ void getAverageCollectionExperienceRating$annotations() {
    }

    @g("average_contents_variety_rating")
    public static /* synthetic */ void getAverageContentsVarietyRating$annotations() {
    }

    @g("average_food_quality_rating")
    public static /* synthetic */ void getAverageFoodQualityRating$annotations() {
    }

    @g("average_food_quantity_rating")
    public static /* synthetic */ void getAverageFoodQuantityRating$annotations() {
    }

    @g("average_overall_rating")
    public static /* synthetic */ void getAverageOverallRating$annotations() {
    }

    @g("month_count")
    public static /* synthetic */ void getMonthCount$annotations() {
    }

    @g("rating_count")
    public static /* synthetic */ void getRatingCount$annotations() {
    }

    public AverageItemRating(int i11, int i12, double d3, @Nullable Double d11, @Nullable Double d12, @Nullable Double d13, @Nullable Double d14) {
        this.monthCount = i11;
        this.ratingCount = i12;
        this.averageOverallRating = d3;
        this.averageCollectionExperienceRating = d11;
        this.averageFoodQualityRating = d12;
        this.averageContentsVarietyRating = d13;
        this.averageFoodQuantityRating = d14;
    }
}
