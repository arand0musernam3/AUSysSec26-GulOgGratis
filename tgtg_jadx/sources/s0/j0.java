package s0;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f38363b;

    public /* synthetic */ j0(m0 m0Var, i1.d dVar) {
        this.f38362a = 1;
        this.f38363b = m0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.List] */
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
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f38362a) {
            case 0:
                m0 m0Var = this.f38363b;
                Iterator it = m0Var.f38396k.iterator();
                while (it.hasNext()) {
                    m0Var.a(((m0.p) it.next()).a());
                }
                return;
            case 1:
                Set setV0 = CollectionsKt.v0(this.f38363b.f38396k);
                if (setV0.isEmpty()) {
                    return;
                }
                setV0.getClass();
                return;
            default:
                m0 m0Var2 = this.f38363b;
                synchronized (m0Var2.f38389d) {
                    try {
                        ScheduledFuture scheduledFuture = m0Var2.f38390e;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        wd.a.p("CameraPresencePrvdr", "Starting new refresh-with-retries sequence.");
                        m0Var2.d(3, m0Var2.f38396k);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
        }
    }

    public /* synthetic */ j0(m0 m0Var, int i11) {
        this.f38362a = i11;
        this.f38363b = m0Var;
    }
}
