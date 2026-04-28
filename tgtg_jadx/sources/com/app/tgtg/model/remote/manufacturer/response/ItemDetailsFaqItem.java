package com.app.tgtg.model.remote.manufacturer.response;

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
import m90.m1;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBU\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J\r\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 JV\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001aJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010\u0012J\u001a\u0010'\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(J'\u00100\u001a\u00020\u00162\u0006\u0010)\u001a\u00020\u00002\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0001¢\u0006\u0004\b.\u0010/R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u00101\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010\u001aR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00101\u0012\u0004\b6\u00104\u001a\u0004\b5\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00101\u0012\u0004\b8\u00104\u001a\u0004\b7\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00101\u0012\u0004\b:\u00104\u001a\u0004\b9\u0010\u001aR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00101\u0012\u0004\b<\u00104\u001a\u0004\b;\u0010\u001aR\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010=\u001a\u0004\b\t\u0010 \"\u0004\b>\u0010?¨\u0006B"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/ItemDetailsFaqItem;", "Landroid/os/Parcelable;", "", "eventId", "question", "answer", "linkUrl", "linkText", "", "isCollapsed", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLm90/m1;)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lcom/app/tgtg/model/remote/manufacturer/response/ItemDetailsFaqItem;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "write$Self$app", "(Lcom/app/tgtg/model/remote/manufacturer/response/ItemDetailsFaqItem;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Ljava/lang/String;", "getEventId", "getEventId$annotations", "()V", "getQuestion", "getQuestion$annotations", "getAnswer", "getAnswer$annotations", "getLinkUrl", "getLinkUrl$annotations", "getLinkText", "getLinkText$annotations", "Z", "setCollapsed", "(Z)V", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class ItemDetailsFaqItem implements Parcelable {

    @Nullable
    private final String answer;

    @Nullable
    private final String eventId;
    private boolean isCollapsed;

    @Nullable
    private final String linkText;

    @Nullable
    private final String linkUrl;

    @Nullable
    private final String question;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<ItemDetailsFaqItem> CREATOR = new Creator();

    public /* synthetic */ ItemDetailsFaqItem(int i11, String str, String str2, String str3, String str4, String str5, boolean z11, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.eventId = null;
        } else {
            this.eventId = str;
        }
        if ((i11 & 2) == 0) {
            this.question = null;
        } else {
            this.question = str2;
        }
        if ((i11 & 4) == 0) {
            this.answer = null;
        } else {
            this.answer = str3;
        }
        if ((i11 & 8) == 0) {
            this.linkUrl = null;
        } else {
            this.linkUrl = str4;
        }
        if ((i11 & 16) == 0) {
            this.linkText = null;
        } else {
            this.linkText = str5;
        }
        if ((i11 & 32) == 0) {
            this.isCollapsed = true;
        } else {
            this.isCollapsed = z11;
        }
    }

    public static /* synthetic */ ItemDetailsFaqItem copy$default(ItemDetailsFaqItem itemDetailsFaqItem, String str, String str2, String str3, String str4, String str5, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = itemDetailsFaqItem.eventId;
        }
        if ((i11 & 2) != 0) {
            str2 = itemDetailsFaqItem.question;
        }
        if ((i11 & 4) != 0) {
            str3 = itemDetailsFaqItem.answer;
        }
        if ((i11 & 8) != 0) {
            str4 = itemDetailsFaqItem.linkUrl;
        }
        if ((i11 & 16) != 0) {
            str5 = itemDetailsFaqItem.linkText;
        }
        if ((i11 & 32) != 0) {
            z11 = itemDetailsFaqItem.isCollapsed;
        }
        String str6 = str5;
        boolean z12 = z11;
        return itemDetailsFaqItem.copy(str, str2, str3, str4, str6, z12);
    }

    public static final /* synthetic */ void write$Self$app(ItemDetailsFaqItem self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.eventId != null) {
            output.r(serialDesc, 0, r1.f29848a, self.eventId);
        }
        if (output.C(serialDesc) || self.question != null) {
            output.r(serialDesc, 1, r1.f29848a, self.question);
        }
        if (output.C(serialDesc) || self.answer != null) {
            output.r(serialDesc, 2, r1.f29848a, self.answer);
        }
        if (output.C(serialDesc) || self.linkUrl != null) {
            output.r(serialDesc, 3, r1.f29848a, self.linkUrl);
        }
        if (output.C(serialDesc) || self.linkText != null) {
            output.r(serialDesc, 4, r1.f29848a, self.linkText);
        }
        if (!output.C(serialDesc) && self.isCollapsed) {
            return;
        }
        output.p(serialDesc, 5, self.isCollapsed);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getQuestion() {
        return this.question;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAnswer() {
        return this.answer;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLinkUrl() {
        return this.linkUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLinkText() {
        return this.linkText;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsCollapsed() {
        return this.isCollapsed;
    }

    @NotNull
    public final ItemDetailsFaqItem copy(@Nullable String eventId, @Nullable String question, @Nullable String answer, @Nullable String linkUrl, @Nullable String linkText, boolean isCollapsed) {
        return new ItemDetailsFaqItem(eventId, question, answer, linkUrl, linkText, isCollapsed);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ItemDetailsFaqItem)) {
            return false;
        }
        ItemDetailsFaqItem itemDetailsFaqItem = (ItemDetailsFaqItem) other;
        return Intrinsics.areEqual(this.eventId, itemDetailsFaqItem.eventId) && Intrinsics.areEqual(this.question, itemDetailsFaqItem.question) && Intrinsics.areEqual(this.answer, itemDetailsFaqItem.answer) && Intrinsics.areEqual(this.linkUrl, itemDetailsFaqItem.linkUrl) && Intrinsics.areEqual(this.linkText, itemDetailsFaqItem.linkText) && this.isCollapsed == itemDetailsFaqItem.isCollapsed;
    }

    @Nullable
    public final String getAnswer() {
        return this.answer;
    }

    @Nullable
    public final String getEventId() {
        return this.eventId;
    }

    @Nullable
    public final String getLinkText() {
        return this.linkText;
    }

    @Nullable
    public final String getLinkUrl() {
        return this.linkUrl;
    }

    @Nullable
    public final String getQuestion() {
        return this.question;
    }

    public int hashCode() {
        String str = this.eventId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.question;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.answer;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.linkUrl;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.linkText;
        return Boolean.hashCode(this.isCollapsed) + ((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public final boolean isCollapsed() {
        return this.isCollapsed;
    }

    public final void setCollapsed(boolean z11) {
        this.isCollapsed = z11;
    }

    @NotNull
    public String toString() {
        String str = this.eventId;
        String str2 = this.question;
        String str3 = this.answer;
        String str4 = this.linkUrl;
        String str5 = this.linkText;
        boolean z11 = this.isCollapsed;
        StringBuilder sbT = f.t("ItemDetailsFaqItem(eventId=", str, ", question=", str2, ", answer=");
        s.A(sbT, str3, ", linkUrl=", str4, ", linkText=");
        sbT.append(str5);
        sbT.append(", isCollapsed=");
        sbT.append(z11);
        sbT.append(")");
        return sbT.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.eventId);
        dest.writeString(this.question);
        dest.writeString(this.answer);
        dest.writeString(this.linkUrl);
        dest.writeString(this.linkText);
        dest.writeInt(this.isCollapsed ? 1 : 0);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/manufacturer/response/ItemDetailsFaqItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/manufacturer/response/ItemDetailsFaqItem;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return ItemDetailsFaqItem$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ItemDetailsFaqItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ItemDetailsFaqItem createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ItemDetailsFaqItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ItemDetailsFaqItem[] newArray(int i11) {
            return new ItemDetailsFaqItem[i11];
        }
    }

    @g("answer")
    public static /* synthetic */ void getAnswer$annotations() {
    }

    @g("event_id")
    public static /* synthetic */ void getEventId$annotations() {
    }

    @g("link_text")
    public static /* synthetic */ void getLinkText$annotations() {
    }

    @g("link_url")
    public static /* synthetic */ void getLinkUrl$annotations() {
    }

    @g("question")
    public static /* synthetic */ void getQuestion$annotations() {
    }

    public ItemDetailsFaqItem() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, false, 63, (DefaultConstructorMarker) null);
    }

    public ItemDetailsFaqItem(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, boolean z11) {
        this.eventId = str;
        this.question = str2;
        this.answer = str3;
        this.linkUrl = str4;
        this.linkText = str5;
        this.isCollapsed = z11;
    }

    public /* synthetic */ ItemDetailsFaqItem(String str, String str2, String str3, String str4, String str5, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? true : z11);
    }
}
