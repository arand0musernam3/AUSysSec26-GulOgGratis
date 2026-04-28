package com.app.tgtg.model.remote.item.response;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import com.app.tgtg.model.remote.manufacturer.request.AdapterItemType;
import com.app.tgtg.model.remote.manufacturer.request.AdapterItemTypeSerializer;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0002A@B9\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010 \u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b'\u0010%J\u0012\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b(\u0010)JL\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b,\u0010%J\u0010\u0010-\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b-\u0010\u001cJ\u001a\u00100\u001a\u00020\t2\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0004\u00102\u0012\u0004\b4\u00105\u001a\u0004\b3\u0010#R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00106\u0012\u0004\b8\u00105\u001a\u0004\b7\u0010%R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00106\u0012\u0004\b:\u00105\u001a\u0004\b9\u0010%R\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00106\u0012\u0004\b<\u00105\u001a\u0004\b;\u0010%R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010=\u0012\u0004\b?\u00105\u001a\u0004\b>\u0010)¨\u0006B"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/HeaderItem;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/item/response/ElementMnuV2;", "Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;", "elementType", "", MessageBundle.TITLE_ENTRY, "subtitle", "description", "", "showNew", "<init>", "(Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/response/HeaderItem;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Ljava/lang/Boolean;", "copy", "(Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/app/tgtg/model/remote/item/response/HeaderItem;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;", "getElementType", "getElementType$annotations", "()V", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "getSubtitle", "getSubtitle$annotations", "getDescription", "getDescription$annotations", "Ljava/lang/Boolean;", "getShowNew", "getShowNew$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@g("HEADER")
public final /* data */ class HeaderItem extends ElementMnuV2 implements Parcelable {
    public static final int $stable = 0;

    @Nullable
    private final String description;

    @Nullable
    private final AdapterItemType elementType;

    @Nullable
    private final Boolean showNew;

    @Nullable
    private final String subtitle;

    @Nullable
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<HeaderItem> CREATOR = new Creator();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HeaderItem(int i11, AdapterItemType adapterItemType, String str, String str2, String str3, Boolean bool, m1 m1Var) {
        super(i11, m1Var);
        if (31 != (i11 & 31)) {
            c1.j(i11, 31, HeaderItem$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.elementType = adapterItemType;
        this.title = str;
        this.subtitle = str2;
        this.description = str3;
        this.showNew = bool;
    }

    public static /* synthetic */ HeaderItem copy$default(HeaderItem headerItem, AdapterItemType adapterItemType, String str, String str2, String str3, Boolean bool, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            adapterItemType = headerItem.elementType;
        }
        if ((i11 & 2) != 0) {
            str = headerItem.title;
        }
        if ((i11 & 4) != 0) {
            str2 = headerItem.subtitle;
        }
        if ((i11 & 8) != 0) {
            str3 = headerItem.description;
        }
        if ((i11 & 16) != 0) {
            bool = headerItem.showNew;
        }
        Boolean bool2 = bool;
        String str4 = str2;
        return headerItem.copy(adapterItemType, str, str4, str3, bool2);
    }

    public static final /* synthetic */ void write$Self$app(HeaderItem self, b output, SerialDescriptor serialDesc) {
        ElementMnuV2.write$Self(self, output, serialDesc);
        output.r(serialDesc, 0, AdapterItemTypeSerializer.INSTANCE, self.getElementType());
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 1, r1Var, self.title);
        output.r(serialDesc, 2, r1Var, self.subtitle);
        output.r(serialDesc, 3, r1Var, self.description);
        output.r(serialDesc, 4, m90.g.f29797a, self.showNew);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AdapterItemType getElementType() {
        return this.elementType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getShowNew() {
        return this.showNew;
    }

    @NotNull
    public final HeaderItem copy(@Nullable AdapterItemType elementType, @Nullable String title, @Nullable String subtitle, @Nullable String description, @Nullable Boolean showNew) {
        return new HeaderItem(elementType, title, subtitle, description, showNew);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeaderItem)) {
            return false;
        }
        HeaderItem headerItem = (HeaderItem) other;
        return this.elementType == headerItem.elementType && Intrinsics.areEqual(this.title, headerItem.title) && Intrinsics.areEqual(this.subtitle, headerItem.subtitle) && Intrinsics.areEqual(this.description, headerItem.description) && Intrinsics.areEqual(this.showNew, headerItem.showNew);
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Override // com.app.tgtg.model.remote.item.response.ElementMnuV2
    @Nullable
    public AdapterItemType getElementType() {
        return this.elementType;
    }

    @Nullable
    public final Boolean getShowNew() {
        return this.showNew;
    }

    @Nullable
    public final String getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        AdapterItemType adapterItemType = this.elementType;
        int iHashCode = (adapterItemType == null ? 0 : adapterItemType.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.showNew;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        AdapterItemType adapterItemType = this.elementType;
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.description;
        Boolean bool = this.showNew;
        StringBuilder sb2 = new StringBuilder("HeaderItem(elementType=");
        sb2.append(adapterItemType);
        sb2.append(", title=");
        sb2.append(str);
        sb2.append(", subtitle=");
        s.A(sb2, str2, ", description=", str3, ", showNew=");
        sb2.append(bool);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        AdapterItemType adapterItemType = this.elementType;
        if (adapterItemType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(adapterItemType.name());
        }
        dest.writeString(this.title);
        dest.writeString(this.subtitle);
        dest.writeString(this.description);
        Boolean bool = this.showNew;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            i.v(dest, 1, bool);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/HeaderItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/response/HeaderItem;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return HeaderItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<HeaderItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HeaderItem createFromParcel(Parcel parcel) {
            AdapterItemType adapterItemTypeValueOf;
            Boolean bool;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                adapterItemTypeValueOf = null;
                bool = null;
            } else {
                adapterItemTypeValueOf = AdapterItemType.valueOf(parcel.readString());
                bool = null;
            }
            String string = parcel.readString();
            Boolean bool2 = bool;
            String string2 = parcel.readString();
            Boolean boolValueOf = bool2;
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new HeaderItem(adapterItemTypeValueOf, string, string2, string3, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HeaderItem[] newArray(int i11) {
            return new HeaderItem[i11];
        }
    }

    @g("description")
    public static /* synthetic */ void getDescription$annotations() {
    }

    @g("type")
    public static /* synthetic */ void getElementType$annotations() {
    }

    @g("show_new")
    public static /* synthetic */ void getShowNew$annotations() {
    }

    @g("subtitle")
    public static /* synthetic */ void getSubtitle$annotations() {
    }

    @g(MessageBundle.TITLE_ENTRY)
    public static /* synthetic */ void getTitle$annotations() {
    }

    public HeaderItem(@Nullable AdapterItemType adapterItemType, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool) {
        super(null);
        this.elementType = adapterItemType;
        this.title = str;
        this.subtitle = str2;
        this.description = str3;
        this.showNew = bool;
    }
}
