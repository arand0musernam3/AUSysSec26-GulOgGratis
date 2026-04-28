package s90;

import ia0.c0;
import ia0.i;
import ia0.j0;
import ia0.l0;
import java.io.IOException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f38907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f38908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ae.c f38909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c0 f38910d;

    public a(i iVar, ae.c cVar, c0 c0Var) {
        this.f38908b = iVar;
        this.f38909c = cVar;
        this.f38910d = c0Var;
    }

    @Override // ia0.j0
    public final long F(ia0.g gVar, long j9) throws IOException {
        gVar.getClass();
        try {
            long jF = this.f38908b.F(gVar, j9);
            c0 c0Var = this.f38910d;
            if (jF != -1) {
                gVar.A(c0Var.f23612b, gVar.f23643b - jF, jF);
                c0Var.a();
                return jF;
            }
            if (!this.f38907a) {
                this.f38907a = true;
                c0Var.close();
            }
            return -1L;
        } catch (IOException e5) {
            if (this.f38907a) {
                throw e5;
            }
            this.f38907a = true;
            this.f38909c.a();
            throw e5;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        boolean zG;
        if (!this.f38907a) {
            TimeZone timeZone = r90.g.f37815a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                zG = r90.g.g(this, 100);
            } catch (IOException unused) {
                zG = false;
            }
            if (!zG) {
                this.f38907a = true;
                this.f38909c.a();
            }
        }
        this.f38908b.close();
    }

    @Override // ia0.j0
    public final l0 i() {
        return this.f38908b.i();
    }
}
