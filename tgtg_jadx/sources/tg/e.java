package tg;

import com.app.tgtg.model.remote.user.response.Address;
import ft.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f40152j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ i f40153k;
    public final /* synthetic */ String l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(i iVar, String str, x70.c cVar, int i11) {
        super(2, cVar);
        this.f40152j = i11;
        this.f40153k = iVar;
        this.l = str;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f40152j) {
            case 0:
                return new e(this.f40153k, this.l, cVar, 0);
            default:
                return new e(this.f40153k, this.l, cVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f40152j) {
        }
        return ((e) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f40152j;
        String str = this.l;
        i iVar = this.f40153k;
        switch (i11) {
            case 0:
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                j jVar = iVar.f40164c;
                Address address = iVar.f40162a.a().f25302d;
                if (address != null) {
                    iVar.f(str, address.getCenter());
                } else if (jVar.h()) {
                    jVar.e(true, new bs.c(7, iVar, str));
                } else {
                    iVar.f(str, null);
                }
                break;
            default:
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                ba0.g.M(obj);
                iVar.i(cv.i.SCREEN_ADD_LOCATION, str, iVar.b());
                break;
        }
        return Unit.f26487a;
    }
}
