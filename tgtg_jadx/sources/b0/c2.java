package b0;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import c5.f4;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f5084j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5085k;
    public Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f5086m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f5087n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f5088o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f5089p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f5090q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f5091r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, x70.c cVar, int i11) {
        super(2, cVar);
        this.f5084j = i11;
        this.l = obj;
        this.f5086m = obj2;
        this.f5087n = obj3;
        this.f5088o = obj4;
        this.f5089p = obj5;
        this.f5090q = obj6;
        this.f5091r = obj7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [e90.a, java.lang.Object, y70.a] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.jvm.functions.Function1] */
    private final Object a(Object obj) {
        e90.a aVar;
        v1.k1 k1Var;
        ?? r22;
        Throwable th2;
        v1.k1 k1Var2;
        e90.a aVar2;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        v1.l1 l1Var = (v1.l1) this.f5090q;
        ?? r12 = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f5085k;
        try {
            try {
                if (i11 == 0) {
                    ba0.g.M(obj);
                    v80.b0 b0Var = (v80.b0) this.f5088o;
                    v1.j1 j1Var = (v1.j1) this.f5089p;
                    CoroutineContext.Element element = b0Var.getCoroutineContext().get(v80.h1.f42106a);
                    element.getClass();
                    v1.k1 k1Var3 = new v1.k1(j1Var, (v80.i1) element);
                    v1.l1.a(l1Var, k1Var3);
                    aVar = l1Var.f41780b;
                    z70.i iVar = (z70.i) this.f5091r;
                    this.f5088o = k1Var3;
                    this.f5087n = aVar;
                    this.l = iVar;
                    this.f5086m = l1Var;
                    this.f5085k = 1;
                    if (aVar.g(this) != r12) {
                        k1Var = k1Var3;
                        r22 = iVar;
                    }
                    return r12;
                }
                if (i11 != 1) {
                    if (i11 != 2) {
                        com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    l1Var = (v1.l1) this.l;
                    aVar2 = (e90.a) this.f5087n;
                    k1Var2 = (v1.k1) this.f5088o;
                    try {
                        ba0.g.M(obj);
                        atomicReference2 = l1Var.f41779a;
                        while (!atomicReference2.compareAndSet(k1Var2, null) && atomicReference2.get() == k1Var2) {
                        }
                        aVar2.e(null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        atomicReference = l1Var.f41779a;
                        while (!atomicReference.compareAndSet(k1Var2, null) && atomicReference.get() == k1Var2) {
                        }
                        throw th2;
                    }
                }
                l1Var = (v1.l1) this.f5086m;
                Function1 function1 = (Function1) this.l;
                e90.a aVar3 = (e90.a) this.f5087n;
                k1Var = (v1.k1) this.f5088o;
                ba0.g.M(obj);
                aVar = aVar3;
                r22 = function1;
                this.f5088o = k1Var;
                this.f5087n = aVar;
                this.l = l1Var;
                this.f5086m = null;
                this.f5085k = 2;
                Object objInvoke = r22.invoke(this);
                if (objInvoke != r12) {
                    aVar2 = aVar;
                    obj = objInvoke;
                    k1Var2 = k1Var;
                    atomicReference2 = l1Var.f41779a;
                    while (!atomicReference2.compareAndSet(k1Var2, null)) {
                    }
                    aVar2.e(null);
                    return obj;
                }
                return r12;
            } catch (Throwable th4) {
                th2 = th4;
                k1Var2 = k1Var;
                atomicReference = l1Var.f41779a;
                while (!atomicReference.compareAndSet(k1Var2, null)) {
                }
                throw th2;
            }
        } catch (Throwable th5) {
            r12.e(null);
            throw th5;
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.jvm.functions.Function1, z70.i] */
    /* JADX WARN: Type inference failed for: r2v6, types: [kotlin.jvm.functions.Function1, z70.i] */
    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f5084j) {
            case 0:
                return new c2((d2) this.f5090q, cVar);
            case 1:
                c2 c2Var = new c2((ContentResolver) this.f5087n, (Uri) this.f5088o, (f4) this.f5089p, (x80.i) this.f5090q, (Context) this.f5091r, cVar);
                c2Var.f5086m = obj;
                return c2Var;
            case 2:
                return new c2((ld.g) this.l, (td.i) this.f5086m, this.f5087n, (td.o) this.f5088o, (fd.g) this.f5089p, (od.a) this.f5090q, (ld.k) this.f5091r, cVar, 2);
            case 3:
                c2 c2Var2 = new c2((Function0) this.f5091r, cVar);
                c2Var2.f5090q = obj;
                return c2Var2;
            case 4:
                return new c2((no.m0) this.f5089p, (String) this.f5090q, (String) this.f5091r, cVar);
            case 5:
                c2 c2Var3 = new c2((t1.l0) this.f5089p, (t1.n0) this.f5090q, (Function1) this.f5091r, cVar);
                c2Var3.f5088o = obj;
                return c2Var3;
            case 6:
                return new c2((uc.h) this.l, (zc.k) this.f5086m, this.f5087n, (zc.n) this.f5088o, (pc.b) this.f5089p, (xc.b) this.f5090q, (ld.k) this.f5091r, cVar, 6);
            case 7:
                c2 c2Var4 = new c2((v1.j1) this.f5089p, (v1.l1) this.f5090q, (Function1) this.f5091r, cVar);
                c2Var4.f5088o = obj;
                return c2Var4;
            default:
                c2 c2Var5 = new c2((t1.b) this.f5086m, (t1.b) this.f5087n, (xo.b) this.f5088o, (t1.b) this.f5089p, (m3.b1) this.f5090q, (m3.b1) this.f5091r, cVar);
                c2Var5.l = obj;
                return c2Var5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5084j) {
        }
        return ((c2) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d1, code lost:
    
        if (t1.b.c(r0, r1, r2, null, r4, 12) != r15) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:210:0x059d, B:229:0x05fb], limit reached: 438 */
    /* JADX WARN: Path cross not found for [B:215:0x05be, B:226:0x05ef], limit reached: 438 */
    /* JADX WARN: Path cross not found for [B:229:0x05fb, B:210:0x059d], limit reached: 438 */
    /* JADX WARN: Removed duplicated region for block: B:160:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x059d A[Catch: all -> 0x04d5, TryCatch #10 {all -> 0x04d5, blocks: (B:181:0x04d0, B:205:0x0581, B:208:0x0598, B:210:0x059d, B:213:0x05a7, B:215:0x05be, B:217:0x05ca, B:219:0x05d4, B:223:0x05e5, B:227:0x05f1, B:230:0x05fc, B:233:0x060b, B:237:0x0625, B:239:0x062e, B:250:0x0652, B:251:0x0655, B:187:0x04f5, B:190:0x0512, B:234:0x061a, B:236:0x0622, B:248:0x064e, B:249:0x0651, B:235:0x061e), top: B:420:0x04b1, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0656 A[LOOP:4: B:209:0x059b->B:252:0x0656, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0805 A[Catch: all -> 0x07b9, TRY_LEAVE, TryCatch #12 {all -> 0x07b9, blocks: (B:334:0x07b3, B:344:0x07ea, B:348:0x07fd, B:350:0x0805, B:340:0x07cb, B:343:0x07e1), top: B:423:0x07a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x08d6 A[Catch: all -> 0x0874, TryCatch #9 {all -> 0x0874, blocks: (B:367:0x0865, B:396:0x08fc, B:388:0x08ce, B:390:0x08d6, B:392:0x08e0), top: B:418:0x0865 }] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0609 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015d  */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v40, types: [e90.a, java.lang.Object, y70.a] */
    /* JADX WARN: Type inference failed for: r6v56, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r6v59 */
    /* JADX WARN: Type inference failed for: r6v65 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:232:0x0609 -> B:244:0x0646). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:238:0x062c -> B:244:0x0646). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:243:0x0645 -> B:244:0x0646). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:353:0x082a -> B:344:0x07ea). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:395:0x08f7 -> B:369:0x0870). Please report as a decompilation issue!!! */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r80) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.c2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(d2 d2Var, x70.c cVar) {
        super(2, cVar);
        this.f5084j = 0;
        this.f5090q = d2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(ContentResolver contentResolver, Uri uri, f4 f4Var, x80.i iVar, Context context, x70.c cVar) {
        super(2, cVar);
        this.f5084j = 1;
        this.f5087n = contentResolver;
        this.f5088o = uri;
        this.f5089p = f4Var;
        this.f5090q = iVar;
        this.f5091r = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(Function0 function0, x70.c cVar) {
        super(2, cVar);
        this.f5084j = 3;
        this.f5091r = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(no.m0 m0Var, String str, String str2, x70.c cVar) {
        super(2, cVar);
        this.f5084j = 4;
        this.f5089p = m0Var;
        this.f5090q = str;
        this.f5091r = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(t1.b bVar, t1.b bVar2, xo.b bVar3, t1.b bVar4, m3.b1 b1Var, m3.b1 b1Var2, x70.c cVar) {
        super(2, cVar);
        this.f5084j = 8;
        this.f5086m = bVar;
        this.f5087n = bVar2;
        this.f5088o = bVar3;
        this.f5089p = bVar4;
        this.f5090q = b1Var;
        this.f5091r = b1Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c2(t1.l0 l0Var, t1.n0 n0Var, Function1 function1, x70.c cVar) {
        super(2, cVar);
        this.f5084j = 5;
        this.f5089p = l0Var;
        this.f5090q = n0Var;
        this.f5091r = (z70.i) function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c2(v1.j1 j1Var, v1.l1 l1Var, Function1 function1, x70.c cVar) {
        super(2, cVar);
        this.f5084j = 7;
        this.f5089p = j1Var;
        this.f5090q = l1Var;
        this.f5091r = (z70.i) function1;
    }
}
