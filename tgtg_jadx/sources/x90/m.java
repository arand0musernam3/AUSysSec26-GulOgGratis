package x90;

import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f44129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f44130b;

    public m(n nVar, r rVar) {
        this.f44130b = nVar;
        this.f44129a = rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [x90.n] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [x90.b] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
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
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Throwable {
        Throwable th2;
        b bVar;
        ?? r02 = this.f44130b;
        r rVar = this.f44129a;
        b bVar2 = b.INTERNAL_ERROR;
        ?? r32 = 1;
        IOException e5 = null;
        try {
            try {
                try {
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (IOException e11) {
                e5 = e11;
                bVar = bVar2;
            }
            if (!rVar.a(true, this)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            do {
                try {
                } catch (Throwable th4) {
                    th2 = th4;
                }
            } while (rVar.a(false, this));
            bVar = b.NO_ERROR;
            try {
                bVar2 = b.CANCEL;
                r02.a(bVar, bVar2, null);
                r32 = bVar;
            } catch (IOException e12) {
                e5 = e12;
                bVar2 = b.PROTOCOL_ERROR;
                r02.a(bVar2, bVar2, e5);
                r32 = bVar;
            }
            r90.e.b(rVar);
            return Unit.f26487a;
        } catch (Throwable th5) {
            th2 = th5;
        }
        r32 = bVar2;
        r02.a(r32, bVar2, e5);
        r90.e.b(rVar);
        throw th2;
    }
}
