package zendesk.ui.android.compose.utils;

import b4.a;
import b4.t;
import c5.m2;
import c5.x1;
import f4.g;
import i80.n;
import kotlin.Metadata;
import m3.s;
import org.jetbrains.annotations.NotNull;
import z5.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lb4/t;", "mirror", "(Lb4/t;)Lb4/t;", "zendesk.ui_ui-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ModifierExtensionsKt {
    @NotNull
    public static final t mirror(@NotNull t tVar) {
        tVar.getClass();
        return a.a(tVar, m2.f7291a, new n() { // from class: zendesk.ui.android.compose.utils.ModifierExtensionsKt.mirror.1
            public final t invoke(t tVar2, m3.n nVar, int i11) {
                tVar2.getClass();
                s sVar = (s) nVar;
                sVar.a0(-728381788);
                if (sVar.j(x1.f7421n) == m.Rtl) {
                    tVar2 = g.j(tVar2, -1.0f, 1.0f);
                }
                sVar.q(false);
                return tVar2;
            }

            @Override // i80.n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((t) obj, (m3.n) obj2, ((Number) obj3).intValue());
            }
        });
    }
}
