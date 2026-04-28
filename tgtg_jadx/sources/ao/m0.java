package ao;

import android.content.Context;
import com.app.tgtg.model.remote.item.requests.TrackingEventRequest;
import com.app.tgtg.tasks.EventWorker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Timer;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h8.e f4349k = new h8.e("heartbeat");
    public static final h8.e l = new h8.e("session");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v80.b0 f4351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kt.n f4352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f4353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g3 f4354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final gt.n f4355f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mv.b f4356g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d8.f f4357h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4358i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Timer f4359j;

    public m0(Context context, v80.b0 b0Var, kt.n nVar, v vVar, g3 g3Var, gt.n nVar2, mv.b bVar, d8.f fVar) {
        b0Var.getClass();
        nVar.getClass();
        vVar.getClass();
        g3Var.getClass();
        bVar.getClass();
        fVar.getClass();
        this.f4350a = context;
        this.f4351b = b0Var;
        this.f4352c = nVar;
        this.f4353d = vVar;
        this.f4354e = g3Var;
        this.f4355f = nVar2;
        this.f4356g = bVar;
        this.f4357h = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cv.e eVar = (cv.e) it.next();
            eVar.getClass();
            n90.n nVar = null;
            try {
                n90.b bVar = n90.c.f30748d;
                KSerializer kSerializerSerializer = cv.e.Companion.serializer();
                bVar.getClass();
                kSerializerSerializer.getClass();
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                new o90.n(bVar, new g9.d0(objectRef, 2), 1).w(kSerializerSerializer, eVar);
                T t9 = objectRef.element;
                if (t9 == 0) {
                    Intrinsics.throwUninitializedPropertyAccessException("result");
                } else {
                    nVar = (n90.n) t9;
                }
            } catch (SerializationException e5) {
                sa0.a.f38953a.d(e5);
            }
            if (nVar != null) {
                arrayList.add(new TrackingEventRequest(TrackingEventRequest.IMPRESSIONS, nVar, eVar.f13437b, eVar.f13438c));
            }
        }
        return arrayList;
    }

    public final void a(cv.e eVar) {
        eVar.getClass();
        c90.f fVar = v80.p0.f42144a;
        v80.f0.B(this.f4351b, c90.e.f7834b, null, new a3.x1(eVar, this, null, 4), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(z70.c r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof ao.d0
            if (r0 == 0) goto L13
            r0 = r12
            ao.d0 r0 = (ao.d0) r0
            int r1 = r0.f4214m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4214m = r1
            goto L18
        L13:
            ao.d0 r0 = new ao.d0
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.f4213k
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.f4214m
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            java.lang.Long r0 = r0.f4212j
            ba0.g.M(r12)
            return r0
        L29:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r12)
            r12 = 0
            return r12
        L30:
            ba0.g.M(r12)
            long r4 = java.lang.System.currentTimeMillis()
            ao.e0 r12 = new ao.e0
            r2 = 0
            r6 = 0
            r12.<init>(r11, r6, r2)
            kotlin.coroutines.g r2 = kotlin.coroutines.g.f26549a
            java.lang.Object r12 = v80.f0.E(r2, r12)
            java.lang.Long r12 = (java.lang.Long) r12
            if (r12 == 0) goto L57
            long r7 = r12.longValue()
            long r7 = r4 - r7
            r9 = 600000(0x927c0, double:2.964394E-318)
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 < 0) goto L56
            goto L57
        L56:
            return r12
        L57:
            java.lang.Long r12 = new java.lang.Long
            r12.<init>(r4)
            r0.f4212j = r12
            r0.f4214m = r3
            ao.j0 r2 = new ao.j0
            r3 = 1
            r2.<init>(r4, r6, r3)
            d8.f r3 = r11.f4357h
            java.lang.Object r0 = xz.b.r(r3, r2, r0)
            if (r0 != r1) goto L6f
            goto L71
        L6f:
            kotlin.Unit r0 = kotlin.Unit.f26487a
        L71:
            if (r0 != r1) goto L74
            return r1
        L74:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.m0.b(z70.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a8, code lost:
    
        if (r13 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable d(java.util.ArrayList r12, z70.c r13) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.m0.d(java.util.ArrayList, z70.c):java.io.Serializable");
    }

    public final void e() {
        if (!this.f4358i && this.f4353d.f4469b.a() && this.f4356g.f30152c.getProduction()) {
            ib.z zVar = new ib.z(EventWorker.class, 0);
            ib.x xVar = ib.x.NOT_REQUIRED;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            ib.x xVar2 = ib.x.CONNECTED;
            xVar2.getClass();
            ((qb.o) zVar.f23742b).f36837j = new ib.e(new rb.f(null), xVar2, false, false, false, false, -1L, -1L, CollectionsKt.v0(linkedHashSet));
            jb.s sVarD = jb.s.d(this.f4350a);
            sVarD.getClass();
            sVarD.b(zVar.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:48:0x00e5, B:50:0x00ee, B:51:0x010f, B:32:0x0075, B:36:0x0099, B:37:0x00a4, B:39:0x00aa, B:41:0x00bc, B:43:0x00cd, B:44:0x00d1), top: B:64:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ee A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:48:0x00e5, B:50:0x00ee, B:51:0x010f, B:32:0x0075, B:36:0x0099, B:37:0x00a4, B:39:0x00aa, B:41:0x00bc, B:43:0x00cd, B:44:0x00d1), top: B:64:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r11v0, types: [int] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00e4 -> B:48:0x00e5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(z70.c r22) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.m0.f(z70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x010b A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:13:0x0035, B:45:0x00ec, B:46:0x0105, B:48:0x010b, B:20:0x0047, B:36:0x00c1, B:38:0x00c7, B:41:0x00e6, B:23:0x0057, B:25:0x0061, B:28:0x006d, B:30:0x008e, B:33:0x0096, B:49:0x0124, B:51:0x013f), top: B:56:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(z70.c r18) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.m0.g(z70.c):java.lang.Object");
    }
}
