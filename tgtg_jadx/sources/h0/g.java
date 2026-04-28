package h0;

import a3.a3;
import a3.t0;
import a3.u2;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.fragment.app.g1;
import b4.j;
import b4.q;
import b4.t;
import b5.g;
import b5.h;
import bn.c0;
import c5.n2;
import c5.v0;
import c5.x1;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.app.tgtg.model.remote.item.response.BasketIntroBannerMnu;
import com.app.tgtg.model.remote.item.response.CategoryNavigationCard;
import com.app.tgtg.model.remote.manufacturer.response.ManufacturerItemProperties;
import com.braze.h2;
import d2.d;
import d2.e;
import d2.i;
import d2.m2;
import d2.n1;
import d2.p;
import d2.w;
import d2.y;
import d2.z;
import e0.f;
import g3.i2;
import g3.r9;
import g3.s0;
import g3.s5;
import g3.t5;
import gd.o;
import i4.g0;
import i4.r0;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jb.u;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.collections.x0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import lv.v;
import m2.c2;
import m3.d3;
import m3.n;
import m3.s;
import m3.v1;
import m3.w1;
import o30.e0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import v80.b0;
import w.a0;
import z4.l;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f20967b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f20968c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f20969d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f20970e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20971a;

    public /* synthetic */ g(int i11) {
        this.f20971a = i11;
    }

    public static void A(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static final ry.c D(Function1 function1, m3.n nVar, int i11) {
        ry.c oVar;
        s sVar = (s) nVar;
        sVar.a0(923020361);
        int i12 = (i11 & 112) | 390;
        sVar.a0(-1732095526);
        if (((Boolean) sVar.j(n2.f7299a)).booleanValue()) {
            oVar = new ky.o(ry.e.f38275a);
        } else {
            sVar.a0(1424240517);
            Context context = (Context) sVar.j(v0.f7390b);
            sVar.a0(1134374053);
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                context.getClass();
                for (Context baseContext = context; baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
                    if (baseContext instanceof Activity) {
                        objM = new ry.a(context, (Activity) baseContext);
                        sVar.k0(objM);
                    }
                }
                h2.b("Permissions should be called in the context of an Activity");
                return null;
            }
            ry.a aVar = (ry.a) objM;
            sVar.q(false);
            u.n(aVar, null, sVar, 0);
            g1 g1Var = new g1(3);
            sVar.a0(1134386901);
            boolean zF = ((((i12 & 112) ^ 48) > 32 && sVar.f(function1)) || (i12 & 48) == 32) | sVar.f(aVar);
            Object objM2 = sVar.M();
            if (zF || objM2 == fVar) {
                objM2 = new c2(29, aVar, function1);
                sVar.k0(objM2);
            }
            sVar.q(false);
            e.n nVarN = u.N(g1Var, (Function1) objM2, sVar, 0);
            sVar.a0(1134391322);
            boolean zF2 = sVar.f(aVar) | sVar.h(nVarN);
            Object objM3 = sVar.M();
            if (zF2 || objM3 == fVar) {
                objM3 = new ry.b(0, aVar, nVarN);
                sVar.k0(objM3);
            }
            sVar.q(false);
            m3.i.c(aVar, nVarN, (Function1) objM3, sVar);
            sVar.q(false);
            oVar = aVar;
        }
        sVar.q(false);
        sVar.q(false);
        return oVar;
    }

    public static final dv.b E(Pair... pairArr) {
        Pair[] pairArr2 = (Pair[]) Arrays.copyOf(pairArr, pairArr.length);
        Pair[] pairArr3 = (Pair[]) Arrays.copyOf(pairArr2, pairArr2.length);
        dv.b bVar = new dv.b();
        x0.i(bVar.f15174a, pairArr3);
        return bVar;
    }

    public static JSONArray F(JSONArray jSONArray) throws JSONException {
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            Object obj = jSONArray.get(i11);
            if (Intrinsics.areEqual(obj.getClass(), String.class)) {
                String strSubstring = (String) obj;
                if (strSubstring.length() > 1024) {
                    strSubstring = strSubstring.substring(0, 1024);
                }
                jSONArray.put(i11, strSubstring);
            } else if (Intrinsics.areEqual(obj.getClass(), JSONObject.class)) {
                jSONArray.put(i11, G((JSONObject) obj));
            } else if (Intrinsics.areEqual(obj.getClass(), JSONArray.class)) {
                JSONArray jSONArray2 = (JSONArray) obj;
                F(jSONArray2);
                jSONArray.put(i11, jSONArray2);
            }
        }
        return jSONArray;
    }

    public static JSONObject G(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        if (jSONObject.length() > 1024) {
            i4.a.f("Too many properties (more than 1024) in JSON");
            return null;
        }
        Iterator<String> itKeys = jSONObject.keys();
        itKeys.getClass();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            next.getClass();
            String str = next;
            try {
                Object obj = jSONObject.get(str);
                if (Intrinsics.areEqual(obj.getClass(), String.class)) {
                    String strSubstring = (String) obj;
                    if (strSubstring.length() > 1024) {
                        strSubstring = strSubstring.substring(0, 1024);
                    }
                    jSONObject.put(str, strSubstring);
                } else if (Intrinsics.areEqual(obj.getClass(), JSONObject.class)) {
                    jSONObject.put(str, G((JSONObject) obj));
                } else if (Intrinsics.areEqual(obj.getClass(), JSONArray.class)) {
                    JSONArray jSONArray = (JSONArray) obj;
                    F(jSONArray);
                    jSONObject.put(str, jSONArray);
                }
            } catch (JSONException unused) {
                i4.a.f("JSON parsing error. Too long (> 1024 chars) or invalid JSON");
                return null;
            }
        }
        return jSONObject;
    }

    public static final void c(final int i11, List list, final CategoryNavigationCard categoryNavigationCard, String str, final Function2 function2, final Function2 function22, m3.n nVar, int i12) {
        int i13;
        List list2;
        list.getClass();
        categoryNavigationCard.getClass();
        str.getClass();
        function2.getClass();
        function22.getClass();
        s sVar = (s) nVar;
        sVar.c0(1728854586);
        if ((i12 & 6) == 0) {
            i13 = (sVar.d(i11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            list2 = list;
            i13 |= sVar.h(list2) ? 32 : 16;
        } else {
            list2 = list;
        }
        if ((i12 & MLKEMEngine.KyberPolyBytes) == 0) {
            i13 |= sVar.h(categoryNavigationCard) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= sVar.f(str) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= sVar.h(function2) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i12) == 0) {
            i13 |= sVar.h(function22) ? 131072 : 65536;
        }
        if (sVar.R(i13 & 1, (74899 & i13) != 74898)) {
            final boolean zAreEqual = Intrinsics.areEqual(str, categoryNavigationCard.getActionData());
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = m3.i.o(kotlin.coroutines.g.f26549a, sVar);
                sVar.k0(objM);
            }
            final b0 b0Var = (b0) objM;
            Object objM2 = sVar.M();
            if (objM2 == fVar) {
                objM2 = new LinkedHashMap();
                sVar.k0(objM2);
            }
            final Map map = (Map) objM2;
            Object objM3 = sVar.M();
            if (objM3 == fVar) {
                objM3 = new ArrayList();
                sVar.k0(objM3);
            }
            final List list3 = (List) objM3;
            Object objM4 = sVar.M();
            if (objM4 == fVar) {
                objM4 = a0.g(sVar);
            }
            final b2.l lVar = (b2.l) objM4;
            d3 d3Var = x1.f7416h;
            final List list4 = list2;
            m3.i.b(new v1[]{b3.i.t(((z5.c) sVar.j(d3Var)).a(), 1.0f, d3Var), s5.f19473a.a(cg.j.t())}, u3.e.e(-2057691782, sVar, new Function2() { // from class: bn.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    m3.n nVar2 = (m3.n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    m3.s sVar2 = (m3.s) nVar2;
                    if (sVar2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        boolean z11 = zAreEqual;
                        long j9 = z11 ? lv.s.I : lv.s.J;
                        float f11 = 8;
                        l2.f fVarB = l2.g.b(f11);
                        b4.q qVar = b4.q.f5711a;
                        b4.t tVarB = f4.g.b(v1.n.j(qVar, j9, fVarB), l2.g.b(f11));
                        t5 t5VarA = s5.a(0.0f, 6, 0L, false);
                        final CategoryNavigationCard categoryNavigationCard2 = categoryNavigationCard;
                        boolean zH = sVar2.h(categoryNavigationCard2);
                        Function2 function23 = function22;
                        boolean zF = zH | sVar2.f(function23);
                        Object objM5 = sVar2.M();
                        m3.f fVar2 = m3.m.f29332a;
                        if (zF || objM5 == fVar2) {
                            objM5 = new a3.n2(28, categoryNavigationCard2, function23);
                            sVar2.k0(objM5);
                        }
                        b4.t tVarB2 = androidx.compose.foundation.b.b(tVarB, lVar, t5VarA, false, null, null, (Function0) objM5, 28);
                        final Map map2 = map;
                        boolean zH2 = sVar2.h(map2);
                        final int i14 = i11;
                        boolean zD = zH2 | sVar2.d(i14);
                        final List list5 = list3;
                        boolean zH3 = zD | sVar2.h(list5);
                        final List list6 = list4;
                        boolean zH4 = zH3 | sVar2.h(list6);
                        final v80.b0 b0Var2 = b0Var;
                        boolean zH5 = zH4 | sVar2.h(b0Var2);
                        final Function2 function24 = function2;
                        boolean zF2 = zH5 | sVar2.f(function24) | sVar2.h(categoryNavigationCard2);
                        Object objM6 = sVar2.M();
                        if (zF2 || objM6 == fVar2) {
                            Function1 function1 = new Function1() { // from class: bn.c
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    z4.z zVar = (z4.z) obj3;
                                    zVar.getClass();
                                    int i15 = i14;
                                    Integer numValueOf = Integer.valueOf(i15);
                                    Map map3 = map2;
                                    map3.put(numValueOf, zVar);
                                    Integer numValueOf2 = Integer.valueOf(i15);
                                    List list7 = list5;
                                    if (!list7.contains(numValueOf2)) {
                                        Integer numValueOf3 = Integer.valueOf(i15);
                                        List list8 = list6;
                                        if (!list8.contains(numValueOf3) && zVar.n()) {
                                            int iU = (int) (zVar.u() >> 32);
                                            int i16 = (iU * 80) / 100;
                                            float fIntBitsToFloat = Float.intBitsToFloat((int) (zVar.S(0L) >> 32));
                                            float f12 = iU + fIntBitsToFloat;
                                            z4.z zVarK = zVar.K();
                                            if (zVarK != null) {
                                                h4.c cVarV = z4.c0.i(zVarK).v(zVarK, true);
                                                float f13 = cVarV.f21380a;
                                                float f14 = cVarV.f21382c - fIntBitsToFloat;
                                                float f15 = i16;
                                                if (f14 > f15 && f13 < f12 - f15) {
                                                    list7.add(Integer.valueOf(i15));
                                                    v80.f0.B(b0Var2, null, null, new e(map3, i15, list8, function24, categoryNavigationCard2, list7, null), 3);
                                                }
                                            }
                                        }
                                    }
                                    return Unit.f26487a;
                                }
                            };
                            sVar2.k0(function1);
                            objM6 = function1;
                        }
                        b4.t tVarO = z4.c0.o(tVarB2, (Function1) objM6);
                        d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar2, 0);
                        int iHashCode = Long.hashCode(sVar2.T);
                        u3.i iVarL = sVar2.l();
                        b4.t tVarC = b4.a.c(tVarO, sVar2);
                        b5.j.R.getClass();
                        b5.h hVar = b5.i.f5839b;
                        sVar2.e0();
                        if (sVar2.S) {
                            sVar2.k(hVar);
                        } else {
                            sVar2.n0();
                        }
                        m3.i.C(yVarA, b5.i.f5843f, sVar2);
                        m3.i.C(iVarL, b5.i.f5842e, sVar2);
                        m3.i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
                        m3.i.z(sVar2, b5.i.f5845h);
                        m3.i.C(tVarC, b5.i.f5841d, sVar2);
                        h0.g.d(b3.i.f(b4.d.f5695n, d2.c.D(qVar, 0.0f, lv.t.f28249c, 0.0f, 0.0f, 13)), categoryNavigationCard2, z11, sVar2, 0);
                        sVar2.q(true);
                    } else {
                        sVar2.U();
                    }
                    return Unit.f26487a;
                }
            }), sVar, 56);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.b(i11, list, categoryNavigationCard, str, function2, function22, i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    public static final void d(t tVar, CategoryNavigationCard categoryNavigationCard, boolean z11, m3.n nVar, int i11) {
        s sVar;
        ?? r12;
        q qVar;
        s sVar2 = (s) nVar;
        sVar2.c0(18309964);
        int i12 = i11 | (sVar2.f(tVar) ? 4 : 2) | (sVar2.h(categoryNavigationCard) ? 32 : 16) | (sVar2.g(z11) ? 256 : 128);
        if (sVar2.R(i12 & 1, (i12 & 147) != 146)) {
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar2, 0);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            t tVarC = b4.a.c(tVar, sVar2);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            m3.i.C(yVarA, b5.i.f5843f, sVar2);
            m3.i.C(iVarL, b5.i.f5842e, sVar2);
            m3.i.v(sVar2, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar2, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar2);
            Picture picture = categoryNavigationCard.getPicture();
            Unit unit = null;
            String currentUrl = picture != null ? picture.getCurrentUrl() : null;
            q qVar2 = q.f5711a;
            if (currentUrl == null) {
                sVar2.a0(983344730);
                sVar2.q(false);
                qVar = qVar2;
                r12 = 0;
            } else {
                sVar2.a0(983344731);
                float f11 = 38;
                r12 = 0;
                String str = currentUrl;
                qVar = qVar2;
                gd.o.c(str, null, m2.q(m2.e(qVar2, f11), f11), o00.x0.z(R.drawable.gfx_tgtg_logo_green_small, sVar2, 0), null, null, z4.l.f47166a, 0.0f, null, sVar2, 805310896, 6, 31216);
                sVar2.q(false);
                unit = Unit.f26487a;
            }
            if (unit == null) {
                sVar2.a0(983774794);
                float f12 = 38;
                i2.a(o00.x0.z(R.drawable.gfx_tgtg_logo_green_small, sVar2, r12), null, m2.q(m2.e(qVar, f12), f12), lv.s.f28217b, sVar2, 3512, 0);
                sVar2.q(r12);
            } else {
                sVar2.a0(1417193081);
                sVar2.q(r12);
            }
            sVar2.q(true);
            d2.c.f(m2.e(qVar, lv.t.f28249c), sVar2);
            r9.d(String.valueOf(categoryNavigationCard.getTitle()), m2.q(qVar, 76), z11 ? lv.s.f28217b : lv.s.C, 0L, null, 0L, null, new x5.k(3), 0L, 2, false, 1, 0, null, z11 ? v.f28282v : v.f28276p, sVar2, 48, 24960, 109560);
            s sVar3 = sVar2;
            d2.c.f(m2.e(qVar, lv.t.f28251e), sVar3);
            sVar = sVar3;
        } else {
            sVar2.U();
            sVar = sVar2;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.d(tVar, categoryNavigationCard, z11, i11, 0);
        }
    }

    public static final void e(BasketIntroBannerMnu basketIntroBannerMnu, Function0 function0, m3.n nVar, int i11) {
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(-1957478786);
        int i12 = i11 | (sVar.f(basketIntroBannerMnu) ? 4 : 2) | (sVar.h(function0) ? 32 : 16);
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            q qVar = q.f5711a;
            t tVarD = m2.d(qVar, 1.0f);
            float f11 = lv.t.f28253g;
            float f12 = lv.t.f28251e;
            t tVarA = d2.c.A(tVarD, f11, f12);
            long j9 = lv.s.K;
            r0 r0Var = g0.f23254b;
            t tVarJ = v1.n.j(tVarA, j9, r0Var);
            u0 u0VarD = p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarJ, sVar);
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
            t tVarB = f4.g.b(d2.c.z(f4.g.h(m2.d(qVar, 1.0f), o00.x0.z(R.drawable.rounded_border_bg_green, sVar, 0), null, z4.l.f47172g, 0.0f, null, 54), f11), l2.g.b(12));
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(tVarB, sVar);
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
            d2.i2 i2VarA = d2.h2.a(d2.i.f13801a, b4.d.f5692j, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            t tVarC3 = b4.a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            a0.y(iHashCode3, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC3, gVar4, sVar);
            b4.k kVar = b4.d.f5687e;
            t tVarJ2 = v1.n.j(f4.g.b(qVar, l2.g.b(16)), lv.s.f28225f, r0Var);
            float f13 = lv.t.f28249c;
            t tVarA2 = d2.c.A(tVarJ2, lv.t.f28252f, f13);
            u0 u0VarD2 = p.d(kVar, false);
            int iHashCode4 = Long.hashCode(sVar.T);
            u3.i iVarL4 = sVar.l();
            t tVarC4 = b4.a.c(tVarA2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD2, gVar, sVar);
            m3.i.C(iVarL4, gVar2, sVar);
            a0.y(iHashCode4, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC4, gVar4, sVar);
            String strU = f0.U(sVar, R.string.mnu_basket_intro_tag);
            long j11 = lv.s.J;
            r9.d(strU, null, j11, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28273m, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
            sVar.q(true);
            t tVarM = m2.m(qVar, f12);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            d2.c.f(tVarM.then(new n1(1.0f, true)), sVar);
            t tVarA3 = b4.a.a(d2.c.z(v1.n.j(f4.g.b(qVar, l2.g.f26790a), j11, r0Var), f13), c5.m2.f7291a, new bm.f(2, function0));
            u0 u0VarD3 = p.d(kVar, false);
            int iHashCode5 = Long.hashCode(sVar.T);
            u3.i iVarL5 = sVar.l();
            t tVarC5 = b4.a.c(tVarA3, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD3, gVar, sVar);
            m3.i.C(iVarL5, gVar2, sVar);
            a0.y(iHashCode5, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC5, gVar4, sVar);
            v1.n.d(o00.x0.z(R.drawable.ic_close24, sVar, 0), f0.U(sVar, R.string.voice_over_close), m2.m(qVar, 24), null, null, 0.0f, new i4.o(lv.s.D, 5), sVar, 1573256, 56);
            sVar.q(true);
            sVar.q(true);
            String title = basketIntroBannerMnu.getTitle();
            if (title == null) {
                title = b3.i.j(260121162, R.string.mnu_basket_intro_title, sVar, sVar, false);
            } else {
                sVar.a0(-1238535604);
                sVar.q(false);
            }
            long j12 = lv.s.C;
            r9.d(title, null, j12, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28265d, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
            d2.c.f(m2.m(qVar, f12), sVar);
            String text = basketIntroBannerMnu.getText();
            if (text == null) {
                text = b3.i.j(260448491, R.string.mnu_basket_intro_body, sVar, sVar, false);
            } else {
                sVar.a0(-1238525014);
                sVar.q(false);
            }
            r9.d(text, null, j12, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28274n, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
            sVar = sVar;
            d2.c.f(m2.m(qVar, f12), sVar);
            v1.n.d(o00.x0.z(2131230894, sVar, 0), null, m2.d(qVar, 1.0f), null, z4.l.f47166a, 0.0f, null, sVar, 25016, 104);
            sVar.q(true);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new u2(basketIntroBannerMnu, function0, i11, 5);
        }
    }

    public static float f(float f11) {
        return f11 <= 0.04045f ? f11 / 12.92f : (float) Math.pow((f11 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(b4.t r51, java.lang.String r52, java.lang.String r53, boolean r54, m5.u0 r55, m5.u0 r56, m3.n r57, int r58, int r59) {
        /*
            Method dump skipped, instruction units count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.g.g(b4.t, java.lang.String, java.lang.String, boolean, m5.u0, m5.u0, m3.n, int, int):void");
    }

    public static final void h(t tVar, Function0 function0, Function0 function02, Function0 function03, m3.n nVar, int i11) {
        int i12;
        Function0 function04;
        Function0 function05 = function02;
        s sVar = (s) nVar;
        sVar.c0(390151697);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(tVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function0) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(function05) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(function03) ? NewHope.SENDB_BYTES : 1024;
        }
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            le.p pVarD = e0.D(new le.q("thumbup.json"), sVar, 6);
            t tVarF = d2.c.F(v1.n.i(tVar.then(m2.f13850c), qb.e.I(d0.h(new i4.v(lv.s.I), new i4.v(lv.s.f28229i)), 0.0f, 0.0f, 14), 0.0f, 6));
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarF, sVar);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
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
            q qVar = q.f5711a;
            t tVarD = m2.d(qVar, 1.0f);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            t tVarE = b3.i.e(1.0f, tVarD, true);
            y yVarA2 = w.a(d2.i.f13805e, b4.d.f5695n, sVar, 54);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(tVarE, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA2, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            he.k kVar = (he.k) pVarD.getValue();
            b4.k kVar2 = b4.d.f5687e;
            o00.x0.f(kVar, null, false, 0.0f, 0, false, kVar2, sVar, 0, 196608, 4161534);
            t tVarT = m2.t(m2.d(qVar, 1.0f), 3);
            float f11 = lv.t.f28253g;
            t tVarB = d2.c.B(tVarT, f11, 0.0f, 2);
            float f12 = lv.t.f28256j;
            r9.d(f0.U(sVar, R.string.login_charity_welcome), d2.c.D(tVarB, 0.0f, f12, 0.0f, 0.0f, 13), lv.s.f28215a, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28262a, sVar, 432, 12582912, 130040);
            r9.d(f0.U(sVar, R.string.login_charity_connect_charity_text), d2.c.D(d2.c.B(m2.t(m2.d(qVar, 1.0f), 3), f11, 0.0f, 2), 0.0f, lv.t.f28252f, 0.0f, 0.0f, 13), lv.s.C, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 0, 0, null, v.f28274n, sVar, 432, 12582912, 130040);
            t tVarD2 = d2.c.D(qVar, 0.0f, f12, 0.0f, 0.0f, 13);
            String strU = f0.U(sVar, R.string.login_charity_connect_to_charity);
            boolean z11 = (i12 & 7168) == 2048;
            Object objM = sVar.M();
            if (z11 || objM == m3.m.f29332a) {
                objM = new ar.d(26, function03);
                sVar.k0(objM);
            }
            v0.n.l(tVarD2, strU, null, null, null, false, false, null, null, (Function0) objM, sVar, 6, 508);
            sVar.q(true);
            function04 = function0;
            function05 = function02;
            t tVarA = b4.a.a(d2.c.D(d2.c.B(m2.e(m2.d(qVar, 1.0f), 40), f11, 0.0f, 2), 0.0f, 0.0f, 0.0f, lv.t.f28254h, 7), c5.m2.f7291a, new c0(2, function04, function05));
            u0 u0VarD = p.d(kVar2, false);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            t tVarC3 = b4.a.c(tVarA, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            a0.y(iHashCode3, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC3, gVar4, sVar);
            r9.d(f0.U(sVar, R.string.login_charity_cancel), null, lv.s.f28217b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, v.f28281u, sVar, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
            sVar = sVar;
            sVar.q(true);
            sVar.q(true);
        } else {
            function04 = function0;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new t0(tVar, function04, i11, function05, function03, 9);
        }
    }

    public static final void i(t tVar, ei.a aVar, Function0 function0, Function0 function02, m3.n nVar, int i11) {
        s sVar;
        t tVar2;
        ei.a aVar2;
        aVar.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(-1996489313);
        int i12 = i11 | 6 | (sVar2.h(aVar) ? 32 : 16) | (sVar2.h(function0) ? 256 : 128) | (sVar2.h(function02) ? 2048 : 1024);
        if (sVar2.R(i12 & 1, (i12 & 1171) != 1170)) {
            boolean zH = sVar2.h(aVar);
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (zH || objM == fVar) {
                b40.d dVar = new b40.d(0, aVar, ei.a.class, "logout", "logout()V", 0, 6);
                aVar2 = aVar;
                sVar2.k0(dVar);
                objM = dVar;
            } else {
                aVar2 = aVar;
            }
            Function0 function03 = (Function0) ((KFunction) objM);
            boolean zH2 = sVar2.h(aVar2) | ((i12 & 7168) == 2048);
            Object objM2 = sVar2.M();
            if (zH2 || objM2 == fVar) {
                objM2 = new bs.b(25, aVar2, function02);
                sVar2.k0(objM2);
            }
            q qVar = q.f5711a;
            sVar = sVar2;
            h(qVar, function03, function0, (Function0) objM2, sVar, i12 & 910);
            tVar2 = qVar;
        } else {
            sVar = sVar2;
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.p(tVar2, aVar, i11, function0, function02, 9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(hr.i r27, kotlin.jvm.functions.Function0 r28, kotlin.jvm.functions.Function1 r29, kotlin.jvm.functions.Function0 r30, m3.n r31, int r32) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.g.j(hr.i, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, m3.n, int):void");
    }

    public static final void k(final BaseItemMnuV2 baseItemMnuV2, final String str, final Function0 function0, final boolean z11, final float f11, t tVar, m3.n nVar, final int i11) {
        Function0 function02;
        final t tVar2;
        baseItemMnuV2.getClass();
        function0.getClass();
        s sVar = (s) nVar;
        sVar.c0(1163444753);
        int i12 = (sVar.h(baseItemMnuV2) ? 4 : 2) | i11 | (sVar.f(str) ? 32 : 16);
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            function02 = function0;
            i12 |= sVar.h(function02) ? 256 : 128;
        } else {
            function02 = function0;
        }
        int i13 = i12 | (sVar.g(z11) ? NewHope.SENDB_BYTES : 1024) | (sVar.c(f11) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | 196608;
        if (sVar.R(i13 & 1, (74899 & i13) != 74898)) {
            q qVar = q.f5711a;
            t tVarD = m2.d(qVar, 1.0f);
            y yVarA = w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarD, sVar);
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
            r9.d(f0.U(sVar, R.string.mnu_recommended_title), d2.c.D(qVar, 0.0f, 0.0f, 0.0f, z11 ? lv.t.f28249c : lv.t.f28251e, 7), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, m5.u0.a(v.l, lv.s.f28217b, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), sVar, 0, 0, 131068);
            sVar = sVar;
            s0.b(androidx.compose.foundation.b.c(m2.d(qVar, 1.0f), false, null, null, function02, 15), l2.g.b(12), null, s0.q(2, 0.0f, 0.0f, 0.0f, 62), null, u3.e.e(1271458089, sVar, new i80.n() { // from class: zo.a
                @Override // i80.n
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    g gVar;
                    float f12;
                    j jVar;
                    n nVar2 = (n) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((z) obj).getClass();
                    s sVar2 = (s) nVar2;
                    if (sVar2.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                        long j9 = lv.s.J;
                        q qVar2 = q.f5711a;
                        r0 r0Var = g0.f23254b;
                        t tVarJ = v1.n.j(qVar2, j9, r0Var);
                        d dVar = i.f13803c;
                        b4.i iVar = b4.d.f5694m;
                        y yVarA2 = w.a(dVar, iVar, sVar2, 0);
                        int iHashCode2 = Long.hashCode(sVar2.T);
                        u3.i iVarL2 = sVar2.l();
                        t tVarC2 = b4.a.c(tVarJ, sVar2);
                        b5.j.R.getClass();
                        h hVar2 = b5.i.f5839b;
                        sVar2.e0();
                        if (sVar2.S) {
                            sVar2.k(hVar2);
                        } else {
                            sVar2.n0();
                        }
                        g gVar2 = b5.i.f5843f;
                        m3.i.C(yVarA2, gVar2, sVar2);
                        g gVar3 = b5.i.f5842e;
                        m3.i.C(iVarL2, gVar3, sVar2);
                        Integer numValueOf = Integer.valueOf(iHashCode2);
                        g gVar4 = b5.i.f5844g;
                        m3.i.v(sVar2, numValueOf, gVar4);
                        b5.d dVar2 = b5.i.f5845h;
                        m3.i.z(sVar2, dVar2);
                        g gVar5 = b5.i.f5841d;
                        m3.i.C(tVarC2, gVar5, sVar2);
                        BaseItemMnuV2 baseItemMnuV22 = baseItemMnuV2;
                        Picture coverPicture = baseItemMnuV22.getCoverPicture();
                        String currentUrl = coverPicture != null ? coverPicture.getCurrentUrl() : null;
                        t tVarE = m2.e(m2.d(qVar2, 1.0f), f11);
                        float f13 = lv.t.f28249c;
                        float f14 = 8;
                        o.a(currentUrl, null, f4.g.b(d2.c.z(tVarE, f13), l2.g.b(f14)), l.f47166a, sVar2, 1572912, 0, 1976);
                        boolean z12 = z11;
                        t tVarA = d2.c.A(qVar2, f14, z12 ? f13 : lv.t.f28251e);
                        y yVarA3 = w.a(dVar, iVar, sVar2, 0);
                        int iHashCode3 = Long.hashCode(sVar2.T);
                        u3.i iVarL3 = sVar2.l();
                        t tVarC3 = b4.a.c(tVarA, sVar2);
                        sVar2.e0();
                        if (sVar2.S) {
                            sVar2.k(hVar2);
                        } else {
                            sVar2.n0();
                        }
                        m3.i.C(yVarA3, gVar2, sVar2);
                        m3.i.C(iVarL3, gVar3, sVar2);
                        a0.y(iHashCode3, sVar2, gVar4, sVar2, dVar2);
                        m3.i.C(tVarC3, gVar5, sVar2);
                        String itemName = baseItemMnuV22.getItemName();
                        if (itemName == null) {
                            itemName = "";
                        }
                        m5.u0 u0Var = v.l;
                        long j11 = lv.s.C;
                        r9.d(itemName, null, 0L, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, m5.u0.a(u0Var, j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), sVar2, 0, 24960, 110590);
                        String subtitle = baseItemMnuV22.getSubtitle();
                        if (subtitle == null) {
                            subtitle = "";
                        }
                        m5.u0 u0Var2 = v.f28276p;
                        m5.u0 u0VarA = m5.u0.a(u0Var2, j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214);
                        float f15 = lv.t.f28248b;
                        r9.d(subtitle, d2.c.D(qVar2, 0.0f, f15, 0.0f, 0.0f, 13), 0L, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, u0VarA, sVar2, 48, 24960, 110588);
                        s sVar3 = sVar2;
                        sVar3.q(true);
                        t tVarE2 = m2.e(m2.d(qVar2, 1.0f), 1);
                        float f16 = lv.t.f28251e;
                        p.a(v1.n.j(d2.c.B(tVarE2, f16, 0.0f, 2), lv.s.G, r0Var), sVar3, 6);
                        t tVarA2 = d2.c.A(m2.d(qVar2, 1.0f), f16, z12 ? f13 : f16);
                        e eVar = i.f13807g;
                        j jVar2 = b4.d.f5693k;
                        d2.i2 i2VarA = d2.h2.a(eVar, jVar2, sVar3, 54);
                        int iHashCode4 = Long.hashCode(sVar3.T);
                        u3.i iVarL4 = sVar3.l();
                        t tVarC4 = b4.a.c(tVarA2, sVar3);
                        sVar3.e0();
                        if (sVar3.S) {
                            sVar3.k(hVar2);
                        } else {
                            sVar3.n0();
                        }
                        m3.i.C(i2VarA, gVar2, sVar3);
                        m3.i.C(iVarL4, gVar3, sVar3);
                        a0.y(iHashCode4, sVar3, gVar4, sVar3, dVar2);
                        m3.i.C(tVarC4, gVar5, sVar3);
                        ManufacturerItemProperties manufacturerItemProperties = baseItemMnuV22.getManufacturerItemProperties();
                        if ((manufacturerItemProperties != null ? manufacturerItemProperties.getBottleDeposit() : null) != null) {
                            sVar3.a0(-874406613);
                            String strF = mv.r0.f((Context) sVar3.j(v0.f7390b), str);
                            m5.u0 u0VarA2 = m5.u0.a(u0Var2, j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214);
                            t tVarA3 = d2.c.A(v1.n.j(qVar2, lv.s.H, l2.g.b(4)), f13, f15);
                            f12 = f16;
                            gVar = gVar5;
                            jVar = jVar2;
                            r9.d(strF, tVarA3, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0VarA2, sVar3, 0, 0, 131068);
                            sVar3 = sVar3;
                            sVar3.q(false);
                        } else {
                            gVar = gVar5;
                            f12 = f16;
                            jVar = jVar2;
                            ManufacturerItemProperties manufacturerItemProperties2 = baseItemMnuV22.getManufacturerItemProperties();
                            if (manufacturerItemProperties2 != null ? Intrinsics.areEqual(manufacturerItemProperties2.getFreeDelivery(), Boolean.TRUE) : false) {
                                sVar3.a0(-873483123);
                                r9.d(f0.U(sVar3, R.string.mnu_free_delivery), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, m5.u0.a(u0Var2, lv.s.D, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), sVar3, 0, 0, 131070);
                                sVar3 = sVar3;
                                sVar3.q(false);
                            } else {
                                sVar3.a0(-28167627);
                                if (!(((double) 1.0f) > 0.0d)) {
                                    e2.a.a("invalid weight; must be greater than zero");
                                }
                                d2.c.f(new n1(1.0f, true), sVar3);
                                sVar3.q(false);
                            }
                        }
                        d2.i2 i2VarA2 = d2.h2.a(i.f13801a, jVar, sVar3, 48);
                        int iHashCode5 = Long.hashCode(sVar3.T);
                        u3.i iVarL5 = sVar3.l();
                        t tVarC5 = b4.a.c(qVar2, sVar3);
                        sVar3.e0();
                        if (sVar3.S) {
                            sVar3.k(hVar2);
                        } else {
                            sVar3.n0();
                        }
                        m3.i.C(i2VarA2, gVar2, sVar3);
                        m3.i.C(iVarL5, gVar3, sVar3);
                        a0.y(iHashCode5, sVar3, gVar4, sVar3, dVar2);
                        m3.i.C(tVarC5, gVar, sVar3);
                        if (baseItemMnuV22.getItemValue() == null || baseItemMnuV22.getItemValue().getMinorUnits() == 0) {
                            sVar3.a0(124248759);
                            sVar3.q(false);
                        } else {
                            sVar3.a0(123809737);
                            s sVar4 = sVar3;
                            r9.d(mv.d.i(baseItemMnuV22.getItemValue(), 1), d2.c.D(qVar2, 0.0f, 0.0f, f12, 0.0f, 11), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, m5.u0.a(u0Var2, lv.s.D, 0L, null, null, 0L, x5.l.f43855d, 0, 0L, null, null, 16773118), sVar4, 48, 0, 131068);
                            sVar3 = sVar4;
                            sVar3.q(false);
                        }
                        s sVar5 = sVar3;
                        r9.d(mv.d.i(baseItemMnuV22.getItemPrice(), 1), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, m5.u0.a(u0Var, j11, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214), sVar5, 0, 0, 131070);
                        f.D(sVar5, true, true, true);
                    } else {
                        sVar2.U();
                    }
                    return Unit.f26487a;
                }
            }), sVar, 196608, 20);
            sVar.q(true);
            tVar2 = qVar;
        } else {
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new Function2() { // from class: zo.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    h0.g.k(baseItemMnuV2, str, function0, z11, f11, tVar2, (n) obj, m3.i.F(i11 | 1));
                    return Unit.f26487a;
                }
            };
        }
    }

    public static float l(float f11) {
        return f11 <= 0.0031308f ? f11 * 12.92f : (float) ((Math.pow(f11, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static final void m(t tVar, BasicItem basicItem, float f11, m3.n nVar, int i11) {
        int i12;
        basicItem.getClass();
        s sVar = (s) nVar;
        sVar.c0(-1142622074);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(tVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(basicItem) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.c(f11) ? 256 : 128;
        }
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            gd.i iVarG = gd.o.g(mv.d.k(basicItem).getCurrentUrl(), o00.x0.z(R.drawable.transparent_vector, sVar, 0), o00.x0.z(R.drawable.transparent_vector, sVar, 0), o00.x0.z(R.drawable.transparent_vector, sVar, 0), sVar);
            float f12 = 1;
            long j9 = lv.s.H;
            l2.f fVar = l2.g.f26790a;
            v1.n.d(iVarG, null, v1.n.j(m2.m(d2.c.z(f4.g.b(v1.n.k(tVar, f12, j9, fVar), fVar), f12), 48), lv.s.J, g0.f23254b), null, z4.l.f47166a, f11, null, sVar, ((i12 << 9) & 458752) | 24624, 72);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new fg.c(tVar, basicItem, f11, i11, 1);
        }
    }

    public static int n(int i11, float f11, int i12) {
        if (i11 == i12 || f11 <= 0.0f) {
            return i11;
        }
        if (f11 >= 1.0f) {
            return i12;
        }
        float f12 = ((i11 >> 24) & 255) / 255.0f;
        float f13 = ((i12 >> 24) & 255) / 255.0f;
        float f14 = f(((i11 >> 16) & 255) / 255.0f);
        float f15 = f(((i11 >> 8) & 255) / 255.0f);
        float f16 = f((i11 & 255) / 255.0f);
        float f17 = f(((i12 >> 16) & 255) / 255.0f);
        float f18 = f(((i12 >> 8) & 255) / 255.0f);
        float f19 = f((i12 & 255) / 255.0f);
        float fA = j4.s.a(f13, f12, f11, f12);
        float fA2 = j4.s.a(f17, f14, f11, f14);
        float fA3 = j4.s.a(f18, f15, f11, f15);
        float fA4 = j4.s.a(f19, f16, f11, f16);
        float fL = l(fA2) * 255.0f;
        float fL2 = l(fA3) * 255.0f;
        return Math.round(l(fA4) * 255.0f) | (Math.round(fL) << 16) | (Math.round(fA * 255.0f) << 24) | (Math.round(fL2) << 8);
    }

    public static InvocationHandler o() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = a3.v();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e5) {
                org.bouncycastle.jce.provider.a.m(e5);
                return null;
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static ColorStateList p(Context context, TypedArray typedArray, int i11) {
        int resourceId;
        ColorStateList colorStateListB;
        return (!typedArray.hasValue(i11) || (resourceId = typedArray.getResourceId(i11, 0)) == 0 || (colorStateListB = androidx.core.app.e.b(context, resourceId)) == null) ? typedArray.getColorStateList(i11) : colorStateListB;
    }

    public static ColorStateList q(Context context, j30.g gVar, int i11) {
        int resourceId;
        ColorStateList colorStateListB;
        TypedArray typedArray = (TypedArray) gVar.f24503c;
        return (!typedArray.hasValue(i11) || (resourceId = typedArray.getResourceId(i11, 0)) == 0 || (colorStateListB = androidx.core.app.e.b(context, resourceId)) == null) ? gVar.j(i11) : colorStateListB;
    }

    public static int r(Context context, TypedArray typedArray, int i11, int i12) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i11, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i11, i12);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i12);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable s(Context context, TypedArray typedArray, int i11) {
        int resourceId;
        Drawable drawableX;
        return (!typedArray.hasValue(i11) || (resourceId = typedArray.getResourceId(i11, 0)) == 0 || (drawableX = b0.a0.x(context, resourceId)) == null) ? typedArray.getDrawable(i11) : drawableX;
    }

    public static Object t(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a70.a.f(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static int u(Context context, int i11) {
        if (i11 == 0) {
            return 0;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i11, j10.a.H);
        TypedValue typedValue = new TypedValue();
        boolean value = typedArrayObtainStyledAttributes.getValue(4, typedValue);
        if (!value) {
            value = typedArrayObtainStyledAttributes.getValue(2, typedValue);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!value) {
            return 0;
        }
        int complexUnit = typedValue.getComplexUnit();
        int i12 = typedValue.data;
        return complexUnit == 2 ? Math.round(TypedValue.complexToFloat(i12) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(i12, context.getResources().getDisplayMetrics());
    }

    public static final int v(int i11, int i12) {
        return (i11 >> i12) & 31;
    }

    public static boolean w(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean x(w4.n r7) {
        /*
            java.util.List r0 = r7.f43165a
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L8:
            r4 = 1
            if (r3 >= r1) goto L39
            java.lang.Object r5 = r0.get(r3)
            w4.v r5 = (w4.v) r5
            int r5 = r5.f43186i
            r6 = 2
            if (r5 != r6) goto L19
            int r3 = r3 + 1
            goto L8
        L19:
            android.view.MotionEvent r0 = r7.a()
            if (r0 == 0) goto L28
            r1 = 8194(0x2002, float:1.1482E-41)
            boolean r0 = r0.isFromSource(r1)
            if (r0 != r4) goto L28
            goto L39
        L28:
            android.view.MotionEvent r7 = r7.a()
            if (r7 == 0) goto L38
            r0 = 1048584(0x100008, float:1.469379E-39)
            boolean r7 = r7.isFromSource(r0)
            if (r7 != r4) goto L38
            goto L39
        L38:
            return r2
        L39:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.g.x(w4.n):boolean");
    }

    public static e6.l y(CoroutineContext coroutineContext, Function2 function2) {
        v80.d0 d0Var = v80.d0.DEFAULT;
        coroutineContext.getClass();
        d0Var.getClass();
        return ox.h.A(new b40.a(coroutineContext, d0Var, function2));
    }

    public static final long z(float f11, long j9) {
        return (Float.isNaN(f11) || f11 >= 1.0f) ? j9 : i4.v.b(i4.v.d(j9) * f11, j9);
    }

    public abstract void B(Throwable th2);

    public abstract void C(com.google.firebase.messaging.a0 a0Var);

    public String toString() {
        switch (this.f20971a) {
            case 13:
                return ((o30.v0) this).f31931f.toString();
            default:
                return super.toString();
        }
    }
}
