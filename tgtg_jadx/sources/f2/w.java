package f2;

import h2.t0;
import m3.h1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1 f17224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h1 f17225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f17227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t0 f17228f;

    public w(int i11, int i12, int i13) {
        this.f17223a = i13;
        switch (i13) {
            case 1:
                this.f17224b = new h1(i11);
                this.f17225c = new h1(i12);
                this.f17228f = new t0(i11, 90, 200);
                break;
            default:
                this.f17224b = new h1(i11);
                this.f17225c = new h1(i12);
                this.f17228f = new t0(i11, 30, 100);
                break;
        }
    }

    public final void a(int i11, int i12) {
        switch (this.f17223a) {
            case 0:
                if (i11 < 0.0f) {
                    c2.a.a("Index should be non-negative (" + i11 + ')');
                }
                this.f17224b.i(i11);
                this.f17228f.b(i11);
                this.f17225c.i(i12);
                break;
            default:
                if (i11 < 0.0f) {
                    c2.a.a("Index should be non-negative");
                }
                this.f17224b.i(i11);
                this.f17228f.b(i11);
                this.f17225c.i(i12);
                break;
        }
    }
}
