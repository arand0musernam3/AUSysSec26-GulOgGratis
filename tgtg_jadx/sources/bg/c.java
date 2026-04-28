package bg;

import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6127a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f6129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f6133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u70.f f6134h;

    public /* synthetic */ c(BaseItemMnuV2 baseItemMnuV2, boolean z11, int i11, BasketManager basketManager, int i12, Function1 function1, int i13) {
        this.f6132f = baseItemMnuV2;
        this.f6128b = z11;
        this.f6129c = i11;
        this.f6133g = basketManager;
        this.f6130d = i12;
        this.f6134h = function1;
        this.f6131e = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f6127a) {
            case 0:
                ((Integer) obj2).getClass();
                m.b((Function0) this.f6132f, (Function0) this.f6133g, (Function0) this.f6134h, this.f6129c, this.f6130d, this.f6128b, (m3.n) obj, m3.i.F(this.f6131e | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                jb.u.g((BaseItemMnuV2) this.f6132f, this.f6128b, this.f6129c, (BasketManager) this.f6133g, this.f6130d, (Function1) this.f6134h, (m3.n) obj, m3.i.F(this.f6131e | 1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ c(Function0 function0, Function0 function02, Function0 function03, int i11, int i12, boolean z11, int i13) {
        this.f6132f = function0;
        this.f6133g = function02;
        this.f6134h = function03;
        this.f6129c = i11;
        this.f6130d = i12;
        this.f6128b = z11;
        this.f6131e = i13;
    }
}
