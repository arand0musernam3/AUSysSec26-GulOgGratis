package vj;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u70.l;
import u70.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class c implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f42411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f42412b;

    @NotNull
    public static final b Companion = new b();

    @NotNull
    public static final Parcelable.Creator<c> CREATOR = new s00.e(15);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u70.j[] f42410c = {null, l.a(m.PUBLICATION, new uu.a(7))};

    public /* synthetic */ c(int i11, e eVar, List list) {
        this.f42411a = (i11 & 1) == 0 ? e.UNKNOWN : eVar;
        if ((i11 & 2) == 0) {
            this.f42412b = null;
        } else {
            this.f42412b = list;
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
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f42411a == cVar.f42411a && Intrinsics.areEqual(this.f42412b, cVar.f42412b);
    }

    public final int hashCode() {
        int iHashCode = this.f42411a.hashCode() * 31;
        List list = this.f42412b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "FavoriteReminderSettings(type=" + this.f42411a + ", scheduledDays=" + this.f42412b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeString(this.f42411a.name());
        List list = this.f42412b;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itQ = b3.i.q(parcel, 1, list);
        while (itQ.hasNext()) {
            parcel.writeString(((j) itQ.next()).name());
        }
    }

    public c(e eVar, List list) {
        eVar.getClass();
        this.f42411a = eVar;
        this.f42412b = list;
    }
}
