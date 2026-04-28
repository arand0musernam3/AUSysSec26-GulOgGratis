package x2;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q extends FunctionReferenceImpl implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f43768a = new q(2, v2.b.class, "contentEquals", "contentEquals(Ljava/lang/CharSequence;)Z", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(kotlin.text.y.i(((v2.b) obj).f41928c, (CharSequence) obj2));
    }
}
