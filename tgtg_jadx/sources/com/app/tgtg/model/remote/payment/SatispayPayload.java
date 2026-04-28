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
import n90.c;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002./B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ(\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u001dJ\u0010\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010\u0016J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010(\u0012\u0004\b*\u0010+\u001a\u0004\b)\u0010\u001dR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010(\u0012\u0004\b-\u0010+\u001a\u0004\b,\u0010\u001d¨\u00060"}, d2 = {"Lcom/app/tgtg/model/remote/payment/SatispayPayload;", "Landroid/os/Parcelable;", "", "codeIdentifier", "redirectUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/payment/SatispayPayload;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/payment/SatispayPayload;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCodeIdentifier", "getCodeIdentifier$annotations", "()V", "getRedirectUrl", "getRedirectUrl$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class SatispayPayload implements Parcelable {
    public static final int $stable = 0;

    @Nullable
    private final String codeIdentifier;

    @Nullable
    private final String redirectUrl;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<SatispayPayload> CREATOR = new Creator();

    public /* synthetic */ SatispayPayload(int i11, String str, String str2, m1 m1Var) {
        if (3 != (i11 & 3)) {
            c1.j(i11, 3, SatispayPayload$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.codeIdentifier = str;
        this.redirectUrl = str2;
    }

    public static /* synthetic */ SatispayPayload copy$default(SatispayPayload satispayPayload, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = satispayPayload.codeIdentifier;
        }
        if ((i11 & 2) != 0) {
            str2 = satispayPayload.redirectUrl;
        }
        return satispayPayload.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$app(SatispayPayload self, b output, SerialDescriptor serialDesc) {
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 0, r1Var, self.codeIdentifier);
        output.r(serialDesc, 1, r1Var, self.redirectUrl);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCodeIdentifier() {
        return this.codeIdentifier;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    @NotNull
    public final SatispayPayload copy(@Nullable String codeIdentifier, @Nullable String redirectUrl) {
        return new SatispayPayload(codeIdentifier, redirectUrl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SatispayPayload)) {
            return false;
        }
        SatispayPayload satispayPayload = (SatispayPayload) other;
        return Intrinsics.areEqual(this.codeIdentifier, satispayPayload.codeIdentifier) && Intrinsics.areEqual(this.redirectUrl, satispayPayload.redirectUrl);
    }

    @Nullable
    public final String getCodeIdentifier() {
        return this.codeIdentifier;
    }

    @Nullable
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public int hashCode() {
        String str = this.codeIdentifier;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.redirectUrl;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return a.d("SatispayPayload(codeIdentifier=", this.codeIdentifier, ", redirectUrl=", this.redirectUrl, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.codeIdentifier);
        dest.writeString(this.redirectUrl);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¨\u0006\n"}, d2 = {"Lcom/app/tgtg/model/remote/payment/SatispayPayload$Companion;", "", "<init>", "()V", "deserialize", "Lcom/app/tgtg/model/remote/payment/SatispayPayload;", "payload", "", "serializer", "Lkotlinx/serialization/KSerializer;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final SatispayPayload deserialize(@NotNull String payload) {
            payload.getClass();
            try {
                return (SatispayPayload) c.f30748d.b(serializer(), payload);
            } catch (Exception unused) {
                return null;
            }
        }

        @NotNull
        public final KSerializer serializer() {
            return SatispayPayload$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SatispayPayload> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SatispayPayload createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new SatispayPayload(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SatispayPayload[] newArray(int i11) {
            return new SatispayPayload[i11];
        }
    }

    @g("code_identifier")
    public static /* synthetic */ void getCodeIdentifier$annotations() {
    }

    @g("redirect_url")
    public static /* synthetic */ void getRedirectUrl$annotations() {
    }

    public SatispayPayload(@Nullable String str, @Nullable String str2) {
        this.codeIdentifier = str;
        this.redirectUrl = str2;
    }
}
