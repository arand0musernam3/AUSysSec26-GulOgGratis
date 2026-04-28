package gt;

import com.app.tgtg.model.local.ViewedRecipe;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f20902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewedRecipe f20903c;

    public /* synthetic */ z(a0 a0Var, ViewedRecipe viewedRecipe, int i11) {
        this.f20901a = i11;
        this.f20902b = a0Var;
        this.f20903c = viewedRecipe;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ha.a aVar = (ha.a) obj;
        switch (this.f20901a) {
            case 0:
                aVar.getClass();
                this.f20902b.f20831b.v(aVar, this.f20903c);
                break;
            default:
                aVar.getClass();
                this.f20902b.f20832c.c(aVar, this.f20903c);
                break;
        }
        return Unit.f26487a;
    }
}
