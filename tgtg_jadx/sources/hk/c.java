package hk;

import android.os.Parcel;
import android.os.Parcelable;
import com.app.tgtg.model.remote.order.Order;
import e10.b0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<c> CREATOR = new b0(22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f22090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f22091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Order f22092d;

    public c(int i11, a aVar, ArrayList arrayList, Order order) {
        aVar.getClass();
        this.f22089a = i11;
        this.f22090b = aVar;
        this.f22091c = arrayList;
        this.f22092d = order;
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
        return this.f22089a == cVar.f22089a && this.f22090b == cVar.f22090b && Intrinsics.areEqual(this.f22091c, cVar.f22091c) && Intrinsics.areEqual(this.f22092d, cVar.f22092d);
    }

    public final int hashCode() {
        int iHashCode = (this.f22091c.hashCode() + ((this.f22090b.hashCode() + (Integer.hashCode(this.f22089a) * 31)) * 31)) * 31;
        Order order = this.f22092d;
        return iHashCode + (order == null ? 0 : order.hashCode());
    }

    public final String toString() {
        return "HelpDeskObject(toolbarTitle=" + this.f22089a + ", topic=" + this.f22090b + ", listOfQuestions=" + this.f22091c + ", order=" + this.f22092d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.getClass();
        parcel.writeInt(this.f22089a);
        parcel.writeString(this.f22090b.name());
        ArrayList arrayList = this.f22091c;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((d) it.next()).writeToParcel(parcel, i11);
        }
        Order order = this.f22092d;
        if (order == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            order.writeToParcel(parcel, i11);
        }
    }
}
