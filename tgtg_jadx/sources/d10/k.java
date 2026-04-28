package d10;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import o30.m0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k implements m, e, d, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f13711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f13712c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f13713d;

    public /* synthetic */ k(Executor executor, b bVar, o oVar, int i11) {
        this.f13710a = i11;
        this.f13711b = executor;
        this.f13712c = bVar;
        this.f13713d = oVar;
    }

    @Override // d10.m
    public final void a(Task task) {
        switch (this.f13710a) {
            case 0:
                this.f13711b.execute(new x0.f(this, task, false, 6));
                break;
            default:
                this.f13711b.execute(new m0(this, task, false, 5));
                break;
        }
    }

    @Override // d10.m
    public final void b() {
        switch (this.f13710a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // d10.c
    public void onCanceled() {
        this.f13713d.s();
    }

    @Override // d10.d
    public void onFailure(Exception exc) {
        this.f13713d.r(exc);
    }

    @Override // d10.e
    public void onSuccess(Object obj) {
        this.f13713d.p(obj);
    }
}
