package com.app.tgtg.model.remote.badge;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket;
import com.app.tgtg.model.remote.discover.response.DiscoverBucket$$serializer;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J(\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b&\u0010\u0017J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010,\u0012\u0004\b0\u00101\u001a\u0004\b-\u0010\u001e\"\u0004\b.\u0010/R*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u00102\u0012\u0004\b6\u00101\u001a\u0004\b3\u0010 \"\u0004\b4\u00105¨\u00069"}, d2 = {"Lcom/app/tgtg/model/remote/badge/BadgeCTA;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/badge/BadgeButton;", "badgeButton", "Lcom/app/tgtg/model/remote/discover/response/DiscoverBucket;", "badgeBucket", "<init>", "(Lcom/app/tgtg/model/remote/badge/BadgeButton;Lcom/app/tgtg/model/remote/discover/response/DiscoverBucket;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/badge/BadgeButton;Lcom/app/tgtg/model/remote/discover/response/DiscoverBucket;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/badge/BadgeCTA;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/app/tgtg/model/remote/badge/BadgeButton;", "component2", "()Lcom/app/tgtg/model/remote/discover/response/DiscoverBucket;", "copy", "(Lcom/app/tgtg/model/remote/badge/BadgeButton;Lcom/app/tgtg/model/remote/discover/response/DiscoverBucket;)Lcom/app/tgtg/model/remote/badge/BadgeCTA;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/app/tgtg/model/remote/badge/BadgeButton;", "getBadgeButton", "setBadgeButton", "(Lcom/app/tgtg/model/remote/badge/BadgeButton;)V", "getBadgeButton$annotations", "()V", "Lcom/app/tgtg/model/remote/discover/response/DiscoverBucket;", "getBadgeBucket", "setBadgeBucket", "(Lcom/app/tgtg/model/remote/discover/response/DiscoverBucket;)V", "getBadgeBucket$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class BadgeCTA implements Parcelable {

    @Nullable
    private DiscoverBucket badgeBucket;

    @Nullable
    private BadgeButton badgeButton;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BadgeCTA> CREATOR = new Creator();

    public /* synthetic */ BadgeCTA(int i11, BadgeButton badgeButton, DiscoverBucket discoverBucket, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.badgeButton = null;
        } else {
            this.badgeButton = badgeButton;
        }
        if ((i11 & 2) == 0) {
            this.badgeBucket = null;
        } else {
            this.badgeBucket = discoverBucket;
        }
    }

    public static /* synthetic */ BadgeCTA copy$default(BadgeCTA badgeCTA, BadgeButton badgeButton, DiscoverBucket discoverBucket, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            badgeButton = badgeCTA.badgeButton;
        }
        if ((i11 & 2) != 0) {
            discoverBucket = badgeCTA.badgeBucket;
        }
        return badgeCTA.copy(badgeButton, discoverBucket);
    }

    public static final /* synthetic */ void write$Self$app(BadgeCTA self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.badgeButton != null) {
            output.r(serialDesc, 0, BadgeButton$$serializer.INSTANCE, self.badgeButton);
        }
        if (!output.C(serialDesc) && self.badgeBucket == null) {
            return;
        }
        output.r(serialDesc, 1, DiscoverBucket$$serializer.INSTANCE, self.badgeBucket);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BadgeButton getBadgeButton() {
        return this.badgeButton;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DiscoverBucket getBadgeBucket() {
        return this.badgeBucket;
    }

    @NotNull
    public final BadgeCTA copy(@Nullable BadgeButton badgeButton, @Nullable DiscoverBucket badgeBucket) {
        return new BadgeCTA(badgeButton, badgeBucket);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BadgeCTA)) {
            return false;
        }
        BadgeCTA badgeCTA = (BadgeCTA) other;
        return Intrinsics.areEqual(this.badgeButton, badgeCTA.badgeButton) && Intrinsics.areEqual(this.badgeBucket, badgeCTA.badgeBucket);
    }

    @Nullable
    public final DiscoverBucket getBadgeBucket() {
        return this.badgeBucket;
    }

    @Nullable
    public final BadgeButton getBadgeButton() {
        return this.badgeButton;
    }

    public int hashCode() {
        BadgeButton badgeButton = this.badgeButton;
        int iHashCode = (badgeButton == null ? 0 : badgeButton.hashCode()) * 31;
        DiscoverBucket discoverBucket = this.badgeBucket;
        return iHashCode + (discoverBucket != null ? discoverBucket.hashCode() : 0);
    }

    public final void setBadgeBucket(@Nullable DiscoverBucket discoverBucket) {
        this.badgeBucket = discoverBucket;
    }

    public final void setBadgeButton(@Nullable BadgeButton badgeButton) {
        this.badgeButton = badgeButton;
    }

    @NotNull
    public String toString() {
        return "BadgeCTA(badgeButton=" + this.badgeButton + ", badgeBucket=" + this.badgeBucket + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        BadgeButton badgeButton = this.badgeButton;
        if (badgeButton == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            badgeButton.writeToParcel(dest, flags);
        }
        DiscoverBucket discoverBucket = this.badgeBucket;
        if (discoverBucket == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            discoverBucket.writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/badge/BadgeCTA$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/badge/BadgeCTA;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BadgeCTA$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BadgeCTA> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BadgeCTA createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BadgeCTA(parcel.readInt() == 0 ? null : BadgeButton.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? DiscoverBucket.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BadgeCTA[] newArray(int i11) {
            return new BadgeCTA[i11];
        }
    }

    @g("bucket")
    public static /* synthetic */ void getBadgeBucket$annotations() {
    }

    @g("button")
    public static /* synthetic */ void getBadgeButton$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BadgeCTA() {
        this((BadgeButton) null, (DiscoverBucket) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public BadgeCTA(@Nullable BadgeButton badgeButton, @Nullable DiscoverBucket discoverBucket) {
        this.badgeButton = badgeButton;
        this.badgeBucket = discoverBucket;
    }

    public /* synthetic */ BadgeCTA(BadgeButton badgeButton, DiscoverBucket discoverBucket, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : badgeButton, (i11 & 2) != 0 ? null : discoverBucket);
    }
}
