package pc;

import android.graphics.Bitmap;
import zc.k;
import zc.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h f34647j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public q f34648k;
    public k l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f34649m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Bitmap f34650n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f34651o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f34652p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f34653q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, z70.c cVar) {
        super(cVar);
        this.f34652p = hVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f34651o = obj;
        this.f34653q |= Integer.MIN_VALUE;
        return h.a(this.f34652p, null, 0, this);
    }
}
