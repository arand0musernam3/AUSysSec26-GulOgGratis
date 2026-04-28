package om;

import com.app.tgtg.model.remote.ItemId;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f32654b;

    public /* synthetic */ f(l lVar, int i11) {
        this.f32653a = i11;
        this.f32654b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f32653a) {
            case 0:
                String strM205unboximpl = ((ItemId) obj).m205unboximpl();
                strM205unboximpl.getClass();
                this.f32654b.G(strM205unboximpl, f70.i.SCREEN_BROWSE_LIST);
                break;
            case 1:
                String strM205unboximpl2 = ((ItemId) obj).m205unboximpl();
                strM205unboximpl2.getClass();
                this.f32654b.G(strM205unboximpl2, f70.i.SCREEN_BROWSE_LIST);
                break;
            case 2:
                String strM205unboximpl3 = ((ItemId) obj).m205unboximpl();
                strM205unboximpl3.getClass();
                this.f32654b.G(strM205unboximpl3, f70.i.SCREEN_BROWSE_MAP);
                break;
            default:
                String strM205unboximpl4 = ((ItemId) obj).m205unboximpl();
                strM205unboximpl4.getClass();
                this.f32654b.G(strM205unboximpl4, f70.i.SCREEN_BROWSE_MAP);
                break;
        }
        return Unit.f26487a;
    }
}
