package z3;

import android.os.Parcel;
import android.os.Parcelable;
import com.braze.h2;
import org.bouncycastle.iana.AEADAlgorithm;
import p.a3;
import p.p2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47054a;

    public /* synthetic */ q(int i11) {
        this.f47054a = i11;
    }

    public static r a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = q.class.getClassLoader();
        }
        int i11 = parcel.readInt();
        if (i11 == 0) {
            return new r();
        }
        q3.f fVarH = q3.i.f35977c.h();
        for (int i12 = 0; i12 < i11; i12++) {
            fVarH.add(parcel.readValue(classLoader));
        }
        return new r(fVarH.e());
    }

    public static y b(Parcel parcel, ClassLoader classLoader) {
        y yVar = new y();
        if (classLoader == null) {
            classLoader = y.class.getClassLoader();
        }
        int i11 = parcel.readInt();
        for (int i12 = 0; i12 < i11; i12++) {
            yVar.add(parcel.readValue(classLoader));
        }
        return yVar;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f47054a) {
            case 0:
                return a(parcel, null);
            case 1:
                return new androidx.fragment.app.j0(parcel, null);
            case 2:
                return new com.google.android.material.bottomsheet.d(parcel, null);
            case 3:
                return new com.google.android.material.button.d(parcel, null);
            case 4:
                return new e20.b(parcel, null);
            case 5:
                return new e20.z(parcel, null);
            case 6:
                return new h20.r(parcel, null);
            case 7:
                return new h20.w(parcel, null);
            case 8:
                return new j8.e(parcel, null);
            case 9:
                return new l20.b(parcel, null);
            case 10:
                return new l20.k(parcel, null);
            case 11:
                return new o10.f(parcel, null);
            case 12:
                return new o20.d(parcel, null);
            case 13:
                return new p2(parcel, null);
            case 14:
                return new a3(parcel, null);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new r20.a(parcel, null);
            case 16:
                return new s6.g(parcel, null);
            case 17:
                return new t20.w(parcel, null);
            case 18:
                return new ta.h(parcel, null);
            case 19:
                wa.n nVar = new wa.n(parcel, null);
                nVar.f43372a = parcel.readInt();
                nVar.f43373b = parcel.readInt();
                nVar.f43374c = parcel.readParcelable(null);
                return nVar;
            case 20:
                if (parcel.readParcelable(null) == null) {
                    return y7.b.f45417b;
                }
                h2.b("superState must be null");
                return null;
            default:
                return b(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        switch (this.f47054a) {
            case 0:
                return new r[i11];
            case 1:
                return new androidx.fragment.app.j0[i11];
            case 2:
                return new com.google.android.material.bottomsheet.d[i11];
            case 3:
                return new com.google.android.material.button.d[i11];
            case 4:
                return new e20.b[i11];
            case 5:
                return new e20.z[i11];
            case 6:
                return new h20.r[i11];
            case 7:
                return new h20.w[i11];
            case 8:
                return new j8.e[i11];
            case 9:
                return new l20.b[i11];
            case 10:
                return new l20.k[i11];
            case 11:
                return new o10.f[i11];
            case 12:
                return new o20.d[i11];
            case 13:
                return new p2[i11];
            case 14:
                return new a3[i11];
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new r20.a[i11];
            case 16:
                return new s6.g[i11];
            case 17:
                return new t20.w[i11];
            case 18:
                return new ta.h[i11];
            case 19:
                return new wa.n[i11];
            case 20:
                return new y7.b[i11];
            default:
                return new y[i11];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f47054a) {
            case 0:
                return a(parcel, classLoader);
            case 1:
                return new androidx.fragment.app.j0(parcel, classLoader);
            case 2:
                return new com.google.android.material.bottomsheet.d(parcel, classLoader);
            case 3:
                return new com.google.android.material.button.d(parcel, classLoader);
            case 4:
                return new e20.b(parcel, classLoader);
            case 5:
                return new e20.z(parcel, classLoader);
            case 6:
                return new h20.r(parcel, classLoader);
            case 7:
                return new h20.w(parcel, classLoader);
            case 8:
                return new j8.e(parcel, classLoader);
            case 9:
                return new l20.b(parcel, classLoader);
            case 10:
                return new l20.k(parcel, classLoader);
            case 11:
                return new o10.f(parcel, classLoader);
            case 12:
                return new o20.d(parcel, classLoader);
            case 13:
                return new p2(parcel, classLoader);
            case 14:
                return new a3(parcel, classLoader);
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return new r20.a(parcel, classLoader);
            case 16:
                return new s6.g(parcel, classLoader);
            case 17:
                return new t20.w(parcel, classLoader);
            case 18:
                return new ta.h(parcel, classLoader);
            case 19:
                wa.n nVar = new wa.n(parcel, classLoader);
                nVar.f43372a = parcel.readInt();
                nVar.f43373b = parcel.readInt();
                nVar.f43374c = parcel.readParcelable(classLoader);
                return nVar;
            case 20:
                if (parcel.readParcelable(classLoader) == null) {
                    return y7.b.f45417b;
                }
                h2.b("superState must be null");
                return null;
            default:
                return b(parcel, classLoader);
        }
    }
}
