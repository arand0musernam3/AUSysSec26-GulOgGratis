package com.app.tgtg.model.remote.payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.braze.Constants;
import i90.g;
import i90.h;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.m1;
import n90.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002;<B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0007\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0002¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\u001cJ\u001d\u0010&\u001a\u00020\u00122\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0004¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010!J\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010\u001cJ\u0010\u0010*\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b*\u0010\u001cJ.\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010!R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00102\u0012\u0004\b4\u00101\u001a\u0004\b3\u0010\u001cR \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00102\u0012\u0004\b6\u00101\u001a\u0004\b5\u0010\u001cR\u0011\u0010:\u001a\u0002078F¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006="}, d2 = {"Lcom/app/tgtg/model/remote/payment/Price;", "Landroid/os/Parcelable;", "", "currency", "", "decimals", "minorUnits", "<init>", "(Ljava/lang/String;II)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;IILm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/payment/Price;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "quantity", "multiply", "(I)Lcom/app/tgtg/model/remote/payment/Price;", "toJson", "()Ljava/lang/String;", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "component3", "copy", "(Ljava/lang/String;II)Lcom/app/tgtg/model/remote/payment/Price;", "toString", "Ljava/lang/String;", "getCurrency", "getCurrency$annotations", "()V", "I", "getDecimals", "getDecimals$annotations", "getMinorUnits", "getMinorUnits$annotations", "", "getValue", "()D", "value", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class Price implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    private final String currency;
    private final int decimals;
    private final int minorUnits;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<Price> CREATOR = new Creator();

    public /* synthetic */ Price(int i11, String str, int i12, int i13, m1 m1Var) {
        if (1 != (i11 & 1)) {
            c1.j(i11, 1, Price$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.currency = str;
        if ((i11 & 2) == 0) {
            this.decimals = 0;
        } else {
            this.decimals = i12;
        }
        if ((i11 & 4) == 0) {
            this.minorUnits = 0;
        } else {
            this.minorUnits = i13;
        }
    }

    public static /* synthetic */ Price copy$default(Price price, String str, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = price.currency;
        }
        if ((i13 & 2) != 0) {
            i11 = price.decimals;
        }
        if ((i13 & 4) != 0) {
            i12 = price.minorUnits;
        }
        return price.copy(str, i11, i12);
    }

    @NotNull
    public static final Price fromJson(@NotNull String str) {
        return INSTANCE.fromJson(str);
    }

    public static final /* synthetic */ void write$Self$app(Price self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.currency);
        output.m(1, self.decimals, serialDesc);
        output.m(2, self.minorUnits, serialDesc);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDecimals() {
        return this.decimals;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMinorUnits() {
        return this.minorUnits;
    }

    @NotNull
    public final Price copy(@NotNull String currency, int decimals, int minorUnits) {
        currency.getClass();
        return new Price(currency, decimals, minorUnits);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Price)) {
            return false;
        }
        Price price = (Price) other;
        return this.decimals == price.decimals && this.minorUnits == price.minorUnits && Intrinsics.areEqual(this.currency, price.currency);
    }

    @NotNull
    public final String getCurrency() {
        return this.currency;
    }

    public final int getDecimals() {
        return this.decimals;
    }

    public final int getMinorUnits() {
        return this.minorUnits;
    }

    public final double getValue() {
        double d3 = this.minorUnits;
        for (int i11 = 0; i11 < this.decimals; i11++) {
            d3 /= 10.0d;
        }
        return d3;
    }

    public int hashCode() {
        return Objects.hash(this.currency, Integer.valueOf(this.decimals), Integer.valueOf(this.minorUnits));
    }

    @NotNull
    public final Price multiply(int quantity) {
        return new Price(this.currency, this.decimals, this.minorUnits * quantity);
    }

    @NotNull
    public final String toJson() {
        return c.f30748d.c(INSTANCE.serializer(), this);
    }

    @NotNull
    public String toString() {
        String str = this.currency;
        int i11 = this.decimals;
        int i12 = this.minorUnits;
        StringBuilder sb2 = new StringBuilder("Price(currency=");
        sb2.append(str);
        sb2.append(", decimals=");
        sb2.append(i11);
        sb2.append(", minorUnits=");
        return k.i(i12, ")", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.currency);
        dest.writeInt(this.decimals);
        dest.writeInt(this.minorUnits);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¨\u0006\n"}, d2 = {"Lcom/app/tgtg/model/remote/payment/Price$Companion;", "", "<init>", "()V", "fromJson", "Lcom/app/tgtg/model/remote/payment/Price;", Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, "", "serializer", "Lkotlinx/serialization/KSerializer;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Price fromJson(@NotNull String s7) {
            s7.getClass();
            return (Price) c.f30748d.b(serializer(), s7);
        }

        @NotNull
        public final KSerializer serializer() {
            return Price$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Price> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Price createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new Price(parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Price[] newArray(int i11) {
            return new Price[i11];
        }
    }

    @g("code")
    public static /* synthetic */ void getCurrency$annotations() {
    }

    @g("decimals")
    public static /* synthetic */ void getDecimals$annotations() {
    }

    @g("minor_units")
    public static /* synthetic */ void getMinorUnits$annotations() {
    }

    public Price(@NotNull String str, int i11, int i12) {
        str.getClass();
        this.currency = str;
        this.decimals = i11;
        this.minorUnits = i12;
    }

    public /* synthetic */ Price(String str, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? 0 : i12);
    }
}
