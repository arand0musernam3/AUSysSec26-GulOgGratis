package qj;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class u extends m {

    @NotNull
    public static final Parcelable.Creator<u> CREATOR = new oa.i(24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37148a;

    public u(String str) {
        str.getClass();
        this.f37148a = str;
    }

    @Override // qj.m
    public final f70.b a() {
        mv.a0 a0Var = new mv.a0();
        mv.y yVar = mv.y.MAIN_START;
        yVar.getClass();
        a0Var.f30140c = yVar;
        f70.i iVar = f70.i.DEEP_LINK;
        iVar.getClass();
        a0Var.f30139b = iVar;
        String str = this.f37148a;
        str.getClass();
        a0Var.f30142e = str;
        return a0Var.b();
    }

    @Override // qj.m
    public final String b() {
        return "email-confirmation";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.areEqual(this.f37148a, ((u) obj).f37148a);
    }

    public final int hashCode() {
        return this.f37148a.hashCode();
    }

    public final String toString() {
        return w.a0.p("ConfirmEmailDeepLink(token=", this.f37148a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeString(this.f37148a);
    }
}
