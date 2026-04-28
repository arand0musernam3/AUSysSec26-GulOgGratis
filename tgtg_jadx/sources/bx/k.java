package bx;

import a3.m1;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.media.ImageWriter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.Spanned;
import android.util.Log;
import android.view.Surface;
import android.widget.TextView;
import androidx.credentials.exceptions.CreateCredentialException;
import b4.q;
import b4.t;
import bx.o;
import c5.v0;
import c5.x1;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.item.response.FlashSalesItem;
import com.app.tgtg.model.remote.order.OrderState;
import com.app.tgtg.model.remote.payment.Price;
import com.app.tgtg.model.remote.profile.ProfileCO2Saved;
import com.app.tgtg.model.remote.profile.response.ProfileScreenResponse;
import com.app.tgtg.model.remote.profile.response.StoreSignupCardDetails;
import d2.b2;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.n1;
import d2.p;
import d2.w;
import d2.y;
import d2.z;
import d2.z1;
import d40.t1;
import d6.j0;
import e0.o1;
import g3.r9;
import g3.u;
import g3.v;
import h7.i0;
import i4.g0;
import i4.k0;
import j5.r;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.d0;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.KSerializer;
import m0.i1;
import m3.b1;
import m3.c3;
import m3.d3;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import m90.c1;
import m90.j1;
import m90.k1;
import m90.s0;
import m90.s1;
import mv.p0;
import mv.r0;
import o00.x0;
import o30.e0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import t1.u1;
import w.a0;
import z4.c0;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f6727a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static p4.f f6728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f6729c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f6730d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f6731e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f6732f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f6733g = 0;

    public static final synchronized void A(se.b bVar) {
        x xVar;
        if (yx.a.f46339a.contains(k.class)) {
            return;
        }
        try {
            bVar.getClass();
            w wVarA = i.a();
            for (b bVar2 : bVar.r()) {
                synchronized (bVar) {
                    bVar2.getClass();
                    xVar = (x) ((HashMap) bVar.f39010b).get(bVar2);
                }
                if (xVar == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                wVarA.a(bVar2, xVar.c());
            }
            i.b(wVarA);
        } catch (Throwable th2) {
            yx.a.a(k.class, th2);
        }
    }

    public static final Class B(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            rawType.getClass();
            return B(rawType);
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            upperBounds.getClass();
            Object objX = kotlin.collections.y.x(upperBounds);
            objX.getClass();
            return B((Type) objX);
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            genericComponentType.getClass();
            return B(genericComponentType);
        }
        StringBuilder sb2 = new StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
        sb2.append(type);
        i1.m(sb2, " has type ", Reflection.getOrCreateKotlinClass(type.getClass()));
        return null;
    }

    public static final KSerializer C(i2.x xVar, Class cls, List list) throws IllegalAccessException, InvocationTargetException {
        KSerializer[] kSerializerArr = (KSerializer[]) list.toArray(new KSerializer[0]);
        KSerializer kSerializerD = c1.d(cls, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (kSerializerD != null) {
            return kSerializerD;
        }
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(cls);
        v70.i iVar = j1.f29816a;
        orCreateKotlinClass.getClass();
        KSerializer kSerializer = (KSerializer) j1.f29816a.get(orCreateKotlinClass);
        if (kSerializer != null) {
            return kSerializer;
        }
        KSerializer kSerializerD2 = xVar.d(orCreateKotlinClass, list);
        if (kSerializerD2 != null) {
            return kSerializerD2;
        }
        if (cls.isInterface()) {
            return new i90.d(Reflection.getOrCreateKotlinClass(cls));
        }
        return null;
    }

    public static CreateCredentialException D(Intent intent) {
        if (Build.VERSION.SDK_INT >= 34) {
            return i0.c(intent);
        }
        int i11 = CreateCredentialException.f2801a;
        Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_EXCEPTION");
        if (bundleExtra == null) {
            return null;
        }
        String string = bundleExtra.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
        if (string != null) {
            return e0.G(bundleExtra.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string);
        }
        i4.a.f("Bundle was missing exception type.");
        return null;
    }

    public static n7.c E(String str, Intent intent) {
        String string;
        Bundle bundle;
        if (Build.VERSION.SDK_INT >= 34) {
            return i0.d(str, intent);
        }
        Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.CREATE_CREDENTIAL_RESPONSE");
        if (bundleExtra == null || (string = bundleExtra.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_RESPONSE_TYPE")) == null || (bundle = bundleExtra.getBundle("androidx.credentials.provider.extra.CREATE_CREDENTIAL_REQUEST_DATA")) == null) {
            return null;
        }
        return p30.b.o(bundle, string);
    }

    public static final KSerializer F(i2.x xVar, Type type, boolean z11) {
        ArrayList<KSerializer> arrayList;
        KSerializer kSerializerF;
        KSerializer kSerializerF2;
        KClass orCreateKotlinClass;
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            if (genericComponentType instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) genericComponentType).getUpperBounds();
                upperBounds.getClass();
                genericComponentType = (Type) kotlin.collections.y.x(upperBounds);
            }
            genericComponentType.getClass();
            if (z11) {
                kSerializerF2 = ba0.g.G(xVar, genericComponentType);
            } else {
                xVar.getClass();
                kSerializerF2 = F(xVar, genericComponentType, false);
                if (kSerializerF2 == null) {
                    return null;
                }
            }
            if (genericComponentType instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) genericComponentType).getRawType();
                rawType.getClass();
                orCreateKotlinClass = Reflection.getOrCreateKotlinClass((Class) rawType);
            } else {
                if (!(genericComponentType instanceof KClass)) {
                    i1.q(Reflection.getOrCreateKotlinClass(genericComponentType.getClass()), "unsupported type in GenericArray: ");
                    return null;
                }
                orCreateKotlinClass = (KClass) genericComponentType;
            }
            orCreateKotlinClass.getClass();
            return new k1(orCreateKotlinClass, kSerializerF2);
        }
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!cls.isArray() || cls.getComponentType().isPrimitive()) {
                return C(xVar, cls, n0.f26529a);
            }
            Class<?> componentType = cls.getComponentType();
            componentType.getClass();
            if (z11) {
                kSerializerF = ba0.g.G(xVar, componentType);
            } else {
                xVar.getClass();
                kSerializerF = F(xVar, componentType, false);
                if (kSerializerF == null) {
                    return null;
                }
            }
            KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(componentType);
            orCreateKotlinClass2.getClass();
            return new k1(orCreateKotlinClass2, kSerializerF);
        }
        if (!(type instanceof ParameterizedType)) {
            if (!(type instanceof WildcardType)) {
                StringBuilder sb2 = new StringBuilder("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument ");
                sb2.append(type);
                i1.m(sb2, " has type ", Reflection.getOrCreateKotlinClass(type.getClass()));
                return null;
            }
            Type[] upperBounds2 = ((WildcardType) type).getUpperBounds();
            upperBounds2.getClass();
            Object objX = kotlin.collections.y.x(upperBounds2);
            objX.getClass();
            return F(xVar, (Type) objX, true);
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType2 = parameterizedType.getRawType();
        rawType2.getClass();
        Class cls2 = (Class) rawType2;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        actualTypeArguments.getClass();
        if (z11) {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type2 : actualTypeArguments) {
                type2.getClass();
                arrayList.add(ba0.g.G(xVar, type2));
            }
        } else {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type3 : actualTypeArguments) {
                type3.getClass();
                xVar.getClass();
                KSerializer kSerializerF3 = F(xVar, type3, false);
                if (kSerializerF3 == null) {
                    return null;
                }
                arrayList.add(kSerializerF3);
            }
        }
        if (Set.class.isAssignableFrom(cls2)) {
            KSerializer kSerializer = (KSerializer) arrayList.get(0);
            kSerializer.getClass();
            return new m90.d(kSerializer, 2);
        }
        if (List.class.isAssignableFrom(cls2) || Collection.class.isAssignableFrom(cls2)) {
            KSerializer kSerializer2 = (KSerializer) arrayList.get(0);
            kSerializer2.getClass();
            return new m90.d(kSerializer2, 0);
        }
        if (Map.class.isAssignableFrom(cls2)) {
            return f0.j((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1));
        }
        if (Map.Entry.class.isAssignableFrom(cls2)) {
            KSerializer kSerializer3 = (KSerializer) arrayList.get(0);
            KSerializer kSerializer4 = (KSerializer) arrayList.get(1);
            kSerializer3.getClass();
            kSerializer4.getClass();
            return new s0(kSerializer3, kSerializer4, 0);
        }
        if (Pair.class.isAssignableFrom(cls2)) {
            KSerializer kSerializer5 = (KSerializer) arrayList.get(0);
            KSerializer kSerializer6 = (KSerializer) arrayList.get(1);
            kSerializer5.getClass();
            kSerializer6.getClass();
            return new s0(kSerializer5, kSerializer6, 1);
        }
        if (u70.u.class.isAssignableFrom(cls2)) {
            KSerializer kSerializer7 = (KSerializer) arrayList.get(0);
            KSerializer kSerializer8 = (KSerializer) arrayList.get(1);
            KSerializer kSerializer9 = (KSerializer) arrayList.get(2);
            kSerializer7.getClass();
            kSerializer8.getClass();
            kSerializer9.getClass();
            return new s1(kSerializer7, kSerializer8, kSerializer9);
        }
        ArrayList arrayList2 = new ArrayList(kotlin.collections.e0.o(arrayList, 10));
        for (KSerializer kSerializer10 : arrayList) {
            kSerializer10.getClass();
            arrayList2.add(kSerializer10);
        }
        return C(xVar, cls2, arrayList2);
    }

    public static void G(TextView textView, CharSequence charSequence) {
        CharSequence text = textView.getText();
        if (charSequence != text) {
            if (charSequence == null && text.length() == 0) {
                return;
            }
            if (!(charSequence instanceof Spanned)) {
                if ((charSequence == null) == (text == null)) {
                    if (charSequence == null) {
                        return;
                    }
                    int length = charSequence.length();
                    if (length == text.length()) {
                        for (int i11 = 0; i11 < length; i11++) {
                            if (charSequence.charAt(i11) == text.charAt(i11)) {
                            }
                        }
                        return;
                    }
                }
            } else if (charSequence.equals(text)) {
                return;
            }
            textView.setText(charSequence);
        }
    }

    public static final Pair H(Object obj, dv.c cVar) {
        return new Pair(obj, cVar);
    }

    public static Object I(Class cls, String str, dn.k... kVarArr) {
        int length = kVarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i11 = 0; i11 < kVarArr.length; i11++) {
            dn.k kVar = kVarArr[i11];
            kVar.getClass();
            clsArr[i11] = (Class) kVar.f15018b;
            objArr[i11] = kVarArr[i11].f15019c;
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }

    public static final void a(b4.t tVar, final FlashSalesItem flashSalesItem, boolean z11, final Function1 function1, final Function0 function0, m3.n nVar, int i11, int i12) {
        boolean z12;
        int i13;
        b4.t tVar2;
        flashSalesItem.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-377581331);
        int i14 = i11 | 6 | (sVar.h(flashSalesItem) ? 32 : 16);
        int i15 = i12 & 4;
        if (i15 != 0) {
            i13 = i14 | MLKEMEngine.KyberPolyBytes;
            z12 = z11;
        } else {
            z12 = z11;
            i13 = i14 | (sVar.g(z12) ? 256 : 128);
        }
        int i16 = i13 | (sVar.h(function1) ? NewHope.SENDB_BYTES : 1024) | (sVar.h(function0) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192);
        if (sVar.R(i16 & 1, (i16 & 9363) != 9362)) {
            final boolean z13 = i15 != 0 ? false : z12;
            final String strA = r0.a((Context) sVar.j(v0.f7390b), flashSalesItem);
            String intervalEnd = mv.d.l(flashSalesItem).getIntervalEnd();
            x70.c cVar = null;
            Long lValueOf = intervalEnd != null ? Long.valueOf(p0.h(intervalEnd)) : null;
            long jCurrentTimeMillis = System.currentTimeMillis();
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = new m3.i1(lValueOf != null ? lValueOf.longValue() - jCurrentTimeMillis : 0L);
                sVar.k0(objM);
            }
            m3.i1 i1Var = (m3.i1) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = e0.f.w(lValueOf == null || i1Var.h() < 1000 || flashSalesItem.getItemsAvailable() < 1, sVar);
            }
            final b1 b1Var = (b1) objM2;
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                objM3 = m3.i.w("");
                sVar.k0(objM3);
            }
            final b1 b1Var2 = (b1) objM3;
            final long j9 = !((Boolean) b1Var.getValue()).booleanValue() ? lv.s.C : lv.s.D;
            final float f11 = !((Boolean) b1Var.getValue()).booleanValue() ? 1.0f : 0.5f;
            Object objM4 = sVar.M();
            if (objM4 == fVar) {
                co.n nVar2 = new co.n(i1Var, b1Var, b1Var2, cVar, 1);
                sVar.k0(nVar2);
                objM4 = nVar2;
            }
            m3.i.h(flashSalesItem, (Function2) objM4, sVar);
            d3 d3Var = x1.f7416h;
            m3.i.a(b3.i.t(((z5.c) sVar.j(d3Var)).a(), 1.0f, d3Var), u3.e.e(1197409325, sVar, new Function2() { // from class: eg.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    n nVar3 = (n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    s sVar2 = (s) nVar3;
                    if (sVar2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final float fE = d70.a.e(sVar2, w.b.u((Context) sVar2.j(v0.f7390b)));
                        final boolean z14 = z13;
                        t tVarE = m2.e(q.f5711a, z14 ? 275 : 283);
                        String str = strA;
                        boolean zF = sVar2.f(str);
                        Object objM5 = sVar2.M();
                        m3.f fVar2 = m.f29332a;
                        if (zF || objM5 == fVar2) {
                            objM5 = new c60.e(str, 20);
                            sVar2.k0(objM5);
                        }
                        t tVarA = d2.c.A(r.c(tVarE, false, (Function1) objM5), z14 ? lv.t.f28249c : lv.t.f28251e, z14 ? lv.t.f28249c : lv.t.f28251e);
                        u uVarP = g3.s0.p(lv.s.J, sVar2, 6);
                        l2.f fVarB = l2.g.b(12);
                        v vVarQ = g3.s0.q(2, 0.0f, 0.0f, 0.0f, 62);
                        Function1 function12 = function1;
                        boolean zF2 = sVar2.f(function12);
                        final FlashSalesItem flashSalesItem2 = flashSalesItem;
                        boolean zH = zF2 | sVar2.h(flashSalesItem2);
                        Object objM6 = sVar2.M();
                        if (zH || objM6 == fVar2) {
                            objM6 = new bs.b(24, function12, flashSalesItem2);
                            sVar2.k0(objM6);
                        }
                        Function0 function02 = (Function0) objM6;
                        final b1 b1Var3 = b1Var;
                        final long j11 = j9;
                        final float f12 = f11;
                        final Function0 function03 = function0;
                        final b1 b1Var4 = b1Var2;
                        g3.s0.c(function02, tVarA, false, fVarB, uVarP, vVarQ, u3.e.e(-708397096, sVar2, new i80.n() { // from class: eg.c
                            @Override // i80.n
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                n nVar4 = (n) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((z) obj3).getClass();
                                s sVar3 = (s) nVar4;
                                if (sVar3.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    boolean z15 = z14;
                                    q qVar = q.f5711a;
                                    t tVarQ = z15 ? m2.q(qVar, fE) : m2.d(qVar, 1.0f);
                                    b1 b1Var5 = b1Var3;
                                    t tVarThen = tVarQ.then(((Boolean) b1Var5.getValue()).booleanValue() ? v1.n.j(qVar, lv.s.K, g0.f23254b) : v1.n.i(qVar, new k0(d0.h(new i4.v(lv.s.f28237r), new i4.v(lv.s.J)), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L)), 0.0f, 6));
                                    u0 u0VarD = p.d(b4.d.f5683a, false);
                                    int iHashCode = Long.hashCode(sVar3.T);
                                    u3.i iVarL = sVar3.l();
                                    t tVarC = b4.a.c(tVarThen, sVar3);
                                    b5.j.R.getClass();
                                    b5.h hVar = b5.i.f5839b;
                                    sVar3.e0();
                                    if (sVar3.S) {
                                        sVar3.k(hVar);
                                    } else {
                                        sVar3.n0();
                                    }
                                    b5.g gVar = b5.i.f5843f;
                                    m3.i.C(u0VarD, gVar, sVar3);
                                    b5.g gVar2 = b5.i.f5842e;
                                    m3.i.C(iVarL, gVar2, sVar3);
                                    Integer numValueOf = Integer.valueOf(iHashCode);
                                    b5.g gVar3 = b5.i.f5844g;
                                    m3.i.v(sVar3, numValueOf, gVar3);
                                    b5.d dVar = b5.i.f5845h;
                                    m3.i.z(sVar3, dVar);
                                    b5.g gVar4 = b5.i.f5841d;
                                    m3.i.C(tVarC, gVar4, sVar3);
                                    y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar3, 0);
                                    int iHashCode2 = Long.hashCode(sVar3.T);
                                    u3.i iVarL2 = sVar3.l();
                                    t tVarC2 = b4.a.c(qVar, sVar3);
                                    sVar3.e0();
                                    if (sVar3.S) {
                                        sVar3.k(hVar);
                                    } else {
                                        sVar3.n0();
                                    }
                                    m3.i.C(yVarA, gVar, sVar3);
                                    m3.i.C(iVarL2, gVar2, sVar3);
                                    a0.y(iHashCode2, sVar3, gVar3, sVar3, dVar);
                                    m3.i.C(tVarC2, gVar4, sVar3);
                                    String str2 = (String) b1Var4.getValue();
                                    boolean zBooleanValue = ((Boolean) b1Var5.getValue()).booleanValue();
                                    FlashSalesItem flashSalesItem3 = flashSalesItem2;
                                    long j12 = j11;
                                    android.support.v4.media.session.a.c(flashSalesItem3, str2, zBooleanValue, j12, f12, sVar3, 0);
                                    b0.a0.c(null, flashSalesItem3, false, false, 0L, function03, null, sVar3, 0, 93);
                                    o.r(null, flashSalesItem3, j12, sVar3, 0);
                                    ex.i.h(m2.d(m2.e(qVar, 2), 1.0f), lv.s.H, sVar3, 54);
                                    t1.i(null, flashSalesItem3, j12, false, ((Boolean) b1Var5.getValue()).booleanValue(), sVar3, 0, 9);
                                    sVar3.q(true);
                                    sVar3.q(true);
                                } else {
                                    sVar3.U();
                                }
                                return Unit.f26487a;
                            }
                        }), sVar2, 100663296, 196);
                    } else {
                        sVar2.U();
                    }
                    return Unit.f26487a;
                }
            }), sVar, 56);
            z12 = z13;
            tVar2 = b4.q.f5711a;
        } else {
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new eg.b(tVar2, flashSalesItem, z12, function1, function0, i11, i12);
        }
    }

    public static final void b(a3.t tVar, b4.f fVar, u3.d dVar, m3.n nVar, int i11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1090171650);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? sVar.f(tVar) : sVar.h(tVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(fVar) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(dVar) ? 256 : 128;
        }
        boolean z11 = false;
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            boolean z12 = (i12 & 112) == 32;
            if ((i12 & 14) == 4 || ((i12 & 8) != 0 && sVar.f(tVar))) {
                z11 = true;
            }
            boolean z13 = z12 | z11;
            Object objM = sVar.M();
            if (z13 || objM == m3.m.f29332a) {
                objM = new a3.n(fVar, tVar);
                sVar.k0(objM);
            }
            d6.r.a((a3.n) objM, null, new j0(15), dVar, sVar, ((i12 << 3) & 7168) | MLKEMEngine.KyberPolyBytes, 2);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.a(tVar, fVar, dVar, i11, 0);
        }
    }

    public static final void c(boolean z11, Function1 function1, m3.n nVar, int i11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(50811377);
        if ((i11 & 6) == 0) {
            i12 = (sVar.g(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function1) ? 32 : 16;
        }
        int i13 = 1;
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 0);
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
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            g3.i2.a(x0.z(z11 ? R.drawable.ic_notification_bell_on : R.drawable.ic_notification_bell_off, sVar, 0), null, b4.a.a(qVar, c5.m2.f7291a, new fg.j(function1, z11)), lv.s.f28217b, sVar, 3128, 0);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new e.p(z11, function1, i11, i13);
        }
    }

    public static final void d(Function0 function0, m3.n nVar, int i11) {
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(496192043);
        int i12 = (sVar.h(function0) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            b4.i iVar = b4.d.f5695n;
            boolean z11 = (i12 & 14) == 4;
            Object objM = sVar.M();
            if (z11 || objM == m3.m.f29332a) {
                objM = new ki.a(25, function0);
                sVar.k0(objM);
            }
            b4.q qVar = b4.q.f5711a;
            b4.t tVarC = androidx.compose.foundation.b.c(qVar, false, null, null, (Function0) objM, 15);
            d2.y yVarA = d2.w.a(d2.i.f13803c, iVar, sVar, 48);
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
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC2, b5.i.f5841d, sVar);
            v1.n.d(x0.z(R.drawable.system_icon_cancel_order_view, sVar, 0), null, null, null, null, 0.0f, null, sVar, 56, 124);
            r9.d(f0.U(sVar, R.string.orderview_cancel_button), d2.c.D(qVar, 0.0f, 5, 0.0f, 0.0f, 13), lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28276p, sVar, 432, 12582912, 131064);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cg.z(i11, 8, function0);
        }
    }

    public static final void e(Function0 function0, m3.n nVar, int i11) {
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(380280488);
        int i12 = (sVar.h(function0) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            b4.i iVar = b4.d.f5695n;
            boolean z11 = (i12 & 14) == 4;
            Object objM = sVar.M();
            if (z11 || objM == m3.m.f29332a) {
                objM = new ki.a(24, function0);
                sVar.k0(objM);
            }
            b4.q qVar = b4.q.f5711a;
            b4.t tVarC = androidx.compose.foundation.b.c(qVar, false, null, null, (Function0) objM, 15);
            d2.y yVarA = d2.w.a(d2.i.f13803c, iVar, sVar, 48);
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
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC2, b5.i.f5841d, sVar);
            v1.n.d(x0.z(R.drawable.system_icon_help_center, sVar, 0), null, null, null, null, 0.0f, new i4.o(lv.s.f28217b, 5), sVar, 1572920, 60);
            r9.d(f0.U(sVar, R.string.order_contact_us_button), d2.c.D(qVar, 0.0f, 5, 0.0f, 0.0f, 13), lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28276p, sVar, 432, 12582912, 131064);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cg.z(i11, 7, function0);
        }
    }

    public static final void f(b4.t tVar, z1 z1Var, gh.c cVar, Function0 function0, m3.n nVar, int i11) {
        z1 b2Var;
        function0.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(665485869);
        int i12 = i11 | 48 | (sVar.h(cVar) ? 256 : 128) | (sVar.h(function0) ? NewHope.SENDB_BYTES : 1024);
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            float f11 = lv.t.f28253g;
            b2Var = new b2(f11, f11, f11, lv.t.f28252f);
            g3.s0.b(b4.a.a(d2.c.y(m2.t(m2.d(tVar, 1.0f), 3), b2Var), c5.m2.f7291a, new on.l(5, function0)), l2.g.b(e0.s(sVar, R.dimen.profile_card_corner_radius)), g3.s0.p(lv.s.f28240u, sVar, 6), null, null, u3.e.e(-1813281121, sVar, new oo.s(4, cVar, tVar)), sVar, 196608, 24);
        } else {
            sVar.U();
            b2Var = z1Var;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new lp.v(tVar, b2Var, i11, cVar, function0, 9);
        }
    }

    public static final void g(ProfileScreenResponse profileScreenResponse, Function0 function0, Function0 function02, m3.n nVar, int i11) {
        double d3;
        float f11;
        profileScreenResponse.getClass();
        function0.getClass();
        function02.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1084028006);
        int i12 = i11 | (sVar.h(profileScreenResponse) ? 4 : 2) | (sVar.h(function0) ? 32 : 16) | (sVar.h(function02) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            b4.q qVar = b4.q.f5711a;
            b4.t tVarT = m2.t(m2.d(qVar, 1.0f), 3);
            i2 i2VarA = h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarT, sVar);
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
            b4.t tVarT2 = m2.t(qVar, 3);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                d3 = 0.0d;
                f11 = Float.MAX_VALUE;
            } else {
                d3 = 0.0d;
                f11 = 1.0f;
            }
            b4.t tVarThen = tVarT2.then(new n1(f11, true));
            ProfileCO2Saved co2eSaved = profileScreenResponse.getCo2eSaved();
            boolean z11 = (i12 & 112) == 32;
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (z11 || objM == fVar) {
                objM = new oo.z(21, function0);
                sVar.k0(objM);
            }
            ba0.g.e(tVarThen, co2eSaved, (Function0) objM, sVar, 0);
            b4.t tVarT3 = m2.t(qVar, 3);
            if (1.0f <= d3) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            b4.t tVarThen2 = tVarT3.then(new n1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            Price moneySaved = profileScreenResponse.getMoneySaved();
            boolean z12 = (i12 & 896) == 256;
            Object objM2 = sVar.M();
            if (z12 || objM2 == fVar) {
                objM2 = new oo.z(22, function02);
                sVar.k0(objM2);
            }
            o.x(tVarThen2, moneySaved, (Function0) objM2, sVar, 0);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ki.h(profileScreenResponse, function0, function02, false, i11, 24);
        }
    }

    public static final void h(StoreSignupCardDetails storeSignupCardDetails, Function0 function0, Function0 function02, m3.n nVar, int i11) {
        function0.getClass();
        function02.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(341146330);
        int i12 = (sVar.h(storeSignupCardDetails) ? 4 : 2) | i11 | (sVar.h(function0) ? 32 : 16) | (sVar.h(function02) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            b4.t tVarT = m2.t(m2.d(b4.q.f5711a, 1.0f), 3);
            float f11 = lv.t.f28253g;
            g3.s0.b(d2.c.C(tVarT, f11, f11, f11, lv.t.f28249c), l2.g.b(e0.s(sVar, R.dimen.profile_card_corner_radius)), null, null, null, u3.e.e(36576168, sVar, new ap.e(function02, storeSignupCardDetails, function0, 26)), sVar, 196614, 28);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new rs.b(storeSignupCardDetails, function0, function02, i11, 12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final a3.t r18, final boolean r19, final x5.j r20, final boolean r21, long r22, final float r24, final b4.t r25, m3.n r26, final int r27, final int r28) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bx.k.i(a3.t, boolean, x5.j, boolean, long, float, b4.t, m3.n, int, int):void");
    }

    public static final void j(int i11, b4.t tVar, Function0 function0, m3.n nVar, boolean z11) {
        int i12;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(2111672474);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(tVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        int i13 = i12 | (sVar.h(function0) ? 32 : 16) | (sVar.g(z11) ? 256 : 128);
        if (sVar.R(i13 & 1, (i13 & 147) != 146)) {
            d2.c.f(b4.a.a(m2.n(tVar, m1.f478a, m1.f479b), c5.m2.f7291a, new a3.h(function0, z11)), sVar);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a3.g(tVar, function0, z11, i11);
        }
    }

    public static final void k(no.j jVar, Function0 function0, Function0 function02, m3.n nVar, int i11) {
        Function0 function03;
        jVar.getClass();
        function0.getClass();
        function02.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(753191725);
        int i12 = i11 | (sVar.h(jVar) ? 4 : 2) | (sVar.h(function0) ? 32 : 16) | (sVar.h(function02) ? 256 : 128);
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            Object objJ = sVar.j(e.k.f15295a);
            objJ.getClass();
            Activity activity = (Activity) objJ;
            b1 b1VarN = m3.i.n(jVar.f31226e, sVar, 0);
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
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                objM3 = m3.i.w(Boolean.FALSE);
                sVar.k0(objM3);
            }
            b1 b1Var3 = (b1) objM3;
            float f11 = ((Boolean) b1Var.getValue()).booleanValue() ? 1.0f : 0.0f;
            Object objM4 = sVar.M();
            if (objM4 == fVar) {
                objM4 = new no.g(0);
                sVar.k0(objM4);
            }
            u1 u1Var = new u1(500, 200, (t1.u) objM4);
            Object objM5 = sVar.M();
            if (objM5 == fVar) {
                objM5 = new li.c(b1Var2, 14);
                sVar.k0(objM5);
            }
            c3 c3VarB = t1.d.b(f11, u1Var, "animationValue", (Function1) objM5, sVar, 27648, 4);
            float f12 = ((Boolean) b1Var2.getValue()).booleanValue() ? 1.0f : 0.0f;
            u1 u1Var2 = new u1(300, 100, t1.v.f39584a);
            Object objM6 = sVar.M();
            if (objM6 == fVar) {
                objM6 = new li.c(b1Var3, 15);
                sVar.k0(objM6);
            }
            c3 c3VarB2 = t1.d.b(f12, u1Var2, "animationValueBlob", (Function1) objM6, sVar, 27648, 4);
            c3 c3VarB3 = t1.d.b(((Boolean) b1Var3.getValue()).booleanValue() ? 1.0f : 0.0f, new u1(500, 1000, t1.w.f39596d), "startAnimationFooter", null, sVar, 3072, 20);
            int i13 = no.h.$EnumSwitchMapping$0[((OrderState) b1VarN.getValue()).ordinal()];
            if (i13 == 1) {
                jVar.f31224c.b(cv.i.SCREEN_COLLECTION_CONFIRMED);
                function02.invoke();
            } else if (i13 == 2) {
                function0.invoke();
            }
            Boolean bool = Boolean.TRUE;
            boolean zH = ((i12 & 112) == 32) | sVar.h(jVar) | sVar.h(activity);
            Object objM7 = sVar.M();
            if (zH || objM7 == fVar) {
                al.n nVar2 = new al.n(jVar, b1Var, activity, function0, (x70.c) null, 29);
                function03 = function0;
                sVar.k0(nVar2);
                objM7 = nVar2;
            } else {
                function03 = function0;
            }
            m3.i.h(bool, (Function2) objM7, sVar);
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
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
            n4.b bVarZ = x0.z(R.drawable.system_icon_close_neutral_80, sVar, 0);
            float f13 = 24;
            b4.t tVarA = d2.c.A(qVar, f13, f13);
            b4.k kVar = b4.d.f5685c;
            d2.u uVar = d2.u.f13938a;
            v1.n.d(bVarZ, null, b4.a.a(uVar.a(tVarA, kVar), c5.m2.f7291a, new bm.f(28, function03)), null, null, 0.0f, null, sVar, 56, 120);
            float f14 = 48;
            b4.t tVarC2 = m2.c(d2.c.D(qVar, 0.0f, 0.0f, 0.0f, ((Number) c3VarB2.getValue()).floatValue() * f14, 7), 1.0f);
            b4.k kVar2 = b4.d.f5687e;
            b4.t tVarA2 = uVar.a(tVarC2, kVar2);
            float fFloatValue = ((Number) c3VarB.getValue()).floatValue();
            b4.t tVarJ = f4.g.j(tVarA2, fFloatValue, fFloatValue);
            d2.y yVarA = d2.w.a(d2.i.f13805e, b4.d.f5695n, sVar, 54);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC3 = b4.a.c(tVarJ, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC3, gVar4, sVar);
            String strU = f0.U(sVar, R.string.charity_share_reservation_title);
            m5.u0 u0VarA = m5.u0.a(lv.v.f28267f, 0L, 0L, null, null, b0.a0.B(0.64d), null, 3, b0.a0.C(38), null, null, 16613247);
            long j9 = lv.s.f28217b;
            r9.d(strU, d2.c.z(qVar, f13), j9, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, u0VarA, sVar, 432, 0, 130040);
            String strU2 = f0.U(sVar, R.string.charity_share_reservation_text);
            m5.u0 u0Var = lv.v.f28274n;
            r9.d(strU2, d2.c.D(qVar, f13, 0.0f, f13, ((Number) c3VarB2.getValue()).floatValue() * 40, 2), 0L, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, m5.u0.a(u0Var, j9, 0L, null, null, b0.a0.B(0.08d), null, 0, 0L, null, null, 16777086), sVar, 0, 0, 130044);
            b4.t tVarA3 = f4.g.a(qVar, ((Number) c3VarB2.getValue()).floatValue());
            u0 u0VarD2 = d2.p.d(kVar2, false);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            b4.t tVarC4 = b4.a.c(tVarA3, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD2, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            a0.y(iHashCode3, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC4, gVar4, sVar);
            v1.n.d(x0.z(R.drawable.share_reservation_blob, sVar, 0), null, null, null, null, 0.0f, null, sVar, 56, 124);
            ex.i.g(uVar.a(qVar, kVar2), u3.e.e(-2132223086, sVar, new lk.a(jVar, 22)), sVar, 48, 0);
            sVar.q(true);
            sVar.q(true);
            r9.d(f0.U(sVar, R.string.charity_share_reservation_footer), f4.g.a(uVar.a(d2.c.A(qVar, f13, f14), b4.d.f5690h), ((Number) c3VarB3.getValue()).floatValue()), 0L, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, m5.u0.a(u0Var, lv.s.D, 0L, null, null, b0.a0.B(0.08d), null, 0, 0L, null, null, 16777086), sVar, 0, 0, 130044);
            sVar = sVar;
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ki.h(jVar, function0, function02, false, i11, 12);
        }
    }

    public static final void l(ap.n nVar, m3.n nVar2, int i11) {
        b1 b1Var;
        f6.l lVar;
        b1 b1Var2;
        f6.n nVar3;
        m3.s sVar = (m3.s) nVar2;
        sVar.c0(-594821627);
        int i12 = (sVar.h(nVar) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(nVar.f4559b0);
                sVar.k0(objM);
            }
            b1 b1Var3 = (b1) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                String str = nVar.f4561c0;
                if (str == null) {
                    str = "";
                }
                objM2 = m3.i.w(str);
                sVar.k0(objM2);
            }
            b1 b1Var4 = (b1) objM2;
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                objM3 = new g4.v();
                sVar.k0(objM3);
            }
            g4.v vVar = (g4.v) objM3;
            b1 b1VarN = m3.i.n(nVar.f4569k, sVar, 0);
            List listB = nVar.b();
            Object value = b1VarN.getValue();
            boolean zF = sVar.f(b1VarN) | sVar.h(nVar);
            Object objM4 = sVar.M();
            if (zF || objM4 == fVar) {
                objM4 = new dp.o(b1VarN, nVar, null, 2);
                sVar.k0(objM4);
            }
            m3.i.h(value, (Function2) objM4, sVar);
            b4.t tVarR = v1.n.r(m2.f13850c, v1.n.q(sVar), true);
            sVar.a0(-1003410150);
            sVar.a0(212064437);
            sVar.q(false);
            z5.c cVar = (z5.c) sVar.j(x1.f7416h);
            Object objM5 = sVar.M();
            if (objM5 == fVar) {
                objM5 = new f6.s(cVar);
                sVar.k0(objM5);
            }
            f6.s sVar2 = (f6.s) objM5;
            Object objM6 = sVar.M();
            if (objM6 == fVar) {
                objM6 = new f6.l();
                sVar.k0(objM6);
            }
            f6.l lVar2 = (f6.l) objM6;
            Object objM7 = sVar.M();
            if (objM7 == fVar) {
                objM7 = m3.i.w(Boolean.FALSE);
                sVar.k0(objM7);
            }
            b1 b1Var5 = (b1) objM7;
            Object objM8 = sVar.M();
            if (objM8 == fVar) {
                objM8 = new f6.n(lVar2);
                sVar.k0(objM8);
            }
            f6.n nVar4 = (f6.n) objM8;
            Object objM9 = sVar.M();
            if (objM9 == fVar) {
                m3.k1 k1Var = new m3.k1(Unit.f26487a, m3.f.f29272d);
                sVar.k0(k1Var);
                objM9 = k1Var;
            }
            b1 b1Var6 = (b1) objM9;
            boolean zH = sVar.h(sVar2) | sVar.d(257);
            Object objM10 = sVar.M();
            if (zH || objM10 == fVar) {
                objM10 = new dp.b(b1Var6, sVar2, nVar4, b1Var5, 4);
                b1Var = b1Var5;
                lVar = lVar2;
                b1Var2 = b1Var6;
                nVar3 = nVar4;
                sVar.k0(objM10);
            } else {
                lVar = lVar2;
                b1Var2 = b1Var6;
                nVar3 = nVar4;
                b1Var = b1Var5;
            }
            u0 u0Var = (u0) objM10;
            Object objM11 = sVar.M();
            if (objM11 == fVar) {
                objM11 = new dp.c(b1Var, nVar3, 4);
                sVar.k0(objM11);
            }
            Function0 function0 = (Function0) objM11;
            boolean zH2 = sVar.h(sVar2);
            Object objM12 = sVar.M();
            if (zH2 || objM12 == fVar) {
                objM12 = new dp.d(sVar2, 4);
                sVar.k0(objM12);
            }
            c0.a(j5.r.c(tVarR, false, (Function1) objM12), u3.e.e(1200550679, sVar, new dp.u(b1Var2, lVar, function0, b1Var3, listB, vVar, b1Var4, nVar)), u0Var, sVar, 48);
            sVar.q(false);
            boolean zH3 = sVar.h(nVar);
            Object objM13 = sVar.M();
            if (zH3 || objM13 == fVar) {
                objM13 = new ap.h(nVar, 17);
                sVar.k0(objM13);
            }
            jf.e.a(false, (Function0) objM13, sVar, 0, 1);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new dp.m(nVar, i11, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m(int r8, android.graphics.Rect r9, android.graphics.Rect r10, android.graphics.Rect r11) {
        /*
            boolean r0 = n(r8, r9, r10)
            boolean r1 = n(r8, r9, r11)
            if (r1 != 0) goto L72
            if (r0 != 0) goto Le
            goto L72
        Le:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r2 = 33
            r3 = 66
            r4 = 17
            r5 = 1
            if (r8 == r4) goto L3b
            if (r8 == r2) goto L34
            if (r8 == r3) goto L2d
            if (r8 != r1) goto L28
            int r6 = r9.bottom
            int r7 = r11.top
            if (r6 > r7) goto L71
            goto L41
        L28:
            i4.a.f(r0)
        L2b:
            r8 = 0
            return r8
        L2d:
            int r6 = r9.right
            int r7 = r11.left
            if (r6 > r7) goto L71
            goto L41
        L34:
            int r6 = r9.top
            int r7 = r11.bottom
            if (r6 < r7) goto L71
            goto L41
        L3b:
            int r6 = r9.left
            int r7 = r11.right
            if (r6 < r7) goto L71
        L41:
            if (r8 == r4) goto L71
            if (r8 != r3) goto L46
            goto L71
        L46:
            int r10 = x(r8, r9, r10)
            if (r8 == r4) goto L66
            if (r8 == r2) goto L61
            if (r8 == r3) goto L5c
            if (r8 != r1) goto L58
            int r8 = r11.bottom
            int r9 = r9.bottom
        L56:
            int r8 = r8 - r9
            goto L6b
        L58:
            i4.a.f(r0)
            goto L2b
        L5c:
            int r8 = r11.right
            int r9 = r9.right
            goto L56
        L61:
            int r8 = r9.top
            int r9 = r11.top
            goto L56
        L66:
            int r8 = r9.left
            int r9 = r11.left
            goto L56
        L6b:
            int r8 = java.lang.Math.max(r5, r8)
            if (r10 >= r8) goto L72
        L71:
            return r5
        L72:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: bx.k.m(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean n(int i11, Rect rect, Rect rect2) {
        if (i11 != 17) {
            if (i11 != 33) {
                if (i11 != 66) {
                    if (i11 != 130) {
                        i4.a.f("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static final Map p(af.e eVar, String str) {
        str.getClass();
        return kotlin.collections.x0.e(new Pair("[Amplitude] Action", "touch"), new Pair("[Amplitude] Target Class", eVar.f1276b), new Pair("[Amplitude] Target Resource", eVar.f1277c), new Pair("[Amplitude] Target Tag", eVar.f1278d), new Pair("[Amplitude] Target Text", eVar.f1279e), new Pair("[Amplitude] Target Accessibility Label", eVar.f1280f), new Pair("[Amplitude] Target Source", CollectionsKt.U(StringsKt__StringsKt.split$default(kotlin.text.y.n(eVar.f1281g, "_", " ", false), new String[]{" "}, false, 0, 6, null), " ", null, null, af.f.f1285a, 30)), new Pair("[Amplitude] Hierarchy", eVar.f1282h), new Pair("[Amplitude] Screen Name", str));
    }

    public static k0.b q(Surface surface, int i11, o1 o1Var, Handler handler) {
        ImageWriter imageWriterNewInstance;
        handler.getClass();
        int i12 = Build.VERSION.SDK_INT;
        int i13 = o1Var.f15389a;
        if (i12 >= 29) {
            imageWriterNewInstance = f0.v.a(i13, surface);
        } else {
            Log.w("CXCP", "Ignoring format (" + ((Object) o1.b(i13)) + ") for " + ((Object) ("Input-" + i11)) + ". Android " + i12 + " does not support creating ImageWriters with formats. This may lead to unexpected behaviors.");
            imageWriterNewInstance = ImageWriter.newInstance(surface, 1);
            imageWriterNewInstance.getClass();
        }
        k0.b bVar = new k0.b(imageWriterNewInstance, i11);
        imageWriterNewInstance.setOnImageReleasedListener(bVar, handler);
        return bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final i4.f r(f4.c r28, float r29) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bx.k.r(f4.c, float):i4.f");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final l1.b t() {
        /*
            n1.c r0 = n1.a.f30271a
            java.util.ArrayList r0 = r0.f30272a
            if (r0 == 0) goto Ld
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Ld
            goto L22
        Ld:
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            n1.b r1 = (n1.b) r1
            boolean r1 = r1 instanceof n1.e
            if (r1 == 0) goto L11
            goto L43
        L22:
            n1.c r0 = n1.a.f30271a
            java.util.ArrayList r0 = r0.f30272a
            if (r0 == 0) goto L2f
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L2f
            goto L46
        L2f:
            java.util.Iterator r0 = r0.iterator()
        L33:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L46
            java.lang.Object r1 = r0.next()
            n1.b r1 = (n1.b) r1
            boolean r1 = r1 instanceof n1.d
            if (r1 == 0) goto L33
        L43:
            l1.b r0 = l1.b.EMBEDDED
            return r0
        L46:
            l1.b r0 = l1.b.EXTERNAL
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bx.k.t():l1.b");
    }

    public static boolean w(int i11, Rect rect, Rect rect2) {
        if (i11 == 17) {
            int i12 = rect.right;
            int i13 = rect2.right;
            return (i12 > i13 || rect.left >= i13) && rect.left > rect2.left;
        }
        if (i11 == 33) {
            int i14 = rect.bottom;
            int i15 = rect2.bottom;
            return (i14 > i15 || rect.top >= i15) && rect.top > rect2.top;
        }
        if (i11 == 66) {
            int i16 = rect.left;
            int i17 = rect2.left;
            return (i16 < i17 || rect.right <= i17) && rect.right < rect2.right;
        }
        if (i11 != 130) {
            i4.a.f("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            return false;
        }
        int i18 = rect.top;
        int i19 = rect2.top;
        return (i18 < i19 || rect.bottom <= i19) && rect.bottom < rect2.bottom;
    }

    public static int x(int i11, Rect rect, Rect rect2) {
        int i12;
        int i13;
        if (i11 == 17) {
            i12 = rect.left;
            i13 = rect2.right;
        } else if (i11 == 33) {
            i12 = rect.top;
            i13 = rect2.bottom;
        } else if (i11 == 66) {
            i12 = rect2.left;
            i13 = rect.right;
        } else {
            if (i11 != 130) {
                i4.a.f("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return 0;
            }
            i12 = rect2.top;
            i13 = rect.bottom;
        }
        return Math.max(0, i12 - i13);
    }

    public static int y(int i11, Rect rect, Rect rect2) {
        if (i11 != 17) {
            if (i11 != 33) {
                if (i11 != 66) {
                    if (i11 != 130) {
                        i4.a.f("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static final synchronized void z(b bVar, x xVar) {
        if (yx.a.f46339a.contains(k.class)) {
            return;
        }
        try {
            w wVarA = i.a();
            wVarA.a(bVar, xVar.c());
            i.b(wVarA);
        } catch (Throwable th2) {
            yx.a.a(k.class, th2);
        }
    }

    public abstract void o(ha.c cVar, Object obj);

    public abstract String s();

    public void u(ha.a aVar, Iterable iterable) {
        aVar.getClass();
        if (iterable == null) {
            return;
        }
        ha.c cVarV0 = aVar.v0(s());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    o(cVarV0, obj);
                    cVarV0.q0();
                    cVarV0.reset();
                }
            }
            w.b.y(cVarV0, null);
        } finally {
        }
    }

    public void v(ha.a aVar, Object obj) {
        aVar.getClass();
        if (obj == null) {
            return;
        }
        ha.c cVarV0 = aVar.v0(s());
        try {
            o(cVarV0, obj);
            cVarV0.q0();
            w.b.y(cVarV0, null);
        } finally {
        }
    }
}
