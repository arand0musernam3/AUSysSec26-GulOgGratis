package i3;

import com.app.tgtg.model.remote.Server;
import g3.l9;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import m3.b1;
import m3.c3;
import t1.p1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23132a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c3 f23133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f23134c;

    public /* synthetic */ j0(l9 l9Var, p1 p1Var, b1 b1Var) {
        this.f23133b = p1Var;
        this.f23134c = b1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        switch (this.f23132a) {
            case 0:
                h4.e eVar = (h4.e) obj;
                float fFloatValue = ((Number) this.f23133b.getValue()).floatValue();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (eVar.f21392a >> 32)) * fFloatValue;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (eVar.f21392a & 4294967295L)) * fFloatValue;
                b1 b1Var = this.f23134c;
                if (Float.intBitsToFloat((int) (((h4.e) b1Var.getValue()).f21392a >> 32)) != fIntBitsToFloat || Float.intBitsToFloat((int) (((h4.e) b1Var.getValue()).f21392a & 4294967295L)) != fIntBitsToFloat2) {
                    b1Var.setValue(new h4.e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L)));
                }
                break;
            default:
                String str = (String) obj;
                str.getClass();
                List list = (List) this.f23133b.getValue();
                if (list != null) {
                    arrayList = new ArrayList(list.size());
                    int size = list.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        Object obj2 = list.get(i11);
                        if (StringsKt.z(((Server) obj2).getName(), str, true)) {
                            arrayList.add(obj2);
                        }
                    }
                } else {
                    arrayList = null;
                }
                this.f23134c.setValue(arrayList);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ j0(b1 b1Var, b1 b1Var2) {
        this.f23133b = b1Var;
        this.f23134c = b1Var2;
    }
}
