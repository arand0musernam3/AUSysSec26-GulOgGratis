package com.app.tgtg.model.remote.item;

import android.os.Parcel;
import android.os.Parcelable;
import i90.g;
import i90.h;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.m1;
import m90.r1;
import org.bouncycastle.jcajce.provider.asymmetric.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001dJ\u001d\u0010\"\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010%J(\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010%R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010*\u0012\u0004\b.\u0010/\u001a\u0004\b+\u0010%\"\u0004\b,\u0010-R*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010*\u0012\u0004\b2\u0010/\u001a\u0004\b0\u0010%\"\u0004\b1\u0010-¨\u00065"}, d2 = {"Lcom/app/tgtg/model/remote/item/Picture;", "Landroid/os/Parcelable;", "", "currentUrl", "pictureId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$app", "(Lcom/app/tgtg/model/remote/item/Picture;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "o", "displayedParametersAreEqual", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/app/tgtg/model/remote/item/Picture;", "toString", "Ljava/lang/String;", "getCurrentUrl", "setCurrentUrl", "(Ljava/lang/String;)V", "getCurrentUrl$annotations", "()V", "getPictureId", "setPictureId", "getPictureId$annotations", "Companion", "$serializer", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class Picture implements Parcelable {

    @Nullable
    private String currentUrl;

    @Nullable
    private String pictureId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<Picture> CREATOR = new Creator();

    public /* synthetic */ Picture(int i11, String str, String str2, m1 m1Var) {
        if ((i11 & 1) == 0) {
            this.currentUrl = null;
        } else {
            this.currentUrl = str;
        }
        if ((i11 & 2) == 0) {
            this.pictureId = null;
        } else {
            this.pictureId = str2;
        }
    }

    public static /* synthetic */ Picture copy$default(Picture picture, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = picture.currentUrl;
        }
        if ((i11 & 2) != 0) {
            str2 = picture.pictureId;
        }
        return picture.copy(str, str2);
    }

    public static final /* synthetic */ void write$Self$app(Picture self, b output, SerialDescriptor serialDesc) {
        if (output.C(serialDesc) || self.currentUrl != null) {
            output.r(serialDesc, 0, r1.f29848a, self.currentUrl);
        }
        if (!output.C(serialDesc) && self.pictureId == null) {
            return;
        }
        output.r(serialDesc, 1, r1.f29848a, self.pictureId);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCurrentUrl() {
        return this.currentUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPictureId() {
        return this.pictureId;
    }

    @NotNull
    public final Picture copy(@Nullable String currentUrl, @Nullable String pictureId) {
        return new Picture(currentUrl, pictureId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean displayedParametersAreEqual(@NotNull Object o11) {
        o11.getClass();
        if (this == o11) {
            return true;
        }
        if (o11 instanceof Picture) {
            return Intrinsics.areEqual(this.currentUrl, ((Picture) o11).currentUrl);
        }
        return false;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Picture)) {
            return false;
        }
        Picture picture = (Picture) other;
        return Intrinsics.areEqual(this.currentUrl, picture.currentUrl) && Intrinsics.areEqual(this.pictureId, picture.pictureId);
    }

    @Nullable
    public final String getCurrentUrl() {
        return this.currentUrl;
    }

    @Nullable
    public final String getPictureId() {
        return this.pictureId;
    }

    public int hashCode() {
        return Objects.hash(this.currentUrl, this.pictureId);
    }

    public final void setCurrentUrl(@Nullable String str) {
        this.currentUrl = str;
    }

    public final void setPictureId(@Nullable String str) {
        this.pictureId = str;
    }

    @NotNull
    public String toString() {
        return a.d("Picture(currentUrl=", this.currentUrl, ", pictureId=", this.pictureId, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.currentUrl);
        dest.writeString(this.pictureId);
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/app/tgtg/model/remote/item/Picture$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/app/tgtg/model/remote/item/Picture;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return Picture$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Picture> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Picture createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new Picture(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Picture[] newArray(int i11) {
            return new Picture[i11];
        }
    }

    @g("current_url")
    public static /* synthetic */ void getCurrentUrl$annotations() {
    }

    @g("picture_id")
    public static /* synthetic */ void getPictureId$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Picture() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public Picture(@Nullable String str, @Nullable String str2) {
        this.currentUrl = str;
        this.pictureId = str2;
    }

    public /* synthetic */ Picture(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
    }
}
