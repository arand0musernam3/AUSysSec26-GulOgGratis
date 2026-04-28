package com.app.tgtg.model.remote.item;

import android.os.Parcel;
import android.os.Parcelable;
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
import m90.c1;
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010 JL\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010 J\u0010\u0010(\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b(\u0010\u0019J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010 R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010.\u0012\u0004\b3\u00101\u001a\u0004\b2\u0010 R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b5\u00101\u001a\u0004\b4\u0010 R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010.\u0012\u0004\b7\u00101\u001a\u0004\b6\u0010 R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010.\u0012\u0004\b9\u00101\u001a\u0004\b8\u0010 ¨\u0006<"}, d2 = {"Lcom/app/tgtg/model/remote/item/StoreLegalInformation;", "Landroid/os/Parcelable;", "", "legalText", "legalAboutText", "storeAddress", "debtorLegalName", "aboutHeader", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/StoreLegalInformation;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/item/StoreLegalInformation;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLegalText", "getLegalText$annotations", "()V", "getLegalAboutText", "getLegalAboutText$annotations", "getStoreAddress", "getStoreAddress$annotations", "getDebtorLegalName", "getDebtorLegalName$annotations", "getAboutHeader", "getAboutHeader$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class StoreLegalInformation implements Parcelable {
    public static final int $stable = 0;

    @Nullable
    private final String aboutHeader;

    @Nullable
    private final String debtorLegalName;

    @Nullable
    private final String legalAboutText;

    @Nullable
    private final String legalText;

    @Nullable
    private final String storeAddress;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<StoreLegalInformation> CREATOR = new Creator();

    public /* synthetic */ StoreLegalInformation(int i11, String str, String str2, String str3, String str4, String str5, m1 m1Var) {
        if (31 != (i11 & 31)) {
            c1.j(i11, 31, StoreLegalInformation$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.legalText = str;
        this.legalAboutText = str2;
        this.storeAddress = str3;
        this.debtorLegalName = str4;
        this.aboutHeader = str5;
    }

    public static /* synthetic */ StoreLegalInformation copy$default(StoreLegalInformation storeLegalInformation, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = storeLegalInformation.legalText;
        }
        if ((i11 & 2) != 0) {
            str2 = storeLegalInformation.legalAboutText;
        }
        if ((i11 & 4) != 0) {
            str3 = storeLegalInformation.storeAddress;
        }
        if ((i11 & 8) != 0) {
            str4 = storeLegalInformation.debtorLegalName;
        }
        if ((i11 & 16) != 0) {
            str5 = storeLegalInformation.aboutHeader;
        }
        String str6 = str5;
        String str7 = str3;
        return storeLegalInformation.copy(str, str2, str7, str4, str6);
    }

    public static final /* synthetic */ void write$Self$app(StoreLegalInformation self, b output, SerialDescriptor serialDesc) {
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 0, r1Var, self.legalText);
        output.r(serialDesc, 1, r1Var, self.legalAboutText);
        output.r(serialDesc, 2, r1Var, self.storeAddress);
        output.r(serialDesc, 3, r1Var, self.debtorLegalName);
        output.r(serialDesc, 4, r1Var, self.aboutHeader);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLegalText() {
        return this.legalText;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLegalAboutText() {
        return this.legalAboutText;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStoreAddress() {
        return this.storeAddress;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDebtorLegalName() {
        return this.debtorLegalName;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAboutHeader() {
        return this.aboutHeader;
    }

    @NotNull
    public final StoreLegalInformation copy(@Nullable String legalText, @Nullable String legalAboutText, @Nullable String storeAddress, @Nullable String debtorLegalName, @Nullable String aboutHeader) {
        return new StoreLegalInformation(legalText, legalAboutText, storeAddress, debtorLegalName, aboutHeader);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoreLegalInformation)) {
            return false;
        }
        StoreLegalInformation storeLegalInformation = (StoreLegalInformation) other;
        return Intrinsics.areEqual(this.legalText, storeLegalInformation.legalText) && Intrinsics.areEqual(this.legalAboutText, storeLegalInformation.legalAboutText) && Intrinsics.areEqual(this.storeAddress, storeLegalInformation.storeAddress) && Intrinsics.areEqual(this.debtorLegalName, storeLegalInformation.debtorLegalName) && Intrinsics.areEqual(this.aboutHeader, storeLegalInformation.aboutHeader);
    }

    @Nullable
    public final String getAboutHeader() {
        return this.aboutHeader;
    }

    @Nullable
    public final String getDebtorLegalName() {
        return this.debtorLegalName;
    }

    @Nullable
    public final String getLegalAboutText() {
        return this.legalAboutText;
    }

    @Nullable
    public final String getLegalText() {
        return this.legalText;
    }

    @Nullable
    public final String getStoreAddress() {
        return this.storeAddress;
    }

    public int hashCode() {
        String str = this.legalText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.legalAboutText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.storeAddress;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.debtorLegalName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.aboutHeader;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.legalText;
        String str2 = this.legalAboutText;
        String str3 = this.storeAddress;
        String str4 = this.debtorLegalName;
        String str5 = this.aboutHeader;
        StringBuilder sbT = f.t("StoreLegalInformation(legalText=", str, ", legalAboutText=", str2, ", storeAddress=");
        s.A(sbT, str3, ", debtorLegalName=", str4, ", aboutHeader=");
        return k.p(sbT, str5, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.legalText);
        dest.writeString(this.legalAboutText);
        dest.writeString(this.storeAddress);
        dest.writeString(this.debtorLegalName);
        dest.writeString(this.aboutHeader);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/StoreLegalInformation$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/StoreLegalInformation;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return StoreLegalInformation$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StoreLegalInformation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StoreLegalInformation createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new StoreLegalInformation(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StoreLegalInformation[] newArray(int i11) {
            return new StoreLegalInformation[i11];
        }
    }

    @g("about_header")
    public static /* synthetic */ void getAboutHeader$annotations() {
    }

    @g("debtor_legal_name")
    public static /* synthetic */ void getDebtorLegalName$annotations() {
    }

    @g("legal_about_text")
    public static /* synthetic */ void getLegalAboutText$annotations() {
    }

    @g("legal_text")
    public static /* synthetic */ void getLegalText$annotations() {
    }

    @g("store_address")
    public static /* synthetic */ void getStoreAddress$annotations() {
    }

    public StoreLegalInformation(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.legalText = str;
        this.legalAboutText = str2;
        this.storeAddress = str3;
        this.debtorLegalName = str4;
        this.aboutHeader = str5;
    }
}
