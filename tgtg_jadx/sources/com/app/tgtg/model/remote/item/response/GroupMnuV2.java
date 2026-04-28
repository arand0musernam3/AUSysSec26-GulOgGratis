package com.app.tgtg.model.remote.item.response;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import cg.e;
import e0.f;
import i90.g;
import i90.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.d;
import m90.m1;
import m90.r1;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b%\u0010#JD\u0010&\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b(\u0010#J\u0010\u0010)\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b)\u0010\u001aJ\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b-\u0010.R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010/\u0012\u0004\b1\u00102\u001a\u0004\b0\u0010!R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00103\u0012\u0004\b5\u00102\u001a\u0004\b4\u0010#R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00103\u0012\u0004\b7\u00102\u001a\u0004\b6\u0010#R\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00103\u0012\u0004\b9\u00102\u001a\u0004\b8\u0010#¨\u0006<"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/GroupMnuV2;", "Landroid/os/Parcelable;", "", "Lcom/app/tgtg/model/remote/item/response/ElementMnuV2;", "elements", "", "groupTitle", "groupSubtitle", "navigationKey", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/response/GroupMnuV2;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/item/response/GroupMnuV2;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getElements", "getElements$annotations", "()V", "Ljava/lang/String;", "getGroupTitle", "getGroupTitle$annotations", "getGroupSubtitle", "getGroupSubtitle$annotations", "getNavigationKey", "getNavigationKey$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class GroupMnuV2 implements Parcelable {

    @NotNull
    private final List<ElementMnuV2> elements;

    @Nullable
    private final String groupSubtitle;

    @Nullable
    private final String groupTitle;

    @Nullable
    private final String navigationKey;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<GroupMnuV2> CREATOR = new Creator();

    @NotNull
    private static final j[] $childSerializers = {l.a(m.PUBLICATION, new e(22)), null, null, null};

    public /* synthetic */ GroupMnuV2(int i11, List list, String str, String str2, String str3, m1 m1Var) {
        if (15 != (i11 & 15)) {
            c1.j(i11, 15, GroupMnuV2$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.elements = list;
        this.groupTitle = str;
        this.groupSubtitle = str2;
        this.navigationKey = str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(ElementMnuV2.INSTANCE.serializer(), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupMnuV2 copy$default(GroupMnuV2 groupMnuV2, List list, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = groupMnuV2.elements;
        }
        if ((i11 & 2) != 0) {
            str = groupMnuV2.groupTitle;
        }
        if ((i11 & 4) != 0) {
            str2 = groupMnuV2.groupSubtitle;
        }
        if ((i11 & 8) != 0) {
            str3 = groupMnuV2.navigationKey;
        }
        return groupMnuV2.copy(list, str, str2, str3);
    }

    public static final /* synthetic */ void write$Self$app(GroupMnuV2 self, b output, SerialDescriptor serialDesc) {
        output.i(serialDesc, 0, (KSerializer) $childSerializers[0].getValue(), self.elements);
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 1, r1Var, self.groupTitle);
        output.r(serialDesc, 2, r1Var, self.groupSubtitle);
        output.r(serialDesc, 3, r1Var, self.navigationKey);
    }

    @NotNull
    public final List<ElementMnuV2> component1() {
        return this.elements;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGroupTitle() {
        return this.groupTitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getGroupSubtitle() {
        return this.groupSubtitle;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNavigationKey() {
        return this.navigationKey;
    }

    @NotNull
    public final GroupMnuV2 copy(@NotNull List<? extends ElementMnuV2> elements, @Nullable String groupTitle, @Nullable String groupSubtitle, @Nullable String navigationKey) {
        elements.getClass();
        return new GroupMnuV2(elements, groupTitle, groupSubtitle, navigationKey);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupMnuV2)) {
            return false;
        }
        GroupMnuV2 groupMnuV2 = (GroupMnuV2) other;
        return Intrinsics.areEqual(this.elements, groupMnuV2.elements) && Intrinsics.areEqual(this.groupTitle, groupMnuV2.groupTitle) && Intrinsics.areEqual(this.groupSubtitle, groupMnuV2.groupSubtitle) && Intrinsics.areEqual(this.navigationKey, groupMnuV2.navigationKey);
    }

    @NotNull
    public final List<ElementMnuV2> getElements() {
        return this.elements;
    }

    @Nullable
    public final String getGroupSubtitle() {
        return this.groupSubtitle;
    }

    @Nullable
    public final String getGroupTitle() {
        return this.groupTitle;
    }

    @Nullable
    public final String getNavigationKey() {
        return this.navigationKey;
    }

    public int hashCode() {
        int iHashCode = this.elements.hashCode() * 31;
        String str = this.groupTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.groupSubtitle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.navigationKey;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<ElementMnuV2> list = this.elements;
        String str = this.groupTitle;
        String str2 = this.groupSubtitle;
        String str3 = this.navigationKey;
        StringBuilder sb2 = new StringBuilder("GroupMnuV2(elements=");
        sb2.append(list);
        sb2.append(", groupTitle=");
        sb2.append(str);
        sb2.append(", groupSubtitle=");
        return f.o(sb2, str2, ", navigationKey=", str3, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        Iterator itR = i.r(this.elements, dest);
        while (itR.hasNext()) {
            dest.writeParcelable((Parcelable) itR.next(), flags);
        }
        dest.writeString(this.groupTitle);
        dest.writeString(this.groupSubtitle);
        dest.writeString(this.navigationKey);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/GroupMnuV2$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/response/GroupMnuV2;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return GroupMnuV2$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GroupMnuV2> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupMnuV2 createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(parcel.readParcelable(GroupMnuV2.class.getClassLoader()));
            }
            return new GroupMnuV2(arrayList, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GroupMnuV2[] newArray(int i11) {
            return new GroupMnuV2[i11];
        }
    }

    @g("elements")
    public static /* synthetic */ void getElements$annotations() {
    }

    @g("subtitle")
    public static /* synthetic */ void getGroupSubtitle$annotations() {
    }

    @g(MessageBundle.TITLE_ENTRY)
    public static /* synthetic */ void getGroupTitle$annotations() {
    }

    @g("navigation_key")
    public static /* synthetic */ void getNavigationKey$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GroupMnuV2(@NotNull List<? extends ElementMnuV2> list, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        list.getClass();
        this.elements = list;
        this.groupTitle = str;
        this.groupSubtitle = str2;
        this.navigationKey = str3;
    }
}
