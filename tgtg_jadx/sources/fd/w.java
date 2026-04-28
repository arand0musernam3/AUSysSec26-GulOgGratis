package fd;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReference f17601a = new AtomicReference(null);

    /* JADX WARN: Multi-variable type inference failed */
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
    public static final t a(Context context) {
        t tVar;
        t tVar2;
        AtomicReference atomicReference = f17601a;
        Object obj = atomicReference.get();
        t tVar3 = obj instanceof t ? (t) obj : null;
        if (tVar3 != null) {
            return tVar3;
        }
        t tVarB = null;
        while (true) {
            Object obj2 = atomicReference.get();
            if (obj2 instanceof t) {
                tVar = (t) obj2;
                tVar2 = tVarB;
            } else {
                if (tVarB == null) {
                    Context applicationContext = context.getApplicationContext();
                    v vVar = obj2 instanceof v ? (v) obj2 : null;
                    if (vVar != null) {
                        tVarB = vVar.b(applicationContext);
                    } else {
                        v vVar2 = applicationContext instanceof v ? (v) applicationContext : null;
                        tVarB = vVar2 != null ? vVar2.b(applicationContext) : y.f17602a.b(applicationContext);
                    }
                }
                tVar = tVarB;
                tVar2 = tVar;
            }
            while (!atomicReference.compareAndSet(obj2, tVar)) {
                if (atomicReference.get() != obj2) {
                    break;
                }
            }
            return tVar;
            tVarB = tVar2;
        }
    }
}
