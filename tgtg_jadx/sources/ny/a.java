package ny;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f31450a = new a(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list = (List) obj;
        list.getClass();
        String str = (String) ((Pair) list.get(0)).f26485a;
        Pair pair = (Pair) list.get(1);
        String str2 = (String) pair.f26485a;
        int iIntValue = ((Number) pair.f26486b).intValue();
        if (StringsKt.H(str) && StringsKt.H(str2)) {
            return Integer.valueOf(iIntValue);
        }
        return null;
    }
}
