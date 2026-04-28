package com.app.tgtg.model.remote;

import android.os.Parcel;
import android.os.Parcelable;
import e0.f;
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
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ4\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010\u0017J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b(\u0010)R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010*\u0012\u0004\b.\u0010/\u001a\u0004\b+\u0010\u001e\"\u0004\b,\u0010-R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010*\u0012\u0004\b2\u0010/\u001a\u0004\b0\u0010\u001e\"\u0004\b1\u0010-R*\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010*\u0012\u0004\b5\u0010/\u001a\u0004\b3\u0010\u001e\"\u0004\b4\u0010-¨\u00068"}, d2 = {"Lcom/app/tgtg/model/remote/FeatureExperiment;", "Landroid/os/Parcelable;", "", "name", "variant", "payload", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/FeatureExperiment;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/FeatureExperiment;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "setName", "(Ljava/lang/String;)V", "getName$annotations", "()V", "getVariant", "setVariant", "getVariant$annotations", "getPayload", "setPayload", "getPayload$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class FeatureExperiment implements Parcelable {

    @Nullable
    private String name;

    @Nullable
    private String payload;

    @Nullable
    private String variant;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<FeatureExperiment> CREATOR = new Creator();

    public /* synthetic */ FeatureExperiment(int i11, String str, String str2, String str3, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.name = null;
        } else {
            this.name = str;
        }
        if ((i11 & 2) == 0) {
            this.variant = null;
        } else {
            this.variant = str2;
        }
        if ((i11 & 4) == 0) {
            this.payload = null;
        } else {
            this.payload = str3;
        }
    }

    public static /* synthetic */ FeatureExperiment copy$default(FeatureExperiment featureExperiment, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = featureExperiment.name;
        }
        if ((i11 & 2) != 0) {
            str2 = featureExperiment.variant;
        }
        if ((i11 & 4) != 0) {
            str3 = featureExperiment.payload;
        }
        return featureExperiment.copy(str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$app(FeatureExperiment self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.name != null) {
            output.r(serialDesc, 0, r1.f29848a, self.name);
        }
        if (output.C(serialDesc) || self.variant != null) {
            output.r(serialDesc, 1, r1.f29848a, self.variant);
        }
        if (!output.C(serialDesc) && self.payload == null) {
            return;
        }
        output.r(serialDesc, 2, r1.f29848a, self.payload);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getVariant() {
        return this.variant;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPayload() {
        return this.payload;
    }

    @NotNull
    public final FeatureExperiment copy(@Nullable String name, @Nullable String variant, @Nullable String payload) {
        return new FeatureExperiment(name, variant, payload);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeatureExperiment)) {
            return false;
        }
        FeatureExperiment featureExperiment = (FeatureExperiment) other;
        return Intrinsics.areEqual(this.name, featureExperiment.name) && Intrinsics.areEqual(this.variant, featureExperiment.variant) && Intrinsics.areEqual(this.payload, featureExperiment.payload);
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPayload() {
        return this.payload;
    }

    @Nullable
    public final String getVariant() {
        return this.variant;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.variant;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.payload;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setPayload(@Nullable String str) {
        this.payload = str;
    }

    public final void setVariant(@Nullable String str) {
        this.variant = str;
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.variant;
        return k.p(f.t("FeatureExperiment(name=", str, ", variant=", str2, ", payload="), this.payload, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.name);
        dest.writeString(this.variant);
        dest.writeString(this.payload);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/FeatureExperiment$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/FeatureExperiment;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return FeatureExperiment$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FeatureExperiment> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FeatureExperiment createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new FeatureExperiment(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FeatureExperiment[] newArray(int i11) {
            return new FeatureExperiment[i11];
        }
    }

    @g("name")
    public static /* synthetic */ void getName$annotations() {
    }

    @g("payload")
    public static /* synthetic */ void getPayload$annotations() {
    }

    @g("variant")
    public static /* synthetic */ void getVariant$annotations() {
    }

    public FeatureExperiment() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    public FeatureExperiment(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.name = str;
        this.variant = str2;
        this.payload = str3;
    }

    public /* synthetic */ FeatureExperiment(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3);
    }
}
