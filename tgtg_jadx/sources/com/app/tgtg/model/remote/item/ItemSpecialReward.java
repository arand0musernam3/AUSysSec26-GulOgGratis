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
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BABG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019JT\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010\u0011J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'J'\u0010/\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0001¢\u0006\u0004\b-\u0010.R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00100\u0012\u0004\b2\u00103\u001a\u0004\b1\u0010\u0019R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00100\u0012\u0004\b5\u00103\u001a\u0004\b4\u0010\u0019R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00100\u0012\u0004\b7\u00103\u001a\u0004\b6\u0010\u0019R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00100\u0012\u0004\b9\u00103\u001a\u0004\b8\u0010\u0019R*\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u00100\u0012\u0004\b=\u00103\u001a\u0004\b:\u0010\u0019\"\u0004\b;\u0010<R*\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\b\u00100\u0012\u0004\b@\u00103\u001a\u0004\b>\u0010\u0019\"\u0004\b?\u0010<¨\u0006C"}, d2 = {"Lcom/app/tgtg/model/remote/item/ItemSpecialReward;", "Landroid/os/Parcelable;", "", "id", "shortText", "variant", "description", "terms", "termsUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/item/ItemSpecialReward;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/ItemSpecialReward;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getShortText", "getShortText$annotations", "getVariant", "getVariant$annotations", "getDescription", "getDescription$annotations", "getTerms", "setTerms", "(Ljava/lang/String;)V", "getTerms$annotations", "getTermsUrl", "setTermsUrl", "getTermsUrl$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ItemSpecialReward implements Parcelable {

    @Nullable
    private final String description;

    @NotNull
    private final String id;

    @NotNull
    private final String shortText;

    @Nullable
    private String terms;

    @Nullable
    private String termsUrl;

    @Nullable
    private final String variant;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ItemSpecialReward> CREATOR = new Creator();

    public /* synthetic */ ItemSpecialReward(int i11, String str, String str2, String str3, String str4, String str5, String str6, m1 m1Var) {
        if (3 != (i11 & 3)) {
            c1.j(i11, 3, ItemSpecialReward$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.shortText = str2;
        if ((i11 & 4) == 0) {
            this.variant = null;
        } else {
            this.variant = str3;
        }
        if ((i11 & 8) == 0) {
            this.description = null;
        } else {
            this.description = str4;
        }
        if ((i11 & 16) == 0) {
            this.terms = null;
        } else {
            this.terms = str5;
        }
        if ((i11 & 32) == 0) {
            this.termsUrl = null;
        } else {
            this.termsUrl = str6;
        }
    }

    public static /* synthetic */ ItemSpecialReward copy$default(ItemSpecialReward itemSpecialReward, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = itemSpecialReward.id;
        }
        if ((i11 & 2) != 0) {
            str2 = itemSpecialReward.shortText;
        }
        if ((i11 & 4) != 0) {
            str3 = itemSpecialReward.variant;
        }
        if ((i11 & 8) != 0) {
            str4 = itemSpecialReward.description;
        }
        if ((i11 & 16) != 0) {
            str5 = itemSpecialReward.terms;
        }
        if ((i11 & 32) != 0) {
            str6 = itemSpecialReward.termsUrl;
        }
        String str7 = str5;
        String str8 = str6;
        return itemSpecialReward.copy(str, str2, str3, str4, str7, str8);
    }

    public static final /* synthetic */ void write$Self$app(ItemSpecialReward self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.id);
        output.q(serialDesc, 1, self.shortText);
        if (output.C(serialDesc) || self.variant != null) {
            output.r(serialDesc, 2, r1.f29848a, self.variant);
        }
        if (output.C(serialDesc) || self.description != null) {
            output.r(serialDesc, 3, r1.f29848a, self.description);
        }
        if (output.C(serialDesc) || self.terms != null) {
            output.r(serialDesc, 4, r1.f29848a, self.terms);
        }
        if (!output.C(serialDesc) && self.termsUrl == null) {
            return;
        }
        output.r(serialDesc, 5, r1.f29848a, self.termsUrl);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getShortText() {
        return this.shortText;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVariant() {
        return this.variant;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTerms() {
        return this.terms;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTermsUrl() {
        return this.termsUrl;
    }

    @NotNull
    public final ItemSpecialReward copy(@NotNull String id2, @NotNull String shortText, @Nullable String variant, @Nullable String description, @Nullable String terms, @Nullable String termsUrl) {
        id2.getClass();
        shortText.getClass();
        return new ItemSpecialReward(id2, shortText, variant, description, terms, termsUrl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemSpecialReward)) {
            return false;
        }
        ItemSpecialReward itemSpecialReward = (ItemSpecialReward) other;
        return Intrinsics.areEqual(this.id, itemSpecialReward.id) && Intrinsics.areEqual(this.shortText, itemSpecialReward.shortText) && Intrinsics.areEqual(this.variant, itemSpecialReward.variant) && Intrinsics.areEqual(this.description, itemSpecialReward.description) && Intrinsics.areEqual(this.terms, itemSpecialReward.terms) && Intrinsics.areEqual(this.termsUrl, itemSpecialReward.termsUrl);
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getShortText() {
        return this.shortText;
    }

    @Nullable
    public final String getTerms() {
        return this.terms;
    }

    @Nullable
    public final String getTermsUrl() {
        return this.termsUrl;
    }

    @Nullable
    public final String getVariant() {
        return this.variant;
    }

    public int hashCode() {
        int iB = l1.b(this.id.hashCode() * 31, 31, this.shortText);
        String str = this.variant;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.terms;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.termsUrl;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setTerms(@Nullable String str) {
        this.terms = str;
    }

    public final void setTermsUrl(@Nullable String str) {
        this.termsUrl = str;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.shortText;
        String str3 = this.variant;
        String str4 = this.description;
        String str5 = this.terms;
        String str6 = this.termsUrl;
        StringBuilder sbT = f.t("ItemSpecialReward(id=", str, ", shortText=", str2, ", variant=");
        s.A(sbT, str3, ", description=", str4, ", terms=");
        return f.o(sbT, str5, ", termsUrl=", str6, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.id);
        dest.writeString(this.shortText);
        dest.writeString(this.variant);
        dest.writeString(this.description);
        dest.writeString(this.terms);
        dest.writeString(this.termsUrl);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/ItemSpecialReward$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/ItemSpecialReward;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ItemSpecialReward$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ItemSpecialReward> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ItemSpecialReward createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ItemSpecialReward(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ItemSpecialReward[] newArray(int i11) {
            return new ItemSpecialReward[i11];
        }
    }

    @g("description")
    public static /* synthetic */ void getDescription$annotations() {
    }

    @g("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @g("short_text")
    public static /* synthetic */ void getShortText$annotations() {
    }

    @g("terms")
    public static /* synthetic */ void getTerms$annotations() {
    }

    @g("terms_url")
    public static /* synthetic */ void getTermsUrl$annotations() {
    }

    @g("variant")
    public static /* synthetic */ void getVariant$annotations() {
    }

    public ItemSpecialReward(@NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.shortText = str2;
        this.variant = str3;
        this.description = str4;
        this.terms = str5;
        this.termsUrl = str6;
    }

    public /* synthetic */ ItemSpecialReward(String str, String str2, String str3, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6);
    }
}
