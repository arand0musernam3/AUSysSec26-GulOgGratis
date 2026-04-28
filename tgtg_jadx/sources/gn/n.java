package gn;

import com.app.tgtg.model.remote.ItemId;
import com.app.tgtg.model.remote.item.response.BasicItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f20633b;

    public /* synthetic */ n(Function1 function1, int i11) {
        this.f20632a = i11;
        this.f20633b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j9;
        switch (this.f20632a) {
            case 0:
                BasicItem basicItem = (BasicItem) obj;
                basicItem.getClass();
                this.f20633b.invoke(basicItem);
                return Unit.f26487a;
            case 1:
                String strM205unboximpl = ((ItemId) obj).m205unboximpl();
                strM205unboximpl.getClass();
                this.f20633b.invoke(ItemId.m197boximpl(strM205unboximpl));
                return Unit.f26487a;
            case 2:
                return this.f20633b.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
            case 3:
                String strM205unboximpl2 = ((ItemId) obj).m205unboximpl();
                strM205unboximpl2.getClass();
                this.f20633b.invoke(ItemId.m197boximpl(strM205unboximpl2));
                return Unit.f26487a;
            case 4:
                String strM205unboximpl3 = ((ItemId) obj).m205unboximpl();
                strM205unboximpl3.getClass();
                this.f20633b.invoke(ItemId.m197boximpl(strM205unboximpl3));
                return Unit.f26487a;
            case 5:
                String strM205unboximpl4 = ((ItemId) obj).m205unboximpl();
                strM205unboximpl4.getClass();
                this.f20633b.invoke(ItemId.m197boximpl(strM205unboximpl4));
                return Unit.f26487a;
            case 6:
                String strM205unboximpl5 = ((ItemId) obj).m205unboximpl();
                strM205unboximpl5.getClass();
                this.f20633b.invoke(ItemId.m197boximpl(strM205unboximpl5));
                return Unit.f26487a;
            case 7:
                BasicItem basicItem2 = (BasicItem) obj;
                basicItem2.getClass();
                this.f20633b.invoke(ItemId.m197boximpl(basicItem2.getInformation().mo340getItemIdFvU5WIY()));
                return Unit.f26487a;
            case 8:
                BasicItem basicItem3 = (BasicItem) obj;
                basicItem3.getClass();
                this.f20633b.invoke(basicItem3);
                return Unit.f26487a;
            default:
                z3.k kVar = (z3.k) obj;
                synchronized (z3.l.f47038c) {
                    j9 = z3.l.f47040e;
                    z3.l.f47040e = ((long) 1) + j9;
                }
                return new z3.f(j9, kVar, this.f20633b);
        }
    }
}
