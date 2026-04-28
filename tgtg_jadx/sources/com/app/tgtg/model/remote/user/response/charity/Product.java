package com.app.tgtg.model.remote.user.response.charity;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
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
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EDBK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fBU\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001bJT\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001bJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010\u0013J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b*\u0010+J'\u00103\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b1\u00102R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00104\u0012\u0004\b6\u00107\u001a\u0004\b5\u0010\u001bR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00108\u0012\u0004\b:\u00107\u001a\u0004\b9\u0010\u001dR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00104\u0012\u0004\b<\u00107\u001a\u0004\b;\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00104\u0012\u0004\b>\u00107\u001a\u0004\b=\u0010\u001bR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010?\u0012\u0004\bA\u00107\u001a\u0004\b@\u0010!R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00104\u0012\u0004\bC\u00107\u001a\u0004\bB\u0010\u001b¨\u0006F"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/charity/Product;", "Landroid/os/Parcelable;", "", "name", "", "quantity", "logo", "measurement", "Lcom/app/tgtg/model/remote/user/response/charity/ProductChangelog;", "changelog", "expiryDate", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/user/response/charity/ProductChangelog;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/user/response/charity/ProductChangelog;Ljava/lang/String;Lm90/m1;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "()J", "component3", "component4", "component5", "()Lcom/app/tgtg/model/remote/user/response/charity/ProductChangelog;", "component6", "copy", "(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/user/response/charity/ProductChangelog;Ljava/lang/String;)Lcom/app/tgtg/model/remote/user/response/charity/Product;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/response/charity/Product;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getName", "getName$annotations", "()V", "J", "getQuantity", "getQuantity$annotations", "getLogo", "getLogo$annotations", "getMeasurement", "getMeasurement$annotations", "Lcom/app/tgtg/model/remote/user/response/charity/ProductChangelog;", "getChangelog", "getChangelog$annotations", "getExpiryDate", "getExpiryDate$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class Product implements Parcelable {
    public static final int $stable = 0;

    @Nullable
    private final ProductChangelog changelog;

    @Nullable
    private final String expiryDate;

    @Nullable
    private final String logo;

    @Nullable
    private final String measurement;

    @NotNull
    private final String name;
    private final long quantity;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<Product> CREATOR = new Creator();

    public /* synthetic */ Product(int i11, String str, long j9, String str2, String str3, ProductChangelog productChangelog, String str4, m1 m1Var) {
        this.name = (i11 & 1) == 0 ? "" : str;
        if ((i11 & 2) == 0) {
            this.quantity = 1L;
        } else {
            this.quantity = j9;
        }
        if ((i11 & 4) == 0) {
            this.logo = null;
        } else {
            this.logo = str2;
        }
        if ((i11 & 8) == 0) {
            this.measurement = null;
        } else {
            this.measurement = str3;
        }
        if ((i11 & 16) == 0) {
            this.changelog = null;
        } else {
            this.changelog = productChangelog;
        }
        if ((i11 & 32) == 0) {
            this.expiryDate = null;
        } else {
            this.expiryDate = str4;
        }
    }

    public static /* synthetic */ Product copy$default(Product product, String str, long j9, String str2, String str3, ProductChangelog productChangelog, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = product.name;
        }
        if ((i11 & 2) != 0) {
            j9 = product.quantity;
        }
        if ((i11 & 4) != 0) {
            str2 = product.logo;
        }
        if ((i11 & 8) != 0) {
            str3 = product.measurement;
        }
        if ((i11 & 16) != 0) {
            productChangelog = product.changelog;
        }
        if ((i11 & 32) != 0) {
            str4 = product.expiryDate;
        }
        return product.copy(str, j9, str2, str3, productChangelog, str4);
    }

    public static final /* synthetic */ void write$Self$app(Product self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || !Intrinsics.areEqual(self.name, "")) {
            output.q(serialDesc, 0, self.name);
        }
        if (output.C(serialDesc) || self.quantity != 1) {
            output.B(serialDesc, 1, self.quantity);
        }
        if (output.C(serialDesc) || self.logo != null) {
            output.r(serialDesc, 2, r1.f29848a, self.logo);
        }
        if (output.C(serialDesc) || self.measurement != null) {
            output.r(serialDesc, 3, r1.f29848a, self.measurement);
        }
        if (output.C(serialDesc) || self.changelog != null) {
            output.r(serialDesc, 4, ProductChangelog$$serializer.INSTANCE, self.changelog);
        }
        if (!output.C(serialDesc) && self.expiryDate == null) {
            return;
        }
        output.r(serialDesc, 5, r1.f29848a, self.expiryDate);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getQuantity() {
        return this.quantity;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMeasurement() {
        return this.measurement;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ProductChangelog getChangelog() {
        return this.changelog;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getExpiryDate() {
        return this.expiryDate;
    }

    @NotNull
    public final Product copy(@NotNull String name, long quantity, @Nullable String logo, @Nullable String measurement, @Nullable ProductChangelog changelog, @Nullable String expiryDate) {
        name.getClass();
        return new Product(name, quantity, logo, measurement, changelog, expiryDate);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Product)) {
            return false;
        }
        Product product = (Product) other;
        return Intrinsics.areEqual(this.name, product.name) && this.quantity == product.quantity && Intrinsics.areEqual(this.logo, product.logo) && Intrinsics.areEqual(this.measurement, product.measurement) && Intrinsics.areEqual(this.changelog, product.changelog) && Intrinsics.areEqual(this.expiryDate, product.expiryDate);
    }

    @Nullable
    public final ProductChangelog getChangelog() {
        return this.changelog;
    }

    @Nullable
    public final String getExpiryDate() {
        return this.expiryDate;
    }

    @Nullable
    public final String getLogo() {
        return this.logo;
    }

    @Nullable
    public final String getMeasurement() {
        return this.measurement;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final long getQuantity() {
        return this.quantity;
    }

    public int hashCode() {
        int iB = f.b(this.name.hashCode() * 31, 31, this.quantity);
        String str = this.logo;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.measurement;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ProductChangelog productChangelog = this.changelog;
        int iHashCode3 = (iHashCode2 + (productChangelog == null ? 0 : productChangelog.hashCode())) * 31;
        String str3 = this.expiryDate;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        long j9 = this.quantity;
        String str2 = this.logo;
        String str3 = this.measurement;
        ProductChangelog productChangelog = this.changelog;
        String str4 = this.expiryDate;
        StringBuilder sbN = i.n(j9, "Product(name=", str, ", quantity=");
        s.A(sbN, ", logo=", str2, ", measurement=", str3);
        sbN.append(", changelog=");
        sbN.append(productChangelog);
        sbN.append(", expiryDate=");
        sbN.append(str4);
        sbN.append(")");
        return sbN.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.name);
        dest.writeLong(this.quantity);
        dest.writeString(this.logo);
        dest.writeString(this.measurement);
        ProductChangelog productChangelog = this.changelog;
        if (productChangelog == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            productChangelog.writeToParcel(dest, flags);
        }
        dest.writeString(this.expiryDate);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/charity/Product$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/response/charity/Product;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Product$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Product> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Product createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new Product(parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ProductChangelog.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Product[] newArray(int i11) {
            return new Product[i11];
        }
    }

    @g("changelog")
    public static /* synthetic */ void getChangelog$annotations() {
    }

    @g("expiry_date")
    public static /* synthetic */ void getExpiryDate$annotations() {
    }

    @g("logo_url")
    public static /* synthetic */ void getLogo$annotations() {
    }

    @g("measurement")
    public static /* synthetic */ void getMeasurement$annotations() {
    }

    @g("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @g("quantity")
    public static /* synthetic */ void getQuantity$annotations() {
    }

    public Product() {
        this((String) null, 0L, (String) null, (String) null, (ProductChangelog) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    public Product(@NotNull String str, long j9, @Nullable String str2, @Nullable String str3, @Nullable ProductChangelog productChangelog, @Nullable String str4) {
        str.getClass();
        this.name = str;
        this.quantity = j9;
        this.logo = str2;
        this.measurement = str3;
        this.changelog = productChangelog;
        this.expiryDate = str4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Product(String str, long j9, String str2, String str3, ProductChangelog productChangelog, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        String str5;
        ProductChangelog productChangelog2;
        String str6;
        String str7;
        str = (i11 & 1) != 0 ? "" : str;
        j9 = (i11 & 2) != 0 ? 1L : j9;
        str2 = (i11 & 4) != 0 ? null : str2;
        str3 = (i11 & 8) != 0 ? null : str3;
        productChangelog = (i11 & 16) != 0 ? null : productChangelog;
        if ((i11 & 32) != 0) {
            str5 = null;
            str7 = str3;
            productChangelog2 = productChangelog;
            str6 = str2;
        } else {
            str5 = str4;
            productChangelog2 = productChangelog;
            str6 = str2;
            str7 = str3;
        }
        this(str, j9, str6, str7, productChangelog2, str5);
    }
}
