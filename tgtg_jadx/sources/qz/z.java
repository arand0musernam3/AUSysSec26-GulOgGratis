package qz;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.internal.measurement.w5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class z implements com.google.android.gms.common.api.m, com.google.android.gms.common.api.n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.google.android.gms.common.api.f f37403h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a f37404i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final oz.m f37405j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f37407m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j0 f37408n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f37409o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f37413s;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedList f37402g = new LinkedList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final HashSet f37406k = new HashSet();
    public final HashMap l = new HashMap();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayList f37410p = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public pz.b f37411q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f37412r = 0;

    public z(g gVar, com.google.android.gms.common.api.l lVar) {
        this.f37413s = gVar;
        w5 w5Var = gVar.f37348n;
        com.google.android.gms.common.api.f fVarZaa = lVar.zaa(w5Var.getLooper(), this);
        this.f37403h = fVarZaa;
        this.f37404i = lVar.getApiKey();
        this.f37405j = new oz.m(9);
        this.f37407m = lVar.zab();
        if (fVarZaa.requiresSignIn()) {
            this.f37408n = lVar.zac(gVar.f37340e, w5Var);
        } else {
            this.f37408n = null;
        }
    }

    @Override // qz.f
    public final void C() {
        g gVar = this.f37413s;
        if (Looper.myLooper() == gVar.f37348n.getLooper()) {
            c();
        } else {
            gVar.f37348n.post(new a8.f(this, 11));
        }
    }

    @Override // qz.n
    public final void a(pz.b bVar) {
        o(bVar, null);
    }

    @Override // qz.f
    public final void b(int i11) {
        g gVar = this.f37413s;
        if (Looper.myLooper() == gVar.f37348n.getLooper()) {
            d(i11);
        } else {
            gVar.f37348n.post(new e7.a(this, i11, 4));
        }
    }

    public final void c() {
        com.google.android.gms.common.api.f fVar = this.f37403h;
        g gVar = this.f37413s;
        com.google.android.gms.common.internal.i0.d(gVar.f37348n);
        this.f37411q = null;
        l(pz.b.f35642f);
        if (this.f37409o) {
            w5 w5Var = gVar.f37348n;
            a aVar = this.f37404i;
            w5Var.removeMessages(11, aVar);
            gVar.f37348n.removeMessages(9, aVar);
            this.f37409o = false;
        }
        Iterator it = this.l.values().iterator();
        while (it.hasNext()) {
            o oVar = ((g0) it.next()).f37350a;
            if (m(oVar.f37376b) != null) {
                it.remove();
            } else {
                try {
                    ((q) ((h0) oVar).f37353e.f5849c).accept(fVar, new d10.g());
                } catch (DeadObjectException unused) {
                    b(3);
                    fVar.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException e5) {
                    e = e5;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                } catch (RuntimeException e11) {
                    e = e11;
                    Log.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                }
            }
        }
        f();
        j();
    }

    public final void d(int i11) {
        com.google.android.gms.common.internal.i0.d(this.f37413s.f37348n);
        this.f37411q = null;
        this.f37409o = true;
        String lastDisconnectMessage = this.f37403h.getLastDisconnectMessage();
        oz.m mVar = this.f37405j;
        mVar.getClass();
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i11 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i11 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (lastDisconnectMessage != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(lastDisconnectMessage);
        }
        mVar.B(new Status(20, sb2.toString(), null, null), true);
        a aVar = this.f37404i;
        g gVar = this.f37413s;
        w5 w5Var = gVar.f37348n;
        w5Var.sendMessageDelayed(Message.obtain(w5Var, 9, aVar), 5000L);
        w5 w5Var2 = gVar.f37348n;
        w5Var2.sendMessageDelayed(Message.obtain(w5Var2, 11, aVar), 120000L);
        SparseIntArray sparseIntArray = (SparseIntArray) gVar.f37342g.f43083b;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        Iterator it = this.l.values().iterator();
        while (it.hasNext()) {
            ((g0) it.next()).f37352c.run();
        }
    }

    public final boolean e(pz.b bVar) {
        synchronized (g.f37334r) {
            try {
                g gVar = this.f37413s;
                if (gVar.f37346k == null || !gVar.l.contains(this.f37404i)) {
                    return false;
                }
                w wVar = gVar.f37346k;
                int i11 = this.f37407m;
                wVar.getClass();
                p0 p0Var = new p0(bVar, i11);
                AtomicReference atomicReference = wVar.f37394c;
                while (true) {
                    if (atomicReference.compareAndSet(null, p0Var)) {
                        wVar.f37395d.post(new x0.f(wVar, p0Var));
                        break;
                    }
                    if (atomicReference.get() != null) {
                        break;
                    }
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f() {
        LinkedList linkedList = this.f37402g;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            o0 o0Var = (o0) arrayList.get(i11);
            if (!this.f37403h.isConnected()) {
                return;
            }
            if (g(o0Var)) {
                linkedList.remove(o0Var);
            }
        }
    }

    public final boolean g(o0 o0Var) {
        if (!(o0Var instanceof e0)) {
            oz.m mVar = this.f37405j;
            com.google.android.gms.common.api.f fVar = this.f37403h;
            o0Var.c(mVar, fVar.requiresSignIn());
            try {
                o0Var.d(this);
                return true;
            } catch (DeadObjectException unused) {
                b(1);
                fVar.disconnect("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        e0 e0Var = (e0) o0Var;
        pz.d dVarM = m(e0Var.f(this));
        if (dVarM == null) {
            oz.m mVar2 = this.f37405j;
            com.google.android.gms.common.api.f fVar2 = this.f37403h;
            o0Var.c(mVar2, fVar2.requiresSignIn());
            try {
                o0Var.d(this);
                return true;
            } catch (DeadObjectException unused2) {
                b(1);
                fVar2.disconnect("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        String name = this.f37403h.getClass().getName();
        String str = dVarM.f35651a;
        long jD = dVarM.d();
        int length = name.length();
        StringBuilder sb2 = new StringBuilder(length + 53 + String.valueOf(str).length() + 2 + String.valueOf(jD).length() + 2);
        j4.s.A(sb2, name, " could not execute call because it requires feature (", str, ", ");
        sb2.append(jD);
        sb2.append(").");
        Log.w("GoogleApiManager", sb2.toString());
        g gVar = this.f37413s;
        if (!gVar.f37349o || !e0Var.g(this)) {
            e0Var.b(new UnsupportedApiCallException(dVarM));
            return true;
        }
        a0 a0Var = new a0(this.f37404i, dVarM);
        ArrayList arrayList = this.f37410p;
        int iIndexOf = arrayList.indexOf(a0Var);
        if (iIndexOf >= 0) {
            a0 a0Var2 = (a0) arrayList.get(iIndexOf);
            gVar.f37348n.removeMessages(15, a0Var2);
            gVar.f37348n.sendMessageDelayed(Message.obtain(gVar.f37348n, 15, a0Var2), 5000L);
            return false;
        }
        arrayList.add(a0Var);
        gVar.f37348n.sendMessageDelayed(Message.obtain(gVar.f37348n, 15, a0Var), 5000L);
        gVar.f37348n.sendMessageDelayed(Message.obtain(gVar.f37348n, 16, a0Var), 120000L);
        pz.b bVar = new pz.b(2, null, null);
        if (e(bVar)) {
            String str2 = dVarM.f35651a;
            long jD2 = dVarM.d();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 61 + String.valueOf(jD2).length());
            sb3.append("A dialog should be displayed for missing feature: ");
            sb3.append(str2);
            sb3.append(", version: ");
            sb3.append(jD2);
            Log.w("GoogleApiManager", sb3.toString());
            return false;
        }
        if (!gVar.i(bVar, this.f37407m)) {
            return false;
        }
        String str3 = dVarM.f35651a;
        long jD3 = dVarM.d();
        StringBuilder sb4 = new StringBuilder(String.valueOf(str3).length() + 55 + String.valueOf(jD3).length());
        sb4.append("Notification displayed for missing feature: ");
        sb4.append(str3);
        sb4.append(", version: ");
        sb4.append(jD3);
        Log.w("GoogleApiManager", sb4.toString());
        return false;
    }

    public final void h(Status status, Exception exc, boolean z11) {
        com.google.android.gms.common.internal.i0.d(this.f37413s.f37348n);
        if ((status == null) == (exc == null)) {
            i4.a.f("Status XOR exception should be null");
            return;
        }
        Iterator it = this.f37402g.iterator();
        while (it.hasNext()) {
            o0 o0Var = (o0) it.next();
            if (!z11 || o0Var.f37379a == 2) {
                if (status != null) {
                    o0Var.a(status);
                } else {
                    o0Var.b(exc);
                }
                it.remove();
            }
        }
    }

    public final void i(Status status) {
        com.google.android.gms.common.internal.i0.d(this.f37413s.f37348n);
        h(status, null, false);
    }

    public final void j() {
        g gVar = this.f37413s;
        w5 w5Var = gVar.f37348n;
        a aVar = this.f37404i;
        w5Var.removeMessages(12, aVar);
        w5 w5Var2 = gVar.f37348n;
        w5Var2.sendMessageDelayed(w5Var2.obtainMessage(12, aVar), gVar.f37336a);
    }

    public final boolean k(boolean z11) {
        com.google.android.gms.common.internal.i0.d(this.f37413s.f37348n);
        com.google.android.gms.common.api.f fVar = this.f37403h;
        if (!fVar.isConnected() || !this.l.isEmpty()) {
            return false;
        }
        oz.m mVar = this.f37405j;
        if (((Map) mVar.f33836b).isEmpty() && ((Map) mVar.f33837c).isEmpty()) {
            fVar.disconnect("Timing out service connection.");
            return true;
        }
        if (!z11) {
            return false;
        }
        j();
        return false;
    }

    public final void l(pz.b bVar) {
        HashSet hashSet = this.f37406k;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else if (it.next() != null) {
            org.bouncycastle.jce.provider.a.c();
        } else {
            if (com.google.android.gms.common.internal.i0.k(bVar, pz.b.f35642f)) {
                this.f37403h.getEndpointPackageName();
            }
            throw null;
        }
    }

    public final pz.d m(pz.d[] dVarArr) {
        if (dVarArr != null && dVarArr.length != 0) {
            pz.d[] availableFeatures = this.f37403h.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new pz.d[0];
            }
            q1.e eVar = new q1.e(availableFeatures.length);
            for (pz.d dVar : availableFeatures) {
                eVar.put(dVar.f35651a, Long.valueOf(dVar.d()));
            }
            for (pz.d dVar2 : dVarArr) {
                Long l = (Long) eVar.get(dVar2.f35651a);
                if (l == null || l.longValue() < dVar2.d()) {
                    return dVar2;
                }
            }
        }
        return null;
    }

    public final void n(pz.b bVar) {
        com.google.android.gms.common.internal.i0.d(this.f37413s.f37348n);
        com.google.android.gms.common.api.f fVar = this.f37403h;
        String name = fVar.getClass().getName();
        String strValueOf = String.valueOf(bVar);
        fVar.disconnect(e0.f.o(new StringBuilder(name.length() + 25 + strValueOf.length()), "onSignInFailed for ", name, " with ", strValueOf));
        o(bVar, null);
    }

    public final void o(pz.b bVar, RuntimeException runtimeException) {
        b10.a aVar;
        g gVar = this.f37413s;
        com.google.android.gms.common.internal.i0.d(gVar.f37348n);
        j0 j0Var = this.f37408n;
        if (j0Var != null && (aVar = j0Var.f37361m) != null) {
            aVar.disconnect();
        }
        com.google.android.gms.common.internal.i0.d(this.f37413s.f37348n);
        this.f37411q = null;
        SparseIntArray sparseIntArray = (SparseIntArray) gVar.f37342g.f43083b;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        l(bVar);
        if ((this.f37403h instanceof sz.c) && bVar.f35644b != 24) {
            gVar.f37337b = true;
            w5 w5Var = gVar.f37348n;
            w5Var.sendMessageDelayed(w5Var.obtainMessage(19), 300000L);
        }
        int i11 = bVar.f35644b;
        if (i11 == 4) {
            i(g.f37333q);
            return;
        }
        if (i11 == 25) {
            i(g.d(this.f37404i, bVar));
            return;
        }
        LinkedList linkedList = this.f37402g;
        if (linkedList.isEmpty()) {
            this.f37411q = bVar;
            return;
        }
        if (runtimeException != null) {
            com.google.android.gms.common.internal.i0.d(gVar.f37348n);
            h(null, runtimeException, false);
            return;
        }
        boolean z11 = gVar.f37349o;
        a aVar2 = this.f37404i;
        if (!z11) {
            i(g.d(aVar2, bVar));
            return;
        }
        h(g.d(aVar2, bVar), null, true);
        if (linkedList.isEmpty() || e(bVar) || gVar.i(bVar, this.f37407m)) {
            return;
        }
        if (bVar.f35644b == 18) {
            this.f37409o = true;
        }
        if (!this.f37409o) {
            i(g.d(aVar2, bVar));
        } else {
            w5 w5Var2 = gVar.f37348n;
            w5Var2.sendMessageDelayed(Message.obtain(w5Var2, 9, aVar2), 5000L);
        }
    }

    public final void p(o0 o0Var) {
        com.google.android.gms.common.internal.i0.d(this.f37413s.f37348n);
        boolean zIsConnected = this.f37403h.isConnected();
        LinkedList linkedList = this.f37402g;
        if (zIsConnected) {
            if (g(o0Var)) {
                j();
                return;
            } else {
                linkedList.add(o0Var);
                return;
            }
        }
        linkedList.add(o0Var);
        pz.b bVar = this.f37411q;
        if (bVar == null || bVar.f35644b == 0 || bVar.f35645c == null) {
            r();
        } else {
            o(bVar, null);
        }
    }

    public final void q() {
        com.google.android.gms.common.internal.i0.d(this.f37413s.f37348n);
        Status status = g.f37332p;
        i(status);
        this.f37405j.B(status, false);
        for (k kVar : (k[]) this.l.keySet().toArray(new k[0])) {
            p(new m0(kVar, new d10.g()));
        }
        l(new pz.b(4, null, null));
        com.google.android.gms.common.api.f fVar = this.f37403h;
        if (fVar.isConnected()) {
            fVar.onUserSignOut(new jd.f(this, 21));
        }
    }

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
    public final void r() {
        g gVar = this.f37413s;
        com.google.android.gms.common.internal.i0.d(gVar.f37348n);
        com.google.android.gms.common.api.f fVar = this.f37403h;
        if (fVar.isConnected() || fVar.isConnecting()) {
            return;
        }
        try {
            int iH = gVar.f37342g.H(gVar.f37340e, fVar);
            if (iH != 0) {
                pz.b bVar = new pz.b(iH, null, null);
                String name = fVar.getClass().getName();
                String string = bVar.toString();
                StringBuilder sb2 = new StringBuilder(name.length() + 35 + string.length());
                sb2.append("The service for ");
                sb2.append(name);
                sb2.append(" is not available: ");
                sb2.append(string);
                Log.w("GoogleApiManager", sb2.toString());
                o(bVar, null);
                return;
            }
            i2.x xVar = new i2.x(gVar, fVar, this.f37404i);
            if (fVar.requiresSignIn()) {
                j0 j0Var = this.f37408n;
                com.google.android.gms.common.internal.i0.h(j0Var);
                b10.a aVar = j0Var.f37361m;
                if (aVar != null) {
                    aVar.disconnect();
                }
                com.google.android.gms.common.internal.i iVar = j0Var.l;
                iVar.f11123f = Integer.valueOf(System.identityHashCode(j0Var));
                a10.b bVar2 = j0Var.f37359j;
                Context context = j0Var.f37357h;
                Handler handler = j0Var.f37358i;
                j0Var.f37361m = (b10.a) bVar2.buildClient(context, handler.getLooper(), iVar, (Object) iVar.f11122e, (com.google.android.gms.common.api.m) j0Var, (com.google.android.gms.common.api.n) j0Var);
                j0Var.f37362n = xVar;
                Set set = j0Var.f37360k;
                if (set == null || set.isEmpty()) {
                    handler.post(new a8.f(j0Var));
                } else {
                    b10.a aVar2 = j0Var.f37361m;
                    aVar2.getClass();
                    aVar2.connect(new com.google.android.gms.common.internal.r((com.google.android.gms.common.internal.f) aVar2));
                }
            }
            try {
                fVar.connect(xVar);
            } catch (SecurityException e5) {
                o(new pz.b(10, null, null), e5);
            }
        } catch (IllegalStateException e11) {
            o(new pz.b(10, null, null), e11);
        }
    }
}
