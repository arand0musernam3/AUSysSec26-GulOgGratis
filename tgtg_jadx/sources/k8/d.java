package k8;

import a3.i3;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.Choreographer;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.c1;
import app.cash.paykit.core.utils.ThreadPurpose;
import com.app.tgtg.R;
import com.app.tgtg.feature.orderview.manufacture.ManufacturerOrderActivity;
import com.app.tgtg.feature.recipegenerator.RecipeGeneratorActivity;
import com.google.android.gms.location.LocationRequest;
import com.google.common.util.concurrent.ListenableFuture;
import ft.l;
import ft.o;
import j4.s;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import jb.u;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.w0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import l8.p;
import l8.x;
import l8.z;
import m00.w;
import m3.q2;
import m3.y0;
import m5.d0;
import m90.a1;
import m90.b1;
import m90.m0;
import m90.n1;
import mv.b0;
import n3.l0;
import o30.a0;
import o30.d1;
import o30.h0;
import o30.i0;
import o30.o0;
import o30.r0;
import o80.r;
import oa0.n0;
import oa0.u0;
import q1.t0;
import q90.g0;
import q90.p0;
import q90.q0;
import q90.s0;
import q90.t;
import q90.v0;
import qz.k;
import qz.m;
import qz.q;
import retrofit2.HttpException;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements p, mg.i, q90.b, q, m3.g, n1, b1, l0, a0, o5.d, oa0.f, oa0.g, q90.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f26134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f26135c;

    public d(int i11) {
        this.f26133a = i11;
        switch (i11) {
            case 4:
                this.f26134b = new Rect();
                this.f26135c = new Rect();
                break;
            case 5:
                this.f26134b = new d(new ky.p(1));
                this.f26135c = new d(new l50.a(0));
                break;
            case 13:
                this.f26134b = new t0();
                this.f26135c = new t0();
                break;
            case 23:
                this.f26134b = new AtomicReference(r0.f31913b);
                this.f26135c = new j30.g(17, (char) 0);
                break;
            case 24:
                break;
            default:
                this.f26134b = Choreographer.getInstance();
                this.f26135c = Looper.myLooper();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [x70.c] */
    /* JADX WARN: Type inference failed for: r0v3, types: [q90.g0] */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // q90.b
    public g0 a(s0 s0Var, p0 p0Var) {
        g0 g0Var = 0;
        g0Var = 0;
        if (!((o) this.f26134b).a() || r.f(o80.o.d(p0Var, new k9.f(18))) > 1) {
            return null;
        }
        synchronized (this) {
            if (mv.d.w((jt.j) this.f26135c, (o) this.f26134b)) {
                o oVar = (o) this.f26134b;
                if (oVar.f17955e == null) {
                    oVar.f17955e = (String) f0.E(kotlin.coroutines.g.f26549a, new l(oVar, g0Var, 0));
                }
                String str = oVar.f17955e;
                String strConcat = str != null ? "Bearer ".concat(str) : null;
                if (strConcat != null) {
                    androidx.lifecycle.n1 n1VarB = p0Var.f36582a.b();
                    n1VarB.u("Authorization", strConcat);
                    g0Var = new g0(n1VarB);
                }
            }
        }
        return g0Var;
    }

    @Override // qz.q
    public void accept(Object obj, Object obj2) {
        m00.g gVar;
        pz.d dVar;
        d10.g gVar2 = (d10.g) obj2;
        m00.h hVar = (m00.h) obj;
        i3 i3Var = (i3) this.f26134b;
        LocationRequest locationRequest = (LocationRequest) this.f26135c;
        hVar.getClass();
        m mVarZ = i3Var.z();
        k kVar = mVarZ.f37368b;
        Objects.requireNonNull(kVar);
        pz.d[] availableFeatures = hVar.getAvailableFeatures();
        boolean z11 = false;
        if (availableFeatures != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= availableFeatures.length) {
                    dVar = null;
                    break;
                }
                dVar = availableFeatures[i11];
                if ("location_updates_with_callback".equals(dVar.f35651a)) {
                    break;
                } else {
                    i11++;
                }
            }
            if (dVar != null && dVar.d() >= 1) {
                z11 = true;
            }
        }
        synchronized (hVar.f28662b) {
            try {
                m00.g gVar3 = (m00.g) hVar.f28662b.get(kVar);
                if (gVar3 == null || z11) {
                    m00.g gVar4 = new m00.g(i3Var);
                    hVar.f28662b.put(kVar, gVar4);
                    gVar = gVar4;
                } else {
                    i3 i3Var2 = gVar3.f28660h;
                    synchronized (i3Var2) {
                        m mVar = (m) i3Var2.f395b;
                        if (mVar != mVarZ) {
                            mVar.f37368b = null;
                            i3Var2.f395b = mVarZ;
                        }
                    }
                    gVar = gVar3;
                    gVar3 = null;
                }
                if (z11) {
                    w wVar = (w) hVar.getService();
                    m00.j jVar = new m00.j(2, gVar3 == null ? null : gVar3, gVar, null, kVar.a());
                    m00.e eVar = new m00.e(null, gVar2);
                    Parcel parcelL = wVar.L();
                    m00.b.b(parcelL, jVar);
                    m00.b.b(parcelL, locationRequest);
                    parcelL.writeStrongBinder(eVar);
                    wVar.M(88, parcelL);
                } else {
                    m00.g gVar5 = gVar;
                    w wVar2 = (w) hVar.getService();
                    m00.l lVar = new m00.l(1, new m00.k(locationRequest, null, false, false, false, false, LongCompanionObject.MAX_VALUE), null, gVar5, null, new m00.c(gVar2, gVar5), kVar.a());
                    Parcel parcelL2 = wVar2.L();
                    m00.b.b(parcelL2, lVar);
                    wVar2.M(59, parcelL2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // q90.i
    public void b(q90.h hVar, p0 p0Var) {
        oa0.g gVar = (oa0.g) this.f26134b;
        oa0.w wVar = (oa0.w) this.f26135c;
        try {
            try {
                gVar.m(wVar, wVar.c(p0Var));
            } catch (Throwable th2) {
                u0.r(th2);
                th2.printStackTrace();
            }
        } catch (Throwable th3) {
            u0.r(th3);
            try {
                gVar.p(wVar, th3);
            } catch (Throwable th4) {
                u0.r(th4);
                th4.printStackTrace();
            }
        }
    }

    @Override // mg.i
    public void c(int i11) {
        ((ManufacturerOrderActivity) this.f26135c).g0((mg.a) ((ArrayList) this.f26134b).get(i11), true);
    }

    @Override // o30.a0
    public ListenableFuture call() {
        i0 i0Var = (i0) this.f26134b;
        int i11 = i0.f31887e;
        if (i0Var.compareAndSet(h0.NOT_RUN, h0.STARTED)) {
            return ((a0) this.f26135c).call();
        }
        o30.p0 p0Var = o30.p0.f31903h;
        return p0Var != null ? p0Var : new o30.p0();
    }

    @Override // m3.g
    public void cancel() {
        if (((u3.a) this.f26135c).compareAndSet(1, 1)) {
            return;
        }
        ((lw.o) this.f26134b).invoke();
    }

    @Override // o5.d
    public int d(int i11) {
        CharSequence charSequence = (CharSequence) this.f26134b;
        do {
            i11 = ((b0) this.f26135c).y(i11);
            if (i11 == -1 || i11 == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i11)));
        return i11;
    }

    @Override // q90.i
    public void e(q90.h hVar, IOException iOException) {
        try {
            ((oa0.g) this.f26134b).p((oa0.w) this.f26135c, iOException);
        } catch (Throwable th2) {
            u0.r(th2);
            th2.printStackTrace();
        }
    }

    @Override // o5.d
    public int f(int i11) {
        do {
            i11 = ((b0) this.f26135c).H(i11);
            if (i11 == -1 || i11 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f26134b).charAt(i11 - 1)));
        return i11;
    }

    @Override // l8.p
    public Object g() {
        return (z) this.f26134b;
    }

    @Override // l8.p
    public boolean h(CharSequence charSequence, int i11, int i12, l8.w wVar) {
        if ((wVar.f27493c & 4) > 0) {
            return true;
        }
        if (((z) this.f26134b) == null) {
            this.f26134b = new z(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((l50.a) this.f26135c).getClass();
        ((z) this.f26134b).setSpan(new x(wVar), i11, i12, 33);
        return true;
    }

    @Override // oa0.f
    public Type i() {
        return (Type) this.f26134b;
    }

    @Override // n3.l0
    public List j(Integer num) {
        List listJ = ((l0) this.f26134b).j(null);
        q2 q2Var = (q2) this.f26135c;
        int i11 = q2Var.f29402v;
        return i11 < 0 ? listJ : CollectionsKt.d0(listJ, a4.c.a(q2Var, num, i11, Integer.valueOf(q2Var.G(i11, q2Var.f29383b))));
    }

    @Override // m90.b1
    public Object k(KClass kClass, ArrayList arrayList) {
        Object pVar;
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f26135c;
        Class clsV = y9.w.v(kClass);
        Object a1Var = concurrentHashMap.get(clsV);
        if (a1Var == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsV, (a1Var = new a1()))) != null) {
            a1Var = objPutIfAbsent;
        }
        a1 a1Var2 = (a1) a1Var;
        ArrayList arrayList2 = new ArrayList(e0.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new m0((KType) it.next()));
        }
        ConcurrentHashMap concurrentHashMap2 = a1Var2.f29756a;
        Object obj = concurrentHashMap2.get(arrayList2);
        if (obj == null) {
            try {
                u70.o oVar = u70.q.f40850b;
                pVar = (KSerializer) ((Function2) this.f26134b).invoke(kClass, arrayList);
            } catch (Throwable th2) {
                u70.o oVar2 = u70.q.f40850b;
                pVar = new u70.p(th2);
            }
            u70.q qVar = new u70.q(pVar);
            Object objPutIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList2, qVar);
            obj = objPutIfAbsent2 == null ? qVar : objPutIfAbsent2;
        }
        return ((u70.q) obj).f40851a;
    }

    @Override // oa0.f
    public Object l(oa0.w wVar) {
        Executor executor = (Executor) this.f26135c;
        return executor == null ? wVar : new oa0.l(executor, wVar);
    }

    @Override // oa0.g
    public void m(oa0.d dVar, n0 n0Var) {
        switch (this.f26133a) {
            case 27:
                ((oa0.l) this.f26135c).f32310a.execute(new a40.q(this, (oa0.g) this.f26134b, n0Var, 24));
                break;
            default:
                oa0.g gVar = (oa0.g) this.f26134b;
                ot.a aVar = (ot.a) this.f26135c;
                p0 p0Var = n0Var.f32351a;
                if (!p0Var.f36597q) {
                    u70.o oVar = u70.q.f40850b;
                    HttpException httpException = new HttpException(n0Var);
                    qg.a aVarA = ot.a.a(aVar, httpException);
                    Throwable th2 = httpException;
                    if (aVarA != null) {
                        th2 = aVarA;
                    }
                    gVar.m(aVar, n0.b(new u70.q(new u70.p(th2))));
                } else {
                    Object obj = n0Var.f32352b;
                    if (obj == null) {
                        u70.o oVar2 = u70.q.f40850b;
                        gVar.m(aVar, n0.b(new u70.q(new u70.p(new HttpException(n0Var)))));
                    } else {
                        int i11 = p0Var.f36585d;
                        u70.q qVar = new u70.q(obj);
                        if (i11 >= 200 && i11 < 300) {
                            q0 q0Var = q90.r0.f36605a;
                            ArrayList arrayList = new ArrayList(20);
                            q90.f0 f0Var = q90.f0.HTTP_1_1;
                            f0Var.getClass();
                            androidx.lifecycle.n1 n1Var = new androidx.lifecycle.n1();
                            n1Var.D("http://localhost/");
                            g0 g0Var = new g0(n1Var);
                            if (i11 < 0) {
                                e40.a.g(s.f(i11, "code < 0: "));
                            } else {
                                gVar.m(aVar, n0.a(qVar, new p0(g0Var, f0Var, "Response.success()", i11, null, new t((String[]) arrayList.toArray(new String[0])), q0Var, null, null, null, null, 0L, 0L, null, v0.f36632p0)));
                            }
                        } else {
                            i4.a.f(s.f(i11, "code < 200 or >= 300: "));
                        }
                    }
                }
                break;
        }
    }

    @Override // o5.d
    public int n(int i11) {
        do {
            i11 = ((b0) this.f26135c).H(i11);
            if (i11 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f26134b).charAt(i11)));
        return i11;
    }

    @Override // o5.d
    public int o(int i11) {
        do {
            i11 = ((b0) this.f26135c).y(i11);
            if (i11 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f26134b).charAt(i11 - 1)));
        return i11;
    }

    @Override // oa0.g
    public void p(oa0.d dVar, Throwable th2) {
        switch (this.f26133a) {
            case 27:
                ((oa0.l) this.f26135c).f32310a.execute(new a40.q(this, (oa0.g) this.f26134b, th2, 25));
                break;
            default:
                oa0.g gVar = (oa0.g) this.f26134b;
                ot.a aVar = (ot.a) this.f26135c;
                u70.o oVar = u70.q.f40850b;
                if (th2 instanceof HttpException) {
                    qg.a aVarA = ot.a.a(aVar, (HttpException) th2);
                    if (aVarA != null) {
                        th2 = aVarA;
                    }
                } else if (th2 instanceof SerializationException) {
                    sa0.a.f38953a.d(th2);
                }
                gVar.m(aVar, n0.b(new u70.q(new u70.p(th2))));
                break;
        }
    }

    @Override // mg.i
    public void q(mg.a aVar, int i11) {
        aVar.getClass();
        aVar.f29934g = true;
        ((ArrayList) this.f26134b).set(i11, aVar);
        ManufacturerOrderActivity manufacturerOrderActivity = (ManufacturerOrderActivity) this.f26135c;
        manufacturerOrderActivity.getClass();
        manufacturerOrderActivity.f9173k = aVar;
    }

    @Override // m90.n1
    public KSerializer r(KClass kClass) {
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f26135c;
        Class clsV = y9.w.v(kClass);
        Object kVar = concurrentHashMap.get(clsV);
        if (kVar == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsV, (kVar = new m90.k((KSerializer) ((Function1) this.f26134b).invoke(kClass))))) != null) {
            kVar = objPutIfAbsent;
        }
        return ((m90.k) kVar).f29817a;
    }

    public void s(h50.f fVar) {
        ((ConcurrentHashMap) this.f26134b).put(((l50.b) this.f26135c).d(fVar), fVar);
    }

    public Thread t(ThreadPurpose threadPurpose, Runnable runnable) {
        threadPurpose.getClass();
        v(threadPurpose);
        Thread thread = new Thread(runnable, threadPurpose.name());
        ((LinkedHashMap) this.f26135c).put(threadPurpose, thread);
        return thread;
    }

    public String toString() {
        switch (this.f26133a) {
            case 22:
                return ((a0) this.f26135c).toString();
            default:
                return super.toString();
        }
    }

    public Object u(String str) {
        Pair[] pairArr;
        str.getClass();
        c1 c1Var = (c1) this.f26134b;
        Map mapB = w0.b(new Pair(str, c1Var.a(str)));
        if (mapB.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapB.size());
            for (Map.Entry entry : mapB.entrySet()) {
                arrayList.add(new Pair((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleX = u.x((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Object obj = ((LinkedHashMap) this.f26135c).get(str);
        if (obj != null) {
            return ((g9.q0) obj).a(bundleX, str);
        }
        e40.a.i("Failed to find type for ", str, " when decoding ", c1Var);
        return null;
    }

    public void v(ThreadPurpose threadPurpose) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f26135c;
        threadPurpose.getClass();
        try {
            Thread thread = (Thread) linkedHashMap.get(threadPurpose);
            if (thread != null) {
                thread.interrupt();
            }
        } catch (Exception e5) {
            ((jb.b) this.f26134b).r("SingleThreadManager", "Failed to interrupt thread: " + threadPurpose.name(), e5);
        } finally {
            linkedHashMap.put(threadPurpose, null);
        }
    }

    public void w(boolean z11) {
        pg.i iVar = (pg.i) this.f26134b;
        if (z11) {
            View view = iVar.D;
            view.getClass();
            view.setVisibility(8);
            iVar.f34899v.setBackgroundColor(iVar.f986f.getContext().getColor(R.color.neutral_60));
            iVar.C.setTextColor(iVar.f986f.getContext().getColor(R.color.neutral_60));
            TextView textView = iVar.f34900w;
            textView.getClass();
            textView.setVisibility(8);
            TextView textView2 = iVar.f34898u;
            textView2.getClass();
            textView2.setVisibility(8);
            TextView textView3 = iVar.B;
            textView3.getClass();
            textView3.setVisibility(0);
            LinearLayout linearLayout = iVar.A;
            linearLayout.getClass();
            linearLayout.setVisibility(0);
            x(true);
            return;
        }
        View view2 = iVar.D;
        view2.getClass();
        view2.setVisibility(8);
        iVar.f34899v.setBackgroundColor(iVar.f986f.getContext().getColor(R.color.primary_30));
        iVar.C.setTextColor(iVar.f986f.getContext().getColor(R.color.primary_30));
        TextView textView4 = iVar.f34900w;
        textView4.getClass();
        textView4.setVisibility(0);
        TextView textView5 = iVar.f34898u;
        textView5.getClass();
        textView5.setVisibility(0);
        TextView textView6 = iVar.B;
        textView6.getClass();
        textView6.setVisibility(8);
        LinearLayout linearLayout2 = iVar.A;
        linearLayout2.getClass();
        linearLayout2.setVisibility(8);
        x(false);
    }

    public void x(boolean z11) {
        pg.i iVar = (pg.i) this.f26134b;
        iVar.f34903z.f34922b.setVisibility(z11 ? 0 : 8);
        iVar.f34903z.f34923c.setVisibility(z11 ? 0 : 8);
    }

    public ListenableFuture y(a0 a0Var, Executor executor) {
        executor.getClass();
        i0 i0Var = new i0(h0.NOT_RUN);
        i0Var.f31889b = executor;
        i0Var.f31888a = this;
        d dVar = new d(22, i0Var, a0Var);
        o30.b1 b1Var = new o30.b1();
        ListenableFuture listenableFuture = (ListenableFuture) ((AtomicReference) this.f26134b).getAndSet(b1Var);
        d1 d1Var = new d1();
        d1Var.f31868i = new o30.c1(d1Var, dVar);
        listenableFuture.a(d1Var, i0Var);
        ListenableFuture listenableFutureE = o0.e(d1Var);
        androidx.activity.p pVar = new androidx.activity.p(d1Var, b1Var, listenableFuture, listenableFutureE, i0Var, 6);
        o30.g0 g0Var = o30.g0.INSTANCE;
        listenableFutureE.a(pVar, g0Var);
        d1Var.a(pVar, g0Var);
        return listenableFutureE;
    }

    public void z(m3.a1 a1Var) {
        t0 t0Var = (t0) this.f26134b;
        Object objD = ((t0) this.f26135c).d(a1Var);
        if (objD != null) {
            if (!(objD instanceof q1.o0)) {
                o3.a.c(t0Var, (y0) objD, new jd.a(a1Var, 24));
                return;
            }
            q1.b1 b1Var = (q1.b1) objD;
            Object[] objArr = b1Var.f35721a;
            int i11 = b1Var.f35722b;
            for (int i12 = 0; i12 < i11; i12++) {
                Object obj = objArr[i12];
                obj.getClass();
                o3.a.c(t0Var, (y0) obj, new jd.a(a1Var, 24));
            }
        }
    }

    public /* synthetic */ d(oa0.d dVar, oa0.g gVar, int i11) {
        this.f26133a = i11;
        this.f26135c = dVar;
        this.f26134b = gVar;
    }

    public d(RecipeGeneratorActivity recipeGeneratorActivity) {
        this.f26133a = 18;
        this.f26134b = new d0(16);
        this.f26135c = recipeGeneratorActivity.registerForActivityResult(new i.a(), new mp.a(this, 1));
    }

    public d(jt.i iVar, o oVar) {
        this.f26133a = 10;
        iVar.getClass();
        oVar.getClass();
        this.f26134b = oVar;
        this.f26135c = (jt.j) ((jt.h) iVar).b(jt.j.class, jt.c.TOKEN);
    }

    public d(jb.b bVar) {
        this.f26133a = 1;
        bVar.getClass();
        this.f26134b = bVar;
        this.f26135c = new LinkedHashMap();
    }

    public d(pg.i iVar, mm.b bVar) {
        this.f26133a = 21;
        iVar.getClass();
        bVar.getClass();
        this.f26134b = iVar;
        this.f26135c = bVar;
    }

    public d(lw.o oVar) {
        this.f26133a = 14;
        this.f26134b = oVar;
        this.f26135c = new u3.a(0);
    }

    public d(a30.j jVar, k50.a aVar, k50.b bVar) {
        this.f26133a = 7;
        com.google.firebase.messaging.a0 a0Var = new com.google.firebase.messaging.a0(aVar, bVar, new d(5));
        this.f26134b = jVar;
        this.f26135c = a0Var;
    }

    public d(l50.b bVar) {
        this.f26133a = 6;
        this.f26134b = new ConcurrentHashMap();
        this.f26135c = bVar;
    }

    public d(Function1 function1) {
        this.f26133a = 16;
        this.f26134b = function1;
        this.f26135c = new ConcurrentHashMap();
    }

    public d(c1 c1Var, LinkedHashMap linkedHashMap) {
        this.f26133a = 15;
        c1Var.getClass();
        this.f26134b = c1Var;
        this.f26135c = linkedHashMap;
    }

    public d(Function2 function2) {
        this.f26133a = 17;
        this.f26134b = function2;
        this.f26135c = new ConcurrentHashMap();
    }

    public /* synthetic */ d(int i11, Object obj, Object obj2) {
        this.f26133a = i11;
        this.f26134b = obj;
        this.f26135c = obj2;
    }

    public d(EditText editText) {
        this.f26133a = 20;
        this.f26134b = editText;
        n8.i iVar = new n8.i(editText);
        this.f26135c = iVar;
        editText.addTextChangedListener(iVar);
        if (n8.a.f30685b == null) {
            synchronized (n8.a.f30684a) {
                try {
                    if (n8.a.f30685b == null) {
                        n8.a aVar = new n8.a();
                        try {
                            n8.a.f30686c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, n8.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        n8.a.f30685b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(n8.a.f30685b);
    }
}
