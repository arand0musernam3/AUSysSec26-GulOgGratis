package aj;

import a00.p0;
import a3.c0;
import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.manufacturer.request.BasketBriefItem;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import m90.c1;
import org.jetbrains.annotations.NotNull;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@i90.h
public final class c implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1496c;

    @NotNull
    public static final b Companion = new b();

    @NotNull
    public static final Parcelable.Creator<c> CREATOR = new p0(9);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u70.j[] f1493d = {u70.l.a(u70.m.PUBLICATION, new c0(13)), null, null};

    public /* synthetic */ c(int i11, List list, String str, String str2) {
        if (7 != (i11 & 7)) {
            c1.j(i11, 7, a.f1492a.getDescriptor());
            throw null;
        }
        this.f1494a = list;
        this.f1495b = str;
        this.f1496c = str2;
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
        return Intrinsics.areEqual(this.f1494a, cVar.f1494a) && Intrinsics.areEqual(this.f1495b, cVar.f1495b) && Intrinsics.areEqual(this.f1496c, cVar.f1496c);
    }

    public final int hashCode() {
        return this.f1496c.hashCode() + l1.b(this.f1494a.hashCode() * 31, 31, this.f1495b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BasketCheckoutData(basketBriefItems=");
        sb2.append(this.f1494a);
        sb2.append(", basketCountry=");
        sb2.append(this.f1495b);
        sb2.append(", basketId=");
        return r8.k.p(sb2, this.f1496c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        Iterator itR = b3.i.r(this.f1494a, parcel);
        while (itR.hasNext()) {
            ((BasketBriefItem) itR.next()).writeToParcel(parcel, i11);
        }
        parcel.writeString(this.f1495b);
        parcel.writeString(this.f1496c);
    }

    public c(List list, String str, String str2) {
        list.getClass();
        str.getClass();
        str2.getClass();
        this.f1494a = list;
        this.f1495b = str;
        this.f1496c = str2;
    }
}
