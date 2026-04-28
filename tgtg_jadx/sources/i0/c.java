package i0;

import android.hardware.camera2.CaptureResult;
import android.util.Log;
import com.braze.h2;
import e0.i1;
import e0.j0;
import e0.n1;
import e0.r0;
import g3.q9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.o0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements e0.k, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0.e f22602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f22603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f22604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j0.c f22605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j0.d f22606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f22607f;

    public c(h0.e eVar, v vVar, h hVar, j0.n nVar, j0.c cVar, j0.d dVar) {
        eVar.getClass();
        vVar.getClass();
        hVar.getClass();
        nVar.getClass();
        cVar.getClass();
        dVar.getClass();
        this.f22602a = eVar;
        this.f22603b = vVar;
        this.f22604c = hVar;
        this.f22605d = cVar;
        this.f22606e = dVar;
        r80.b bVar = d.f22610a;
        bVar.getClass();
        this.f22607f = r80.b.f37780b.incrementAndGet(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r3v0, types: [i0.v] */
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
    public static v80.q e(c cVar, final boolean z11, final boolean z12, long j9) {
        if (cVar.f22602a.a()) {
            qc.y.j("Cannot call lock3AForCapture on ", cVar, " after close.");
            return null;
        }
        h hVar = cVar.f22604c;
        hVar.getClass();
        Object obj = h.f22670q;
        Object obj2 = z11 ? obj : h.f22669p;
        Function1 function1 = new Function1() { // from class: i0.f
            /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r9) {
                /*
                    Method dump skipped, instruction units count: 238
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: i0.f.invoke(java.lang.Object):java.lang.Object");
            }
        };
        z zVar = hVar.f22681d;
        v80.q qVar = h.f22671r;
        ?? r32 = hVar.f22678a;
        ?? r02 = obj;
        if (r32.f22741c.g() == null) {
            return qVar;
        }
        if (obj2 != null) {
            r02 = obj2;
        }
        Iterator it = r02.entrySet().iterator();
        while (it.hasNext()) {
            Intrinsics.areEqual(((Map.Entry) it.next()).getValue(), (Object) 1);
        }
        a0 a0Var = new a0(function1, 60, Long.valueOf(j9));
        zVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = zVar.f22752a;
        copyOnWriteArrayList.add(a0Var);
        Log.d("CXCP", "lock3AForCapture - sending a request to trigger ae precapture metering and af.");
        if (r32.e(r02)) {
            r32.f(hVar.f22680c.a());
            return a0Var.f22574d;
        }
        copyOnWriteArrayList.remove(a0Var);
        return qVar;
    }

    public static v80.q t(c cVar, long j9, int i11) {
        Object obj;
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = (i11 & 1) != 0 ? null : bool;
        Boolean bool3 = (i11 & 4) != 0 ? null : bool;
        long j11 = (i11 & 32) != 0 ? 3000000000L : j9;
        if (cVar.f22602a.a()) {
            qc.y.j("Cannot call unlock3A on ", cVar, " after close.");
            return null;
        }
        h hVar = cVar.f22604c;
        Long l = new Long(j11);
        v80.q qVar = h.f22671r;
        v vVar = hVar.f22678a;
        e0.u uVar = e0.v.f15412i0;
        e0.v vVar2 = hVar.f22679b;
        uVar.getClass();
        Boolean bool4 = !e0.u.a(vVar2) ? null : bool;
        if (!Intrinsics.areEqual(bool2, bool) && !Intrinsics.areEqual(bool4, bool) && !Intrinsics.areEqual(bool3, bool)) {
            return v80.f0.a(new n1(0, null));
        }
        if (vVar.f22741c.g() == null) {
            return qVar;
        }
        if (Intrinsics.areEqual(bool4, bool)) {
            Log.d("CXCP", "unlock3A - sending a request to unlock af first.");
            if (!vVar.e(h.f22668o)) {
                Log.d("CXCP", "unlock3A - failed to send a request to unlock af first.");
                return qVar;
            }
            y.b(hVar.f22680c, null, null, null, null, null, null, null, null, Boolean.FALSE, null, 767);
        }
        boolean zAreEqual = Intrinsics.areEqual(bool2, bool);
        boolean zAreEqual2 = Intrinsics.areEqual(bool4, bool);
        boolean zAreEqual3 = Intrinsics.areEqual(bool3, bool);
        if (zAreEqual || zAreEqual2 || zAreEqual3) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (zAreEqual) {
                linkedHashMap.put(CaptureResult.CONTROL_AE_STATE, h.f22672s);
            }
            if (zAreEqual2) {
                linkedHashMap.put(CaptureResult.CONTROL_AF_STATE, h.f22673t);
            }
            if (zAreEqual3) {
                linkedHashMap.put(CaptureResult.CONTROL_AWB_STATE, h.f22674u);
            }
            obj = linkedHashMap;
        } else {
            obj = o0.f26530a;
            obj.getClass();
        }
        a0 a0Var = new a0(new q9(obj, 21), 60, l);
        z zVar = hVar.f22681d;
        zVar.getClass();
        zVar.f22752a.add(a0Var);
        Boolean bool5 = Intrinsics.areEqual(bool2, bool) ? Boolean.FALSE : null;
        Boolean bool6 = Intrinsics.areEqual(bool3, bool) ? Boolean.FALSE : null;
        if (bool5 != null || bool6 != null) {
            Log.d("CXCP", "unlock3A - updating graph state, aeLock=" + bool5 + ", awbLock=" + bool6);
            y.b(hVar.f22680c, null, null, null, null, null, null, null, bool5, null, bool6, 383);
        }
        vVar.f(hVar.f22680c.a());
        return a0Var.f22574d;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f22605d.f24286a) {
        }
        synchronized (this.f22606e.f24287a) {
        }
        this.f22602a.b();
    }

    public final v80.q g() {
        e0.a aVar = null;
        if (this.f22602a.a()) {
            qc.y.j("Cannot call setTorchOn on ", this, " after close.");
            return null;
        }
        h hVar = this.f22604c;
        e0.a aVar2 = ((b0) hVar.f22680c.f22751a.f37785a).f22592a;
        List list = e0.a.f15305b;
        if ((aVar2 == null || aVar2.f15306a != 1) && (aVar2 == null || aVar2.f15306a != 0)) {
            aVar = new e0.a(1);
        }
        return h.b(hVar, aVar, null, null, new j0(2), null, null, null, 118);
    }

    public final void p() {
        if (this.f22602a.a()) {
            qc.y.j("Cannot call stopRepeating on ", this, " after close.");
        } else {
            this.f22603b.d(null);
        }
    }

    public final void r(ArrayList arrayList) {
        Object next;
        if (this.f22602a.a()) {
            qc.y.j("Cannot call submit on ", this, " after close.");
            return;
        }
        if (arrayList.isEmpty()) {
            h2.b("Cannot call submit with an empty list of Requests!");
            return;
        }
        v vVar = this.f22603b;
        vVar.getClass();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((i1) next).f15360f != null) {
                    break;
                }
            }
        }
        i1 i1Var = (i1) next;
        if (i1Var == null || vVar.f22740b.f15372d != null) {
            u uVar = vVar.f22741c;
            uVar.getClass();
            if (uVar.f22726g.C(new j(arrayList))) {
                return;
            }
            uVar.a(arrayList);
            return;
        }
        StringBuilder sb2 = new StringBuilder("Cannot submit ");
        sb2.append(i1Var);
        r0 r0Var = i1Var.f15360f;
        sb2.append(" with input request ");
        sb2.append(r0Var);
        sb2.append(" to ");
        sb2.append(vVar);
        sb2.append(" because CameraGraph was not configured to support reprocessing");
        throw new IllegalStateException(sb2.toString().toString());
    }

    public final String toString() {
        return "CameraGraph.Session-" + this.f22607f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [i0.v] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
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
    public final v80.q u(boolean z11) {
        a0 a0Var;
        if (this.f22602a.a()) {
            qc.y.j("Cannot call unlock3APostCapture on ", this, " after close.");
            return null;
        }
        v80.q qVar = h.f22671r;
        h hVar = this.f22604c;
        ?? r22 = hVar.f22678a;
        if (r22.f22741c.g() != null) {
            Log.d("CXCP", "unlock3APostCapture - sending a request to reset af and ae precapture metering.");
            if (r22.e(z11 ? h.f22676w : h.f22675v)) {
                if (z11) {
                    a0Var = new a0(h.f22677x, null, null);
                } else {
                    o0 o0Var = o0.f26530a;
                    o0Var.getClass();
                    a0Var = new a0(o0Var);
                }
                z zVar = hVar.f22681d;
                zVar.getClass();
                zVar.f22752a.add(a0Var);
                r22.f(hVar.f22680c.a());
                return a0Var.f22574d;
            }
        }
        return qVar;
    }
}
