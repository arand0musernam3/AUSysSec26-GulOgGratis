package oo;

import com.tgtg.componentlibrary.component.pageheader.DemoPantryPageHeaderKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import o30.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class v implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f32873c;

    public /* synthetic */ v(int i11, int i12) {
        this.f32871a = 2;
        this.f32872b = i11;
        this.f32873c = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        m3.n nVar = (m3.n) obj;
        Integer num = (Integer) obj2;
        switch (this.f32871a) {
            case 0:
                num.getClass();
                a.c(this.f32872b, this.f32873c, nVar, m3.i.F(1));
                break;
            case 1:
                num.getClass();
                os.a.g(this.f32872b, this.f32873c, nVar, m3.i.F(385));
                break;
            case 2:
                num.intValue();
                DemoPantryPageHeaderKt.a(this.f32872b, nVar, m3.i.F(this.f32873c | 1));
                break;
            default:
                num.getClass();
                f0.r(this.f32872b, this.f32873c, nVar, m3.i.F(1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ v(int i11, int i12, int i13, int i14) {
        this.f32871a = i14;
        this.f32872b = i11;
        this.f32873c = i12;
    }
}
