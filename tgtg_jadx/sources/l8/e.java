package l8;

import android.os.Build;
import com.google.firebase.messaging.a0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends h0.g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f27448f;

    public e(f fVar) {
        super(14);
        this.f27448f = fVar;
    }

    @Override // h0.g
    public final void B(Throwable th2) {
        ((j) this.f27448f.f27451c).f(th2);
    }

    @Override // h0.g
    public final void C(a0 a0Var) {
        f fVar = this.f27448f;
        fVar.f27450b = a0Var;
        a0 a0Var2 = (a0) fVar.f27450b;
        j jVar = (j) fVar.f27451c;
        fVar.f27449a = new j30.g(a0Var2, jVar.f27463g, jVar.f27465i, Build.VERSION.SDK_INT >= 34 ? o.a() : jb.u.C());
        j jVar2 = (j) fVar.f27451c;
        ArrayList arrayList = new ArrayList();
        jVar2.f27457a.writeLock().lock();
        try {
            jVar2.f27459c = 1;
            arrayList.addAll(jVar2.f27458b);
            jVar2.f27458b.clear();
            jVar2.f27457a.writeLock().unlock();
            jVar2.f27460d.post(new e7.a(arrayList, jVar2.f27459c, (Throwable) null));
        } catch (Throwable th2) {
            jVar2.f27457a.writeLock().unlock();
            throw th2;
        }
    }
}
