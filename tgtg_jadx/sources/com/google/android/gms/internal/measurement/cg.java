package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.provider.Settings;
import android.text.Layout;
import android.util.Range;
import android.view.View;
import androidx.camera.core.internal.CameraUseCaseAdapter$CameraException;
import androidx.constraintlayout.core.parser.CLParsingException;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import b4.t;
import com.app.tgtg.R;
import com.facebook.FacebookException;
import com.google.android.gms.internal.measurement.cg;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import m3.n;
import m90.z0;
import o9.j;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class cg {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f11322b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f11323c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f11324d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f11325e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static com.google.firebase.messaging.a0 f11326f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f11327g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f11328h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11329a;

    public /* synthetic */ cg(int i11) {
        this.f11329a = i11;
    }

    public static void A(int i11, int i12) {
        if (i11 < 0 || i11 > i12) {
            org.bouncycastle.jce.provider.a.v(C(i11, i12, "index"));
        }
    }

    public static void B(int i11, int i12, int i13) {
        if (i11 < 0 || i12 < i11 || i12 > i13) {
            throw new IndexOutOfBoundsException((i11 < 0 || i11 > i13) ? C(i11, i13, "start index") : (i12 < 0 || i12 > i13) ? C(i12, i13, "end index") : o00.x0.L("end index (%s) must not be less than start index (%s)", Integer.valueOf(i12), Integer.valueOf(i11)));
        }
    }

    public static String C(int i11, int i12, String str) {
        if (i11 < 0) {
            return o00.x0.L("%s (%s) must not be negative", str, Integer.valueOf(i11));
        }
        if (i12 >= 0) {
            return o00.x0.L("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i11), Integer.valueOf(i12));
        }
        i4.a.f(e0.f.h(i12, "negative size: ", new StringBuilder(String.valueOf(i12).length() + 15)));
        return null;
    }

    public static x80.i a(int i11, x80.a aVar, Function1 function1, int i12) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        if ((i12 & 2) != 0) {
            aVar = x80.a.SUSPEND;
        }
        if ((i12 & 4) != 0) {
            function1 = null;
        }
        if (i11 == -2) {
            if (aVar != x80.a.SUSPEND) {
                return new x80.r(1, aVar, function1);
            }
            x80.m.f44075b1.getClass();
            return new x80.i(x80.l.f44074b, function1);
        }
        if (i11 != -1) {
            return i11 != 0 ? i11 != Integer.MAX_VALUE ? aVar == x80.a.SUSPEND ? new x80.i(i11, function1) : new x80.r(i11, aVar, function1) : new x80.i(Integer.MAX_VALUE, function1) : aVar == x80.a.SUSPEND ? new x80.i(0, function1) : new x80.r(1, aVar, function1);
        }
        if (aVar == x80.a.SUSPEND) {
            return new x80.r(1, x80.a.DROP_OLDEST, function1);
        }
        i4.a.f("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        return null;
    }

    public static final void b(m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1775413516);
        if (sVar.R(i11 & 1, i11 != 0)) {
            b4.q qVar = b4.q.f5711a;
            b4.t tVarD = d2.m2.d(qVar, 1.0f);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarD, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            float f11 = lv.t.f28251e;
            d2.c.f(d2.m2.m(qVar, f11), sVar);
            wi.a.k(lv.s.H, 0.0f, sVar, 6, 2);
            b3.i.y(qVar, f11, sVar, true);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cn.u(i11);
        }
    }

    public static final void c(nk.b bVar, m1.a aVar, m3.n nVar, int i11) {
        m3.s sVar;
        bVar.getClass();
        aVar.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(460735289);
        int i12 = i11 | (sVar2.f(bVar) ? 4 : 2) | (sVar2.f(aVar) ? 32 : 16);
        if (sVar2.R(i12 & 1, (i12 & 19) != 18)) {
            g3.r9.d(o30.f0.U(sVar2, R.string.dynamic_pricing_popup_title), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28271j, sVar2, 0, 12582912, 131070);
            float f11 = lv.t.f28254h;
            b4.q qVar = b4.q.f5711a;
            d2.c.f(d2.m2.e(qVar, f11), sVar2);
            v1.n.d(o00.x0.z(R.drawable.explainer_dynamic_price, sVar2, 0), null, null, null, null, 0.0f, null, sVar2, 56, 124);
            d2.c.f(d2.m2.e(qVar, lv.t.f28253g), sVar2);
            g3.r9.d(o30.f0.U(sVar2, bVar.f30976a), null, 0L, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar2, 0, 12582912, 130046);
            d2.c.f(d2.m2.e(qVar, f11), sVar2);
            boolean z11 = (i12 & 112) == 32;
            Object objM = sVar2.M();
            if (z11 || objM == m3.m.f29332a) {
                objM = new rk.a(aVar, 5);
                sVar2.k0(objM);
            }
            sVar = sVar2;
            g3.r9.d(o30.f0.U(sVar2, R.string.dynamic_pricing_popup_learn_more_link), androidx.compose.foundation.b.c(qVar, false, null, null, (Function0) objM, 15), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, m5.u0.a(lv.v.f28281u, lv.s.f28217b, 0L, q5.r.f36046k, null, 0L, x5.l.f43854c, 0, 0L, null, null, 16773114), sVar, 0, 0, 131068);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new rk.a0(bVar, aVar, i11, 9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(ArrayList arrayList, b4.t tVar, b4.f fVar, o9.j jVar, Function1 function1, Function1 function12, Function2 function2, Function0 function0, m3.n nVar, int i11) {
        int i12;
        int i13;
        o9.k kVar;
        List list;
        int i14;
        o9.j jVar2 = jVar;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1264608794);
        int i15 = (i11 & 6) == 0 ? (sVar.h(arrayList) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i15 |= sVar.f(tVar) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i15 |= sVar.f(fVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i15 |= sVar.f(jVar2) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i15 |= sVar.f(null) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            i15 |= sVar.h(null) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i15 |= sVar.h(function1) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i15 |= sVar.h(function12) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i15 |= sVar.h(function2) ? 67108864 : 33554432;
        }
        if ((805306368 & i11) == 0) {
            i15 |= sVar.h(function0) ? 536870912 : 268435456;
        }
        int i16 = 0;
        if (sVar.R(i15 & 1, (306783379 & i15) != 306783378)) {
            sVar.W();
            if ((i11 & 1) != 0 && !sVar.z()) {
                sVar.U();
            }
            sVar.r();
            if (arrayList.isEmpty()) {
                i4.a.f("NavDisplay entries cannot be empty");
                return;
            }
            int i17 = i15 >> 6;
            int i18 = (i15 & 14) | (i17 & 112) | (i17 & 896) | ((i15 >> 18) & 7168);
            m3.i.B(function0, sVar);
            sVar.a0(1721922407);
            sVar.q(false);
            m3.e0 e0Var = o9.h.f32139a;
            Object objM = sVar.M();
            m3.f fVar2 = m3.m.f29332a;
            if (objM == fVar2) {
                z3.u uVar = new z3.u();
                i12 = i15;
                i13 = 0;
                objM = new o9.g(new o9.f(uVar, i16), new u3.d(new a3.m2(uVar, 20), true, -1714993007));
                sVar.k0(objM);
            } else {
                i12 = i15;
                i13 = 0;
            }
            n9.f fVar3 = new n9.f(new m5.d0(18), u3.e.e(1077673004, sVar, new gi.b(m3.i.B(arrayList, sVar), 4)));
            n9.f[] fVarArr = new n9.f[3];
            fVarArr[i13] = null;
            fVarArr[1] = (o9.g) objM;
            fVarArr[2] = fVar3;
            ArrayList arrayListG = w0.e.G(arrayList, kotlin.collections.y.w(fVarArr), sVar, i18 & 14);
            int i19 = (((((i18 & 112) ^ 48) <= 32 || !sVar.f(jVar2)) && (i18 & 48) != 32) ? i13 : 1) | (sVar.f(arrayListG) ? 1 : 0);
            Object objM2 = sVar.M();
            if (i19 != 0 || objM2 == fVar2) {
                o9.k kVar2 = new o9.k();
                o9.d dVarCalculateScene = jVar2.calculateScene(kVar2, arrayListG);
                if (dVarCalculateScene == null) {
                    dVarCalculateScene = new o9.l(((n9.e) CollectionsKt.W(arrayListG)).f30742b, (n9.e) CollectionsKt.W(arrayListG), CollectionsKt.K(arrayListG));
                }
                o9.d[] dVarArr = new o9.d[1];
                dVarArr[i13] = dVarCalculateScene;
                ArrayList arrayListJ = kotlin.collections.d0.j(dVarArr);
                CollectionsKt.W(arrayListJ);
                List listK = CollectionsKt.K(arrayListJ);
                ArrayList arrayList2 = new ArrayList(listK.size());
                int size = listK.size();
                for (int i21 = i13; i21 < size; i21++) {
                    o9.d dVar = (o9.d) listK.get(i21);
                    dVar.getClass();
                    arrayList2.add((o9.c) dVar);
                }
                o9.d dVar2 = (o9.d) CollectionsKt.W(arrayListJ);
                o9.d[] dVarArr2 = new o9.d[1];
                dVarArr2[i13] = CollectionsKt.O(arrayListJ);
                ArrayList arrayListJ2 = kotlin.collections.d0.j(dVarArr2);
                while (true) {
                    o9.d dVar3 = (o9.d) CollectionsKt.firstOrNull(arrayListJ2);
                    List previousEntries = dVar3 != null ? dVar3.getPreviousEntries() : null;
                    if (previousEntries == null || previousEntries.isEmpty()) {
                        kVar = kVar2;
                        list = previousEntries;
                        i14 = i13;
                    } else {
                        o9.d dVarCalculateScene2 = jVar2.calculateScene(kVar2, previousEntries);
                        if (dVarCalculateScene2 == null) {
                            kVar = kVar2;
                            list = previousEntries;
                            dVarCalculateScene2 = new o9.l(((n9.e) CollectionsKt.W(previousEntries)).f30742b, (n9.e) CollectionsKt.W(previousEntries), CollectionsKt.K(list));
                        } else {
                            kVar = kVar2;
                            list = previousEntries;
                        }
                        i14 = i13;
                        arrayListJ2.add(i14, dVarCalculateScene2);
                    }
                    if (list == null || list.isEmpty()) {
                        break;
                    }
                    i13 = i14;
                    kVar2 = kVar;
                    jVar2 = jVar;
                }
                arrayListJ2.remove(dVar2);
                o9.i iVar = new o9.i(arrayListG, arrayList2, dVar2, arrayListJ2);
                sVar.k0(iVar);
                objM2 = iVar;
            } else {
                i14 = i13;
            }
            o9.i iVar2 = (o9.i) objM2;
            o9.d dVar4 = iVar2.f32142c;
            o9.e eVar = new o9.e(dVar4);
            ArrayList arrayList3 = iVar2.f32143d;
            ArrayList arrayList4 = new ArrayList(kotlin.collections.e0.o(arrayList3, 10));
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList4.add(new o9.e((o9.d) it.next()));
            }
            kotlin.collections.n0 n0Var = kotlin.collections.n0.f26529a;
            Object objM3 = sVar.M();
            if (objM3 == fVar2) {
                objM3 = new r9.d(eVar, arrayList4, n0Var);
                sVar.k0(objM3);
            }
            r9.d dVar5 = (r9.d) objM3;
            boolean zH = sVar.h(eVar) | sVar.h(arrayList4) | sVar.h(n0Var);
            Object objM4 = sVar.M();
            if (zH || objM4 == fVar2) {
                objM4 = new androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.c(20, dVar5, eVar, arrayList4, n0Var);
                sVar.k0(objM4);
            }
            m3.i.j((Function0) objM4, sVar);
            boolean z11 = !dVar4.getPreviousEntries().isEmpty();
            int i22 = (sVar.h(arrayList) ? 1 : 0) | (sVar.f(dVar4) ? 1 : 0) | ((i12 & 1879048192) != 536870912 ? i14 : 1);
            Object objM5 = sVar.M();
            if (i22 != 0 || objM5 == fVar2) {
                objM5 = new lw.o(arrayList, dVar4, function0, 9);
                sVar.k0(objM5);
            }
            w0.e.d(dVar5, z11, null, (Function0) objM5, sVar, 0);
            int i23 = i12 >> 3;
            f(iVar2, dVar5, tVar, fVar, function1, function12, function2, sVar, ((i12 << 3) & 8064) | (57344 & i23) | (458752 & i23) | (3670016 & i23) | (i23 & 29360128));
            sVar = sVar;
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new gn.r(arrayList, tVar, fVar, jVar, function1, function12, function2, function0, i11);
        }
    }

    public static final void e(final List list, b4.t tVar, b4.f fVar, final Function0 function0, List list2, final o9.j jVar, Function1 function1, Function1 function12, Function2 function2, final m90.z0 z0Var, m3.n nVar, final int i11) {
        m3.s sVar;
        final b4.t tVar2;
        final b4.f fVar2;
        final List list3;
        final Function1 function13;
        final Function1 function14;
        final Function2 function22;
        List listC;
        int i12;
        b4.t tVar3;
        b4.f fVar3;
        Function2 function23;
        Function1 function15;
        Function1 function16;
        ArrayList arrayList;
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-30905885);
        int i13 = i11 | 8624 | (sVar2.f(jVar) ? 131072 : 65536) | 316145664;
        if (sVar2.R(i13 & 1, ((306783379 & i13) == 306783378 && (((sVar2.h(z0Var) ? ' ' : (char) 16) | 2) & 19) == 18) ? false : true)) {
            sVar2.W();
            int i14 = i11 & 1;
            m3.f fVar4 = m3.m.f29332a;
            if (i14 == 0 || sVar2.z()) {
                b4.k kVar = b4.d.f5683a;
                y3.c cVarF = y3.j.f(sVar2);
                boolean zF = sVar2.f(cVarF);
                Object objM = sVar2.M();
                if (zF || objM == fVar4) {
                    objM = new n9.h(new m90.z0(cVarF, 4), new u3.d(new a3.m2(cVarF, 19), true, -1320822745));
                    sVar2.k0(objM);
                }
                listC = kotlin.collections.c0.c((n9.h) objM);
                nv.a aVar = new nv.a(15);
                nv.a aVar2 = new nv.a(16);
                i12 = i13 & (-2113986561);
                p60.a aVar3 = new p60.a(1);
                tVar3 = b4.q.f5711a;
                fVar3 = kVar;
                function23 = aVar3;
                function15 = aVar;
                function16 = aVar2;
            } else {
                sVar2.U();
                i12 = i13 & (-2113986561);
                tVar3 = tVar;
                fVar3 = fVar;
                listC = list2;
                function15 = function1;
                function16 = function12;
                function23 = function2;
            }
            sVar2.r();
            if (list.isEmpty()) {
                i4.a.f("NavDisplay backstack cannot be empty");
                return;
            }
            boolean zF2 = sVar2.f(CollectionsKt.r0(list));
            Object objM2 = sVar2.M();
            if (zF2 || objM2 == fVar4) {
                if (list instanceof RandomAccess) {
                    arrayList = new ArrayList(list.size());
                    int size = list.size();
                    for (int i15 = 0; i15 < size; i15++) {
                        arrayList.add((n9.e) z0Var.invoke(list.get(i15)));
                    }
                } else {
                    arrayList = new ArrayList(kotlin.collections.e0.o(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add((n9.e) z0Var.invoke(it.next()));
                    }
                }
                objM2 = arrayList;
                sVar2.k0(objM2);
            }
            sVar = sVar2;
            d(w0.e.G((List) objM2, listC, sVar2, 0), tVar3, fVar3, jVar, function15, function16, function23, function0, sVar, ((i12 >> 6) & 7168) | 805527984);
            list3 = listC;
            tVar2 = tVar3;
            fVar2 = fVar3;
            function13 = function15;
            function14 = function16;
            function22 = function23;
        } else {
            sVar = sVar2;
            sVar.U();
            tVar2 = tVar;
            fVar2 = fVar;
            list3 = list2;
            function13 = function1;
            function14 = function12;
            function22 = function2;
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2(list, tVar2, fVar2, function0, list3, jVar, function13, function14, function22, z0Var, i11) { // from class: p9.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ List f34587a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ t f34588b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ b4.f f34589c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ Function0 f34590d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ List f34591e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ j f34592f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ Function1 f34593g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ Function1 f34594h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ Function2 f34595i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ z0 f34596j;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(3079);
                    cg.e(this.f34587a, this.f34588b, this.f34589c, this.f34590d, this.f34591e, this.f34592f, this.f34593g, this.f34594h, this.f34595i, this.f34596j, (n) obj, iF);
                    return Unit.f26487a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0484 A[PHI: r7
      0x0484: PHI (r7v25 kotlin.jvm.functions.Function2) = (r7v21 kotlin.jvm.functions.Function2), (r7v26 kotlin.jvm.functions.Function2) binds: [B:199:0x0482, B:195:0x047b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04a9 A[PHI: r9
      0x04a9: PHI (r9v38 kotlin.jvm.functions.Function1) = (r9v35 kotlin.jvm.functions.Function1), (r9v39 kotlin.jvm.functions.Function1) binds: [B:209:0x04a7, B:205:0x04a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0581  */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v31, types: [int] */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r18v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(o9.i r34, r9.d r35, b4.t r36, b4.f r37, kotlin.jvm.functions.Function1 r38, kotlin.jvm.functions.Function1 r39, kotlin.jvm.functions.Function2 r40, m3.n r41, int r42) {
        /*
            Method dump skipped, instruction units count: 1464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.cg.f(o9.i, r9.d, b4.t, b4.f, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, m3.n, int):void");
    }

    public static final void g(Function0 function0, m3.n nVar, int i11) {
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-822186973);
        int i12 = (sVar.h(function0) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            le.p pVarD = o30.e0.D(new le.q("reward_box_open_green.json"), sVar, 6);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(Boolean.FALSE);
                sVar.k0(objM);
            }
            m3.b1 b1Var = (m3.b1) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = new cg.q0(b1Var, null, 8);
                sVar.k0(objM2);
            }
            m3.i.h(b1Var, (Function2) objM2, sVar);
            b4.t tVarT = d2.m2.t(d2.m2.d(b4.q.f5711a, 1.0f), 3);
            float f11 = lv.t.f28253g;
            g3.s0.b(v1.n.k(d2.c.C(tVarT, f11, f11, f11, lv.t.f28249c), 1, l(sVar, R.color.green_20), l2.g.b(o30.e0.s(sVar, R.dimen.profile_card_corner_radius))), l2.g.b(o30.e0.s(sVar, R.dimen.profile_card_corner_radius)), g3.s0.p(lv.s.f28229i, sVar, 6), null, null, u3.e.e(1389827825, sVar, new ap.e(b1Var, pVarD, function0, 24)), sVar, 196608, 24);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cg.z(i11, 28, function0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30, types: [int] */
    /* JADX WARN: Type inference failed for: r10v31 */
    public static final void h(yk.h hVar, np.b bVar, Function0 function0, Function0 function02, Function0 function03, i80.n nVar, String str, boolean z11, Function0 function04, m3.n nVar2, int i11) {
        int i12;
        boolean z12;
        ?? r102;
        boolean z13;
        Object next;
        boolean z14;
        i80.n nVar3 = nVar;
        bVar.getClass();
        function0.getClass();
        str.getClass();
        function04.getClass();
        m3.s sVar = (m3.s) nVar2;
        sVar.c0(-1271222509);
        int i13 = i11 | (sVar.h(hVar) ? 4 : 2) | (sVar.h(bVar) ? 32 : 16) | (sVar.h(function0) ? 256 : 128) | (sVar.h(function02) ? NewHope.SENDB_BYTES : 1024) | (sVar.h(function03) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar.h(nVar3) ? 131072 : 65536) | (sVar.f(str) ? 1048576 : 524288) | (sVar.g(z11) ? 8388608 : 4194304);
        if (sVar.R(i13 & 1, (i13 & 38347923) != 38347922)) {
            List list = (List) m3.i.n(hVar.f46136i, sVar, 0).getValue();
            vg.b bVar2 = (vg.b) m3.i.n(hVar.f46135h, sVar, 0).getValue();
            List list2 = (List) m3.i.n(bVar.f31326n, sVar, 0).getValue();
            Context context = (Context) sVar.j(c5.v0.f7390b);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(Boolean.FALSE);
                sVar.k0(objM);
            }
            m3.b1 b1Var = (m3.b1) objM;
            Activity activity = (Activity) sVar.j(e.k.f15295a);
            Unit unit = Unit.f26487a;
            int i14 = i13 & 3670016;
            boolean zH = sVar.h(hVar) | (i14 == 1048576);
            Object objM2 = sVar.M();
            x70.c cVar = null;
            if (zH || objM2 == fVar) {
                i12 = i14;
                objM2 = new rf.c(hVar, str, cVar, 27);
                sVar.k0(objM2);
            } else {
                i12 = i14;
            }
            m3.i.h(unit, (Function2) objM2, sVar);
            tg.c cVar2 = hVar.f46128a;
            list2.getClass();
            if (hVar.f46129b.f46127b.b()) {
                Iterator it = ((Iterable) cVar2.f40149d.getValue()).iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (((jl.c) next).f25299a == jl.b.STATIONS) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                jl.c cVar3 = (jl.c) next;
                if (cVar3 != null) {
                    boolean z15 = cVar3.f25304f;
                    op.l lVar = cVar3.f25306h;
                    boolean zI = CollectionsKt.I(list2, lVar);
                    if (lVar == null || !z15 || zI) {
                        z14 = z15;
                    } else {
                        z14 = z15;
                        hVar.e(vg.b.APPLY);
                    }
                    cVar2.e(jl.c.a(cVar3, null, null, false, zI ? z14 : false, false, zI ? lVar : null, list2, 95));
                }
            }
            boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                objM3 = new xq.b(b1Var, 7);
                sVar.k0(objM3);
            }
            Function0 function05 = (Function0) objM3;
            boolean zH2 = sVar.h(activity) | sVar.h(hVar);
            Object objM4 = sVar.M();
            if (zH2 || objM4 == fVar) {
                objM4 = new yj.l(activity, b1Var, hVar, 3);
                sVar.k0(objM4);
            }
            int i15 = i12;
            ox.h.f(null, null, zBooleanValue, function05, (Function0) objM4, null, null, null, sVar, 3072, 227);
            b4.t tVarJ = v1.n.j(d2.m2.f13850c, lv.s.J, i4.g0.f23254b);
            float f11 = lv.t.f28251e;
            b4.t tVarD = d2.c.D(tVarJ, 0.0f, f11, 0.0f, 0.0f, 13);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5695n, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarD, sVar);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(yVarA, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            ug.c.h(null, o30.f0.U(sVar, R.string.address_picker_sheet_title_location), false, null, sVar, 0, 13);
            float f12 = lv.t.f28254h;
            float f13 = lv.t.f28253g;
            b4.q qVar = b4.q.f5711a;
            b4.t tVarC2 = d2.c.C(qVar, f13, f11, f13, f12);
            z4.u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC3 = b4.a.c(tVarC2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC3, gVar4, sVar);
            ug.c.f(null, null, false, sVar, 0, 7);
            if (function02 != null) {
                sVar.a0(-770005626);
                z12 = false;
                d2.p.a(b4.a.a(d2.u.f13938a.b(), c5.m2.f7291a, new bn.c0(13, hVar, function02)), sVar, 0);
                sVar.q(false);
            } else {
                z12 = false;
                sVar.a0(-769654861);
                sVar.q(false);
            }
            sVar.q(true);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                jl.c cVar4 = (jl.c) obj;
                if (cVar4.f25299a != jl.b.SELECTED || cVar4.f25303e) {
                    arrayList.add(obj);
                }
            }
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            b4.t tVarB = d2.c.B(new d2.n1(1.0f, true), lv.t.f28253g, 0.0f, 2);
            boolean zB = np.b.b();
            boolean zH3 = sVar.h(hVar) | ((i13 & 458752) == 131072 ? true : z12);
            Object objM5 = sVar.M();
            if (zH3 || objM5 == fVar) {
                nVar3 = nVar;
                objM5 = new oo.s(18, hVar, nVar3);
                sVar.k0(objM5);
            } else {
                nVar3 = nVar;
            }
            o30.f0.h(tVarB, arrayList, zB, (i80.n) objM5, lv.s.I, z11, function04, sVar, ((i13 >> 6) & 458752) | 1597440);
            sVar = sVar;
            d2.c.f(d2.m2.e(qVar, lv.t.f28251e), sVar);
            boolean z16 = arrayList.size() > 4 ? true : z12;
            boolean zH4 = ((i13 & 57344) == 16384 ? true : z12) | ((i13 & 896) == 256 ? true : z12) | sVar.h(hVar) | (i15 == 1048576 ? true : z12) | sVar.h(context);
            Object objM6 = sVar.M();
            if (zH4 || objM6 == fVar) {
                r102 = z12;
                z13 = true;
                bg.a1 a1Var = new bg.a1(function0, hVar, str, context, function03, 11);
                sVar.k0(a1Var);
                objM6 = a1Var;
            } else {
                r102 = z12;
                z13 = true;
            }
            ug.c.a(bVar2, (Function1) objM6, z16, sVar, r102);
            sVar.q(z13);
        } else {
            sVar.U();
        }
        m3.w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new pi.g(hVar, bVar, function0, function02, function03, nVar3, str, z11, function04, i11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(java.io.File r4, kotlin.jvm.functions.Function1 r5, z70.c r6) throws java.io.IOException {
        /*
            boolean r0 = r6 instanceof d8.g0
            if (r0 == 0) goto L13
            r0 = r6
            d8.g0 r0 = (d8.g0) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            d8.g0 r0 = new d8.g0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f14620k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            java.io.File r4 = r0.f14619j
            ba0.g.M(r6)     // Catch: java.io.IOException -> L29
            return r6
        L29:
            r5 = move-exception
            goto L41
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r4)
            r4 = 0
            return r4
        L32:
            ba0.g.M(r6)
            r0.f14619j = r4     // Catch: java.io.IOException -> L29
            r0.l = r3     // Catch: java.io.IOException -> L29
            java.lang.Object r4 = r5.invoke(r0)     // Catch: java.io.IOException -> L29
            if (r4 != r1) goto L40
            return r1
        L40:
            return r4
        L41:
            boolean r6 = r5 instanceof androidx.datastore.core.CorruptionException
            if (r6 != 0) goto La5
            r4.getClass()
            boolean r6 = r4.exists()
            if (r6 == 0) goto La0
            boolean r6 = r4.isFile()
            if (r6 == 0) goto L7a
            boolean r6 = r4.canRead()
            if (r6 == 0) goto L6a
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L65
            java.io.IOException r4 = o00.h0.o(r4, r5)
            goto La4
        L65:
            java.io.IOException r4 = o00.h0.o(r4, r5)
            goto La4
        L6a:
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L75
            java.io.IOException r4 = o00.h0.o(r4, r5)
            goto La4
        L75:
            java.io.IOException r4 = o00.h0.o(r4, r5)
            goto La4
        L7a:
            boolean r6 = r4.canRead()
            if (r6 == 0) goto L90
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L8b
            java.io.IOException r4 = o00.h0.o(r4, r5)
            goto La4
        L8b:
            java.io.IOException r4 = o00.h0.o(r4, r5)
            goto La4
        L90:
            boolean r6 = r4.canWrite()
            if (r6 == 0) goto L9b
            java.io.IOException r4 = o00.h0.o(r4, r5)
            goto La4
        L9b:
            java.io.IOException r4 = o00.h0.o(r4, r5)
            goto La4
        La0:
            java.io.IOException r4 = o00.h0.o(r4, r5)
        La4:
            throw r4
        La5:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.cg.i(java.io.File, kotlin.jvm.functions.Function1, z70.c):java.lang.Object");
    }

    public static final le.h j(he.k kVar, boolean z11, boolean z12, float f11, int i11, m3.n nVar, int i12) {
        m3.s sVar = (m3.s) nVar;
        sVar.b0(683659508);
        boolean z13 = (i12 & 2) != 0 ? true : z11;
        boolean z14 = (i12 & 8) != 0 ? false : z12;
        float f12 = (i12 & 32) != 0 ? 1.0f : f11;
        int i13 = (i12 & 64) != 0 ? 1 : i11;
        le.n nVar2 = le.n.Immediately;
        if (i13 <= 0) {
            i4.a.i(r8.k.h(i13, "Iterations must be a positive number (", ")."));
            return null;
        }
        if (Float.isInfinite(f12) || Float.isNaN(f12)) {
            throw new IllegalArgumentException(("Speed must be a finite number. It is " + f12 + ".").toString());
        }
        sVar.b0(2024497114);
        sVar.b0(-610207850);
        Object objM = sVar.M();
        m3.f fVar = m3.m.f29332a;
        if (objM == fVar) {
            objM = new le.h();
            sVar.k0(objM);
        }
        le.h hVar = (le.h) objM;
        sVar.q(false);
        sVar.q(false);
        sVar.b0(-180606964);
        Object objM2 = sVar.M();
        if (objM2 == fVar) {
            objM2 = e0.f.w(z13, sVar);
        }
        m3.b1 b1Var = (m3.b1) objM2;
        sVar.q(false);
        sVar.b0(-180606834);
        Context context = (Context) sVar.j(c5.v0.f7390b);
        Matrix matrix = ve.k.f42293a;
        float f13 = f12 / Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
        sVar.q(false);
        m3.i.i(new Object[]{kVar, Boolean.valueOf(z13), null, Float.valueOf(f13), Integer.valueOf(i13)}, new le.a(z13, true, hVar, kVar, i13, z14, f13, nVar2, b1Var, null), sVar);
        sVar.q(false);
        return hVar;
    }

    public static void k(f6.t tVar, j30.g gVar, j6.f fVar, String str, k6.b bVar) throws CLParsingException {
        long j9;
        str.getClass();
        switch (str) {
            case "centerVertically":
                String strW = fVar.w(str);
                k6.b bVarB = strW.equals("parent") ? tVar.b(0) : tVar.b(strW);
                bVar.p(bVarB);
                bVar.e(bVarB);
                return;
            case "center":
                String strW2 = fVar.w(str);
                k6.b bVarB2 = strW2.equals("parent") ? tVar.b(0) : tVar.b(strW2);
                bVar.o(bVarB2);
                bVar.i(bVarB2);
                bVar.p(bVarB2);
                bVar.e(bVarB2);
                return;
            case "custom":
                j6.c cVarU = fVar.u(str);
                j6.f fVar2 = cVarU instanceof j6.f ? (j6.f) cVarU : null;
                if (fVar2 == null) {
                    return;
                }
                for (String str2 : fVar2.z()) {
                    j6.c cVarN = fVar2.n(str2);
                    if (cVarN instanceof j6.e) {
                        float fD = cVarN.d();
                        if (bVar.f26012j0 == null) {
                            bVar.f26012j0 = new HashMap();
                        }
                        bVar.f26012j0.put(str2, Float.valueOf(fD));
                    } else if (cVarN instanceof j6.g) {
                        String strC = cVarN.c();
                        if (strC.startsWith("#")) {
                            String strSubstring = strC.substring(1);
                            if (strSubstring.length() == 6) {
                                strSubstring = "FF".concat(strSubstring);
                            }
                            j9 = Long.parseLong(strSubstring, 16);
                        } else {
                            j9 = -1;
                        }
                        if (j9 != -1) {
                            bVar.f26010i0.put(str2, Integer.valueOf((int) j9));
                        }
                    }
                }
                return;
            case "rotationX":
                bVar.f26027z = gVar.h(fVar.n(str));
                return;
            case "rotationY":
                bVar.A = gVar.h(fVar.n(str));
                return;
            case "rotationZ":
                bVar.B = gVar.h(fVar.n(str));
                return;
            case "translationX":
                bVar.C = tVar.f17429a.e(gVar.h(fVar.n(str)));
                return;
            case "translationY":
                bVar.D = tVar.f17429a.e(gVar.h(fVar.n(str)));
                return;
            case "translationZ":
                bVar.E = tVar.f17429a.e(gVar.h(fVar.n(str)));
                return;
            case "height":
                bVar.f26004f0 = u(fVar, str, tVar, tVar.f17429a);
                return;
            case "motion":
                j6.c cVarN2 = fVar.n(str);
                if (cVarN2 instanceof j6.f) {
                    j6.f fVar3 = (j6.f) cVarN2;
                    i6.n nVar = new i6.n();
                    nVar.f23454a = new int[10];
                    nVar.f23455b = new int[10];
                    nVar.f23456c = 0;
                    nVar.f23457d = new int[10];
                    nVar.f23458e = new float[10];
                    nVar.f23459f = 0;
                    nVar.f23460g = new int[5];
                    nVar.f23461h = new String[5];
                    nVar.f23462i = 0;
                    for (String str3 : fVar3.z()) {
                        str3.getClass();
                        switch (str3) {
                            case "stagger":
                                nVar.a(fVar3.q(str3), 600);
                                continue;
                                break;
                            case "easing":
                                nVar.c(603, fVar3.w(str3));
                                continue;
                                break;
                            case "quantize":
                                j6.c cVarN3 = fVar3.n(str3);
                                if (cVarN3 instanceof j6.a) {
                                    j6.a aVar = (j6.a) cVarN3;
                                    int size = aVar.f24739e.size();
                                    if (size <= 0) {
                                        break;
                                    } else {
                                        nVar.b(610, aVar.s(0));
                                        if (size <= 1) {
                                            break;
                                        } else {
                                            nVar.c(611, aVar.v(1));
                                            if (size > 2) {
                                                nVar.a(aVar.o(2), 602);
                                            }
                                        }
                                    }
                                } else {
                                    j6.c cVarN4 = fVar3.n(str3);
                                    if (cVarN4 == null) {
                                        StringBuilder sbS = e0.f.s("no int found for key <", str3, ">, found [");
                                        sbS.append(cVarN4.i());
                                        sbS.append("] : ");
                                        sbS.append(cVarN4);
                                        throw new CLParsingException(sbS.toString(), fVar3);
                                    }
                                    nVar.b(610, cVarN4.h());
                                }
                                break;
                            case "pathArc":
                                String strW3 = fVar3.w(str3);
                                String[] strArr = {"none", "startVertical", "startHorizontal", "flip", "below", "above"};
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= 6) {
                                        i11 = -1;
                                    } else if (!strArr[i11].equals(strW3)) {
                                        i11++;
                                    }
                                }
                                if (i11 == -1) {
                                    System.err.println("0 pathArc = '" + strW3 + "'");
                                    break;
                                } else {
                                    nVar.b(607, i11);
                                    break;
                                }
                                break;
                            case "relativeTo":
                                nVar.c(605, fVar3.w(str3));
                                break;
                        }
                    }
                    bVar.getClass();
                    return;
                }
                return;
            case "pivotX":
                bVar.f26025x = gVar.h(fVar.n(str));
                return;
            case "pivotY":
                bVar.f26026y = gVar.h(fVar.n(str));
                return;
            case "scaleX":
                bVar.G = gVar.h(fVar.n(str));
                return;
            case "scaleY":
                bVar.H = gVar.h(fVar.n(str));
                return;
            case "hRtlBias":
                float fH = gVar.h(fVar.n(str));
                if (!tVar.f17430b) {
                    fH = 1.0f - fH;
                }
                bVar.f26007h = fH;
                return;
            case "vWeight":
                bVar.f26005g = gVar.h(fVar.n(str));
                return;
            case "alpha":
                bVar.F = gVar.h(fVar.n(str));
                return;
            case "hBias":
                bVar.f26007h = gVar.h(fVar.n(str));
                return;
            case "vBias":
                bVar.f26009i = gVar.h(fVar.n(str));
                return;
            case "width":
                bVar.f26002e0 = u(fVar, str, tVar, tVar.f17429a);
                return;
            case "hWeight":
                bVar.f26003f = gVar.h(fVar.n(str));
                return;
            case "centerHorizontally":
                String strW4 = fVar.w(str);
                k6.b bVarB3 = strW4.equals("parent") ? tVar.b(0) : tVar.b(strW4);
                bVar.o(bVarB3);
                bVar.i(bVarB3);
                return;
            case "visibility":
                switch (fVar.w(str)) {
                    case "invisible":
                        bVar.I = 4;
                        bVar.F = 0.0f;
                        return;
                    case "gone":
                        bVar.I = 8;
                        return;
                    case "visible":
                        bVar.I = 0;
                        return;
                    default:
                        return;
                }
            default:
                t(tVar, gVar, fVar, str, bVar);
                return;
        }
    }

    public static final long l(m3.n nVar, int i11) {
        m3.s sVar = (m3.s) nVar;
        Context context = (Context) sVar.j(c5.v0.f7390b);
        Resources resources = (Resources) sVar.j(c5.v0.f7391c);
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = w6.j.f43256a;
        return i4.g0.c(resources.getColor(i11, theme));
    }

    public static final boolean m(h4.c cVar, float f11, float f12) {
        float f13 = cVar.f21380a;
        if (f11 > cVar.f21382c || f13 > f11) {
            return false;
        }
        return f12 <= cVar.f21383d && cVar.f21381b <= f12;
    }

    public static e0.u0 n(String str, KClass kClass) {
        e0.u0 u0Var;
        kClass.getClass();
        HashMap map = e0.u0.f15409c;
        synchronized (map) {
            try {
                Object u0Var2 = map.get(str);
                if (u0Var2 == null) {
                    u0Var2 = new e0.u0(str, kClass);
                    map.put(str, u0Var2);
                }
                u0Var = (e0.u0) u0Var2;
                if (!Intrinsics.areEqual(u0Var.f15411b, kClass)) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return u0Var;
    }

    public static final Fragment o(View view) {
        Fragment fragmentE = FragmentManager.E(view);
        if (fragmentE != null) {
            return fragmentE;
        }
        a40.d0.q("View ", view, " does not have a Fragment set");
        return null;
    }

    public static final int p(Layout layout, int i11, boolean z11) {
        if (i11 <= 0) {
            return 0;
        }
        if (i11 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i11);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i11 || lineEnd == i11) {
            if (lineStart == i11) {
                if (z11) {
                    return lineForOffset - 1;
                }
            } else if (!z11) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static final boolean q(Collection collection) {
        return !(collection == null || collection.isEmpty());
    }

    public static final ax.h0 r(ax.b bVar, Uri uri, tx.q0 q0Var) {
        uri.getClass();
        String path = uri.getPath();
        if ("file".equalsIgnoreCase(uri.getScheme()) && path != null) {
            ax.e0 e0Var = new ax.e0(ParcelFileDescriptor.open(new File(path), 268435456));
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", e0Var);
            return new ax.h0(bVar, "me/staging_resources", bundle, ax.l0.POST, q0Var);
        }
        if (!"content".equalsIgnoreCase(uri.getScheme())) {
            throw new FacebookException("The image Uri must be either a file:// or content:// Uri");
        }
        ax.e0 e0Var2 = new ax.e0(uri);
        Bundle bundle2 = new Bundle(1);
        bundle2.putParcelable("file", e0Var2);
        return new ax.h0(bVar, "me/staging_resources", bundle2, ax.l0.POST, q0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void s(int r6, f6.t r7, j30.g r8, j6.a r9) {
        /*
            if (r6 != 0) goto Lb
            k6.l r6 = k6.l.HORIZONTAL_CHAIN
            k6.g r6 = r7.e(r6)
            l6.j r6 = (l6.j) r6
            goto L13
        Lb:
            k6.l r6 = k6.l.VERTICAL_CHAIN
            k6.g r6 = r7.e(r6)
            l6.l r6 = (l6.l) r6
        L13:
            r0 = 1
            j6.c r1 = r9.m(r0)
            boolean r2 = r1 instanceof j6.a
            if (r2 == 0) goto Lb8
            j6.a r1 = (j6.a) r1
            java.util.ArrayList r2 = r1.f24739e
            int r2 = r2.size()
            if (r2 >= r0) goto L28
            goto Lb8
        L28:
            r2 = 0
            r3 = r2
        L2a:
            java.util.ArrayList r4 = r1.f24739e
            int r4 = r4.size()
            if (r3 >= r4) goto L40
            java.lang.String r4 = r1.v(r3)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r6.q(r4)
            int r3 = r3 + 1
            goto L2a
        L40:
            java.util.ArrayList r1 = r9.f24739e
            int r1 = r1.size()
            r3 = 2
            if (r1 <= r3) goto Lb8
            j6.c r9 = r9.m(r3)
            boolean r1 = r9 instanceof j6.f
            if (r1 != 0) goto L52
            goto Lb8
        L52:
            j6.f r9 = (j6.f) r9
            java.util.ArrayList r1 = r9.z()
            java.util.Iterator r1 = r1.iterator()
        L5c:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lb8
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            r3.getClass()
            java.lang.String r4 = "style"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L77
            t(r7, r8, r9, r3, r6)
            goto L5c
        L77:
            j6.c r3 = r9.n(r3)
            boolean r4 = r3 instanceof j6.a
            if (r4 == 0) goto L95
            r4 = r3
            j6.a r4 = (j6.a) r4
            java.util.ArrayList r5 = r4.f24739e
            int r5 = r5.size()
            if (r5 <= r0) goto L95
            java.lang.String r3 = r4.v(r2)
            float r4 = r4.o(r0)
            r6.f27393n0 = r4
            goto L99
        L95:
            java.lang.String r3 = r3.c()
        L99:
            java.lang.String r4 = "packed"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto Lb3
            java.lang.String r4 = "spread_inside"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto Lae
            k6.i r3 = k6.i.SPREAD
            r6.t0 = r3
            goto L5c
        Lae:
            k6.i r3 = k6.i.SPREAD_INSIDE
            r6.t0 = r3
            goto L5c
        Lb3:
            k6.i r3 = k6.i.PACKED
            r6.t0 = r3
            goto L5c
        Lb8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.cg.s(int, f6.t, j30.g, j6.a):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:61:0x00e6. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0147  */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r19v0, types: [f6.t] */
    /* JADX WARN: Type inference failed for: r23v0, types: [k6.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void t(f6.t r19, j30.g r20, j6.f r21, java.lang.String r22, k6.b r23) {
        /*
            Method dump skipped, instruction units count: 948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.cg.t(f6.t, j30.g, j6.f, java.lang.String, k6.b):void");
    }

    public static k6.f u(j6.f fVar, String str, f6.t tVar, e.b bVar) {
        j6.c cVarN = fVar.n(str);
        k6.f fVarB = k6.f.b(0);
        if (cVarN instanceof j6.g) {
            return v(cVarN.c());
        }
        if (cVarN instanceof j6.e) {
            return k6.f.b(tVar.c(Float.valueOf(bVar.e(fVar.q(str)))));
        }
        if (cVarN instanceof j6.f) {
            j6.f fVar2 = (j6.f) cVarN;
            String strX = fVar2.x("value");
            if (strX != null) {
                fVarB = v(strX);
            }
            j6.c cVarU = fVar2.u("min");
            if (cVarU != null) {
                if (cVarU instanceof j6.e) {
                    int iC = tVar.c(Float.valueOf(bVar.e(((j6.e) cVarU).d())));
                    if (iC >= 0) {
                        fVarB.f26040a = iC;
                    }
                } else if (cVarU instanceof j6.g) {
                    fVarB.f26040a = -2;
                }
            }
            j6.c cVarU2 = fVar2.u("max");
            if (cVarU2 != null) {
                if (cVarU2 instanceof j6.e) {
                    int iC2 = tVar.c(Float.valueOf(bVar.e(((j6.e) cVarU2).d())));
                    if (fVarB.f26041b >= 0) {
                        fVarB.f26041b = iC2;
                        return fVarB;
                    }
                } else if ((cVarU2 instanceof j6.g) && fVarB.f26046g) {
                    fVarB.f26045f = k6.f.f26036i;
                    fVarB.f26041b = Integer.MAX_VALUE;
                }
            }
        }
        return fVarB;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static k6.f v(String str) {
        k6.f fVarB = k6.f.b(0);
        byte b8 = -1;
        switch (str.hashCode()) {
            case -1460244870:
                if (str.equals("preferWrap")) {
                    b8 = 0;
                }
                break;
            case -995424086:
                if (str.equals("parent")) {
                    b8 = 1;
                }
                break;
            case -895684237:
                if (str.equals("spread")) {
                    b8 = 2;
                }
                break;
            case 3657802:
                if (str.equals("wrap")) {
                    b8 = 3;
                }
                break;
        }
        String str2 = k6.f.f26036i;
        String str3 = k6.f.f26037j;
        switch (b8) {
            case 0:
                return k6.f.c(str2);
            case 1:
                return new k6.f(k6.f.f26038k);
            case 2:
                return k6.f.c(str3);
            case 3:
                return new k6.f(str2);
            default:
                if (str.endsWith("%")) {
                    float f11 = Float.parseFloat(str.substring(0, str.indexOf(37))) / 100.0f;
                    k6.f fVar = new k6.f(k6.f.l);
                    fVar.f26042c = f11;
                    fVar.f26046g = true;
                    fVar.f26041b = 0;
                    return fVar;
                }
                if (!str.contains(":")) {
                    return fVarB;
                }
                k6.f fVar2 = new k6.f(k6.f.f26039m);
                fVar2.f26044e = str;
                fVar2.f26045f = str3;
                fVar2.f26046g = true;
                return fVar2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void w(int r17, f6.t r18, java.lang.String r19, j6.f r20) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.cg.w(int, f6.t, java.lang.String, j6.f):void");
    }

    public static void x(f6.t tVar, j30.g gVar, String str, j6.f fVar) throws CLParsingException {
        k6.b bVarB = tVar.b(str);
        k6.f fVar2 = bVarB.f26002e0;
        String str2 = k6.f.f26036i;
        if (fVar2 == null) {
            bVarB.f26002e0 = new k6.f(str2);
        }
        if (bVarB.f26004f0 == null) {
            bVarB.f26004f0 = new k6.f(str2);
        }
        Iterator it = fVar.z().iterator();
        while (it.hasNext()) {
            k(tVar, gVar, fVar, (String) it.next(), bVarB);
        }
    }

    public static final void y(s0.g0 g0Var, df.g gVar, o0.c cVar) {
        y0.a aVarS;
        com.google.firebase.messaging.a0 a0Var = f11326f;
        if (a0Var == null) {
            com.braze.h2.b("mCameraUseCaseAdapterProvider must be initialized first!");
            return;
        }
        String strD = g0Var.d();
        strD.getClass();
        s0.i0 i0VarB = ((s0.p0) a0Var.f12779b).b(strD);
        s0.c cVar2 = new s0.c(i0VarB.q(), s0.c0.f38306a);
        m0.b0 b0Var = m0.b0.f28469d;
        y0.d dVar = new y0.d(i0VarB, null, cVar2, null, b0Var, b0Var, (w.e) a0Var.f12780c, (ub.a) a0Var.f12782e, (s0.r2) a0Var.f12781d);
        synchronized (dVar.f44550k) {
        }
        List list = (List) gVar.f14895c;
        synchronized (dVar.f44550k) {
            dVar.f44547h = list;
        }
        synchronized (dVar.f44550k) {
        }
        Range range = (Range) gVar.f14896d;
        synchronized (dVar.f44550k) {
            dVar.f44548i = range;
        }
        List list2 = (List) gVar.f14899g;
        wd.a.p("CameraUseCaseAdapter", "simulateAddUseCases: appUseCasesToAdd = " + list2 + ", featureGroup = " + cVar);
        synchronized (dVar.f44550k) {
            s0.d dVar2 = dVar.f44540a;
            s0.z zVar = dVar.f44549j;
            dVar2.i(zVar);
            s0.d dVar3 = dVar.f44541b;
            if (dVar3 != null) {
                dVar3.i(zVar);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(dVar.f44544e);
            linkedHashSet.addAll(list2);
            HashMap mapG = y0.d.g(linkedHashSet, cVar);
            try {
                try {
                    aVarS = dVar.s(linkedHashSet, dVar.f44541b != null);
                    y0.d.B(mapG);
                } catch (IllegalArgumentException e5) {
                    throw new CameraUseCaseAdapter$CameraException(e5);
                }
            } catch (Throwable th2) {
                y0.d.B(mapG);
                throw th2;
            }
        }
        aVarS.getClass();
    }

    public static void z(int i11, int i12) {
        String strL;
        if (i11 < 0 || i11 >= i12) {
            if (i11 < 0) {
                strL = o00.x0.L("%s (%s) must not be negative", "index", Integer.valueOf(i11));
            } else {
                if (i12 < 0) {
                    i4.a.f(e0.f.h(i12, "negative size: ", new StringBuilder(String.valueOf(i12).length() + 15)));
                    return;
                }
                strL = o00.x0.L("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i11), Integer.valueOf(i12));
            }
            throw new IndexOutOfBoundsException(strL);
        }
    }
}
