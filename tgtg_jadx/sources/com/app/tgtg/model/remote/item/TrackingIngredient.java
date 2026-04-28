package com.app.tgtg.model.remote.item;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import dv.a;
import dv.c;
import i90.h;
import j4.s;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.g;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b&\u0010'J0\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010#J\u0010\u0010+\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b+\u0010\u001cJ\u001a\u0010.\u001a\u00020\u00062\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00100\u0012\u0004\b2\u00103\u001a\u0004\b1\u0010#R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00104\u0012\u0004\b6\u00103\u001a\u0004\b5\u0010%R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00107\u0012\u0004\b9\u00103\u001a\u0004\b8\u0010'¨\u0006<"}, d2 = {"Lcom/app/tgtg/model/remote/item/TrackingIngredient;", "Landroid/os/Parcelable;", "", "name", "", "probability", "", "hasPhoto", "<init>", "(Ljava/lang/String;DLjava/lang/Boolean;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;DLjava/lang/Boolean;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/TrackingIngredient;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ldv/b;", "parameters", "()Ldv/b;", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()D", "component3", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/String;DLjava/lang/Boolean;)Lcom/app/tgtg/model/remote/item/TrackingIngredient;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getName$annotations", "()V", "D", "getProbability", "getProbability$annotations", "Ljava/lang/Boolean;", "getHasPhoto", "getHasPhoto$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class TrackingIngredient implements Parcelable {
    public static final int $stable = 0;

    @Nullable
    private final Boolean hasPhoto;

    @NotNull
    private final String name;
    private final double probability;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<TrackingIngredient> CREATOR = new Creator();

    public /* synthetic */ TrackingIngredient(int i11, String str, double d3, Boolean bool, m1 m1Var) {
        if (7 != (i11 & 7)) {
            c1.j(i11, 7, TrackingIngredient$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.name = str;
        this.probability = d3;
        this.hasPhoto = bool;
    }

    public static /* synthetic */ TrackingIngredient copy$default(TrackingIngredient trackingIngredient, String str, double d3, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = trackingIngredient.name;
        }
        if ((i11 & 2) != 0) {
            d3 = trackingIngredient.probability;
        }
        if ((i11 & 4) != 0) {
            bool = trackingIngredient.hasPhoto;
        }
        return trackingIngredient.copy(str, d3, bool);
    }

    public static final /* synthetic */ void write$Self$app(TrackingIngredient self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.name);
        output.z(serialDesc, 1, self.probability);
        output.r(serialDesc, 2, g.f29797a, self.hasPhoto);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getProbability() {
        return this.probability;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getHasPhoto() {
        return this.hasPhoto;
    }

    @NotNull
    public final TrackingIngredient copy(@NotNull String name, double probability, @Nullable Boolean hasPhoto) {
        name.getClass();
        return new TrackingIngredient(name, probability, hasPhoto);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackingIngredient)) {
            return false;
        }
        TrackingIngredient trackingIngredient = (TrackingIngredient) other;
        return Intrinsics.areEqual(this.name, trackingIngredient.name) && Double.compare(this.probability, trackingIngredient.probability) == 0 && Intrinsics.areEqual(this.hasPhoto, trackingIngredient.hasPhoto);
    }

    @Nullable
    public final Boolean getHasPhoto() {
        return this.hasPhoto;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final double getProbability() {
        return this.probability;
    }

    public int hashCode() {
        int iB = s.b(this.probability, this.name.hashCode() * 31, 31);
        Boolean bool = this.hasPhoto;
        return iB + (bool == null ? 0 : bool.hashCode());
    }

    @NotNull
    public final dv.b parameters() {
        return h0.g.E(new Pair(a.NAME, new c(this.name)), new Pair(a.PROBABILITY, new c(Double.valueOf(this.probability))), new Pair(a.HAS_PHOTO, new c(this.hasPhoto)));
    }

    @NotNull
    public String toString() {
        return "TrackingIngredient(name=" + this.name + ", probability=" + this.probability + ", hasPhoto=" + this.hasPhoto + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.name);
        dest.writeDouble(this.probability);
        Boolean bool = this.hasPhoto;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            i.v(dest, 1, bool);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/TrackingIngredient$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/TrackingIngredient;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return TrackingIngredient$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TrackingIngredient> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TrackingIngredient createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            parcel.getClass();
            String string = parcel.readString();
            double d3 = parcel.readDouble();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new TrackingIngredient(string, d3, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TrackingIngredient[] newArray(int i11) {
            return new TrackingIngredient[i11];
        }
    }

    @i90.g("has_photo")
    public static /* synthetic */ void getHasPhoto$annotations() {
    }

    @i90.g("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @i90.g("probability")
    public static /* synthetic */ void getProbability$annotations() {
    }

    public TrackingIngredient(@NotNull String str, double d3, @Nullable Boolean bool) {
        str.getClass();
        this.name = str;
        this.probability = d3;
        this.hasPhoto = bool;
    }
}
