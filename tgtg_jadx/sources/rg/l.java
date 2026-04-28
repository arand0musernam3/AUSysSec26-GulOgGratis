package rg;

import android.os.Parcel;
import android.os.Parcelable;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;
import qj.f1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@i90.h
public final class l implements r {

    @NotNull
    public static final l INSTANCE = new l();

    @NotNull
    public static final Parcelable.Creator<l> CREATOR = new f1(24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ Object f38011a = u70.l.a(u70.m.PUBLICATION, new qw.c(29));

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, u70.j] */
    @NotNull
    public final KSerializer serializer() {
        return (KSerializer) f38011a.getValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
