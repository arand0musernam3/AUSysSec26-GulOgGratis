package qj;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.feature.storeview.ui.StoreViewActivity;
import com.app.tgtg.model.remote.StoreId;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m1 extends m {

    @NotNull
    public static final Parcelable.Creator<m1> CREATOR = new f1(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37121a;

    public m1(String str) {
        str.getClass();
        this.f37121a = str;
    }

    @Override // qj.m
    public final f70.b a() {
        String str = this.f37121a;
        if (str.length() > 0) {
            return new f70.b(StoreViewActivity.class, jb.u.x(new Pair("ORIGIN", f70.i.DEEP_LINK), new Pair("STORE_ID", StoreId.m269boximpl(StoreId.m270constructorimpl(str)))), false, false, false, null, null, null, null, false, 636);
        }
        mv.a0 a0Var = new mv.a0();
        f70.i iVar = f70.i.DEEP_LINK;
        iVar.getClass();
        a0Var.f30139b = iVar;
        return a0Var.b();
    }

    @Override // qj.m
    public final String b() {
        return "store/collaboration";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m1) && Intrinsics.areEqual(this.f37121a, ((m1) obj).f37121a);
    }

    public final int hashCode() {
        return this.f37121a.hashCode();
    }

    public final String toString() {
        return w.a0.p("StoreDetailCollaborationDeepLink(storeId=", this.f37121a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeString(this.f37121a);
    }
}
