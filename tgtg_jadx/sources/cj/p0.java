package cj;

import java.util.Iterator;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p0 extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f8320j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Ref.BooleanRef f8321k;
    public Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Iterator f8322m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f8323n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f8324o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f8325p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8326q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f8327r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s0 f8328s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f8329t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(s0 s0Var, z70.c cVar) {
        super(cVar);
        this.f8328s = s0Var;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f8327r = obj;
        this.f8329t |= Integer.MIN_VALUE;
        return s0.a(this.f8328s, null, this);
    }
}
