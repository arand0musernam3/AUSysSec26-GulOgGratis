package yz;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.i0;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends a30.d implements a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f46344h;

    public b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 6);
        this.f46344h = obj;
    }

    public static a U(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new f(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 3);
    }

    public static Object V(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f46344h;
        }
        IBinder iBinderAsBinder = aVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i11 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i11++;
                field = field2;
            }
        }
        if (i11 != 1) {
            int length = declaredFields.length;
            i4.a.f(e0.f.h(length, "Unexpected number of IObjectWrapper declared fields: ", new StringBuilder(String.valueOf(length).length() + 53)));
            return null;
        }
        i0.h(field);
        if (field.isAccessible()) {
            i4.a.f("IObjectWrapper declared field not private!");
            return null;
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e5) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e5);
        } catch (NullPointerException e11) {
            throw new IllegalArgumentException("Binder object is null.", e11);
        }
    }
}
