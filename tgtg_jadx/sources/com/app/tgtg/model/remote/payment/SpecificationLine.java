package com.app.tgtg.model.remote.payment;

import android.os.Parcel;
import android.os.Parcelable;
import i90.g;
import i90.h;
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
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J0\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b'\u0010$J\u0010\u0010(\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b(\u0010\u0019J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010 R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00100\u0012\u0004\b2\u00103\u001a\u0004\b1\u0010\"R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00104\u0012\u0004\b6\u00103\u001a\u0004\b5\u0010$¨\u00069"}, d2 = {"Lcom/app/tgtg/model/remote/payment/SpecificationLine;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/payment/Price;", "amount", "Lcom/app/tgtg/model/remote/payment/LineType;", "lineType", "", "displayValue", "<init>", "(Lcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/LineType;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/LineType;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/payment/SpecificationLine;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/app/tgtg/model/remote/payment/Price;", "component2", "()Lcom/app/tgtg/model/remote/payment/LineType;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/app/tgtg/model/remote/payment/Price;Lcom/app/tgtg/model/remote/payment/LineType;Ljava/lang/String;)Lcom/app/tgtg/model/remote/payment/SpecificationLine;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/app/tgtg/model/remote/payment/Price;", "getAmount", "Lcom/app/tgtg/model/remote/payment/LineType;", "getLineType", "getLineType$annotations", "()V", "Ljava/lang/String;", "getDisplayValue", "getDisplayValue$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class SpecificationLine implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    private final Price amount;

    @Nullable
    private final String displayValue;

    @NotNull
    private final LineType lineType;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<SpecificationLine> CREATOR = new Creator();

    public /* synthetic */ SpecificationLine(int i11, Price price, LineType lineType, String str, m1 m1Var) {
        if (7 != (i11 & 7)) {
            c1.j(i11, 7, SpecificationLine$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.amount = price;
        this.lineType = lineType;
        this.displayValue = str;
    }

    public static /* synthetic */ SpecificationLine copy$default(SpecificationLine specificationLine, Price price, LineType lineType, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            price = specificationLine.amount;
        }
        if ((i11 & 2) != 0) {
            lineType = specificationLine.lineType;
        }
        if ((i11 & 4) != 0) {
            str = specificationLine.displayValue;
        }
        return specificationLine.copy(price, lineType, str);
    }

    public static final /* synthetic */ void write$Self$app(SpecificationLine self, b output, SerialDescriptor serialDesc) {
        output.i(serialDesc, 0, Price$$serializer.INSTANCE, self.amount);
        output.i(serialDesc, 1, LineTypeSerializer.INSTANCE, self.lineType);
        output.r(serialDesc, 2, r1.f29848a, self.displayValue);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Price getAmount() {
        return this.amount;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LineType getLineType() {
        return this.lineType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDisplayValue() {
        return this.displayValue;
    }

    @NotNull
    public final SpecificationLine copy(@NotNull Price amount, @NotNull LineType lineType, @Nullable String displayValue) {
        amount.getClass();
        lineType.getClass();
        return new SpecificationLine(amount, lineType, displayValue);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpecificationLine)) {
            return false;
        }
        SpecificationLine specificationLine = (SpecificationLine) other;
        return Intrinsics.areEqual(this.amount, specificationLine.amount) && this.lineType == specificationLine.lineType && Intrinsics.areEqual(this.displayValue, specificationLine.displayValue);
    }

    @NotNull
    public final Price getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getDisplayValue() {
        return this.displayValue;
    }

    @NotNull
    public final LineType getLineType() {
        return this.lineType;
    }

    public int hashCode() {
        int iHashCode = (this.lineType.hashCode() + (this.amount.hashCode() * 31)) * 31;
        String str = this.displayValue;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        Price price = this.amount;
        LineType lineType = this.lineType;
        String str = this.displayValue;
        StringBuilder sb2 = new StringBuilder("SpecificationLine(amount=");
        sb2.append(price);
        sb2.append(", lineType=");
        sb2.append(lineType);
        sb2.append(", displayValue=");
        return k.p(sb2, str, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        this.amount.writeToParcel(dest, flags);
        dest.writeString(this.lineType.name());
        dest.writeString(this.displayValue);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/payment/SpecificationLine$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/payment/SpecificationLine;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return SpecificationLine$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SpecificationLine> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpecificationLine createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new SpecificationLine(Price.CREATOR.createFromParcel(parcel), LineType.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpecificationLine[] newArray(int i11) {
            return new SpecificationLine[i11];
        }
    }

    @g("localized_display_string")
    public static /* synthetic */ void getDisplayValue$annotations() {
    }

    @g("line_type")
    public static /* synthetic */ void getLineType$annotations() {
    }

    public SpecificationLine(@NotNull Price price, @NotNull LineType lineType, @Nullable String str) {
        price.getClass();
        lineType.getClass();
        this.amount = price;
        this.lineType = lineType;
        this.displayValue = str;
    }
}
