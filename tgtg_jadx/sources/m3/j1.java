package m3;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 implements Parcelable.ClassLoaderCreator {
    public static k1 a(Parcel parcel, ClassLoader classLoader) {
        f fVar;
        if (classLoader == null) {
            classLoader = j1.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i11 = parcel.readInt();
        if (i11 == 0) {
            fVar = f.f29272d;
        } else if (i11 == 1) {
            fVar = f.f29275g;
        } else {
            if (i11 != 2) {
                com.braze.h2.b(r8.k.h(i11, "Unsupported MutableState policy ", " was restored"));
                return null;
            }
            fVar = f.f29273e;
        }
        return new k1(value, fVar);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        return new k1[i11];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }
}
