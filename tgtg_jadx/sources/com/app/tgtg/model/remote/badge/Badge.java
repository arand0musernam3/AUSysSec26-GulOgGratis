package com.app.tgtg.model.remote.badge;

import android.os.Parcel;
import android.os.Parcelable;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nBK\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0012\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010!JJ\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010!J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0019J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u0019R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00102\u0012\u0004\b4\u00101\u001a\u0004\b3\u0010!R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00102\u0012\u0004\b6\u00101\u001a\u0004\b5\u0010!R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00102\u0012\u0004\b8\u00101\u001a\u0004\b7\u0010!R\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00102\u0012\u0004\b:\u00101\u001a\u0004\b9\u0010!¨\u0006="}, d2 = {"Lcom/app/tgtg/model/remote/badge/Badge;", "Landroid/os/Parcelable;", "", "id", "", "imageUrl", "name", "achievedAtUtc", "animationUrl", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/badge/Badge;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/badge/Badge;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "getId$annotations", "()V", "Ljava/lang/String;", "getImageUrl", "getImageUrl$annotations", "getName", "getName$annotations", "getAchievedAtUtc", "getAchievedAtUtc$annotations", "getAnimationUrl", "getAnimationUrl$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class Badge implements Parcelable {
    public static final int $stable = 0;

    @Nullable
    private final String achievedAtUtc;

    @Nullable
    private final String animationUrl;
    private final int id;

    @Nullable
    private final String imageUrl;

    @Nullable
    private final String name;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<Badge> CREATOR = new Creator();

    public /* synthetic */ Badge(int i11, int i12, String str, String str2, String str3, String str4, m1 m1Var) {
        if (1 != (i11 & 1)) {
            c1.j(i11, 1, Badge$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = i12;
        if ((i11 & 2) == 0) {
            this.imageUrl = null;
        } else {
            this.imageUrl = str;
        }
        if ((i11 & 4) == 0) {
            this.name = null;
        } else {
            this.name = str2;
        }
        if ((i11 & 8) == 0) {
            this.achievedAtUtc = null;
        } else {
            this.achievedAtUtc = str3;
        }
        if ((i11 & 16) == 0) {
            this.animationUrl = null;
        } else {
            this.animationUrl = str4;
        }
    }

    public static /* synthetic */ Badge copy$default(Badge badge, int i11, String str, String str2, String str3, String str4, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = badge.id;
        }
        if ((i12 & 2) != 0) {
            str = badge.imageUrl;
        }
        if ((i12 & 4) != 0) {
            str2 = badge.name;
        }
        if ((i12 & 8) != 0) {
            str3 = badge.achievedAtUtc;
        }
        if ((i12 & 16) != 0) {
            str4 = badge.animationUrl;
        }
        String str5 = str4;
        String str6 = str2;
        return badge.copy(i11, str, str6, str3, str5);
    }

    public static final /* synthetic */ void write$Self$app(Badge self, b output, SerialDescriptor serialDesc) {
        output.m(0, self.id, serialDesc);
        if (output.C(serialDesc) || self.imageUrl != null) {
            output.r(serialDesc, 1, r1.f29848a, self.imageUrl);
        }
        if (output.C(serialDesc) || self.name != null) {
            output.r(serialDesc, 2, r1.f29848a, self.name);
        }
        if (output.C(serialDesc) || self.achievedAtUtc != null) {
            output.r(serialDesc, 3, r1.f29848a, self.achievedAtUtc);
        }
        if (!output.C(serialDesc) && self.animationUrl == null) {
            return;
        }
        output.r(serialDesc, 4, r1.f29848a, self.animationUrl);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAchievedAtUtc() {
        return this.achievedAtUtc;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAnimationUrl() {
        return this.animationUrl;
    }

    @NotNull
    public final Badge copy(int id2, @Nullable String imageUrl, @Nullable String name, @Nullable String achievedAtUtc, @Nullable String animationUrl) {
        return new Badge(id2, imageUrl, name, achievedAtUtc, animationUrl);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Badge)) {
            return false;
        }
        Badge badge = (Badge) other;
        return this.id == badge.id && Intrinsics.areEqual(this.imageUrl, badge.imageUrl) && Intrinsics.areEqual(this.name, badge.name) && Intrinsics.areEqual(this.achievedAtUtc, badge.achievedAtUtc) && Intrinsics.areEqual(this.animationUrl, badge.animationUrl);
    }

    @Nullable
    public final String getAchievedAtUtc() {
        return this.achievedAtUtc;
    }

    @Nullable
    public final String getAnimationUrl() {
        return this.animationUrl;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        String str = this.imageUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.achievedAtUtc;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.animationUrl;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        int i11 = this.id;
        String str = this.imageUrl;
        String str2 = this.name;
        String str3 = this.achievedAtUtc;
        String str4 = this.animationUrl;
        StringBuilder sb2 = new StringBuilder("Badge(id=");
        sb2.append(i11);
        sb2.append(", imageUrl=");
        sb2.append(str);
        sb2.append(", name=");
        s.A(sb2, str2, ", achievedAtUtc=", str3, ", animationUrl=");
        return k.p(sb2, str4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.id);
        dest.writeString(this.imageUrl);
        dest.writeString(this.name);
        dest.writeString(this.achievedAtUtc);
        dest.writeString(this.animationUrl);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/badge/Badge$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/badge/Badge;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Badge$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Badge> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Badge createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new Badge(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Badge[] newArray(int i11) {
            return new Badge[i11];
        }
    }

    @g("achieved_at")
    public static /* synthetic */ void getAchievedAtUtc$annotations() {
    }

    @g("animation_url")
    public static /* synthetic */ void getAnimationUrl$annotations() {
    }

    @g("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @g("image_url")
    public static /* synthetic */ void getImageUrl$annotations() {
    }

    @g("name")
    public static /* synthetic */ void getName$annotations() {
    }

    public Badge(int i11, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.id = i11;
        this.imageUrl = str;
        this.name = str2;
        this.achievedAtUtc = str3;
        this.animationUrl = str4;
    }

    public /* synthetic */ Badge(int i11, String str, String str2, String str3, String str4, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : str4);
    }
}
