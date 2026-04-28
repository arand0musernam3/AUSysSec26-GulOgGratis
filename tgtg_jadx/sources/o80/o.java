package o80;

import a3.p2;
import c5.l3;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import w2.g0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class o extends m {
    public static a b(Iterator it) {
        it.getClass();
        return new a(new l3(it, 6));
    }

    public static final g c(Sequence sequence) {
        sequence.getClass();
        nv.a aVar = new nv.a(4);
        if (!(sequence instanceof s)) {
            return new g(sequence, new g0(11), aVar);
        }
        s sVar = (s) sequence;
        return new g(sVar.f32132a, sVar.f32133b, aVar);
    }

    public static Sequence d(Object obj, Function1 function1) {
        function1.getClass();
        return obj == null ? d.f32106a : new i(new hw.b(obj, 6), function1);
    }

    public static a e(Function0 function0) {
        return new a(new i(function0, new p2(11, function0)));
    }
}
