package g60;

import com.tgtg.componentlibrary.component.button.PantryButtonDoc;
import com.tgtg.componentlibrary.component.button.model.ButtonVariant;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.i;
import m3.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PantryButtonDoc f20058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ButtonVariant f20059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20060d;

    public /* synthetic */ c(PantryButtonDoc pantryButtonDoc, ButtonVariant buttonVariant, int i11, int i12) {
        this.f20057a = i12;
        this.f20058b = pantryButtonDoc;
        this.f20059c = buttonVariant;
        this.f20060d = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f20057a;
        n nVar = (n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                this.f20058b.b(this.f20059c, nVar, i.F(this.f20060d | 1));
                break;
            case 1:
                this.f20058b.a(this.f20059c, nVar, i.F(this.f20060d | 1));
                break;
            default:
                this.f20058b.c(this.f20059c, nVar, i.F(this.f20060d | 1));
                break;
        }
        return Unit.f26487a;
    }
}
