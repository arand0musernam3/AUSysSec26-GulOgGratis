package c5;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.inputmethodservice.InputMethodService;
import android.os.Binder;
import android.os.Build;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class[] f7160a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final a2 a(View view) {
        Context context = view.getContext();
        Context baseContext = context;
        while (baseContext instanceof ContextWrapper) {
            if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService) || (baseContext instanceof Application)) {
                break;
            }
            ContextWrapper contextWrapper = (ContextWrapper) baseContext;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            baseContext = contextWrapper.getBaseContext();
        }
        baseContext = null;
        if (baseContext == null) {
            Configuration configuration = context.getResources().getConfiguration();
            z5.e eVarD = xz.b.d(context);
            long jE = zz.f.e(configuration.screenWidthDp, configuration.screenHeightDp);
            long jX0 = eVarD.x0(jE);
            return new a2((((long) ((int) Float.intBitsToFloat((int) (jX0 & 4294967295L)))) & 4294967295L) | (((long) ((int) Float.intBitsToFloat((int) (jX0 >> 32)))) << 32), jE);
        }
        cb.k.f7883a.getClass();
        cb.j jVar = cb.j.f7881a;
        cb.l lVar = cb.j.f7882b;
        lVar.getClass();
        ContextWrapper contextWrapper2 = (ContextWrapper) baseContext;
        int i11 = Build.VERSION.SDK_INT;
        ab.b bVar = (i11 >= 34 ? gb.f.f20350c : i11 >= 30 ? gb.d.f20348c : gb.c.f20345g).b(contextWrapper2, lVar.f7884b).f7879a;
        long jHeight = (4294967295L & ((long) bVar.c().height())) | (((long) bVar.c().width()) << 32);
        return new a2(jHeight, xz.b.d(baseContext).m(b0.z.z(jHeight)));
    }

    public static final boolean b(Object obj) {
        if (obj instanceof z3.p) {
            z3.p pVar = (z3.p) obj;
            if (pVar.c() == m3.f.f29272d || pVar.c() == m3.f.f29275g || pVar.c() == m3.f.f29273e) {
                Object value = pVar.getValue();
                if (value == null) {
                    return true;
                }
                return b(value);
            }
        } else {
            if ((obj instanceof u70.f) && (obj instanceof Serializable)) {
                return false;
            }
            for (int i11 = 0; i11 < 7; i11++) {
                if (f7160a[i11].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean c() {
        try {
            if (y.Q1 == null) {
                y.Q1 = Class.forName("android.os.SystemProperties");
            }
            if (y.R1 == null) {
                Class cls = y.Q1;
                y.R1 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
            }
            Method method = y.R1;
            Object objInvoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return Intrinsics.areEqual(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final m5.q0 d(j5.n nVar) {
        Function1 function1;
        ArrayList arrayList = new ArrayList();
        j5.a aVar = (j5.a) j5.w.d(nVar, j5.m.f24657a);
        if (aVar == null || (function1 = (Function1) aVar.f24610b) == null || !((Boolean) function1.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (m5.q0) arrayList.get(0);
    }

    public static final boolean e(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f11 = fArr[0];
        float f12 = fArr[1];
        float f13 = fArr[2];
        float f14 = fArr[3];
        float f15 = fArr[4];
        float f16 = fArr[5];
        float f17 = fArr[6];
        float f18 = fArr[7];
        float f19 = fArr[8];
        float f20 = fArr[9];
        float f21 = fArr[10];
        float f22 = fArr[11];
        float f23 = fArr[12];
        float f24 = fArr[13];
        float f25 = fArr[14];
        float f26 = fArr[15];
        float f27 = (f11 * f16) - (f12 * f15);
        float f28 = (f11 * f17) - (f13 * f15);
        float f29 = (f11 * f18) - (f14 * f15);
        float f31 = (f12 * f17) - (f13 * f16);
        float f32 = (f12 * f18) - (f14 * f16);
        float f33 = (f13 * f18) - (f14 * f17);
        float f34 = (f19 * f24) - (f20 * f23);
        float f35 = (f19 * f25) - (f21 * f23);
        float f36 = (f19 * f26) - (f22 * f23);
        float f37 = (f20 * f25) - (f21 * f24);
        float f38 = (f20 * f26) - (f22 * f24);
        float f39 = (f21 * f26) - (f22 * f25);
        float f40 = (f33 * f34) + (((f31 * f36) + ((f29 * f37) + ((f27 * f39) - (f28 * f38)))) - (f32 * f35));
        if (f40 != 0.0f) {
            float f41 = 1.0f / f40;
            fArr2[0] = ((f18 * f37) + ((f16 * f39) - (f17 * f38))) * f41;
            fArr2[1] = (((f13 * f38) + ((-f12) * f39)) - (f14 * f37)) * f41;
            fArr2[2] = ((f26 * f31) + ((f24 * f33) - (f25 * f32))) * f41;
            fArr2[3] = (((f21 * f32) + ((-f20) * f33)) - (f22 * f31)) * f41;
            float f42 = -f15;
            fArr2[4] = (((f17 * f36) + (f42 * f39)) - (f18 * f35)) * f41;
            fArr2[5] = ((f14 * f35) + ((f39 * f11) - (f13 * f36))) * f41;
            float f43 = -f23;
            fArr2[6] = (((f25 * f29) + (f43 * f33)) - (f26 * f28)) * f41;
            fArr2[7] = ((f22 * f28) + ((f33 * f19) - (f21 * f29))) * f41;
            fArr2[8] = ((f18 * f34) + ((f15 * f38) - (f16 * f36))) * f41;
            fArr2[9] = (((f36 * f12) + ((-f11) * f38)) - (f14 * f34)) * f41;
            fArr2[10] = ((f26 * f27) + ((f23 * f32) - (f24 * f29))) * f41;
            fArr2[11] = (((f29 * f20) + ((-f19) * f32)) - (f22 * f27)) * f41;
            fArr2[12] = (((f16 * f35) + (f42 * f37)) - (f17 * f34)) * f41;
            fArr2[13] = ((f13 * f34) + ((f11 * f37) - (f12 * f35))) * f41;
            fArr2[14] = (((f24 * f28) + (f43 * f31)) - (f25 * f27)) * f41;
            fArr2[15] = ((f21 * f27) + ((f19 * f31) - (f20 * f28))) * f41;
        }
        return !(f40 == 0.0f);
    }

    public static final boolean f(float f11, float f12, i4.h hVar) {
        h4.c cVar = new h4.c(f11 - 0.005f, f12 - 0.005f, f11 + 0.005f, f12 + 0.005f);
        i4.h hVarA = i4.l.a();
        i4.h.b(hVarA, cVar);
        i4.h hVarA2 = i4.l.a();
        hVarA2.g(hVar, hVarA, 1);
        boolean zIsEmpty = hVarA2.f23258a.isEmpty();
        hVarA2.h();
        hVarA.h();
        return !zIsEmpty;
    }

    public static final boolean g(float f11, float f12, float f13, float f14, long j9) {
        float f15 = f11 - f13;
        float f16 = f12 - f14;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
        return ((f16 * f16) / (fIntBitsToFloat2 * fIntBitsToFloat2)) + ((f15 * f15) / (fIntBitsToFloat * fIntBitsToFloat)) <= 1.0f;
    }

    public static final c6.j h(i1 i1Var, int i11) {
        Object next;
        Iterator<T> it = i1Var.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((b5.m0) ((Map.Entry) next).getKey()).f5866b == i11) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (c6.j) entry.getValue();
        }
        return null;
    }

    public static final String i(Object obj) {
        String name = obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(name);
        sb2.append('@');
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        sb2.append(String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1)));
        return sb2.toString();
    }

    public static final b4.t j(b4.t tVar, String str) {
        return tVar.then(new g3(str));
    }

    public static final String k(int i11) {
        if (i11 == 0) {
            return "android.widget.Button";
        }
        if (i11 == 1) {
            return "android.widget.CheckBox";
        }
        if (i11 == 3) {
            return "android.widget.RadioButton";
        }
        if (i11 == 5) {
            return "android.widget.ImageView";
        }
        if (i11 == 6) {
            return "android.widget.Spinner";
        }
        if (i11 == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}
