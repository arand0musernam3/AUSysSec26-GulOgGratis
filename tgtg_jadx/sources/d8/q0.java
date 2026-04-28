package d8;

import java.io.FileInputStream;
import java.nio.channels.FileLock;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e90.c f14678j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public FileInputStream f14679k;
    public FileLock l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f14680m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f14681n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r0 f14682o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f14683p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(r0 r0Var, z70.c cVar) {
        super(cVar);
        this.f14682o = r0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f14681n = obj;
        this.f14683p |= Integer.MIN_VALUE;
        return this.f14682o.a(null, this);
    }
}
