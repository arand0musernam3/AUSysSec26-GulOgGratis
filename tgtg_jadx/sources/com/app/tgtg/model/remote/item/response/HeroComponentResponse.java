package com.app.tgtg.model.remote.item.response;

import android.os.Parcel;
import android.os.Parcelable;
import b3.i;
import cg.e;
import e0.f;
import i90.g;
import i90.h;
import j4.s;
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
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 N2\u00020\u0001:\u0002ONBg\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fB{\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0082\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b+\u0010\u0016J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100J'\u00108\u001a\u00020\u001a2\u0006\u00101\u001a\u00020\u00002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0001¢\u0006\u0004\b6\u00107R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00109\u0012\u0004\b;\u0010<\u001a\u0004\b:\u0010\u001eR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00109\u0012\u0004\b>\u0010<\u001a\u0004\b=\u0010\u001eR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00109\u0012\u0004\b@\u0010<\u001a\u0004\b?\u0010\u001eR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00109\u0012\u0004\bB\u0010<\u001a\u0004\bA\u0010\u001eR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00109\u0012\u0004\bD\u0010<\u001a\u0004\bC\u0010\u001eR\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00109\u0012\u0004\bF\u0010<\u001a\u0004\bE\u0010\u001eR\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00109\u0012\u0004\bH\u0010<\u001a\u0004\bG\u0010\u001eR\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00109\u0012\u0004\bJ\u0010<\u001a\u0004\bI\u0010\u001eR(\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010K\u0012\u0004\bM\u0010<\u001a\u0004\bL\u0010'¨\u0006P"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/HeroComponentResponse;", "Landroid/os/Parcelable;", "", "doodleAnimationId", "backgroundAnimationId", "backgroundColor", MessageBundle.TITLE_ENTRY, "titlePrimaryColor", "titleSecondaryColor", "contentType", "displayType", "", "Lcom/app/tgtg/model/remote/item/response/BasicItem;", "items", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lm90/m1;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/app/tgtg/model/remote/item/response/HeroComponentResponse;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/response/HeroComponentResponse;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getDoodleAnimationId", "getDoodleAnimationId$annotations", "()V", "getBackgroundAnimationId", "getBackgroundAnimationId$annotations", "getBackgroundColor", "getBackgroundColor$annotations", "getTitle", "getTitle$annotations", "getTitlePrimaryColor", "getTitlePrimaryColor$annotations", "getTitleSecondaryColor", "getTitleSecondaryColor$annotations", "getContentType", "getContentType$annotations", "getDisplayType", "getDisplayType$annotations", "Ljava/util/List;", "getItems", "getItems$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class HeroComponentResponse implements Parcelable {

    @Nullable
    private final String backgroundAnimationId;

    @Nullable
    private final String backgroundColor;

    @Nullable
    private final String contentType;

    @Nullable
    private final String displayType;

    @Nullable
    private final String doodleAnimationId;

    @Nullable
    private final List<BasicItem> items;

    @Nullable
    private final String title;

    @Nullable
    private final String titlePrimaryColor;

    @Nullable
    private final String titleSecondaryColor;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<HeroComponentResponse> CREATOR = new Creator();

    @NotNull
    private static final j[] $childSerializers = {null, null, null, null, null, null, null, null, l.a(m.PUBLICATION, new e(24))};

    public /* synthetic */ HeroComponentResponse(int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, m1 m1Var) {
        if (511 != (i11 & 511)) {
            c1.j(i11, 511, HeroComponentResponse$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.doodleAnimationId = str;
        this.backgroundAnimationId = str2;
        this.backgroundColor = str3;
        this.title = str4;
        this.titlePrimaryColor = str5;
        this.titleSecondaryColor = str6;
        this.contentType = str7;
        this.displayType = str8;
        this.items = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(BasicItem.INSTANCE.serializer(), 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HeroComponentResponse copy$default(HeroComponentResponse heroComponentResponse, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = heroComponentResponse.doodleAnimationId;
        }
        if ((i11 & 2) != 0) {
            str2 = heroComponentResponse.backgroundAnimationId;
        }
        if ((i11 & 4) != 0) {
            str3 = heroComponentResponse.backgroundColor;
        }
        if ((i11 & 8) != 0) {
            str4 = heroComponentResponse.title;
        }
        if ((i11 & 16) != 0) {
            str5 = heroComponentResponse.titlePrimaryColor;
        }
        if ((i11 & 32) != 0) {
            str6 = heroComponentResponse.titleSecondaryColor;
        }
        if ((i11 & 64) != 0) {
            str7 = heroComponentResponse.contentType;
        }
        if ((i11 & 128) != 0) {
            str8 = heroComponentResponse.displayType;
        }
        if ((i11 & 256) != 0) {
            list = heroComponentResponse.items;
        }
        String str9 = str8;
        List list2 = list;
        String str10 = str6;
        String str11 = str7;
        String str12 = str5;
        String str13 = str3;
        return heroComponentResponse.copy(str, str2, str13, str4, str12, str10, str11, str9, list2);
    }

    public static final /* synthetic */ void write$Self$app(HeroComponentResponse self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        r1 r1Var = r1.f29848a;
        output.r(serialDesc, 0, r1Var, self.doodleAnimationId);
        output.r(serialDesc, 1, r1Var, self.backgroundAnimationId);
        output.r(serialDesc, 2, r1Var, self.backgroundColor);
        output.r(serialDesc, 3, r1Var, self.title);
        output.r(serialDesc, 4, r1Var, self.titlePrimaryColor);
        output.r(serialDesc, 5, r1Var, self.titleSecondaryColor);
        output.r(serialDesc, 6, r1Var, self.contentType);
        output.r(serialDesc, 7, r1Var, self.displayType);
        output.r(serialDesc, 8, (KSerializer) jVarArr[8].getValue(), self.items);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDoodleAnimationId() {
        return this.doodleAnimationId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBackgroundAnimationId() {
        return this.backgroundAnimationId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitlePrimaryColor() {
        return this.titlePrimaryColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTitleSecondaryColor() {
        return this.titleSecondaryColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getContentType() {
        return this.contentType;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDisplayType() {
        return this.displayType;
    }

    @Nullable
    public final List<BasicItem> component9() {
        return this.items;
    }

    @NotNull
    public final HeroComponentResponse copy(@Nullable String doodleAnimationId, @Nullable String backgroundAnimationId, @Nullable String backgroundColor, @Nullable String title, @Nullable String titlePrimaryColor, @Nullable String titleSecondaryColor, @Nullable String contentType, @Nullable String displayType, @Nullable List<? extends BasicItem> items) {
        return new HeroComponentResponse(doodleAnimationId, backgroundAnimationId, backgroundColor, title, titlePrimaryColor, titleSecondaryColor, contentType, displayType, items);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeroComponentResponse)) {
            return false;
        }
        HeroComponentResponse heroComponentResponse = (HeroComponentResponse) other;
        return Intrinsics.areEqual(this.doodleAnimationId, heroComponentResponse.doodleAnimationId) && Intrinsics.areEqual(this.backgroundAnimationId, heroComponentResponse.backgroundAnimationId) && Intrinsics.areEqual(this.backgroundColor, heroComponentResponse.backgroundColor) && Intrinsics.areEqual(this.title, heroComponentResponse.title) && Intrinsics.areEqual(this.titlePrimaryColor, heroComponentResponse.titlePrimaryColor) && Intrinsics.areEqual(this.titleSecondaryColor, heroComponentResponse.titleSecondaryColor) && Intrinsics.areEqual(this.contentType, heroComponentResponse.contentType) && Intrinsics.areEqual(this.displayType, heroComponentResponse.displayType) && Intrinsics.areEqual(this.items, heroComponentResponse.items);
    }

    @Nullable
    public final String getBackgroundAnimationId() {
        return this.backgroundAnimationId;
    }

    @Nullable
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    public final String getContentType() {
        return this.contentType;
    }

    @Nullable
    public final String getDisplayType() {
        return this.displayType;
    }

    @Nullable
    public final String getDoodleAnimationId() {
        return this.doodleAnimationId;
    }

    @Nullable
    public final List<BasicItem> getItems() {
        return this.items;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getTitlePrimaryColor() {
        return this.titlePrimaryColor;
    }

    @Nullable
    public final String getTitleSecondaryColor() {
        return this.titleSecondaryColor;
    }

    public int hashCode() {
        String str = this.doodleAnimationId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.backgroundAnimationId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.backgroundColor;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.titlePrimaryColor;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.titleSecondaryColor;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.contentType;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.displayType;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List<BasicItem> list = this.items;
        return iHashCode8 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.doodleAnimationId;
        String str2 = this.backgroundAnimationId;
        String str3 = this.backgroundColor;
        String str4 = this.title;
        String str5 = this.titlePrimaryColor;
        String str6 = this.titleSecondaryColor;
        String str7 = this.contentType;
        String str8 = this.displayType;
        List<BasicItem> list = this.items;
        StringBuilder sbT = f.t("HeroComponentResponse(doodleAnimationId=", str, ", backgroundAnimationId=", str2, ", backgroundColor=");
        s.A(sbT, str3, ", title=", str4, ", titlePrimaryColor=");
        s.A(sbT, str5, ", titleSecondaryColor=", str6, ", contentType=");
        s.A(sbT, str7, ", displayType=", str8, ", items=");
        return f.p(sbT, list, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.doodleAnimationId);
        dest.writeString(this.backgroundAnimationId);
        dest.writeString(this.backgroundColor);
        dest.writeString(this.title);
        dest.writeString(this.titlePrimaryColor);
        dest.writeString(this.titleSecondaryColor);
        dest.writeString(this.contentType);
        dest.writeString(this.displayType);
        List<BasicItem> list = this.items;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = i.q(dest, 1, list);
        while (itQ.hasNext()) {
            dest.writeParcelable((Parcelable) itQ.next(), flags);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/response/HeroComponentResponse$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/response/HeroComponentResponse;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return HeroComponentResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<HeroComponentResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HeroComponentResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 != i11; i12++) {
                    arrayList.add(parcel.readParcelable(HeroComponentResponse.class.getClassLoader()));
                }
            }
            return new HeroComponentResponse(string, string2, string3, string4, string5, string6, string7, string8, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HeroComponentResponse[] newArray(int i11) {
            return new HeroComponentResponse[i11];
        }
    }

    @g("background_animation_id")
    public static /* synthetic */ void getBackgroundAnimationId$annotations() {
    }

    @g("background_color")
    public static /* synthetic */ void getBackgroundColor$annotations() {
    }

    @g("content_type")
    public static /* synthetic */ void getContentType$annotations() {
    }

    @g("display_type")
    public static /* synthetic */ void getDisplayType$annotations() {
    }

    @g("doodle_animation_id")
    public static /* synthetic */ void getDoodleAnimationId$annotations() {
    }

    @g("items")
    public static /* synthetic */ void getItems$annotations() {
    }

    @g(MessageBundle.TITLE_ENTRY)
    public static /* synthetic */ void getTitle$annotations() {
    }

    @g("title_primary_color")
    public static /* synthetic */ void getTitlePrimaryColor$annotations() {
    }

    @g("title_secondary_color")
    public static /* synthetic */ void getTitleSecondaryColor$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HeroComponentResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable List<? extends BasicItem> list) {
        this.doodleAnimationId = str;
        this.backgroundAnimationId = str2;
        this.backgroundColor = str3;
        this.title = str4;
        this.titlePrimaryColor = str5;
        this.titleSecondaryColor = str6;
        this.contentType = str7;
        this.displayType = str8;
        this.items = list;
    }
}
