package com.adyen.checkout.components.core;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\nHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\nHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/adyen/checkout/components/core/AnalyticsConfiguration;", "Landroid/os/Parcelable;", "level", "Lcom/adyen/checkout/components/core/AnalyticsLevel;", "(Lcom/adyen/checkout/components/core/AnalyticsLevel;)V", "getLevel", "()Lcom/adyen/checkout/components/core/AnalyticsLevel;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "components-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class AnalyticsConfiguration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AnalyticsConfiguration> CREATOR = new Creator();

    @Nullable
    private final AnalyticsLevel level;

    public /* synthetic */ AnalyticsConfiguration(AnalyticsLevel analyticsLevel, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : analyticsLevel);
    }

    public static /* synthetic */ AnalyticsConfiguration copy$default(AnalyticsConfiguration analyticsConfiguration, AnalyticsLevel analyticsLevel, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            analyticsLevel = analyticsConfiguration.level;
        }
        return analyticsConfiguration.copy(analyticsLevel);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AnalyticsLevel getLevel() {
        return this.level;
    }

    @NotNull
    public final AnalyticsConfiguration copy(@Nullable AnalyticsLevel level) {
        return new AnalyticsConfiguration(level);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AnalyticsConfiguration) && this.level == ((AnalyticsConfiguration) other).level;
    }

    @Nullable
    public final AnalyticsLevel getLevel() {
        return this.level;
    }

    public int hashCode() {
        AnalyticsLevel analyticsLevel = this.level;
        if (analyticsLevel == null) {
            return 0;
        }
        return analyticsLevel.hashCode();
    }

    @NotNull
    public String toString() {
        return "AnalyticsConfiguration(level=" + this.level + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.getClass();
        AnalyticsLevel analyticsLevel = this.level;
        if (analyticsLevel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(analyticsLevel.name());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AnalyticsConfiguration> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final AnalyticsConfiguration createFromParcel(@NotNull Parcel parcel) {
            parcel.getClass();
            return new AnalyticsConfiguration(parcel.readInt() == 0 ? null : AnalyticsLevel.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final AnalyticsConfiguration[] newArray(int i11) {
            return new AnalyticsConfiguration[i11];
        }
    }

    public AnalyticsConfiguration(@Nullable AnalyticsLevel analyticsLevel) {
        this.level = analyticsLevel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnalyticsConfiguration() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
