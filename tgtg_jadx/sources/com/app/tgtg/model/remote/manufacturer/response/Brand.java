package com.app.tgtg.model.remote.manufacturer.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.item.Picture$$serializer;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J(\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010\u0017J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010\u001eR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b0\u0010-\u001a\u0004\b/\u0010 ¨\u00063"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/Brand;", "Landroid/os/Parcelable;", "", "brandName", "Lcom/app/tgtg/model/remote/item/Picture;", "brandLogo", "<init>", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/item/Picture;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/app/tgtg/model/remote/item/Picture;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/manufacturer/response/Brand;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/app/tgtg/model/remote/item/Picture;", "copy", "(Ljava/lang/String;Lcom/app/tgtg/model/remote/item/Picture;)Lcom/app/tgtg/model/remote/manufacturer/response/Brand;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBrandName", "getBrandName$annotations", "()V", "Lcom/app/tgtg/model/remote/item/Picture;", "getBrandLogo", "getBrandLogo$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class Brand implements Parcelable {

    @Nullable
    private final Picture brandLogo;

    @Nullable
    private final String brandName;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<Brand> CREATOR = new Creator();

    public /* synthetic */ Brand(int i11, String str, Picture picture, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.brandName = null;
        } else {
            this.brandName = str;
        }
        if ((i11 & 2) == 0) {
            this.brandLogo = null;
        } else {
            this.brandLogo = picture;
        }
    }

    public static /* synthetic */ Brand copy$default(Brand brand, String str, Picture picture, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = brand.brandName;
        }
        if ((i11 & 2) != 0) {
            picture = brand.brandLogo;
        }
        return brand.copy(str, picture);
    }

    public static final /* synthetic */ void write$Self$app(Brand self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.brandName != null) {
            output.r(serialDesc, 0, r1.f29848a, self.brandName);
        }
        if (!output.C(serialDesc) && self.brandLogo == null) {
            return;
        }
        output.r(serialDesc, 1, Picture$$serializer.INSTANCE, self.brandLogo);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBrandName() {
        return this.brandName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Picture getBrandLogo() {
        return this.brandLogo;
    }

    @NotNull
    public final Brand copy(@Nullable String brandName, @Nullable Picture brandLogo) {
        return new Brand(brandName, brandLogo);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Brand)) {
            return false;
        }
        Brand brand = (Brand) other;
        return Intrinsics.areEqual(this.brandName, brand.brandName) && Intrinsics.areEqual(this.brandLogo, brand.brandLogo);
    }

    @Nullable
    public final Picture getBrandLogo() {
        return this.brandLogo;
    }

    @Nullable
    public final String getBrandName() {
        return this.brandName;
    }

    public int hashCode() {
        String str = this.brandName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Picture picture = this.brandLogo;
        return iHashCode + (picture != null ? picture.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Brand(brandName=" + this.brandName + ", brandLogo=" + this.brandLogo + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.brandName);
        Picture picture = this.brandLogo;
        if (picture == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            picture.writeToParcel(dest, flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/Brand$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/manufacturer/response/Brand;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Brand$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Brand> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Brand createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new Brand(parcel.readString(), parcel.readInt() == 0 ? null : Picture.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Brand[] newArray(int i11) {
            return new Brand[i11];
        }
    }

    @g("brand_logo")
    public static /* synthetic */ void getBrandLogo$annotations() {
    }

    @g("brand_name")
    public static /* synthetic */ void getBrandName$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Brand() {
        this((String) null, (Picture) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public Brand(@Nullable String str, @Nullable Picture picture) {
        this.brandName = str;
        this.brandLogo = picture;
    }

    public /* synthetic */ Brand(String str, Picture picture, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : picture);
    }
}
