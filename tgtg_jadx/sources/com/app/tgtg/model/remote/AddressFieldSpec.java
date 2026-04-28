package com.app.tgtg.model.remote;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import com.app.tgtg.model.remote.user.response.AddressField;
import com.app.tgtg.model.remote.user.response.AddressFieldSerializer;
import i90.h;
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
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u0000 N2\u00020\u0001:\u0002ONBC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rBM\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\"\u0010#JL\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b&\u0010!J\u0010\u0010'\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b'\u0010\u0013J\u001a\u0010*\u001a\u00020\u00042\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+J'\u00103\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b1\u00102R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u00104\u0012\u0004\b8\u00109\u001a\u0004\b5\u0010\u001b\"\u0004\b6\u00107R*\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010:\u0012\u0004\b>\u00109\u001a\u0004\b;\u0010\u001d\"\u0004\b<\u0010=R*\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010?\u0012\u0004\bC\u00109\u001a\u0004\b@\u0010\u001f\"\u0004\bA\u0010BR*\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010D\u0012\u0004\bH\u00109\u001a\u0004\bE\u0010!\"\u0004\bF\u0010GR*\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000b\u0010I\u0012\u0004\bM\u00109\u001a\u0004\bJ\u0010#\"\u0004\bK\u0010L¨\u0006P"}, d2 = {"Lcom/app/tgtg/model/remote/AddressFieldSpec;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/user/response/AddressField;", "fieldName", "", "required", "", "maxLength", "", "regex", "Lcom/app/tgtg/model/remote/ServerKeyboardTypes;", "keyboardType", "<init>", "(Lcom/app/tgtg/model/remote/user/response/AddressField;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/app/tgtg/model/remote/ServerKeyboardTypes;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/user/response/AddressField;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/app/tgtg/model/remote/ServerKeyboardTypes;Lm90/m1;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/app/tgtg/model/remote/user/response/AddressField;", "component2", "()Ljava/lang/Boolean;", "component3", "()Ljava/lang/Integer;", "component4", "()Ljava/lang/String;", "component5", "()Lcom/app/tgtg/model/remote/ServerKeyboardTypes;", "copy", "(Lcom/app/tgtg/model/remote/user/response/AddressField;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Lcom/app/tgtg/model/remote/ServerKeyboardTypes;)Lcom/app/tgtg/model/remote/AddressFieldSpec;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/AddressFieldSpec;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lcom/app/tgtg/model/remote/user/response/AddressField;", "getFieldName", "setFieldName", "(Lcom/app/tgtg/model/remote/user/response/AddressField;)V", "getFieldName$annotations", "()V", "Ljava/lang/Boolean;", "getRequired", "setRequired", "(Ljava/lang/Boolean;)V", "getRequired$annotations", "Ljava/lang/Integer;", "getMaxLength", "setMaxLength", "(Ljava/lang/Integer;)V", "getMaxLength$annotations", "Ljava/lang/String;", "getRegex", "setRegex", "(Ljava/lang/String;)V", "getRegex$annotations", "Lcom/app/tgtg/model/remote/ServerKeyboardTypes;", "getKeyboardType", "setKeyboardType", "(Lcom/app/tgtg/model/remote/ServerKeyboardTypes;)V", "getKeyboardType$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class AddressFieldSpec implements Parcelable {

    @Nullable
    private AddressField fieldName;

    @Nullable
    private ServerKeyboardTypes keyboardType;

    @Nullable
    private Integer maxLength;

    @Nullable
    private String regex;

    @Nullable
    private Boolean required;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<AddressFieldSpec> CREATOR = new Creator();

    public /* synthetic */ AddressFieldSpec(int i11, AddressField addressField, Boolean bool, Integer num, String str, ServerKeyboardTypes serverKeyboardTypes, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.fieldName = null;
        } else {
            this.fieldName = addressField;
        }
        if ((i11 & 2) == 0) {
            this.required = null;
        } else {
            this.required = bool;
        }
        if ((i11 & 4) == 0) {
            this.maxLength = null;
        } else {
            this.maxLength = num;
        }
        if ((i11 & 8) == 0) {
            this.regex = null;
        } else {
            this.regex = str;
        }
        if ((i11 & 16) == 0) {
            this.keyboardType = null;
        } else {
            this.keyboardType = serverKeyboardTypes;
        }
    }

    public static /* synthetic */ AddressFieldSpec copy$default(AddressFieldSpec addressFieldSpec, AddressField addressField, Boolean bool, Integer num, String str, ServerKeyboardTypes serverKeyboardTypes, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            addressField = addressFieldSpec.fieldName;
        }
        if ((i11 & 2) != 0) {
            bool = addressFieldSpec.required;
        }
        if ((i11 & 4) != 0) {
            num = addressFieldSpec.maxLength;
        }
        if ((i11 & 8) != 0) {
            str = addressFieldSpec.regex;
        }
        if ((i11 & 16) != 0) {
            serverKeyboardTypes = addressFieldSpec.keyboardType;
        }
        ServerKeyboardTypes serverKeyboardTypes2 = serverKeyboardTypes;
        Integer num2 = num;
        return addressFieldSpec.copy(addressField, bool, num2, str, serverKeyboardTypes2);
    }

    public static final /* synthetic */ void write$Self$app(AddressFieldSpec self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.fieldName != null) {
            output.r(serialDesc, 0, AddressFieldSerializer.INSTANCE, self.fieldName);
        }
        if (output.C(serialDesc) || self.required != null) {
            output.r(serialDesc, 1, g.f29797a, self.required);
        }
        if (output.C(serialDesc) || self.maxLength != null) {
            output.r(serialDesc, 2, l0.f29821a, self.maxLength);
        }
        if (output.C(serialDesc) || self.regex != null) {
            output.r(serialDesc, 3, r1.f29848a, self.regex);
        }
        if (!output.C(serialDesc) && self.keyboardType == null) {
            return;
        }
        output.r(serialDesc, 4, ServerKeyboardTypesSerializer.INSTANCE, self.keyboardType);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AddressField getFieldName() {
        return this.fieldName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getRequired() {
        return this.required;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getMaxLength() {
        return this.maxLength;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRegex() {
        return this.regex;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ServerKeyboardTypes getKeyboardType() {
        return this.keyboardType;
    }

    @NotNull
    public final AddressFieldSpec copy(@Nullable AddressField fieldName, @Nullable Boolean required, @Nullable Integer maxLength, @Nullable String regex, @Nullable ServerKeyboardTypes keyboardType) {
        return new AddressFieldSpec(fieldName, required, maxLength, regex, keyboardType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressFieldSpec)) {
            return false;
        }
        AddressFieldSpec addressFieldSpec = (AddressFieldSpec) other;
        return this.fieldName == addressFieldSpec.fieldName && Intrinsics.areEqual(this.required, addressFieldSpec.required) && Intrinsics.areEqual(this.maxLength, addressFieldSpec.maxLength) && Intrinsics.areEqual(this.regex, addressFieldSpec.regex) && this.keyboardType == addressFieldSpec.keyboardType;
    }

    @Nullable
    public final AddressField getFieldName() {
        return this.fieldName;
    }

    @Nullable
    public final ServerKeyboardTypes getKeyboardType() {
        return this.keyboardType;
    }

    @Nullable
    public final Integer getMaxLength() {
        return this.maxLength;
    }

    @Nullable
    public final String getRegex() {
        return this.regex;
    }

    @Nullable
    public final Boolean getRequired() {
        return this.required;
    }

    public int hashCode() {
        AddressField addressField = this.fieldName;
        int iHashCode = (addressField == null ? 0 : addressField.hashCode()) * 31;
        Boolean bool = this.required;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.maxLength;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.regex;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        ServerKeyboardTypes serverKeyboardTypes = this.keyboardType;
        return iHashCode4 + (serverKeyboardTypes != null ? serverKeyboardTypes.hashCode() : 0);
    }

    public final void setFieldName(@Nullable AddressField addressField) {
        this.fieldName = addressField;
    }

    public final void setKeyboardType(@Nullable ServerKeyboardTypes serverKeyboardTypes) {
        this.keyboardType = serverKeyboardTypes;
    }

    public final void setMaxLength(@Nullable Integer num) {
        this.maxLength = num;
    }

    public final void setRegex(@Nullable String str) {
        this.regex = str;
    }

    public final void setRequired(@Nullable Boolean bool) {
        this.required = bool;
    }

    @NotNull
    public String toString() {
        return "AddressFieldSpec(fieldName=" + this.fieldName + ", required=" + this.required + ", maxLength=" + this.maxLength + ", regex=" + this.regex + ", keyboardType=" + this.keyboardType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        AddressField addressField = this.fieldName;
        if (addressField == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(addressField.name());
        }
        Boolean bool = this.required;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            i.v(dest, 1, bool);
        }
        Integer num = this.maxLength;
        if (num == null) {
            dest.writeInt(0);
        } else {
            i.w(dest, 1, num);
        }
        dest.writeString(this.regex);
        ServerKeyboardTypes serverKeyboardTypes = this.keyboardType;
        if (serverKeyboardTypes == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(serverKeyboardTypes.name());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/AddressFieldSpec$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/AddressFieldSpec;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return AddressFieldSpec$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AddressFieldSpec> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressFieldSpec createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            parcel.getClass();
            AddressField addressFieldValueOf = parcel.readInt() == 0 ? null : AddressField.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AddressFieldSpec(addressFieldValueOf, boolValueOf, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0 ? ServerKeyboardTypes.valueOf(parcel.readString()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddressFieldSpec[] newArray(int i11) {
            return new AddressFieldSpec[i11];
        }
    }

    @i90.g("field")
    public static /* synthetic */ void getFieldName$annotations() {
    }

    @i90.g("keyboard_type")
    public static /* synthetic */ void getKeyboardType$annotations() {
    }

    @i90.g("max_length")
    public static /* synthetic */ void getMaxLength$annotations() {
    }

    @i90.g("regex")
    public static /* synthetic */ void getRegex$annotations() {
    }

    @i90.g("required")
    public static /* synthetic */ void getRequired$annotations() {
    }

    public AddressFieldSpec() {
        this((AddressField) null, (Boolean) null, (Integer) null, (String) null, (ServerKeyboardTypes) null, 31, (DefaultConstructorMarker) null);
    }

    public AddressFieldSpec(@Nullable AddressField addressField, @Nullable Boolean bool, @Nullable Integer num, @Nullable String str, @Nullable ServerKeyboardTypes serverKeyboardTypes) {
        this.fieldName = addressField;
        this.required = bool;
        this.maxLength = num;
        this.regex = str;
        this.keyboardType = serverKeyboardTypes;
    }

    public /* synthetic */ AddressFieldSpec(AddressField addressField, Boolean bool, Integer num, String str, ServerKeyboardTypes serverKeyboardTypes, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : addressField, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? null : str, (i11 & 16) != 0 ? null : serverKeyboardTypes);
    }
}
