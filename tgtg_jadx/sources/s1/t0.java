package s1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import z4.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m1 f38681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f38682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f38683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c6.f f38684d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(m1 m1Var, long j9, long j11, c6.f fVar) {
        super(1);
        this.f38681a = m1Var;
        this.f38682b = j9;
        this.f38683c = j11;
        this.f38684d = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j9 = this.f38682b;
        long j11 = this.f38683c;
        ((z4.l1) obj).u(this.f38681a, ((int) (j9 >> 32)) + ((int) (j11 >> 32)), ((int) (j9 & 4294967295L)) + ((int) (j11 & 4294967295L)), 0.0f, this.f38684d);
        return Unit.f26487a;
    }
}
