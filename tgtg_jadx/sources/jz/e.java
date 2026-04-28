package jz;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.i0;
import e10.b0;
import java.util.Arrays;
import lx.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends rz.a {

    @NonNull
    public static final Parcelable.Creator<e> CREATOR = new b0(24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f25467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f25468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f25469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f25470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f25471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f25472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f25473g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f25474h;

    public e(d dVar, a aVar, String str, boolean z11, int i11, c cVar, b bVar, boolean z12) {
        i0.h(dVar);
        this.f25467a = dVar;
        i0.h(aVar);
        this.f25468b = aVar;
        this.f25469c = str;
        this.f25470d = z11;
        this.f25471e = i11;
        this.f25472f = cVar == null ? new c(null, false, null) : cVar;
        this.f25473g = bVar == null ? new b(false, null) : bVar;
        this.f25474h = z12;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return i0.k(this.f25467a, eVar.f25467a) && i0.k(this.f25468b, eVar.f25468b) && i0.k(this.f25472f, eVar.f25472f) && i0.k(this.f25473g, eVar.f25473g) && i0.k(this.f25469c, eVar.f25469c) && this.f25470d == eVar.f25470d && this.f25471e == eVar.f25471e && this.f25474h == eVar.f25474h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f25467a, this.f25468b, this.f25472f, this.f25473g, this.f25469c, Boolean.valueOf(this.f25470d), Integer.valueOf(this.f25471e), Boolean.valueOf(this.f25474h)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = u.h0(20293, parcel);
        u.a0(parcel, 1, this.f25467a, i11);
        u.a0(parcel, 2, this.f25468b, i11);
        u.b0(this.f25469c, parcel, 3);
        u.g0(parcel, 4, 4);
        parcel.writeInt(this.f25470d ? 1 : 0);
        u.g0(parcel, 5, 4);
        parcel.writeInt(this.f25471e);
        u.a0(parcel, 6, this.f25472f, i11);
        u.a0(parcel, 7, this.f25473g, i11);
        u.g0(parcel, 8, 4);
        parcel.writeInt(this.f25474h ? 1 : 0);
        u.i0(iH0, parcel);
    }
}
