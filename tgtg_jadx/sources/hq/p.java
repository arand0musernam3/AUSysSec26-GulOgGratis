package hq;

import android.content.Context;
import android.util.AttributeSet;
import mv.e0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class p extends j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f22395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f22396e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Context context, int i11) {
        super(context);
        this.f22395d = i11;
    }

    @Override // hq.j
    public final void b() {
        switch (this.f22395d) {
            case 0:
                if (!this.f22396e) {
                    this.f22396e = true;
                    c cVar = (c) this;
                    ag.i iVar = ((ag.j) ((d) a())).f1360a;
                    cVar.f22383c = (cv.b) iVar.E.get();
                    cVar.f22344f = (e0) iVar.f1327i0.get();
                }
                break;
            case 1:
                if (!this.f22396e) {
                    this.f22396e = true;
                    ((l) this).f22383c = (cv.b) ((ag.j) ((m) a())).f1360a.E.get();
                }
                break;
            case 2:
                if (!this.f22396e) {
                    this.f22396e = true;
                    ((u) this).f22383c = (cv.b) ((ag.j) ((v) a())).f1360a.E.get();
                }
                break;
            case 3:
                if (!this.f22396e) {
                    this.f22396e = true;
                    w wVar = (w) this;
                    ag.i iVar2 = ((ag.j) ((x) a())).f1360a;
                    wVar.f22383c = (cv.b) iVar2.E.get();
                    wVar.f22414k = (gv.b) iVar2.f1329j0.get();
                }
                break;
            case 4:
                if (!this.f22396e) {
                    this.f22396e = true;
                    ((y) this).f22383c = (cv.b) ((ag.j) ((z) a())).f1360a.E.get();
                }
                break;
            case 5:
                if (!this.f22396e) {
                    this.f22396e = true;
                    ((jq.b) this).f22383c = (cv.b) ((ag.j) ((jq.c) a())).f1360a.E.get();
                }
                break;
            default:
                if (!this.f22396e) {
                    this.f22396e = true;
                    ((kp.d) this).f22383c = (cv.b) ((ag.j) ((kp.e) a())).f1360a.E.get();
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet);
        this.f22395d = i11;
    }
}
