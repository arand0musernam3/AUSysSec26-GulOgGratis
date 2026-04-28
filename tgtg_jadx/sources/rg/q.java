package rg;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import m90.c1;
import org.jetbrains.annotations.NotNull;
import qj.f1;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@i90.h
public final class q implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38015a;

    @NotNull
    public static final p Companion = new p();

    @NotNull
    public static final Parcelable.Creator<q> CREATOR = new f1(26);

    public /* synthetic */ q(int i11, String str) {
        if (1 == (i11 & 1)) {
            this.f38015a = str;
        } else {
            c1.j(i11, 1, o.f38014a.getDescriptor());
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && Intrinsics.areEqual(this.f38015a, ((q) obj).f38015a);
    }

    public final int hashCode() {
        return this.f38015a.hashCode();
    }

    public final String toString() {
        return a0.p("Unavailable(message=", this.f38015a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeString(this.f38015a);
    }

    public q(String str) {
        str.getClass();
        this.f38015a = str;
    }
}
