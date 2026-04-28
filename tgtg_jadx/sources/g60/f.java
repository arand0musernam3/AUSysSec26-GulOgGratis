package g60;

import com.tgtg.componentlibrary.component.button.PantryButtonKt;
import com.tgtg.componentlibrary.component.button.model.ButtonGeometry;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.i;
import m3.n;
import m3.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20065a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f20066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f20067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ButtonGeometry f20068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f20069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function2 f20070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Function2 f20071g;

    public /* synthetic */ f(String str, boolean z11, ButtonGeometry buttonGeometry, long j9, Function2 function2, Function2 function22) {
        this.f20066b = str;
        this.f20067c = z11;
        this.f20068d = buttonGeometry;
        this.f20069e = j9;
        this.f20070f = function2;
        this.f20071g = function22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20065a) {
            case 0:
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    PantryButtonKt.a(this.f20066b, this.f20067c, this.f20068d, this.f20069e, this.f20070f, this.f20071g, sVar, 0);
                } else {
                    sVar.U();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                PantryButtonKt.a(this.f20066b, this.f20067c, this.f20068d, this.f20069e, this.f20070f, this.f20071g, (n) obj, i.F(1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ f(String str, boolean z11, ButtonGeometry buttonGeometry, long j9, Function2 function2, Function2 function22, int i11) {
        this.f20066b = str;
        this.f20067c = z11;
        this.f20068d = buttonGeometry;
        this.f20069e = j9;
        this.f20070f = function2;
        this.f20071g = function22;
    }
}
