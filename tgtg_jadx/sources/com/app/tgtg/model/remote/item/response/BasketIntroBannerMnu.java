package com.app.tgtg.model.remote.item.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.manufacturer.request.AdapterItemType;
import com.app.tgtg.model.remote.manufacturer.request.AdapterItemTypeSerializer;
import e0.f;
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
import org.bouncycastle.i18n.MessageBundle;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 62\u00020\u00012\u00020\u0002:\u000276B%\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J4\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b&\u0010 J\u0010\u0010'\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b'\u0010\u0019J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b+\u0010,R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010 R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010-\u0012\u0004\b2\u00100\u001a\u0004\b1\u0010 R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0007\u00103\u0012\u0004\b5\u00100\u001a\u0004\b4\u0010#¨\u00068"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/BasketIntroBannerMnu;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/item/response/ElementMnuV2;", "", MessageBundle.TITLE_ENTRY, TextBundle.TEXT_ENTRY, "Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;", "elementType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/response/BasketIntroBannerMnu;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;)Lcom/app/tgtg/model/remote/item/response/BasketIntroBannerMnu;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getText", "getText$annotations", "Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;", "getElementType", "getElementType$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@g("BASKET_INTRO_BANNER")
public final /* data */ class BasketIntroBannerMnu extends ElementMnuV2 implements Parcelable {
    public static final int $stable = 0;

    @Nullable
    private final AdapterItemType elementType;

    @Nullable
    private final String text;

    @Nullable
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<BasketIntroBannerMnu> CREATOR = new Creator();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BasketIntroBannerMnu(int i11, String str, String str2, AdapterItemType adapterItemType, m1 m1Var) {
        super(i11, m1Var);
        if (7 != (i11 & 7)) {
            c1.j(i11, 7, BasketIntroBannerMnu$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.title = str;
        this.text = str2;
        this.elementType = adapterItemType;
    }

    public static /* synthetic */ BasketIntroBannerMnu copy$default(BasketIntroBannerMnu basketIntroBannerMnu, String str, String str2, AdapterItemType adapterItemType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = basketIntroBannerMnu.title;
        }
        if ((i11 & 2) != 0) {
            str2 = basketIntroBannerMnu.text;
        }
        if ((i11 & 4) != 0) {
            adapterItemType = basketIntroBannerMnu.elementType;
        }
        return basketIntroBannerMnu.copy(str, str2, adapterItemType);
    }

    public static final /* synthetic */ void write$Self$app(BasketIntroBannerMnu self, b output, SerialDescriptor serialDesc) {
        ElementMnuV2.write$Self(self, output, serialDesc);
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 0, r1Var, self.title);
        output.r(serialDesc, 1, r1Var, self.text);
        output.r(serialDesc, 2, AdapterItemTypeSerializer.INSTANCE, self.getElementType());
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AdapterItemType getElementType() {
        return this.elementType;
    }

    @NotNull
    public final BasketIntroBannerMnu copy(@Nullable String title, @Nullable String text, @Nullable AdapterItemType elementType) {
        return new BasketIntroBannerMnu(title, text, elementType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BasketIntroBannerMnu)) {
            return false;
        }
        BasketIntroBannerMnu basketIntroBannerMnu = (BasketIntroBannerMnu) other;
        return Intrinsics.areEqual(this.title, basketIntroBannerMnu.title) && Intrinsics.areEqual(this.text, basketIntroBannerMnu.text) && this.elementType == basketIntroBannerMnu.elementType;
    }

    @Override // com.app.tgtg.model.remote.item.response.ElementMnuV2
    @Nullable
    public AdapterItemType getElementType() {
        return this.elementType;
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
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AdapterItemType adapterItemType = this.elementType;
        return iHashCode2 + (adapterItemType != null ? adapterItemType.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.text;
        AdapterItemType adapterItemType = this.elementType;
        StringBuilder sbT = f.t("BasketIntroBannerMnu(title=", str, ", text=", str2, ", elementType=");
        sbT.append(adapterItemType);
        sbT.append(")");
        return sbT.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.title);
        dest.writeString(this.text);
        AdapterItemType adapterItemType = this.elementType;
        if (adapterItemType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(adapterItemType.name());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/BasketIntroBannerMnu$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/response/BasketIntroBannerMnu;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BasketIntroBannerMnu$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BasketIntroBannerMnu> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BasketIntroBannerMnu createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new BasketIntroBannerMnu(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AdapterItemType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BasketIntroBannerMnu[] newArray(int i11) {
            return new BasketIntroBannerMnu[i11];
        }
    }

    @g("type")
    public static /* synthetic */ void getElementType$annotations() {
    }

    @g(TextBundle.TEXT_ENTRY)
    public static /* synthetic */ void getText$annotations() {
    }

    @g(MessageBundle.TITLE_ENTRY)
    public static /* synthetic */ void getTitle$annotations() {
    }

    public BasketIntroBannerMnu(@Nullable String str, @Nullable String str2, @Nullable AdapterItemType adapterItemType) {
        super(null);
        this.title = str;
        this.text = str2;
        this.elementType = adapterItemType;
    }
}
