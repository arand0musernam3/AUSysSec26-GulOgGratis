package d10;

import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements e, d, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13702a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f13704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13707f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Exception f13708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13709h;

    public j(int i11, o oVar) {
        this.f13703b = i11;
        this.f13704c = oVar;
    }

    public final void a() {
        int i11 = this.f13705d;
        int i12 = this.f13706e;
        int i13 = i11 + i12 + this.f13707f;
        int i14 = this.f13703b;
        if (i13 == i14) {
            Exception exc = this.f13708g;
            o oVar = this.f13704c;
            if (exc == null) {
                if (this.f13709h) {
                    oVar.s();
                    return;
                } else {
                    oVar.p(null);
                    return;
                }
            }
            int length = String.valueOf(i12).length();
            StringBuilder sb2 = new StringBuilder(String.valueOf(i14).length() + length + 8 + 24);
            sb2.append(i12);
            sb2.append(" out of ");
            sb2.append(i14);
            sb2.append(" underlying tasks failed");
            oVar.r(new ExecutionException(sb2.toString(), this.f13708g));
        }
    }

    @Override // d10.c
    public final void onCanceled() {
        synchronized (this.f13702a) {
            this.f13707f++;
            this.f13709h = true;
            a();
        }
    }

    @Override // d10.d
    public final void onFailure(Exception exc) {
        synchronized (this.f13702a) {
            this.f13706e++;
            this.f13708g = exc;
            a();
        }
    }

    @Override // d10.e
    public final void onSuccess(Object obj) {
        synchronized (this.f13702a) {
            this.f13705d++;
            a();
        }
    }
}
