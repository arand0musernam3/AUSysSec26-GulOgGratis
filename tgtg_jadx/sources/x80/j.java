package x80;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j extends FunctionReferenceImpl implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f44054a = new j(2, k.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        long jLongValue = ((Number) obj).longValue();
        q qVar = (q) obj2;
        q qVar2 = k.f44055a;
        i iVar = qVar.f44079e;
        iVar.getClass();
        return new q(jLongValue, qVar, iVar, 0);
    }
}
