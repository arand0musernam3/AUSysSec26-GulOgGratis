package nn;

import android.content.SharedPreferences;
import com.app.tgtg.model.remote.profile.response.ProfileFeatureState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mn.l f31148b;

    public /* synthetic */ i(mn.l lVar, int i11) {
        this.f31147a = i11;
        this.f31148b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f31147a) {
            case 0:
                this.f31148b.b(((Boolean) obj).booleanValue());
                break;
            case 1:
                ProfileFeatureState profileFeatureState = (ProfileFeatureState) obj;
                profileFeatureState.getClass();
                this.f31148b.F = profileFeatureState;
                break;
            default:
                kn.c cVar = (kn.c) obj;
                cVar.getClass();
                this.f31148b.f30019a.getClass();
                String strC = n90.c.f30748d.c(kn.c.Companion.serializer(), cVar);
                SharedPreferences.Editor editorEdit = ft.c.x().edit();
                String strY = ft.c.y();
                if (strY == null) {
                    strY = null;
                }
                editorEdit.putString(strY + "_profileAvatarDesign", strC);
                editorEdit.apply();
                break;
        }
        return Unit.f26487a;
    }
}
