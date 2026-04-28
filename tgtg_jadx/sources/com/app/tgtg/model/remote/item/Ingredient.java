package com.app.tgtg.model.remote.item;

import android.os.Parcel;
import android.os.Parcelable;
import e0.f;
import i90.g;
import i90.h;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ0\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001fJ\u0010\u0010&\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b&\u0010\u0018J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010,\u0012\u0004\b.\u0010/\u001a\u0004\b-\u0010\u001fR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00100\u0012\u0004\b2\u0010/\u001a\u0004\b1\u0010!R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010,\u0012\u0004\b4\u0010/\u001a\u0004\b3\u0010\u001f¨\u00067"}, d2 = {"Lcom/app/tgtg/model/remote/item/Ingredient;", "Landroid/os/Parcelable;", "", "name", "", "probabilityPercentage", "imageUrl", "<init>", "(Ljava/lang/String;DLjava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;DLjava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/Ingredient;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()D", "component3", "copy", "(Ljava/lang/String;DLjava/lang/String;)Lcom/app/tgtg/model/remote/item/Ingredient;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "getName$annotations", "()V", "D", "getProbabilityPercentage", "getProbabilityPercentage$annotations", "getImageUrl", "getImageUrl$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class Ingredient implements Parcelable {
    public static final int $stable = 0;

    @Nullable
    private final String imageUrl;

    @NotNull
    private final String name;
    private final double probabilityPercentage;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<Ingredient> CREATOR = new Creator();

    public /* synthetic */ Ingredient(int i11, String str, double d3, String str2, m1 m1Var) {
        if (7 != (i11 & 7)) {
            c1.j(i11, 7, Ingredient$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.name = str;
        this.probabilityPercentage = d3;
        this.imageUrl = str2;
    }

    public static /* synthetic */ Ingredient copy$default(Ingredient ingredient, String str, double d3, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = ingredient.name;
        }
        if ((i11 & 2) != 0) {
            d3 = ingredient.probabilityPercentage;
        }
        if ((i11 & 4) != 0) {
            str2 = ingredient.imageUrl;
        }
        return ingredient.copy(str, d3, str2);
    }

    public static final /* synthetic */ void write$Self$app(Ingredient self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.name);
        output.z(serialDesc, 1, self.probabilityPercentage);
        output.r(serialDesc, 2, r1.f29848a, self.imageUrl);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getProbabilityPercentage() {
        return this.probabilityPercentage;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final Ingredient copy(@NotNull String name, double probabilityPercentage, @Nullable String imageUrl) {
        name.getClass();
        return new Ingredient(name, probabilityPercentage, imageUrl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Ingredient)) {
            return false;
        }
        Ingredient ingredient = (Ingredient) other;
        return Intrinsics.areEqual(this.name, ingredient.name) && Double.compare(this.probabilityPercentage, ingredient.probabilityPercentage) == 0 && Intrinsics.areEqual(this.imageUrl, ingredient.imageUrl);
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final double getProbabilityPercentage() {
        return this.probabilityPercentage;
    }

    public int hashCode() {
        int iB = s.b(this.probabilityPercentage, this.name.hashCode() * 31, 31);
        String str = this.imageUrl;
        return iB + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.name;
        double d3 = this.probabilityPercentage;
        String str2 = this.imageUrl;
        StringBuilder sb2 = new StringBuilder("Ingredient(name=");
        sb2.append(str);
        sb2.append(", probabilityPercentage=");
        sb2.append(d3);
        return f.n(sb2, ", imageUrl=", str2, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.name);
        dest.writeDouble(this.probabilityPercentage);
        dest.writeString(this.imageUrl);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/Ingredient$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/Ingredient;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Ingredient$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Ingredient> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Ingredient createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new Ingredient(parcel.readString(), parcel.readDouble(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Ingredient[] newArray(int i11) {
            return new Ingredient[i11];
        }
    }

    @g("image_url")
    public static /* synthetic */ void getImageUrl$annotations() {
    }

    @g("label_name")
    public static /* synthetic */ void getName$annotations() {
    }

    @g("probability_percentage")
    public static /* synthetic */ void getProbabilityPercentage$annotations() {
    }

    public Ingredient(@NotNull String str, double d3, @Nullable String str2) {
        str.getClass();
        this.name = str;
        this.probabilityPercentage = d3;
        this.imageUrl = str2;
    }
}
