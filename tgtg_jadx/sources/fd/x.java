package fd;

import android.content.Context;
import com.google.firebase.messaging.a0;
import java.util.LinkedHashMap;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements v {
    @Override // fd.v
    public final t b(Context context) {
        a0 a0Var = new a0(context);
        i iVar = (i) a0Var.f12782e;
        j jVar = y.f17603b;
        Unit unit = Unit.f26487a;
        LinkedHashMap linkedHashMap = iVar.f17566a;
        if (unit != null) {
            linkedHashMap.put(jVar, unit);
        } else {
            linkedHashMap.remove(jVar);
        }
        return a0Var.x();
    }
}
