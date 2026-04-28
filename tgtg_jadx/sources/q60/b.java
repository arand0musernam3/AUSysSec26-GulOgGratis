package q60;

import com.tgtg.componentlibrary.component.iconbutton.PantryIconButtonDoc;
import com.tgtg.componentlibrary.component.iconbutton.model.IconButtonVariant;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.i;
import m3.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PantryIconButtonDoc f36339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IconButtonVariant f36340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f36341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f36342e;

    public /* synthetic */ b(PantryIconButtonDoc pantryIconButtonDoc, IconButtonVariant iconButtonVariant, Function2 function2, int i11, int i12) {
        this.f36338a = i12;
        this.f36339b = pantryIconButtonDoc;
        this.f36340c = iconButtonVariant;
        this.f36341d = function2;
        this.f36342e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f36338a;
        n nVar = (n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                this.f36339b.c(this.f36340c, this.f36341d, nVar, i.F(this.f36342e | 1));
                break;
            case 1:
                this.f36339b.b(this.f36340c, this.f36341d, nVar, i.F(this.f36342e | 1));
                break;
            default:
                this.f36339b.a(this.f36340c, this.f36341d, nVar, i.F(this.f36342e | 1));
                break;
        }
        return Unit.f26487a;
    }
}
