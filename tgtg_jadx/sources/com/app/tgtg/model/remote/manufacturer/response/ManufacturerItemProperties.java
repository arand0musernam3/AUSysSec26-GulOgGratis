package com.app.tgtg.model.remote.manufacturer.response;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.payment.Price$$serializer;
import i90.h;
import j4.s;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.g;
import m90.l0;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 W2\u00020\u0001:\u0002XWB\u007f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0011\u0010\u0012B\u007f\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b-\u0010*J\u0088\u0001\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b0\u0010%J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u0010\u0018J\u001a\u00104\u001a\u00020\f2\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b4\u00105J'\u0010=\u001a\u00020\u001c2\u0006\u00106\u001a\u00020\u00002\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0001¢\u0006\u0004\b;\u0010<R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010>\u0012\u0004\b@\u0010A\u001a\u0004\b?\u0010 R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010>\u0012\u0004\bC\u0010A\u001a\u0004\bB\u0010 R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010>\u0012\u0004\bE\u0010A\u001a\u0004\bD\u0010 R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010>\u0012\u0004\bG\u0010A\u001a\u0004\bF\u0010 R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010H\u0012\u0004\bJ\u0010A\u001a\u0004\bI\u0010%R\"\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010H\u0012\u0004\bL\u0010A\u001a\u0004\bK\u0010%R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010M\u0012\u0004\bO\u0010A\u001a\u0004\bN\u0010(R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010P\u0012\u0004\bQ\u0010A\u001a\u0004\b\r\u0010*R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010R\u0012\u0004\bT\u0010A\u001a\u0004\bS\u0010,R\"\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010P\u0012\u0004\bV\u0010A\u001a\u0004\bU\u0010*¨\u0006Y"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/ManufacturerItemProperties;", "Landroid/os/Parcelable;", "", "bowWeightGrams", "boxWidthMm", "boxHeightMm", "boxLengthMm", "", "estimatedDelivery", "minimumExpirationDate", "Lcom/app/tgtg/model/remote/manufacturer/response/Brand;", "brand", "", "isDiscounted", "Lcom/app/tgtg/model/remote/payment/Price;", "bottleDeposit", "freeDelivery", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/manufacturer/response/Brand;Ljava/lang/Boolean;Lcom/app/tgtg/model/remote/payment/Price;Ljava/lang/Boolean;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/manufacturer/response/Brand;Ljava/lang/Boolean;Lcom/app/tgtg/model/remote/payment/Price;Ljava/lang/Boolean;Lm90/m1;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/Integer;", "component2", "component3", "component4", "component5", "()Ljava/lang/String;", "component6", "component7", "()Lcom/app/tgtg/model/remote/manufacturer/response/Brand;", "component8", "()Ljava/lang/Boolean;", "component9", "()Lcom/app/tgtg/model/remote/payment/Price;", "component10", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/manufacturer/response/Brand;Ljava/lang/Boolean;Lcom/app/tgtg/model/remote/payment/Price;Ljava/lang/Boolean;)Lcom/app/tgtg/model/remote/manufacturer/response/ManufacturerItemProperties;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/manufacturer/response/ManufacturerItemProperties;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/Integer;", "getBowWeightGrams", "getBowWeightGrams$annotations", "()V", "getBoxWidthMm", "getBoxWidthMm$annotations", "getBoxHeightMm", "getBoxHeightMm$annotations", "getBoxLengthMm", "getBoxLengthMm$annotations", "Ljava/lang/String;", "getEstimatedDelivery", "getEstimatedDelivery$annotations", "getMinimumExpirationDate", "getMinimumExpirationDate$annotations", "Lcom/app/tgtg/model/remote/manufacturer/response/Brand;", "getBrand", "getBrand$annotations", "Ljava/lang/Boolean;", "isDiscounted$annotations", "Lcom/app/tgtg/model/remote/payment/Price;", "getBottleDeposit", "getBottleDeposit$annotations", "getFreeDelivery", "getFreeDelivery$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ManufacturerItemProperties implements Parcelable {

    @Nullable
    private final Price bottleDeposit;

    @Nullable
    private final Integer bowWeightGrams;

    @Nullable
    private final Integer boxHeightMm;

    @Nullable
    private final Integer boxLengthMm;

    @Nullable
    private final Integer boxWidthMm;

    @Nullable
    private final Brand brand;

    @Nullable
    private final String estimatedDelivery;

    @Nullable
    private final Boolean freeDelivery;

    @Nullable
    private final Boolean isDiscounted;

    @Nullable
    private final String minimumExpirationDate;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ManufacturerItemProperties> CREATOR = new Creator();

    public /* synthetic */ ManufacturerItemProperties(int i11, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, Brand brand, Boolean bool, Price price, Boolean bool2, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.bowWeightGrams = null;
        } else {
            this.bowWeightGrams = num;
        }
        if ((i11 & 2) == 0) {
            this.boxWidthMm = null;
        } else {
            this.boxWidthMm = num2;
        }
        if ((i11 & 4) == 0) {
            this.boxHeightMm = null;
        } else {
            this.boxHeightMm = num3;
        }
        if ((i11 & 8) == 0) {
            this.boxLengthMm = null;
        } else {
            this.boxLengthMm = num4;
        }
        if ((i11 & 16) == 0) {
            this.estimatedDelivery = null;
        } else {
            this.estimatedDelivery = str;
        }
        if ((i11 & 32) == 0) {
            this.minimumExpirationDate = null;
        } else {
            this.minimumExpirationDate = str2;
        }
        if ((i11 & 64) == 0) {
            this.brand = null;
        } else {
            this.brand = brand;
        }
        if ((i11 & 128) == 0) {
            this.isDiscounted = Boolean.FALSE;
        } else {
            this.isDiscounted = bool;
        }
        if ((i11 & 256) == 0) {
            this.bottleDeposit = null;
        } else {
            this.bottleDeposit = price;
        }
        if ((i11 & 512) == 0) {
            this.freeDelivery = null;
        } else {
            this.freeDelivery = bool2;
        }
    }

    public static /* synthetic */ ManufacturerItemProperties copy$default(ManufacturerItemProperties manufacturerItemProperties, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, Brand brand, Boolean bool, Price price, Boolean bool2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = manufacturerItemProperties.bowWeightGrams;
        }
        if ((i11 & 2) != 0) {
            num2 = manufacturerItemProperties.boxWidthMm;
        }
        if ((i11 & 4) != 0) {
            num3 = manufacturerItemProperties.boxHeightMm;
        }
        if ((i11 & 8) != 0) {
            num4 = manufacturerItemProperties.boxLengthMm;
        }
        if ((i11 & 16) != 0) {
            str = manufacturerItemProperties.estimatedDelivery;
        }
        if ((i11 & 32) != 0) {
            str2 = manufacturerItemProperties.minimumExpirationDate;
        }
        if ((i11 & 64) != 0) {
            brand = manufacturerItemProperties.brand;
        }
        if ((i11 & 128) != 0) {
            bool = manufacturerItemProperties.isDiscounted;
        }
        if ((i11 & 256) != 0) {
            price = manufacturerItemProperties.bottleDeposit;
        }
        if ((i11 & 512) != 0) {
            bool2 = manufacturerItemProperties.freeDelivery;
        }
        Price price2 = price;
        Boolean bool3 = bool2;
        Brand brand2 = brand;
        Boolean bool4 = bool;
        String str3 = str;
        String str4 = str2;
        return manufacturerItemProperties.copy(num, num2, num3, num4, str3, str4, brand2, bool4, price2, bool3);
    }

    public static final /* synthetic */ void write$Self$app(ManufacturerItemProperties self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.bowWeightGrams != null) {
            output.r(serialDesc, 0, l0.f29821a, self.bowWeightGrams);
        }
        if (output.C(serialDesc) || self.boxWidthMm != null) {
            output.r(serialDesc, 1, l0.f29821a, self.boxWidthMm);
        }
        if (output.C(serialDesc) || self.boxHeightMm != null) {
            output.r(serialDesc, 2, l0.f29821a, self.boxHeightMm);
        }
        if (output.C(serialDesc) || self.boxLengthMm != null) {
            output.r(serialDesc, 3, l0.f29821a, self.boxLengthMm);
        }
        if (output.C(serialDesc) || self.estimatedDelivery != null) {
            output.r(serialDesc, 4, r1.f29848a, self.estimatedDelivery);
        }
        if (output.C(serialDesc) || self.minimumExpirationDate != null) {
            output.r(serialDesc, 5, r1.f29848a, self.minimumExpirationDate);
        }
        if (output.C(serialDesc) || self.brand != null) {
            output.r(serialDesc, 6, Brand$$serializer.INSTANCE, self.brand);
        }
        if (output.C(serialDesc) || !Intrinsics.areEqual(self.isDiscounted, Boolean.FALSE)) {
            output.r(serialDesc, 7, g.f29797a, self.isDiscounted);
        }
        if (output.C(serialDesc) || self.bottleDeposit != null) {
            output.r(serialDesc, 8, Price$$serializer.INSTANCE, self.bottleDeposit);
        }
        if (!output.C(serialDesc) && self.freeDelivery == null) {
            return;
        }
        output.r(serialDesc, 9, g.f29797a, self.freeDelivery);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getBowWeightGrams() {
        return this.bowWeightGrams;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getFreeDelivery() {
        return this.freeDelivery;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getBoxWidthMm() {
        return this.boxWidthMm;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getBoxHeightMm() {
        return this.boxHeightMm;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getBoxLengthMm() {
        return this.boxLengthMm;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getEstimatedDelivery() {
        return this.estimatedDelivery;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMinimumExpirationDate() {
        return this.minimumExpirationDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Brand getBrand() {
        return this.brand;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getIsDiscounted() {
        return this.isDiscounted;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Price getBottleDeposit() {
        return this.bottleDeposit;
    }

    @NotNull
    public final ManufacturerItemProperties copy(@Nullable Integer bowWeightGrams, @Nullable Integer boxWidthMm, @Nullable Integer boxHeightMm, @Nullable Integer boxLengthMm, @Nullable String estimatedDelivery, @Nullable String minimumExpirationDate, @Nullable Brand brand, @Nullable Boolean isDiscounted, @Nullable Price bottleDeposit, @Nullable Boolean freeDelivery) {
        return new ManufacturerItemProperties(bowWeightGrams, boxWidthMm, boxHeightMm, boxLengthMm, estimatedDelivery, minimumExpirationDate, brand, isDiscounted, bottleDeposit, freeDelivery);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ManufacturerItemProperties)) {
            return false;
        }
        ManufacturerItemProperties manufacturerItemProperties = (ManufacturerItemProperties) other;
        return Intrinsics.areEqual(this.bowWeightGrams, manufacturerItemProperties.bowWeightGrams) && Intrinsics.areEqual(this.boxWidthMm, manufacturerItemProperties.boxWidthMm) && Intrinsics.areEqual(this.boxHeightMm, manufacturerItemProperties.boxHeightMm) && Intrinsics.areEqual(this.boxLengthMm, manufacturerItemProperties.boxLengthMm) && Intrinsics.areEqual(this.estimatedDelivery, manufacturerItemProperties.estimatedDelivery) && Intrinsics.areEqual(this.minimumExpirationDate, manufacturerItemProperties.minimumExpirationDate) && Intrinsics.areEqual(this.brand, manufacturerItemProperties.brand) && Intrinsics.areEqual(this.isDiscounted, manufacturerItemProperties.isDiscounted) && Intrinsics.areEqual(this.bottleDeposit, manufacturerItemProperties.bottleDeposit) && Intrinsics.areEqual(this.freeDelivery, manufacturerItemProperties.freeDelivery);
    }

    @Nullable
    public final Price getBottleDeposit() {
        return this.bottleDeposit;
    }

    @Nullable
    public final Integer getBowWeightGrams() {
        return this.bowWeightGrams;
    }

    @Nullable
    public final Integer getBoxHeightMm() {
        return this.boxHeightMm;
    }

    @Nullable
    public final Integer getBoxLengthMm() {
        return this.boxLengthMm;
    }

    @Nullable
    public final Integer getBoxWidthMm() {
        return this.boxWidthMm;
    }

    @Nullable
    public final Brand getBrand() {
        return this.brand;
    }

    @Nullable
    public final String getEstimatedDelivery() {
        return this.estimatedDelivery;
    }

    @Nullable
    public final Boolean getFreeDelivery() {
        return this.freeDelivery;
    }

    @Nullable
    public final String getMinimumExpirationDate() {
        return this.minimumExpirationDate;
    }

    public int hashCode() {
        Integer num = this.bowWeightGrams;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.boxWidthMm;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.boxHeightMm;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.boxLengthMm;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str = this.estimatedDelivery;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.minimumExpirationDate;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Brand brand = this.brand;
        int iHashCode7 = (iHashCode6 + (brand == null ? 0 : brand.hashCode())) * 31;
        Boolean bool = this.isDiscounted;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Price price = this.bottleDeposit;
        int iHashCode9 = (iHashCode8 + (price == null ? 0 : price.hashCode())) * 31;
        Boolean bool2 = this.freeDelivery;
        return iHashCode9 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @Nullable
    public final Boolean isDiscounted() {
        return this.isDiscounted;
    }

    @NotNull
    public String toString() {
        Integer num = this.bowWeightGrams;
        Integer num2 = this.boxWidthMm;
        Integer num3 = this.boxHeightMm;
        Integer num4 = this.boxLengthMm;
        String str = this.estimatedDelivery;
        String str2 = this.minimumExpirationDate;
        Brand brand = this.brand;
        Boolean bool = this.isDiscounted;
        Price price = this.bottleDeposit;
        Boolean bool2 = this.freeDelivery;
        StringBuilder sb2 = new StringBuilder("ManufacturerItemProperties(bowWeightGrams=");
        sb2.append(num);
        sb2.append(", boxWidthMm=");
        sb2.append(num2);
        sb2.append(", boxHeightMm=");
        s.z(sb2, num3, ", boxLengthMm=", num4, ", estimatedDelivery=");
        s.A(sb2, str, ", minimumExpirationDate=", str2, ", brand=");
        sb2.append(brand);
        sb2.append(", isDiscounted=");
        sb2.append(bool);
        sb2.append(", bottleDeposit=");
        sb2.append(price);
        sb2.append(", freeDelivery=");
        sb2.append(bool2);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        Integer num = this.bowWeightGrams;
        if (num == null) {
            dest.writeInt(0);
        } else {
            i.w(dest, 1, num);
        }
        Integer num2 = this.boxWidthMm;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            i.w(dest, 1, num2);
        }
        Integer num3 = this.boxHeightMm;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            i.w(dest, 1, num3);
        }
        Integer num4 = this.boxLengthMm;
        if (num4 == null) {
            dest.writeInt(0);
        } else {
            i.w(dest, 1, num4);
        }
        dest.writeString(this.estimatedDelivery);
        dest.writeString(this.minimumExpirationDate);
        Brand brand = this.brand;
        if (brand == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            brand.writeToParcel(dest, flags);
        }
        Boolean bool = this.isDiscounted;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            i.v(dest, 1, bool);
        }
        Price price = this.bottleDeposit;
        if (price == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            price.writeToParcel(dest, flags);
        }
        Boolean bool2 = this.freeDelivery;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            i.v(dest, 1, bool2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/ManufacturerItemProperties$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/manufacturer/response/ManufacturerItemProperties;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ManufacturerItemProperties$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ManufacturerItemProperties> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ManufacturerItemProperties createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            parcel.getClass();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            Integer num = numValueOf2;
            Integer num2 = numValueOf3;
            Integer num3 = numValueOf4;
            String string2 = parcel.readString();
            Brand brandCreateFromParcel = parcel.readInt() == 0 ? null : Brand.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Price priceCreateFromParcel = parcel.readInt() == 0 ? null : Price.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ManufacturerItemProperties(numValueOf, num, num2, num3, string, string2, brandCreateFromParcel, boolValueOf, priceCreateFromParcel, boolValueOf2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ManufacturerItemProperties[] newArray(int i11) {
            return new ManufacturerItemProperties[i11];
        }
    }

    @i90.g("bottle_deposit")
    public static /* synthetic */ void getBottleDeposit$annotations() {
    }

    @i90.g("box_weight_grams")
    public static /* synthetic */ void getBowWeightGrams$annotations() {
    }

    @i90.g("box_height_mm")
    public static /* synthetic */ void getBoxHeightMm$annotations() {
    }

    @i90.g("box_length_mm")
    public static /* synthetic */ void getBoxLengthMm$annotations() {
    }

    @i90.g("box_width_mm")
    public static /* synthetic */ void getBoxWidthMm$annotations() {
    }

    @i90.g("brand")
    public static /* synthetic */ void getBrand$annotations() {
    }

    @i90.g("estimated_delivery")
    public static /* synthetic */ void getEstimatedDelivery$annotations() {
    }

    @i90.g("free_delivery")
    public static /* synthetic */ void getFreeDelivery$annotations() {
    }

    @i90.g("minimum_expiration_date")
    public static /* synthetic */ void getMinimumExpirationDate$annotations() {
    }

    @i90.g("is_discounted")
    public static /* synthetic */ void isDiscounted$annotations() {
    }

    public ManufacturerItemProperties() {
        this((Integer) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (Brand) null, (Boolean) null, (Price) null, (Boolean) null, 1023, (DefaultConstructorMarker) null);
    }

    public ManufacturerItemProperties(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable String str, @Nullable String str2, @Nullable Brand brand, @Nullable Boolean bool, @Nullable Price price, @Nullable Boolean bool2) {
        this.bowWeightGrams = num;
        this.boxWidthMm = num2;
        this.boxHeightMm = num3;
        this.boxLengthMm = num4;
        this.estimatedDelivery = str;
        this.minimumExpirationDate = str2;
        this.brand = brand;
        this.isDiscounted = bool;
        this.bottleDeposit = price;
        this.freeDelivery = bool2;
    }

    public /* synthetic */ ManufacturerItemProperties(Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, Brand brand, Boolean bool, Price price, Boolean bool2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : num2, (i11 & 4) != 0 ? null : num3, (i11 & 8) != 0 ? null : num4, (i11 & 16) != 0 ? null : str, (i11 & 32) != 0 ? null : str2, (i11 & 64) != 0 ? null : brand, (i11 & 128) != 0 ? Boolean.FALSE : bool, (i11 & 256) != 0 ? null : price, (i11 & 512) != 0 ? null : bool2);
    }
}
