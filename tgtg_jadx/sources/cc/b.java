package cc;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f7887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f7888b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, long j9) {
        super(0);
        this.f7887a = cVar;
        this.f7888b = j9;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f7887a.c(this.f7888b);
        return Unit.f26487a;
    }
}
