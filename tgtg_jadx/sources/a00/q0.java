package a00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q0 extends rz.a {
    public static final Parcelable.Creator<q0> CREATOR = new p0(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k00.q0 f148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k00.q0 f149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k00.q0 f150d;

    public q0(long j9, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        com.google.android.gms.common.internal.i0.h(bArr);
        k00.q0 q0VarJ = k00.q0.j(bArr.length, bArr);
        com.google.android.gms.common.internal.i0.h(bArr2);
        k00.q0 q0VarJ2 = k00.q0.j(bArr2.length, bArr2);
        com.google.android.gms.common.internal.i0.h(bArr3);
        k00.q0 q0VarJ3 = k00.q0.j(bArr3.length, bArr3);
        this.f147a = j9;
        this.f148b = q0VarJ;
        this.f149c = q0VarJ2;
        this.f150d = q0VarJ3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return this.f147a == q0Var.f147a && com.google.android.gms.common.internal.i0.k(this.f148b, q0Var.f148b) && com.google.android.gms.common.internal.i0.k(this.f149c, q0Var.f149c) && com.google.android.gms.common.internal.i0.k(this.f150d, q0Var.f150d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f147a), this.f148b, this.f149c, this.f150d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int iH0 = lx.u.h0(20293, parcel);
        lx.u.g0(parcel, 1, 8);
        parcel.writeLong(this.f147a);
        lx.u.T(parcel, 2, this.f148b.l());
        lx.u.T(parcel, 3, this.f149c.l());
        lx.u.T(parcel, 4, this.f150d.l());
        lx.u.i0(iH0, parcel);
    }
}
