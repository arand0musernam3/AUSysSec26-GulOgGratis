package o30;

import com.google.android.gms.internal.measurement.c6;
import com.google.android.gms.internal.measurement.r5;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import y00.l3;
import y00.m3;
import y00.n1;
import y00.r4;
import y00.t2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f31900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f31901c;

    public m0(t2 t2Var, c6 c6Var) {
        this.f31899a = 21;
        this.f31900b = c6Var;
        Objects.requireNonNull(t2Var);
        this.f31901c = t2Var;
    }

    private final void a() {
        try {
            f();
        } catch (Error e5) {
            synchronized (((v30.j) this.f31901c).f41971b) {
                ((v30.j) this.f31901c).f41972c = v30.i.IDLE;
                throw e5;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:26|(1:28)(28:31|299|32|33|(1:36)(24:38|(1:40)|293|41|(7:43|(1:45)(1:47)|291|48|295|49|50)|30|54|(2:56|(2:58|(2:60|(2:62|(2:64|(2:66|(1:68)(1:69))(1:70))(1:71))(1:72))(1:73))(1:74))(1:75)|76|289|77|(1:79)(1:80)|81|(1:83)(1:84)|85|(1:87)|91|(1:93)(7:95|(0)(1:98)|(3:287|100|(1:102)(1:103))|(2:109|(1:111)(4:112|(3:115|(1:302)(1:303)|113)|301|118))(1:118)|(1:120)(1:121)|122|(30:124|(1:126)(1:127)|128|(1:130)|131|(1:133)(1:134)|135|(2:137|(2:142|(1:144))(1:(3:141|142|(0))))(0)|145|(19:150|(1:152)|(1:167)(1:168)|169|(1:171)|172|(2:177|(1:182))(1:176)|183|(3:187|(1:189)|190)|191|(1:193)|194|(1:198)|199|(3:201|(7:203|(1:205)(1:206)|207|(1:209)|210|(4:214|(1:216)|217|(1:219))|220)(1:222)|221)(10:223|(2:225|(2:238|239)(3:228|(5:230|(1:232)(1:233)|234|(1:236)|237)(0)|239))(1:240)|241|(1:243)|244|297|245|246|250|(5:252|(1:254)(1:255)|(1:259)|(1:261)|262))|263|(3:265|(1:267)|(5:269|(1:271)|272|(1:274)|275))|276|277)(1:149)|153|(1:163)(1:165)|164|(0)(0)|169|(0)|172|(3:174|177|(1:182))(0)|183|(4:185|187|(0)|190)(0)|191|(0)|194|(2:196|198)|199|(0)(0)|263|(0)|276|277)(2:278|279))|94|(0)|(0)(0)|(0)(0)|122|(0)(0))|37|293|41|(0)(0)|30|54|(0)(0)|76|289|77|(0)(0)|81|(0)(0)|85|(0)|91|(0)(0)|94|(0)|(0)(0)|(0)(0)|122|(0)(0))|29|30|54|(0)(0)|76|289|77|(0)(0)|81|(0)(0)|85|(0)|91|(0)(0)|94|(0)|(0)(0)|(0)(0)|122|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(27:31|(2:299|32)|33|(1:36)(24:38|(1:40)|293|41|(7:43|(1:45)(1:47)|291|48|295|49|50)|30|54|(2:56|(2:58|(2:60|(2:62|(2:64|(2:66|(1:68)(1:69))(1:70))(1:71))(1:72))(1:73))(1:74))(1:75)|76|289|77|(1:79)(1:80)|81|(1:83)(1:84)|85|(1:87)|91|(1:93)(7:95|(0)(1:98)|(3:287|100|(1:102)(1:103))|(2:109|(1:111)(4:112|(3:115|(1:302)(1:303)|113)|301|118))(1:118)|(1:120)(1:121)|122|(30:124|(1:126)(1:127)|128|(1:130)|131|(1:133)(1:134)|135|(2:137|(2:142|(1:144))(1:(3:141|142|(0))))(0)|145|(19:150|(1:152)|(1:167)(1:168)|169|(1:171)|172|(2:177|(1:182))(1:176)|183|(3:187|(1:189)|190)|191|(1:193)|194|(1:198)|199|(3:201|(7:203|(1:205)(1:206)|207|(1:209)|210|(4:214|(1:216)|217|(1:219))|220)(1:222)|221)(10:223|(2:225|(2:238|239)(3:228|(5:230|(1:232)(1:233)|234|(1:236)|237)(0)|239))(1:240)|241|(1:243)|244|297|245|246|250|(5:252|(1:254)(1:255)|(1:259)|(1:261)|262))|263|(3:265|(1:267)|(5:269|(1:271)|272|(1:274)|275))|276|277)(1:149)|153|(1:163)(1:165)|164|(0)(0)|169|(0)|172|(3:174|177|(1:182))(0)|183|(4:185|187|(0)|190)(0)|191|(0)|194|(2:196|198)|199|(0)(0)|263|(0)|276|277)(2:278|279))|94|(0)|(0)(0)|(0)(0)|122|(0)(0))|37|293|41|(0)(0)|30|54|(0)(0)|76|289|77|(0)(0)|81|(0)(0)|85|(0)|91|(0)(0)|94|(0)|(0)(0)|(0)(0)|122|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01a5, code lost:
    
        r5 = "Unknown";
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0270, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0271, code lost:
    
        y00.n1.m(r13);
        r13.f45260g.c("Fetching Google App Id failed with exception. appId", y00.w0.x(r14), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0758  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x07ac  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x02b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0188 A[Catch: NameNotFoundException -> 0x01a5, TryCatch #3 {NameNotFoundException -> 0x01a5, blocks: (B:41:0x017d, B:43:0x0188, B:45:0x0194), top: B:293:0x017d }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x024f A[Catch: IllegalStateException -> 0x0270, TryCatch #1 {IllegalStateException -> 0x0270, blocks: (B:77:0x0246, B:81:0x0255, B:85:0x025d, B:87:0x0261, B:80:0x024f), top: B:289:0x0246 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0261 A[Catch: IllegalStateException -> 0x0270, TRY_LEAVE, TryCatch #1 {IllegalStateException -> 0x0270, blocks: (B:77:0x0246, B:81:0x0255, B:85:0x025d, B:87:0x0261, B:80:0x024f), top: B:289:0x0246 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a1  */
    /* JADX WARN: Type inference failed for: r0v44, types: [y00.s2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void b() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2086
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o30.m0.b():void");
    }

    private final void c() {
        l3 l3Var = (l3) this.f31901c;
        synchronized (l3Var) {
            try {
                l3Var.f44917a = false;
                m3 m3Var = l3Var.f44919c;
                if (!m3Var.G()) {
                    y00.w0 w0Var = ((n1) m3Var.f21216b).f44987f;
                    n1.m(w0Var);
                    w0Var.f45267o.a("Connected to service");
                    y00.j0 j0Var = (y00.j0) this.f31900b;
                    m3Var.p();
                    m3Var.f44962e = j0Var;
                    m3Var.C();
                    m3Var.E();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void d() {
        AppMeasurementDynamiteService appMeasurementDynamiteService = (AppMeasurementDynamiteService) this.f31901c;
        r4 r4Var = appMeasurementDynamiteService.f12155g.f44990i;
        n1.k(r4Var);
        n1 n1Var = appMeasurementDynamiteService.f12155g;
        r4Var.h0((c6) this.f31900b, n1Var.f45005y != null && n1Var.f45005y.booleanValue());
    }

    private final void e() {
        m3 m3Var = ((l3) this.f31901c).f44919c;
        m3Var.f44962e = null;
        if (((pz.b) this.f31900b).f35644b != 7777) {
            m3Var.E();
            return;
        }
        if (m3Var.f44965h == null) {
            m3Var.f44965h = Executors.newScheduledThreadPool(1);
        }
        m3Var.f44965h.schedule(new a8.f(this, 25), ((Long) y00.g0.Z.a(null)).longValue(), TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        if (r1 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        ((java.lang.Runnable) r9.f31900b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        v30.j.f41969f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r9.f31900b), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007c, code lost:
    
        r9.f31900b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f() {
        /*
            r9 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r9.f31901c     // Catch: java.lang.Throwable -> L5a
            v30.j r2 = (v30.j) r2     // Catch: java.lang.Throwable -> L5a
            java.util.ArrayDeque r2 = r2.f41971b     // Catch: java.lang.Throwable -> L5a
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L5a
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r9.f31901c     // Catch: java.lang.Throwable -> L20
            v30.j r0 = (v30.j) r0     // Catch: java.lang.Throwable -> L20
            v30.i r3 = r0.f41972c     // Catch: java.lang.Throwable -> L20
            v30.i r4 = v30.i.RUNNING     // Catch: java.lang.Throwable -> L20
            if (r3 != r4) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L48
        L18:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L48
        L20:
            r0 = move-exception
            goto L7f
        L22:
            long r5 = r0.f41973d     // Catch: java.lang.Throwable -> L20
            r7 = 1
            long r5 = r5 + r7
            r0.f41973d = r5     // Catch: java.lang.Throwable -> L20
            r0.f41972c = r4     // Catch: java.lang.Throwable -> L20
            r0 = 1
        L2c:
            java.lang.Object r3 = r9.f31901c     // Catch: java.lang.Throwable -> L20
            v30.j r3 = (v30.j) r3     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r3 = r3.f41971b     // Catch: java.lang.Throwable -> L20
            java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L20
            r9.f31900b = r3     // Catch: java.lang.Throwable -> L20
            if (r3 != 0) goto L49
            java.lang.Object r0 = r9.f31901c     // Catch: java.lang.Throwable -> L20
            v30.j r0 = (v30.j) r0     // Catch: java.lang.Throwable -> L20
            v30.i r3 = v30.i.IDLE     // Catch: java.lang.Throwable -> L20
            r0.f41972c = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L48
            goto L18
        L48:
            return
        L49:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L5a
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r9.f31900b     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
            r3.run()     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
        L57:
            r9.f31900b = r2     // Catch: java.lang.Throwable -> L5a
            goto L2
        L5a:
            r0 = move-exception
            goto L81
        L5c:
            r0 = move-exception
            goto L7c
        L5e:
            r3 = move-exception
            java.util.logging.Logger r4 = v30.j.f41969f     // Catch: java.lang.Throwable -> L5c
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r6.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r7 = r9.f31900b     // Catch: java.lang.Throwable -> L5c
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5c
            r6.append(r7)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5c
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5c
            goto L57
        L7c:
            r9.f31900b = r2     // Catch: java.lang.Throwable -> L5a
            throw r0     // Catch: java.lang.Throwable -> L5a
        L7f:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L5a
        L81:
            if (r1 == 0) goto L8a
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L8a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o30.m0.f():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0166 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0155  */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2108
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o30.m0.run():void");
    }

    public String toString() {
        switch (this.f31899a) {
            case 0:
                j30.g gVar = new j30.g(m0.class.getSimpleName(), 0);
                ub.a aVar = (ub.a) this.f31901c;
                dn.k kVar = new dn.k(22, false);
                ((dn.k) gVar.f24504d).f15019c = kVar;
                gVar.f24504d = kVar;
                kVar.f15018b = aVar;
                return gVar.toString();
            case 16:
                Runnable runnable = (Runnable) this.f31900b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                return "SequentialExecutorWorker{state=" + ((v30.j) this.f31901c).f41972c + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ m0(Object obj, Object obj2, boolean z11, int i11) {
        this.f31899a = i11;
        this.f31901c = obj;
        this.f31900b = obj2;
    }

    public m0(tx.b bVar, r5 r5Var, tx.b bVar2) {
        this.f31899a = 18;
        this.f31900b = r5Var;
        this.f31901c = bVar;
    }

    public /* synthetic */ m0(int i11, Object obj, Object obj2) {
        this.f31899a = i11;
        this.f31900b = obj;
        this.f31901c = obj2;
    }

    public m0(v30.j jVar) {
        this.f31899a = 16;
        this.f31901c = jVar;
    }
}
