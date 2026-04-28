package c5;

import android.content.res.Resources;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q extends FunctionReferenceImpl implements i80.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7321a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(x80.i iVar, int i11) {
        super(3, iVar, x80.i.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        this.f7321a = i11;
        switch (i11) {
            case 5:
                super(3, iVar, x80.i.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
                break;
            default:
                break;
        }
    }

    @Override // i80.n
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f7321a) {
            case 0:
                if (obj != null) {
                    org.bouncycastle.jce.provider.a.c();
                } else {
                    y yVar = (y) this.receiver;
                    Resources resources = yVar.getContext().getResources();
                }
                break;
            case 1:
                ((fn.c) this.receiver).e((String) obj, (String) obj2, (String) obj3);
                break;
            case 2:
                ct.a aVar = (ct.a) obj2;
                aVar.getClass();
                al.p pVar = (al.p) this.receiver;
                pVar.getClass();
                at.c0.c(pVar.f1576o, (String) obj, aVar, (Integer) obj3, false, 24);
                break;
            case 3:
                ct.a aVar2 = (ct.a) obj2;
                aVar2.getClass();
                al.p pVar2 = (al.p) this.receiver;
                pVar2.getClass();
                at.c0.c(pVar2.f1576o, (String) obj, aVar2, (Integer) obj3, false, 24);
                break;
            case 4:
                Function1 function1 = ((x80.i) this.receiver).f44052b;
                function1.getClass();
                a90.g.a(function1, obj2, (CoroutineContext) obj3);
                break;
            default:
                Object obj4 = ((x80.p) obj2).f44078a;
                Function1 function12 = ((x80.i) this.receiver).f44052b;
                function12.getClass();
                Object objA = x80.p.a(obj4);
                objA.getClass();
                a90.g.a(function12, objA, (CoroutineContext) obj3);
                break;
        }
        return Unit.f26487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Object obj) {
        super(3, obj, fn.c.class, "goToFlashSalesList", "goToFlashSalesList(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
        this.f7321a = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i11, Object obj, Class cls, String str, String str2, int i12, int i13) {
        super(i11, obj, cls, str, str2, i12);
        this.f7321a = i13;
    }
}
