package jb;

import a3.m3;
import a3.t0;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import ao.e1;
import bg.a1;
import c5.v0;
import c5.x1;
import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import com.app.tgtg.R;
import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.local.LatestBasketInteraction;
import com.app.tgtg.model.local.LatestInteractionOrigin;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.item.ItemTag;
import com.app.tgtg.model.remote.item.ItemTagInfo;
import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.app.tgtg.model.remote.item.response.ItemMnuV2;
import com.app.tgtg.model.remote.manufacturer.response.BasketResponse;
import com.app.tgtg.model.remote.manufacturer.response.Brand;
import com.app.tgtg.model.remote.manufacturer.response.CateringProperties;
import com.app.tgtg.model.remote.manufacturer.response.ManufacturerItemProperties;
import com.app.tgtg.model.remote.payment.Price;
import com.appsflyer.AdRevenueScheme;
import com.braze.h2;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.i2;
import d2.m2;
import d2.n1;
import g3.m5;
import g3.r9;
import g3.s5;
import i4.g0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jb.u;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.s0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m3.b1;
import m3.d3;
import m3.h1;
import m3.i1;
import m3.j0;
import m3.v1;
import m3.w1;
import m5.p0;
import m5.q0;
import mv.r0;
import o00.x0;
import o30.f0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import y80.a2;
import z4.c1;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f24935a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f24936b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f24937c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f24938d = 0;

    public static ColorFilter A(int i11, x6.a aVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object objR = b6.a.r(aVar);
            if (objR != null) {
                return b6.a.b(i11, objR);
            }
            return null;
        }
        PorterDuff.Mode modeK = jf.e.K(aVar);
        if (modeK != null) {
            return new PorterDuffColorFilter(i11, modeK);
        }
        return null;
    }

    public static final s B(Context context, ib.b bVar) {
        y9.t tVarL;
        context.getClass();
        sb.a aVar = new sb.a(bVar.f23694c);
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        rb.k kVar = aVar.f38956a;
        kVar.getClass();
        ib.y yVar = bVar.f23695d;
        boolean z11 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        yVar.getClass();
        if (z11) {
            tVarL = new y9.t(applicationContext, WorkDatabase.class, null);
            tVarL.f45746i = true;
        } else {
            tVarL = bx.o.L(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            tVarL.f45745h = new he.d(applicationContext);
        }
        tVarL.f45743f = kVar;
        tVarL.f45741d.add(new a(yVar));
        tVarL.a(d.f24860h);
        tVarL.a(new g(applicationContext, 2, 3));
        tVarL.a(d.f24861i);
        tVarL.a(d.f24862j);
        tVarL.a(new g(applicationContext, 5, 6));
        tVarL.a(d.f24863k);
        tVarL.a(d.l);
        tVarL.a(d.f24864m);
        tVarL.a(new g(applicationContext));
        tVarL.a(new g(applicationContext, 10, 11));
        tVarL.a(d.f24856d);
        tVarL.a(d.f24857e);
        tVarL.a(d.f24858f);
        tVarL.a(d.f24859g);
        tVarL.a(new g(applicationContext, 21, 22));
        tVarL.f45752p = false;
        tVarL.f45753q = true;
        tVarL.f45754r = true;
        WorkDatabase workDatabase = (WorkDatabase) tVarL.b();
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        ob.j jVar = new ob.j(applicationContext2, aVar);
        f fVar = new f(context.getApplicationContext(), bVar, aVar, workDatabase);
        t tVar = t.f24934a;
        tVar.getClass();
        tVar.getClass();
        context.getClass();
        String str = j.f24900a;
        lb.d dVar = new lb.d(context, workDatabase, bVar);
        rb.i.a(context, SystemJobService.class, true);
        ib.w.d().a(j.f24900a, "Created SystemJobScheduler and enabled SystemJobService");
        return new s(context.getApplicationContext(), bVar, aVar, workDatabase, kotlin.collections.d0.h(dVar, new kb.c(context, bVar, jVar, fVar, new dn.k(fVar, aVar), aVar)), fVar, jVar);
    }

    public static Set C() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final String E(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has(StatusResponseUtils.RESULT_ERROR)) {
            return "";
        }
        String string = jSONObject.getString(StatusResponseUtils.RESULT_ERROR);
        string.getClass();
        return string;
    }

    public static final x5.j F(q0 q0Var, int i11) {
        p0 p0Var = q0Var.f29617a;
        m5.r rVar = q0Var.f29618b;
        if (p0Var.f29603a.f29538b.length() != 0) {
            int iD = rVar.d(i11);
            if ((i11 != 0 && iD == rVar.d(i11 - 1)) || (i11 != p0Var.f29603a.f29538b.length() && iD == rVar.d(i11 + 1))) {
                return q0Var.a(i11);
            }
        }
        return q0Var.j(i11);
    }

    public static boolean I(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static final JSONObject L(String str, JSONObject jSONObject) {
        jSONObject.getClass();
        if (jSONObject.has(str)) {
            return jSONObject.getJSONObject(str);
        }
        return null;
    }

    public static final String M(String str, JSONObject jSONObject) {
        jSONObject.getClass();
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    public static final e.n N(ActivityResultContract activityResultContract, Function1 function1, m3.n nVar, int i11) {
        ActivityResultContract activityResultContract2;
        b1 b1VarB = m3.i.B(activityResultContract, nVar);
        b1 b1VarB2 = m3.i.B(function1, nVar);
        Object[] objArr = new Object[0];
        m3.s sVar = (m3.s) nVar;
        Object objM = sVar.M();
        m3.f fVar = m3.m.f29332a;
        if (objM == fVar) {
            objM = new db0.c(20);
            sVar.k0(objM);
        }
        String str = (String) y3.j.c(objArr, (Function0) objM, sVar);
        h.f fVar2 = (h.f) sVar.j(e.l.f15296a);
        if (fVar2 == null) {
            sVar.a0(1213380307);
            Object baseContext = (Context) sVar.j(v0.f7390b);
            while (true) {
                if (!(baseContext instanceof ContextWrapper)) {
                    baseContext = null;
                    break;
                }
                if (baseContext instanceof h.f) {
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            fVar2 = (h.f) baseContext;
        } else {
            sVar.a0(1213379439);
        }
        sVar.q(false);
        if (fVar2 == null) {
            h2.b("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
            return null;
        }
        ActivityResultRegistry activityResultRegistry = fVar2.getActivityResultRegistry();
        Object objM2 = sVar.M();
        if (objM2 == fVar) {
            objM2 = new e.a();
            sVar.k0(objM2);
        }
        e.a aVar = (e.a) objM2;
        Object objM3 = sVar.M();
        if (objM3 == fVar) {
            objM3 = new e.n(aVar, b1VarB);
            sVar.k0(objM3);
        }
        e.n nVar2 = (e.n) objM3;
        boolean zH = sVar.h(aVar) | sVar.h(activityResultRegistry) | sVar.f(str) | sVar.h(activityResultContract) | sVar.f(b1VarB2);
        Object objM4 = sVar.M();
        if (zH || objM4 == fVar) {
            activityResultContract2 = activityResultContract;
            objM4 = new a1(aVar, activityResultRegistry, str, activityResultContract2, b1VarB2, 2);
            sVar.k0(objM4);
        } else {
            activityResultContract2 = activityResultContract;
        }
        Function1 function12 = (Function1) objM4;
        boolean zF = sVar.f(activityResultRegistry) | sVar.f(str) | sVar.f(activityResultContract2);
        Object objM5 = sVar.M();
        if (zF || objM5 == fVar) {
            objM5 = new j0(function12);
            sVar.k0(objM5);
        }
        return nVar2;
    }

    public static void O(oz.m mVar, float f11) {
        p1.a aVar = (p1.a) mVar.f33836b;
        CardView cardView = (CardView) mVar.f33837c;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f11 != aVar.f34112e || aVar.f34113f != useCompatPadding || aVar.f34114g != preventCornerOverlap) {
            aVar.f34112e = f11;
            aVar.f34113f = useCompatPadding;
            aVar.f34114g = preventCornerOverlap;
            aVar.b(null);
            aVar.invalidateSelf();
        }
        U(mVar);
    }

    public static int P(int i11) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i11) * (-862048943)), 15)) * 461845907);
    }

    public static final pf.a Q(JSONObject jSONObject) throws JSONException {
        e1.a aVar;
        jSONObject.getClass();
        pf.a aVar2 = new pf.a();
        String string = jSONObject.getString("event_type");
        string.getClass();
        aVar2.L = string;
        aVar2.f34734a = M("user_id", jSONObject);
        aVar2.f34735b = M("device_id", jSONObject);
        f6.p pVar = null;
        aVar2.f34736c = jSONObject.has("time") ? Long.valueOf(jSONObject.getLong("time")) : null;
        JSONObject jSONObjectL = L("event_properties", jSONObject);
        aVar2.M = jSONObjectL != null ? new LinkedHashMap(ex.i.P(jSONObjectL)) : null;
        JSONObject jSONObjectL2 = L("user_properties", jSONObject);
        aVar2.N = jSONObjectL2 != null ? new LinkedHashMap(ex.i.P(jSONObjectL2)) : null;
        JSONObject jSONObjectL3 = L("groups", jSONObject);
        aVar2.O = jSONObjectL3 != null ? new LinkedHashMap(ex.i.P(jSONObjectL3)) : null;
        JSONObject jSONObjectL4 = L("group_properties", jSONObject);
        aVar2.P = jSONObjectL4 != null ? new LinkedHashMap(ex.i.P(jSONObjectL4)) : null;
        aVar2.f34742i = M("app_version", jSONObject);
        aVar2.f34744k = M("platform", jSONObject);
        aVar2.l = M("os_name", jSONObject);
        aVar2.f34745m = M("os_version", jSONObject);
        aVar2.f34746n = M("device_brand", jSONObject);
        aVar2.f34747o = M("device_manufacturer", jSONObject);
        aVar2.f34748p = M("device_model", jSONObject);
        aVar2.f34749q = M("carrier", jSONObject);
        aVar2.f34750r = M(AdRevenueScheme.COUNTRY, jSONObject);
        aVar2.f34751s = M("region", jSONObject);
        aVar2.f34752t = M("city", jSONObject);
        aVar2.f34753u = M("dma", jSONObject);
        aVar2.A = M("language", jSONObject);
        aVar2.G = jSONObject.has("price") ? Double.valueOf(jSONObject.getDouble("price")) : null;
        aVar2.H = jSONObject.has("quantity") ? Integer.valueOf(jSONObject.getInt("quantity")) : null;
        aVar2.F = jSONObject.has("revenue") ? Double.valueOf(jSONObject.getDouble("revenue")) : null;
        aVar2.I = M("productId", jSONObject);
        aVar2.J = M("revenueType", jSONObject);
        aVar2.f34740g = jSONObject.has("location_lat") ? Double.valueOf(jSONObject.getDouble("location_lat")) : null;
        aVar2.f34741h = jSONObject.has("location_lng") ? Double.valueOf(jSONObject.getDouble("location_lng")) : null;
        aVar2.C = M("ip", jSONObject);
        aVar2.f34754v = M("idfa", jSONObject);
        aVar2.f34755w = M("idfv", jSONObject);
        aVar2.f34756x = M("adid", jSONObject);
        aVar2.f34758z = M("android_id", jSONObject);
        aVar2.f34757y = jSONObject.optString("android_app_set_id", null);
        aVar2.f34737d = jSONObject.has("event_id") ? Long.valueOf(jSONObject.getLong("event_id")) : null;
        aVar2.f34738e = jSONObject.has("session_id") ? Long.valueOf(jSONObject.getLong("session_id")) : null;
        aVar2.f34739f = M("insert_id", jSONObject);
        aVar2.B = jSONObject.has("library") ? jSONObject.getString("library") : null;
        aVar2.K = M("partner_id", jSONObject);
        if (jSONObject.has("plan")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("plan");
            jSONObject2.getClass();
            String strOptString = jSONObject2.optString("branch", null);
            String strOptString2 = jSONObject2.optString("source", null);
            String strOptString3 = jSONObject2.optString("version", null);
            String strOptString4 = jSONObject2.optString("versionId", null);
            aVar = new e1.a();
            aVar.f15429a = strOptString;
            aVar.f15430b = strOptString2;
            aVar.f15431c = strOptString3;
            aVar.f15432d = strOptString4;
        } else {
            aVar = null;
        }
        aVar2.D = aVar;
        if (jSONObject.has("ingestion_metadata")) {
            JSONObject jSONObject3 = jSONObject.getJSONObject("ingestion_metadata");
            jSONObject3.getClass();
            pVar = new f6.p(jSONObject3.optString("source_name", null), jSONObject3.optString("source_version", null), 3);
        }
        aVar2.E = pVar;
        return aVar2;
    }

    public static final ArrayList R(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        Iterator it = n80.p.j(0, jSONArray.length()).iterator();
        while (((n80.h) it).f30715c) {
            JSONObject jSONObject = jSONArray.getJSONObject(((s0) it).nextInt());
            jSONObject.getClass();
            arrayList.add(Q(jSONObject));
        }
        return arrayList;
    }

    public static final int[] S(JSONArray jSONArray) {
        jSONArray.getClass();
        int length = jSONArray.length();
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = jSONArray.optInt(i11);
        }
        return iArr;
    }

    public static final ArrayList T(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        Iterator it = n80.p.j(0, jSONArray.length()).iterator();
        while (((n80.h) it).f30715c) {
            JSONObject jSONObject = jSONArray.getJSONObject(((s0) it).nextInt());
            jSONObject.getClass();
            arrayList.add(jSONObject);
        }
        return arrayList;
    }

    public static void U(oz.m mVar) {
        float f11;
        float f12;
        CardView cardView = (CardView) mVar.f33837c;
        if (!cardView.getUseCompatPadding()) {
            mVar.y(0, 0, 0, 0);
            return;
        }
        p1.a aVar = (p1.a) mVar.f33836b;
        float f13 = aVar.f34112e;
        float f14 = aVar.f34108a;
        if (cardView.getPreventCornerOverlap()) {
            f11 = (float) (((1.0d - p1.b.f34119a) * ((double) f14)) + ((double) f13));
        } else {
            int i11 = p1.b.f34120b;
            f11 = f13;
        }
        int iCeil = (int) Math.ceil(f11);
        if (cardView.getPreventCornerOverlap()) {
            f12 = (float) (((1.0d - p1.b.f34119a) * ((double) f14)) + ((double) (f13 * 1.5f)));
        } else {
            f12 = f13 * 1.5f;
        }
        int iCeil2 = (int) Math.ceil(f12);
        mVar.y(iCeil, iCeil2, iCeil, iCeil2);
    }

    public static final void a(int i11, BasketManager basketManager, h1 h1Var, int i12, Function1 function1, m3.n nVar, int i13) {
        int i14;
        BasketManager basketManager2;
        long j9;
        basketManager.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(1384692018);
        if ((i13 & 6) == 0) {
            i14 = (sVar.d(i11) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            basketManager2 = basketManager;
            i14 |= sVar.h(basketManager2) ? 32 : 16;
        } else {
            basketManager2 = basketManager;
        }
        if ((i13 & MLKEMEngine.KyberPolyBytes) == 0) {
            i14 |= sVar.f(h1Var) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= sVar.d(i12) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i13 & 24576) == 0) {
            i14 |= sVar.h(function1) ? 16384 : 8192;
        }
        int i15 = 1;
        if (sVar.R(i14 & 1, (i14 & 9363) != 9362)) {
            boolean z11 = i11 - basketManager2.getTotalBasketItems() > 0;
            boolean z12 = h1Var.h() < i12;
            float f11 = ((x60.k) sVar.j(PantryThemeKt.getLocalPantryRadius())).f43981e;
            b4.q qVar = b4.q.f5711a;
            d2.c.f(m2.m(qVar, f11), sVar);
            b4.t tVarM = m2.m(qVar, 28);
            boolean zG = ((i14 & 57344) == 16384) | ((i14 & 896) == 256) | sVar.g(z11);
            Object objM = sVar.M();
            if (zG || objM == m3.m.f29332a) {
                objM = new bg.b(z11, h1Var, function1, i15);
                sVar.k0(objM);
            }
            b4.t tVarC = androidx.compose.foundation.b.c(tVarM, z12, null, null, (Function0) objM, 14);
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
            b4.t tVarA = d2.u.f13938a.a(m2.m(qVar, 20), b4.d.f5687e);
            n4.b bVarZ = x0.z(R.drawable.quantity_add, sVar, 0);
            if (z12) {
                sVar.a0(-665010245);
                j9 = ((x60.h) sVar.j(PantryThemeKt.getLocalPantryColor())).J;
                sVar.q(false);
            } else {
                sVar.a0(-664925894);
                j9 = ((x60.h) sVar.j(PantryThemeKt.getLocalPantryColor())).M;
                sVar.q(false);
            }
            v1.n.d(bVarZ, f0.U(sVar, R.string.voice_over_quantity_selector_plus), tVarA, null, null, 0.0f, new i4.o(j9, 5), sVar, 8, 56);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cg.g(i11, basketManager2, h1Var, i12, function1, i13);
        }
    }

    public static final void b(final BasketResponse basketResponse, m3.n nVar, final int i11) {
        w1 w1VarS;
        Function2 function2;
        String strJ;
        basketResponse.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1242556035);
        int i12 = (sVar.h(basketResponse) ? 4 : 2) | i11;
        final int i13 = 0;
        final int i14 = 1;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            Price requiredAmountToCheckout = basketResponse.getRequiredAmountToCheckout();
            String str = null;
            if (requiredAmountToCheckout == null) {
                sVar.a0(-919949578);
                sVar.q(false);
            } else {
                sVar.a0(-919949577);
                Price basketSubtotalPrice = basketResponse.getBasketSubtotalPrice();
                if (basketSubtotalPrice == null) {
                    sVar.a0(1540423414);
                    sVar.q(false);
                } else {
                    sVar.a0(1540423415);
                    Price requiredAmountToFreeDelivery = basketResponse.getRequiredAmountToFreeDelivery();
                    if (requiredAmountToFreeDelivery == null) {
                        sVar.a0(1895697058);
                        sVar.q(false);
                    } else {
                        sVar.a0(1895697059);
                        if (!basketResponse.getCanCheckout()) {
                            sVar.a0(1467246379);
                            strJ = f0.T(R.string.mnu_basket_screen_offer_body_order_value, new Object[]{mv.d.i(new Price(requiredAmountToCheckout.getCurrency(), requiredAmountToCheckout.getDecimals(), requiredAmountToCheckout.getMinorUnits() - basketSubtotalPrice.getMinorUnits()), 1)}, sVar);
                            sVar.q(false);
                        } else if (Intrinsics.areEqual(basketResponse.getFreeDelivery(), Boolean.FALSE)) {
                            sVar.a0(1467801465);
                            strJ = f0.T(R.string.mnu_basket_screen_offer_body_progress_delivery, new Object[]{mv.d.i(new Price(requiredAmountToFreeDelivery.getCurrency(), requiredAmountToFreeDelivery.getDecimals(), requiredAmountToFreeDelivery.getMinorUnits() - basketSubtotalPrice.getMinorUnits()), 1)}, sVar);
                            sVar.q(false);
                        } else {
                            strJ = b3.i.j(1468319258, R.string.mnu_basket_screen_offer_body_free_delivery, sVar, sVar, false);
                        }
                        str = strJ;
                        sVar.q(false);
                    }
                    sVar.q(false);
                }
                sVar.q(false);
            }
            if (str == null) {
                w1VarS = sVar.s();
                if (w1VarS != null) {
                    function2 = new Function2(basketResponse, i11, i13) { // from class: vm.a

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f42420a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ BasketResponse f42421b;

                        {
                            this.f42420a = i13;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i15 = this.f42420a;
                            m3.n nVar2 = (m3.n) obj;
                            ((Integer) obj2).getClass();
                            switch (i15) {
                                case 0:
                                    u.b(this.f42421b, nVar2, m3.i.F(1));
                                    break;
                                default:
                                    u.b(this.f42421b, nVar2, m3.i.F(1));
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    };
                    w1VarS.f29476d = function2;
                }
                return;
            }
            float f11 = lv.t.f28253g;
            b4.q qVar = b4.q.f5711a;
            b4.t tVarB = d2.c.B(qVar, f11, 0.0f, 2);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarB, sVar);
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
            d2.c.f(m2.m(qVar, f11), sVar);
            c(str, basketResponse, sVar, (i12 << 3) & 112);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1VarS = sVar.s();
        if (w1VarS != null) {
            function2 = new Function2(basketResponse, i11, i14) { // from class: vm.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f42420a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BasketResponse f42421b;

                {
                    this.f42420a = i14;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i15 = this.f42420a;
                    m3.n nVar2 = (m3.n) obj;
                    ((Integer) obj2).getClass();
                    switch (i15) {
                        case 0:
                            u.b(this.f42421b, nVar2, m3.i.F(1));
                            break;
                        default:
                            u.b(this.f42421b, nVar2, m3.i.F(1));
                            break;
                    }
                    return Unit.f26487a;
                }
            };
            w1VarS.f29476d = function2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [boolean, int] */
    public static final void c(String str, BasketResponse basketResponse, m3.n nVar, int i11) {
        int i12;
        BasketResponse basketResponse2;
        m3.s sVar;
        String strJ;
        Function0 function0;
        boolean z11;
        b5.g gVar;
        b5.g gVar2;
        b4.j jVar;
        d2.b bVar;
        b4.q qVar;
        b5.g gVar3;
        b5.g gVar4;
        float f11;
        b5.d dVar;
        float f12;
        m3.s sVar2;
        long j9;
        b4.q qVar2;
        boolean z12;
        ?? r13;
        m3.s sVar3;
        b4.q qVar3;
        b4.t tVarN;
        m3.s sVar4;
        basketResponse.getClass();
        m3.s sVar5 = (m3.s) nVar;
        sVar5.c0(1500666761);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar5.f(str) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar5.h(basketResponse) ? 32 : 16;
        }
        int i13 = i12;
        if (sVar5.R(i13 & 1, (i13 & 19) != 18)) {
            long j11 = basketResponse.getCanCheckout() ? Intrinsics.areEqual(basketResponse.getFreeDelivery(), Boolean.TRUE) ? lv.s.I : lv.s.A : lv.s.f28233n;
            Integer numValueOf = null;
            if (!basketResponse.getCanCheckout()) {
                strJ = b3.i.j(-1297365534, R.string.mnu_basket_screen_offer_header_order_value, sVar5, sVar5, false);
            } else if (Intrinsics.areEqual(basketResponse.getFreeDelivery(), Boolean.FALSE)) {
                sVar5.a0(-1297232730);
                sVar5.q(false);
                strJ = null;
            } else {
                strJ = b3.i.j(-1297204768, R.string.mnu_basket_screen_offer_header_free_delivery, sVar5, sVar5, false);
            }
            if (!basketResponse.getCanCheckout()) {
                numValueOf = 2131231789;
            } else if (Intrinsics.areEqual(basketResponse.getFreeDelivery(), Boolean.TRUE)) {
                numValueOf = Integer.valueOf(R.drawable.free_delivery_badge);
            }
            Integer num = numValueOf;
            l2.f fVarB = l2.g.b(12);
            b4.q qVar4 = b4.q.f5711a;
            b4.t tVarJ = v1.n.j(qVar4, j11, fVarB);
            float f13 = lv.t.f28253g;
            float f14 = lv.t.f28251e;
            b4.t tVarC = d2.c.C(tVarJ, f13, !basketResponse.getCanCheckout() ? lv.t.f28254h : f13, f14, !basketResponse.getCanCheckout() ? lv.t.f28254h : f13);
            d2.d dVar2 = d2.i.f13803c;
            b4.i iVar = b4.d.f5694m;
            d2.y yVarA = d2.w.a(dVar2, iVar, sVar5, 0);
            int iHashCode = Long.hashCode(sVar5.T);
            u3.i iVarL = sVar5.l();
            b4.t tVarC2 = b4.a.c(tVarC, sVar5);
            b5.j.R.getClass();
            Function0 function02 = b5.i.f5839b;
            sVar5.e0();
            if (sVar5.S) {
                sVar5.k(function02);
            } else {
                sVar5.n0();
            }
            b5.g gVar5 = b5.i.f5843f;
            m3.i.C(yVarA, gVar5, sVar5);
            b5.g gVar6 = b5.i.f5842e;
            m3.i.C(iVarL, gVar6, sVar5);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            b5.g gVar7 = b5.i.f5844g;
            m3.i.v(sVar5, numValueOf2, gVar7);
            b5.d dVar3 = b5.i.f5845h;
            m3.i.z(sVar5, dVar3);
            b5.g gVar8 = b5.i.f5841d;
            m3.i.C(tVarC2, gVar8, sVar5);
            b4.t tVarD = m2.d(qVar4, 1.0f);
            b4.j jVar2 = b4.d.f5693k;
            d2.b bVar2 = d2.i.f13801a;
            i2 i2VarA = d2.h2.a(bVar2, jVar2, sVar5, 48);
            int iHashCode2 = Long.hashCode(sVar5.T);
            u3.i iVarL2 = sVar5.l();
            b4.t tVarC3 = b4.a.c(tVarD, sVar5);
            sVar5.e0();
            String str2 = strJ;
            if (sVar5.S) {
                sVar5.k(function02);
            } else {
                sVar5.n0();
            }
            m3.i.C(i2VarA, gVar5, sVar5);
            m3.i.C(iVarL2, gVar6, sVar5);
            w.a0.y(iHashCode2, sVar5, gVar7, sVar5, dVar3);
            m3.i.C(tVarC3, gVar8, sVar5);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            n1 n1Var = new n1(1.0f, true);
            d2.y yVarA2 = d2.w.a(dVar2, iVar, sVar5, 0);
            int iHashCode3 = Long.hashCode(sVar5.T);
            u3.i iVarL3 = sVar5.l();
            b4.t tVarC4 = b4.a.c(n1Var, sVar5);
            sVar5.e0();
            if (sVar5.S) {
                sVar5.k(function02);
            } else {
                sVar5.n0();
            }
            m3.i.C(yVarA2, gVar5, sVar5);
            m3.i.C(iVarL3, gVar6, sVar5);
            w.a0.y(iHashCode3, sVar5, gVar7, sVar5, dVar3);
            m3.i.C(tVarC4, gVar8, sVar5);
            if (str2 == null) {
                sVar5.a0(-838359757);
                sVar5.q(false);
                function0 = function02;
                dVar = dVar3;
                gVar = gVar7;
                z11 = false;
                gVar2 = gVar8;
                jVar = jVar2;
                bVar = bVar2;
                gVar3 = gVar6;
                gVar4 = gVar5;
                f11 = f13;
                f12 = f14;
                qVar = qVar4;
                sVar2 = sVar5;
            } else {
                sVar5.a0(-838359756);
                function0 = function02;
                z11 = false;
                gVar = gVar7;
                gVar2 = gVar8;
                jVar = jVar2;
                bVar = bVar2;
                qVar = qVar4;
                gVar3 = gVar6;
                gVar4 = gVar5;
                f11 = f13;
                dVar = dVar3;
                f12 = f14;
                r9.d(str2, null, lv.s.C, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, !basketResponse.getCanCheckout() ? lv.v.f28265d : lv.v.f28277q, sVar5, MLKEMEngine.KyberPolyBytes, 0, 131066);
                m3.s sVar6 = sVar5;
                b3.i.y(qVar, lv.t.f28249c, sVar6, false);
                sVar2 = sVar6;
            }
            m5.u0 u0Var = lv.v.f28276p;
            long j12 = lv.s.C;
            m3.s sVar7 = sVar2;
            Function0 function03 = function0;
            b4.q qVar5 = qVar;
            r9.d(str, null, j12, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar7, (i13 & 14) | MLKEMEngine.KyberPolyBytes, 12582912, 131066);
            m3.s sVar8 = sVar7;
            if (basketResponse.getCanCheckout()) {
                j9 = j12;
                qVar2 = qVar5;
                z12 = true;
                r13 = 0;
                sVar8.a0(-836992439);
                sVar8.q(false);
                sVar3 = sVar8;
            } else {
                r8.k.t(f12, -837749707, qVar5, sVar8, sVar8);
                i2 i2VarA2 = d2.h2.a(bVar, jVar, sVar8, 48);
                int iHashCode4 = Long.hashCode(sVar8.T);
                u3.i iVarL4 = sVar8.l();
                b4.t tVarC5 = b4.a.c(qVar5, sVar8);
                sVar8.e0();
                if (sVar8.S) {
                    sVar8.k(function03);
                } else {
                    sVar8.n0();
                }
                m3.i.C(i2VarA2, gVar4, sVar8);
                m3.i.C(iVarL4, gVar3, sVar8);
                w.a0.y(iHashCode4, sVar8, gVar, sVar8, dVar);
                m3.i.C(tVarC5, gVar2, sVar8);
                qVar2 = qVar5;
                r9.d(mv.d.i(basketResponse.getBasketSubtotalPrice(), 1).concat(" / "), null, j12, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar8, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                r9.d(mv.d.i(basketResponse.getRequiredAmountToCheckout(), 1), null, j12, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28277q, sVar8, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                j9 = j12;
                m3.s sVar9 = sVar8;
                z12 = true;
                sVar9.q(true);
                r13 = 0;
                sVar9.q(false);
                sVar3 = sVar9;
            }
            sVar3.q(z12);
            if (num == null) {
                sVar3.a0(-390956122);
                sVar3.q(r13);
                qVar3 = qVar2;
            } else {
                sVar3.a0(-390956121);
                int iIntValue = num.intValue();
                if (basketResponse.getCanCheckout()) {
                    qVar3 = qVar2;
                    tVarN = qVar3;
                } else {
                    qVar3 = qVar2;
                    tVarN = m2.n(qVar3, AppConstants.RESULT_CODE_FLASH_SALES_SURVEY, 70);
                }
                g3.i2.a(x0.z(iIntValue, sVar3, r13), null, tVarN, i4.v.f23315h, sVar3, 3128, 0);
                sVar3.q(r13);
            }
            sVar3.q(z12);
            if (basketResponse.getCanCheckout() && Intrinsics.areEqual(basketResponse.getFreeDelivery(), Boolean.TRUE)) {
                sVar3.a0(82153647);
                sVar3.q(r13);
                basketResponse2 = basketResponse;
                sVar4 = sVar3;
            } else {
                r8.k.t(f11, 81518426, qVar3, sVar3, sVar3);
                b4.t tVarB = f4.g.b(m2.e(m2.d(qVar3, 1.0f), 5), l2.g.b(8));
                long j13 = !basketResponse.getCanCheckout() ? j9 : lv.s.f28217b;
                long j14 = lv.s.J;
                float f15 = -15;
                basketResponse2 = basketResponse;
                boolean zH = sVar3.h(basketResponse2);
                Object objM = sVar3.M();
                Object obj = m3.m.f29332a;
                if (zH || objM == obj) {
                    objM = new rv.a(basketResponse2, 16);
                    sVar3.k0(objM);
                }
                Function0 function04 = (Function0) objM;
                Object objM2 = sVar3.M();
                if (objM2 == obj) {
                    objM2 = new t1.w1(21);
                    sVar3.k0(objM2);
                }
                m3.s sVar10 = sVar3;
                m5.b(function04, tVarB, j13, j14, 0, f15, (Function1) objM2, sVar10, 1772544, 16);
                m3.s sVar11 = sVar10;
                sVar11.q(r13);
                sVar4 = sVar11;
            }
            sVar4.q(z12);
            sVar = sVar4;
        } else {
            basketResponse2 = basketResponse;
            sVar5.U();
            sVar = sVar5;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ug.i(str, basketResponse2, i11, 14);
        }
    }

    public static final void d(boolean z11, h1 h1Var, n1 n1Var, m3.n nVar, int i11) {
        int i12;
        h1 h1Var2;
        boolean z12;
        b4.k kVar = b4.d.f5687e;
        h1Var.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(66809496);
        if ((i11 & 6) == 0) {
            i12 = (sVar.g(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            h1Var2 = h1Var;
            i12 |= sVar.f(h1Var2) ? 32 : 16;
        } else {
            h1Var2 = h1Var;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.f(n1Var) ? 256 : 128;
        }
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            x60.j jVar = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            b4.q qVar = b4.q.f5711a;
            b4.t tVarM = m2.m(z11 ? n1Var : qVar, 28);
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarM, sVar);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            int iH = h1Var2.h();
            d2.u uVar = d2.u.f13938a;
            if (iH > 0 || (h1Var2.h() == 0 && z11)) {
                sVar.a0(1724288958);
                b4.t tVarA = uVar.a(qVar, kVar);
                z12 = true;
                r9.d(String.valueOf(h1Var2.h()), tVarA, hVar.Y, 0L, null, 0L, null, new x5.k(3), 0L, 0, false, 1, 0, null, jVar.f43961j, sVar, 0, 24576, 113656);
                sVar = sVar;
                sVar.q(false);
            } else {
                sVar.a0(1724621712);
                g3.i2.a(x0.z(R.drawable.ic_add, sVar, 0), null, uVar.a(m2.m(qVar, 20), kVar), hVar.E, sVar, 56, 0);
                sVar.q(false);
                z12 = true;
            }
            sVar.q(z12);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new m3(z11, h1Var2, n1Var, i11, 2);
        }
    }

    public static final void e(final ItemMnuV2 itemMnuV2, final int i11, final boolean z11, final ym.y yVar, final ym.z zVar, m3.n nVar, int i12) {
        m3.s sVar = (m3.s) nVar;
        sVar.c0(127490166);
        int i13 = i12 | (sVar.h(itemMnuV2) ? 4 : 2) | (sVar.d(i11) ? 32 : 16) | (sVar.g(z11) ? 256 : 128) | (sVar.f(yVar) ? NewHope.SENDB_BYTES : 1024) | (sVar.f(zVar) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192);
        if (sVar.R(i13 & 1, (i13 & 9363) != 9362)) {
            final float f11 = itemMnuV2.getItem().getDiscountLabel() != null ? 116 : 102;
            b4.t tVarJ = v1.n.j(d2.c.A(m2.d(b4.q.f5711a, 1.0f), lv.t.f28253g, lv.t.f28250d), lv.s.K, g0.f23254b);
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarJ, sVar);
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
            d3 d3Var = x1.f7416h;
            m3.i.b(new v1[]{b3.i.t(((z5.c) sVar.j(d3Var)).a(), 1.0f, d3Var), s5.f19473a.a(cg.j.t())}, u3.e.e(-1184274756, sVar, new Function2() { // from class: cn.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    m3.n nVar2 = (m3.n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    m3.s sVar2 = (m3.s) nVar2;
                    if (sVar2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        b4.t tVarD = m2.d(b4.q.f5711a, 1.0f);
                        g3.u uVarP = g3.s0.p(lv.s.J, sVar2, 6);
                        l2.f fVarB = l2.g.b(12);
                        ym.y yVar2 = yVar;
                        boolean zH = sVar2.h(yVar2);
                        final ItemMnuV2 itemMnuV22 = itemMnuV2;
                        boolean zH2 = zH | sVar2.h(itemMnuV22);
                        Object objM = sVar2.M();
                        if (zH2 || objM == m3.m.f29332a) {
                            objM = new bs.b(6, yVar2, itemMnuV22);
                            sVar2.k0(objM);
                        }
                        final float f12 = f11;
                        final int i14 = i11;
                        final boolean z12 = z11;
                        final ym.z zVar2 = zVar;
                        g3.s0.c((Function0) objM, tVarD, false, fVarB, uVarP, null, u3.e.e(583100273, sVar2, new i80.n() { // from class: cn.f
                            @Override // i80.n
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                m3.n nVar3 = (m3.n) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ((d2.z) obj3).getClass();
                                m3.s sVar3 = (m3.s) nVar3;
                                if (sVar3.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    float f13 = lv.t.f28249c;
                                    b4.q qVar = b4.q.f5711a;
                                    b4.t tVarD2 = d2.c.D(qVar, f13, f13, 0.0f, f13, 4);
                                    i2 i2VarA = d2.h2.a(d2.i.f13801a, b4.d.f5693k, sVar3, 48);
                                    int iHashCode2 = Long.hashCode(sVar3.T);
                                    u3.i iVarL2 = sVar3.l();
                                    b4.t tVarC2 = b4.a.c(tVarD2, sVar3);
                                    b5.j.R.getClass();
                                    b5.h hVar2 = b5.i.f5839b;
                                    sVar3.e0();
                                    if (sVar3.S) {
                                        sVar3.k(hVar2);
                                    } else {
                                        sVar3.n0();
                                    }
                                    m3.i.C(i2VarA, b5.i.f5843f, sVar3);
                                    m3.i.C(iVarL2, b5.i.f5842e, sVar3);
                                    m3.i.v(sVar3, Integer.valueOf(iHashCode2), b5.i.f5844g);
                                    m3.i.z(sVar3, b5.i.f5845h);
                                    m3.i.C(tVarC2, b5.i.f5841d, sVar3);
                                    ItemMnuV2 itemMnuV23 = itemMnuV22;
                                    BaseItemMnuV2 item = itemMnuV23.getItem();
                                    float f14 = f12;
                                    nx.d.d(item, f14, sVar3, 0);
                                    d2.c.f(m2.m(qVar, lv.t.f28251e), sVar3);
                                    jb.u.l(itemMnuV23.getItem(), f14, itemMnuV23.getItem().getCurrentQuantity(), i14, z12, zVar2, sVar3, 0);
                                    sVar3.q(true);
                                } else {
                                    sVar3.U();
                                }
                                return Unit.f26487a;
                            }
                        }), sVar2, 100663344, 228);
                    } else {
                        sVar2.U();
                    }
                    return Unit.f26487a;
                }
            }), sVar, 56);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.m(itemMnuV2, i11, z11, yVar, zVar, i12, 1);
        }
    }

    public static final void f(cn.b bVar, LatestInteractionOrigin latestInteractionOrigin, Function0 function0, Function2 function2, m3.n nVar, int i11) {
        int i12;
        Function2 function22;
        BasketManager basketManager;
        boolean z11;
        latestInteractionOrigin.getClass();
        function0.getClass();
        function2.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1277150702);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(bVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.d(latestInteractionOrigin.ordinal()) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(function0) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            function22 = function2;
            i12 |= sVar.h(function22) ? 2048 : 1024;
        } else {
            function22 = function2;
        }
        if (!sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            sVar.U();
        } else if (bVar.f8477e) {
            sVar.a0(1018832347);
            BasketManager basketManager2 = bVar.f8478f;
            if (basketManager2 == null) {
                sVar.a0(1519031686);
                sVar.q(false);
                z11 = false;
            } else {
                sVar.a0(1519031687);
                BaseItemMnuV2 baseItemMnuV2 = bVar.f8473a;
                int iMin = Math.min(baseItemMnuV2.getAvailableStock(), 20);
                int i13 = bVar.f8476d;
                boolean z12 = bVar.f8479g;
                boolean z13 = true;
                boolean z14 = bVar.f8475c;
                boolean zH = ((i12 & 112) == 32) | ((i12 & 896) == 256) | sVar.h(basketManager2) | sVar.h(bVar);
                if ((i12 & 7168) != 2048) {
                    z13 = false;
                }
                boolean z15 = zH | z13;
                Object objM = sVar.M();
                if (z15 || objM == m3.m.f29332a) {
                    a1 a1Var = new a1(function0, basketManager2, bVar, latestInteractionOrigin, function22, 1);
                    basketManager = basketManager2;
                    sVar.k0(a1Var);
                    objM = a1Var;
                } else {
                    basketManager = basketManager2;
                }
                z11 = false;
                h(baseItemMnuV2, iMin, i13, basketManager, z12, z14, (Function1) objM, sVar, 0);
                sVar.q(false);
            }
            sVar.q(z11);
        } else {
            sVar.a0(1520184112);
            sVar.q(false);
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new t0(bVar, latestInteractionOrigin, i11, function0, function2, 4);
        }
    }

    public static final void g(BaseItemMnuV2 baseItemMnuV2, boolean z11, int i11, BasketManager basketManager, int i12, Function1 function1, m3.n nVar, int i13) {
        int i14;
        h1 h1Var;
        Integer num;
        baseItemMnuV2.getClass();
        basketManager.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(62694578);
        if ((i13 & 6) == 0) {
            i14 = (sVar.h(baseItemMnuV2) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= sVar.g(z11) ? 32 : 16;
        }
        if ((i13 & MLKEMEngine.KyberPolyBytes) == 0) {
            i14 |= sVar.d(i11) ? 256 : 128;
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
        if (sVar.R(i15 & 1, (74899 & i15) != 74898)) {
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = w.a0.s(basketManager.getQuantity(baseItemMnuV2.m393getItemIdFvU5WIY()), sVar);
            }
            h1 h1Var2 = (h1) objM;
            Integer numValueOf = Integer.valueOf(basketManager.getQuantity(baseItemMnuV2.m393getItemIdFvU5WIY()));
            boolean zH = sVar.h(basketManager) | sVar.h(baseItemMnuV2);
            Object objM2 = sVar.M();
            if (zH || objM2 == fVar) {
                h1Var = h1Var2;
                num = numValueOf;
                e1 e1Var = new e1(h1Var, basketManager, baseItemMnuV2, null, 1);
                sVar.k0(e1Var);
                objM2 = e1Var;
            } else {
                h1Var = h1Var2;
                num = numValueOf;
            }
            m3.i.h(num, (Function2) objM2, sVar);
            b4.q qVar = b4.q.f5711a;
            b4.t tVarD = z11 ? m2.d(qVar, 1.0f) : qVar;
            i2 i2VarA = d2.h2.a(d2.i.f13801a, b4.d.f5693k, sVar, 48);
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
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            if (z11) {
                sVar.a0(-538236934);
                u(h1Var, function1, sVar, ((i15 >> 12) & 112) | 6);
                b3.i.y(qVar, ((x60.k) sVar.j(PantryThemeKt.getLocalPantryRadius())).f43981e, sVar, false);
            } else {
                sVar.a0(-538096628);
                sVar.q(false);
            }
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            int i16 = i15 >> 3;
            d(z11, h1Var, new n1(1.0f, true), sVar, (i16 & 14) | 48);
            if (z11) {
                sVar.a0(-537994204);
                a(i12, basketManager, h1Var, i11, function1, sVar, (i16 & 57344) | ((i15 >> 12) & 14) | MLKEMEngine.KyberPolyBytes | ((i15 >> 6) & 112) | ((i15 << 3) & 7168));
                sVar.q(false);
            } else {
                sVar.a0(-537894260);
                sVar.q(false);
            }
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bg.c(baseItemMnuV2, z11, i11, basketManager, i12, function1, i13);
        }
    }

    public static final void h(BaseItemMnuV2 baseItemMnuV2, int i11, int i12, BasketManager basketManager, boolean z11, boolean z12, Function1 function1, m3.n nVar, int i13) {
        baseItemMnuV2.getClass();
        basketManager.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(340924936);
        int i14 = i13 | (sVar.h(baseItemMnuV2) ? 4 : 2) | (sVar.d(i11) ? 32 : 16) | (sVar.d(i12) ? 256 : 128) | (sVar.h(basketManager) ? NewHope.SENDB_BYTES : 1024) | (sVar.g(z11) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar.g(z12) ? 131072 : 65536) | (sVar.h(function1) ? 1048576 : 524288);
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
            b4.t tVarJ = v1.n.j(f4.g.b(b4.a.a(s1.b0.a(qVar, t1.c.k(300, 0, t1.w.f39594b, 2), 2), c5.m2.f7291a, new cn.i(z12, basketManager, baseItemMnuV2, function1)), z11 ? l2.g.f26790a : l2.g.b(8)), lv.s.I, g0.f23254b);
            u0 u0VarD2 = d2.p.d(kVar, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            b4.t tVarC2 = b4.a.c(tVarJ, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD2, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            w.a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            boolean z13 = (i14 & 3670016) == 1048576;
            Object objM = sVar.M();
            if (z13 || objM == m3.m.f29332a) {
                objM = new defpackage.d(function1, 4);
                sVar.k0(objM);
            }
            g(baseItemMnuV2, z12, i11, basketManager, i12, (Function1) objM, sVar, (i14 & 14) | ((i14 >> 12) & 112) | ((i14 << 3) & 896) | (i14 & 7168) | ((i14 << 6) & 57344));
            sVar.q(true);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cn.e(baseItemMnuV2, i11, i12, basketManager, z11, z12, function1, i13);
        }
    }

    public static final void i(b4.t tVar, BaseItemMnuV2 baseItemMnuV2, int i11, boolean z11, LatestInteractionOrigin latestInteractionOrigin, Function1 function1, ym.z zVar, m3.n nVar, int i12) {
        b4.t tVar2;
        baseItemMnuV2.getClass();
        latestInteractionOrigin.getClass();
        function1.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-2045658814);
        int i13 = (sVar.h(baseItemMnuV2) ? 32 : 16) | i12 | (sVar.d(i11) ? 256 : 128);
        if ((i12 & 3072) == 0) {
            i13 |= sVar.g(z11) ? NewHope.SENDB_BYTES : 1024;
        }
        int i14 = i13 | (sVar.h(function1) ? 131072 : 65536) | (sVar.f(zVar) ? 1048576 : 524288);
        if (sVar.R(i14 & 1, (599187 & i14) != 599186)) {
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            x60.k kVar = (x60.k) sVar.j(PantryThemeKt.getLocalPantryRadius());
            tVar2 = tVar;
            b4.t tVarZ = d2.c.z(tVar2, mVar.l);
            u0 u0VarD = d2.p.d(b4.d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarZ, sVar);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            d3 d3Var = x1.f7416h;
            m3.i.b(new v1[]{b3.i.t(((z5.c) sVar.j(d3Var)).a(), 1.0f, d3Var), s5.f19473a.a(cg.j.t())}, u3.e.e(1645252232, sVar, new bn.f(hVar, kVar, function1, baseItemMnuV2, mVar, i11, z11, latestInteractionOrigin, zVar)), sVar, 56);
            sVar.q(true);
        } else {
            tVar2 = tVar;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.h(tVar2, baseItemMnuV2, i11, z11, latestInteractionOrigin, function1, zVar, i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v28, types: [java.util.List] */
    public static final void j(BaseItemMnuV2 baseItemMnuV2, m3.n nVar, int i11) {
        CateringProperties cateringProperties;
        Picture storeLogo;
        ?? arrayList;
        b4.k kVar = b4.d.f5683a;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(871520342);
        int i12 = (sVar.h(baseItemMnuV2) ? 4 : 2) | i11;
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            x60.k kVar2 = (x60.k) sVar.j(PantryThemeKt.getLocalPantryRadius());
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
            m3.i.C(u0VarD, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            b4.t tVarA = f4.g.a(f4.g.b(m2.d(m2.e(qVar, 110), 1.0f), l2.g.b(kVar2.f43977a)), o30.e0.A(baseItemMnuV2) ? 1.0f : 0.4f);
            Picture coverPicture = baseItemMnuV2.getCoverPicture();
            String currentUrl = null;
            String currentUrl2 = coverPicture != null ? coverPicture.getCurrentUrl() : null;
            c1 c1Var = z4.l.f47166a;
            gd.o.a(currentUrl2, null, tVarA, c1Var, sVar, 1572912, 0, 1976);
            List<ItemTagInfo> tags = baseItemMnuV2.getTags();
            d2.u uVar = d2.u.f13938a;
            if (tags == null || tags.isEmpty()) {
                sVar.a0(-659819118);
                sVar.q(false);
            } else {
                sVar.a0(-660307306);
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
                            b4.t tVarD = b4.a.d(uVar.a(qVar, kVar), 1.0f);
                            float f11 = mVar.f44016m;
                            bg.m.d(d2.c.v(tVarD, f11, f11), arrayList, null, sVar, 0, 4);
                            sVar = sVar;
                            sVar.q(false);
                        }
                    }
                    arrayList = baseItemMnuV2.getTags();
                    b4.t tVarD2 = b4.a.d(uVar.a(qVar, kVar), 1.0f);
                    float f112 = mVar.f44016m;
                    bg.m.d(d2.c.v(tVarD2, f112, f112), arrayList, null, sVar, 0, 4);
                    sVar = sVar;
                    sVar.q(false);
                } else {
                    arrayList = baseItemMnuV2.getTags();
                    b4.t tVarD22 = b4.a.d(uVar.a(qVar, kVar), 1.0f);
                    float f1122 = mVar.f44016m;
                    bg.m.d(d2.c.v(tVarD22, f1122, f1122), arrayList, null, sVar, 0, 4);
                    sVar = sVar;
                    sVar.q(false);
                }
            }
            if (bn.o.$EnumSwitchMapping$0[baseItemMnuV2.getItemType().ordinal()] == 1 && (cateringProperties = baseItemMnuV2.getCateringProperties()) != null && (storeLogo = cateringProperties.getStoreLogo()) != null) {
                currentUrl = storeLogo.getCurrentUrl();
            }
            String str = currentUrl;
            if (str == null) {
                sVar.a0(-659624222);
                sVar.q(false);
            } else {
                sVar.a0(-659624221);
                b4.t tVarA2 = uVar.a(d2.c.v(m2.m(qVar, 32), 0, mVar.f44016m), b4.d.f5691i);
                l2.f fVar = l2.g.f26790a;
                gd.o.a(str, null, f4.g.a(v1.n.k(f4.g.b(tVarA2, fVar), 1, lv.s.I, fVar), o30.e0.A(baseItemMnuV2) ? 1.0f : 0.4f), c1Var, sVar, 1572912, 0, 1976);
                sVar.q(false);
            }
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.g(baseItemMnuV2, i11, 2);
        }
    }

    public static final void k(BaseItemMnuV2 baseItemMnuV2, m3.n nVar, int i11) {
        int i12;
        Brand brand;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-2046006905);
        int i13 = i11 | (sVar.h(baseItemMnuV2) ? 4 : 2);
        if (sVar.R(i13 & 1, (i13 & 3) != 2)) {
            x60.h hVar = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            x60.j jVar = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            float f11 = mVar.f44016m;
            b4.q qVar = b4.q.f5711a;
            b4.t tVarB = d2.c.B(qVar, f11, 0.0f, 2);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarB, sVar);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            d2.c.f(m2.e(qVar, mVar.l), sVar);
            sVar.a0(2052897251);
            ManufacturerItemProperties manufacturerItemProperties = baseItemMnuV2.getManufacturerItemProperties();
            String brandName = (manufacturerItemProperties == null || (brand = manufacturerItemProperties.getBrand()) == null) ? null : brand.getBrandName();
            b4.t tVarA = f4.g.a(qVar, o30.e0.A(baseItemMnuV2) ? 1.0f : 0.4f);
            String strG = "";
            if (brandName == null) {
                brandName = "";
            }
            r9.d(brandName, tVarA, hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43960i, sVar, 0, 0, 131064);
            sVar.q(false);
            b4.t tVarA2 = f4.g.a(qVar, o30.e0.A(baseItemMnuV2) ? 1.0f : 0.4f);
            String itemName = baseItemMnuV2.getItemName();
            if (itemName == null) {
                itemName = "";
            }
            r9.d(itemName, tVarA2, hVar.J, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, jVar.f43959h, sVar, 0, 24960, 110584);
            b4.t tVarA3 = f4.g.a(qVar, o30.e0.A(baseItemMnuV2) ? 1.0f : 0.4f);
            if (baseItemMnuV2.getItemCount() != null) {
                sVar.a0(-783988911);
                strG = f0.G(R.plurals.mnu_item_count, baseItemMnuV2.getItemCount().intValue(), new Object[]{String.valueOf(baseItemMnuV2.getItemCount().intValue())}, sVar);
                sVar.q(false);
            } else {
                sVar.a0(-783778173);
                sVar.q(false);
            }
            r9.d(strG, tVarA3, hVar.K, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43960i, sVar, 0, 0, 131064);
            sVar = sVar;
            i12 = 1;
            sVar.q(true);
        } else {
            i12 = 1;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.g(baseItemMnuV2, i11, i12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v12 */
    public static final void l(BaseItemMnuV2 baseItemMnuV2, final float f11, final int i11, final int i12, final boolean z11, final ym.z zVar, m3.n nVar, final int i13) {
        BaseItemMnuV2 baseItemMnuV22;
        m3.s sVar;
        b1 b1VarN;
        BasketManager basketManager;
        i1 i1Var;
        ?? r13;
        m3.f fVar;
        h1 h1Var;
        b1 b1Var;
        boolean z12;
        m3.f fVar2;
        boolean z13;
        Object nVar2;
        boolean z14;
        Integer num;
        BaseItemMnuV2 baseItemMnuV23 = baseItemMnuV2;
        baseItemMnuV23.getClass();
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(1194555774);
        int i14 = i13 | (sVar2.h(baseItemMnuV23) ? 4 : 2) | (sVar2.c(f11) ? 32 : 16) | (sVar2.d(i11) ? 256 : 128) | (sVar2.d(i12) ? NewHope.SENDB_BYTES : 1024) | (sVar2.g(z11) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192) | (sVar2.f(zVar) ? 131072 : 65536);
        if (sVar2.R(i14 & 1, (i14 & 74899) != 74898)) {
            BasketManager basketManagerG = zVar != null ? zVar.g() : null;
            Object objM = sVar2.M();
            m3.f fVar3 = m3.m.f29332a;
            if (objM == fVar3) {
                objM = w.a0.s(i11, sVar2);
            }
            h1 h1Var2 = (h1) objM;
            Object objM2 = sVar2.M();
            if (objM2 == fVar3) {
                objM2 = m3.i.w(Boolean.FALSE);
                sVar2.k0(objM2);
            }
            b1 b1Var2 = (b1) objM2;
            Object objM3 = sVar2.M();
            if (objM3 == fVar3) {
                objM3 = new i1(1000L);
                sVar2.k0(objM3);
            }
            i1 i1Var2 = (i1) objM3;
            a2 a2VarD = zVar != null ? zVar.d() : null;
            if (a2VarD == null) {
                sVar2.a0(-1087435085);
                sVar2.q(false);
                b1VarN = null;
            } else {
                sVar2.a0(1211847438);
                b1VarN = m3.i.n(a2VarD, sVar2, 0);
                sVar2.q(false);
            }
            Map map = b1VarN != null ? (Map) b1VarN.getValue() : null;
            int currentQuantity = (map == null || (num = (Integer) map.get(ItemId.m197boximpl(baseItemMnuV23.m393getItemIdFvU5WIY()))) == null) ? baseItemMnuV23.getCurrentQuantity() : num.intValue();
            if (((Boolean) b1Var2.getValue()).booleanValue()) {
                sVar2.a0(-1087294623);
                if (basketManagerG == null || h1Var2.h() != basketManagerG.getQuantity(baseItemMnuV23.m393getItemIdFvU5WIY())) {
                    sVar2.a0(-1087222393);
                    BasketManager basketManager2 = basketManagerG;
                    fVar2 = fVar3;
                    z13 = false;
                    s(basketManager2, baseItemMnuV23.m393getItemIdFvU5WIY(), h1Var2.h(), ((Boolean) b1Var2.getValue()).booleanValue(), sVar2, 0);
                    basketManager = basketManager2;
                    i1Var2.i(i1Var2.h() + 1);
                    sVar2.q(false);
                } else {
                    sVar2.a0(-1087010012);
                    sVar2.q(false);
                    basketManager = basketManagerG;
                    z13 = false;
                    fVar2 = fVar3;
                }
                Long lValueOf = Long.valueOf(i1Var2.h());
                boolean zH = ((i14 & 458752) != 131072 ? z13 : true) | sVar2.h(baseItemMnuV23);
                Object objM4 = sVar2.M();
                if (zH || objM4 == fVar2) {
                    fVar = fVar2;
                    z14 = z13;
                    z12 = true;
                    nVar2 = new bn.n(b1Var2, zVar, baseItemMnuV23, h1Var2, i1Var2, null, 1);
                    b1Var = b1Var2;
                    baseItemMnuV23 = baseItemMnuV23;
                    h1Var = h1Var2;
                    i1Var = i1Var2;
                    sVar2.k0(nVar2);
                } else {
                    z14 = z13;
                    fVar = fVar2;
                    i1Var = i1Var2;
                    nVar2 = objM4;
                    h1Var = h1Var2;
                    b1Var = b1Var2;
                    z12 = true;
                }
                m3.i.h(lValueOf, (Function2) nVar2, sVar2);
                sVar2.q(z14);
                r13 = z14;
            } else {
                basketManager = basketManagerG;
                i1Var = i1Var2;
                r13 = 0;
                fVar = fVar3;
                h1Var = h1Var2;
                b1Var = b1Var2;
                z12 = true;
                sVar2.a0(-1086799708);
                sVar2.q(false);
            }
            b4.q qVar = b4.q.f5711a;
            b4.t tVarE = m2.e(qVar, f11);
            d2.y yVarA = d2.w.a(d2.i.f13803c, b4.d.f5694m, sVar2, r13);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            b4.t tVarC = b4.a.c(tVarE, sVar2);
            b5.j.R.getClass();
            b5.h hVar = b5.i.f5839b;
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(yVarA, gVar, sVar2);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar2, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar2, dVar);
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar2);
            boolean z15 = z12;
            i2 i2VarA = d2.h2.a(d2.i.f13801a, b4.d.f5693k, sVar2, 48);
            int iHashCode2 = Long.hashCode(sVar2.T);
            u3.i iVarL2 = sVar2.l();
            b4.t tVarC2 = b4.a.c(qVar, sVar2);
            sVar2.e0();
            if (sVar2.S) {
                sVar2.k(hVar);
            } else {
                sVar2.n0();
            }
            m3.i.C(i2VarA, gVar, sVar2);
            m3.i.C(iVarL2, gVar2, sVar2);
            w.a0.y(iHashCode2, sVar2, gVar3, sVar2, dVar);
            m3.i.C(tVarC2, gVar4, sVar2);
            boolean z16 = !((Boolean) b1Var.getValue()).booleanValue();
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            m3.f fVar4 = fVar;
            s1.y.e(z16, new n1(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, z15), null, null, null, u3.e.e(-394753104, sVar2, new bn.j(baseItemMnuV23, 1)), sVar2, 1572870, 28);
            m3.s sVar3 = sVar2;
            cn.b bVar = new cn.b(baseItemMnuV23, currentQuantity, ((Boolean) b1Var.getValue()).booleanValue(), i12, z11, basketManager, false);
            LatestInteractionOrigin latestInteractionOrigin = LatestInteractionOrigin.SCREEN_DELIVERY;
            int i15 = i14 & 458752;
            boolean z17 = i15 != 131072 ? false : z15;
            Object objM5 = sVar3.M();
            if (z17 || objM5 == fVar4) {
                objM5 = new bn.k(zVar, 1);
                sVar3.k0(objM5);
            }
            Function0 function0 = (Function0) objM5;
            boolean zH2 = (i15 == 131072 ? z15 : false) | sVar3.h(baseItemMnuV23);
            Object objM6 = sVar3.M();
            if (zH2 || objM6 == fVar4) {
                BaseItemMnuV2 baseItemMnuV24 = baseItemMnuV23;
                bn.l lVar = new bn.l(b1Var, h1Var, zVar, baseItemMnuV24, i1Var, 1);
                baseItemMnuV22 = baseItemMnuV24;
                sVar3.k0(lVar);
                objM6 = lVar;
            } else {
                baseItemMnuV22 = baseItemMnuV23;
            }
            f(bVar, latestInteractionOrigin, function0, (Function2) objM6, sVar3, 48);
            sVar3.q(z15);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            nx.d.g(baseItemMnuV22, new n1(1.0f, z15), sVar3, i14 & 14);
            sVar3.q(z15);
            sVar = sVar3;
        } else {
            baseItemMnuV22 = baseItemMnuV23;
            sVar2.U();
            sVar = sVar2;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            final BaseItemMnuV2 baseItemMnuV25 = baseItemMnuV22;
            w1VarS.f29476d = new Function2(f11, i11, i12, z11, zVar, i13) { // from class: cn.g

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ float f8520b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f8521c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f8522d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f8523e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ ym.z f8524f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iF = m3.i.F(1);
                    jb.u.l(this.f8519a, this.f8520b, this.f8521c, this.f8522d, this.f8523e, this.f8524f, (m3.n) obj, iF);
                    return Unit.f26487a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r0v5, types: [m3.n, m3.s] */
    /* JADX WARN: Type inference failed for: r0v7, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r0v8, types: [m3.s] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r19v1, types: [m3.n] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r26v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(b4.t r27, java.lang.String r28, java.lang.String r29, boolean r30, m3.n r31, int r32, int r33) {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.u.m(b4.t, java.lang.String, java.lang.String, boolean, m3.n, int, int):void");
    }

    public static final void n(ry.a aVar, androidx.lifecycle.w wVar, m3.n nVar, int i11) {
        aVar.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-1770945943);
        int i12 = (sVar.f(aVar) ? 4 : 2) | i11 | 48;
        if ((i12 & 19) == 18 && sVar.B()) {
            sVar.U();
        } else {
            wVar = androidx.lifecycle.w.ON_RESUME;
            sVar.a0(-2101357749);
            boolean z11 = (i12 & 14) == 4;
            Object objM = sVar.M();
            m3.f fVar = m3.m.f29332a;
            if (z11 || objM == fVar) {
                objM = new androidx.activity.e(3, wVar, aVar);
                sVar.k0(objM);
            }
            androidx.lifecycle.c0 c0Var = (androidx.lifecycle.c0) objM;
            sVar.q(false);
            Lifecycle lifecycle = ((LifecycleOwner) sVar.j(w8.g.f43289a)).getLifecycle();
            sVar.a0(-2101338711);
            boolean zH = sVar.h(lifecycle) | sVar.h(c0Var);
            Object objM2 = sVar.M();
            if (zH || objM2 == fVar) {
                objM2 = new ry.b(1, lifecycle, c0Var);
                sVar.k0(objM2);
            }
            sVar.q(false);
            m3.i.c(lifecycle, c0Var, (Function1) objM2, sVar);
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new rk.a0(aVar, wVar, i11, 3);
        }
    }

    public static h.h o(i.f fVar) {
        int iE = a70.a.e();
        a70.a.e();
        h.h hVar = new h.h();
        hVar.f20953a = i.c.f22567a;
        a70.a.e();
        hVar.f20953a = fVar;
        hVar.f20954b = iE;
        return hVar;
    }

    public static final void p(BaseItemMnuV2 baseItemMnuV2, m3.n nVar, int i11) {
        float f11;
        x60.h hVar;
        x60.j jVar;
        float f12;
        boolean z11;
        b4.q qVar;
        b4.q qVar2;
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-970865604);
        int i12 = i11 | (sVar.h(baseItemMnuV2) ? 4 : 2);
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            x60.h hVar2 = (x60.h) sVar.j(PantryThemeKt.getLocalPantryColor());
            x60.m mVar = (x60.m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            x60.j jVar2 = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            b4.q qVar3 = b4.q.f5711a;
            b4.t tVarD = m2.d(qVar3, 1.0f);
            i2 i2VarA = d2.h2.a(d2.i.f13802b, b4.d.f5693k, sVar, 54);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            b4.t tVarC = b4.a.c(tVarD, sVar);
            b5.j.R.getClass();
            b5.h hVar3 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar3);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            n1 n1Var = new n1(1.0f, true);
            float f13 = mVar.l;
            d2.c.f(m2.q(n1Var, f13), sVar);
            Price itemValue = baseItemMnuV2.getItemValue();
            String strI = itemValue != null ? mv.d.i(itemValue, 1) : null;
            if (strI == null) {
                sVar.a0(-1013606535);
                sVar.q(false);
                hVar = hVar2;
                f12 = f13;
                jVar = jVar2;
                z11 = false;
                qVar = qVar3;
                f11 = 1.0f;
            } else {
                sVar.a0(-1013606534);
                f11 = 1.0f;
                hVar = hVar2;
                jVar = jVar2;
                f12 = f13;
                z11 = false;
                qVar = qVar3;
                r9.d(strI, f4.g.a(qVar3, o30.e0.A(baseItemMnuV2) ? 1.0f : 0.4f), hVar2.M, 0L, null, 0L, x5.l.f43855d, null, 0L, 0, false, 0, 0, null, jVar2.f43967q, sVar, 805306368, 0, 130552);
                sVar = sVar;
                sVar.q(false);
            }
            Price itemPrice = baseItemMnuV2.getItemPrice();
            String strI2 = itemPrice != null ? mv.d.i(itemPrice, 1) : null;
            if (strI2 == null) {
                sVar.a0(-1013218601);
                sVar.q(z11);
                qVar2 = qVar;
            } else {
                sVar.a0(-1013218600);
                b4.q qVar4 = qVar;
                d2.c.f(m2.q(qVar4, f12), sVar);
                m3.s sVar2 = sVar;
                r9.d(strI2, f4.g.a(qVar4, o30.e0.A(baseItemMnuV2) ? f11 : 0.4f), o30.e0.A(baseItemMnuV2) ? hVar.J : hVar.K, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43961j, sVar2, 0, 0, 131064);
                sVar = sVar2;
                sVar.q(z11);
                qVar2 = qVar4;
            }
            d2.c.f(m2.q(qVar2, f12), sVar);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.g(baseItemMnuV2, i11, 0);
        }
    }

    public static final void q(BaseItemMnuV2 baseItemMnuV2, int i11, boolean z11, LatestInteractionOrigin latestInteractionOrigin, ym.z zVar, m3.n nVar, int i12) {
        m3.s sVar;
        b1 b1VarN;
        int i13;
        b1 b1Var;
        h1 h1Var;
        BaseItemMnuV2 baseItemMnuV22;
        i1 i1Var;
        Integer num;
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(-1924828577);
        int i14 = i12 | (sVar2.h(baseItemMnuV2) ? 4 : 2) | (sVar2.d(i11) ? 32 : 16) | (sVar2.g(z11) ? 256 : 128) | (sVar2.d(latestInteractionOrigin.ordinal()) ? NewHope.SENDB_BYTES : 1024) | (sVar2.f(zVar) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192);
        if (sVar2.R(i14 & 1, (i14 & 9363) != 9362)) {
            BasketManager basketManagerG = zVar != null ? zVar.g() : null;
            Object objM = sVar2.M();
            m3.f fVar = m3.m.f29332a;
            if (objM == fVar) {
                objM = w.a0.s(basketManagerG != null ? basketManagerG.getQuantity(baseItemMnuV2.m393getItemIdFvU5WIY()) : 0, sVar2);
            }
            h1 h1Var2 = (h1) objM;
            Object objM2 = sVar2.M();
            if (objM2 == fVar) {
                objM2 = m3.i.w(Boolean.FALSE);
                sVar2.k0(objM2);
            }
            b1 b1Var2 = (b1) objM2;
            Object objM3 = sVar2.M();
            if (objM3 == fVar) {
                objM3 = new i1(1000L);
                sVar2.k0(objM3);
            }
            i1 i1Var2 = (i1) objM3;
            a2 a2VarD = zVar != null ? zVar.d() : null;
            if (a2VarD == null) {
                sVar2.a0(-459198606);
                sVar2.q(false);
                b1VarN = null;
            } else {
                sVar2.a0(1370660463);
                b1VarN = m3.i.n(a2VarD, sVar2, 0);
                sVar2.q(false);
            }
            Map map = b1VarN != null ? (Map) b1VarN.getValue() : null;
            int currentQuantity = (map == null || (num = (Integer) map.get(ItemId.m197boximpl(baseItemMnuV2.m393getItemIdFvU5WIY()))) == null) ? baseItemMnuV2.getCurrentQuantity() : num.intValue();
            b4.t tVarD = m2.d(b4.q.f5711a, 1.0f);
            i2 i2VarA = d2.h2.a(d2.i.f13801a, b4.d.f5693k, sVar2, 48);
            int iHashCode = Long.hashCode(sVar2.T);
            u3.i iVarL = sVar2.l();
            b4.t tVarC = b4.a.c(tVarD, sVar2);
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
            boolean z12 = !((Boolean) b1Var2.getValue()).booleanValue();
            if (1.0f <= 0.0d) {
                e2.a.a("invalid weight; must be greater than zero");
            }
            sVar = sVar2;
            s1.y.e(z12, new n1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), null, null, null, u3.e.e(1503974299, sVar2, new bn.j(baseItemMnuV2, 0)), sVar, 1572870, 28);
            BasketManager basketManager = basketManagerG;
            boolean z13 = true;
            cn.b bVar = new cn.b(baseItemMnuV2, currentQuantity, ((Boolean) b1Var2.getValue()).booleanValue(), i11, z11, basketManager, true);
            int i15 = 57344 & i14;
            boolean z14 = i15 == 16384;
            Object objM4 = sVar.M();
            if (z14 || objM4 == fVar) {
                objM4 = new bn.k(zVar, 0);
                sVar.k0(objM4);
            }
            Function0 function0 = (Function0) objM4;
            boolean zH = (i15 == 16384) | sVar.h(baseItemMnuV2);
            Object objM5 = sVar.M();
            if (zH || objM5 == fVar) {
                i13 = i15;
                bn.l lVar = new bn.l(b1Var2, h1Var2, zVar, baseItemMnuV2, i1Var2, 0);
                b1Var = b1Var2;
                h1Var = h1Var2;
                baseItemMnuV22 = baseItemMnuV2;
                i1Var = i1Var2;
                sVar.k0(lVar);
                objM5 = lVar;
            } else {
                i13 = i15;
                baseItemMnuV22 = baseItemMnuV2;
                h1Var = h1Var2;
                b1Var = b1Var2;
                i1Var = i1Var2;
            }
            f(bVar, latestInteractionOrigin, function0, (Function2) objM5, sVar, (i14 >> 6) & 112);
            sVar.q(true);
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar.a0(-457876300);
                if (basketManager == null || h1Var.h() != basketManager.getQuantity(baseItemMnuV22.m393getItemIdFvU5WIY())) {
                    sVar.a0(-457805744);
                    s(basketManager, baseItemMnuV22.m393getItemIdFvU5WIY(), h1Var.h(), true, sVar, 3072);
                    sVar.q(false);
                } else {
                    sVar.a0(-457633725);
                    sVar.q(false);
                }
                Long lValueOf = Long.valueOf(i1Var.h());
                if (i13 != 16384) {
                    z13 = false;
                }
                boolean zH2 = sVar.h(baseItemMnuV22) | z13;
                Object objM6 = sVar.M();
                if (zH2 || objM6 == fVar) {
                    bn.n nVar2 = new bn.n(b1Var, zVar, baseItemMnuV2, h1Var, i1Var, null, 0);
                    sVar.k0(nVar2);
                    objM6 = nVar2;
                }
                m3.i.h(lValueOf, (Function2) objM6, sVar);
                sVar.q(false);
            } else {
                sVar.a0(-457369853);
                sVar.q(false);
            }
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.m(baseItemMnuV2, i11, z11, latestInteractionOrigin, zVar, i12, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:165:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x064c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x06a9  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0716  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x074f  */
    /* JADX WARN: Type inference failed for: r7v51, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v67 */
    /* JADX WARN: Type inference failed for: r7v79 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void r(yo.d r84, qo.h r85, m3.n r86, int r87) {
        /*
            Method dump skipped, instruction units count: 1927
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.u.r(yo.d, qo.h, m3.n, int):void");
    }

    public static final void s(BasketManager basketManager, String str, int i11, boolean z11, m3.n nVar, int i12) {
        str.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(-435141115);
        int i13 = (sVar.h(basketManager) ? 4 : 2) | i12 | (sVar.f(str) ? 32 : 16) | (sVar.d(i11) ? 256 : 128);
        if ((i12 & 3072) == 0) {
            i13 |= sVar.g(z11) ? NewHope.SENDB_BYTES : 1024;
        }
        if (!sVar.R(i13 & 1, (i13 & 1171) != 1170)) {
            sVar.U();
        } else if (z11 && ((basketManager == null || i11 != basketManager.getQuantity(str)) && basketManager != null)) {
            basketManager.setQuantity(str, i11, i11 > basketManager.getQuantity(str) ? LatestBasketInteraction.ADD : LatestBasketInteraction.REMOVE, LatestInteractionOrigin.SCREEN_DELIVERY);
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cn.d(basketManager, str, i11, z11, i12);
        }
    }

    public static final void t(int i11, long j9, b4.t tVar, String str, m3.n nVar) {
        String str2;
        long j11;
        m3.s sVar;
        b4.t tVar2;
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(996963641);
        int i12 = i11 | 6;
        if ((i11 & 48) == 0) {
            str2 = str;
            i12 |= sVar2.f(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            j11 = j9;
            i12 |= sVar2.e(j11) ? 256 : 128;
        } else {
            j11 = j9;
        }
        if (sVar2.R(i12 & 1, (i12 & 147) != 146)) {
            boolean zV = r0.v(str2);
            b4.q qVar = b4.q.f5711a;
            if (zV) {
                sVar = sVar2;
                tVar2 = qVar;
                sVar.a0(845383913);
                sVar.q(false);
            } else {
                sVar2.a0(845131945);
                tVar2 = qVar;
                r9.d(str2, d2.c.D(qVar, 0.0f, 0.0f, lv.t.f28251e, 0.0f, 11), j11, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, lv.v.l, sVar2, ((i12 >> 3) & 14) | (i12 & 896), 12607872, 110584);
                sVar = sVar2;
                sVar.q(false);
            }
        } else {
            sVar = sVar2;
            sVar.U();
            tVar2 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new cn.k(tVar2, str, j9, i11, 2);
        }
    }

    public static final void u(h1 h1Var, Function1 function1, m3.n nVar, int i11) {
        int i12;
        h1Var.getClass();
        m3.s sVar = (m3.s) nVar;
        sVar.c0(430898944);
        int i13 = 2;
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(h1Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function1) ? 32 : 16;
        }
        if (sVar.R(i12 & 1, (i12 & 19) != 18)) {
            b4.q qVar = b4.q.f5711a;
            b4.t tVarM = m2.m(qVar, 28);
            boolean z11 = h1Var.h() > 0;
            boolean z12 = ((i12 & 112) == 32) | ((i12 & 14) == 4);
            Object objM = sVar.M();
            int i14 = 5;
            if (z12 || objM == m3.m.f29332a) {
                objM = new bs.b(i14, h1Var, function1);
                sVar.k0(objM);
            }
            b4.t tVarC = androidx.compose.foundation.b.c(tVarM, z11, null, null, (Function0) objM, 14);
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
            v1.n.d(x0.z(R.drawable.quantity_remove, sVar, 0), f0.U(sVar, R.string.voice_over_quantity_selector_minus), d2.u.f13938a.a(m2.m(qVar, 20), b4.d.f5687e), null, null, 0.0f, new i4.o(((x60.h) sVar.j(PantryThemeKt.getLocalPantryColor())).J, 5), sVar, 8, 56);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new bn.x(h1Var, function1, i11, i13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object v(w4.k0 r7, z70.a r8) {
        /*
            boolean r0 = r8 instanceof q2.a
            if (r0 == 0) goto L13
            r0 = r8
            q2.a r0 = (q2.a) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            q2.a r0 = new q2.a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f35905k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.l
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            w4.k0 r7 = r0.f35904j
            ba0.g.M(r8)
            goto L40
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L30:
            ba0.g.M(r8)
        L33:
            r0.f35904j = r7
            r0.l = r3
            w4.o r8 = w4.o.Main
            java.lang.Object r8 = r7.b(r8, r0)
            if (r8 != r1) goto L40
            return r1
        L40:
            w4.n r8 = (w4.n) r8
            int r2 = r8.f43168d
            java.util.List r8 = r8.f43165a
            r2 = r2 & 66
            if (r2 == 0) goto L33
            int r2 = r8.size()
            r4 = 0
            r5 = r4
        L50:
            if (r5 >= r2) goto L62
            java.lang.Object r6 = r8.get(r5)
            w4.v r6 = (w4.v) r6
            boolean r6 = w4.u.a(r6)
            if (r6 != 0) goto L5f
            goto L33
        L5f:
            int r5 = r5 + 1
            goto L50
        L62:
            java.lang.Object r7 = r8.get(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.u.v(w4.k0, z70.a):java.lang.Object");
    }

    public static e6.l w(v80.j0 j0Var) {
        e6.i iVar = new e6.i();
        iVar.f15778c = new e6.n();
        e6.l lVar = new e6.l(iVar);
        iVar.f15777b = lVar;
        iVar.f15776a = w.a0.class;
        try {
            j0Var.J(new b4.x(15, iVar, j0Var));
            iVar.f15776a = "Deferred.asListenableFuture";
            return lVar;
        } catch (Exception e5) {
            lVar.b(e5);
            return lVar;
        }
    }

    public static final Bundle x(Pair... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair pair : pairArr) {
            String str = (String) pair.f26485a;
            Object obj = pair.f26486b;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        c50.w.m("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, 34);
                        return null;
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    c50.w.m("Illegal value type ", obj.getClass().getCanonicalName(), " for key \"", str, 34);
                    return null;
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static final Set y(JSONObject jSONObject) throws JSONException {
        jSONObject.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        itKeys.getClass();
        while (itKeys.hasNext()) {
            JSONArray jSONArray = jSONObject.getJSONArray(itKeys.next());
            jSONArray.getClass();
            for (int i11 : S(jSONArray)) {
                arrayList.add(Integer.valueOf(i11));
            }
        }
        return CollectionsKt.v0(arrayList);
    }

    public static q90.t z(q90.t tVar, q90.t tVar2) {
        ax.g0 g0Var = new ax.g0(3);
        int size = tVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            String strD = tVar.d(i11);
            String strG = tVar.g(i11);
            if ((!"Warning".equalsIgnoreCase(strD) || !kotlin.text.y.p(strG, "1", false)) && ("Content-Length".equalsIgnoreCase(strD) || "Content-Encoding".equalsIgnoreCase(strD) || "Content-Type".equalsIgnoreCase(strD) || !I(strD) || tVar2.b(strD) == null)) {
                g0Var.e(strD, strG);
            }
        }
        int size2 = tVar2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            String strD2 = tVar2.d(i12);
            if (!"Content-Length".equalsIgnoreCase(strD2) && !"Content-Encoding".equalsIgnoreCase(strD2) && !"Content-Type".equalsIgnoreCase(strD2) && I(strD2)) {
                g0Var.e(strD2, tVar2.g(i12));
            }
        }
        return g0Var.g();
    }

    public abstract int D(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int G();

    public abstract ViewPropertyAnimator H(int i11, View view);

    public abstract void J(int i11);

    public abstract void K(Typeface typeface, boolean z11);
}
