package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f3057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z f3058b;

    public w(z zVar) {
        this.f3057a = zVar;
        if (zVar.g()) {
            i4.a.f("Default instance must be immutable.");
            throw null;
        }
        this.f3058b = zVar.i();
    }

    public final z a() {
        z zVarB = b();
        zVarB.getClass();
        if (z.f(zVarB, true)) {
            return zVarB;
        }
        throw new UninitializedMessageException();
    }

    public final z b() {
        boolean zG = this.f3058b.g();
        z zVar = this.f3058b;
        if (!zG) {
            return zVar;
        }
        zVar.getClass();
        x0 x0Var = x0.f3059c;
        x0Var.getClass();
        x0Var.a(zVar.getClass()).c(zVar);
        zVar.h();
        return this.f3058b;
    }

    public final void c() {
        if (this.f3058b.g()) {
            return;
        }
        z zVarI = this.f3057a.i();
        z zVar = this.f3058b;
        x0 x0Var = x0.f3059c;
        x0Var.getClass();
        x0Var.a(zVarI.getClass()).a(zVarI, zVar);
        this.f3058b = zVarI;
    }

    public final Object clone() {
        w wVar = (w) this.f3057a.c(y.NEW_BUILDER);
        wVar.f3058b = b();
        return wVar;
    }
}
