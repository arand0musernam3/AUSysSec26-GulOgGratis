package aa;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements ha.a, e90.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ha.a f1127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e90.a f1128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CoroutineContext f1129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Throwable f1130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f1131e;

    public k(ha.a aVar) {
        e90.c cVarA = e90.d.a();
        aVar.getClass();
        this.f1127a = aVar;
        this.f1128b = cVarA;
        this.f1131e = new j(this);
    }

    @Override // e90.a
    public final boolean a() {
        return this.f1128b.a();
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        j jVar = this.f1131e;
        if (jVar != null) {
            jVar.h(-1);
        }
        this.f1127a.close();
    }

    @Override // e90.a
    public final void e(Object obj) {
        this.f1128b.e(null);
    }

    @Override // ha.a
    public final boolean e0() {
        return this.f1127a.e0();
    }

    @Override // e90.a
    public final Object g(x70.c cVar) {
        return this.f1128b.g(cVar);
    }

    public final void p(StringBuilder sb2) {
        int i11;
        j jVar = this.f1131e;
        if (this.f1129c == null && this.f1130d == null) {
            sb2.append("\t\tStatus: Free connection");
            sb2.append('\n');
        } else {
            sb2.append("\t\tStatus: Acquired connection");
            sb2.append('\n');
            CoroutineContext coroutineContext = this.f1129c;
            if (coroutineContext != null) {
                sb2.append("\t\tCoroutine: " + coroutineContext);
                sb2.append('\n');
            }
            Throwable th2 = this.f1130d;
            if (th2 != null) {
                sb2.append("\t\tAcquired:");
                sb2.append('\n');
                Iterator it = CollectionsKt.J(1, StringsKt.K(u70.e.b(th2))).iterator();
                while (it.hasNext()) {
                    sb2.append("\t\t" + ((String) it.next()));
                    sb2.append('\n');
                }
            }
        }
        if (jVar != null) {
            StringBuilder sb3 = new StringBuilder("\t\tPrepared Statement Cache Size: ");
            synchronized (jVar.f35717c) {
                i11 = jVar.f35718d;
            }
            sb3.append(i11);
            sb2.append(sb3.toString());
            sb2.append('\n');
        }
    }

    public final String toString() {
        return this.f1127a.toString();
    }

    @Override // e90.a
    public final boolean tryLock() {
        return this.f1128b.tryLock();
    }

    @Override // ha.a
    public final ha.c v0(String str) {
        str.getClass();
        j jVar = this.f1131e;
        if (jVar == null) {
            return this.f1127a.v0(str);
        }
        Object objC = jVar.c(str);
        objC.getClass();
        return new i((ha.c) objC);
    }
}
