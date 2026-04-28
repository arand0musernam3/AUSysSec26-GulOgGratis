package i90;

import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m90.r1;
import o30.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f23589b;

    public /* synthetic */ e(f fVar, int i11) {
        this.f23588a = i11;
        this.f23589b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        k90.a aVar = (k90.a) obj;
        switch (this.f23588a) {
            case 0:
                aVar.getClass();
                f0.R(StringCompanionObject.INSTANCE);
                k90.a.a(aVar, "type", r1.f29849b);
                StringBuilder sb2 = new StringBuilder("kotlinx.serialization.Sealed<");
                f fVar = this.f23589b;
                sb2.append(fVar.f23590a.getSimpleName());
                sb2.append('>');
                e eVar = new e(fVar, 1);
                k90.a.a(aVar, "value", ox.h.o(sb2.toString(), k90.h.f26238j, new SerialDescriptor[0], eVar));
                List list = fVar.f23591b;
                list.getClass();
                aVar.f26203b = list;
                break;
            default:
                aVar.getClass();
                for (Map.Entry entry : this.f23589b.f23594e.entrySet()) {
                    k90.a.a(aVar, (String) entry.getKey(), ((KSerializer) entry.getValue()).getDescriptor());
                }
                break;
        }
        return Unit.f26487a;
    }
}
