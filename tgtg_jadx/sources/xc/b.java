package xc;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.collections.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable {

    @Deprecated
    @NotNull
    public static final Parcelable.Creator<b> CREATOR = new s00.e(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f44222b;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(String str) {
        o0 o0Var = o0.f26530a;
        o0Var.getClass();
        this(str, o0Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f44221a, bVar.f44221a) && Intrinsics.areEqual(this.f44222b, bVar.f44222b);
    }

    public final int hashCode() {
        return this.f44222b.hashCode() + (this.f44221a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.f44221a + ", extras=" + this.f44222b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f44221a);
        Map map = this.f44222b;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }

    public b(String str, Map map) {
        this.f44221a = str;
        this.f44222b = map;
    }
}
