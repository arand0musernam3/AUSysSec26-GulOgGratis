package z3;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f46969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f46970c;

    public /* synthetic */ a(int i11, Object obj, Function1 function1) {
        this.f46968a = i11;
        this.f46969b = function1;
        this.f46970c = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j9;
        switch (this.f46968a) {
            case 0:
                k kVar = (k) obj;
                synchronized (l.f47038c) {
                    j9 = l.f47040e;
                    l.f47040e = ((long) 1) + j9;
                }
                return new c(j9, kVar, this.f46969b, (Function1) this.f46970c);
            default:
                return ((w2.g0) this.f46969b).invoke(((ArrayList) this.f46970c).get(((Number) obj).intValue()));
        }
    }
}
