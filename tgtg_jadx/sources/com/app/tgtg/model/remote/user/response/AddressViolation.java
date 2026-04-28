package com.app.tgtg.model.remote.user.response;

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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J2\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b'\u0010$J\u0010\u0010(\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b(\u0010\u0019J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010 R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00102\u0012\u0004\b4\u00101\u001a\u0004\b3\u0010\"R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00105\u0012\u0004\b7\u00101\u001a\u0004\b6\u0010$¨\u0006:"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/AddressViolation;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/user/response/AddressField;", "field", "Lcom/app/tgtg/model/remote/user/response/InvalidAddressSeverity;", "severity", "", "invalidReason", "<init>", "(Lcom/app/tgtg/model/remote/user/response/AddressField;Lcom/app/tgtg/model/remote/user/response/InvalidAddressSeverity;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/user/response/AddressField;Lcom/app/tgtg/model/remote/user/response/InvalidAddressSeverity;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/user/response/AddressViolation;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/app/tgtg/model/remote/user/response/AddressField;", "component2", "()Lcom/app/tgtg/model/remote/user/response/InvalidAddressSeverity;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/app/tgtg/model/remote/user/response/AddressField;Lcom/app/tgtg/model/remote/user/response/InvalidAddressSeverity;Ljava/lang/String;)Lcom/app/tgtg/model/remote/user/response/AddressViolation;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/app/tgtg/model/remote/user/response/AddressField;", "getField", "getField$annotations", "()V", "Lcom/app/tgtg/model/remote/user/response/InvalidAddressSeverity;", "getSeverity", "getSeverity$annotations", "Ljava/lang/String;", "getInvalidReason", "getInvalidReason$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class AddressViolation implements Parcelable {
    public static final int $stable = 0;

    @Nullable
    private final AddressField field;

    @Nullable
    private final String invalidReason;

    @NotNull
    private final InvalidAddressSeverity severity;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<AddressViolation> CREATOR = new Creator();

    public /* synthetic */ AddressViolation(int i11, AddressField addressField, InvalidAddressSeverity invalidAddressSeverity, String str, m1 m1Var) {
        if (7 != (i11 & 7)) {
            c1.j(i11, 7, AddressViolation$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.field = addressField;
        this.severity = invalidAddressSeverity;
        this.invalidReason = str;
    }

    public static /* synthetic */ AddressViolation copy$default(AddressViolation addressViolation, AddressField addressField, InvalidAddressSeverity invalidAddressSeverity, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            addressField = addressViolation.field;
        }
        if ((i11 & 2) != 0) {
            invalidAddressSeverity = addressViolation.severity;
        }
        if ((i11 & 4) != 0) {
            str = addressViolation.invalidReason;
        }
        return addressViolation.copy(addressField, invalidAddressSeverity, str);
    }

    public static final /* synthetic */ void write$Self$app(AddressViolation self, b output, SerialDescriptor serialDesc) {
        output.r(serialDesc, 0, AddressFieldSerializer.INSTANCE, self.field);
        output.i(serialDesc, 1, InvalidAddressSeveritySerializer.INSTANCE, self.severity);
        output.r(serialDesc, 2, r1.f29848a, self.invalidReason);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AddressField getField() {
        return this.field;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final InvalidAddressSeverity getSeverity() {
        return this.severity;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getInvalidReason() {
        return this.invalidReason;
    }

    @NotNull
    public final AddressViolation copy(@Nullable AddressField field, @NotNull InvalidAddressSeverity severity, @Nullable String invalidReason) {
        severity.getClass();
        return new AddressViolation(field, severity, invalidReason);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressViolation)) {
            return false;
        }
        AddressViolation addressViolation = (AddressViolation) other;
        return this.field == addressViolation.field && this.severity == addressViolation.severity && Intrinsics.areEqual(this.invalidReason, addressViolation.invalidReason);
    }

    @Nullable
    public final AddressField getField() {
        return this.field;
    }

    @Nullable
    public final String getInvalidReason() {
        return this.invalidReason;
    }

    @NotNull
    public final InvalidAddressSeverity getSeverity() {
        return this.severity;
    }

    public int hashCode() {
        AddressField addressField = this.field;
        int iHashCode = (this.severity.hashCode() + ((addressField == null ? 0 : addressField.hashCode()) * 31)) * 31;
        String str = this.invalidReason;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        AddressField addressField = this.field;
        InvalidAddressSeverity invalidAddressSeverity = this.severity;
        String str = this.invalidReason;
        StringBuilder sb2 = new StringBuilder("AddressViolation(field=");
        sb2.append(addressField);
        sb2.append(", severity=");
        sb2.append(invalidAddressSeverity);
        sb2.append(", invalidReason=");
        return k.p(sb2, str, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        AddressField addressField = this.field;
        if (addressField == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(addressField.name());
        }
        dest.writeString(this.severity.name());
        dest.writeString(this.invalidReason);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/user/response/AddressViolation$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/user/response/AddressViolation;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return AddressViolation$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AddressViolation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressViolation createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new AddressViolation(parcel.readInt() == 0 ? null : AddressField.valueOf(parcel.readString()), InvalidAddressSeverity.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressViolation[] newArray(int i11) {
            return new AddressViolation[i11];
        }
    }

    @g("field")
    public static /* synthetic */ void getField$annotations() {
    }

    @g("reason")
    public static /* synthetic */ void getInvalidReason$annotations() {
    }

    @g("severity")
    public static /* synthetic */ void getSeverity$annotations() {
    }

    public AddressViolation(@Nullable AddressField addressField, @NotNull InvalidAddressSeverity invalidAddressSeverity, @Nullable String str) {
        invalidAddressSeverity.getClass();
        this.field = addressField;
        this.severity = invalidAddressSeverity;
        this.invalidReason = str;
    }
}
