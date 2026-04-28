package rg;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.widgets.response.FavouriteWidgetItem;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m90.c1;
import org.jetbrains.annotations.NotNull;
import qj.f1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@i90.h
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f38006b;

    @NotNull
    public static final f Companion = new f();

    @NotNull
    public static final Parcelable.Creator<g> CREATOR = new f1(19);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u70.j[] f38004c = {null, u70.l.a(u70.m.PUBLICATION, new qw.c(24))};

    public /* synthetic */ g(String str, List list, int i11) {
        if (3 != (i11 & 3)) {
            c1.j(i11, 3, e.f38003a.getDescriptor());
            throw null;
        }
        this.f38005a = str;
        this.f38006b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f38005a, gVar.f38005a) && Intrinsics.areEqual(this.f38006b, gVar.f38006b);
    }

    public final int hashCode() {
        String str = this.f38005a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.f38006b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "Available(currentTime=" + this.f38005a + ", items=" + this.f38006b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeString(this.f38005a);
        List list = this.f38006b;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itQ = b3.i.q(parcel, 1, list);
        while (itQ.hasNext()) {
            ((FavouriteWidgetItem) itQ.next()).writeToParcel(parcel, i11);
        }
    }

    public g(String str, List list) {
        this.f38005a = str;
        this.f38006b = list;
    }
}
