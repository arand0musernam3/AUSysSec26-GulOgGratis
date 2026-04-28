package com.app.tgtg.model.remote.item.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.manufacturer.request.AdapterItemType;
import e0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003J9\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0004HÖ\u0081\u0004J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006#"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/GroupHeaderMnuV2;", "Landroid/os/Parcelable;", "Lcom/app/tgtg/model/remote/item/response/ElementMnuV2;", TextBundle.TEXT_ENTRY, "", "subtext", "elementType", "Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;", "navigationKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getSubtext", "getElementType", "()Lcom/app/tgtg/model/remote/manufacturer/request/AdapterItemType;", "getNavigationKey", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class GroupHeaderMnuV2 extends ElementMnuV2 implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<GroupHeaderMnuV2> CREATOR = new Creator();

    @Nullable
    private final AdapterItemType elementType;

    @Nullable
    private final String navigationKey;

    @Nullable
    private final String subtext;

    @Nullable
    private final String text;

    public GroupHeaderMnuV2(@Nullable String str, @Nullable String str2, @Nullable AdapterItemType adapterItemType, @Nullable String str3) {
        super(null);
        this.text = str;
        this.subtext = str2;
        this.elementType = adapterItemType;
        this.navigationKey = str3;
    }

    public static /* synthetic */ GroupHeaderMnuV2 copy$default(GroupHeaderMnuV2 groupHeaderMnuV2, String str, String str2, AdapterItemType adapterItemType, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = groupHeaderMnuV2.text;
        }
        if ((i11 & 2) != 0) {
            str2 = groupHeaderMnuV2.subtext;
        }
        if ((i11 & 4) != 0) {
            adapterItemType = groupHeaderMnuV2.elementType;
        }
        if ((i11 & 8) != 0) {
            str3 = groupHeaderMnuV2.navigationKey;
        }
        return groupHeaderMnuV2.copy(str, str2, adapterItemType, str3);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtext() {
        return this.subtext;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AdapterItemType getElementType() {
        return this.elementType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNavigationKey() {
        return this.navigationKey;
    }

    @NotNull
    public final GroupHeaderMnuV2 copy(@Nullable String text, @Nullable String subtext, @Nullable AdapterItemType elementType, @Nullable String navigationKey) {
        return new GroupHeaderMnuV2(text, subtext, elementType, navigationKey);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupHeaderMnuV2)) {
            return false;
        }
        GroupHeaderMnuV2 groupHeaderMnuV2 = (GroupHeaderMnuV2) other;
        return Intrinsics.areEqual(this.text, groupHeaderMnuV2.text) && Intrinsics.areEqual(this.subtext, groupHeaderMnuV2.subtext) && this.elementType == groupHeaderMnuV2.elementType && Intrinsics.areEqual(this.navigationKey, groupHeaderMnuV2.navigationKey);
    }

    @Override // com.app.tgtg.model.remote.item.response.ElementMnuV2
    @Nullable
    public AdapterItemType getElementType() {
        return this.elementType;
    }

    @Nullable
    public final String getNavigationKey() {
        return this.navigationKey;
    }

    @Nullable
    public final String getSubtext() {
        return this.subtext;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtext;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AdapterItemType adapterItemType = this.elementType;
        int iHashCode3 = (iHashCode2 + (adapterItemType == null ? 0 : adapterItemType.hashCode())) * 31;
        String str3 = this.navigationKey;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.text;
        String str2 = this.subtext;
        AdapterItemType adapterItemType = this.elementType;
        String str3 = this.navigationKey;
        StringBuilder sbT = f.t("GroupHeaderMnuV2(text=", str, ", subtext=", str2, ", elementType=");
        sbT.append(adapterItemType);
        sbT.append(", navigationKey=");
        sbT.append(str3);
        sbT.append(")");
        return sbT.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.text);
        dest.writeString(this.subtext);
        AdapterItemType adapterItemType = this.elementType;
        if (adapterItemType == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(adapterItemType.name());
        }
        dest.writeString(this.navigationKey);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GroupHeaderMnuV2> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupHeaderMnuV2 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new GroupHeaderMnuV2(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AdapterItemType.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupHeaderMnuV2[] newArray(int i11) {
            return new GroupHeaderMnuV2[i11];
        }
    }
}
