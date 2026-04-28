package e;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import zendesk.ui.android.compose.theme.ThemeKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f15279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f15280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u70.f f15282e;

    public /* synthetic */ d(boolean z11, u70.f fVar, int i11, int i12, int i13) {
        this.f15278a = i13;
        this.f15279b = z11;
        this.f15282e = fVar;
        this.f15280c = i11;
        this.f15281d = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15278a) {
            case 0:
                ((Integer) obj2).getClass();
                int iF = m3.i.F(this.f15280c | 1);
                jf.e.a(this.f15279b, (Function0) this.f15282e, (m3.n) obj, iF, this.f15281d);
                return Unit.f26487a;
            default:
                int iIntValue = ((Integer) obj2).intValue();
                return ThemeKt.UiComposeAndroidTheme$lambda$0(this.f15279b, (Function2) this.f15282e, this.f15280c, this.f15281d, (m3.n) obj, iIntValue);
        }
    }
}
