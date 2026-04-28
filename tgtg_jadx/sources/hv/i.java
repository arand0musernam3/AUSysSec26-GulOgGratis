package hv;

import android.app.Activity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Activity f22523j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f22524k;
    public String l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Function0 f22525m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f22526n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f22527o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f22528p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, z70.c cVar) {
        super(cVar);
        this.f22527o = jVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f22526n = obj;
        this.f22528p |= Integer.MIN_VALUE;
        return this.f22527o.c(null, null, null, null, this);
    }
}
