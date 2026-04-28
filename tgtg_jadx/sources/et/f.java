package et;

import com.app.tgtg.model.remote.brief.BriefOrder;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f16372j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f16373k;
    public Iterator l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public BriefOrder f16374m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Iterator f16375n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public BriefOrder f16376o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f16377p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f16378q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16379r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f16380s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ z f16381t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f16382u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(z zVar, z70.c cVar) {
        super(cVar);
        this.f16381t = zVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f16380s = obj;
        this.f16382u |= Integer.MIN_VALUE;
        return this.f16381t.e(null, this);
    }
}
