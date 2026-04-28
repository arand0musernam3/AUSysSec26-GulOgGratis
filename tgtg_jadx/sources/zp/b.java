package zp;

import com.app.tgtg.model.remote.item.response.BasicItem;
import f70.i;
import i80.o;
import kotlin.Unit;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b extends FunctionReferenceImpl implements o {
    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        BasicItem basicItem = (BasicItem) obj;
        String str = (String) obj2;
        String str2 = (String) obj3;
        i iVar = (i) obj4;
        basicItem.getClass();
        iVar.getClass();
        g gVar = (g) this.receiver;
        gVar.getClass();
        vp.a aVar = gVar.f48027e;
        aVar.getClass();
        f70.g gVar2 = aVar.f42511a;
        mk.c cVar = new mk.c(basicItem.getInformation().mo340getItemIdFvU5WIY(), mv.d.s(basicItem));
        cVar.f29986i = iVar;
        if (str != null) {
            cVar.f29981d = str;
        }
        if (str2 != null) {
            cVar.f29984g = str2;
        }
        gVar2.a(cVar.a());
        return Unit.f26487a;
    }
}
