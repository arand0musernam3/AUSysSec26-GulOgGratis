package q1;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import m3.c3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f35765b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(Map map, long j9) {
        super(1);
        this.f35764a = 7;
        this.f35765b = map;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f35764a) {
            case 0:
                if (obj != ((i1) this.f35765b)) {
                    break;
                }
                break;
            case 1:
                ((qf.a) this.f35765b).f37037h.h(((Boolean) obj).booleanValue() ? "#!upload" : "#!maxRetryAttemptReached");
                break;
            case 2:
                break;
            case 3:
                t1.n nVar = (t1.n) obj;
                float f11 = nVar.f39497b;
                if (f11 < 0.0f) {
                    f11 = 0.0f;
                }
                if (f11 > 1.0f) {
                    f11 = 1.0f;
                }
                float f12 = nVar.f39498c;
                if (f12 < -0.5f) {
                    f12 = -0.5f;
                }
                if (f12 > 0.5f) {
                    f12 = 0.5f;
                }
                float f13 = nVar.f39499d;
                float f14 = f13 >= -0.5f ? f13 : -0.5f;
                float f15 = f14 <= 0.5f ? f14 : 0.5f;
                float f16 = nVar.f39496a;
                float f17 = f16 >= 0.0f ? f16 : 0.0f;
                break;
            case 4:
                break;
            case 5:
                ((i4.s0) obj).c(((Number) ((c3) this.f35765b).getValue()).floatValue());
                break;
            case 6:
                of.a aVar = (of.a) obj;
                aVar.getClass();
                aVar.a(((tf.d) this.f35765b).f40119a, tf.b.CACHE);
                break;
            case 7:
                of.a aVar2 = (of.a) obj;
                aVar2.getClass();
                aVar2.a((Map) this.f35765b, tf.b.REMOTE);
                break;
            case 8:
                ((Context) obj).getClass();
                break;
            case 9:
                Throwable th2 = (Throwable) obj;
                w4.k0 k0Var = (w4.k0) this.f35765b;
                v80.l lVar = k0Var.f43141c;
                if (lVar != null) {
                    lVar.j(th2);
                }
                k0Var.f43141c = null;
                break;
            default:
                ye.i iVar = (ye.i) obj;
                iVar.getClass();
                ye.g gVar = (ye.g) this.f35765b;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (iVar.f45907a) {
                    linkedHashSet.add(ye.e.SESSIONS);
                }
                if (iVar.f45908b) {
                    linkedHashSet.add(ye.e.APP_LIFECYCLES);
                }
                if (iVar.f45909c) {
                    linkedHashSet.add(ye.e.DEEP_LINKS);
                }
                if (iVar.f45910d) {
                    linkedHashSet.add(ye.e.SCREEN_VIEWS);
                }
                gVar.f45906v = linkedHashSet;
                break;
        }
        return Unit.f26487a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1(Object obj, int i11) {
        super(1);
        this.f35764a = i11;
        this.f35765b = obj;
    }
}
