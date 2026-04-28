package a8;

import a3.x;
import android.app.Activity;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.ViewGroup;
import androidx.lifecycle.k1;
import androidx.work.impl.foreground.SystemForegroundService;
import b0.x0;
import b5.m2;
import b5.p;
import b5.z;
import bg.r;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import com.app.tgtg.customview.ExpandableTextView;
import com.app.tgtg.feature.main.fragments.delivery.parcelitemdetails.ManufacturerItemDetailsActivity;
import com.app.tgtg.model.remote.item.response.ManufacturerItem;
import com.braze.models.inappmessage.InAppMessageBase;
import com.facebook.FacebookException;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.internal.measurement.aa;
import com.google.android.gms.internal.measurement.ba;
import com.google.android.gms.internal.measurement.ca;
import com.google.android.gms.internal.measurement.i5;
import com.google.android.gms.internal.measurement.o5;
import com.google.android.gms.internal.measurement.w5;
import com.google.android.gms.internal.measurement.y9;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.firebase.messaging.FirebaseMessagingService;
import cy.n;
import cy.t;
import cy.u;
import d2.k0;
import d6.a0;
import e0.v;
import en.o;
import f0.t0;
import j4.s;
import java.io.File;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import java.util.zip.Adler32;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.o0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import o00.h0;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;
import org.json.JSONException;
import org.json.JSONObject;
import q1.g1;
import qc.y;
import qz.m;
import qz.q;
import s0.i0;
import s0.z1;
import tx.m0;
import v80.f0;
import v80.s1;
import w.u0;
import ym.w;
import zendesk.ui.android.conversation.articleviewer.articlecontent.ArticleContentView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements o0.b, c20.h, q, m0, OnCompleteListener, r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f975d;

    public h(Collection collection) {
        this.f972a = 16;
        String strE = s.e();
        SecureRandom secureRandom = new SecureRandom();
        int iNextInt = secureRandom.nextInt(86) + 43;
        ArrayList arrayListE0 = CollectionsKt.e0(CollectionsKt.e0(CollectionsKt.e0(CollectionsKt.e0(CollectionsKt.d0(new n80.e('0', '9'), CollectionsKt.b0(new n80.e('a', 'z'), new n80.e('A', Matrix.MATRIX_TYPE_ZERO))), '-'), '.'), '_'), '~');
        ArrayList arrayList = new ArrayList(iNextInt);
        boolean z11 = false;
        for (int i11 = 0; i11 < iNextInt; i11++) {
            Character ch = (Character) arrayListE0.get(secureRandom.nextInt(arrayListE0.size()));
            ch.getClass();
            arrayList.add(ch);
        }
        String strU = CollectionsKt.U(arrayList, "", null, null, null, 62);
        if ((strE.length() == 0 ? false : !(StringsKt.F(strE, ' ', 0, false, 6) >= 0)) && ba0.g.B(strU)) {
            z11 = true;
        }
        if (!z11) {
            i4.a.f("Failed requirement.");
            throw null;
        }
        HashSet hashSet = collection != null ? new HashSet(collection) : new HashSet();
        hashSet.add("openid");
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        setUnmodifiableSet.getClass();
        this.f973b = setUnmodifiableSet;
        this.f974c = strE;
        this.f975d = strU;
    }

    public static String l(String str, HashMap map) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb2.append((String) entry.getKey());
        sb2.append("=");
        sb2.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), ArticleContentView.UTF_8_ENCODING_TYPE) : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb2.append("&");
            sb2.append((String) entry2.getKey());
            sb2.append("=");
            sb2.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), ArticleContentView.UTF_8_ENCODING_TYPE) : "");
        }
        String string = sb2.toString();
        if (string.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return r8.k.m(str, "?", string);
        }
        if (!str.endsWith("&")) {
            string = "&".concat(string);
        }
        return str.concat(string);
    }

    public void A(int i11) {
        int i12 = dn.j.$EnumSwitchMapping$0[((mg.a) ((ArrayList) this.f975d).get(i11)).f29929b.ordinal()];
        if (i12 == 1) {
            w(i11, mg.j.ViewStateRating.a());
            return;
        }
        if (i12 == 2) {
            w(i11, mg.j.ViewStateRating.a());
            w(i11, mg.j.ViewStateFeedback.a());
        } else {
            if (i12 != 3) {
                e40.a.f();
                return;
            }
            w(i11, mg.j.ViewStateRating.a());
            w(i11, mg.j.ViewStateFeedback.a());
            w(i11, mg.j.ViewStateThankYou.a());
        }
    }

    public File B() {
        String str = (String) ((j30.l) this.f974c).get();
        String str2 = (String) ((j30.l) this.f975d).get();
        return new File(e0.f.o(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length() + 3), str, ExpiryDateInput.SEPARATOR, str2, ".pb"));
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C(com.google.android.gms.internal.measurement.u0 r10, java.util.Set r11, java.lang.String r12) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.h.C(com.google.android.gms.internal.measurement.u0, java.util.Set, java.lang.String):void");
    }

    public void a(b5.m0 m0Var, z zVar) {
        a50.c cVar = (a50.c) this.f973b;
        a50.c cVar2 = (a50.c) this.f974c;
        a50.c cVar3 = (a50.c) this.f975d;
        int i11 = p.$EnumSwitchMapping$0[zVar.ordinal()];
        if (i11 == 1) {
            cVar.l(m0Var);
            cVar3.l(m0Var);
            return;
        }
        if (i11 == 2) {
            cVar2.l(m0Var);
            cVar3.l(m0Var);
            return;
        }
        if (i11 == 3) {
            if (m0Var.f5873i != null) {
                cVar3.l(m0Var);
                return;
            } else {
                cVar.l(m0Var);
                return;
            }
        }
        if (i11 != 4) {
            e40.a.f();
        } else if (m0Var.f5873i != null) {
            cVar3.l(m0Var);
        } else {
            cVar2.l(m0Var);
        }
    }

    @Override // qz.q
    public void accept(Object obj, Object obj2) {
        ba baVar = (ba) ((ca) obj).getService();
        y9 y9Var = new y9((aa) this.f973b, (m) this.f975d);
        String str = (String) this.f974c;
        Parcel parcelL = baVar.L();
        parcelL.writeString(str);
        o5.c(parcelL, y9Var);
        baVar.M(28, parcelL);
    }

    @Override // c20.h
    public int b() {
        int i11 = ((ExtendedFloatingActionButton) this.f975d).f12457o;
        return i11 == -1 ? ((w2.z) this.f973b).b() : (i11 == 0 || i11 == -2) ? ((a50.c) this.f974c).b() : i11;
    }

    @Override // c20.h
    public int c() {
        return ((ExtendedFloatingActionButton) this.f975d).f12452i;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        switch (this.f972a) {
            case 8:
                h hVar = new h(((com.google.android.gms.internal.measurement.b) this.f973b).clone());
                Iterator it = ((ArrayList) this.f975d).iterator();
                while (it.hasNext()) {
                    ((ArrayList) hVar.f975d).add(((com.google.android.gms.internal.measurement.b) it.next()).clone());
                }
                return hVar;
            default:
                return super.clone();
        }
    }

    @Override // tx.m0
    public void d(JSONObject jSONObject) {
        String string;
        Bundle bundle = (Bundle) this.f973b;
        n nVar = (n) this.f974c;
        if (jSONObject != null) {
            try {
                string = jSONObject.getString("id");
            } catch (JSONException e5) {
                u uVarD = nVar.d();
                cy.r rVar = nVar.d().f13586g;
                String message = e5.getMessage();
                ArrayList arrayList = new ArrayList();
                arrayList.add("Caught exception");
                if (message != null) {
                    arrayList.add(message);
                }
                uVarD.c(new t(rVar, cy.s.ERROR, null, TextUtils.join(": ", arrayList), null));
                return;
            }
        } else {
            string = null;
        }
        bundle.putString("com.facebook.platform.extra.USER_ID", string);
        nVar.l(bundle, (cy.r) this.f975d);
    }

    @Override // bg.r
    public void e() {
        ExpandableTextView expandableTextView = (ExpandableTextView) this.f975d;
        ManufacturerItemDetailsActivity manufacturerItemDetailsActivity = (ManufacturerItemDetailsActivity) this.f973b;
        int i11 = ManufacturerItemDetailsActivity.f9137q;
        o oVarG = manufacturerItemDetailsActivity.G();
        cv.i iVar = cv.i.TEMP_ACTION_UNFOLD_ITEM_DESCRIPTION;
        dv.a aVar = dv.a.ITEM_ID;
        ManufacturerItem manufacturerItem = (ManufacturerItem) this.f974c;
        Pair pair = new Pair(aVar, new dv.c(manufacturerItem.getInformation().mo340getItemIdFvU5WIY()));
        dv.a aVar2 = dv.a.STORE_ID;
        String strM370getStoreId7QsYvu8 = mv.d.m(manufacturerItem).m370getStoreId7QsYvu8();
        if (strM370getStoreId7QsYvu8 == null) {
            strM370getStoreId7QsYvu8 = null;
        }
        oVarG.d(iVar, h0.g.E(pair, new Pair(aVar2, new dv.c(strM370getStoreId7QsYvu8))));
        expandableTextView.getViewTreeObserver().addOnPreDrawListener(new en.i(manufacturerItemDetailsActivity, expandableTextView, 0));
    }

    public boolean f(b5.m0 m0Var) {
        return !(m0Var.f5873i == null) && (((m2) ((a50.c) this.f973b).f822b).contains(m0Var) || ((m2) ((a50.c) this.f974c).f822b).contains(m0Var));
    }

    @Override // c20.h
    public ViewGroup.LayoutParams g() {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.f975d;
        int i11 = extendedFloatingActionButton.f12457o;
        if (i11 == 0) {
            i11 = -2;
        }
        int i12 = extendedFloatingActionButton.f12458p;
        return new ViewGroup.LayoutParams(i11, i12 != 0 ? i12 : -2);
    }

    @Override // c20.h
    public int getHeight() {
        int i11 = ((ExtendedFloatingActionButton) this.f975d).f12458p;
        return i11 == -1 ? ((w2.z) this.f973b).getHeight() : (i11 == 0 || i11 == -2) ? ((ExtendedFloatingActionButton) ((a50.c) this.f974c).f822b).getMeasuredHeight() : i11;
    }

    @Override // o0.b
    public boolean h(z1 z1Var) {
        b0.j jVar = new b0.j();
        x0 x0Var = new x0();
        v vVar = (v) this.f973b;
        a50.c cVar = new a50.c(((t0) vVar).f16904a, 1);
        y.b bVar = (y.b) this.f975d;
        b0.l lVar = new b0.l(jVar, x0Var, cVar, bVar, new u0(), new k0(bVar.a()), vVar, null, null);
        o0 o0Var = o0.f26530a;
        o0Var.getClass();
        return ((Boolean) f0.E(kotlin.coroutines.g.f26549a, new x(this, lVar.a(0, z1Var, true, null, null, o0Var, o0Var), null, 13))).booleanValue();
    }

    @Override // tx.m0
    public void i(FacebookException facebookException) {
        n nVar = (n) this.f974c;
        u uVarD = nVar.d();
        cy.r rVar = nVar.d().f13586g;
        String message = facebookException != null ? facebookException.getMessage() : null;
        ArrayList arrayList = new ArrayList();
        arrayList.add("Caught exception");
        if (message != null) {
            arrayList.add(message);
        }
        uVarD.c(new t(rVar, cy.s.ERROR, null, TextUtils.join(": ", arrayList), null));
    }

    public void j(c1.n nVar, Map.Entry entry) {
        c1.n nVar2 = (c1.n) entry.getValue();
        wd.a.p("SurfaceProcessorNode", "     -> outputEdge = " + nVar2);
        m0.g gVar = null;
        m0.g gVar2 = new m0.g(nVar.f6902g.f38402a, ((e1.c) entry.getKey()).f15440d, nVar.f6898c ? (i0) this.f974c : null, ((e1.c) entry.getKey()).f15442f, ((e1.c) entry.getKey()).f15443g);
        int i11 = ((e1.c) entry.getKey()).f15439c;
        nVar2.getClass();
        a.a.t();
        nVar2.a();
        pd.g.n("Consumer can only be linked once.", !nVar2.f6905j);
        nVar2.f6905j = true;
        c1.m mVar = nVar2.l;
        x0.b bVarF = x0.g.f(mVar.c(), new c1.k(nVar2, mVar, i11, gVar2, gVar), w.b.U());
        bVarF.a(new x0.f(0, bVarF, new w2.z(this, nVar2, false, 17)), w.b.U());
    }

    @Override // c20.h
    public int k() {
        return ((ExtendedFloatingActionButton) this.f975d).f12451h;
    }

    public Object m() {
        Object objRemoveLast;
        synchronized (this.f974c) {
            objRemoveLast = ((ArrayDeque) this.f973b).removeLast();
        }
        return objRemoveLast;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.constraintlayout.widget.z n() throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r0 = "GET Request URL: "
            java.lang.String r1 = "FirebaseCrashlytics"
            b40.f.b()
            r2 = 0
            java.lang.Object r3 = r8.f973b     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r4 = r8.f974c     // Catch: java.lang.Throwable -> Lb2
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r3 = l(r3, r4)     // Catch: java.lang.Throwable -> Lad
            java.lang.String r0 = r0.concat(r3)     // Catch: java.lang.Throwable -> Lad
            r4 = 2
            boolean r4 = android.util.Log.isLoggable(r1, r4)     // Catch: java.lang.Throwable -> L23
            if (r4 == 0) goto L26
            android.util.Log.v(r1, r0, r2)     // Catch: java.lang.Throwable -> L23
            goto L26
        L23:
            r0 = move-exception
            goto Lb0
        L26:
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> Lad
            r0.<init>(r3)     // Catch: java.lang.Throwable -> Lad
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Throwable -> Lad
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0     // Catch: java.lang.Throwable -> Lad
            r1 = 10000(0x2710, float:1.4013E-41)
            r0.setReadTimeout(r1)     // Catch: java.lang.Throwable -> L66
            r0.setConnectTimeout(r1)     // Catch: java.lang.Throwable -> L66
            java.lang.String r1 = "GET"
            r0.setRequestMethod(r1)     // Catch: java.lang.Throwable -> L66
            java.lang.Object r1 = r8.f975d     // Catch: java.lang.Throwable -> L66
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L66
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L66
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L66
        L4a:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L66
            if (r3 == 0) goto L68
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L66
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L66
            java.lang.Object r4 = r3.getKey()     // Catch: java.lang.Throwable -> L66
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L66
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L66
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L66
            r0.addRequestProperty(r4, r3)     // Catch: java.lang.Throwable -> L66
            goto L4a
        L66:
            r1 = move-exception
            goto Lb4
        L68:
            r0.connect()     // Catch: java.lang.Throwable -> L66
            int r1 = r0.getResponseCode()     // Catch: java.lang.Throwable -> L66
            java.io.InputStream r3 = r0.getInputStream()     // Catch: java.lang.Throwable -> L66
            if (r3 == 0) goto L9e
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L9b
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L9b
            java.lang.String r5 = "UTF-8"
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L9b
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L9b
            r4 = 8192(0x2000, float:1.148E-41)
            char[] r4 = new char[r4]     // Catch: java.lang.Throwable -> L9b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9b
            r5.<init>()     // Catch: java.lang.Throwable -> L9b
        L8a:
            int r6 = r2.read(r4)     // Catch: java.lang.Throwable -> L9b
            r7 = -1
            if (r6 == r7) goto L96
            r7 = 0
            r5.append(r4, r7, r6)     // Catch: java.lang.Throwable -> L9b
            goto L8a
        L96:
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L9b
            goto L9e
        L9b:
            r1 = move-exception
            r2 = r3
            goto Lb4
        L9e:
            if (r3 == 0) goto La3
            r3.close()
        La3:
            r0.disconnect()
            androidx.constraintlayout.widget.z r0 = new androidx.constraintlayout.widget.z
            r3 = 5
            r0.<init>(r1, r2, r3)
            return r0
        Lad:
            r1 = move-exception
        Lae:
            r0 = r2
            goto Lb4
        Lb0:
            r1 = r0
            goto Lae
        Lb2:
            r0 = move-exception
            goto Lb0
        Lb4:
            if (r2 == 0) goto Lb9
            r2.close()
        Lb9:
            if (r0 == 0) goto Lbe
            r0.disconnect()
        Lbe:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.h.n():androidx.constraintlayout.widget.z");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r2.v(r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o(z70.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ff.a
            if (r0 == 0) goto L13
            r0 = r6
            ff.a r0 = (ff.a) r0
            int r1 = r0.f17615m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17615m = r1
            goto L18
        L13:
            ff.a r0 = new ff.a
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f17614k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f17615m
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            ba0.g.M(r6)
            goto L52
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r6)
            r6 = 0
            return r6
        L31:
            a8.h r2 = r0.f17613j
            ba0.g.M(r6)
            goto L46
        L37:
            ba0.g.M(r6)
            r0.f17613j = r5
            r0.f17615m = r4
            java.lang.Object r6 = r5.t(r0)
            if (r6 != r1) goto L45
            goto L51
        L45:
            r2 = r5
        L46:
            r6 = 0
            r0.f17613j = r6
            r0.f17615m = r3
            java.lang.Object r6 = r2.v(r0)
            if (r6 != r1) goto L52
        L51:
            return r1
        L52:
            kotlin.Unit r6 = kotlin.Unit.f26487a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.h.o(z70.c):java.lang.Object");
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        ((w5) this.f973b).removeCallbacksAndMessages(null);
        d10.g gVar = (d10.g) this.f974c;
        if (task.isSuccessful()) {
            gVar.d(task.getResult());
        } else {
            if (task.l()) {
                ((d10.o) ((se.b) this.f975d).f39010b).q(null);
                return;
            }
            Exception exception = task.getException();
            Objects.requireNonNull(exception);
            gVar.c(exception);
        }
    }

    public void p() {
        ub.a aVar = (ub.a) this.f974c;
        kf.b bVar = (kf.b) this.f975d;
        try {
            xf.a aVarZ = ((ub.a) this.f973b).z();
            bVar.b("Loaded old identity: " + aVarZ);
            String str = aVarZ.f44243a;
            if (str != null) {
                ((t5.a) aVar.f40982c).D("user_id", str);
            }
            String str2 = aVarZ.f44244b;
            if (str2 != null) {
                ((t5.a) aVar.f40982c).D("device_id", str2);
            }
        } catch (Exception e5) {
            bVar.a("Unable to migrate file identity storage: " + e5.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0670  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0396 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x060d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0243  */
    /* JADX WARN: Type inference failed for: r0v108 */
    /* JADX WARN: Type inference failed for: r0v109, types: [int] */
    /* JADX WARN: Type inference failed for: r0v195 */
    /* JADX WARN: Type inference failed for: r0v196 */
    /* JADX WARN: Type inference failed for: r0v197 */
    /* JADX WARN: Type inference failed for: r0v198 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean q() {
        /*
            Method dump skipped, instruction units count: 1675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.h.q():boolean");
    }

    public void r(String str, String str2) {
        ((HashMap) this.f975d).put(str, str2);
    }

    public boolean s() {
        return !(((m2) ((a50.c) this.f973b).f822b).isEmpty() && ((m2) ((a50.c) this.f975d).f822b).isEmpty() && ((m2) ((a50.c) this.f974c).f822b).isEmpty());
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x01c8, code lost:
    
        if (r4.f(r0) == r3) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a5 A[Catch: Exception -> 0x007f, TryCatch #0 {Exception -> 0x007f, blocks: (B:33:0x007b, B:42:0x0097, B:44:0x00a5, B:46:0x00ba), top: B:74:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ba A[Catch: Exception -> 0x007f, TRY_LEAVE, TryCatch #0 {Exception -> 0x007f, blocks: (B:33:0x007b, B:42:0x0097, B:44:0x00a5, B:46:0x00ba), top: B:74:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c8 A[Catch: Exception -> 0x0037, TryCatch #3 {Exception -> 0x0037, blocks: (B:15:0x0032, B:55:0x0107, B:57:0x010d, B:64:0x0139, B:65:0x0169, B:48:0x00c1, B:50:0x00c8, B:54:0x00f3, B:66:0x01a0), top: B:79:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a0 A[Catch: Exception -> 0x0037, TRY_LEAVE, TryCatch #3 {Exception -> 0x0037, blocks: (B:15:0x0032, B:55:0x0107, B:57:0x010d, B:64:0x0139, B:65:0x0169, B:48:0x00c1, B:50:0x00c8, B:54:0x00f3, B:66:0x01a0), top: B:79:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [ff.b, z70.c] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00f3 -> B:55:0x0107). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object t(z70.c r18) {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.h.t(z70.c):java.lang.Object");
    }

    public String toString() {
        switch (this.f972a) {
            case 28:
                String str = (String) this.f975d;
                String str2 = (String) this.f974c;
                StringBuilder sb2 = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.f973b;
                if (uri != null) {
                    sb2.append(" uri=");
                    sb2.append(String.valueOf(uri));
                }
                if (str2 != null) {
                    sb2.append(" action=");
                    sb2.append(str2);
                }
                if (str != null) {
                    sb2.append(" mimetype=");
                    sb2.append(str);
                }
                sb2.append(" }");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008b, code lost:
    
        if (r0.g(r11, r12) == r4) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bf, code lost:
    
        if (r12.d(r11) != r4) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c1, code lost:
    
        return r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r0v1, types: [hf.g] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object u(nf.e r11, z70.c r12) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.h.u(nf.e, z70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b6, code lost:
    
        if (r2.u(r5, r0) != r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072 A[PHI: r2
      0x0072: PHI (r2v5 a8.h) = (r2v3 a8.h), (r2v6 a8.h) binds: [B:24:0x006f, B:17:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080 A[PHI: r2
      0x0080: PHI (r2v7 a8.h) = (r2v5 a8.h), (r2v8 a8.h) binds: [B:27:0x007d, B:16:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e A[PHI: r2
      0x008e: PHI (r2v9 a8.h) = (r2v7 a8.h), (r2v10 a8.h) binds: [B:30:0x008b, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009c A[PHI: r2
      0x009c: PHI (r2v11 a8.h) = (r2v9 a8.h), (r2v12 a8.h) binds: [B:33:0x0099, B:14:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa A[PHI: r2
      0x00aa: PHI (r2v13 a8.h) = (r2v11 a8.h), (r2v14 a8.h) binds: [B:36:0x00a7, B:13:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object v(z70.c r5) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.h.v(z70.c):java.lang.Object");
    }

    public void w(int i11, String str) {
        str.getClass();
        w wVar = (w) this.f974c;
        String str2 = ((mg.a) ((ArrayList) this.f975d).get(i11)).f29928a;
        wVar.getClass();
        str2.getClass();
        wVar.e(cv.i.SCREEN_NPS_SURVEY, h0.g.E(new Pair(dv.a.SOURCE, new dv.c("Delivery_Tab")), new Pair(dv.a.NPS_STEP, new dv.c(str)), new Pair(dv.a.ORDER_ID, new dv.c(str2))));
    }

    public void x(Activity activity, cb.h hVar) {
        WeakHashMap weakHashMap = (WeakHashMap) this.f975d;
        activity.getClass();
        ReentrantLock reentrantLock = (ReentrantLock) this.f974c;
        reentrantLock.lock();
        try {
            if (Intrinsics.areEqual(hVar, (cb.h) weakHashMap.get(activity))) {
                return;
            }
            reentrantLock.unlock();
            Iterator it = ((fb.k) ((se.b) this.f973b).f39010b).f17544b.iterator();
            it.getClass();
            while (it.hasNext()) {
                fb.j jVar = (fb.j) it.next();
                if (Intrinsics.areEqual(jVar.f17538a, activity)) {
                    jVar.f17540c = hVar;
                    jVar.f17539b.accept(hVar);
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void y(androidx.lifecycle.w wVar) {
        k1 k1Var = (k1) this.f975d;
        if (k1Var != null) {
            k1Var.run();
        }
        k1 k1Var2 = new k1((androidx.lifecycle.f0) this.f973b, wVar);
        this.f975d = k1Var2;
        ((Handler) this.f974c).postAtFrontOfQueue(k1Var2);
    }

    public void z(wy.i iVar, int i11, boolean z11) {
        cz.a aVar = (cz.a) this.f975d;
        Context context = (Context) this.f973b;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName(ArticleContentView.UTF_8_ENCODING_TYPE)));
        String str = iVar.f43571a;
        adler32.update(str.getBytes(Charset.forName(ArticleContentView.UTF_8_ENCODING_TYPE)));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        ty.d dVar = iVar.f43573c;
        adler32.update(byteBufferAllocate.putInt(gz.a.a(dVar)).array());
        byte[] bArr = iVar.f43572b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z11) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i12 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i12 >= i11) {
                        w0.e.r(iVar, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                        return;
                    }
                }
            }
        }
        Cursor cursorRawQuery = ((dz.g) this.f974c).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(gz.a.a(dVar))});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(aVar.a(dVar, jLongValue, i11));
            Set set = ((cz.b) aVar.f13607b.get(dVar)).f13610c;
            if (set.contains(cz.c.NETWORK_UNMETERED)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(cz.c.DEVICE_CHARGING)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(cz.c.DEVICE_IDLE)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i11);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", gz.a.a(dVar));
            if (bArr != null) {
                persistableBundle.putString(InAppMessageBase.EXTRAS, Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {iVar, Integer.valueOf(value), Long.valueOf(aVar.a(dVar, jLongValue, i11)), lValueOf, Integer.valueOf(i11)};
            String strConcat = "TRuntime.".concat("JobInfoScheduler");
            if (Log.isLoggable(strConcat, 3)) {
                Log.d(strConcat, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th2) {
            cursorRawQuery.close();
            throw th2;
        }
    }

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, int i11) {
        this.f972a = i11;
        this.f973b = obj;
        this.f974c = obj2;
        this.f975d = obj3;
    }

    public h(com.google.android.gms.internal.measurement.u0 u0Var, String str) {
        this.f972a = 11;
        this.f973b = m30.d.f29504c;
        this.f974c = h0.C(new i5(4, this, u0Var));
        this.f975d = h0.C(new i5(3, this, str));
    }

    public h(com.google.android.gms.internal.measurement.b bVar) {
        this.f972a = 8;
        this.f973b = bVar;
        this.f974c = bVar.clone();
        this.f975d = new ArrayList();
    }

    public h(ub.a aVar, ub.a aVar2, kf.b bVar) {
        this.f972a = 25;
        aVar.getClass();
        aVar2.getClass();
        bVar.getClass();
        this.f973b = aVar;
        this.f974c = aVar2;
        this.f975d = bVar;
    }

    public h(hf.g gVar, hf.g gVar2, kf.b bVar) {
        this.f972a = 24;
        gVar.getClass();
        bVar.getClass();
        this.f973b = gVar;
        this.f974c = gVar2;
        this.f975d = bVar;
    }

    public h(ym.u uVar, w wVar) {
        this.f972a = 20;
        wVar.getClass();
        this.f973b = uVar;
        this.f974c = wVar;
        this.f975d = new ArrayList();
    }

    public h(SystemForegroundService systemForegroundService) {
        this.f972a = 2;
        this.f973b = new androidx.lifecycle.f0(systemForegroundService, true);
        this.f974c = new Handler(Looper.getMainLooper());
    }

    public h(String str, HashMap map) {
        this.f972a = 22;
        this.f973b = str;
        this.f974c = map;
        this.f975d = new HashMap();
    }

    public /* synthetic */ h(int i11, boolean z11) {
        this.f972a = i11;
    }

    public h(y yVar) {
        this.f972a = 4;
        this.f974c = new Object();
        this.f973b = new ArrayDeque(3);
        this.f975d = yVar;
    }

    public h(FirebaseMessagingService firebaseMessagingService, a50.c cVar, ExecutorService executorService) {
        this.f972a = 13;
        this.f973b = executorService;
        this.f974c = firebaseMessagingService;
        this.f975d = cVar;
    }

    public h(i0 i0Var, c1.e eVar) {
        this.f972a = 6;
        this.f974c = i0Var;
        this.f973b = eVar;
    }

    public h(s1 s1Var, i80.n nVar) {
        this.f972a = 19;
        this.f973b = s1Var;
        this.f974c = nVar;
        this.f975d = d90.f.f14786a;
    }

    public h(se.b bVar) {
        this.f972a = 23;
        this.f973b = bVar;
        this.f974c = new ReentrantLock();
        this.f975d = new WeakHashMap();
    }

    public h(ExtendedFloatingActionButton extendedFloatingActionButton, w2.z zVar, a50.c cVar) {
        this.f972a = 7;
        this.f975d = extendedFloatingActionButton;
        this.f973b = zVar;
        this.f974c = cVar;
    }

    public h(Function0 function0, a0 a0Var, u3.d dVar) {
        this.f972a = 26;
        this.f973b = function0;
        this.f974c = a0Var;
        this.f975d = dVar;
    }

    public h(ag.i iVar, ag.c cVar) {
        this.f972a = 1;
        this.f973b = iVar;
        this.f974c = cVar;
    }

    public h(int i11) {
        this.f972a = i11;
        switch (i11) {
            case 5:
                this.f973b = new a50.c(7);
                this.f974c = new a50.c(7);
                this.f975d = new a50.c(7);
                break;
            case 8:
                this.f973b = new com.google.android.gms.internal.measurement.b("", 0L, null);
                this.f974c = new com.google.android.gms.internal.measurement.b("", 0L, null);
                this.f975d = new ArrayList();
                break;
            case 12:
                this.f973b = new AtomicBoolean(false);
                new ConcurrentHashMap();
                this.f974c = new ConcurrentHashMap();
                new ConcurrentHashMap();
                this.f975d = new ConcurrentHashMap();
                break;
            case 29:
                long[] jArr = g1.f35760a;
                this.f973b = new q1.t0();
                break;
            default:
                this.f973b = new String[8][];
                this.f974c = new int[8][];
                this.f975d = new int[8][];
                break;
        }
    }
}
