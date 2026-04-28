package com.app.tgtg.model.remote.item.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.manufacturer.request.AdapterItemType;
import com.app.tgtg.model.remote.manufacturer.request.AdapterItemTypeSerializer;
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
import org.bouncycastle.i18n.MessageBundle;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0002CBBC\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b%\u0010#J\u0012\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b&\u0010#J\u0012\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b'\u0010#J\u0012\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b(\u0010)JX\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b,\u0010#J\u0010\u0010-\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b-\u0010\u001cJ\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b1\u00102R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00103\u0012\u0004\b5\u00106\u001a\u0004\b4\u0010#R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00103\u0012\u0004\b8\u00106\u001a\u0004\b7\u0010#R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00103\u0012\u0004\b:\u00106\u001a\u0004\b9\u0010#R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00103\u0012\u0004\b<\u00106\u001a\u0004\b;\u0010#R\"\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00103\u0012\u0004\b>\u00106\u001a\u0004\b=\u0010#R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\n\u0010?\u0012\u0004\bA\u00106\u001a\u0004\b@\u0010)¨\u0006D"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/IntroBanner;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/item/response/ElementMnuV2;", "", "campaignCode", AnnotatedPrivateKey.LABEL, MessageBundle.TITLE_ENTRY, TextBundle.TEXT_ENTRY, "imageUrl", "Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;", "elementType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/response/IntroBanner;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;)Lcom/app/tgtg/model/remote/item/response/IntroBanner;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getCampaignCode", "getCampaignCode$annotations", "()V", "getLabel", "getLabel$annotations", "getTitle", "getTitle$annotations", "getText", "getText$annotations", "getImageUrl", "getImageUrl$annotations", "Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;", "getElementType", "getElementType$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@g("INTRO_BANNER")
public final /* data */ class IntroBanner extends ElementMnuV2 implements Parcelable {
    public static final int $stable = 0;

    @Nullable
    private final String campaignCode;

    @Nullable
    private final AdapterItemType elementType;

    @Nullable
    private final String imageUrl;

    @Nullable
    private final String label;

    @Nullable
    private final String text;

    @Nullable
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<IntroBanner> CREATOR = new Creator();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IntroBanner(int i11, String str, String str2, String str3, String str4, String str5, AdapterItemType adapterItemType, m1 m1Var) {
        super(i11, m1Var);
        if (63 != (i11 & 63)) {
            c1.j(i11, 63, IntroBanner$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.campaignCode = str;
        this.label = str2;
        this.title = str3;
        this.text = str4;
        this.imageUrl = str5;
        this.elementType = adapterItemType;
    }

    public static /* synthetic */ IntroBanner copy$default(IntroBanner introBanner, String str, String str2, String str3, String str4, String str5, AdapterItemType adapterItemType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = introBanner.campaignCode;
        }
        if ((i11 & 2) != 0) {
            str2 = introBanner.label;
        }
        if ((i11 & 4) != 0) {
            str3 = introBanner.title;
        }
        if ((i11 & 8) != 0) {
            str4 = introBanner.text;
        }
        if ((i11 & 16) != 0) {
            str5 = introBanner.imageUrl;
        }
        if ((i11 & 32) != 0) {
            adapterItemType = introBanner.elementType;
        }
        String str6 = str5;
        AdapterItemType adapterItemType2 = adapterItemType;
        return introBanner.copy(str, str2, str3, str4, str6, adapterItemType2);
    }

    public static final /* synthetic */ void write$Self$app(IntroBanner self, b output, SerialDescriptor serialDesc) {
        ElementMnuV2.write$Self(self, output, serialDesc);
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 0, r1Var, self.campaignCode);
        output.r(serialDesc, 1, r1Var, self.label);
        output.r(serialDesc, 2, r1Var, self.title);
        output.r(serialDesc, 3, r1Var, self.text);
        output.r(serialDesc, 4, r1Var, self.imageUrl);
        output.r(serialDesc, 5, AdapterItemTypeSerializer.INSTANCE, self.getElementType());
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCampaignCode() {
        return this.campaignCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final AdapterItemType getElementType() {
        return this.elementType;
    }

    @NotNull
    public final IntroBanner copy(@Nullable String campaignCode, @Nullable String label, @Nullable String title, @Nullable String text, @Nullable String imageUrl, @Nullable AdapterItemType elementType) {
        return new IntroBanner(campaignCode, label, title, text, imageUrl, elementType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntroBanner)) {
            return false;
        }
        IntroBanner introBanner = (IntroBanner) other;
        return Intrinsics.areEqual(this.campaignCode, introBanner.campaignCode) && Intrinsics.areEqual(this.label, introBanner.label) && Intrinsics.areEqual(this.title, introBanner.title) && Intrinsics.areEqual(this.text, introBanner.text) && Intrinsics.areEqual(this.imageUrl, introBanner.imageUrl) && this.elementType == introBanner.elementType;
    }

    @Nullable
    public final String getCampaignCode() {
        return this.campaignCode;
    }

    @Override // com.app.tgtg.model.remote.item.response.ElementMnuV2
    @Nullable
    public AdapterItemType getElementType() {
        return this.elementType;
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.campaignCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.label;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.text;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.imageUrl;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        AdapterItemType adapterItemType = this.elementType;
        return iHashCode5 + (adapterItemType != null ? adapterItemType.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.campaignCode;
        String str2 = this.label;
        String str3 = this.title;
        String str4 = this.text;
        String str5 = this.imageUrl;
        AdapterItemType adapterItemType = this.elementType;
        StringBuilder sbT = f.t("IntroBanner(campaignCode=", str, ", label=", str2, ", title=");
        s.A(sbT, str3, ", text=", str4, ", imageUrl=");
        sbT.append(str5);
        sbT.append(", elementType=");
        sbT.append(adapterItemType);
        sbT.append(")");
        return sbT.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.campaignCode);
        dest.writeString(this.label);
        dest.writeString(this.title);
        dest.writeString(this.text);
        dest.writeString(this.imageUrl);
        AdapterItemType adapterItemType = this.elementType;
        if (adapterItemType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(adapterItemType.name());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/IntroBanner$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/response/IntroBanner;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return IntroBanner$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IntroBanner> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IntroBanner createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new IntroBanner(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AdapterItemType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IntroBanner[] newArray(int i11) {
            return new IntroBanner[i11];
        }
    }

    @g("campaign_code")
    public static /* synthetic */ void getCampaignCode$annotations() {
    }

    @g("type")
    public static /* synthetic */ void getElementType$annotations() {
    }

    @g("image_url")
    public static /* synthetic */ void getImageUrl$annotations() {
    }

    @g(AnnotatedPrivateKey.LABEL)
    public static /* synthetic */ void getLabel$annotations() {
    }

    @g(TextBundle.TEXT_ENTRY)
    public static /* synthetic */ void getText$annotations() {
    }

    @g(MessageBundle.TITLE_ENTRY)
    public static /* synthetic */ void getTitle$annotations() {
    }

    public IntroBanner(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable AdapterItemType adapterItemType) {
        super(null);
        this.campaignCode = str;
        this.label = str2;
        this.title = str3;
        this.text = str4;
        this.imageUrl = str5;
        this.elementType = adapterItemType;
    }
}
