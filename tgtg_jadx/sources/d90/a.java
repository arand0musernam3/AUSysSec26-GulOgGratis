package d90;

import com.google.firebase.messaging.r;
import i80.n;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.FunctionReferenceImpl;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a extends FunctionReferenceImpl implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f14766a = new a(3, b.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b bVar = (b) obj;
        e eVar = (e) obj2;
        long j9 = bVar.f14767a;
        if (j9 <= 0) {
            eVar.f14785e = Unit.f26487a;
        } else {
            r rVar = new r(7, eVar, bVar);
            eVar.getClass();
            CoroutineContext coroutineContext = eVar.f14781a;
            eVar.f14783c = f0.r(coroutineContext).L(j9, rVar, coroutineContext);
        }
        return Unit.f26487a;
    }
}
