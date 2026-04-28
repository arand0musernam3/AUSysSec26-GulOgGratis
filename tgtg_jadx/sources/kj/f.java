package kj;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import m3.c3;
import m3.h1;
import y80.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1 f26450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f26451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c3 f26452d;

    public f(int i11, h1 h1Var, Function1 function1, c3 c3Var) {
        this.f26449a = i11;
        this.f26450b = h1Var;
        this.f26451c = function1;
        this.f26452d = c3Var;
    }

    @Override // y80.j
    public final Object emit(Object obj, x70.c cVar) {
        ((Boolean) obj).getClass();
        int iIntValue = ((Number) this.f26452d.getValue()).intValue() % this.f26449a;
        this.f26450b.i(iIntValue);
        this.f26451c.invoke(new Integer(iIntValue));
        return Unit.f26487a;
    }
}
