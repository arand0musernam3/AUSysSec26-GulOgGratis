package ba0;

import a3.a3;
import a3.t0;
import a3.v0;
import al.n;
import android.app.AppOpsManager;
import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.util.Base64;
import android.util.Log;
import b4.q;
import b4.t;
import c5.i2;
import c5.x1;
import cg.z;
import com.app.tgtg.R;
import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.profile.ProfileCO2Saved;
import com.facebook.FacebookException;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.measurement.cg;
import com.google.android.gms.maps.model.LatLng;
import d2.g0;
import d2.m2;
import g3.r9;
import i2.e0;
import i2.x;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import m0.h1;
import m3.b1;
import m3.c3;
import m3.s;
import m3.w1;
import m3.x2;
import m5.l0;
import m5.o;
import m5.r0;
import m90.c1;
import m90.f0;
import m90.j1;
import m90.k1;
import m90.s0;
import m90.s1;
import o00.x0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import qc.y;
import t1.r;
import t1.u1;
import t1.v;
import u70.p;
import u70.u;
import w.a0;
import y80.y1;
import y9.w;
import z1.h2;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f6086a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f6087b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f6088c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f6089d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static u00.a f6090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f6091f = 0;

    public static final boolean A(e0 e0Var, float f11) {
        e0Var.n().getClass();
        return !(((e0Var.s() ? -f11 : m(e0Var)) > 0.0f ? 1 : ((e0Var.s() ? -f11 : m(e0Var)) == 0.0f ? 0 : -1)) > 0);
    }

    public static final boolean B(String str) {
        if (str == null || str.length() == 0 || str.length() < 43 || str.length() > 128) {
            return false;
        }
        return new Regex("^[-._~A-Za-z0-9]+$").e(str);
    }

    public static final float C(float f11, float f12, float f13) {
        return (f13 * f12) + ((1 - f13) * f11);
    }

    public static final int D(int i11, float f11, int i12) {
        return i11 + ((int) Math.round(((double) (i12 - i11)) * ((double) f11)));
    }

    public static jb.b E(LatLng latLng, float f11) {
        try {
            u00.a aVar = f6090e;
            i0.i(aVar, "CameraUpdateFactory is not initialized");
            Parcel parcelL = aVar.L();
            n00.d.c(parcelL, latLng);
            parcelL.writeFloat(f11);
            Parcel parcelJ = aVar.J(9, parcelL);
            yz.a aVarU = yz.b.U(parcelJ.readStrongBinder());
            parcelJ.recycle();
            return new jb.b(aVarU);
        } catch (RemoteException e5) {
            y.l(e5);
            return null;
        }
    }

    public static final KSerializer F(KClass kClass, ArrayList arrayList, Function0 function0) {
        KSerializer dVar;
        KSerializer k1Var;
        kClass.getClass();
        arrayList.getClass();
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Collection.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(List.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(List.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(ArrayList.class))) {
            dVar = new m90.d((KSerializer) arrayList.get(0), 0);
        } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(HashSet.class))) {
            dVar = new m90.d((KSerializer) arrayList.get(0), 1);
        } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Set.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Set.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(LinkedHashSet.class))) {
            dVar = new m90.d((KSerializer) arrayList.get(0), 2);
        } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(HashMap.class))) {
            dVar = new f0((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1), 0);
        } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(LinkedHashMap.class))) {
            dVar = new f0((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1), 1);
        } else {
            if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Map.Entry.class))) {
                KSerializer kSerializer = (KSerializer) arrayList.get(0);
                KSerializer kSerializer2 = (KSerializer) arrayList.get(1);
                kSerializer.getClass();
                kSerializer2.getClass();
                k1Var = new s0(kSerializer, kSerializer2, 0);
            } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Pair.class))) {
                KSerializer kSerializer3 = (KSerializer) arrayList.get(0);
                KSerializer kSerializer4 = (KSerializer) arrayList.get(1);
                kSerializer3.getClass();
                kSerializer4.getClass();
                k1Var = new s0(kSerializer3, kSerializer4, 1);
            } else if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(u.class))) {
                KSerializer kSerializer5 = (KSerializer) arrayList.get(0);
                KSerializer kSerializer6 = (KSerializer) arrayList.get(1);
                KSerializer kSerializer7 = (KSerializer) arrayList.get(2);
                kSerializer5.getClass();
                kSerializer6.getClass();
                kSerializer7.getClass();
                dVar = new s1(kSerializer5, kSerializer6, kSerializer7);
            } else if (w.v(kClass).isArray()) {
                Object objInvoke = function0.invoke();
                objInvoke.getClass();
                KSerializer kSerializer8 = (KSerializer) arrayList.get(0);
                kSerializer8.getClass();
                k1Var = new k1((KClass) objInvoke, kSerializer8);
            } else {
                dVar = null;
            }
            dVar = k1Var;
        }
        if (dVar != null) {
            return dVar;
        }
        KSerializer[] kSerializerArr = (KSerializer[]) arrayList.toArray(new KSerializer[0]);
        KSerializer[] kSerializerArr2 = (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length);
        return c1.d(w.v(kClass), (KSerializer[]) Arrays.copyOf(kSerializerArr2, kSerializerArr2.length));
    }

    public static final KSerializer G(x xVar, Type type) {
        xVar.getClass();
        type.getClass();
        KSerializer kSerializerF = bx.k.F(xVar, type, true);
        if (kSerializerF != null) {
            return kSerializerF;
        }
        Class clsB = bx.k.B(type);
        clsB.getClass();
        throw new SerializationException(c1.i(w.y(clsB)));
    }

    public static final KSerializer H(x xVar, KType kType) {
        xVar.getClass();
        kType.getClass();
        KSerializer kSerializerO = bx.o.O(xVar, kType, true);
        if (kSerializerO != null) {
            return kSerializerO;
        }
        throw new SerializationException(c1.i(c1.h(kType)));
    }

    public static final KSerializer I(KClass kClass) {
        kClass.getClass();
        KSerializer kSerializerK = K(kClass);
        if (kSerializerK != null) {
            return kSerializerK;
        }
        throw new SerializationException(c1.i(kClass));
    }

    public static final KSerializer J(x xVar, KType kType) {
        xVar.getClass();
        kType.getClass();
        return bx.o.O(xVar, kType, false);
    }

    public static final KSerializer K(KClass kClass) throws IllegalAccessException, InvocationTargetException {
        kClass.getClass();
        KSerializer kSerializerD = c1.d(w.v(kClass), (KSerializer[]) Arrays.copyOf(new KSerializer[0], 0));
        return kSerializerD == null ? (KSerializer) j1.f29816a.get(kClass) : kSerializerD;
    }

    public static final ArrayList L(x xVar, List list, boolean z11) {
        xVar.getClass();
        list.getClass();
        if (z11) {
            ArrayList arrayList = new ArrayList(kotlin.collections.e0.o(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(H(xVar, (KType) it.next()));
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.e0.o(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            KSerializer kSerializerJ = J(xVar, (KType) it2.next());
            if (kSerializerJ == null) {
                return null;
            }
            arrayList2.add(kSerializerJ);
        }
        return arrayList2;
    }

    public static final void M(Object obj) {
        if (obj instanceof p) {
            throw ((p) obj).f40849a;
        }
    }

    public static void N(int i11, Object[] objArr) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (objArr[i12] == null) {
                c50.w.l(e0.f.h(i12, "at index ", new StringBuilder(String.valueOf(i12).length() + 9)));
                return;
            }
        }
    }

    public static final void a(h1 h1Var, t tVar, l1.b bVar, b4.f fVar, z4.m mVar, m3.n nVar, int i11) {
        l1.b bVar2;
        b4.f fVar2;
        t tVar2;
        z4.m mVar2;
        t tVar3;
        b4.f fVar3;
        z4.m mVar3;
        l1.b bVar3;
        s sVar = (s) nVar;
        sVar.c0(-1071821681);
        if (((i11 | (sVar.h(h1Var) ? 4 : 2) | 224432) & 74899) == 74898 && sVar.B()) {
            sVar.U();
            tVar3 = tVar;
            bVar3 = bVar;
            fVar3 = fVar;
            mVar3 = mVar;
        } else {
            sVar.W();
            if ((i11 & 1) == 0 || sVar.z()) {
                l1.b bVarT = Intrinsics.areEqual(h1Var.f28517d.b().l(), "androidx.camera.camera2.legacy") ? l1.b.EMBEDDED : bx.k.t();
                bVar2 = bVarT;
                fVar2 = b4.d.f5687e;
                tVar2 = q.f5711a;
                mVar2 = z4.l.f47166a;
            } else {
                sVar.U();
                tVar2 = tVar;
                bVar2 = bVar;
                fVar2 = fVar;
                mVar2 = mVar;
            }
            sVar.r();
            b1 b1VarB = m3.i.B(bVar2, sVar);
            boolean zH = sVar.h(h1Var) | sVar.f(b1VarB);
            Object objM = sVar.M();
            m3.f fVar4 = m3.m.f29332a;
            x70.c cVar = null;
            if (zH || objM == fVar4) {
                objM = new l0.d(h1Var, b1VarB, null);
                sVar.k0(objM);
            }
            Function2 function2 = (Function2) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar4) {
                objM2 = m3.i.w(null);
                sVar.k0(objM2);
            }
            b1 b1Var = (b1) objM2;
            boolean zH2 = sVar.h(function2);
            Object objM3 = sVar.M();
            if (zH2 || objM3 == fVar4) {
                objM3 = new x2(function2, b1Var, cVar, 1);
                sVar.k0(objM3);
            }
            m3.i.h(h1Var, (Function2) objM3, sVar);
            l0.g gVar = (l0.g) b1Var.getValue();
            if (gVar == null) {
                sVar.a0(-1848994217);
                sVar.q(false);
            } else {
                sVar.a0(-1848994216);
                b1 b1VarB2 = m3.i.B(gVar, sVar);
                boolean zF = sVar.f(b1VarB2);
                Object objM4 = sVar.M();
                if (zF || objM4 == fVar4) {
                    objM4 = new gf.g(b1VarB2, cVar, 23);
                    sVar.k0(objM4);
                }
                final l0.f fVar5 = (l0.f) m3.i.x(null, (Function2) objM4, sVar).getValue();
                if (fVar5 == null) {
                    sVar.a0(1261255935);
                    sVar.q(false);
                } else {
                    sVar.a0(1261255936);
                    boolean zF2 = sVar.f(fVar5);
                    Object objM5 = sVar.M();
                    if (zF2 || objM5 == fVar4) {
                        final int i12 = 0;
                        objM5 = new Function1() { // from class: l0.a
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i12) {
                                    case 0:
                                        return new v0(fVar5, 11);
                                    default:
                                        ((j1.c) obj).f24368b = new n(fVar5, null);
                                        return Unit.f26487a;
                                }
                            }
                        };
                        sVar.k0(objM5);
                    }
                    m3.i.d(fVar5, (Function1) objM5, sVar);
                    l1.d dVar = fVar5.f26745a;
                    l1.c cVar2 = gVar.f26749c;
                    t tVarThen = tVar2.then(m2.f13850c);
                    boolean zF3 = sVar.f(fVar5);
                    Object objM6 = sVar.M();
                    if (zF3 || objM6 == fVar4) {
                        final int i13 = 1;
                        objM6 = new Function1() { // from class: l0.a
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                switch (i13) {
                                    case 0:
                                        return new v0(fVar5, 11);
                                    default:
                                        ((j1.c) obj).f24368b = new n(fVar5, null);
                                        return Unit.f26487a;
                                }
                            }
                        };
                        sVar.k0(objM6);
                    }
                    dx.f.g(dVar, tVarThen, cVar2, fVar2, mVar2, (Function1) objM6, sVar, 224256);
                    sVar.q(false);
                }
                sVar.q(false);
            }
            tVar3 = tVar2;
            fVar3 = fVar2;
            mVar3 = mVar2;
            bVar3 = bVar2;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ap.b(h1Var, tVar3, bVar3, fVar3, mVar3, i11, 14);
        }
    }

    public static final void b(Function0 function0, m3.n nVar, int i11) {
        Function0 function02;
        Function0 function03 = function0;
        function03.getClass();
        s sVar = (s) nVar;
        sVar.c0(-122433220);
        int i12 = i11 | (sVar.h(function03) ? 4 : 2);
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(Boolean.FALSE);
                sVar.k0(objM);
            }
            b1 b1Var = (b1) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = m3.i.w(Boolean.FALSE);
                sVar.k0(objM2);
            }
            b1 b1Var2 = (b1) objM2;
            float f11 = ((Boolean) b1Var.getValue()).booleanValue() ? 1.0f : 0.0f;
            u1 u1Var = new u1(1400, 200, v.f39585b);
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                objM3 = new li.c(b1Var2, 13);
                sVar.k0(objM3);
            }
            c3 c3VarB = t1.d.b(f11, u1Var, "animationValue", (Function1) objM3, sVar, 27648, 4);
            float f12 = ((Boolean) b1Var2.getValue()).booleanValue() ? 1.0f : 0.0f;
            r rVar = v.f39584a;
            c3 c3VarB2 = t1.d.b(f12, new u1(300, 100, rVar), "animationValueThumbs", null, sVar, 3072, 20);
            c3 c3VarD = t1.d.d(new z5.j(((Boolean) b1Var2.getValue()).booleanValue() ? 0L : (((long) j80.c.b(((z5.c) sVar.j(x1.f7416h)).c0(100))) & 4294967295L) | (((long) 0) << 32)), t1.c.f39394p, new u1(300, 300, rVar), null, "offset", null, sVar, 24576, 8);
            c3 c3VarB3 = t1.d.b(((Boolean) b1Var2.getValue()).booleanValue() ? 1.0f : 0.0f, new u1(300, 300, rVar), "animationValueContent", null, sVar, 3072, 20);
            Boolean bool = Boolean.TRUE;
            Object objM4 = sVar.M();
            int i13 = 3;
            if (objM4 == fVar) {
                objM4 = new co.j(b1Var, null, i13);
                sVar.k0(objM4);
            }
            m3.i.h(bool, (Function2) objM4, sVar);
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            q qVar = q.f5711a;
            t tVarC = b4.a.c(qVar, sVar);
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
            n4.b bVarZ = x0.z(R.drawable.donations_blob, sVar, 0);
            b4.k kVar = b4.d.f5687e;
            d2.u uVar = d2.u.f13938a;
            float f13 = 500;
            t tVarE = m2.e(m2.q(uVar.a(qVar, kVar), f13), f13);
            float fFloatValue = ((Number) c3VarB.getValue()).floatValue() * 2.0f;
            v1.n.d(bVarZ, null, f4.g.i(f4.g.j(tVarE, fFloatValue, fFloatValue), 180.0f), null, null, 0.0f, null, sVar, 56, 120);
            n4.b bVarZ2 = x0.z(R.drawable.system_icon_close_neutral_80, sVar, 0);
            float f14 = 24;
            t tVarA = uVar.a(d2.c.A(qVar, f14, f14), b4.d.f5685c);
            int i14 = i12 & 14;
            boolean z11 = i14 == 4;
            Object objM5 = sVar.M();
            if (z11 || objM5 == fVar) {
                objM5 = new nn.m(7, function03);
                sVar.k0(objM5);
            }
            v1.n.d(bVarZ2, null, androidx.compose.foundation.b.c(tVarA, false, null, null, (Function0) objM5, 15), null, null, 0.0f, null, sVar, 56, 120);
            float f15 = 48;
            t tVarA2 = uVar.a(m2.c(d2.c.D(qVar, 0.0f, 0.0f, 0.0f, f15, 7), 1.0f), kVar);
            d2.y yVarA = d2.w.a(d2.i.f13805e, b4.d.f5695n, sVar, 54);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(tVarA2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            n4.b bVarZ3 = x0.z(R.drawable.ic_thumbsup_donations, sVar, 0);
            t tVarB = d2.c.B(m2.d(qVar, 1.0f), f14, 0.0f, 2);
            boolean z12 = i14 == 4;
            Object objM6 = sVar.M();
            if (z12 || objM6 == fVar) {
                objM6 = new nn.m(8, function03);
                sVar.k0(objM6);
            }
            t tVarA3 = f4.g.a(androidx.compose.foundation.b.c(tVarB, false, null, null, (Function0) objM6, 15), ((Number) c3VarB2.getValue()).floatValue());
            boolean zF = sVar.f(c3VarD);
            Object objM7 = sVar.M();
            if (zF || objM7 == fVar) {
                objM7 = new dp.r(c3VarD, 5);
                sVar.k0(objM7);
            }
            v1.n.d(bVarZ3, null, d2.c.u(tVarA3, (Function1) objM7), null, null, 0.0f, null, sVar, 56, 120);
            String strU = o30.f0.U(sVar, R.string.charity_collection_confirmed_title);
            m5.u0 u0VarA = m5.u0.a(lv.v.f28267f, 0L, 0L, null, null, b0.a0.B(0.48d), null, 0, 0L, null, null, 16777087);
            long j9 = lv.s.f28217b;
            r9.d(strU, f4.g.a(d2.c.z(qVar, f14), ((Number) c3VarB3.getValue()).floatValue()), j9, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, u0VarA, sVar, MLKEMEngine.KyberPolyBytes, 0, 130040);
            String strU2 = o30.f0.U(sVar, R.string.charity_collection_confirmed_text);
            m5.u0 u0Var = lv.v.f28274n;
            r9.d(strU2, f4.g.a(d2.c.D(qVar, f14, 0.0f, f14, 40, 2), ((Number) c3VarB3.getValue()).floatValue()), 0L, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, m5.u0.a(u0Var, j9, 0L, null, null, b0.a0.B(0.08d), null, 0, 0L, null, null, 16777086), sVar, 0, 0, 130044);
            sVar.q(true);
            String strU3 = o30.f0.U(sVar, R.string.charity_collection_confirmed_close);
            m5.u0 u0VarA2 = m5.u0.a(u0Var, j9, 0L, null, null, b0.a0.B(0.08d), x5.l.f43854c, 3, 0L, null, null, 16740222);
            t tVarA4 = uVar.a(d2.c.A(qVar, f14, f15), b4.d.f5690h);
            boolean z13 = i14 == 4;
            Object objM8 = sVar.M();
            if (z13 || objM8 == fVar) {
                function02 = function0;
                objM8 = new nn.m(9, function02);
                sVar.k0(objM8);
            } else {
                function02 = function0;
            }
            function03 = function02;
            r9.d(strU3, androidx.compose.foundation.b.c(tVarA4, false, null, null, (Function0) objM8, 15), 0L, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, u0VarA2, sVar, 0, 0, 130044);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new z(i11, 10, function03);
        }
    }

    public static final void c(String str, String str2, String str3, final Function0 function0, m3.n nVar, int i11) {
        int i12;
        s sVar;
        s sVar2 = (s) nVar;
        sVar2.c0(-1714568010);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.f(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.f(str2) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar2.f(str3) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.h(function0) ? 2048 : 1024;
        }
        if (sVar2.R(i12 & 1, (i12 & 1171) != 1170)) {
            sVar2.a0(1567591616);
            m5.e eVar = new m5.e();
            eVar.c(str.concat(" "));
            r0 r0Var = new r0(new l0(lv.s.f28215a, 0L, (q5.r) null, (q5.n) null, (q5.o) null, (q5.i) null, (String) null, 0L, (x5.a) null, (x5.p) null, (t5.c) null, 0L, x5.l.f43854c, (i4.u0) null, 61438), null, null, null);
            boolean z11 = (i12 & 7168) == 2048;
            Object objM = sVar2.M();
            if (z11 || objM == m3.m.f29332a) {
                objM = new m5.p() { // from class: ml.a
                    @Override // m5.p
                    public final void a(o oVar) {
                        oVar.getClass();
                        Function0 function02 = function0;
                        if (function02 != null) {
                            function02.invoke();
                        }
                    }
                };
                sVar2.k0(objM);
            }
            int iH = eVar.h(new m5.m(str3, r0Var, (m5.p) objM));
            try {
                eVar.c(str2);
                eVar.g(iH);
                m5.h hVarJ = eVar.j();
                sVar2.q(false);
                sVar = sVar2;
                r9.e(hVarJ, m2.d(q.f5711a, 1.0f), lv.s.C, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, null, m5.u0.a(lv.v.f28276p, 0L, 0L, null, null, 0L, null, 3, 0L, null, null, 16744447), sVar, 432, 0, 262136);
            } catch (Throwable th2) {
                eVar.g(iH);
                throw th2;
            }
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new t0(str, str2, i11, str3, function0, 12);
        }
    }

    public static final void d(t tVar, BasicItem basicItem, long j9, m3.n nVar, int i11) {
        long j11;
        s sVar;
        t tVar2;
        basicItem.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(-1965350217);
        int i12 = i11 | 6;
        if ((i11 & 48) == 0) {
            i12 |= sVar2.h(basicItem) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            j11 = j9;
            i12 |= sVar2.e(j11) ? 256 : 128;
        } else {
            j11 = j9;
        }
        if (sVar2.R(i12 & 1, (i12 & 147) != 146)) {
            String strI = mv.r0.i((Context) sVar2.j(c5.v0.f7390b), basicItem);
            int length = strI.length();
            tVar2 = q.f5711a;
            if (length > 0) {
                sVar2.a0(-753930446);
                r9.d(strI, tVar2, j11, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, lv.v.f28276p, sVar2, ((i12 << 3) & 112) | (i12 & 896), 12607872, 110584);
                sVar = sVar2;
                sVar.q(false);
            } else {
                sVar = sVar2;
                sVar.a0(-753715957);
                sVar.q(false);
            }
        } else {
            sVar = sVar2;
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cn.k(tVar2, basicItem, j9, i11, 1);
        }
    }

    public static final void e(t tVar, ProfileCO2Saved profileCO2Saved, Function0 function0, m3.n nVar, int i11) {
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(178778446);
        int i12 = i11 | (sVar.f(tVar) ? 4 : 2) | (sVar.d(R.string.profile_page_impact_co2e_card_header) ? 32 : 16) | (sVar.f(profileCO2Saved) ? 256 : 128) | (sVar.h(function0) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w("");
                sVar.k0(objM);
            }
            b1 b1Var = (b1) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = m3.i.w("");
                sVar.k0(objM2);
            }
            b1 b1Var2 = (b1) objM2;
            String strU = o30.f0.U(sVar, R.string.profile_page_impact_co2e_card_electricity_unit);
            String strU2 = o30.f0.U(sVar, R.string.profile_page_impact_co2e_card_charges_unit);
            String strU3 = o30.f0.U(sVar, R.string.profile_page_impact_co2e_card_coffee_unit);
            String strU4 = o30.f0.U(sVar, R.string.profile_page_impact_co2e_card_shower_unit);
            float f11 = lv.t.f28253g;
            g3.s0.b(b4.a.a(m2.d(d2.c.C(tVar, f11, f11, lv.t.f28251e, lv.t.f28249c), 1.0f), c5.m2.f7291a, new on.l(7, function0)), l2.g.b(o30.e0.s(sVar, R.dimen.profile_card_corner_radius)), g3.s0.p(lv.s.J, sVar, 6), g3.s0.q(2, 0.0f, 0.0f, 0.0f, 62), null, u3.e.e(31760448, sVar, new kh.a(profileCO2Saved, strU, strU2, strU3, strU4, b1Var, b1Var2)), sVar, 196608, 16);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ki.h(tVar, profileCO2Saved, function0, i11, 23);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(boolean z11, boolean z12, y1 y1Var, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, m3.n nVar, int i11) {
        Function0 function06;
        s sVar;
        int i12;
        Object obj;
        Integer numValueOf;
        Object obj2;
        int i13;
        boolean z13;
        Object obj3;
        y1Var.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        function04.getClass();
        function05.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(-2063045025);
        int i14 = i11 | (sVar2.g(z11) ? 4 : 2) | (sVar2.g(z12) ? 32 : 16) | (sVar2.h(y1Var) ? 256 : 128) | (sVar2.h(function0) ? NewHope.SENDB_BYTES : 1024) | (sVar2.h(function02) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar2.h(function03) ? 131072 : 65536) | (sVar2.h(function04) ? 1048576 : 524288) | (sVar2.h(function05) ? 8388608 : 4194304);
        if (sVar2.R(i14 & 1, (i14 & 4793491) != 4793490)) {
            Object objM = sVar2.M();
            Object obj4 = m3.m.f29332a;
            Object obj5 = objM;
            if (objM == obj4) {
                Object objW = m3.i.w(Boolean.FALSE);
                sVar2.k0(objW);
                obj5 = objW;
            }
            b1 b1Var = (b1) obj5;
            c3 c3VarB = t1.d.b(((Boolean) b1Var.getValue()).booleanValue() ? 1.0f : 0.0f, new u1(0, 0, t1.w.f39594b, 3), "", null, sVar2, 3072, 20);
            Unit unit = Unit.f26487a;
            Object objM2 = sVar2.M();
            x70.c cVar = null;
            if (objM2 == obj4) {
                i12 = 1;
                Object jVar = new co.j(b1Var, cVar, i12);
                sVar2.k0(jVar);
                obj = jVar;
            } else {
                i12 = 1;
                obj = objM2;
            }
            m3.i.h(unit, (Function2) obj, sVar2);
            le.p pVarD = o30.e0.D(new le.q("smiley_heart.json"), sVar2, 6);
            int i15 = i12;
            le.h hVarJ = cg.j((he.k) pVarD.getValue(), false, false, 0.0f, 0, sVar2, 1022);
            Object objM3 = sVar2.M();
            Object objW2 = objM3;
            if (objM3 == obj4) {
                objW2 = e0.f.w(z11, sVar2);
            }
            b1 b1Var2 = (b1) objW2;
            b1 b1VarN = m3.i.n(y1Var, sVar2, (i14 >> 6) & 14);
            Context context = (Context) sVar2.j(c5.v0.f7390b);
            g0 g0Var = m2.f13850c;
            t tVarA = f4.g.a(v1.n.j(g0Var, lv.s.f28217b, i4.g0.f23254b), ((Number) c3VarB.getValue()).floatValue());
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            t tVarC = b4.a.c(tVarA, sVar2);
            b5.j.R.getClass();
            Function0 function07 = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(function07);
            } else {
                sVar2.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(u0VarD, gVar, sVar2);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar2);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar2, numValueOf2, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar2, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar2);
            float f11 = lv.t.f28253g;
            q qVar = q.f5711a;
            t tVarZ = d2.c.z(qVar, f11);
            bm.f fVar = new bm.f(9, function05);
            c5.s sVar3 = c5.m2.f7291a;
            v1.n.d(x0.z(R.drawable.ic_close_white24, sVar2, 0), o30.f0.U(sVar2, R.string.loyalty_card_info_cross_voice_over), d2.u.f13938a.a(b4.a.a(tVarZ, sVar3, fVar), b4.d.f5685c), null, null, 0.0f, null, sVar2, 8, 120);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5695n, sVar2, 48);
            int iHashCode2 = Long.hashCode(sVar2.T);
            u3.i iVarL2 = sVar2.l();
            t tVarC2 = b4.a.c(g0Var, sVar2);
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(function07);
            } else {
                sVar2.n0();
            }
            m3.i.C(yVarA, gVar, sVar2);
            m3.i.C(iVarL2, gVar2, sVar2);
            a0.y(iHashCode2, sVar2, gVar3, sVar2, dVar);
            m3.i.C(tVarC2, gVar4, sVar2);
            he.k kVar = (he.k) pVarD.getValue();
            boolean zF = sVar2.f(hVarJ);
            Object objM4 = sVar2.M();
            Object obj6 = objM4;
            if (zF || objM4 == obj4) {
                Object fVar2 = new cg.f(hVarJ, 2);
                sVar2.k0(fVar2);
                obj6 = fVar2;
            }
            x0.g(kVar, (Function0) obj6, m2.q(m2.e(d2.c.D(qVar, 0.0f, 180, 0.0f, 0.0f, 13), AppConstants.RESULT_CODE_ORDER_COLLECTED), 110), false, false, false, false, null, false, b4.d.f5687e, null, false, false, null, null, false, sVar2, MLKEMEngine.KyberPolyBytes, 6, 130040);
            r9.d(o30.f0.U(sVar2, R.string.order_rating_thank_you), d2.c.D(qVar, 0.0f, lv.t.f28254h, 0.0f, 0.0f, 13), lv.s.f28235p, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28267f, sVar2, 432, 12582912, 131064);
            String strU = o30.f0.U(sVar2, z12 ? R.string.order_rating_add_to_favorite_body : R.string.order_rating_feedback_message);
            t tVarD = d2.c.D(qVar, f11, f11, f11, 0.0f, 8);
            m5.u0 u0Var = lv.v.f28274n;
            long j9 = lv.s.J;
            r9.d(strU, tVarD, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, m5.u0.a(u0Var, j9, 0L, null, null, 0L, null, 3, 0L, null, null, 16744446), sVar2, 0, 0, 131068);
            t tVarV = m2.v(d2.c.D(qVar, 0.0f, lv.t.f28256j, 0.0f, 0.0f, 13), 3);
            String strU2 = o30.f0.U(sVar2, z12 ? ((Boolean) b1Var2.getValue()).booleanValue() ? R.string.orderview_added_to_favourites : R.string.orderview_add_to_favourites : R.string.order_rating_see_impact);
            lv.q qVar2 = lv.q.INVERTED;
            lv.e eVar = lv.e.MEDIUM;
            if (z12) {
                numValueOf = Integer.valueOf(((Boolean) b1Var2.getValue()).booleanValue() ? R.drawable.ic_favorite_on : R.drawable.ic_favorite_off);
            } else {
                numValueOf = null;
            }
            int i16 = ((i14 & 112) == 32 ? i15 : 0) | (sVar2.h(context) ? 1 : 0) | ((i14 & 458752) == 131072 ? i15 : 0) | ((i14 & 57344) == 16384 ? i15 : 0);
            Object objM5 = sVar2.M();
            if (i16 != 0 || objM5 == obj4) {
                obj2 = obj4;
                i13 = i15;
                z13 = false;
                Object wVar = new dp.w(z12, context, function03, function02, b1Var2);
                sVar2.k0(wVar);
                objM5 = wVar;
            } else {
                obj2 = obj4;
                i13 = i15;
                z13 = false;
            }
            Object obj7 = obj2;
            boolean z14 = i13;
            v0.n.l(tVarV, strU2, null, qVar2, eVar, false, false, numValueOf, null, (Function0) objM5, sVar2, 27654, 356);
            r9.d(o30.f0.U(sVar2, z12 ? R.string.order_rating_see_all_favourites : R.string.no_email_popup_close_button), d2.c.z(b4.a.a(d2.c.z(qVar, lv.t.f28251e), sVar3, new bm.f(10, function0)), f11), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, m5.u0.a(lv.v.f28281u, j9, 0L, null, null, 0L, null, 3, 0L, null, null, 16744446), sVar2, 0, 0, 131068);
            boolean zBooleanValue = ((Boolean) b1VarN.getValue()).booleanValue();
            boolean z15 = (i14 & 3670016) == 1048576 ? z14 ? 1 : 0 : z13;
            Object objM6 = sVar2.M();
            if (z15 || objM6 == obj7) {
                function06 = function04;
                Object dVar2 = new ar.d(22, function06);
                sVar2.k0(dVar2);
                obj3 = dVar2;
            } else {
                function06 = function04;
                obj3 = objM6;
            }
            cg.j.f(null, zBooleanValue, R.drawable.system_icon_heart_active_primary_30, R.string.added_to_favorites_snack_message, 0L, 0, (Function0) obj3, sVar2, MLKEMEngine.KyberPolyBytes, 97);
            s sVar4 = sVar2;
            sVar4.q(z14);
            sVar4.q(z14);
            sVar = sVar4;
        } else {
            function06 = function04;
            sVar2.U();
            sVar = sVar2;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new pm.o(z11, z12, y1Var, function0, function02, function03, function06, function05, i11);
        }
    }

    public static final long g(float f11, float f12) {
        return (((long) Float.floatToRawIntBits(f12)) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32);
    }

    public static int h(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, androidx.core.app.f.b(context)) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (y9.w.l(r9, r1, kotlin.jvm.internal.Intrinsics.areEqual(r7, r2) ? r0.getWidth() : ed.k.e(r7.f1227a, r8), kotlin.jvm.internal.Intrinsics.areEqual(r7, r2) ? r0.getHeight() : ed.k.e(r7.f1228b, r8), r8) == 1.0d) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap i(android.graphics.drawable.Drawable r5, android.graphics.Bitmap.Config r6, ad.h r7, ad.g r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ba0.g.i(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, ad.h, ad.g, boolean):android.graphics.Bitmap");
    }

    public static final p j(Throwable th2) {
        th2.getClass();
        return new p(th2);
    }

    public static void k(ia0.m mVar, ia0.a0 a0Var) {
        if (mVar.u(a0Var)) {
            return;
        }
        try {
            mVar.I(a0Var, false).close();
        } catch (RuntimeException e5) {
            throw e5;
        } catch (Exception unused) {
        }
    }

    public static final void l(ia0.m mVar, ia0.a0 a0Var) throws IOException {
        try {
            IOException iOException = null;
            for (ia0.a0 a0Var2 : mVar.A(a0Var)) {
                try {
                    if (mVar.B(a0Var2).f805c) {
                        l(mVar, a0Var2);
                    }
                    mVar.r(a0Var2);
                } catch (IOException e5) {
                    if (iOException == null) {
                        iOException = e5;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    public static final float m(e0 e0Var) {
        return e0Var.n().f22910e == h2.Horizontal ? Float.intBitsToFloat((int) (e0Var.r() >> 32)) : Float.intBitsToFloat((int) (e0Var.r() & 4294967295L));
    }

    public static final float n(float f11) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f11)) & 8589934591L) / ((long) 3))) + 709952852);
        float f12 = fIntBitsToFloat - ((fIntBitsToFloat - (f11 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f12 - ((f12 - (f11 / (f12 * f12))) * 0.33333334f);
    }

    public static final String o(String str, cy.a aVar) {
        str.getClass();
        aVar.getClass();
        if (!B(str)) {
            throw new FacebookException("Invalid Code Verifier.");
        }
        if (aVar == cy.a.PLAIN) {
            return str;
        }
        try {
            byte[] bytes = str.getBytes(Charsets.f26580d);
            bytes.getClass();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bytes, 0, bytes.length);
            String strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
            strEncodeToString.getClass();
            return strEncodeToString;
        } catch (Exception e5) {
            throw new FacebookException(e5);
        }
    }

    public static final void p(Context context, String str, int i11, int i12, int i13, int i14, boolean z11, Function1 function1) {
        context.getClass();
        str.getClass();
        td.e eVar = new td.e(context);
        eVar.f39959c = str;
        eVar.f39960d = new i2(function1, z11, i14, function1);
        yd.b[] bVarArr = {new rm.a(d70.b.a(i13), i14)};
        fd.j jVar = td.j.f40016a;
        td.j.a(eVar, kotlin.collections.y.T(bVarArr));
        dx.f.a(i11);
        ud.a aVar = new ud.a(i11);
        dx.f.a(i12);
        eVar.f39969n = new ud.e(new ud.h(aVar, new ud.a(i12)));
        eVar.f39970o = ud.g.FILL;
        fd.w.a(context).a(eVar.a());
    }

    public static pj.e q() {
        return new pj.e(R.string.trackingoptin_how_long_headline, new pj.c(R.string.trackingoptin_how_long_description, R.string.trackingoptin_privacy_policy_link_part, R.string.default_privacy_policy_link), null, null, d0.d(new pj.d(R.string.trackingoptin_how_long_bullet_headline_1, R.string.trackingoptin_how_long_bullet_description_1), new pj.d(R.string.trackingoptin_how_long_bullet_headline_2, R.string.trackingoptin_how_long_bullet_description_2), new pj.d(R.string.trackingoptin_how_long_bullet_headline_3, R.string.trackingoptin_how_long_bullet_description_3), new pj.d(R.string.trackingoptin_how_long_bullet_headline_4, R.string.trackingoptin_how_long_bullet_description_4)), 12);
    }

    public static pj.e r() {
        return new pj.e(R.string.trackingoptin_marketing_description_header_2, null, d0.d(Integer.valueOf(R.string.trackingoptin_marketing_bullet1), Integer.valueOf(R.string.trackingoptin_marketing_bullet2), Integer.valueOf(R.string.trackingoptin_marketing_bullet3), Integer.valueOf(R.string.trackingoptin_marketing_bullet4), Integer.valueOf(R.string.trackingoptin_marketing_bullet5), Integer.valueOf(R.string.trackingoptin_marketing_bullet6)), null, null, 26);
    }

    public static pj.e s() {
        return new pj.e(R.string.trackingoptin_sharing_description_header, null, null, d0.d(new pj.f(R.string.trackingoptin_service_appier, R.string.trackingoptin_purpose_appier, "https://www.appier.com/en/about/privacy-policy/", R.string.trackingoptin_expiry_13_months, R.string.trackingoptin_provider_appier, null), new pj.f(R.string.trackingoptin_service_appnext, R.string.trackingoptin_purpose_appnext, "https://www.appnext.com/privacy-policy-oem-operators/", R.string.trackingoptin_expiry_4_weeks, R.string.trackingoptin_provider_appnext, null), new pj.f(R.string.trackingoptin_service_appsflyer, R.string.trackingoptin_purpose_appsflyer, "https://www.appsflyer.com/legal/services-privacy-policy/", R.string.trackingoptin_expiry_24_months, R.string.trackingoptin_provider_toogoodtogo, null), new pj.f(R.string.trackingoptin_service_facebook, R.string.trackingoptin_purpose_facebook, "https://www.facebook.com/privacy/policy", R.string.trackingoptin_expiry_24_months, R.string.trackingoptin_provider_facebook, Integer.valueOf(R.string.trackingoptin_name_facebook)), new pj.f(R.string.trackingoptin_service_google_firebase_analytics, R.string.trackingoptin_purpose_google_firebase_analytics, "https://policies.google.com/privacy", R.string.trackingoptin_expiry_14_months, R.string.trackingoptin_provider_google, null), new pj.f(R.string.trackingoptin_service_google_ads, R.string.trackingoptin_purpose_google_ads, "https://policies.google.com/privacy", R.string.trackingoptin_expiry_18_months, R.string.trackingoptin_provider_google_ads, null), new pj.f(R.string.trackingoptin_service_linkedin, R.string.trackingoptin_purpose_linkedin, "https://www.linkedin.com/legal/privacy-policy", R.string.trackingoptin_expiry_24_months, R.string.trackingoptin_provider_linkedin, null), new pj.f(R.string.trackingoptin_service_metasdk, R.string.trackingoptin_purpose_metasdk, "https://www.facebook.com/privacy/policy", R.string.trackingoptin_expiry_90_days, R.string.trackingoptin_provider_facebook, null), new pj.f(R.string.trackingoptin_service_microsoft_bing_ads, R.string.trackingoptin_purpose_microsoft_bing_ads, "https://privacy.microsoft.com/en-us/privacystatement", R.string.trackingoptin_expiry_24_months, R.string.trackingoptin_provider_microsoft_bing_ads, null), new pj.f(R.string.trackingoptin_service_moloco, R.string.trackingoptin_purpose_moloco, "https://www.moloco.com/advertising-policy", R.string.trackingoptin_expiry_24_months, R.string.trackingoptin_provider_moloco, null), new pj.f(R.string.trackingoptin_service_reddit_ads, R.string.trackingoptin_purpose_reddit_ads, "https://www.reddit.com/policies/privacy-policy", R.string.trackingoptin_expiry_25_months, R.string.trackingoptin_provider_reddit_ads, null), new pj.f(R.string.trackingoptin_service_samsung_unity_aura_service, R.string.trackingoptin_purpose_samsung_unity_aura_service, "https://unity.com/legal/game-player-and-app-user-privacy-policy", R.string.trackingoptin_expiry_up_to_12_months, R.string.trackingoptin_provider_samsung_unity_aura_service, null), new pj.f(R.string.trackingoptin_service_searchads, R.string.trackingoptin_purpose_searchads, "https://www.apple.com/legal/privacy/", R.string.trackingoptin_expiry_30_days, R.string.trackingoptin_provider_searchads, null), new pj.f(R.string.trackingoptin_service_tiktok, R.string.trackingoptin_purpose_tiktok, "https://www.tiktok.com/legal/page/eea/privacy-policy/en", R.string.trackingoptin_expiry_24_months, R.string.trackingoptin_provider_tiktok, null), new pj.f(R.string.trackingoptin_service_trackad, R.string.trackingoptin_purpose_trackad, "https://www.trackad.ai/en/privacy-policy/", R.string.trackingoptin_expiry_24_months, R.string.trackingoptin_provider_trackad, null)), null, 22);
    }

    public static int t(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return a3.m(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e5) {
            Log.e("IconCompat", "Unable to get icon resource", e5);
            return 0;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon resource", e11);
            return 0;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon resource", e12);
            return 0;
        }
    }

    public static String u(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return a3.n(obj);
        }
        try {
            return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
        } catch (IllegalAccessException e5) {
            Log.e("IconCompat", "Unable to get icon package", e5);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon package", e11);
            return null;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon package", e12);
            return null;
        }
    }

    public static f00.c v(Context context) {
        i0.h(context);
        return new f00.c(context, new jz.m());
    }

    public static pj.e w() {
        return new pj.e(R.string.trackingoptin_required_description_header_2, null, d0.d(Integer.valueOf(R.string.trackingoptin_required_bullet1), Integer.valueOf(R.string.trackingoptin_required_bullet2), Integer.valueOf(R.string.trackingoptin_required_bullet3), Integer.valueOf(R.string.trackingoptin_required_bullet4), Integer.valueOf(R.string.trackingoptin_required_bullet5), Integer.valueOf(R.string.trackingoptin_required_bullet6), Integer.valueOf(R.string.trackingoptin_required_bullet7), Integer.valueOf(R.string.trackingoptin_required_bullet8), Integer.valueOf(R.string.trackingoptin_required_bullet9), Integer.valueOf(R.string.trackingoptin_required_bullet10), Integer.valueOf(R.string.trackingoptin_required_bullet11), Integer.valueOf(R.string.trackingoptin_required_bullet12), Integer.valueOf(R.string.trackingoptin_required_bullet13), Integer.valueOf(R.string.trackingoptin_required_bullet14), Integer.valueOf(R.string.trackingoptin_required_bullet15)), null, null, 26);
    }

    public static pj.e x() {
        return new pj.e(R.string.trackingoptin_sharing_description_header, null, null, d0.d(new pj.f(R.string.trackingoptin_service_adyen, R.string.trackingoptin_purpose_adyen, "https://www.adyen.com/policies-and-disclaimer/privacy-policy", R.string.trackingoptin_expiry_while_user, R.string.trackingoptin_provider_adyen, null), new pj.f(R.string.trackingoptin_service_appsflyer_onelink, R.string.trackingoptin_purpose_appsflyer_onelink, "https://www.appsflyer.com/legal/processing-customer-data/", R.string.trackingoptin_expiry_session, R.string.trackingoptin_provider_appsflyer_onelink, null), new pj.f(R.string.trackingoptin_service_braze, R.string.trackingoptin_purpose_braze, "https://www.braze.com/company/legal/privacy/", R.string.trackingoptin_expiry_while_push_optin, R.string.trackingoptin_provider_braze, null), new pj.f(R.string.trackingoptin_service_fingerprint_js, R.string.trackingoptin_purpose_fingerprint_js, "https://www.toogoodtogo.com/en-us/privacy", R.string.trackingoptin_expiry_13_months, R.string.trackingoptin_provider_toogoodtogo_self_host, null), new pj.f(R.string.trackingoptin_service_google_firebase, R.string.trackingoptin_purpose_google_firebase, "https://policies.google.com/privacy", R.string.trackingoptin_expiry_90_days, R.string.trackingoptin_provider_google, null)), null, 22);
    }

    public static int y(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return a3.t(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e5) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e5);
            return -1;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e11);
            return -1;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon type " + obj, e12);
            return -1;
        }
    }

    public static Uri z(Object obj) {
        if (Build.VERSION.SDK_INT >= 28) {
            return a3.u(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e5) {
            Log.e("IconCompat", "Unable to get icon uri", e5);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.e("IconCompat", "Unable to get icon uri", e11);
            return null;
        } catch (InvocationTargetException e12) {
            Log.e("IconCompat", "Unable to get icon uri", e12);
            return null;
        }
    }
}
