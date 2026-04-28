package lx;

import a3.e2;
import a3.l3;
import a3.m3;
import a3.n3;
import a3.r2;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.UserManager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.OnBackPressedDispatcher;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.lifecycle.LifecycleOwner;
import androidx.work.WorkerParameters;
import bn.d0;
import bn.x;
import c5.v0;
import c5.x1;
import com.app.tgtg.R;
import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.remote.item.ItemTag;
import com.app.tgtg.model.remote.item.ItemTagInfo;
import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.item.response.ItemType;
import com.app.tgtg.model.remote.manufacturer.response.BasketItem;
import com.app.tgtg.model.remote.manufacturer.response.Brand;
import com.app.tgtg.model.remote.manufacturer.response.CateringProperties;
import com.app.tgtg.model.remote.manufacturer.response.ManufacturerItemProperties;
import com.app.tgtg.model.remote.payment.Price;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.n1;
import g3.r9;
import g3.s0;
import g3.s5;
import i4.g0;
import ib.l0;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import lv.v;
import m2.a2;
import m2.e1;
import m2.l1;
import m3.b1;
import m3.d3;
import m3.v1;
import m3.w1;
import m5.t0;
import mv.j0;
import mv.r0;
import o00.x0;
import o30.e0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import t1.h1;
import t1.w;
import u70.b0;
import u70.c0;
import u70.y;
import u70.z;
import w.a0;
import w4.h0;
import z4.c1;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f28423a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f28424b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f28425c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f28426d = 0;

    public static boolean B(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final boolean C(long j9, long j11) {
        return j9 == j11;
    }

    public static final int D(q5.r rVar, int i11) {
        boolean z11 = rVar.compareTo(q5.r.f36039d) >= 0;
        boolean z12 = i11 == 1;
        if (z12 && z11) {
            return 3;
        }
        if (z11) {
            return 1;
        }
        return z12 ? 2 : 0;
    }

    public static final Class E(String str) {
        if (yx.a.f46339a.contains(u.class)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th2) {
            yx.a.a(u.class, th2);
            return null;
        }
    }

    public static final Method F(Class cls, String str, Class... clsArr) {
        if (!yx.a.f46339a.contains(u.class)) {
            try {
                return cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
            } catch (Throwable th2) {
                yx.a.a(u.class, th2);
            }
        }
        return null;
    }

    public static final Method G(Class cls, String str, Class... clsArr) {
        if (!yx.a.f46339a.contains(u.class)) {
            try {
                return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            } catch (NoSuchMethodException unused) {
            } catch (Throwable th2) {
                yx.a.a(u.class, th2);
            }
        }
        return null;
    }

    public static final td.t H(View view) {
        td.t tVar;
        Object tag = view.getTag(R.id.coil3_request_manager);
        td.t tVar2 = tag instanceof td.t ? (td.t) tag : null;
        if (tVar2 != null) {
            return tVar2;
        }
        synchronized (view) {
            try {
                Object tag2 = view.getTag(R.id.coil3_request_manager);
                tVar = tag2 instanceof td.t ? (td.t) tag2 : null;
                if (tVar == null) {
                    tVar = new td.t();
                    view.addOnAttachStateChangeListener(tVar);
                    view.setTag(R.id.coil3_request_manager, tVar);
                }
            } finally {
            }
        }
        return tVar;
    }

    public static final Object I(Class cls, Object obj, Method method, Object... objArr) {
        if (!yx.a.f46339a.contains(u.class)) {
            try {
                cls.getClass();
                method.getClass();
                if (obj != null) {
                    obj = cls.cast(obj);
                }
                try {
                    return method.invoke(obj, Arrays.copyOf(objArr, objArr.length));
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            } catch (Throwable th2) {
                yx.a.a(u.class, th2);
                return null;
            }
        }
        return null;
    }

    public static boolean J(String str, double d3) {
        int i11;
        int iRotateLeft;
        str.getClass();
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        int length = bytes.length;
        if (length >= 16) {
            y yVar = z.f40865b;
            int iN0 = 606290984;
            int iN02 = 1640531535;
            i11 = 0;
            int iN03 = 0;
            int iN04 = -2048144777;
            while (i11 <= length - 16) {
                iN0 = m0.c.n0(iN0, m0.c.m0(i11, bytes));
                iN04 = m0.c.n0(iN04, m0.c.m0(i11 + 4, bytes));
                iN03 = m0.c.n0(iN03, m0.c.m0(i11 + 8, bytes));
                iN02 = m0.c.n0(iN02, m0.c.m0(i11 + 12, bytes));
                i11 += 16;
            }
            iRotateLeft = Integer.rotateLeft(iN02, 18) + Integer.rotateLeft(iN03, 12) + Integer.rotateLeft(iN04, 7) + Integer.rotateLeft(iN0, 1);
        } else {
            y yVar2 = z.f40865b;
            i11 = 0;
            iRotateLeft = 374761393;
        }
        y yVar3 = z.f40865b;
        int iRotateLeft2 = iRotateLeft + length;
        while (i11 <= length - 4) {
            iRotateLeft2 = 668265263 * Integer.rotateLeft((m0.c.m0(i11, bytes) * (-1028477379)) + iRotateLeft2, 17);
            i11 += 4;
        }
        while (i11 < length) {
            iRotateLeft2 = (-1640531535) * Integer.rotateLeft(((bytes[i11] & 255) * 374761393) + iRotateLeft2, 11);
            i11++;
        }
        int i12 = ((iRotateLeft2 >>> 15) ^ iRotateLeft2) * (-2048144777);
        int i13 = (i12 ^ (i12 >>> 13)) * (-1028477379);
        long j9 = ((long) (i13 ^ (i13 >>> 16))) & 4294967295L;
        b0 b0Var = c0.f40833b;
        return bx.o.R(Long.remainderUnsigned(j9 * 31, 1000000L)) / 1000000.0d < d3;
    }

    public static boolean K(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    public static List L(List list) {
        return list instanceof k30.h ? ((k30.h) list).o() : list instanceof k30.t ? ((k30.t) list).f25924a : list instanceof RandomAccess ? new k30.r(list) : new k30.t(list);
    }

    public static void M(ie.a aVar, x6.a aVar2) {
        if (Build.VERSION.SDK_INT >= 29) {
            b6.a.t(aVar, aVar2 != null ? b6.a.r(aVar2) : null);
        } else if (aVar2 == null) {
            aVar.setXfermode(null);
        } else {
            PorterDuff.Mode modeK = jf.e.K(aVar2);
            aVar.setXfermode(modeK != null ? new PorterDuffXfermode(modeK) : null);
        }
    }

    public static void N(ViewGroup viewGroup, float f11) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof n20.j) {
            ((n20.j) background).s(f11);
        }
    }

    public static void O(androidx.constraintlayout.widget.b bVar, View view, float[] fArr) {
        Class<?> cls = view.getClass();
        String str = "set" + bVar.f2352b;
        try {
            int i11 = p6.a.f34496a[bVar.f2353c.ordinal()];
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            boolean z11 = true;
            switch (i11) {
                case 1:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 2:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 3:
                    Method method = cls.getMethod(str, Drawable.class);
                    int iW = (w((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (w((int) (fArr[3] * 255.0f)) << 24) | (w((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | w((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(iW);
                    method.invoke(view, colorDrawable);
                    return;
                case 4:
                    cls.getMethod(str, cls2).invoke(view, Integer.valueOf((w((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (w((int) (fArr[3] * 255.0f)) << 24) | (w((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | w((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 5:
                    throw new RuntimeException("unable to interpolate strings " + bVar.f2352b);
                case 6:
                    Method method2 = cls.getMethod(str, Boolean.TYPE);
                    if (fArr[0] <= 0.5f) {
                        z11 = false;
                    }
                    method2.invoke(view, Boolean.valueOf(z11));
                    return;
                case 7:
                    cls.getMethod(str, cls3).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e5) {
            StringBuilder sbS = e0.f.s("Cannot access method ", str, " on View \"");
            sbS.append(x0.w(view));
            sbS.append("\"");
            Log.e("CustomSupport", sbS.toString(), e5);
        } catch (NoSuchMethodException e11) {
            StringBuilder sbS2 = e0.f.s("No method ", str, " on View \"");
            sbS2.append(x0.w(view));
            sbS2.append("\"");
            Log.e("CustomSupport", sbS2.toString(), e11);
        } catch (InvocationTargetException e12) {
            StringBuilder sbS3 = e0.f.s("Cannot invoke method ", str, " on View \"");
            sbS3.append(x0.w(view));
            sbS3.append("\"");
            Log.e("CustomSupport", sbS3.toString(), e12);
        }
    }

    public static void P(View view, n20.j jVar) {
        a20.a aVar = jVar.f30345b.f30320c;
        if (aVar == null || !aVar.f237a) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        n20.h hVar = jVar.f30345b;
        if (hVar.f30329m != elevation) {
            hVar.f30329m = elevation;
            jVar.E();
        }
    }

    public static void Q(ViewGroup viewGroup) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof n20.j) {
            P(viewGroup, (n20.j) background);
        }
    }

    public static String R(long j9) {
        int i11 = (int) (j9 >> 32);
        int i12 = (int) (j9 & 4294967295L);
        if (Float.intBitsToFloat(i11) == Float.intBitsToFloat(i12)) {
            return "CornerRadius.circular(" + m0.c.q0(Float.intBitsToFloat(i11)) + ')';
        }
        return "CornerRadius.elliptical(" + m0.c.q0(Float.intBitsToFloat(i11)) + ", " + m0.c.q0(Float.intBitsToFloat(i12)) + ')';
    }

    public static void S(Parcel parcel, int i11, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iH0 = h0(i11, parcel);
        parcel.writeBundle(bundle);
        i0(iH0, parcel);
    }

    public static void T(Parcel parcel, int i11, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int iH0 = h0(i11, parcel);
        parcel.writeByteArray(bArr);
        i0(iH0, parcel);
    }

    public static void U(Parcel parcel, int i11, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int iH0 = h0(i11, parcel);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        i0(iH0, parcel);
    }

    public static void V(Parcel parcel, int i11, Float f11) {
        if (f11 == null) {
            return;
        }
        g0(parcel, i11, 4);
        parcel.writeFloat(f11.floatValue());
    }

    public static void W(Parcel parcel, int i11, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iH0 = h0(i11, parcel);
        parcel.writeStrongBinder(iBinder);
        i0(iH0, parcel);
    }

    public static void X(Parcel parcel, int i11, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int iH0 = h0(i11, parcel);
        parcel.writeIntArray(iArr);
        i0(iH0, parcel);
    }

    public static void Y(Parcel parcel, int i11, List list) {
        if (list == null) {
            return;
        }
        int iH0 = h0(i11, parcel);
        int size = list.size();
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            parcel.writeInt(((Integer) list.get(i12)).intValue());
        }
        i0(iH0, parcel);
    }

    public static void Z(Parcel parcel, int i11, Integer num) {
        if (num == null) {
            return;
        }
        g0(parcel, i11, 4);
        parcel.writeInt(num.intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(cn.a r23, kotlin.jvm.functions.Function2 r24, kotlin.jvm.functions.Function2 r25, kotlin.jvm.functions.Function2 r26, m3.n r27, int r28) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lx.u.a(cn.a, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, m3.n, int):void");
    }

    public static void a0(Parcel parcel, int i11, Parcelable parcelable, int i12) {
        if (parcelable == null) {
            return;
        }
        int iH0 = h0(i11, parcel);
        parcelable.writeToParcel(parcel, i12);
        i0(iH0, parcel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(int i11, int i12, int i13, BasketManager basketManager, BasketItem basketItem, Function1 function1, m3.n nVar, b1 b1Var) {
        b1 b1Var2;
        int i14;
        Function1 function12;
        m3.f fVar;
        b4.k kVar;
        b5.g gVar;
        b5.g gVar2;
        b4.q qVar;
        d2.u uVar;
        b5.h hVar;
        b5.d dVar;
        b5.g gVar3;
        boolean z11;
        boolean z12;
        b4.k kVar2 = b4.d.f5687e;
        b4.k kVar3 = b4.d.f5683a;
        basketManager.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1985475996);
        if ((i13 & 6) == 0) {
            b1Var2 = b1Var;
            i14 = (sVar.f(b1Var2) ? 4 : 2) | i13;
        } else {
            b1Var2 = b1Var;
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= sVar.d(i11) ? 32 : 16;
        }
        if ((i13 & MLKEMEngine.KyberPolyBytes) == 0) {
            i14 |= sVar.h(basketItem) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= sVar.h(basketManager) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i13 & 24576) == 0) {
            i14 |= sVar.d(i12) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i13) == 0) {
            i14 |= sVar.h(function1) ? 131072 : 65536;
        }
        int i15 = i14;
        if (sVar.R(i15 & 1, (i15 & 74899) != 74898)) {
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.q qVar2 = b4.q.f5711a;
            b4.t tVarC = b4.a.c(qVar2, sVar);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            b5.g gVar4 = b5.i.f5843f;
            m3.i.C(i2VarA, gVar4, sVar);
            b5.g gVar5 = b5.i.f5842e;
            m3.i.C(iVarL, gVar5, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar6 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar6);
            b5.d dVar2 = b5.i.f5845h;
            m3.i.z(sVar, dVar2);
            b5.g gVar7 = b5.i.f5841d;
            m3.i.C(tVarC, gVar7, sVar);
            boolean zBooleanValue = ((Boolean) b1Var2.getValue()).booleanValue();
            d2.u uVar2 = d2.u.f13938a;
            m3.f fVar2 = m3.m.f29332a;
            if (zBooleanValue) {
                sVar.a0(1234648739);
                b4.t tVarM = m2.m(qVar2, 36);
                boolean z13 = i11 > 0;
                boolean z14 = ((i15 & 112) == 32) | ((i15 & 458752) == 131072);
                Object objM = sVar.M();
                if (z14 || objM == fVar2) {
                    objM = new lp.s(i11, function1);
                    sVar.k0(objM);
                }
                b4.t tVarC2 = androidx.compose.foundation.b.c(tVarM, z13, null, null, (Function0) objM, 14);
                u0 u0VarD = d2.p.d(kVar3, false);
                fVar = fVar2;
                kVar = kVar3;
                int iHashCode2 = Long.hashCode(sVar.T);
                u3.i iVarL2 = sVar.l();
                b4.t tVarC3 = b4.a.c(tVarC2, sVar);
                sVar.e0();
                if (sVar.S) {
                    sVar.k(hVar2);
                } else {
                    sVar.n0();
                }
                m3.i.C(u0VarD, gVar4, sVar);
                m3.i.C(iVarL2, gVar5, sVar);
                a0.y(iHashCode2, sVar, gVar6, sVar, dVar2);
                m3.i.C(tVarC3, gVar7, sVar);
                gVar2 = gVar6;
                dVar = dVar2;
                qVar = qVar2;
                uVar = uVar2;
                gVar = gVar5;
                gVar3 = gVar4;
                hVar = hVar2;
                v1.n.d(x0.z(R.drawable.quantity_remove, sVar, 0), f0.U(sVar, R.string.voice_over_quantity_selector_minus), uVar2.a(m2.m(qVar2, 20), kVar2), null, null, 0.0f, new i4.o(lv.s.C, 5), sVar, 1572872, 56);
                d2.c.f(m2.m(qVar, lv.t.f28249c), sVar);
                sVar.q(true);
                z11 = false;
                sVar.q(false);
            } else {
                fVar = fVar2;
                kVar = kVar3;
                gVar = gVar5;
                gVar2 = gVar6;
                qVar = qVar2;
                uVar = uVar2;
                hVar = hVar2;
                dVar = dVar2;
                gVar3 = gVar4;
                z11 = false;
                sVar.a0(1235539586);
                sVar.q(false);
            }
            float f11 = 36;
            b4.t tVarM2 = m2.m(qVar, f11);
            b4.k kVar4 = kVar;
            u0 u0VarD2 = d2.p.d(kVar4, z11);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            b4.t tVarC4 = b4.a.c(tVarM2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD2, gVar3, sVar);
            m3.i.C(iVarL3, gVar, sVar);
            b5.d dVar3 = dVar;
            a0.y(iHashCode3, sVar, gVar2, sVar, dVar3);
            m3.i.C(tVarC4, gVar7, sVar);
            boolean z15 = z11;
            d2.u uVar3 = uVar;
            b5.g gVar8 = gVar;
            r9.d(String.valueOf(i11), uVar.a(qVar, kVar2), lv.s.f28217b, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 1, 0, null, v.f28277q, sVar, MLKEMEngine.KyberPolyBytes, 12607488, 113656);
            sVar = sVar;
            sVar.q(true);
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar.a0(1235991411);
                boolean z16 = i12 - basketManager.getTotalBasketItems() > 0 ? true : z15 ? 1 : 0;
                boolean z17 = i11 < basketItem.getMaxAvailableQuantity() ? true : z15 ? 1 : 0;
                d2.c.f(m2.m(qVar, lv.t.f28249c), sVar);
                b4.t tVarM3 = m2.m(qVar, f11);
                boolean z18 = (sVar.g(z16) ? 1 : 0) | ((i15 & 458752) == 131072 ? (char) 1 : z15 ? 1 : 0);
                Object objM2 = sVar.M();
                if (z18 != 0 || objM2 == fVar) {
                    function12 = function1;
                    objM2 = new g3.b0(function12, z16);
                    sVar.k0(objM2);
                } else {
                    function12 = function1;
                }
                b4.t tVarC5 = androidx.compose.foundation.b.c(tVarM3, z17, null, null, (Function0) objM2, 14);
                u0 u0VarD3 = d2.p.d(kVar4, z15);
                int iHashCode4 = Long.hashCode(sVar.T);
                u3.i iVarL4 = sVar.l();
                b4.t tVarC6 = b4.a.c(tVarC5, sVar);
                sVar.e0();
                if (sVar.S) {
                    sVar.k(hVar);
                } else {
                    sVar.n0();
                }
                m3.i.C(u0VarD3, gVar3, sVar);
                m3.i.C(iVarL4, gVar8, sVar);
                a0.y(iHashCode4, sVar, gVar2, sVar, dVar3);
                m3.i.C(tVarC6, gVar7, sVar);
                v1.n.d(x0.z(R.drawable.quantity_add, sVar, z15 ? 1 : 0), f0.U(sVar, R.string.voice_over_quantity_selector_plus), uVar3.a(m2.m(qVar, 20), kVar2), null, null, 0.0f, new i4.o(z17 ? lv.s.C : lv.s.G, 5), sVar, 8, 56);
                z12 = true;
                sVar.q(true);
                sVar.q(z15);
            } else {
                function12 = function1;
                z12 = true;
                sVar.a0(1237205154);
                sVar.q(z15);
            }
            sVar.q(z12);
        } else {
            function12 = function1;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new j1.f(i11, i12, i13, basketManager, basketItem, function12, b1Var);
        }
    }

    public static void b0(String str, Parcel parcel, int i11) {
        if (str == null) {
            return;
        }
        int iH0 = h0(i11, parcel);
        parcel.writeString(str);
        i0(iH0, parcel);
    }

    public static final void c(int i11, int i12, int i13, BasketManager basketManager, BasketItem basketItem, Function1 function1, m3.n nVar, b1 b1Var) {
        basketManager.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-422798611);
        int i14 = i13 | (sVar.h(basketItem) ? 4 : 2) | (sVar.h(basketManager) ? 32 : 16) | (sVar.d(i11) ? 256 : 128) | (sVar.d(i12) ? NewHope.SENDB_BYTES : 1024) | (sVar.h(function1) ? 1048576 : 524288);
        if (sVar.R(i14 & 1, (599187 & i14) != 599186)) {
            b4.k kVar = b4.d.f5683a;
            u0 u0VarD = d2.p.d(kVar, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.q qVar = b4.q.f5711a;
            b4.t tVarC = b4.a.c(qVar, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(u0VarD, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            float f11 = 8;
            b4.t tVarJ = v1.n.j(f4.g.b(b4.a.a(s1.b0.a(qVar, t1.c.k(300, 0, w.f39594b, 2), 2), c5.m2.f7291a, new rk.c0(b1Var, function1)), l2.g.b(f11)), ((Boolean) b1Var.getValue()).booleanValue() ? lv.s.I : lv.s.J, g0.f23254b);
            v1.a0 a0VarB = v1.n.b(1, lv.s.H);
            b4.t tVarL = v1.n.l(tVarJ, a0VarB.f41677a, a0VarB.f41678b, l2.g.b(f11));
            u0 u0VarD2 = d2.p.d(kVar, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarL, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD2, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            boolean z11 = (i14 & 3670016) == 1048576;
            Object objM = sVar.M();
            if (z11 || objM == m3.m.f29332a) {
                objM = new h1(function1, 5);
                sVar.k0(objM);
            }
            int i15 = i14 << 6;
            b(i12, i11, ((i14 >> 6) & 112) | 6 | (i15 & 896) | (i15 & 7168) | (i15 & 57344), basketManager, basketItem, (Function1) objM, sVar, b1Var);
            sVar.q(true);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new d60.b(i11, i12, i13, basketManager, basketItem, function1, b1Var);
        }
    }

    public static void c0(Parcel parcel, int i11, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int iH0 = h0(i11, parcel);
        parcel.writeStringArray(strArr);
        i0(iH0, parcel);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(com.app.tgtg.model.remote.item.response.HighlightedItemCardsCarouselMnuV2 r21, long r22, long r24, ym.y r26, m3.n r27, int r28) {
        /*
            Method dump skipped, instruction units count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lx.u.d(com.app.tgtg.model.remote.item.response.HighlightedItemCardsCarouselMnuV2, long, long, ym.y, m3.n, int):void");
    }

    public static void d0(Parcel parcel, int i11, List list) {
        if (list == null) {
            return;
        }
        int iH0 = h0(i11, parcel);
        parcel.writeStringList(list);
        i0(iH0, parcel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v33, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v34, types: [java.util.List] */
    public static final void e(BaseItemMnuV2 baseItemMnuV2, m3.n nVar, int i11) {
        Brand brand;
        Picture brandLogo;
        String currentUrl;
        String str;
        d2.u uVar;
        CateringProperties cateringProperties;
        Picture storeLogo;
        ?? arrayList;
        b4.k kVar = b4.d.f5683a;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(672503346);
        int i12 = (sVar.h(baseItemMnuV2) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            float f11 = lv.t.f28249c;
            b4.q qVar = b4.q.f5711a;
            b4.t tVarZ = d2.c.z(qVar, f11);
            u0 u0VarD = d2.p.d(kVar, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarZ, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            float f12 = 8;
            b4.t tVarA = f4.g.a(f4.g.b(m2.d(m2.e(qVar, 160), 1.0f), l2.g.b(f12)), e0.A(baseItemMnuV2) ? 1.0f : 0.4f);
            Picture coverPicture = baseItemMnuV2.getCoverPicture();
            String currentUrl2 = coverPicture != null ? coverPicture.getCurrentUrl() : null;
            c1 c1Var = z4.l.f47166a;
            gd.o.a(currentUrl2, null, tVarA, c1Var, sVar, 1572912, 0, 1976);
            List<ItemTagInfo> tags = baseItemMnuV2.getTags();
            d2.u uVar2 = d2.u.f13938a;
            if (tags == null || tags.isEmpty()) {
                sVar.a0(-1520818678);
                sVar.q(false);
            } else {
                sVar.a0(-1521303022);
                List<ItemTagInfo> tags2 = baseItemMnuV2.getTags();
                if (tags2 == null || !tags2.isEmpty()) {
                    Iterator it = tags2.iterator();
                    while (it.hasNext()) {
                        if (((ItemTagInfo) it.next()).getId() == ItemTag.FREE_DELIVERY) {
                            List<ItemTagInfo> tags3 = baseItemMnuV2.getTags();
                            arrayList = new ArrayList();
                            for (Object obj : tags3) {
                                if (((ItemTagInfo) obj).getId() != ItemTag.FREE_DELIVERY) {
                                    arrayList.add(obj);
                                }
                            }
                            b4.t tVarD = b4.a.d(uVar2.a(qVar, kVar), 1.0f);
                            float f13 = lv.t.f28251e;
                            bg.m.d(d2.c.v(tVarD, f13, f13), arrayList, null, sVar, 0, 4);
                            sVar = sVar;
                            sVar.q(false);
                        }
                    }
                    arrayList = baseItemMnuV2.getTags();
                    b4.t tVarD2 = b4.a.d(uVar2.a(qVar, kVar), 1.0f);
                    float f132 = lv.t.f28251e;
                    bg.m.d(d2.c.v(tVarD2, f132, f132), arrayList, null, sVar, 0, 4);
                    sVar = sVar;
                    sVar.q(false);
                } else {
                    arrayList = baseItemMnuV2.getTags();
                    b4.t tVarD22 = b4.a.d(uVar2.a(qVar, kVar), 1.0f);
                    float f1322 = lv.t.f28251e;
                    bg.m.d(d2.c.v(tVarD22, f1322, f1322), arrayList, null, sVar, 0, 4);
                    sVar = sVar;
                    sVar.q(false);
                }
            }
            int i13 = d0.$EnumSwitchMapping$0[baseItemMnuV2.getItemType().ordinal()];
            if (i13 != 1) {
                if (i13 == 2 && (cateringProperties = baseItemMnuV2.getCateringProperties()) != null && (storeLogo = cateringProperties.getStoreLogo()) != null) {
                    currentUrl = storeLogo.getCurrentUrl();
                    str = currentUrl;
                }
                str = null;
            } else {
                ManufacturerItemProperties manufacturerItemProperties = baseItemMnuV2.getManufacturerItemProperties();
                if (manufacturerItemProperties != null && (brand = manufacturerItemProperties.getBrand()) != null && (brandLogo = brand.getBrandLogo()) != null) {
                    currentUrl = brandLogo.getCurrentUrl();
                    str = currentUrl;
                }
                str = null;
            }
            long j9 = e0.A(baseItemMnuV2) ? lv.s.C : lv.s.D;
            float f14 = e0.A(baseItemMnuV2) ? 1.0f : 0.5f;
            if (str == null) {
                sVar.a0(-1520362390);
                sVar.q(false);
                uVar = uVar2;
            } else {
                sVar.a0(-1520362389);
                b4.t tVarM = m2.m(qVar, 48);
                float f15 = lv.t.f28251e;
                b4.t tVarA2 = uVar2.a(d2.c.v(tVarM, f15, -f15), b4.d.f5689g);
                l2.f fVar = l2.g.f26790a;
                uVar = uVar2;
                gd.o.a(str, null, f4.g.a(v1.n.k(f4.g.b(tVarA2, fVar), 1, lv.s.I, fVar), e0.A(baseItemMnuV2) ? 1.0f : 0.4f), c1Var, sVar, 1572912, 0, 1976);
                sVar.q(false);
            }
            if (baseItemMnuV2.getItemType() == ItemType.CATERING) {
                sVar.a0(-1519736623);
                Double averageOverallRating = baseItemMnuV2.getAverageOverallRating();
                String strB = averageOverallRating != null ? j0.b(Double.valueOf(averageOverallRating.doubleValue()), 1, 4) : null;
                if (strB == null) {
                    strB = "";
                }
                m3.s sVar2 = sVar;
                dx.f.d(d2.c.v(b4.a.d(uVar.a(qVar, b4.d.f5685c), 1.0f), -8, f12), strB, j9, f14, sVar2, 0);
                sVar = sVar2;
                sVar.q(false);
            } else {
                sVar.a0(-1519395158);
                sVar.q(false);
            }
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.g(baseItemMnuV2, i11, 4);
        }
    }

    public static void e0(Parcel parcel, int i11, Parcelable[] parcelableArr, int i12) {
        if (parcelableArr == null) {
            return;
        }
        int iH0 = h0(i11, parcel);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i12);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        i0(iH0, parcel);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(com.app.tgtg.model.remote.item.response.BaseItemMnuV2 r32, m3.n r33, int r34) {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lx.u.f(com.app.tgtg.model.remote.item.response.BaseItemMnuV2, m3.n, int):void");
    }

    public static void f0(Parcel parcel, int i11, List list) {
        if (list == null) {
            return;
        }
        int iH0 = h0(i11, parcel);
        int size = list.size();
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            Parcelable parcelable = (Parcelable) list.get(i12);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        i0(iH0, parcel);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(com.app.tgtg.model.remote.item.response.ItemCarouselMnu r19, long r20, long r22, ym.y r24, m3.n r25, int r26) {
        /*
            Method dump skipped, instruction units count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lx.u.g(com.app.tgtg.model.remote.item.response.ItemCarouselMnu, long, long, ym.y, m3.n, int):void");
    }

    public static void g0(Parcel parcel, int i11, int i12) {
        parcel.writeInt(i11 | (i12 << 16));
    }

    public static final void h(m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1780391534);
        if (sVar.R(i11 & 1, i11 != 0)) {
            b4.k kVar = b4.d.f5687e;
            b4.t tVarA = d2.c.A(v1.n.j(f4.g.b(b4.q.f5711a, l2.g.b(46)), lv.s.f28217b, g0.f23254b), lv.t.f28251e, lv.t.f28248b);
            u0 u0VarD = d2.p.d(kVar, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarA, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            r9.d(f0.U(sVar, R.string.catering_carousel_new_label), null, lv.s.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28277q, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new r2(i11, 20);
        }
    }

    public static int h0(int i11, Parcel parcel) {
        parcel.writeInt(i11 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static final void i(BaseItemMnuV2 baseItemMnuV2, String str, String str2, String str3, String str4, ym.y yVar, m3.n nVar, int i11) {
        int i12;
        String str5;
        String str6;
        String str7;
        baseItemMnuV2.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-547090198);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(baseItemMnuV2) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(str) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            str5 = str2;
            i12 |= sVar.f(str5) ? 256 : 128;
        } else {
            str5 = str2;
        }
        if ((i11 & 3072) == 0) {
            str6 = str3;
            i12 |= sVar.f(str6) ? NewHope.SENDB_BYTES : 1024;
        } else {
            str6 = str3;
        }
        if ((i11 & 24576) == 0) {
            str7 = str4;
            i12 |= sVar.f(str7) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        } else {
            str7 = str4;
        }
        if ((196608 & i11) == 0) {
            i12 |= (262144 & i11) == 0 ? sVar.f(yVar) : sVar.h(yVar) ? 131072 : 65536;
        }
        if (sVar.R(i12 & 1, (74899 & i12) != 74898)) {
            float f11 = lv.t.f28251e;
            b4.t tVarC = d2.c.C(b4.q.f5711a, f11, lv.t.f28249c, f11, lv.t.f28252f);
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarC, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC2, b5.i.f5841d, sVar);
            d3 d3Var = x1.f7416h;
            String str8 = str7;
            m3.i.b(new v1[]{b3.i.t(((z5.c) sVar.j(d3Var)).a(), 1.0f, d3Var), s5.f19473a.a(cg.j.t())}, u3.e.e(542046384, sVar, new bn.z(yVar, baseItemMnuV2, str, str5, str6, str8, 0)), sVar, 56);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.a0(baseItemMnuV2, str, str2, str3, str4, yVar, i11, 0);
        }
    }

    public static void i0(int i11, Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i11 - 4);
        parcel.writeInt(iDataPosition - i11);
        parcel.setDataPosition(iDataPosition);
    }

    public static final void j(BaseItemMnuV2 baseItemMnuV2, String str, ym.y yVar, m3.n nVar, int i11) {
        int i12;
        Price bottleDeposit;
        baseItemMnuV2.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1488989911);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(baseItemMnuV2) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(str) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= (i11 & 512) == 0 ? sVar.f(yVar) : sVar.h(yVar) ? 256 : 128;
        }
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            Price itemPrice = baseItemMnuV2.getItemPrice();
            String strI = null;
            String strI2 = itemPrice != null ? mv.d.i(itemPrice, 1) : null;
            Price itemValue = baseItemMnuV2.getItemValue();
            String strI3 = itemValue != null ? mv.d.i(itemValue, 1) : null;
            ManufacturerItemProperties manufacturerItemProperties = baseItemMnuV2.getManufacturerItemProperties();
            if (manufacturerItemProperties != null && (bottleDeposit = manufacturerItemProperties.getBottleDeposit()) != null) {
                strI = mv.d.i(bottleDeposit, 1);
            }
            i(baseItemMnuV2, str, strI2, strI3, strI, yVar, sVar, (i12 & 126) | ((i12 << 9) & 458752));
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.a(baseItemMnuV2, str, yVar, i11, 1);
        }
    }

    public static final void k(boolean z11, Function2 function2, m3.n nVar, int i11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-642000585);
        if ((i11 & 6) == 0) {
            i12 = (sVar.g(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function2) ? 32 : 16;
        }
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            Object objA = r9.b.a(sVar);
            if (objA == null) {
                sVar.a0(1512740606);
                objA = e.m.a(sVar);
            } else {
                sVar.a0(1512737723);
            }
            sVar.q(false);
            if (objA == null) {
                com.braze.h2.b("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean zF = sVar.f(objA);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (zF || objM == fVar) {
                q9.d dVar = objA instanceof q9.d ? (q9.d) objA : null;
                q9.c navigationEventDispatcher = dVar != null ? dVar.getNavigationEventDispatcher() : null;
                androidx.activity.f0 f0Var = objA instanceof androidx.activity.f0 ? (androidx.activity.f0) objA : null;
                objM = new f.b(navigationEventDispatcher, f0Var != null ? f0Var.getOnBackPressedDispatcher() : null);
                sVar.k0(objM);
            }
            f.b bVar = (f.b) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = m3.i.o(kotlin.coroutines.g.f26549a, sVar);
                sVar.k0(objM2);
            }
            v80.b0 b0Var = (v80.b0) objM2;
            long j9 = sVar.T;
            boolean zF2 = sVar.f(bVar) | sVar.e(j9);
            Object objM3 = sVar.M();
            if (zF2 || objM3 == fVar) {
                objM3 = new e.j(b0Var, new e.o(j9, objA));
                sVar.k0(objM3);
            }
            e.j jVar = (e.j) objM3;
            sVar.a0(-348514256);
            boolean zH = sVar.h(jVar) | sVar.h(function2);
            Object objM4 = sVar.M();
            if (zH || objM4 == fVar) {
                objM4 = new bs.b(23, jVar, function2);
                sVar.k0(objM4);
            }
            m3.i.j((Function0) objM4, sVar);
            Boolean boolValueOf = Boolean.valueOf(z11);
            int i13 = i12 & 14;
            boolean zH2 = sVar.h(jVar) | (i13 == 4);
            Object objM5 = sVar.M();
            if (zH2 || objM5 == fVar) {
                objM5 = new b0.q(jVar, z11, 3);
                sVar.k0(objM5);
            }
            w8.e.b(boolValueOf, jVar, null, (Function1) objM5, sVar, i13);
            boolean zH3 = sVar.h(bVar) | sVar.h(jVar);
            Object objM6 = sVar.M();
            if (zH3 || objM6 == fVar) {
                objM6 = new a3.p(29, bVar, jVar);
                sVar.k0(objM6);
            }
            m3.i.c(bVar, jVar, (Function1) objM6, sVar);
            sVar.q(false);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new e.p(z11, function2, i11, 0);
        }
    }

    public static final void l(BaseItemMnuV2 baseItemMnuV2, String str, String str2, String str3, String str4, m3.n nVar, int i11) {
        m3.s sVar;
        float f11;
        float f12;
        boolean z11;
        b4.q qVar;
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-276298933);
        int i12 = i11 | (sVar2.h(baseItemMnuV2) ? 4 : 2) | (sVar2.f(str) ? 32 : 16) | (sVar2.f(str2) ? 256 : 128) | (sVar2.f(str3) ? NewHope.SENDB_BYTES : 1024) | (sVar2.f(str4) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192);
        if (sVar2.R(i12 & 1, (i12 & 9363) != 9362)) {
            float f13 = lv.t.f28251e;
            b4.q qVar2 = b4.q.f5711a;
            b4.t tVarB = d2.c.B(qVar2, f13, 0.0f, 2);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar2, 48);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            b4.t tVarC = b4.a.c(tVarB, sVar2);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            m3.i.C(i2VarA, b5.i.f5843f, sVar2);
            m3.i.C(iVarL, b5.i.f5842e, sVar2);
            m3.i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar2, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar2);
            if (str4 != null) {
                sVar2.a0(-42182056);
                n(baseItemMnuV2, str, sVar2, i12 & 126);
                sVar2.q(false);
            } else {
                sVar2.a0(-42118010);
                o(baseItemMnuV2, sVar2, i12 & 14);
                sVar2.q(false);
            }
            b4.t tVarE = m2.e(qVar2, f13);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            d2.c.f(tVarE.then(new n1(1.0f, true)), sVar2);
            if (str3 == null) {
                sVar2.a0(-41909443);
                sVar2.q(false);
                sVar = sVar2;
                f11 = 1.0f;
                f12 = f13;
                z11 = false;
                qVar = qVar2;
            } else {
                sVar2.a0(-41909442);
                f11 = 1.0f;
                f12 = f13;
                z11 = false;
                qVar = qVar2;
                r9.d(str3, f4.g.a(qVar2, e0.A(baseItemMnuV2) ? 1.0f : 0.4f), lv.s.E, 0L, null, 0L, x5.l.f43855d, null, 0L, 0, false, 0, 0, null, v.f28276p, sVar2, 805306752, 12582912, 130552);
                sVar = sVar2;
                sVar.q(false);
            }
            if (str2 == null) {
                sVar.a0(-41573620);
                sVar.q(z11);
            } else {
                sVar.a0(-41573619);
                d2.c.f(m2.q(qVar, f12), sVar);
                m3.s sVar3 = sVar;
                r9.d(str2, f4.g.a(qVar, e0.A(baseItemMnuV2) ? f11 : 0.4f), e0.A(baseItemMnuV2) ? lv.s.C : lv.s.E, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.l, sVar3, 0, 12582912, 131064);
                sVar = sVar3;
                sVar.q(z11);
            }
            sVar.q(true);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ap.b(baseItemMnuV2, str, str2, str3, str4, i11, 2);
        }
    }

    public static final void m(String str, ym.y yVar, m3.n nVar, int i11) {
        int i12;
        str.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1985097885);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? sVar.f(yVar) : sVar.h(yVar) ? 32 : 16;
        }
        int i13 = 0;
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            b4.t tVarA = b4.a.a(b4.q.f5711a, c5.m2.f7291a, new bn.c0(i13, yVar, str));
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarA, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            r9.d(f0.U(sVar, R.string.discover_browse_buckets_btn), null, lv.s.f28217b, 0L, null, 0L, x5.l.f43854c, null, 0L, 0, false, 0, 0, null, v.f28281u, sVar, 805306752, 12582912, 130554);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new x(str, yVar, i11, 0);
        }
    }

    public static final void n(BaseItemMnuV2 baseItemMnuV2, String str, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1036652121);
        int i12 = (sVar.h(baseItemMnuV2) ? 4 : 2) | i11 | (sVar.f(str) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            b4.k kVar = b4.d.f5687e;
            l2.f fVarB = l2.g.b(8);
            b4.q qVar = b4.q.f5711a;
            b4.t tVarA = d2.c.A(v1.n.j(f4.g.b(qVar, fVarB), lv.s.I, g0.f23254b), lv.t.f28251e, lv.t.f28249c);
            u0 u0VarD = d2.p.d(kVar, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarA, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            r9.d(r0.f((Context) sVar.j(v0.f7390b), str), f4.g.a(qVar, e0.A(baseItemMnuV2) ? 1.0f : 0.4f), lv.s.E, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, v.f28276p, sVar, MLKEMEngine.KyberPolyBytes, 12607872, 110584);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.t(baseItemMnuV2, str, i11, 0);
        }
    }

    public static final void o(BaseItemMnuV2 baseItemMnuV2, m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(42679766);
        int i12 = (sVar.h(baseItemMnuV2) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            ManufacturerItemProperties manufacturerItemProperties = baseItemMnuV2.getManufacturerItemProperties();
            if (manufacturerItemProperties != null ? Intrinsics.areEqual(manufacturerItemProperties.getFreeDelivery(), Boolean.TRUE) : false) {
                sVar.a0(162711959);
                r9.d(f0.U(sVar, R.string.mnu_free_delivery), f4.g.a(b4.q.f5711a, e0.A(baseItemMnuV2) ? 1.0f : 0.4f), lv.s.E, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28276p, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131064);
                sVar = sVar;
                sVar.q(false);
            } else {
                sVar.a0(162953356);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.g(baseItemMnuV2, i11, 5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03c9  */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r14v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v45 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(np.b r39, boolean r40, kotlin.jvm.functions.Function0 r41, kotlin.jvm.functions.Function0 r42, kotlin.jvm.functions.Function0 r43, java.lang.String r44, m3.n r45, int r46) {
        /*
            Method dump skipped, instruction units count: 1088
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lx.u.p(np.b, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, java.lang.String, m3.n, int):void");
    }

    public static final void q(String str, String str2, String str3, Function0 function0, Function0 function02, boolean z11, m3.n nVar, int i11) {
        Function0 function03;
        function0.getClass();
        function02.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-766786553);
        int i12 = (sVar.f(str) ? 4 : 2) | i11 | (sVar.f(str2) ? 32 : 16) | (sVar.f(str3) ? 256 : 128) | (sVar.h(function0) ? NewHope.SENDB_BYTES : 1024);
        if ((i11 & 24576) == 0) {
            function03 = function02;
            i12 |= sVar.h(function03) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        } else {
            function03 = function02;
        }
        int i13 = i12 | (sVar.g(z11) ? 131072 : 65536);
        if (sVar.R(i13 & 1, (74899 & i13) != 74898)) {
            s0.b(m2.d(b4.q.f5711a, 1.0f), l2.g.b(12), s0.p(lv.s.J, sVar, 6), s0.q(2, 0.0f, 0.0f, 0.0f, 62), null, u3.e.e(-1160252935, sVar, new ho.o(function03, z11, str3, function0, str, str2)), sVar, 196614, 16);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new g3.e0(str, str2, str3, function0, function02, z11, i11);
        }
    }

    public static final void r(String str, long j9, m3.n nVar, int i11) {
        int i12;
        m3.s sVar;
        str.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-2141807311);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar2.f(str) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.e(j9) ? 32 : 16;
        }
        if (sVar2.R(i12 & 1, (i12 & 19) != 18)) {
            d2.c.f(m2.e(b4.q.f5711a, lv.t.f28249c), sVar2);
            sVar = sVar2;
            r9.d(str, null, j9, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, v.f28276p, sVar, (i12 & 14) | ((i12 << 3) & 896), 12607872, 110586);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.y(str, i11, 0, j9);
        }
    }

    public static final void s(boolean z11, x5.j jVar, l3 l3Var, m3.n nVar, int i11) {
        int i12;
        a2 a2VarD;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1344558920);
        if ((i11 & 6) == 0) {
            i12 = (sVar.g(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.d(jVar.ordinal()) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(l3Var) ? 256 : 128;
        }
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            int i13 = i12 & 14;
            boolean zF = (i13 == 4) | sVar.f(l3Var);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (zF || objM == fVar) {
                objM = new e2(l3Var, z11);
                sVar.k0(objM);
            }
            l1 l1Var = (l1) objM;
            boolean zH = sVar.h(l3Var) | (i13 == 4);
            Object objM2 = sVar.M();
            if (zH || objM2 == fVar) {
                objM2 = new n3(l3Var, z11);
                sVar.k0(objM2);
            }
            a3.t tVar = (a3.t) objM2;
            boolean zH2 = t0.h(l3Var.n().f37715b);
            int i14 = (int) (z11 ? l3Var.n().f37715b >> 32 : l3Var.n().f37715b & 4294967295L);
            e1 e1Var = l3Var.f451d;
            float fZ = (e1Var == null || (a2VarD = e1Var.d()) == null) ? 0.0f : m2.g0.z(a2VarD.f28762a, i14);
            boolean zH3 = sVar.h(l1Var);
            Object objM3 = sVar.M();
            if (zH3 || objM3 == fVar) {
                objM3 = new a3.u0(l1Var, 1);
                sVar.k0(objM3);
            }
            bx.k.i(tVar, z11, jVar, zH2, 0L, fZ, h0.a(b4.q.f5711a, l1Var, (PointerInputEventHandler) objM3), sVar, (i12 << 3) & 1008, 16);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new m3(z11, jVar, l3Var, i11, 0);
        }
    }

    public static final void t(String str, long j9, m3.n nVar, int i11) {
        int i12;
        m3.s sVar;
        str.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(517674965);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar2.f(str) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.e(j9) ? 32 : 16;
        }
        if (sVar2.R(i12 & 1, (i12 & 19) != 18)) {
            sVar = sVar2;
            r9.d(str, null, j9, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((x60.j) sVar2.j(PantryThemeKt.getLocalPantryTypography())).f43957f, sVar, (i12 & 14) | ((i12 << 3) & 896), 24960, 110586);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.y(str, i11, 1, j9);
        }
    }

    public static void u(OnBackPressedDispatcher onBackPressedDispatcher, LifecycleOwner lifecycleOwner, Function1 function1) {
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.b(new androidx.activity.e0(function1, 0), lifecycleOwner);
    }

    public static final String v(Number number, Number number2) {
        return "Random range is empty: [" + number + ", " + number2 + ").";
    }

    public static int w(int i11) {
        int i12 = (i11 & (~(i11 >> 31))) - 255;
        return (i12 & (i12 >> 31)) + 255;
    }

    public static jf.e x(int i11) {
        return i11 != 0 ? i11 != 1 ? new n20.m() : new n20.e() : new n20.m();
    }

    public static final void y(File file) throws IOException {
        file.getClass();
        if (file.exists() || file.mkdirs() || file.isDirectory()) {
            return;
        }
        i4.a.l(file, "Could not create directory at ");
    }

    public ib.v A(Context context, String str, WorkerParameters workerParameters) {
        context.getClass();
        str.getClass();
        ib.v vVarZ = z(context, str, workerParameters);
        if (vVarZ == null) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str).asSubclass(ib.v.class);
                clsAsSubclass.getClass();
                try {
                    Object objNewInstance = clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                    objNewInstance.getClass();
                    vVarZ = (ib.v) objNewInstance;
                } catch (Throwable th2) {
                    ib.w.d().c(l0.f23747a, "Could not instantiate ".concat(str), th2);
                    throw th2;
                }
            } catch (Throwable th3) {
                ib.w.d().c(l0.f23747a, "Invalid class: ".concat(str), th3);
                throw th3;
            }
        }
        if (!vVarZ.f23763d) {
            return vVarZ;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }

    public abstract ib.v z(Context context, String str, WorkerParameters workerParameters);
}
