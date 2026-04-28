package com.app.tgtg.model.remote.user.response.charity;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import i90.g;
import i90.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.l0;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 22\u00020\u0001:\u000232B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ&\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b%\u0010\u0016J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u001dR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010/\u0012\u0004\b1\u0010.\u001a\u0004\b0\u0010\u001f¨\u00064"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/charity/ProductChangelog;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/user/response/charity/ProductStatus;", "status", "", "quantity", "<init>", "(Lcom/app/tgtg/model/remote/user/response/charity/ProductStatus;Ljava/lang/Integer;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/user/response/charity/ProductStatus;Ljava/lang/Integer;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/response/charity/ProductChangelog;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/app/tgtg/model/remote/user/response/charity/ProductStatus;", "component2", "()Ljava/lang/Integer;", "copy", "(Lcom/app/tgtg/model/remote/user/response/charity/ProductStatus;Ljava/lang/Integer;)Lcom/app/tgtg/model/remote/user/response/charity/ProductChangelog;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/app/tgtg/model/remote/user/response/charity/ProductStatus;", "getStatus", "getStatus$annotations", "()V", "Ljava/lang/Integer;", "getQuantity", "getQuantity$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ProductChangelog implements Parcelable {
    public static final int $stable = 0;

    @Nullable
    private final Integer quantity;

    @NotNull
    private final ProductStatus status;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<ProductChangelog> CREATOR = new Creator();

    public /* synthetic */ ProductChangelog(int i11, ProductStatus productStatus, Integer num, m1 m1Var) {
        if (1 != (i11 & 1)) {
            c1.j(i11, 1, ProductChangelog$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.status = productStatus;
        if ((i11 & 2) == 0) {
            this.quantity = null;
        } else {
            this.quantity = num;
        }
    }

    public static /* synthetic */ ProductChangelog copy$default(ProductChangelog productChangelog, ProductStatus productStatus, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            productStatus = productChangelog.status;
        }
        if ((i11 & 2) != 0) {
            num = productChangelog.quantity;
        }
        return productChangelog.copy(productStatus, num);
    }

    public static final /* synthetic */ void write$Self$app(ProductChangelog self, b output, SerialDescriptor serialDesc) {
        output.i(serialDesc, 0, ProductStatusSerializer.INSTANCE, self.status);
        if (!output.C(serialDesc) && self.quantity == null) {
            return;
        }
        output.r(serialDesc, 1, l0.f29821a, self.quantity);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ProductStatus getStatus() {
        return this.status;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getQuantity() {
        return this.quantity;
    }

    @NotNull
    public final ProductChangelog copy(@NotNull ProductStatus status, @Nullable Integer quantity) {
        status.getClass();
        return new ProductChangelog(status, quantity);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductChangelog)) {
            return false;
        }
        ProductChangelog productChangelog = (ProductChangelog) other;
        return this.status == productChangelog.status && Intrinsics.areEqual(this.quantity, productChangelog.quantity);
    }

    @Nullable
    public final Integer getQuantity() {
        return this.quantity;
    }

    @NotNull
    public final ProductStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        Integer num = this.quantity;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        return "ProductChangelog(status=" + this.status + ", quantity=" + this.quantity + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.status.name());
        Integer num = this.quantity;
        if (num == null) {
            dest.writeInt(0);
        } else {
            i.w(dest, 1, num);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/charity/ProductChangelog$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/response/charity/ProductChangelog;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ProductChangelog$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ProductChangelog> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductChangelog createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ProductChangelog(ProductStatus.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ProductChangelog[] newArray(int i11) {
            return new ProductChangelog[i11];
        }
    }

    @g("old_value")
    public static /* synthetic */ void getQuantity$annotations() {
    }

    @g("type")
    public static /* synthetic */ void getStatus$annotations() {
    }

    public ProductChangelog(@NotNull ProductStatus productStatus, @Nullable Integer num) {
        productStatus.getClass();
        this.status = productStatus;
        this.quantity = num;
    }

    public /* synthetic */ ProductChangelog(ProductStatus productStatus, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(productStatus, (i11 & 2) != 0 ? null : num);
    }
}
