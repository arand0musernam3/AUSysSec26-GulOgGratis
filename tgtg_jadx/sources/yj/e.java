package yj;

import com.app.tgtg.model.local.SnackBarType;
import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.item.response.BasicItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.b1;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f46060j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f46061k;
    public final /* synthetic */ xj.k l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ BasicItem f46062m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Function1 f46063n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ b1 f46064o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, boolean z11, xj.k kVar, BasicItem basicItem, Function1 function1, b1 b1Var, x70.c cVar) {
        super(2, cVar);
        this.f46060j = str;
        this.f46061k = z11;
        this.l = kVar;
        this.f46062m = basicItem;
        this.f46063n = function1;
        this.f46064o = b1Var;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new e(this.f46060j, this.f46061k, this.l, this.f46062m, this.f46063n, this.f46064o, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        String str = this.f46060j;
        if (str != null && this.f46061k) {
            xj.k kVar = this.l;
            kVar.a(str, false);
            if (ItemId.m201equalsimpl0(str, this.f46062m.getInformation().mo340getItemIdFvU5WIY())) {
                this.f46064o.setValue(Boolean.TRUE);
                this.f46063n.invoke(SnackBarType.FAVORITE_REMINDER);
            }
            kVar.I = null;
        }
        return Unit.f26487a;
    }
}
