package com.app.tgtg.model.remote.item;

import android.os.Parcel;
import android.os.Parcelable;
import com.braze.models.FeatureFlag;
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
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r8.k;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBA\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010 J:\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010 J\u0010\u0010(\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b(\u0010\u0019J\u001a\u0010+\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010 R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010-\u0012\u0004\b2\u00100\u001a\u0004\b1\u0010 R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00103\u0012\u0004\b5\u00100\u001a\u0004\b4\u0010#R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010-\u0012\u0004\b7\u00100\u001a\u0004\b6\u0010 ¨\u0006:"}, d2 = {"Lcom/app/tgtg/model/remote/item/QuickFilter;", "Landroid/os/Parcelable;", "", "id", TextBundle.TEXT_ENTRY, "", FeatureFlag.ENABLED, "nameVoiceover", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/QuickFilter;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lcom/app/tgtg/model/remote/item/QuickFilter;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getText", "getText$annotations", "Z", "getEnabled", "getEnabled$annotations", "getNameVoiceover", "getNameVoiceover$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class QuickFilter implements Parcelable {
    public static final int $stable = 0;
    private final boolean enabled;

    @NotNull
    private final String id;

    @Nullable
    private final String nameVoiceover;

    @NotNull
    private final String text;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<QuickFilter> CREATOR = new Creator();

    public /* synthetic */ QuickFilter(int i11, String str, String str2, boolean z11, String str3, m1 m1Var) {
        if (7 != (i11 & 7)) {
            c1.j(i11, 7, QuickFilter$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.text = str2;
        this.enabled = z11;
        if ((i11 & 8) == 0) {
            this.nameVoiceover = null;
        } else {
            this.nameVoiceover = str3;
        }
    }

    public static /* synthetic */ QuickFilter copy$default(QuickFilter quickFilter, String str, String str2, boolean z11, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = quickFilter.id;
        }
        if ((i11 & 2) != 0) {
            str2 = quickFilter.text;
        }
        if ((i11 & 4) != 0) {
            z11 = quickFilter.enabled;
        }
        if ((i11 & 8) != 0) {
            str3 = quickFilter.nameVoiceover;
        }
        return quickFilter.copy(str, str2, z11, str3);
    }

    public static final /* synthetic */ void write$Self$app(QuickFilter self, b output, SerialDescriptor serialDesc) {
        output.q(serialDesc, 0, self.id);
        output.q(serialDesc, 1, self.text);
        output.p(serialDesc, 2, self.enabled);
        if (!output.C(serialDesc) && self.nameVoiceover == null) {
            return;
        }
        output.r(serialDesc, 3, r1.f29848a, self.nameVoiceover);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getNameVoiceover() {
        return this.nameVoiceover;
    }

    @NotNull
    public final QuickFilter copy(@NotNull String id2, @NotNull String text, boolean enabled, @Nullable String nameVoiceover) {
        id2.getClass();
        text.getClass();
        return new QuickFilter(id2, text, enabled, nameVoiceover);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuickFilter)) {
            return false;
        }
        QuickFilter quickFilter = (QuickFilter) other;
        return Intrinsics.areEqual(this.id, quickFilter.id) && Intrinsics.areEqual(this.text, quickFilter.text) && this.enabled == quickFilter.enabled && Intrinsics.areEqual(this.nameVoiceover, quickFilter.nameVoiceover);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getNameVoiceover() {
        return this.nameVoiceover;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iE = k.e(l1.b(this.id.hashCode() * 31, 31, this.text), 31, this.enabled);
        String str = this.nameVoiceover;
        return iE + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.text;
        boolean z11 = this.enabled;
        String str3 = this.nameVoiceover;
        StringBuilder sbT = f.t("QuickFilter(id=", str, ", text=", str2, ", enabled=");
        sbT.append(z11);
        sbT.append(", nameVoiceover=");
        sbT.append(str3);
        sbT.append(")");
        return sbT.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.id);
        dest.writeString(this.text);
        dest.writeInt(this.enabled ? 1 : 0);
        dest.writeString(this.nameVoiceover);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/QuickFilter$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/QuickFilter;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return QuickFilter$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<QuickFilter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuickFilter createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new QuickFilter(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuickFilter[] newArray(int i11) {
            return new QuickFilter[i11];
        }
    }

    @g(FeatureFlag.ENABLED)
    public static /* synthetic */ void getEnabled$annotations() {
    }

    @g("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @g("name_voiceover")
    public static /* synthetic */ void getNameVoiceover$annotations() {
    }

    @g(TextBundle.TEXT_ENTRY)
    public static /* synthetic */ void getText$annotations() {
    }

    public QuickFilter(@NotNull String str, @NotNull String str2, boolean z11, @Nullable String str3) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.text = str2;
        this.enabled = z11;
        this.nameVoiceover = str3;
    }

    public /* synthetic */ QuickFilter(String str, String str2, boolean z11, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z11, (i11 & 8) != 0 ? null : str3);
    }
}
