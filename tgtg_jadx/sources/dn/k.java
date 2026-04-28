package dn;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.m1;
import ax.a0;
import b3.q;
import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.remote.manufacturer.request.AdapterItemType;
import com.app.tgtg.model.remote.order.NpsRating;
import com.app.tgtg.model.remote.order.OrderRatingItem;
import com.app.tgtg.model.remote.order.Rating;
import com.braze.models.Banner;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import cy.b0;
import e0.s;
import e20.k0;
import e20.l0;
import g9.r0;
import h2.b1;
import h2.c1;
import h7.w;
import ia0.c0;
import ia0.d0;
import ia0.h0;
import ia0.i0;
import ia0.j0;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.o0;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;
import q1.a1;
import q1.n0;
import q1.n1;
import q90.g0;
import q90.p0;
import q90.t;
import t1.v1;
import v80.b2;
import v80.f0;
import ym.p;
import z1.h1;
import z1.r;
import z3.v;
import z4.a2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class k implements mg.i, w, OnCompleteListener, q90.i, xd.b, a2, d10.f, j40.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f15018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f15019c;

    public k(Context context, LoginButton loginButton) {
        this.f15017a = 28;
        context.getClass();
        tx.i iVar = new tx.i();
        this.f15018b = iVar;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        a0.i(applicationContext);
        AppConstants appConstants = AppConstants.INSTANCE;
        String facebookId = appConstants.getFacebookId();
        facebookId.getClass();
        tx.j.k(facebookId, "applicationId");
        a0.f4852d = facebookId;
        a0.f4856h = appConstants.getFacebookClientToken();
        a0.f4868u = true;
        loginButton.setPermissions("email", "public_profile");
        b0.f13473i.c().d();
        final lz.i iVar2 = new lz.i(this, 25);
        final b0 b0Var = (b0) loginButton.f10998s.getValue();
        b0Var.getClass();
        int iA = tx.h.Login.a();
        tx.g gVar = new tx.g() { // from class: cy.y
            @Override // tx.g
            public final void a(int i11, Intent intent) {
                b0Var.f(i11, intent, iVar2);
            }
        };
        iVar.f40521a.put(Integer.valueOf(iA), gVar);
        tx.i iVar3 = loginButton.f11002w;
        if (iVar3 == null) {
            loginButton.f11002w = iVar;
        } else if (iVar3 != iVar) {
            Log.w("com.facebook.login.widget.LoginButton", "You're registering a callback on the one Facebook login button with two different callback managers. It's almost wrong and may cause unexpected results. Only the first callback manager will be used for handling activity result with androidx.");
        }
    }

    public static long l(JSONObject jSONObject) throws JSONException {
        long j9 = jSONObject.getLong("$rowId");
        jSONObject.put("event_id", j9);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("library");
        if (jSONObjectOptJSONObject != null) {
            jSONObject.put("library", jSONObjectOptJSONObject.getString("name") + '/' + jSONObjectOptJSONObject.getString("version"));
        }
        Object objOpt = jSONObject.opt("timestamp");
        if (objOpt != null) {
            jSONObject.put("time", objOpt);
        }
        Object objOpt2 = jSONObject.opt("uuid");
        if (objOpt2 != null) {
            jSONObject.put("insert_id", objOpt2);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("api_properties");
        if (jSONObjectOptJSONObject2 != null) {
            Object objOpt3 = jSONObjectOptJSONObject2.opt("androidADID");
            if (objOpt3 != null) {
                jSONObject.put("adid", objOpt3);
            }
            Object objOpt4 = jSONObjectOptJSONObject2.opt("android_app_set_id");
            if (objOpt4 != null) {
                jSONObject.put("android_app_set_id", objOpt4);
            }
            Object objOpt5 = jSONObjectOptJSONObject2.opt("productId");
            if (objOpt5 != null) {
                jSONObject.put("productId", objOpt5);
            }
            Object objOpt6 = jSONObjectOptJSONObject2.opt("quantity");
            if (objOpt6 != null) {
                jSONObject.put("quantity", objOpt6);
            }
            Object objOpt7 = jSONObjectOptJSONObject2.opt("price");
            if (objOpt7 != null) {
                jSONObject.put("price", objOpt7);
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("location");
            if (jSONObjectOptJSONObject3 != null) {
                Object objOpt8 = jSONObjectOptJSONObject3.opt("lat");
                if (objOpt8 != null) {
                    jSONObject.put("location_lat", objOpt8);
                }
                Object objOpt9 = jSONObjectOptJSONObject3.opt("lng");
                if (objOpt9 != null) {
                    jSONObject.put("location_lng", objOpt9);
                }
            }
        }
        Object objOpt10 = jSONObject.opt("$productId");
        if (objOpt10 != null) {
            jSONObject.put("productId", objOpt10);
        }
        Object objOpt11 = jSONObject.opt("$quantity");
        if (objOpt11 != null) {
            jSONObject.put("quantity", objOpt11);
        }
        Object objOpt12 = jSONObject.opt("$price");
        if (objOpt12 != null) {
            jSONObject.put("price", objOpt12);
        }
        Object objOpt13 = jSONObject.opt("$revenueType");
        if (objOpt13 != null) {
            jSONObject.put("revenueType", objOpt13);
        }
        return j9;
    }

    public void A() {
        h1 h1Var = new h1();
        h1Var.a(gn.a0.HalfExpanded, d70.b.d(425));
        h1Var.a(gn.a0.Expanded, 0.0f);
        float[] fArr = h1Var.f46532b;
        ArrayList arrayList = h1Var.f46531a;
        int size = arrayList.size();
        fArr.getClass();
        u.a(size, fArr.length);
        float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, size);
        fArrCopyOfRange.getClass();
        r.k((r) this.f15019c, new z1.a0(arrayList, fArrCopyOfRange));
    }

    public void B(float f11, z5.c cVar, v80.b0 b0Var) {
        if (f11 <= cVar.c0(c1.f21067a)) {
            return;
        }
        z3.g gVarC = v.c();
        x70.c cVar2 = null;
        Function1 function1E = gVarC != null ? gVarC.e() : null;
        z3.g gVarD = v.d(gVarC);
        try {
            float fFloatValue = ((Number) ((t1.j) this.f15019c).f39464b.getValue()).floatValue();
            b2 b2Var = (b2) this.f15018b;
            if (b2Var != null) {
                b2Var.a(null);
            }
            t1.j jVar = (t1.j) this.f15019c;
            if (jVar.f39468f) {
                this.f15019c = t1.c.f(jVar, fFloatValue - f11, 0.0f, 30);
            } else {
                FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
                this.f15019c = new t1.j(t1.c.f39389j, Float.valueOf(-f11), null, 60);
            }
            this.f15018b = f0.B(b0Var, null, null, new b1(this, cVar2, 0), 3);
            v.f(gVarC, gVarD, function1E);
        } catch (Throwable th2) {
            v.f(gVarC, gVarD, function1E);
            throw th2;
        }
    }

    @Override // q90.i
    public void b(q90.h hVar, p0 p0Var) {
        j0 source;
        h0 h0VarN;
        int iIntValue;
        try {
            i0 i0VarA = ((ga0.g) this.f15018b).a(p0Var);
            t tVar = p0Var.f36587f;
            int size = tVar.size();
            int i11 = 0;
            int i12 = 0;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            Integer intOrNull = null;
            Integer intOrNull2 = null;
            while (i12 < size) {
                if (tVar.d(i12).equalsIgnoreCase("Sec-WebSocket-Extensions")) {
                    String strG = tVar.g(i12);
                    int i13 = i11;
                    while (i13 < strG.length()) {
                        t tVar2 = tVar;
                        int iG = r90.e.g(strG, ',', i13, i11, 4);
                        int iE = r90.e.e(strG, ';', i13, iG);
                        String strQ = r90.e.q(i13, iE, strG);
                        int i14 = iE + 1;
                        if (strQ.equalsIgnoreCase("permessage-deflate")) {
                            if (z11) {
                                z14 = true;
                            }
                            while (true) {
                                i13 = i14;
                                while (i13 < iG) {
                                    int iE2 = r90.e.e(strG, ';', i13, iG);
                                    int iE3 = r90.e.e(strG, '=', i13, iE2);
                                    String strQ2 = r90.e.q(i13, iE3, strG);
                                    String strP = iE3 < iE2 ? StringsKt.P(r90.e.q(iE3 + 1, iE2, strG), "\"", "\"") : null;
                                    i14 = iE2 + 1;
                                    if (strQ2.equalsIgnoreCase("client_max_window_bits")) {
                                        if (intOrNull != null) {
                                            z14 = true;
                                        }
                                        intOrNull = strP != null ? StringsKt.toIntOrNull(strP) : null;
                                        if (intOrNull != null) {
                                            break;
                                        }
                                        i13 = i14;
                                        z14 = true;
                                    } else if (strQ2.equalsIgnoreCase("client_no_context_takeover")) {
                                        if (z12) {
                                            z14 = true;
                                        }
                                        if (strP != null) {
                                            z14 = true;
                                        }
                                        i13 = i14;
                                        z12 = true;
                                    } else {
                                        if (strQ2.equalsIgnoreCase("server_max_window_bits")) {
                                            if (intOrNull2 != null) {
                                                z14 = true;
                                            }
                                            intOrNull2 = strP != null ? StringsKt.toIntOrNull(strP) : null;
                                            if (intOrNull2 != null) {
                                                break;
                                            }
                                        } else if (strQ2.equalsIgnoreCase("server_no_context_takeover")) {
                                            if (z13) {
                                                z14 = true;
                                            }
                                            if (strP != null) {
                                                z14 = true;
                                            }
                                            i13 = i14;
                                            z13 = true;
                                        }
                                        i13 = i14;
                                        z14 = true;
                                    }
                                }
                            }
                            tVar = tVar2;
                            z11 = true;
                        } else {
                            i13 = i14;
                            tVar = tVar2;
                            z14 = true;
                        }
                        i11 = 0;
                    }
                }
                i12++;
                tVar = tVar;
                i11 = 0;
            }
            ((ga0.g) this.f15018b).f20289d = new ga0.h(z11, intOrNull, z12, intOrNull2, z13, z14);
            if (z14 || intOrNull != null || (intOrNull2 != null && (8 > (iIntValue = intOrNull2.intValue()) || iIntValue >= 16))) {
                ga0.g gVar = (ga0.g) this.f15018b;
                synchronized (gVar) {
                    gVar.f20300p.clear();
                    gVar.b(1010, "unexpected Sec-WebSocket-Extensions in response header");
                }
            }
            String str = r90.g.f37816b + " WebSocket " + ((g0) this.f15019c).f36505a.h();
            ga0.g gVar2 = (ga0.g) this.f15018b;
            t5.a aVar = new t5.a(i0VarA);
            ga0.h hVar2 = gVar2.f20289d;
            hVar2.getClass();
            synchronized (gVar2) {
                try {
                    gVar2.f20297m = str;
                    gVar2.f20298n = aVar;
                    gVar2.f20296k = new ga0.k((c0) aVar.f39793d, gVar2.f20287b, hVar2.f20308a, hVar2.f20310c, gVar2.f20290e);
                    gVar2.f20294i = new ga0.f(gVar2);
                    long j9 = gVar2.f20288c;
                    if (j9 != 0) {
                        long nanos = TimeUnit.MILLISECONDS.toNanos(j9);
                        t90.c cVar = gVar2.l;
                        com.braze.c1 c1Var = new com.braze.c1(1, nanos, gVar2);
                        cVar.getClass();
                        cVar.c(new t90.b(str + " ping", c1Var), nanos);
                    }
                    if (!gVar2.f20300p.isEmpty()) {
                        gVar2.e();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            gVar2.f20295j = new ga0.j((d0) aVar.f39792c, gVar2, hVar2.f20308a, hVar2.f20312e);
            ga0.g gVar3 = (ga0.g) this.f15018b;
            try {
                gVar3.f20286a.onOpen(gVar3, p0Var);
                while (gVar3.f20303s == -1) {
                    ga0.j jVar = gVar3.f20295j;
                    jVar.getClass();
                    jVar.a();
                }
            } catch (Exception e5) {
                ga0.g.c(gVar3, e5, null, 6);
            } finally {
                gVar3.d();
            }
        } catch (IOException e11) {
            ga0.g.c((ga0.g) this.f15018b, e11, p0Var, 4);
            r90.e.b(p0Var);
            i0 i0Var = p0Var.f36589h;
            if (i0Var != null && (h0VarN = i0Var.n()) != null) {
                r90.e.b(h0VarN);
            }
            i0 i0Var2 = p0Var.f36589h;
            if (i0Var2 == null || (source = i0Var2.getSource()) == null) {
                return;
            }
            r90.e.b(source);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mg.i
    public void c(int i11) {
        int iIntValue;
        a8.h hVar = (a8.h) this.f15018b;
        ym.w wVar = (ym.w) hVar.f974c;
        wVar.d();
        ArrayList arrayList = (ArrayList) hVar.f975d;
        int i12 = 5;
        Integer numValueOf = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        if (arrayList.size() > i11) {
            arrayList.getClass();
            String str = ((mg.a) arrayList.get(i11)).f29928a;
            Integer num = ((mg.a) arrayList.get(i11)).f29931d;
            String str2 = ((mg.a) arrayList.get(i11)).f29932e;
            str.getClass();
            int i13 = 2;
            OrderRatingItem orderRatingItem = new OrderRatingItem(new Rating(i12, (List) (objArr7 == true ? 1 : 0), i13, (DefaultConstructorMarker) (objArr6 == true ? 1 : 0)), new Rating(i12, (List) (objArr5 == true ? 1 : 0), i13, (DefaultConstructorMarker) (objArr4 == true ? 1 : 0)), new Rating(i12, (List) (objArr3 == true ? 1 : 0), i13, (DefaultConstructorMarker) (objArr2 == true ? 1 : 0)), (List) null, (String) null, new NpsRating(num, str2), (Boolean) null, (Boolean) null, (String) null, (Boolean) null, 984, (DefaultConstructorMarker) null);
            a9.a aVarD = m1.d(wVar);
            wVar.f46259g.getClass();
            c90.f fVar = v80.p0.f42144a;
            f0.B(aVarD, c90.e.f7834b, null, new tg.g(wVar, str, orderRatingItem, objArr == true ? 1 : 0, 19), 2);
            wVar.e(cv.i.ACTION_CLOSE_NPS, h0.g.E(new Pair(dv.a.SOURCE, new dv.c("Delivery_Tab")), new Pair(dv.a.NPS_STEP, new dv.c(((mg.a) arrayList.get(i11)).f29929b.a())), new Pair(dv.a.ORDER_ID, new dv.c(((mg.a) arrayList.get(i11)).f29928a))));
            hVar.A(i11);
        }
        ym.u uVar = (ym.u) hVar.f973b;
        a8.h hVar2 = uVar.f46247v;
        if (hVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("deliveryFeedNpsHandler");
            hVar2 = null;
        }
        ArrayList arrayList2 = (ArrayList) hVar2.f975d;
        if (arrayList2.size() > i11) {
            i iVar = uVar.f46240o;
            if (iVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("deliveryFeedImpressionHandler");
                iVar = null;
            }
            iVar.f15014f = true;
            uVar.f46241p.removeIf(new fn.h(new q(arrayList2, i11, i12), 15));
        }
        ym.o oVar = uVar.f46236j;
        if (oVar != null) {
            ArrayList arrayList3 = oVar.f46208h;
            if (arrayList3 != null && i11 >= 0 && i11 < arrayList3.size()) {
                ArrayList arrayList4 = oVar.f46208h;
                arrayList4.getClass();
                arrayList4.remove(i11);
            }
            ArrayList arrayList5 = oVar.f46208h;
            if (arrayList5 == null || !arrayList5.isEmpty()) {
                return;
            }
            ArrayList arrayList6 = oVar.f46203c;
            if (arrayList6 != null) {
                Iterator it = arrayList6.iterator();
                int i14 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i14 = -1;
                        break;
                    } else if (AdapterItemType.NPS == ((p) it.next()).f46226a.getElementType()) {
                        break;
                    } else {
                        i14++;
                    }
                }
                numValueOf = Integer.valueOf(i14);
            }
            if (numValueOf == null || (iIntValue = numValueOf.intValue()) < 0) {
                return;
            }
            oVar.e(iIntValue);
        }
    }

    @Override // z4.a2
    public boolean d(Object obj, Object obj2) {
        h2.j0 j0Var = (h2.j0) this.f15018b;
        return Intrinsics.areEqual(j0Var.b(obj), j0Var.b(obj2));
    }

    @Override // q90.i
    public void e(q90.h hVar, IOException iOException) {
        ga0.g.c((ga0.g) this.f15018b, iOException, null, 6);
    }

    @Override // j40.a
    public StackTraceElement[] f(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        j40.a[] aVarArr = (j40.a[]) this.f15018b;
        StackTraceElement[] stackTraceElementArrF = stackTraceElementArr;
        for (int i11 = 0; i11 < 1; i11++) {
            j40.a aVar = aVarArr[i11];
            if (stackTraceElementArrF.length <= 1024) {
                break;
            }
            stackTraceElementArrF = aVar.f(stackTraceElementArr);
        }
        return stackTraceElementArrF.length > 1024 ? ((r40.d) this.f15019c).f(stackTraceElementArrF) : stackTraceElementArrF;
    }

    @Override // z4.a2
    public void g(n1 n1Var) {
        n0 n0Var = (n0) this.f15019c;
        n0Var.b();
        q1.p0 p0Var = (q1.p0) n1Var.f35797b;
        Object[] objArr = p0Var.f35738b;
        long[] jArr = p0Var.f35739c;
        int i11 = p0Var.f35741e;
        while (i11 != Integer.MAX_VALUE) {
            int i12 = (int) ((jArr[i11] >> 31) & 2147483647L);
            Object obj = objArr[i11];
            Object objB = ((h2.j0) this.f15018b).b(obj);
            int iA = n0Var.a(objB);
            int i13 = iA >= 0 ? n0Var.f35870c[iA] : 0;
            if (i13 == 7) {
                n1Var.remove(obj);
            } else {
                n0Var.g(i13 + 1, objB);
            }
            i11 = i12;
        }
    }

    @Override // d10.f
    public Task h(Object obj) throws Throwable {
        FileWriter fileWriter;
        cz.j jVar = (cz.j) this.f15019c;
        JSONObject jSONObject = (JSONObject) ((b40.f) this.f15018b).f5744c.f5737a.submit(new a40.r(this, 1)).get();
        FileWriter fileWriter2 = null;
        if (jSONObject != null) {
            i40.b bVarN = ((se.d) jVar.f13633c).N(jSONObject);
            lz.i iVar = (lz.i) jVar.f13635e;
            long j9 = bVarN.f23343c;
            iVar.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put(Banner.EXPIRATION, j9);
                fileWriter = new FileWriter((File) iVar.f28446b);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Throwable th2) {
                        th = th2;
                        fileWriter2 = fileWriter;
                        a40.g.b(fileWriter2, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Exception e5) {
                    e = e5;
                    Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                }
            } catch (Exception e11) {
                e = e11;
                fileWriter = null;
            } catch (Throwable th3) {
                th = th3;
                a40.g.b(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            a40.g.b(fileWriter, "Failed to close settings writer.");
            cz.j.k("Loaded settings: ", jSONObject);
            String str = ((i40.e) jVar.f13632b).f23352f;
            SharedPreferences.Editor editorEdit = ((Context) jVar.f13631a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            editorEdit.putString("existing_instance_identifier", str);
            editorEdit.apply();
            ((AtomicReference) jVar.f13638h).set(bVarN);
            ((d10.g) ((AtomicReference) jVar.f13639i).get()).d(bVarN);
        }
        return Tasks.d(null);
    }

    @Override // xd.b
    public void j(fd.l lVar) {
        n4.b bVarL;
        td.i iVar = (td.i) this.f15018b;
        gd.i iVar2 = (gd.i) this.f15019c;
        n4.b bVarD = lVar != null ? gd.o.d(lVar, iVar.f39996a, iVar2.f20382p) : null;
        if (bVarD == null && ((Boolean) fd.o.e(iVar, gd.o.f20398a)).booleanValue() && (bVarL = iVar2.l()) != null) {
            bVarD = bVarL;
        }
        gd.i.k(iVar2, new gd.f(bVarD));
    }

    public boolean k(qb.h hVar) {
        boolean zContainsKey;
        synchronized (this.f15019c) {
            zContainsKey = ((jb.l) this.f15018b).f24902a.containsKey(hVar);
        }
        return zContainsKey;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0109, code lost:
    
        if (r0.r(r1) != r2) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x013f, code lost:
    
        if (r11.f(r1) != r2) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010d A[PHI: r3
      0x010d: PHI (r3v6 dn.k) = (r3v4 dn.k), (r3v7 dn.k) binds: [B:60:0x00f1, B:68:0x010c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012e A[PHI: r0
      0x012e: PHI (r0v22 dn.k) = (r0v20 dn.k), (r0v24 dn.k) binds: [B:74:0x012b, B:13:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(z70.c r11) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dn.k.m(z70.c):java.lang.Object");
    }

    public boolean n() {
        r rVar = (r) this.f15019c;
        gn.a0 a0Var = (gn.a0) rVar.f46652g.getValue();
        gn.a0 a0Var2 = gn.a0.Expanded;
        return a0Var == a0Var2 && ((gn.a0) rVar.f46654i.getValue()) == a0Var2 && ((gn.a0) rVar.f46652g.getValue()) == a0Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o(org.json.JSONObject r7, hf.g r8, kotlin.jvm.functions.Function1 r9, z70.c r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof ff.i
            if (r0 == 0) goto L13
            r0 = r10
            ff.i r0 = (ff.i) r0
            int r1 = r0.f17648n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17648n = r1
            goto L18
        L13:
            ff.i r0 = new ff.i
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f17648n
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2f
            long r7 = r0.f17646k
            kotlin.jvm.internal.FunctionReferenceImpl r9 = r0.f17645j
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            ba0.g.M(r10)     // Catch: java.lang.Exception -> L2d
            goto L52
        L2d:
            r7 = move-exception
            goto L5b
        L2f:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L36:
            ba0.g.M(r10)
            long r4 = l(r7)     // Catch: java.lang.Exception -> L2d
            pf.a r7 = jb.u.Q(r7)     // Catch: java.lang.Exception -> L2d
            r10 = r9
            kotlin.jvm.internal.FunctionReferenceImpl r10 = (kotlin.jvm.internal.FunctionReferenceImpl) r10     // Catch: java.lang.Exception -> L2d
            r0.f17645j = r10     // Catch: java.lang.Exception -> L2d
            r0.f17646k = r4     // Catch: java.lang.Exception -> L2d
            r0.f17648n = r3     // Catch: java.lang.Exception -> L2d
            java.lang.Object r7 = r8.h(r7, r0)     // Catch: java.lang.Exception -> L2d
            if (r7 != r1) goto L51
            return r1
        L51:
            r7 = r4
        L52:
            java.lang.Long r10 = new java.lang.Long     // Catch: java.lang.Exception -> L2d
            r10.<init>(r7)     // Catch: java.lang.Exception -> L2d
            r9.invoke(r10)     // Catch: java.lang.Exception -> L2d
            goto L72
        L5b:
            lf.b r8 = lf.b.f27770c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "event migration failed: "
            r9.<init>(r10)
            java.lang.String r7 = r7.getMessage()
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r8.a(r7)
        L72:
            kotlin.Unit r7 = kotlin.Unit.f26487a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dn.k.o(org.json.JSONObject, hf.g, kotlin.jvm.functions.Function1, z70.c):java.lang.Object");
    }

    @Override // h7.w
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        k0 k0Var = (k0) this.f15018b;
        l0 l0Var = (l0) this.f15019c;
        l0 l0Var2 = new l0();
        l0Var2.f15680a = l0Var.f15680a;
        l0Var2.f15681b = l0Var.f15681b;
        l0Var2.f15682c = l0Var.f15682c;
        l0Var2.f15683d = l0Var.f15683d;
        return k0Var.e(view, windowInsetsCompat, l0Var2);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        switch (this.f15017a) {
            case 10:
                g30.h hVar = (g30.h) this.f15018b;
                d10.g gVar = (d10.g) this.f15019c;
                synchronized (hVar.f19922f) {
                    hVar.f19921e.remove(gVar);
                    break;
                }
                return;
            default:
                i30.c cVar = (i30.c) this.f15018b;
                d10.g gVar2 = (d10.g) this.f15019c;
                synchronized (cVar.f23208f) {
                    cVar.f23207e.remove(gVar2);
                    break;
                }
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(z70.c r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof ff.j
            if (r0 == 0) goto L13
            r0 = r15
            ff.j r0 = (ff.j) r0
            int r1 = r0.f17652n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17652n = r1
            goto L18
        L13:
            ff.j r0 = new ff.j
            r0.<init>(r14, r15)
        L18:
            java.lang.Object r15 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f17652n
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2e
            java.util.Iterator r2 = r0.f17650k
            dn.k r4 = r0.f17649j
            ba0.g.M(r15)     // Catch: java.lang.Exception -> L2b
            goto L4a
        L2b:
            r0 = move-exception
            r15 = r0
            goto L81
        L2e:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r15)
            r15 = 0
            return r15
        L35:
            ba0.g.M(r15)
            java.lang.Object r15 = r14.f15019c     // Catch: java.lang.Exception -> L2b
            ff.e r15 = (ff.e) r15     // Catch: java.lang.Exception -> L2b
            monitor-enter(r15)     // Catch: java.lang.Exception -> L2b
            java.lang.String r2 = "events"
            java.util.AbstractList r2 = r15.t(r2)     // Catch: java.lang.Throwable -> L7e
            monitor-exit(r15)     // Catch: java.lang.Exception -> L2b
            java.util.Iterator r15 = r2.iterator()     // Catch: java.lang.Exception -> L2b
            r4 = r14
            r2 = r15
        L4a:
            boolean r15 = r2.hasNext()     // Catch: java.lang.Exception -> L2b
            if (r15 == 0) goto L98
            java.lang.Object r15 = r2.next()     // Catch: java.lang.Exception -> L2b
            org.json.JSONObject r15 = (org.json.JSONObject) r15     // Catch: java.lang.Exception -> L2b
            java.lang.Object r5 = r4.f15018b     // Catch: java.lang.Exception -> L2b
            ye.b r5 = (ye.b) r5     // Catch: java.lang.Exception -> L2b
            hf.g r5 = r5.g()     // Catch: java.lang.Exception -> L2b
            al.d r6 = new al.d     // Catch: java.lang.Exception -> L2b
            java.lang.Object r7 = r4.f15019c     // Catch: java.lang.Exception -> L2b
            r8 = r7
            ff.e r8 = (ff.e) r8     // Catch: java.lang.Exception -> L2b
            java.lang.Class<ff.e> r9 = ff.e.class
            java.lang.String r10 = "removeEvent"
            java.lang.String r11 = "removeEvent(J)V"
            r12 = 0
            r13 = 3
            r7 = 1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> L2b
            r0.f17649j = r4     // Catch: java.lang.Exception -> L2b
            r0.f17650k = r2     // Catch: java.lang.Exception -> L2b
            r0.f17652n = r3     // Catch: java.lang.Exception -> L2b
            java.lang.Object r15 = r4.o(r15, r5, r6, r0)     // Catch: java.lang.Exception -> L2b
            if (r15 != r1) goto L4a
            return r1
        L7e:
            r0 = move-exception
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L7e
            throw r0     // Catch: java.lang.Exception -> L2b
        L81:
            lf.b r0 = lf.b.f27770c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "events migration failed: "
            r1.<init>(r2)
            java.lang.String r15 = r15.getMessage()
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r0.a(r15)
        L98:
            kotlin.Unit r15 = kotlin.Unit.f26487a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: dn.k.p(z70.c):java.lang.Object");
    }

    @Override // mg.i
    public void q(mg.a aVar, int i11) {
        aVar.getClass();
        aVar.f29934g = true;
        ((ArrayList) ((a8.h) this.f15018b).f975d).set(i11, aVar);
        ym.o oVar = (ym.o) this.f15019c;
        oVar.getClass();
        ArrayList arrayList = oVar.f46208h;
        if (arrayList != null) {
        }
        oVar.f46209i = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r(z70.c r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof ff.k
            if (r0 == 0) goto L13
            r0 = r15
            ff.k r0 = (ff.k) r0
            int r1 = r0.f17656n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17656n = r1
            goto L18
        L13:
            ff.k r0 = new ff.k
            r0.<init>(r14, r15)
        L18:
            java.lang.Object r15 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f17656n
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2e
            java.util.Iterator r2 = r0.f17654k
            dn.k r4 = r0.f17653j
            ba0.g.M(r15)     // Catch: java.lang.Exception -> L2b
            goto L4a
        L2b:
            r0 = move-exception
            r15 = r0
            goto L81
        L2e:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r15)
            r15 = 0
            return r15
        L35:
            ba0.g.M(r15)
            java.lang.Object r15 = r14.f15019c     // Catch: java.lang.Exception -> L2b
            ff.e r15 = (ff.e) r15     // Catch: java.lang.Exception -> L2b
            monitor-enter(r15)     // Catch: java.lang.Exception -> L2b
            java.lang.String r2 = "identifys"
            java.util.AbstractList r2 = r15.t(r2)     // Catch: java.lang.Throwable -> L7e
            monitor-exit(r15)     // Catch: java.lang.Exception -> L2b
            java.util.Iterator r15 = r2.iterator()     // Catch: java.lang.Exception -> L2b
            r4 = r14
            r2 = r15
        L4a:
            boolean r15 = r2.hasNext()     // Catch: java.lang.Exception -> L2b
            if (r15 == 0) goto L98
            java.lang.Object r15 = r2.next()     // Catch: java.lang.Exception -> L2b
            org.json.JSONObject r15 = (org.json.JSONObject) r15     // Catch: java.lang.Exception -> L2b
            java.lang.Object r5 = r4.f15018b     // Catch: java.lang.Exception -> L2b
            ye.b r5 = (ye.b) r5     // Catch: java.lang.Exception -> L2b
            hf.g r5 = r5.g()     // Catch: java.lang.Exception -> L2b
            al.d r6 = new al.d     // Catch: java.lang.Exception -> L2b
            java.lang.Object r7 = r4.f15019c     // Catch: java.lang.Exception -> L2b
            r8 = r7
            ff.e r8 = (ff.e) r8     // Catch: java.lang.Exception -> L2b
            java.lang.Class<ff.e> r9 = ff.e.class
            java.lang.String r10 = "removeIdentify"
            java.lang.String r11 = "removeIdentify(J)V"
            r12 = 0
            r13 = 4
            r7 = 1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> L2b
            r0.f17653j = r4     // Catch: java.lang.Exception -> L2b
            r0.f17654k = r2     // Catch: java.lang.Exception -> L2b
            r0.f17656n = r3     // Catch: java.lang.Exception -> L2b
            java.lang.Object r15 = r4.o(r15, r5, r6, r0)     // Catch: java.lang.Exception -> L2b
            if (r15 != r1) goto L4a
            return r1
        L7e:
            r0 = move-exception
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L7e
            throw r0     // Catch: java.lang.Exception -> L2b
        L81:
            lf.b r0 = lf.b.f27770c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "identifies migration failed: "
            r1.<init>(r2)
            java.lang.String r15 = r15.getMessage()
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r0.a(r15)
        L98:
            kotlin.Unit r15 = kotlin.Unit.f26487a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: dn.k.r(z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object s(z70.c r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof ff.l
            if (r0 == 0) goto L13
            r0 = r15
            ff.l r0 = (ff.l) r0
            int r1 = r0.f17660n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17660n = r1
            goto L18
        L13:
            ff.l r0 = new ff.l
            r0.<init>(r14, r15)
        L18:
            java.lang.Object r15 = r0.l
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f17660n
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2e
            java.util.Iterator r2 = r0.f17658k
            dn.k r4 = r0.f17657j
            ba0.g.M(r15)     // Catch: java.lang.Exception -> L2b
            goto L55
        L2b:
            r0 = move-exception
            r15 = r0
            goto L8b
        L2e:
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r15)
            r15 = 0
            return r15
        L35:
            ba0.g.M(r15)
            java.lang.Object r15 = r14.f15019c     // Catch: java.lang.Exception -> L2b
            ff.e r15 = (ff.e) r15     // Catch: java.lang.Exception -> L2b
            monitor-enter(r15)     // Catch: java.lang.Exception -> L2b
            int r2 = r15.f17635d     // Catch: java.lang.Throwable -> L46
            r4 = 4
            if (r2 >= r4) goto L48
            kotlin.collections.n0 r2 = kotlin.collections.n0.f26529a     // Catch: java.lang.Throwable -> L46
            monitor-exit(r15)     // Catch: java.lang.Exception -> L2b
            goto L4f
        L46:
            r0 = move-exception
            goto L89
        L48:
            java.lang.String r2 = "identify_interceptor"
            java.util.AbstractList r2 = r15.t(r2)     // Catch: java.lang.Throwable -> L46
            monitor-exit(r15)     // Catch: java.lang.Exception -> L2b
        L4f:
            java.util.Iterator r15 = r2.iterator()     // Catch: java.lang.Exception -> L2b
            r4 = r14
            r2 = r15
        L55:
            boolean r15 = r2.hasNext()     // Catch: java.lang.Exception -> L2b
            if (r15 == 0) goto La2
            java.lang.Object r15 = r2.next()     // Catch: java.lang.Exception -> L2b
            org.json.JSONObject r15 = (org.json.JSONObject) r15     // Catch: java.lang.Exception -> L2b
            java.lang.Object r5 = r4.f15018b     // Catch: java.lang.Exception -> L2b
            ye.b r5 = (ye.b) r5     // Catch: java.lang.Exception -> L2b
            hf.g r5 = r5.d()     // Catch: java.lang.Exception -> L2b
            al.d r6 = new al.d     // Catch: java.lang.Exception -> L2b
            java.lang.Object r7 = r4.f15019c     // Catch: java.lang.Exception -> L2b
            r8 = r7
            ff.e r8 = (ff.e) r8     // Catch: java.lang.Exception -> L2b
            java.lang.Class<ff.e> r9 = ff.e.class
            java.lang.String r10 = "removeInterceptedIdentify"
            java.lang.String r11 = "removeInterceptedIdentify(J)V"
            r12 = 0
            r13 = 5
            r7 = 1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> L2b
            r0.f17657j = r4     // Catch: java.lang.Exception -> L2b
            r0.f17658k = r2     // Catch: java.lang.Exception -> L2b
            r0.f17660n = r3     // Catch: java.lang.Exception -> L2b
            java.lang.Object r15 = r4.o(r15, r5, r6, r0)     // Catch: java.lang.Exception -> L2b
            if (r15 != r1) goto L55
            return r1
        L89:
            monitor-exit(r15)     // Catch: java.lang.Throwable -> L46
            throw r0     // Catch: java.lang.Exception -> L2b
        L8b:
            lf.b r0 = lf.b.f27770c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "intercepted identifies migration failed: "
            r1.<init>(r2)
            java.lang.String r15 = r15.getMessage()
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r0.a(r15)
        La2:
            kotlin.Unit r15 = kotlin.Unit.f26487a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: dn.k.s(z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x010b A[PHI: r2 r3 r6
      0x010b: PHI (r2v6 java.lang.Long) = (r2v4 java.lang.Long), (r2v4 java.lang.Long), (r2v9 java.lang.Long) binds: [B:48:0x00de, B:49:0x00e0, B:53:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x010b: PHI (r3v9 java.lang.Long) = (r3v6 java.lang.Long), (r3v6 java.lang.Long), (r3v11 java.lang.Long) binds: [B:48:0x00de, B:49:0x00e0, B:53:0x0104] A[DONT_GENERATE, DONT_INLINE]
      0x010b: PHI (r6v7 dn.k) = (r6v4 dn.k), (r6v4 dn.k), (r6v8 dn.k) binds: [B:48:0x00de, B:49:0x00e0, B:53:0x0104] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object t(z70.c r17) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dn.k.t(z70.c):java.lang.Object");
    }

    public String toString() {
        switch (this.f15017a) {
            case 11:
                String string = "[ ";
                if (((g6.h) this.f15018b) != null) {
                    for (int i11 = 0; i11 < 9; i11++) {
                        StringBuilder sbO = b3.i.o(string);
                        sbO.append(((g6.h) this.f15018b).f20051h[i11]);
                        sbO.append(" ");
                        string = sbO.toString();
                    }
                }
                StringBuilder sbR = e0.f.r(string, "] ");
                sbR.append((g6.h) this.f15018b);
                return sbR.toString();
            default:
                return super.toString();
        }
    }

    public void u(e7.f fVar) {
        d7.e eVar = (d7.e) this.f15019c;
        t10.c cVar = (t10.c) this.f15018b;
        int i11 = fVar.f15825b;
        if (i11 != 0) {
            eVar.execute(new e7.a(cVar, i11, 0));
        } else {
            eVar.execute(new x0.f(10, cVar, fVar.f15824a));
        }
    }

    public Unit v(String str, CameraDevice.StateCallback stateCallback) {
        h0.n nVar = (h0.n) this.f15019c;
        CameraManager cameraManager = (CameraManager) ((t70.a) this.f15018b).get();
        try {
            Trace.beginSection(((Object) s.b(str)) + "#openCamera");
            if (Build.VERSION.SDK_INT >= 28) {
                cameraManager.getClass();
                f0.u.g(cameraManager, str, (Executor) nVar.f20990j.getValue(), stateCallback);
            } else {
                cameraManager.openCamera(str, stateCallback, nVar.a());
            }
            Trace.endSection();
            return Unit.f26487a;
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public jb.k w(qb.h hVar) {
        jb.k kVarB;
        hVar.getClass();
        synchronized (this.f15019c) {
            kVarB = ((jb.l) this.f15018b).b(hVar);
        }
        return kVarB;
    }

    public void x(jb.k kVar, k kVar2) {
        kVar.getClass();
        ((sb.a) this.f15019c).a(new a40.q(this, kVar, kVar2, 19));
    }

    public void y(jb.k kVar, int i11) {
        kVar.getClass();
        ((sb.a) this.f15019c).a(new o10.e((jb.f) this.f15018b, kVar, false, i11));
    }

    public jb.k z(qb.h hVar) {
        jb.k kVarD;
        synchronized (this.f15019c) {
            kVarD = ((jb.l) this.f15018b).d(hVar);
        }
        return kVarD;
    }

    @Override // xd.b
    public void a(fd.l lVar) {
    }

    @Override // xd.b
    public void i(fd.l lVar) {
    }

    public /* synthetic */ k(int i11, boolean z11) {
        this.f15017a = i11;
    }

    public k(Context context, kf.b bVar) {
        this.f15017a = 26;
        context.getClass();
        bVar.getClass();
        this.f15018b = context;
        this.f15019c = bVar;
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
            return;
        }
        bVar.d("No ACCESS_NETWORK_STATE permission, offline mode is not supported. To enable, add <uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\" /> to your AndroidManifest.xml. Learn more at https://www.docs.developers.amplitude.com/data/sdks/android-kotlin/#offline-mode");
    }

    public k(ye.b bVar) {
        this.f15017a = 27;
        bVar.getClass();
        this.f15018b = bVar;
        this.f15019c = u70.l.b(new defpackage.a(this, 26));
    }

    public /* synthetic */ k(int i11, Object obj, Object obj2) {
        this.f15017a = i11;
        this.f15018b = obj;
        this.f15019c = obj2;
    }

    public k(j40.a[] aVarArr) {
        this.f15017a = 23;
        this.f15018b = aVarArr;
        this.f15019c = new r40.d();
    }

    public k(gn.a0 a0Var, Function1 function1, t1.i iVar, t1.s sVar, Function1 function12) {
        this.f15017a = 14;
        function1.getClass();
        iVar.getClass();
        sVar.getClass();
        function12.getClass();
        this.f15018b = function1;
        r0 r0Var = gn.b.f20583b;
        g60.d dVar = gn.b.f20584c;
        r rVar = new r(a0Var, function12);
        rVar.f46647b = r0Var;
        rVar.f46648c = dVar;
        rVar.f46649d = iVar;
        rVar.f46650e = sVar;
        this.f15019c = rVar;
    }

    public k(int i11) {
        this.f15017a = i11;
        switch (i11) {
            case 5:
                this.f15018b = new LinkedHashMap();
                this.f15019c = new LinkedHashMap();
                break;
            case 16:
                FloatCompanionObject floatCompanionObject = FloatCompanionObject.INSTANCE;
                v1 v1Var = t1.c.f39389j;
                Float fValueOf = Float.valueOf(0.0f);
                this.f15019c = new t1.j(v1Var, fValueOf, (t1.o) v1Var.f39591a.invoke(fValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
                break;
            case 19:
                List list = Collections.EMPTY_LIST;
                this.f15018b = list;
                this.f15019c = list;
                break;
            default:
                kotlin.collections.p0 p0Var = kotlin.collections.p0.f26531a;
                o0 o0Var = o0.f26530a;
                o0Var.getClass();
                p0Var.getClass();
                this.f15018b = p0Var;
                this.f15019c = o0Var;
                break;
        }
    }

    public k(g6.f fVar) {
        this.f15017a = 11;
        this.f15019c = fVar;
    }

    public k(jb.f fVar, sb.a aVar) {
        this.f15017a = 25;
        fVar.getClass();
        aVar.getClass();
        this.f15018b = fVar;
        this.f15019c = aVar;
    }

    public k(jb.l lVar) {
        this.f15017a = 24;
        this.f15018b = lVar;
        this.f15019c = new Object();
    }

    public k(e0.n nVar, e0.r rVar) {
        this.f15017a = 8;
        nVar.getClass();
        this.f15018b = nVar;
        this.f15019c = rVar;
    }

    public k(t70.a aVar, h0.n nVar) {
        this.f15017a = 4;
        aVar.getClass();
        nVar.getClass();
        this.f15018b = aVar;
        this.f15019c = nVar;
    }

    public k(h2.j0 j0Var) {
        this.f15017a = 15;
        this.f15018b = j0Var;
        n0 n0Var = a1.f35713a;
        this.f15019c = new n0();
    }

    public k(cz.j jVar, b40.f fVar) {
        this.f15017a = 18;
        this.f15019c = jVar;
        this.f15018b = fVar;
    }
}
